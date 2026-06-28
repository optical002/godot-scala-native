extends SceneTree

# Repro for the survivor-game `Prefabs.scenes == null` bug.
#
# The bug: a custom Resource held in a node's export (`Tres[T]` / bare resource)
# is freed because the binding's resource `fromVariant` stores the handle
# WITHOUT taking a reference. Once Godot drops the loader's temporary reference,
# the RefCounted resource hits refcount 0 and is freed; reading the export later
# returns a fresh, un-populated wrapper (its `scenes` Dict is null).
#
# To reproduce faithfully we must:
#   1. build the node holding the resource export,
#   2. drop ALL external references to the resource (so only the node's export
#      "holds" it — and it only really holds it if the binding referenced it),
#   3. let idle frames pass so the RefCounted free actually happens,
#   4. THEN read the dict via the node's export (the survivor-game `_ready`
#      timing).
#
# Run: godot --headless --path . --script prefabs_repro_verify.gd

var _failures: Array = []
var _node = null
var _frames := 0

func _fail(m): _failures.append(m)

func _initialize() -> void:
	if not ClassDB.class_exists("PrefabsRepro"):
		_fail("PrefabsRepro class not registered"); _done(); return
	if not ClassDB.class_exists("PrefabsReader"):
		_fail("PrefabsReader class not registered"); _done(); return

	# Build the reader node from the scene (its export points at the .tres).
	var scene: PackedScene = load("res://reader.tscn")
	if scene == null:
		_fail("failed to load reader.tscn"); _done(); return
	_node = scene.instantiate()
	root.add_child(_node)
	# Drop every local reference to the scene/resource. From here only the
	# node's export "holds" the resource — and only if the binding ref'd it.
	scene = null

# Read the export only AFTER idle frames, by which point an un-referenced
# RefCounted resource has been freed. This matches survivor-game's `_ready`
# timing relative to resource loading.
func _process(_dt: float) -> bool:
	_frames += 1
	if _frames < 5:
		return false
	var viaTres = _node.read_scenes_size_via_tres()
	print("[repro] (deferred) read_scenes_size_via_tres() = ", viaTres)
	if viaTres != 2:
		_fail("via-Tres = %s, expected 2 — resource was freed (export held no ref)" % viaTres)
	var viaGd = _node.read_scenes_size_via_gd()
	print("[repro] (deferred) read_scenes_size_via_gd() = ", viaGd)
	if viaGd != 2:
		_fail("via-Gd = %s, expected 2 — resource was freed (export held no ref)" % viaGd)
	_done()
	return true

func _done() -> void:
	if _failures.is_empty():
		print("[repro] PASS")
	else:
		print("[repro] FAIL:")
		for f in _failures:
			print("  - ", f)
	quit()
