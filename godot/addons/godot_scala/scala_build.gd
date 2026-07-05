@tool
extends EditorPlugin

# Godot Scala Build — editor-side orchestrator for the Scala Native (sbt) build.
#
# A GDScript EditorPlugin (NOT part of the reloadable .so), so the conductor
# lives in a stable layer above the GDExtension it reloads. It launches a warm
# sbt watch (`sbt --client "~godotBuild"`), tails sbt's log for progress, shows
# an outlined "[ sbt status · scala logo · reload status · godot logo ]" group
# at the far right of the top bar, and two bottom docks: "SBT Output" (the
# colorized sbt build log) and "Scala Hot Reload" (everything observable about
# Godot's GDExtension hot-reload), each with per-type filter toggles + counts.
#
# Status glyphs: spinner (working) · ✓ green (ok) · ⚠ yellow (warnings) ·
# ✗ red (errors) · ○ grey (idle/down). The first pair is the sbt build (cyan
# spinner), the second pair is Godot's hot-reload of the swapped .so
# (Godot-blue spinner). Click the group for the SBT Server menu.

# --- Config (edit to match your project) ------------------------------------
const SBT_PROJECT_DIR := "../harness-scala"   # sbt project, relative to godot/
const SBT_EXECUTABLE := "sbt"                  # on PATH, or an absolute path
const POLL_SECONDS := 0.2
const SPINNER := ["⣾", "⣽", "⣻", "⢿", "⡿", "⣟", "⣯", "⣷"]   # braille spinner
const RELOAD_TIMEOUT_MS := 30000   # stop the reload spinner if nothing confirms it
# A godot.log line is forwarded to the "Scala Hot Reload" dock when it contains
# one of these (case-insensitive).
const RELOAD_KEYWORDS := ["gdextension", "extension", "reload", "recreate",
	"scala", ".so", ".dylib", ".dll", "classdb", "swap"]

