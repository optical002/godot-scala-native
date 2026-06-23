@tool
extends EditorPlugin

# Godot Scala Build — editor-side orchestrator for the Scala Native (sbt) build.
#
# A GDScript EditorPlugin (NOT part of the reloadable .so), so the conductor
# lives in a stable layer above the GDExtension it reloads. It launches a warm
# sbt watch (`sbt --client "~godotBuild"`), tails sbt's log for progress, shows
# an outlined "[ icon Scala ]" status group at the far right of the top bar, and
# a colorized "SBT Output" dock with per-type filter toggles + counts.
#
# Status icon: cyan spinner (building) · ✓ green (ok) · ⚠ yellow (warnings) ·
# ✗ red (errors) · ○ grey (server down). Click the group for the SBT Server menu.

# --- Config (edit to match your project) ------------------------------------
const SBT_PROJECT_DIR := "../harness-scala"   # sbt project, relative to godot/
const SBT_EXECUTABLE := "sbt"                  # on PATH, or an absolute path
const POLL_SECONDS := 0.2
const SPINNER := ["⣾", "⣽", "⣻", "⢿", "⡿", "⣟", "⣯", "⣷"]   # braille spinner
const CFG_PATH := "user://godot_scala_filters.cfg"
const MAX_LINES := 5000
# Filter rows: [type key, glyph (matches the top status icon), hex color, tooltip].
const FILTERS := [
	["error",   "✗", "ff5c5c", "Errors"],
	["warning", "⚠", "e2c044", "Warnings"],
	["success", "✓", "5fd06e", "Successes"],
	["info",    "i", "9aa0a6", "Info / other"],
]

# --- State ------------------------------------------------------------------
enum St { DOWN, BUILDING, OK, ERROR, WARN }
var _state: int = St.DOWN
var _pid: int = -1
var _sbt_log_abs := ""
var _sbt_log_size := 0
var _had_error := false
var _had_warn := false
var _reloaded := false
var _spin := 0
var _ansi: RegEx

# Log model (so filtering can hide/show types without re-reading the file).
var _lines: Array = []      # [{ t: String, bb: String }] for the current build
var _show := {"error": true, "warning": true, "success": true, "info": true}
var _counts := {"error": 0, "warning": 0, "success": 0, "info": 0}

# --- UI ---------------------------------------------------------------------
var _status_panel: PanelContainer
var _icon_lbl: Label
var _menu: PopupMenu
var _toolbar_via_container := false
var _bottom_root: HBoxContainer
var _log_view: RichTextLabel
var _filter_btns := {}
var _timer: Timer

func _enter_tree() -> void:
	_sbt_log_abs = ProjectSettings.globalize_path("res://.scala/sbt.log")
	_ansi = RegEx.new()
	_ansi.compile("\\x1b\\[[0-9;?]*[ -/]*[@-~]")   # CSI / color escape sequences
	_load_filters()
	# Always auto-start the sbt watch on editor/plugin startup. Deferred and
	# queued first so it fires next frame regardless of any UI-setup hiccup.
	call_deferred("_start_server")
	_build_ui()
	_timer = Timer.new()
	_timer.wait_time = POLL_SECONDS
	_timer.timeout.connect(_poll)
	add_child(_timer)
	_timer.start()

func _exit_tree() -> void:
	_stop_server()
	if _timer: _timer.queue_free()
	if _bottom_root:
		remove_control_from_bottom_panel(_bottom_root)
		_bottom_root.queue_free()
	if _status_panel:
		if _toolbar_via_container:
			remove_control_from_container(EditorPlugin.CONTAINER_TOOLBAR, _status_panel)
		_status_panel.queue_free()

