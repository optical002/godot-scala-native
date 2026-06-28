extends SceneTree

# Repro for the survivor-game bug. Two paths:
#   1. load the .tres directly and read its Dict export;
#   2. instantiate a scene whose node holds the resource as a Tres export and
#      reads the dict via the Gd handle (Entry.prefabs -> prefabs.get.scenes).
#
# Run: godot --headless --path . --script prefabs_repro_verify.gd

var _failures: Array = []

func _fail(m): _failures.append(m)

func _initialize() -> void:
	if not ClassDB.class_exists("PrefabsRepro"):
		_fail("PrefabsRepro class not registered")
		_done(); return
	if not ClassDB.class_exists("PrefabsReader"):
		_fail("PrefabsReader class not registered")
		_done(); return

	# Path 1: direct resource load + read its own Dict field.
	var res = load("res://prefabs_repro.tres")
	if res == null:
		_fail("failed to load prefabs_repro.tres"); _done(); return
	print("[repro] res.get('scenes') = ", res.get("scenes"))
	var direct = res.scenes_size()
	print("[repro] direct res.scenes_size() = ", direct)
	if direct != 2:
		_fail("direct scenes_size() = %s, expected 2 (field not populated)" % direct)

	# Path 2: scene node holding the resource as a Tres export; read via handle.
	var scene: PackedScene = load("res://reader.tscn")
	if scene == null:
		_fail("failed to load reader.tscn"); _done(); return
	var node = scene.instantiate()
	var viaTres = node.read_scenes_size_via_tres()
	print("[repro] node.read_scenes_size_via_tres() = ", viaTres)
	if viaTres != 2:
		_fail("via-Tres = %s, expected 2" % viaTres)

	var viaGd = node.read_scenes_size_via_gd()
	print("[repro] node.read_scenes_size_via_gd() = ", viaGd)
	if viaGd != 2:
		_fail("via-Gd (Gd[Resource] export) = %s, expected 2 — survivor-game's bug" % viaGd)

	_done()

func _done() -> void:
	if _failures.is_empty():
		print("[repro] PASS")
	else:
		print("[repro] FAIL:")
		for f in _failures:
			print("  - ", f)
	quit()
