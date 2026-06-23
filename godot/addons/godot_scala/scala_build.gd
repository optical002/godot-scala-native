@tool
extends EditorPlugin

# Godot Scala Build — editor-side orchestrator for the Scala Native (sbt) build.
#
# A GDScript EditorPlugin (NOT part of the reloadable .so), so the conductor
# lives in a stable layer above the GDExtension it reloads. It launches a warm
# sbt watch (`sbt --client "~godotBuild"`), tails sbt's log for progress, and
# shows an outlined "[ icon Scala ]" status group in the top toolbar (before the
# Play button). No modal — the indicator is the whole UI.
#
# Status icon:
#   spinner  — compiling / building (watch or one-shot)
#   ● green  — server running, last build succeeded (no warnings)
#   ● orange — server running, last build had warnings
#   ● red    — server running, last build had errors
#   ● grey   — sbt build server not running
# Click the group for the SBT Server menu (Rebuild/Start when down, Restart/Stop
# when running, Open build log).

# --- Config (edit to match your project) ------------------------------------
const SBT_PROJECT_DIR := "../harness-scala"   # sbt project, relative to godot/
const SBT_EXECUTABLE := "sbt"                 # on PATH, or an absolute path
const POLL_SECONDS := 0.2
const SPINNER := ["⣾", "⣽", "⣻", "⢿", "⡿", "⣟", "⣯", "⣷"]   # braille spinner

# --- State ------------------------------------------------------------------
enum St { DOWN, BUILDING, OK, ERROR, WARN }
var _state: int = St.DOWN
var _pid: int = -1
var _sbt_log_abs := ""
var _sbt_log_size := 0
var _had_error := false        # last build produced [error] lines
var _had_warn := false         # last build produced [warn] lines
var _reloaded := false         # reload already nudged this build
var _spin := 0
var _ansi: RegEx               # strips terminal color codes from sbt output

# --- UI ---------------------------------------------------------------------
var _status_panel: PanelContainer   # outlined group in the top toolbar
var _icon_lbl: Label                # the spinner / colored dot
var _menu: PopupMenu
var _toolbar_via_container := false
var _log_view: RichTextLabel        # bottom panel: scrolling build log
var _timer: Timer

func _enter_tree() -> void:
	_sbt_log_abs = ProjectSettings.globalize_path("res://.scala/sbt.log")
	_ansi = RegEx.new()
	_ansi.compile("\\x1b\\[[0-9;?]*[ -/]*[@-~]")   # CSI / color escape sequences
	_build_ui()
	_start_server()
	_timer = Timer.new()
	_timer.wait_time = POLL_SECONDS
	_timer.timeout.connect(_poll)
	add_child(_timer)
	_timer.start()

func _exit_tree() -> void:
	_stop_server()
	if _timer: _timer.queue_free()
	if _log_view:
		remove_control_from_bottom_panel(_log_view)
		_log_view.queue_free()
	if _status_panel:
		if _toolbar_via_container:
			remove_control_from_container(EditorPlugin.CONTAINER_TOOLBAR, _status_panel)
		_status_panel.queue_free()

# --- UI construction --------------------------------------------------------
func _build_ui() -> void:
	# Bottom panel = the scrolling build log (full output / errors).
	_log_view = RichTextLabel.new()
	_log_view.scroll_following = true
	_log_view.custom_minimum_size = Vector2(0, 160)
	add_control_to_bottom_panel(_log_view, "Scala")

	# Top toolbar = an outlined group: [ icon  Scala ]. Click -> SBT Server menu.
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
	_icon_lbl.text = "●"
	_icon_lbl.mouse_filter = Control.MOUSE_FILTER_IGNORE
	hb.add_child(_icon_lbl)
	# Scala logo if the SVG loads, else the word "Scala".
	var logo: Texture2D = load("res://addons/godot_scala/icon.svg") as Texture2D
	if logo:
		var tr := TextureRect.new()
		tr.texture = logo
		# Ignore the SVG's intrinsic (800x800) size, render at a fixed icon size.
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

