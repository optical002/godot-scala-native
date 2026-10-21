extends SceneTree

# Headless check that the Scala math library (gdext.builtin) matches the
# engine: every method, member and operator of the math builtins runs on
# random inputs in Scala and in the engine (via MathParityProbe), and the
# results are compared. Prints "MATH PARITY: PASS n/n" only if all match.

func _initialize() -> void:
	_run.call_deferred()


func _run() -> void:
	if not ClassDB.class_exists("MathParityProbe"):
		print("FAIL: MathParityProbe is not registered")
		print("MATH PARITY: FAIL")
		quit(1)
		return
	var probe = ClassDB.instantiate("MathParityProbe")
	root.add_child(probe)
	var lines: PackedStringArray = probe.run().split("\n")
	var counts := lines[0].split(" ")
	var passed := int(counts[0])
	var total := int(counts[1])
	for i in range(1, lines.size()):
		print("FAIL " + lines[i])
	print("MATH PARITY: %s %d/%d" % ["PASS" if passed == total else "FAIL", passed, total])
	probe.free()
	quit(0 if passed == total else 1)