# --- LogDock ------------------------------------------------------------------
# One bottom-panel log tab: RichTextLabel console on the left, vertical per-type
# filter toggles (with live counts) on the right. A dumb sink for pre-classified,
# pre-colorized lines; filter state persists to CFG_PATH under `cfg_section`.
class LogDock:
	const CFG_PATH := "user://godot_scala_filters.cfg"
	const MAX_LINES := 5000
	# Filter rows: [type key, glyph (matches the top status icons), hex, tooltip].
	const FILTERS := [
		["error",   "✗", "ff5c5c", "Errors"],
		["warning", "⚠", "e2c044", "Warnings"],
		["success", "✓", "5fd06e", "Successes"],
		["info",    "i", "9aa0a6", "Info / other"],
	]

	var root: HBoxContainer
	var view: RichTextLabel
	var filter_btns := {}
	# Log model (so filtering can hide/show types without re-reading the source).
	var lines: Array = []      # [{ t: String, bb: String }]
	var shown := {"error": true, "warning": true, "success": true, "info": true}
	var counts := {"error": 0, "warning": 0, "success": 0, "info": 0}
	var cfg_section: String

	func _init(section: String) -> void:
		cfg_section = section
		_load_filters()

	func build(base: Control) -> void:
		root = HBoxContainer.new()
		root.add_theme_constant_override("separation", 6)
		view = RichTextLabel.new()
		view.bbcode_enabled = true
		view.scroll_following = true
		view.selection_enabled = true
		view.focus_mode = Control.FOCUS_CLICK
		view.size_flags_horizontal = Control.SIZE_EXPAND_FILL
		view.custom_minimum_size = Vector2(0, 180)
		var mono := base.get_theme_font("source", "EditorFonts")
		if mono:
			view.add_theme_font_override("normal_font", mono)
			view.add_theme_font_override("mono_font", mono)
			view.add_theme_font_override("bold_font", mono)
		var fsize := 13
		var es := EditorInterface.get_editor_settings()
		if es and es.has_setting("interface/editor/code_font_size"):
			fsize = int(es.get_setting("interface/editor/code_font_size"))
		view.add_theme_font_size_override("normal_font_size", fsize)
		view.add_theme_font_size_override("bold_font_size", fsize)
		var console := StyleBoxFlat.new()
		console.bg_color = Color(0.09, 0.09, 0.11)
		console.set_corner_radius_all(4)
		console.content_margin_left = 8; console.content_margin_right = 8
		console.content_margin_top = 6;  console.content_margin_bottom = 6
		view.add_theme_stylebox_override("normal", console)
		root.add_child(view)
		_build_filter_bar(root)

	func _build_filter_bar(parent: Control) -> void:
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
			btn.button_pressed = bool(shown.get(key, true))
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
			filter_btns[key] = btn
			vb.add_child(btn)
		parent.add_child(vb)
		_update_filter_labels()

	# Ingest one pre-classified, pre-colorized line: count, store, render if shown.
	func ingest(t: String, bb: String) -> void:
		if not view:
			return
		counts[t] = int(counts.get(t, 0)) + 1
		lines.append({"t": t, "bb": bb})
		if lines.size() > MAX_LINES:
			lines.remove_at(0)
		if shown.get(t, true):
			view.append_text(bb + "\n")
		_update_filter_labels()

	func reset() -> void:
		lines.clear()
		for k in counts.keys():
			counts[k] = 0
		if view:
			view.clear()
		_update_filter_labels()

	func rerender() -> void:
		if not view:
			return
		view.clear()
		for ln in lines:
			if shown.get(ln["t"], true):
				view.append_text(ln["bb"] + "\n")

	func _on_filter_toggled(pressed: bool, key: String) -> void:
		shown[key] = pressed
		_save_filters()
		_update_filter_labels()
		rerender()

	func _update_filter_labels() -> void:
		for d in FILTERS:
			var key: String = d[0]
			if not filter_btns.has(key):
				continue
			var btn: Button = filter_btns[key]
			btn.text = "%s  %d" % [d[1], int(counts.get(key, 0))]

	func _load_filters() -> void:
		var cf := ConfigFile.new()
		if cf.load(CFG_PATH) == OK:
			for k in shown.keys():
				shown[k] = bool(cf.get_value(cfg_section, k, true))

	func _save_filters() -> void:
		var cf := ConfigFile.new()
		cf.load(CFG_PATH)   # keep the other dock's section intact
		for k in shown.keys():
			cf.set_value(cfg_section, k, shown[k])
		cf.save(CFG_PATH)

# --- ReloadLogger ---------------------------------------------------------------
# Captures the editor's own print stream (including Godot core's print_verbose
# GDExtension reload messages when verbose_stdout is on — editor sessions do NOT
# write user://logs/godot.log, so a custom Logger is the only way to see them).
# Callbacks may fire off the main thread and mid-print, so lines are buffered
# under a mutex and drained from the poll tick — never touch Controls here.
class ReloadLogger extends Logger:
	var _buf: Array = []          # [{ line: String, t: String }]
	var _mutex := Mutex.new()

	func _log_message(message: String, error: bool) -> void:
		_push(message, "error" if error else "info")

	func _log_error(function: String, file: String, line: int, code: String,
			rationale: String, _editor_notify: bool, error_type: int,
			_script_backtraces: Array) -> void:
		var what := rationale if rationale != "" else code
		var t := "warning" if error_type == Logger.ERROR_TYPE_WARNING else "error"
		_push("%s (%s:%d in %s)" % [what, file, line, function], t)

	func _push(message: String, t: String) -> void:
		_mutex.lock()
		for line in message.split("\n", false):
			_buf.append({"line": line, "t": t})
		_mutex.unlock()

	func drain() -> Array:
		_mutex.lock()
		var out := _buf
		_buf = []
		_mutex.unlock()
		return out