# --- UI construction --------------------------------------------------------
func _build_ui() -> void:
	var base := EditorInterface.get_base_control()

	# Bottom panel: log on the left, vertical filter toggles on the right.
	_bottom_root = HBoxContainer.new()
	_bottom_root.add_theme_constant_override("separation", 6)
	_log_view = RichTextLabel.new()
	_log_view.bbcode_enabled = true
	_log_view.scroll_following = true
	_log_view.selection_enabled = true
	_log_view.focus_mode = Control.FOCUS_CLICK
	_log_view.size_flags_horizontal = Control.SIZE_EXPAND_FILL
	_log_view.custom_minimum_size = Vector2(0, 180)
	var mono := base.get_theme_font("source", "EditorFonts")
	if mono:
		_log_view.add_theme_font_override("normal_font", mono)
		_log_view.add_theme_font_override("mono_font", mono)
		_log_view.add_theme_font_override("bold_font", mono)
	var fsize := 13
	var es := EditorInterface.get_editor_settings()
	if es and es.has_setting("interface/editor/code_font_size"):
		fsize = int(es.get_setting("interface/editor/code_font_size"))
	_log_view.add_theme_font_size_override("normal_font_size", fsize)
	_log_view.add_theme_font_size_override("bold_font_size", fsize)
	var console := StyleBoxFlat.new()
	console.bg_color = Color(0.09, 0.09, 0.11)
	console.set_corner_radius_all(4)
	console.content_margin_left = 8; console.content_margin_right = 8
	console.content_margin_top = 6;  console.content_margin_bottom = 6
	_log_view.add_theme_stylebox_override("normal", console)
	_bottom_root.add_child(_log_view)
	_build_filter_bar(_bottom_root, base)
	add_control_to_bottom_panel(_bottom_root, "SBT Output")

	# Top toolbar: outlined "[ icon  Scala ]" status group, click -> SBT menu.
	_status_panel = PanelContainer.new()
	var sb := StyleBoxFlat.new()
	sb.bg_color = Color(0, 0, 0, 0.15)
	sb.set_border_width_all(1)
	sb.border_color = Color(1, 1, 1, 0.25)
	sb.set_corner_radius_all(4)
	sb.content_margin_left = 7; sb.content_margin_right = 7
	sb.content_margin_top = 2;  sb.content_margin_bottom = 2
	_status_panel.add_theme_stylebox_override("panel", sb)
	_status_panel.mouse_filter = Control.MOUSE_FILTER_STOP
	_status_panel.tooltip_text = "Scala build — click for SBT Server actions"
	_status_panel.gui_input.connect(_on_status_input)

	var hb := HBoxContainer.new()
	hb.add_theme_constant_override("separation", 3)
	hb.mouse_filter = Control.MOUSE_FILTER_IGNORE
	_icon_lbl = Label.new()
	_icon_lbl.text = "○"
	_icon_lbl.mouse_filter = Control.MOUSE_FILTER_IGNORE
	hb.add_child(_icon_lbl)
	var logo: Texture2D = load("res://addons/godot_scala/icon.svg") as Texture2D
	if logo:
		var tr := TextureRect.new()
		tr.texture = logo
		tr.expand_mode = TextureRect.EXPAND_IGNORE_SIZE
		tr.stretch_mode = TextureRect.STRETCH_KEEP_ASPECT_CENTERED
		tr.custom_minimum_size = Vector2(16, 16)
		tr.size_flags_horizontal = Control.SIZE_SHRINK_CENTER
		tr.size_flags_vertical = Control.SIZE_SHRINK_CENTER
		tr.mouse_filter = Control.MOUSE_FILTER_IGNORE
		hb.add_child(tr)
	else:
		var name_lbl := Label.new()
		name_lbl.text = "Scala"
		name_lbl.mouse_filter = Control.MOUSE_FILTER_IGNORE
		hb.add_child(name_lbl)
	_status_panel.add_child(hb)

	_menu = PopupMenu.new()
	_status_panel.add_child(_menu)
	_menu.id_pressed.connect(_on_menu)

	_place_in_top_toolbar(_status_panel)
	_apply_state(St.DOWN)

