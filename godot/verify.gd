extends SceneTree

# Headless verification that the Scala-registered Player class, its method,
# its @export property, and its signal are all visible and work from GDScript.

var _signal_fired := false

func _on_pinged() -> void:
	_signal_fired = true

func _initialize() -> void:
	# The binding writes its side log under the hidden .scala/ dir (next to the .so).
	var f := FileAccess.open(".scala/log", FileAccess.READ_WRITE)
	f.seek_end()

	f.store_line("gd: class_exists(Player) = %s" % ClassDB.class_exists("Player"))
	f.store_line("gd: has_method(get_score) = %s" % ClassDB.class_has_method("Player", "get_score"))
	f.store_line("gd: has_signal(pinged) = %s" % ClassDB.class_has_signal("Player", "pinged"))

	var p = ClassDB.instantiate("Player")
	if p != null:
		# Registered method.
		f.store_line("gd: get_score() = %s" % p.get_score())

		# @export property: default, set, get.
		f.store_line("gd: speed (default) = %s" % p.speed)
		p.speed = 250.0
		f.store_line("gd: speed (after set) = %s" % p.speed)

		# Property shows up in the inspector's property list.
		var has_speed := false
		for prop in p.get_property_list():
			if prop.name == "speed":
				has_speed = true
		f.store_line("gd: speed in property_list = %s" % has_speed)

		# Connect to the signal and emit it directly to confirm wiring.
		p.connect("pinged", _on_pinged)
		p.emit_signal("pinged")
		f.store_line("gd: signal fired after emit = %s" % _signal_fired)

		p.free()
	f.close()
	quit()