# --- State ------------------------------------------------------------------
enum St { DOWN, BUILDING, OK, ERROR, WARN }    # sbt build (first status pair)
enum Rl { IDLE, RELOADING, OK, ERROR }         # godot hot-reload (second pair)
var _state: int = St.DOWN
var _rl_state: int = Rl.IDLE
var _pid: int = -1
var _sbt_log_abs := ""
var _sbt_log_size := 0
var _godot_log_abs := ""       # the editor's own log file (user://logs/godot.log)
var _godot_log_size := 0
var _had_error := false
var _had_warn := false
var _reloaded := false
var _rl_had_error := false     # error lines seen while a hot-reload is in flight
var _spin := 0
var _rl_spin := 0
var _ansi: RegEx
var _gem: Object               # GDExtensionManager singleton (reload signal)
var _fs: EditorFileSystem      # scan progress + reload pipeline signals
var _logger: ReloadLogger      # editor print-stream capture
var _reload_started_ms := 0    # set when we trigger a reload after a swap
var _last_reload_ms := -1
var _lib_path := ""            # res:// path of this platform's dynamic library
var _scan_pct := -1            # last logged filesystem-scan percentage

# --- UI ---------------------------------------------------------------------
var _status_panel: PanelContainer
var _icon_lbl: Label           # sbt build status glyph
var _reload_icon_lbl: Label    # godot hot-reload status glyph
var _menu: PopupMenu
var _toolbar_via_container := false
var _sbt_dock: LogDock
var _reload_dock: LogDock
var _timer: Timer

func _enter_tree() -> void:
	_sbt_log_abs = ProjectSettings.globalize_path("res://.scala/sbt.log")
	var glog: String = ProjectSettings.get_setting(
		"debug/file_logging/log_path", "user://logs/godot.log")
	_godot_log_abs = ProjectSettings.globalize_path(glog)
	_godot_log_size = _file_len(_godot_log_abs)   # skip this session's startup noise
	_lib_path = _detect_lib_path()
	_ansi = RegEx.new()
	_ansi.compile("\\x1b\\[[0-9;?]*[ -/]*[@-~]")   # CSI / color escape sequences
	if Engine.has_singleton("GDExtensionManager"):
		_gem = Engine.get_singleton("GDExtensionManager")
	_sbt_dock = LogDock.new("filters")
	_reload_dock = LogDock.new("reload_filters")
	# Always auto-start the sbt watch on editor/plugin startup. Deferred and
	# queued first so it fires next frame regardless of any UI-setup hiccup.
	call_deferred("_start_server")
	_build_ui()
	_timer = Timer.new()
	_timer.wait_time = POLL_SECONDS
	_timer.timeout.connect(_poll)
	add_child(_timer)
	_timer.start()
	# Hook the editor's authoritative "extensions reloaded" signal to time the
	# GDExtension hot-reload (start is when we trigger the rescan after a swap).
	if _gem and _gem.has_signal("extensions_reloaded") \
			and not _gem.extensions_reloaded.is_connected(_on_extensions_reloaded):
		_gem.extensions_reloaded.connect(_on_extensions_reloaded)
	# EditorFileSystem signals — every observable step of the reload pipeline.
	_fs = EditorInterface.get_resource_filesystem()
	if _fs:
		_connect_fs_signal("filesystem_changed", _on_fs_changed)
		_connect_fs_signal("sources_changed", _on_sources_changed)
		_connect_fs_signal("resources_reimported", _on_resources_reimported)
		_connect_fs_signal("resources_reload", _on_resources_reload)
		_connect_fs_signal("script_classes_updated", _on_script_classes_updated)
	# Capture the editor's own print stream (Logger is 4.5+; guard for safety).
	if ClassDB.class_exists("Logger") and OS.has_method("add_logger"):
		_logger = ReloadLogger.new()
		OS.add_logger(_logger)
	else:
		_rlog("[reload] Logger not available in this Godot build — editor print "
			+ "stream won't be captured (only plugin instrumentation shown)", "warning")
	_rlog("[reload] watching editor log '%s' (library: %s)" % [
		_godot_log_abs, _lib_path if _lib_path != "" else "unknown"])