func _build_filter_bar(parent: Control, base: Control) -> void:
	var vb := VBoxContainer.new()
	vb.add_theme_constant_override("separation", 4)
	vb.size_flags_vertical = Control.SIZE_SHRINK_BEGIN
	# Enabled (pressed) shows a highlighted box ("glow"); disabled (normal) is
	# flat. The toggle's pressed/normal state switches these automatically.
	var flat := StyleBoxEmpty.new()
	flat.set_content_margin_all(4)
	var glow := StyleBoxFlat.new()
	glow.bg_color = Color(0.28, 0.28, 0.33)
	glow.set_corner_radius_all(4)
	glow.set_content_margin_all(4)
	glow.set_border_width_all(1)
	glow.border_color = Color(1, 1, 1, 0.18)
	var hover := StyleBoxFlat.new()
	hover.bg_color = Color(0.20, 0.20, 0.24)
	hover.set_corner_radius_all(4)
	hover.set_content_margin_all(4)
	for d in FILTERS:
		var key: String = d[0]
		var col := Color.html(d[2])
		var btn := Button.new()
		btn.toggle_mode = true
		btn.button_pressed = bool(_show.get(key, true))
		btn.tooltip_text = d[3]
		btn.focus_mode = Control.FOCUS_NONE
		btn.alignment = HORIZONTAL_ALIGNMENT_LEFT
		btn.add_theme_stylebox_override("normal", flat)
		btn.add_theme_stylebox_override("hover", hover)
		btn.add_theme_stylebox_override("pressed", glow)
		btn.add_theme_stylebox_override("hover_pressed", glow)
		btn.add_theme_stylebox_override("focus", flat)
		for fc in ["font_color", "font_pressed_color", "font_hover_color",
				"font_hover_pressed_color", "font_focus_color"]:
			btn.add_theme_color_override(fc, col)
		btn.toggled.connect(_on_filter_toggled.bind(key))
		_filter_btns[key] = btn
		vb.add_child(btn)
	parent.add_child(vb)
	_update_filter_labels()

func _on_status_input(ev: InputEvent) -> void:
	if ev is InputEventMouseButton and ev.pressed and ev.button_index == MOUSE_BUTTON_LEFT:
		_open_menu()

# --- Filters / log model ----------------------------------------------------
func _load_filters() -> void:
	var cf := ConfigFile.new()
	if cf.load(CFG_PATH) == OK:
		for k in _show.keys():
			_show[k] = bool(cf.get_value("filters", k, true))

func _save_filters() -> void:
	var cf := ConfigFile.new()
	for k in _show.keys():
		cf.set_value("filters", k, _show[k])
	cf.save(CFG_PATH)

func _on_filter_toggled(pressed: bool, key: String) -> void:
	_show[key] = pressed
	_save_filters()
	_update_filter_labels()
	_rerender()

func _update_filter_labels() -> void:
	for d in FILTERS:
		var key: String = d[0]
		if not _filter_btns.has(key):
			continue
		var btn: Button = _filter_btns[key]
		btn.text = "%s  %d" % [d[1], int(_counts.get(key, 0))]

func _line_type(line: String) -> String:
	if line.find("[error]") != -1:
		return "error"
	elif line.find("[warn]") != -1:
		return "warning"
	elif line.find("[success]") != -1:
		return "success"
	return "info"

# A new build started — auto-trim the *view* to only the latest build. The
# sbt.log file on disk is never touched (we just clear the in-memory model).
func _is_build_start(line: String) -> bool:
	return line.find("Build triggered") != -1 \
		or line.find("started sbt watch") != -1 \
		or line.find("one-shot rebuild") != -1

func _reset_output() -> void:
	_lines.clear()
	for k in _counts.keys():
		_counts[k] = 0
	if _log_view:
		_log_view.clear()

func _rerender() -> void:
	if not _log_view:
		return
	_log_view.clear()
	for ln in _lines:
		if _show.get(ln["t"], true):
			_log_view.append_text(ln["bb"] + "\n")

# sbt watch bookkeeping lines that are just noise in the output (state detection
# in `_classify` still sees them in the raw chunk; they stay in sbt.log).
func _is_noise(line: String) -> bool:
	return line.find("Monitoring source files") != -1 \
		or line.find("Press <enter>") != -1 \
		or line.find("interrupt or '?'") != -1

# Ingest a chunk of sbt output: count by type, store, and render if shown.
func _log(chunk: String) -> void:
	if not _log_view:
		return
	for line in chunk.split("\n", false):
		if _is_noise(line):
			continue
		if _is_build_start(line):
			_reset_output()
		var t := _line_type(line)
		_counts[t] += 1
		var bb := _colorize(line)
		_lines.append({"t": t, "bb": bb})
		if _lines.size() > MAX_LINES:
			_lines.remove_at(0)
		if _show.get(t, true):
			_log_view.append_text(bb + "\n")
	_update_filter_labels()

