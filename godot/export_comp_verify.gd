extends SceneTree

# Headless validation of ExportCompProperties' component-reference dropdowns.
# Each String property should be rewritten (via the class's validate_property
# callback) into a PROPERTY_HINT_ENUM whose hint_string lists the names of the
# referenced comp's current contents. Assigning a comp and reading
# get_property_list() exercises that path without an editor.
#
# Run: godot --headless --path . --script export_comp_verify.gd

const H_ENUM := 2

var _failures: Array = []
func _fail(m): _failures.append(m)

func _initialize() -> void:
	if not ClassDB.class_exists("ExportCompProperties"):
		_fail("ExportCompProperties class not registered")
		_done()
		return
	var o = ClassDB.instantiate("ExportCompProperties")

	# Bones: a Skeleton3D with a deterministic bone list.
	var sk := Skeleton3D.new()
	sk.add_bone("root")
	sk.add_bone("hip")
	sk.add_bone("head")
	o.set("skeleton", sk)

	# Sprite animations: SpriteFrames seeds a "default" animation; add one more.
	var sf := SpriteFrames.new()
	sf.add_animation("walk")
	o.set("frames", sf)

	# Animations: an AnimationPlayer with a one-animation library.
	var ap := AnimationPlayer.new()
	var lib := AnimationLibrary.new()
	lib.add_animation("idle", Animation.new())
	ap.add_animation_library("", lib)
	o.set("player", ap)

	# AnimationTree: left unconfigured — assert only that the field is an ENUM.
	var at := AnimationTree.new()
	o.set("tree", at)

	var props := {}
	for p in o.get_property_list():
		props[p.name] = p

	# Dump the dropdown properties for visibility.
	print("--- ExportCompProperties dropdowns ---")
	for name in ["bone_name", "anim", "sprite_anim", "tree_param"]:
		if props.has(name):
			var p = props[name]
			print("  %-12s hint=%-2d hint_string='%s'" % [name, p.hint, p.hint_string])

	# Bones are deterministic: assert exact joined string.
	_expect_enum(props, "bone_name", "root,hip,head")
	# Library/sprite ordering can vary and SpriteFrames seeds "default", so
	# assert ENUM membership rather than the exact string.
	_expect_enum_contains(props, "anim", "idle")
	_expect_enum_contains(props, "sprite_anim", "walk")
	# Tree has no configured params; just confirm it became an ENUM.
	_expect_enum_kind(props, "tree_param")

	at.free()
	ap.free()
	sk.free()
	o.free()
	_done()

func _expect_enum(props, name, hint_string) -> void:
	if not props.has(name):
		_fail("%s: missing from property_list" % name)
		return
	var p = props[name]
	if int(p.hint) != H_ENUM:
		_fail("%s.hint: got %s, expected ENUM(%d)" % [name, p.hint, H_ENUM])
	if p.hint_string != hint_string:
		_fail("%s.hint_string: got '%s', expected '%s'" % [name, p.hint_string, hint_string])

func _expect_enum_contains(props, name, needle) -> void:
	if not props.has(name):
		_fail("%s: missing from property_list" % name)
		return
	var p = props[name]
	if int(p.hint) != H_ENUM:
		_fail("%s.hint: got %s, expected ENUM(%d)" % [name, p.hint, H_ENUM])
	if not (needle in p.hint_string.split(",")):
		_fail("%s.hint_string: '%s' missing '%s'" % [name, p.hint_string, needle])

func _expect_enum_kind(props, name) -> void:
	if not props.has(name):
		_fail("%s: missing from property_list" % name)
		return
	if int(props[name].hint) != H_ENUM:
		_fail("%s.hint: got %s, expected ENUM(%d)" % [name, props[name].hint, H_ENUM])

func _done() -> void:
	var ok = _failures.is_empty()
	print("EXPORT COMP VALIDATION: %s (%d failures)" % ["PASS" if ok else "FAIL", _failures.size()])
	for m in _failures:
		print("  FAIL: ", m)
	quit(0 if ok else 1)
