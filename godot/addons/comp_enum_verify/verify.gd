@tool
extends EditorPlugin

# Editor-context validation of the comp-reference dropdowns. The headless
# runtime script (export_comp_verify.gd) uses REAL extension instances, but the
# editor swaps runtime-class nodes for native-parent placeholders whose
# properties keep the static ClassDB hint — dropdowns silently degrade to plain
# strings unless the class registers as a tool (non-runtime) class. This plugin
# runs INSIDE the editor and asserts the instances are real and the ENUM
# rewrite happens there too.
#
# Inert unless launched with the user arg:
#   godot --headless --editor --path . -- verify-comp-enum

const H_ENUM := 2

var _failures := 0

func _enter_tree() -> void:
	if not ("verify-comp-enum" in OS.get_cmdline_user_args()):
		return
	_verify.call_deferred()

func _fail(m: String) -> void:
	_failures += 1
	print("  FAIL: ", m)

func _check_dropdowns(o: Object, cls: String, state_prop: String, param_prop: String) -> void:
	if o == null or not o.is_class(cls):
		_fail("%s: editor instantiated a placeholder, not the extension class" % cls)
		return
	var props := {}
	for p in o.get_property_list():
		props[p.name] = p
	for name in [state_prop, param_prop]:
		if not props.has(name):
			_fail("%s.%s missing from property_list" % [cls, name])
			return
		var p = props[name]
		print("  %s.%-12s hint=%-2d hint_string='%s'" % [cls, name, p.hint, p.hint_string])
		if int(p.hint) != H_ENUM:
			_fail("%s.%s not ENUM in editor" % [cls, name])
	if not ("MoveSpace" in String(props[state_prop].hint_string).split(",")):
		_fail("%s.%s options missing MoveSpace" % [cls, state_prop])
	if not ("blend_position" in String(props[param_prop].hint_string).split(",")):
		_fail("%s.%s options missing blend_position" % [cls, param_prop])

func _verify() -> void:
	var sm := AnimationNodeStateMachine.new()
	sm.add_node("MoveSpace", AnimationNodeBlendSpace1D.new())
	sm.add_node("Death", AnimationNodeAnimation.new())
	var smt := AnimationTree.new()
	smt.tree_root = sm

	print("--- editor-context dropdowns ---")
	var o = ClassDB.instantiate("ExportCompProperties")
	if o != null:
		o.set("state_tree", smt)
		o.set("state_name", "MoveSpace")
	_check_dropdowns(o, "ExportCompProperties", "state_name", "state_param")

	var c = ClassDB.instantiate("ExportCompCtorParams")
	if c != null:
		c.set("tree", smt)
		c.set("state", "MoveSpace")
	_check_dropdowns(c, "ExportCompCtorParams", "state", "state_param")

	# BlendTree state (the game's warrior shape): the state-param dropdown must
	# list only the editable params of the state's sub-nodes (no read-only
	# current_length/position/delta noise), and the state-node dropdown must
	# list the sub-node names. The comp/state annotation args on
	# ExportCompCtorParams are `nameOf(...)` references, so non-empty options
	# also prove the extracted names resolve.
	var bt := AnimationNodeBlendTree.new()
	bt.add_node("Locomotion", AnimationNodeBlendSpace2D.new())
	bt.add_node("AttackOneShot", AnimationNodeOneShot.new())
	bt.add_node("Blend2", AnimationNodeBlend2.new())
	var sm2 := AnimationNodeStateMachine.new()
	sm2.add_node("Locomotion", bt)
	sm2.add_node("Death", AnimationNodeAnimation.new())
	var smt2 := AnimationTree.new()
	smt2.tree_root = sm2

	var b = ClassDB.instantiate("ExportCompCtorParams")
	if b != null:
		b.set("tree", smt2)
		b.set("state", "Locomotion")
		var params := PackedStringArray()
		var nodes := PackedStringArray()
		for p in b.get_property_list():
			if p.name == "state_param":
				params = String(p.hint_string).split(",")
				print("  BLENDTREE state_param hint=%d hint_string='%s'" % [p.hint, p.hint_string])
			elif p.name == "state_node":
				nodes = String(p.hint_string).split(",")
				print("  BLENDTREE state_node  hint=%d hint_string='%s'" % [p.hint, p.hint_string])
		for want in ["Locomotion/blend_position", "AttackOneShot/request", "Blend2/blend_amount"]:
			if not (want in params):
				_fail("blendtree state_param options missing %s" % want)
		for junk in params:
			if junk.contains("current_") or junk.contains("internal_active"):
				_fail("blendtree state_param options contain read-only entry %s" % junk)
		for want in ["Locomotion", "AttackOneShot", "Blend2"]:
			if not (want in nodes):
				_fail("blendtree state_node options missing %s" % want)
		b.free()
	else:
		_fail("ExportCompCtorParams: editor instantiated a placeholder")
	smt2.free()

	if o != null: o.free()
	if c != null: c.free()
	smt.free()

	print("EXPORT COMP EDITOR VALIDATION: %s (%d failures)" % ["PASS" if _failures == 0 else "FAIL", _failures])
	get_tree().quit(0 if _failures == 0 else 1)