# Strip the leading sbt level tag so the line reads "..." not "[info] ...".
func _strip_tag(line: String) -> String:
	for tag in ["[info]", "[warn]", "[error]", "[success]", "[debug]"]:
		if line.begins_with(tag):
			return line.substr(tag.length()).strip_edges(true, false)
	return line

# Render a log line: tag stripped, color/weight by type. Errors are bold + bright
# (eye-catching), info is dim grey (shallow). Remaining `[` are escaped to `[lb]`
# so any literal brackets show instead of parsing as BBCode.
func _colorize(line: String) -> String:
	var body := _strip_tag(line).replace("[", "[lb]")
	match _line_type(line):
		"error":
			return "[color=#ff5c5c][b]%s[/b][/color]" % body
		"warning":
			return "[color=#e2c044]%s[/color]" % body
		"success":
			return "[color=#5fd06e][b]%s[/b][/color]" % body
		_:  # info / other
			if line.find("[godot]") != -1 or line.find("[plugin]") != -1:
				return "[color=#56c2e0]%s[/color]" % body          # our markers
			if line.find("Monitoring source files") != -1 or line.find("Build triggered") != -1:
				return "[color=#b08cdb]%s[/color]" % body          # build lifecycle
			return "[color=#74787f]%s[/color]" % body              # dim, shallow

# Place at the far-right of the editor's top title bar (its last child). Falls
# back to the run-bar's parent, then to the main top-left toolbar container.
func _place_in_top_toolbar(c: Control) -> void:
	var bar := _find_class(EditorInterface.get_base_control(), "EditorTitleBar")
	if bar == null:
		var run_bar := _find_class(EditorInterface.get_base_control(), "EditorRunBar")
		if run_bar:
			bar = run_bar.get_parent()
	if bar:
		bar.add_child(c)
		bar.move_child(c, bar.get_child_count() - 1)   # rightmost
	else:
		add_control_to_container(EditorPlugin.CONTAINER_TOOLBAR, c)
		_toolbar_via_container = true

func _find_class(n: Node, cls: String) -> Node:
	if n.get_class() == cls:
		return n
	for ch in n.get_children():
		var r := _find_class(ch, cls)
		if r:
			return r
	return null

# --- Menu (Rebuild/Start when down, Restart/Stop when running) ---------------
func _open_menu() -> void:
	_menu.clear()
	_menu.add_separator("SBT Server")
	if _state == St.DOWN:                # not running
		_menu.add_item("Rebuild", 0)     #   one-shot build
		_menu.add_item("Start", 4)       #   start the watch
	else:                                # running
		_menu.add_item("Restart", 1)
		_menu.add_item("Stop", 2)
	_menu.reset_size()
	_menu.position = Vector2i(_status_panel.get_screen_position()) \
		+ Vector2i(0, int(_status_panel.size.y))
	_menu.popup()

func _on_menu(id: int) -> void:
	match id:
		0: _rebuild_once()
		4: _start_server()
		1: _restart_server()
		2: _stop_server()

# --- Server process ---------------------------------------------------------
func _scala_dir_abs() -> String:
	return ProjectSettings.globalize_path("res://").path_join(SBT_PROJECT_DIR)

# `exec` replaces the shell so `_pid` IS the sbt client (not the `sh` wrapper),
# and the redirect lets us tail sbt's output. `--client` uses the warm server.
func _spawn(sbt_cmd: String) -> void:
	DirAccess.make_dir_recursive_absolute(ProjectSettings.globalize_path("res://.scala"))
	var cmd := "cd %s && exec %s --client %s > %s 2>&1" % [
		_scala_dir_abs(), SBT_EXECUTABLE, sbt_cmd, _sbt_log_abs]   # Windows: cmd /c
	_pid = OS.create_process("sh", ["-c", cmd])
	_sbt_log_size = 0
	_had_error = false
	_had_warn = false
	_reloaded = false
	_apply_state(St.BUILDING)