func _on_status_input(ev: InputEvent) -> void:
	if ev is InputEventMouseButton and ev.pressed and ev.button_index == MOUSE_BUTTON_LEFT:
		_open_menu()

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
	_menu.add_separator()
	_menu.add_item("Open build log", 3)
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
		3: OS.shell_open("file://" + _sbt_log_abs)

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
	# Killing the client alone leaves the warm sbt *server* daemon running, so
	# tell the server to shut down (this also ends the watch), then kill the
	# client process to be sure.
	OS.create_process("sh", ["-c", "cd %s && %s --client shutdown" % [
		_scala_dir_abs(), SBT_EXECUTABLE]])
	if _pid > 0 and OS.is_process_running(_pid):
		OS.kill(_pid)
	_pid = -1
	_apply_state(St.DOWN)
	_log("[plugin] stop requested: server shutdown + client killed")

func _restart_server() -> void:
	_stop_server()
	_start_server()

# --- Polling / phase detection ----------------------------------------------
func _poll() -> void:
	if _pid > 0 and not OS.is_process_running(_pid):
		_apply_state(St.DOWN)        # watch/one-shot ended -> server not running
		return
	var sbt_new := _read_tail(_sbt_log_abs, _sbt_log_size)
	_sbt_log_size = sbt_new.size
	if sbt_new.text != "":
		var clean: String = _ansi.sub(sbt_new.text, "", true)   # drop color codes
		_log(clean)
		_classify(clean)
	if _state == St.BUILDING and _icon_lbl:    # advance the spinner
		_spin += 1
		_icon_lbl.text = SPINNER[_spin % SPINNER.size()]

func _classify(chunk: String) -> void:
	# Warnings accumulate over the cycle (separate `if`, not part of the chain).
	if chunk.find("[warn]") != -1:
		_had_warn = true
	if chunk.find("[error]") != -1:
		_had_error = true
		_apply_state(St.ERROR)
	elif chunk.find("Monitoring source files") != -1:
		# watch returned to idle -> reflect the last build's outcome
		if _had_error: _apply_state(St.ERROR)
		elif _had_warn: _apply_state(St.WARN)
		else: _apply_state(St.OK)
	elif chunk.find("[godot] swapped") != -1 or chunk.find("[success]") != -1:
		if not _reloaded:
			_reloaded = true
			_trigger_reload()        # nudge the editor to hot-reload the new .so
	elif chunk.find("Build triggered") != -1:
		# a watched change kicked off a new build -> clear last cycle's flags
		_had_error = false
		_had_warn = false
		_reloaded = false
		_apply_state(St.BUILDING)
	elif chunk.find("Compiling to native") != -1 or chunk.find("Optimizing") != -1 \
			or chunk.find("Linking") != -1 or chunk.find("Compiling") != -1:
		_apply_state(St.BUILDING)

# Force the editor to rescan and pick up the swapped .so (reloadable extension),
# so the reload happens promptly instead of waiting for a window-focus change.
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
			_icon_lbl.text = "○"; _set_icon_color(Color(0.55, 0.55, 0.55))   # grey (inactive)
		St.BUILDING:
			_set_icon_color(Color(0.25, 0.85, 0.95))                          # spinner (cyan)
			_icon_lbl.text = SPINNER[_spin % SPINNER.size()]

func _set_icon_color(c: Color) -> void:
	_icon_lbl.add_theme_color_override("font_color", c)

# Read bytes appended to `path` since byte offset `from`. Returns {text, size}.
func _read_tail(path: String, from: int) -> Dictionary:
	var f := FileAccess.open(path, FileAccess.READ)
	if f == null:
		return {"text": "", "size": from}
	var flen := f.get_length()
	if flen < from:       # file was truncated (new build) — start over
		from = 0
	f.seek(from)
	var buf := f.get_buffer(flen - from)
	f.close()
	return {"text": buf.get_string_from_utf8(), "size": flen}

func _log(s: String) -> void:
	_log_view.append_text(s if s.ends_with("\n") else s + "\n")