func _exit_tree() -> void:
	_stop_server()
	if _logger:
		OS.remove_logger(_logger)
		_logger = null
	if _gem and _gem.has_signal("extensions_reloaded") \
			and _gem.extensions_reloaded.is_connected(_on_extensions_reloaded):
		_gem.extensions_reloaded.disconnect(_on_extensions_reloaded)
	if _fs:
		_disconnect_fs_signal("filesystem_changed", _on_fs_changed)
		_disconnect_fs_signal("sources_changed", _on_sources_changed)
		_disconnect_fs_signal("resources_reimported", _on_resources_reimported)
		_disconnect_fs_signal("resources_reload", _on_resources_reload)
		_disconnect_fs_signal("script_classes_updated", _on_script_classes_updated)
	if _timer: _timer.queue_free()
	for dock in [_sbt_dock, _reload_dock]:
		if dock and dock.root:
			remove_control_from_bottom_panel(dock.root)
			dock.root.queue_free()
	if _status_panel:
		if _toolbar_via_container:
			remove_control_from_container(EditorPlugin.CONTAINER_TOOLBAR, _status_panel)
		_status_panel.queue_free()

func _connect_fs_signal(sig: String, cb: Callable) -> void:
	if _fs.has_signal(sig) and not _fs.is_connected(sig, cb):
		_fs.connect(sig, cb)

func _disconnect_fs_signal(sig: String, cb: Callable) -> void:
	if _fs.has_signal(sig) and _fs.is_connected(sig, cb):
		_fs.disconnect(sig, cb)

# --- UI construction --------------------------------------------------------
func _build_ui() -> void:
	var base := EditorInterface.get_base_control()

	# Bottom panels: sbt build log + godot hot-reload log.
	_sbt_dock.build(base)
	add_control_to_bottom_panel(_sbt_dock.root, "SBT Output")
	_reload_dock.build(base)
	add_control_to_bottom_panel(_reload_dock.root, "Scala Hot Reload")

	# Top toolbar: outlined "[ sbt · scala | reload · godot ]" status group,
	# click -> SBT menu.
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
	_status_panel.gui_input.connect(_on_status_input)

	var hb := HBoxContainer.new()
	hb.add_theme_constant_override("separation", 3)
	hb.mouse_filter = Control.MOUSE_FILTER_IGNORE
	_icon_lbl = Label.new()
	_icon_lbl.text = "○"
	_icon_lbl.mouse_filter = Control.MOUSE_FILTER_IGNORE
	hb.add_child(_icon_lbl)
	_add_logo(hb, "res://addons/godot_scala/icon.svg", "Scala")
	var gap := Control.new()
	gap.custom_minimum_size = Vector2(4, 0)
	gap.mouse_filter = Control.MOUSE_FILTER_IGNORE
	hb.add_child(gap)
	_reload_icon_lbl = Label.new()
	_reload_icon_lbl.text = "○"
	_reload_icon_lbl.mouse_filter = Control.MOUSE_FILTER_IGNORE
	hb.add_child(_reload_icon_lbl)
	_add_logo(hb, "res://addons/godot_scala/godot.svg", "Godot")
	_status_panel.add_child(hb)

	_menu = PopupMenu.new()
	_status_panel.add_child(_menu)
	_menu.id_pressed.connect(_on_menu)

	_place_in_top_toolbar(_status_panel)
	_apply_state(St.DOWN)
	_apply_reload_state(Rl.IDLE)

func _add_logo(parent: Control, res_path: String, fallback: String) -> void:
	var logo: Texture2D = null
	if ResourceLoader.exists(res_path):
		logo = load(res_path) as Texture2D
	if logo == null:
		# Plugins init before the first import scan, so `load` can miss —
		# rasterize the SVG straight from disk instead.
		var svg := FileAccess.get_file_as_string(res_path)
		if svg != "":
			var img := Image.new()
			if img.load_svg_from_string(svg) == OK:
				img.resize(32, 32, Image.INTERPOLATE_LANCZOS)   # shown at 16px
				logo = ImageTexture.create_from_image(img)
	if logo:
		var tr := TextureRect.new()
		tr.texture = logo
		tr.expand_mode = TextureRect.EXPAND_IGNORE_SIZE
		tr.stretch_mode = TextureRect.STRETCH_KEEP_ASPECT_CENTERED
		tr.custom_minimum_size = Vector2(16, 16)
		tr.size_flags_horizontal = Control.SIZE_SHRINK_CENTER
		tr.size_flags_vertical = Control.SIZE_SHRINK_CENTER
		tr.mouse_filter = Control.MOUSE_FILTER_IGNORE
		parent.add_child(tr)
	else:
		var name_lbl := Label.new()
		name_lbl.text = fallback
		name_lbl.mouse_filter = Control.MOUSE_FILTER_IGNORE
		parent.add_child(name_lbl)

