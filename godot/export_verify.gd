extends SceneTree

# Headless validation of the binding's export system: that ExportsDemo's
# properties carry the right inspector metadata (type/hint/hint_string/class_name)
# and that values round-trip through set()/get(). The metadata is the headless
# proxy for what the editor inspector shows.
#
# Run: godot --headless --path . --script export_verify.gd

# Godot variant types / hints (see PropertyHints.scala).
const T_INT := 2
const T_OBJECT := 24
const T_DICT := 27
const H_ENUM := 2
const H_RESOURCE := 17
const H_TYPESTRING := 23
const H_NODE := 34

var _failures: Array = []

func _fail(m): _failures.append(m)

func _expect(name, got, want):
	if got != want:
		_fail("%s: got %s, expected %s" % [name, got, want])

func _initialize() -> void:
	if not ClassDB.class_exists("ExportsDemo"):
		_fail("ExportsDemo class not registered")
		_done()
		return
	var o = ClassDB.instantiate("ExportsDemo")

	# Collect the exported properties by name.
	var props := {}
	for p in o.get_property_list():
		props[p.name] = p

	_check_meta(props, "opt_node",  T_OBJECT, H_NODE,       "Node2D",      "Node2D")
	_check_meta(props, "req_node",  T_OBJECT, H_NODE,       "Node2D",      "Node2D")
	_check_meta(props, "bare_node", T_OBJECT, H_NODE,       "Node",        "Node")
	_check_meta(props, "opt_res",   T_OBJECT, H_RESOURCE,   "Resource",    "Resource")
	_check_meta(props, "opt_scene", T_OBJECT, H_RESOURCE,   "PackedScene", "PackedScene")
	_check_meta(props, "team",      T_INT,    H_ENUM,       "Red,Blue,Green", "")
	_check_meta(props, "weights",   T_DICT,   H_TYPESTRING, "4:;2:",       "")

	_roundtrips(o)

	o.free()

	_check_player()
	_check_enemy()
	_done()

# Player carries a typed dictionary export `stats_by_id: Dict[int, PlayerStats]`.
func _check_player() -> void:
	if not ClassDB.class_exists("Player"):
		_fail("Player class not registered")
		return
	var p = ClassDB.instantiate("Player")
	var props := {}
	for pr in p.get_property_list():
		props[pr.name] = pr
	# key = int (T_INT, no hint); value = PlayerStats resource (OBJECT/RESOURCE).
	_check_meta(props, "stats_by_id", T_DICT, H_TYPESTRING, "2:;24/17:PlayerStats", "")
	# Bare-type export shorthand: `Option[Projectile]` (a Node) gets the NODE hint,
	# `Option[PlayerStats]` (a Resource) gets the RESOURCE hint — no Gd/Tres wrapper.
	_check_meta(props, "maybe_projectile", T_OBJECT, H_NODE,     "Projectile", "Projectile")
	_check_meta(props, "maybe_stats",      T_OBJECT, H_RESOURCE, "PlayerStats", "PlayerStats")
	# Bare Required form (no wrapper, no default): `var projectile: Projectile` ==
	# Gd[Projectile] (NODE), `var stats: PlayerStats` == Tres[PlayerStats] (RESOURCE).
	_check_meta(props, "projectile", T_OBJECT, H_NODE,     "Projectile",  "Projectile")
	_check_meta(props, "stats",      T_OBJECT, H_RESOURCE, "PlayerStats", "PlayerStats")
	# No default written: a fresh instance leaves the bare node reference null.
	if p.get("projectile") != null:
		_fail("projectile default should be null, got %s" % p.get("projectile"))
	# Object round-trip through set()/get() on the bare node reference.
	var proj = ClassDB.instantiate("Projectile")
	p.set("projectile", proj)
	if p.get("projectile") != proj:
		_fail("projectile round-trip failed")
	proj.free()
	# enum: int-typed with ENUM hint listing the case names.
	_check_meta(props, "character_state", T_INT, H_ENUM, "Idle,Walking,Running,Jumping,Falling", "")

	# Enum round-trip (Running == 2).
	p.set("character_state", 2)
	if p.get("character_state") != 2:
		_fail("character_state round-trip failed: got %s" % p.get("character_state"))

	# Round-trip a {int -> PlayerStats} dictionary through set()/get().
	var stats = ClassDB.instantiate("PlayerStats")
	p.set("stats_by_id", {7: stats})
	var d = p.get("stats_by_id")
	if typeof(d) != TYPE_DICTIONARY or d.get(7) != stats:
		_fail("stats_by_id round-trip failed: got %s" % d)
	p.free()

