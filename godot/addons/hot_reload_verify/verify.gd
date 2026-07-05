@tool
extends EditorPlugin

# End-to-end hot-reload verification: proves that adding a `@gdexport` property
# to a harness class reaches the editor's inspector without a restart.
#
#   1. Assert the probe property is NOT on ExportTest (the old .so is loaded).
#   2. Append `@gdexport var hotReloadProbe<epoch>: Int = 0` to ExportTest.scala.
#   3. The godot_scala addon's sbt watch rebuilds, swaps the .so, and drives the
#      GDExtension reload (focus-in notification -> reload_extensions).
#   4. On every GDExtensionManager.extensions_reloaded (plus a 1s poll as
#      backup), look for the probe in ClassDB.class_get_property_list — the
#      exact source the inspector renders from. Found -> PASS + timings.
#   5. The source file is restored either way; FAIL after TIMEOUT_S.
#
# Inert unless launched with the user arg:
#   godot --headless --editor --path . -- verify-hot-reload

const TARGET_CLASS := "ExportTest"
const TARGET_FILE := "../harness-scala/src/main/scala/game/ExportTest.scala"
const TIMEOUT_S := 480.0        # probe change -> visible in ClassDB
const WARMUP_TIMEOUT_S := 900.0 # sbt watch initial build -> idle ("Monitoring")

var _probe := ""
var _src_path := ""
var _orig := ""
var _patched := ""
var _t0 := 0
var _timer: Timer
var _done := false
var _gem: Object
var _sbt_log_mark := 0    # sbt.log length at injection time
var _last_kick_ms := 0
var _kicks := 0

func _enter_tree() -> void:
	if not ("verify-hot-reload" in OS.get_cmdline_user_args()):
		return
	_src_path = ProjectSettings.globalize_path("res://").path_join(TARGET_FILE)
	# All-lowercase on purpose: the binding snake_cases camelCase Scala field
	# names for Godot (hotReloadProbe -> hot_reload_probe), so a caseless name
	# keeps the ClassDB property name identical to the Scala one.
	_probe = "hotreloadprobe%d" % int(Time.get_unix_time_from_system())
	_start.call_deferred()

func _start() -> void:
	print("[hot-reload-verify] armed — target=%s file=%s probe=%s"
		% [TARGET_CLASS, _src_path, _probe])
	if not ClassDB.class_exists(TARGET_CLASS):
		_fail("class %s not registered at startup — extension not loaded?" % TARGET_CLASS)
		return
	if _has_probe():
		_fail("probe property already present before the source change?!")
		return
	# Wait for the godot_scala addon's sbt watch to finish its INITIAL build and
	# go idle ("Monitoring source files" in sbt.log), so the probe change below
	# exercises a true incremental watch rebuild — the case a user hits when
	# adding a property mid-session.
	var sbt_log := ProjectSettings.globalize_path("res://.scala/sbt.log")
	var waited := 0.0
	print("[hot-reload-verify] waiting for the sbt watch to go idle "
		+ "(initial build; timeout %ds)…" % int(WARMUP_TIMEOUT_S))
	while not FileAccess.get_file_as_string(sbt_log).contains("Monitoring source files"):
		await get_tree().create_timer(2.0).timeout
		waited += 2.0
		if waited > WARMUP_TIMEOUT_S:
			_fail("sbt watch never reached idle within %ds" % int(WARMUP_TIMEOUT_S))
			return
	# Give the watch a moment to finish registering its file listeners — a
	# write landing right as "Monitoring" appears can be silently missed.
	await get_tree().create_timer(3.0).timeout
	print("[hot-reload-verify] sbt watch idle after %ds — injecting probe" % int(waited))
	_orig = FileAccess.get_file_as_string(_src_path)
	if _orig == "":
		_fail("cannot read " + _src_path)
		return
	var idx := _orig.rfind("}")
	if idx == -1:
		_fail("no closing brace found in target file")
		return
	var patched := _orig.substr(0, idx) \
		+ "  @gdexport var %s: Int = 0\n" % _probe + _orig.substr(idx)
	_patched = patched
	_sbt_log_mark = FileAccess.get_file_as_string(
		ProjectSettings.globalize_path("res://.scala/sbt.log")).length()
	var f := FileAccess.open(_src_path, FileAccess.WRITE)
	if f == null:
		_fail("cannot write " + _src_path)
		return
	f.store_string(patched)
	f.close()
	_t0 = Time.get_ticks_msec()
	_last_kick_ms = _t0
	print("[hot-reload-verify] probe property appended — waiting for the sbt "
		+ "watch to rebuild + hot-reload (timeout %ds)" % int(TIMEOUT_S))
	if Engine.has_singleton("GDExtensionManager"):
		_gem = Engine.get_singleton("GDExtensionManager")
		if _gem.has_signal("extensions_reloaded"):
			_gem.extensions_reloaded.connect(_on_reloaded)
	_timer = Timer.new()
	_timer.wait_time = 1.0
	_timer.timeout.connect(_tick)
	add_child(_timer)
	_timer.start()