func _on_status_input(ev: InputEvent) -> void:
	if ev is InputEventMouseButton and ev.pressed and ev.button_index == MOUSE_BUTTON_LEFT:
		_open_menu()

# --- sbt log classification ---------------------------------------------------
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

# sbt watch bookkeeping lines that are just noise in the output (state detection
# in `_classify` still sees them in the raw chunk; they stay in sbt.log).
func _is_noise(line: String) -> bool:
	return line.find("Monitoring source files") != -1 \
		or line.find("Press <enter>") != -1 \
		or line.find("interrupt or '?'") != -1

# Ingest a chunk of sbt output into the SBT Output dock.
func _log(chunk: String) -> void:
	if not _sbt_dock or not _sbt_dock.view:
		return
	for line in chunk.split("\n", false):
		if _is_noise(line):
			continue
		if _is_build_start(line):
			_sbt_dock.reset()
		_sbt_dock.ingest(_line_type(line), _colorize(line))

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

# --- hot-reload log -----------------------------------------------------------
# Log a line into the "Scala Hot Reload" dock, timestamped to the millisecond.
func _rlog(line: String, t: String = "info") -> void:
	if not _reload_dock or not _reload_dock.view:
		return
	var ms := int(Time.get_unix_time_from_system() * 1000.0) % 1000
	var stamp := "%s.%03d" % [Time.get_time_string_from_system(), ms]
	_reload_dock.ingest(t, _colorize_reload("%s  %s" % [stamp, line], t))

func _colorize_reload(line: String, t: String) -> String:
	var body := line.replace("[", "[lb]")
	match t:
		"error":
			return "[color=#ff5c5c][b]%s[/b][/color]" % body
		"warning":
			return "[color=#e2c044]%s[/color]" % body
		"success":
			return "[color=#5fd06e][b]%s[/b][/color]" % body
		_:
			if line.find("[reload]") != -1 or line.find("[fs]") != -1:
				return "[color=#56c2e0]%s[/color]" % body          # our markers
			return "[color=#74787f]%s[/color]" % body              # godot.log passthrough

# The plugin's own prints echo back through godot.log — don't re-ingest them.
func _is_reload_related(line: String) -> bool:
	if line.find("[scala-build]") != -1:
		return false
	var l := line.to_lower()
	for kw in RELOAD_KEYWORDS:
		if l.find(kw) != -1:
			return true
	return false

func _godot_line_type(line: String) -> String:
	var l := line.to_lower()
	if l.find("error") != -1:
		return "error"
	if l.find("warning") != -1:
		return "warning"
	return "info"

# This platform's dynamic-library path from scala.gdextension [libraries].
func _detect_lib_path() -> String:
	var cf := ConfigFile.new()
	if cf.load("res://scala.gdextension") != OK:
		return ""
	var osn := OS.get_name().to_lower()   # linux / macos / windows
	if cf.has_section("libraries"):
		for key in cf.get_section_keys("libraries"):
			if String(key).begins_with(osn):
				return str(cf.get_value("libraries", key))
	return ""

func _log_lib_info() -> void:
	if _lib_path == "":
		_rlog("[reload] library path unknown (could not parse scala.gdextension)", "warning")
		return
	var abs := ProjectSettings.globalize_path(_lib_path)
	if not FileAccess.file_exists(abs):
		_rlog("[reload] library missing: %s" % abs, "error")
		return
	_rlog("[reload] library %s — %d bytes, mtime %s" % [_lib_path, _file_len(abs),
		Time.get_datetime_string_from_unix_time(FileAccess.get_modified_time(abs))])

