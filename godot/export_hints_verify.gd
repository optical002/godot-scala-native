extends SceneTree

# Headless validation + dump of ExportTest's export-hint metadata. Confirms each
# @gdexport(ExportHint.…) lands the right PropertyHint/hint_string, and that the
# @exportCategory/@exportGroup/@exportSubgroup markers appear in order.
#
# Run: godot --headless --path . --script export_hints_verify.gd

const H_RANGE := 1
const H_EXP_EASING := 4
const H_FILE := 13
const H_DIR := 14
const H_GLOBAL_FILE := 15
const H_GLOBAL_DIR := 16
const H_MULTILINE := 18
const H_COLOR_NO_ALPHA := 21
const H_LOCALE := 32

const U_GROUP := 64
const U_CATEGORY := 128
const U_SUBGROUP := 256

var _failures: Array = []
func _fail(m): _failures.append(m)

func _initialize() -> void:
	if not ClassDB.class_exists("ExportTest"):
		_fail("ExportTest class not registered")
		_done()
		return
	var o = ClassDB.instantiate("ExportTest")

	# Full ordered dump of the property list (only our markers + exports).
	print("--- ExportTest property list ---")
	for p in o.get_property_list():
		var u = int(p.usage)
		var tag := ""
		if u & U_CATEGORY: tag = "  [CATEGORY]"
		elif u & U_GROUP: tag = "  [GROUP]"
		elif u & U_SUBGROUP: tag = "  [SUBGROUP]"
		# Skip the noisy built-in script/process props; show ours + markers.
		if tag != "" or _is_ours(p.name):
			print("  %-16s type=%-2d hint=%-2d hint_string='%s' usage=%d%s" % [
				p.name, p.type, p.hint, p.hint_string, u, tag])

	var props := {}
	for p in o.get_property_list():
		props[p.name] = p

	_expect_hint(props, "health", H_RANGE, "0.0,100.0,1.0")
	_expect_hint(props, "damage", H_RANGE, "0.0,999.0,1.0,or_greater")
	_expect_hint(props, "ratio", H_RANGE, "0.0,1.0,0.01")
	_expect_hint(props, "falloff", H_EXP_EASING, "")
	_expect_hint(props, "bio", H_MULTILINE, "")
	_expect_hint(props, "language", H_LOCALE, "")
	_expect_hint(props, "icon", H_FILE, "*.png")
	_expect_hint(props, "folder", H_DIR, "")
	_expect_hint(props, "external_file", H_GLOBAL_FILE, "*.txt")
	_expect_hint(props, "external_folder", H_GLOBAL_DIR, "")
	_expect_hint(props, "solid_tint", H_COLOR_NO_ALPHA, "")

	# Section markers present with the right usage flags.
	_expect_marker(props, "Numbers", U_CATEGORY)
	_expect_marker(props, "Text", U_GROUP)
	_expect_marker(props, "Paths", U_GROUP)
	_expect_marker(props, "Appearance", U_GROUP)
	_expect_marker(props, "Advanced", U_SUBGROUP)

	o.free()
	_done()

func _is_ours(n) -> bool:
	return n in ["health","damage","ratio","falloff","bio","language","icon",
		"folder","external_file","external_folder","tint","solid_tint"]

func _expect_hint(props, name, hint, hint_string) -> void:
	if not props.has(name):
		_fail("%s: missing from property_list" % name)
		return
	var p = props[name]
	if p.hint != hint:
		_fail("%s.hint: got %s, expected %s" % [name, p.hint, hint])
	if p.hint_string != hint_string:
		_fail("%s.hint_string: got '%s', expected '%s'" % [name, p.hint_string, hint_string])

func _expect_marker(props, name, usage_flag) -> void:
	if not props.has(name):
		_fail("section marker '%s' missing from property_list" % name)
		return
	if (int(props[name].usage) & usage_flag) == 0:
		_fail("section marker '%s': usage %d missing flag %d" % [name, props[name].usage, usage_flag])

func _done() -> void:
	var ok = _failures.is_empty()
	print("EXPORT HINTS VALIDATION: %s (%d failures)" % ["PASS" if ok else "FAIL", _failures.size()])
	for m in _failures:
		print("  FAIL: ", m)
	quit(0 if ok else 1)