func _start_server() -> void:        # Start: the continuous watch
	_spawn("\"~godotBuild\"")
	_log("[plugin] started sbt watch (pid %d)" % _pid)

func _rebuild_once() -> void:        # Rebuild: a single build, no watch
	_spawn("godotBuild")
	_log("[plugin] one-shot rebuild (pid %d)" % _pid)

func _stop_server() -> void:
	_log("[plugin] stopping sbt server…")
	OS.create_process("sh", ["-c", "cd %s && %s --client shutdown" % [
		_scala_dir_abs(), SBT_EXECUTABLE]])
	if _pid > 0 and OS.is_process_running(_pid):
		OS.kill(_pid)
	_pid = -1
	_apply_state(St.DOWN)

func _restart_server() -> void:
	_stop_server()
	_start_server()

# --- Polling / phase detection ----------------------------------------------
func _poll() -> void:
	if _pid > 0 and not OS.is_process_running(_pid):
		_apply_state(St.DOWN)
		return
	var sbt_new := _read_tail(_sbt_log_abs, _sbt_log_size)
	_sbt_log_size = sbt_new.size
	if sbt_new.text != "":
		var clean: String = _ansi.sub(sbt_new.text, "", true)
		_classify(clean)   # build state (dot/spinner)
		_log(clean)        # output dock (count/filter/auto-trim)
	if _state == St.BUILDING and _icon_lbl:
		_spin += 1
		_icon_lbl.text = SPINNER[_spin % SPINNER.size()]

func _classify(chunk: String) -> void:
	if chunk.find("[warn]") != -1:
		_had_warn = true
	if chunk.find("[error]") != -1:
		_had_error = true
		_apply_state(St.ERROR)
	elif chunk.find("Monitoring source files") != -1:
		if _had_error: _apply_state(St.ERROR)
		elif _had_warn: _apply_state(St.WARN)
		else: _apply_state(St.OK)
	elif chunk.find("[godot] swapped") != -1 or chunk.find("[success]") != -1:
		if not _reloaded:
			_reloaded = true
			_trigger_reload()
	elif chunk.find("Build triggered") != -1:
		_had_error = false
		_had_warn = false
		_reloaded = false
		_apply_state(St.BUILDING)
	elif chunk.find("Compiling to native") != -1 or chunk.find("Optimizing") != -1 \
			or chunk.find("Linking") != -1 or chunk.find("Compiling") != -1:
		_apply_state(St.BUILDING)

func _trigger_reload() -> void:
	var fs := EditorInterface.get_resource_filesystem()
	if fs:
		fs.scan()

# --- State / icon -----------------------------------------------------------
func _apply_state(s: int) -> void:
	_state = s
	if not _icon_lbl: return
	match s:
		St.OK:
			_icon_lbl.text = "✓"; _set_icon_color(Color(0.30, 0.80, 0.35))   # green
		St.WARN:
			_icon_lbl.text = "⚠"; _set_icon_color(Color(0.95, 0.85, 0.20))   # yellow
		St.ERROR:
			_icon_lbl.text = "✗"; _set_icon_color(Color(0.90, 0.32, 0.32))   # red
		St.DOWN:
			_icon_lbl.text = "○"; _set_icon_color(Color(0.55, 0.55, 0.55))   # grey
		St.BUILDING:
			_set_icon_color(Color(0.25, 0.85, 0.95))                          # cyan
			_icon_lbl.text = SPINNER[_spin % SPINNER.size()]

func _set_icon_color(c: Color) -> void:
	_icon_lbl.add_theme_color_override("font_color", c)

# Read bytes appended to `path` since byte offset `from`. Returns {text, size}.
func _read_tail(path: String, from: int) -> Dictionary:
	var f := FileAccess.open(path, FileAccess.READ)
	if f == null:
		return {"text": "", "size": from}
	var flen := f.get_length()
	if flen < from:       # file was truncated (new run) — start over
		from = 0
	f.seek(from)
	var buf := f.get_buffer(flen - from)
	f.close()
	return {"text": buf.get_string_from_utf8(), "size": flen}