func _log_reload_stamp() -> void:
	var f := FileAccess.open(
		ProjectSettings.globalize_path("res://.scala/reload.stamp"), FileAccess.READ)
	if f == null:
		_rlog("[reload] reload.stamp not present (already consumed by the native side)")
		return
	var txt := f.get_as_text().strip_edges()
	f.close()
	_rlog(("[reload] reload.stamp: %s (epoch ms stamped by godotBuild; the native "
		+ "side reads + deletes it to time its half)") % txt)

func _log_loaded_extensions(when: String) -> void:
	if not _gem or not _gem.has_method("get_loaded_extensions"):
		return
	var exts: PackedStringArray = _gem.get_loaded_extensions()
	_rlog("[reload] loaded extensions (%s): %s" % [when, ", ".join(exts)])

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
	# Truncate the log NOW, not when the spawned shell gets around to it —
	# otherwise the first _poll reads the PREVIOUS session's log and its old
	# "[godot] swapped"/"[success]" markers trigger a spurious hot-reload
	# (and latch _reloaded, swallowing the real initial build's swap).
	var trunc := FileAccess.open(_sbt_log_abs, FileAccess.WRITE)
	if trunc:
		trunc.close()
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
	else:
		var sbt_new := _read_tail(_sbt_log_abs, _sbt_log_size)
		_sbt_log_size = sbt_new.size
		if sbt_new.text != "":
			var clean: String = _ansi.sub(sbt_new.text, "", true)
			_classify(clean)   # build state (dot/spinner)
			_log(clean)        # output dock (count/filter/auto-trim)
		if _state == St.BUILDING and _icon_lbl:
			_spin += 1
			_icon_lbl.text = SPINNER[_spin % SPINNER.size()]
	_poll_reload()

func _poll_reload() -> void:
	# Editor print stream (via our Logger) — forward hot-reload-related lines
	# verbatim (Godot core's reload messages are print_verbose: they only appear
	# with debug/settings/stdout/verbose_stdout on).
	if _logger:
		for e in _logger.drain():
			var eline: String = e["line"]
			if _is_reload_related(eline):
				var et: String = e["t"]
				if et == "info":
					et = _godot_line_type(eline)
				if et == "error" and _rl_state == Rl.RELOADING:
					_rl_had_error = true
				_rlog("[editor] " + eline, et)
	# The project's log file — editor sessions don't write it, but running the
	# game does; forward its reload-related lines too.
	var g := _read_tail(_godot_log_abs, _godot_log_size)
	_godot_log_size = g.size
	if g.text != "":
		var clean: String = _ansi.sub(g.text, "", true)
		for line in clean.split("\n", false):
			if _is_reload_related(line):
				var t := _godot_line_type(line)
				if t == "error" and _rl_state == Rl.RELOADING:
					_rl_had_error = true
				_rlog("[godot.log] " + line, t)
	# Filesystem scan progress — the first phase of the reload pipeline.
	if _fs and _fs.is_scanning():
		var pct := int(_fs.get_scanning_progress() * 100.0)
		if pct != _scan_pct:
			_scan_pct = pct
			_rlog("[reload] filesystem scan %d%%" % pct)
	elif _scan_pct >= 0:
		_rlog("[reload] filesystem scan done")
		_scan_pct = -1
	if _rl_state == Rl.RELOADING and _reload_icon_lbl:
		_rl_spin += 1
		_reload_icon_lbl.text = SPINNER[_rl_spin % SPINNER.size()]
	# Watchdog: never spin forever — if nothing confirmed the reload, give up.
	if _rl_state == Rl.RELOADING and _reload_started_ms > 0 \
			and Time.get_ticks_msec() - _reload_started_ms > RELOAD_TIMEOUT_MS:
		_rlog("[reload] no reload confirmation after %ds — giving up (the editor "
			% (RELOAD_TIMEOUT_MS / 1000)
			+ "may still pick it up on next window focus)", "warning")
		_reload_started_ms = 0
		_apply_reload_state(Rl.ERROR if _rl_had_error else Rl.IDLE)