func _exit_tree() -> void:
	if _gem and _gem.has_signal("extensions_reloaded") \
			and _gem.extensions_reloaded.is_connected(_on_reloaded):
		_gem.extensions_reloaded.disconnect(_on_reloaded)

func _on_reloaded() -> void:
	print("[hot-reload-verify] extensions_reloaded fired %d ms after source change"
		% (Time.get_ticks_msec() - _t0))
	_check()

func _tick() -> void:
	_check()
	if _done:
		return
	# The watch can miss a write that lands while it is (re)arming its file
	# listeners — if sbt hasn't acknowledged the change within 30s, save the
	# file again (what a user would do by re-saving in their IDE).
	if _kicks < 5 and Time.get_ticks_msec() - _last_kick_ms > 30000 \
			and not _sbt_ack_since_injection():
		_kicks += 1
		_last_kick_ms = Time.get_ticks_msec()
		var f := FileAccess.open(_src_path, FileAccess.WRITE)
		if f:
			f.store_string(_patched)
			f.close()
		print("[hot-reload-verify] sbt watch has not acknowledged the change — "
			+ "re-saved the file (kick %d)" % _kicks)
	if (Time.get_ticks_msec() - _t0) / 1000.0 > TIMEOUT_S:
		_fail("timed out after %ds — probe never appeared in ClassDB" % int(TIMEOUT_S))

func _sbt_ack_since_injection() -> bool:
	var log_text := FileAccess.get_file_as_string(
		ProjectSettings.globalize_path("res://.scala/sbt.log"))
	return log_text.substr(_sbt_log_mark).contains("Build triggered")

func _has_probe() -> bool:
	for p in ClassDB.class_get_property_list(TARGET_CLASS):
		if p.name == _probe:
			return true
	return false

func _check() -> void:
	if _done:
		return
	if _has_probe():
		_done = true
		print("[hot-reload-verify] PASS — new property '%s' visible on %s in the "
			% [_probe, TARGET_CLASS]
			+ "inspector property list %d ms after the source change"
			% (Time.get_ticks_msec() - _t0))
		_restore()
		_quit(0)

func _fail(msg: String) -> void:
	_done = true
	printerr("[hot-reload-verify] FAIL — " + msg)
	_restore()
	_quit(1)

func _restore() -> void:
	if _orig == "":
		return
	var f := FileAccess.open(_src_path, FileAccess.WRITE)
	if f:
		f.store_string(_orig)
		f.close()
		print("[hot-reload-verify] restored " + _src_path)

func _quit(code: int) -> void:
	# Let stdout flush and the restore land, then leave the editor.
	await get_tree().create_timer(1.0).timeout
	get_tree().quit(code)