# Enemy is a `case class` node: every `var` constructor param is auto-exported
# as if it carried `@gdexport`, with no per-field annotation in the body.
func _check_enemy() -> void:
	if not ClassDB.class_exists("Enemy"):
		_fail("Enemy class not registered")
		return
	var e = ClassDB.instantiate("Enemy")
	var props := {}
	for pr in e.get_property_list():
		props[pr.name] = pr
	# hp: plain int; projectile: Option[Projectile] (Node hint); scene: Tscn[Player]
	# (PackedScene resource hint). All from ctor params, none annotated.
	_check_meta(props, "hp",         T_INT,    0,          "",            "")
	_check_meta(props, "projectile", T_OBJECT, H_NODE,     "Projectile",  "Projectile")
	_check_meta(props, "scene",      T_OBJECT, H_RESOURCE, "PackedScene", "PackedScene")

	# Param value round-trips through set()/get().
	e.set("hp", 42)
	if e.get("hp") != 42:
		_fail("hp round-trip failed: got %s" % e.get("hp"))
	var proj = ClassDB.instantiate("Projectile")
	e.set("projectile", proj)
	if e.get("projectile") != proj:
		_fail("projectile round-trip failed")
	proj.free()
	e.free()

func _check_meta(props, name, type, hint, hint_string, class_name_):
	if not props.has(name):
		_fail("%s: property missing from property_list" % name)
		return
	var p = props[name]
	_expect(name + ".type", p.type, type)
	_expect(name + ".hint", p.hint, hint)
	_expect(name + ".hint_string", p.hint_string, hint_string)
	_expect(name + ".class_name", p.get("class_name", ""), class_name_)

func _roundtrips(o) -> void:
	# Node reference round-trip (optional + bare).
	var n = Node2D.new()
	o.set("opt_node", n)
	if o.get("opt_node") != n:
		_fail("opt_node round-trip failed")
	var nn = Node.new()
	o.set("bare_node", nn)
	if o.get("bare_node") != nn:
		_fail("bare_node round-trip failed")

	# Resource reference round-trip.
	var r = Resource.new()
	o.set("opt_res", r)
	if o.get("opt_res") != r:
		_fail("opt_res round-trip failed")

	# Enum round-trip (Green == 2).
	o.set("team", 2)
	if o.get("team") != 2:
		_fail("team round-trip failed: got %s" % o.get("team"))

	# Typed dictionary round-trip.
	o.set("weights", {"a": 1, "b": 2})
	var w = o.get("weights")
	if typeof(w) != TYPE_DICTIONARY or w.get("a") != 1 or w.get("b") != 2:
		_fail("weights round-trip failed: got %s" % w)

	# Typed scene round-trip (root Area2D).
	var ps = PackedScene.new()
	var area = Area2D.new()
	ps.pack(area)
	o.set("opt_scene", ps)
	if o.get("opt_scene") != ps:
		_fail("opt_scene round-trip failed")
	area.free()
	n.free()
	nn.free()

func _done() -> void:
	var ok = _failures.is_empty()
	print("EXPORT VALIDATION: %s (%d failures)" % ["PASS" if ok else "FAIL", _failures.size()])
	for m in _failures:
		print("  FAIL: ", m)
	quit(0 if ok else 1)