func _classify(chunk: String) -> void:
	# The checks below are deliberately INDEPENDENT (not an elif chain): one
	# 0.2s poll chunk often carries several lifecycle lines at once — e.g.
	# "[godot] swapped", "[success]" and "Monitoring source files" flush
	# together at the end of a build — and an elif chain drops the reload
	# trigger whenever the idle marker shares the chunk with the swap marker.
	if chunk.find("[warn]") != -1:
		_had_warn = true
	if chunk.find("[error]") != -1:
		_had_error = true
		_apply_state(St.ERROR)
	if chunk.find("Build triggered") != -1:
		_had_error = false
		_had_warn = false
		_reloaded = false
		_apply_state(St.BUILDING)
	elif chunk.find("Compiling to native") != -1 or chunk.find("Optimizing") != -1 \
			or chunk.find("Linking") != -1 or chunk.find("Compiling") != -1:
		# A compile phase means a build is producing a NEW .so — re-arm the
		# reload trigger (the initial watch build has no "Build triggered"
		# line, so this is the only reset it gets).
		_reloaded = false
		_apply_state(St.BUILDING)
	# Trigger ONLY on the swap marker godotBuild prints after atomically
	# renaming the new .so in — "[success]" alone also matches unrelated sbt
	# output (e.g. ".bloop generated" at server boot) and misfires.
	if not _had_error and not _reloaded and chunk.find("[godot] swapped") != -1:
		_reloaded = true
		_trigger_reload()
	if chunk.find("Monitoring source files") != -1:
		if _had_error: _apply_state(St.ERROR)
		elif _had_warn: _apply_state(St.WARN)
		else: _apply_state(St.OK)

func _trigger_reload() -> void:
	_reload_started_ms = Time.get_ticks_msec()
	_rl_had_error = false
	_apply_reload_state(Rl.RELOADING)
	_announce("[plugin] GDExtension hot-reload starting…")
	_rlog("[reload] .so swap reported by sbt — starting GDExtension hot-reload")
	_log_lib_info()
	_log_reload_stamp()
	_log_loaded_extensions("before reload")
	# Godot only hot-reloads GDExtensions from the editor's window-focus-in
	# handler (deferred GDExtensionManager::reload_extensions); with the
	# in-editor watch there is no focus change, so replicate that path
	# ourselves: reload_extension(manifest) + emit extensions_reloaded.
	_reload_extension_now.call_deferred()

func _reload_extension_now() -> void:
	if not _gem or not _gem.has_method("reload_extension"):
		_rlog("[reload] GDExtensionManager.reload_extension not available — "
			+ "the reload will only happen on next editor focus-in", "warning")
		return
	var manifest := _manifest_path()
	if manifest == "":
		_rlog("[reload] no loaded .gdextension manifest found to reload", "error")
		_rl_had_error = true
		_apply_reload_state(Rl.ERROR)
		return
	_rlog("[reload] calling GDExtensionManager.reload_extension(\"%s\")" % manifest)
	var status: int = _gem.reload_extension(manifest)
	if status == 0:   # GDExtensionManager.LOAD_STATUS_OK
		# Emit the manager's signal exactly like the editor's bulk
		# reload_extensions() does after reloading: EditorNode reacts by
		# refreshing the InspectorDock property tree, reloading scripts and
		# regenerating docs. Without it the inspector keeps rendering the OLD
		# class layout (new @gdexport properties never show up). Our own
		# handler on the same signal finishes the timing.
		_rlog("[reload] reload_extension OK — emitting extensions_reloaded "
			+ "(refreshes inspector/scripts/docs)")
		_gem.emit_signal("extensions_reloaded")
	else:
		_rlog("[reload] reload_extension failed (load status %d)" % status, "error")
		_rl_had_error = true
		_reload_started_ms = 0
		_apply_reload_state(Rl.ERROR)

