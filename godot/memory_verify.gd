extends SceneTree

# Headless check of the binding's allocation behaviour and RefCounted
# ownership. Drives MemoryProbe (Scala): each hot-path step must stay within
# its Scala-heap byte budget per operation. Prints "MEMORY VERIFY: PASS" only
# if every check passed. Timings are informational.
#
# The byte budgets assume an optimized build (godotNativeMode releaseFast or
# releaseFull, the default). For a debug build pass `-- debug`: the budgets
# are then reported but not enforced; ownership checks still are.

const N := 20000

# Max Scala-heap bytes per operation. A call returning a math value
# allocates exactly that value (one Vector3 = 32 bytes); nothing else may.
const BUDGETS := {
	"noop": 0.0,
	"setPosition": 0.0,
	"getPosition": 32.0,
	"getChild": 0.0,
	"getName": 0.0,
	"findChild": 0.0,
	"singleton": 0.0,
	"getTree": 0.0,
	"emitSignal": 0.0,
	"vectorMath": 0.0,
	"transformMath": 64.0, # one Transform3D result
}

var _probe: Node3D
var _failures := 0
var _debug_build := "debug" in OS.get_cmdline_user_args()


func _initialize() -> void:
	_run.call_deferred()


func _run() -> void:
	if not ClassDB.class_exists("MemoryProbe"):
		print("FAIL: MemoryProbe is not registered")
		print("MEMORY VERIFY: FAIL")
		quit(1)
		return
	_probe = ClassDB.instantiate("MemoryProbe")
	root.add_child(_probe)
	await process_frame

	for step in BUDGETS:
		_probe.set("step", step)
		_probe.set("iterations", N)
		var parts: PackedStringArray = _probe.measure().split(" ")
		var bytes := float(parts[0])
		var ns := float(parts[1])
		_budget("%-14s %8.1f B/op %9.1f ns/op (budget %.0f)" % [step, bytes, ns, BUDGETS[step]], bytes <= BUDGETS[step] + 0.5)

	# GDScript -> Scala @func dispatch.
	_probe.noop()
	var b0: int = _probe.gc_total_bytes()
	var b1: int = _probe.gc_total_bytes()
	var probe_cost := b1 - b0
	var t0 := Time.get_ticks_usec()
	for i in N:
		_probe.noop()
	var t1 := Time.get_ticks_usec()
	var b2: int = _probe.gc_total_bytes()
	var per_call: float = float(b2 - b1 - probe_cost) / N
	_budget("%-14s %8.1f B/op %9.1f ns/op (budget 0)" % ["@func call", per_call, (t1 - t0) * 1000.0 / N], per_call <= 0.5)

	# Engine -> Scala _process dispatch.
	var f0: int = _probe.process_frame_count()
	var p0: int = _probe.gc_total_bytes()
	for i in 120:
		await process_frame
	var p1: int = _probe.gc_total_bytes()
	var frames: int = _probe.process_frame_count() - f0
	var per_frame: float = float(p1 - p0 - probe_cost) / max(frames, 1)
	_budget("%-14s %8.1f B/frame over %d frames (budget 0)" % ["_process", per_frame, frames], per_frame <= 0.5)

	print("ref counts after Ref<T> returns: " + _probe.ref_counts_after_return())

	# Ownership rules (Scala side).
	var own: String = _probe.test_ownership()
	_check("ownership" + ("" if own.is_empty() else ": " + own), own.is_empty())

	# Exported resource: assigning takes a reference, replacing releases it,
	# freeing the instance releases the last one.
	var a := PlayerStats.new()
	var b := PlayerStats.new()
	var a0 := a.get_reference_count()
	_probe.stats = a
	_check("export set takes a reference", a.get_reference_count() == a0 + 1)
	_probe.stats = b
	_check("export replace releases the old value", a.get_reference_count() == a0)
	var b_refs := b.get_reference_count()
	var leaked_before: int = _probe.outstanding_owned_refs()
	_probe.free()
	await process_frame
	_check("instance free releases exported resources", b.get_reference_count() == b_refs - 1)

	# Engine Ref<T> returns no longer leak: a resource loaded and duplicated
	# from Scala is gone once nothing else holds it.
	var dup_probe = ClassDB.instantiate("MemoryProbe")
	root.add_child(dup_probe)
	await process_frame
	dup_probe.ref_counts_after_return()
	_check("Ref<T> returns released (outstanding refs %d)" % dup_probe.outstanding_owned_refs(), dup_probe.outstanding_owned_refs() == leaked_before - 1)
	dup_probe.free()

	print("MEMORY VERIFY: %s" % ("PASS" if _failures == 0 else "FAIL (%d)" % _failures))
	quit(0 if _failures == 0 else 1)


func _budget(label: String, ok: bool) -> void:
	if _debug_build and not ok:
		print("info " + label + " (debug build: not enforced)")
	else:
		_check(label, ok)


func _check(label: String, ok: bool) -> void:
	if ok:
		print("ok   " + label)
	else:
		_failures += 1
		print("FAIL " + label)