# The manifest of our loaded extension: prefer the loaded one matching the
# scala naming, else a single loaded extension, else the conventional path.
func _manifest_path() -> String:
	if _gem and _gem.has_method("get_loaded_extensions"):
		var exts: PackedStringArray = _gem.get_loaded_extensions()
		for p in exts:
			if String(p).get_file().begins_with("scala"):
				return p
		if exts.size() == 1:
			return exts[0]
	if FileAccess.file_exists(ProjectSettings.globalize_path("res://scala.gdextension")):
		return "res://scala.gdextension"
	return ""

func _on_extensions_reloaded() -> void:
	_finish_reload("extensions_reloaded signal")

func _finish_reload(source: String) -> void:
	_log_loaded_extensions("after reload")
	if _reload_started_ms > 0:
		_last_reload_ms = Time.get_ticks_msec() - _reload_started_ms
		_announce("[plugin] GDExtension hot-reload finished (%d ms)" % _last_reload_ms)
		_rlog("[reload] hot-reload finished in %d ms (%s)" % [_last_reload_ms, source],
			"error" if _rl_had_error else "success")
		_reload_started_ms = 0
	else:
		_announce("[plugin] GDExtension hot-reload finished")
		_rlog("[reload] hot-reload finished, untimed (%s)" % source, "success")
	_apply_reload_state(Rl.ERROR if _rl_had_error else Rl.OK)

# EditorFileSystem pipeline events (fire on any file change, not only reloads —
# the reload dock is deliberately verbose).
func _on_fs_changed() -> void:
	_rlog("[fs] filesystem_changed")

func _on_sources_changed(exist: bool) -> void:
	_rlog("[fs] sources_changed(exist=%s)" % str(exist))

func _on_resources_reimported(resources: PackedStringArray) -> void:
	_rlog("[fs] resources_reimported: %s" % ", ".join(resources))

func _on_resources_reload(resources: PackedStringArray) -> void:
	_rlog("[fs] resources_reload: %s" % ", ".join(resources))

func _on_script_classes_updated() -> void:
	_rlog("[fs] script_classes_updated")

# Build/reload lifecycle marker for the SBT Output dock. Deliberately NOT
# print()ed: this addon must never write to Godot's own Output panel — all its
# messaging lives in the "SBT Output" and "Scala Hot Reload" docks.
func _announce(msg: String) -> void:
	_log(msg)

# --- State / icons ------------------------------------------------------------
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

func _apply_reload_state(s: int) -> void:
	_rl_state = s
	if not _reload_icon_lbl: return
	match s:
		Rl.OK:
			_reload_icon_lbl.text = "✓"
			_set_reload_color(Color(0.30, 0.80, 0.35))                        # green
		Rl.ERROR:
			_reload_icon_lbl.text = "✗"
			_set_reload_color(Color(0.90, 0.32, 0.32))                        # red
		Rl.IDLE:
			_reload_icon_lbl.text = "○"
			_set_reload_color(Color(0.55, 0.55, 0.55))                        # grey
		Rl.RELOADING:
			_set_reload_color(Color("478cbf"))                                # godot blue
			_reload_icon_lbl.text = SPINNER[_rl_spin % SPINNER.size()]
	_update_tooltip()

func _set_icon_color(c: Color) -> void:
	_icon_lbl.add_theme_color_override("font_color", c)

func _set_reload_color(c: Color) -> void:
	_reload_icon_lbl.add_theme_color_override("font_color", c)

func _update_tooltip() -> void:
	var tip := "Scala build — click for SBT Server actions"
	if _last_reload_ms >= 0:
		tip += "\nLast GDExtension hot-reload: %d ms" % _last_reload_ms
	if _status_panel:
		_status_panel.tooltip_text = tip

# --- Placement / file helpers --------------------------------------------------
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

func _file_len(path: String) -> int:
	var f := FileAccess.open(path, FileAccess.READ)
	if f == null:
		return 0
	var n := f.get_length()
	f.close()
	return n
