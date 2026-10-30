extends SceneTree

# Headless validation of the typed Input API (Input.getKey / getAction / ...,
# the hidden per-key actions behind just-pressed, typed event checks, singleton
# forwarders, generated enums and game.Actions). Events are injected with
# Input.parse_input_event; prints "INPUT VERIFY: PASS" only if every check holds.
#
# Run: godot --headless --path . --script input_verify.gd

# KeyState ordinals.
const PRESSED := 0
const JUST_PRESSED := 1
const JUST_RELEASED := 2
const RELEASED := 3

var _p: Node
var _failures: Array = []

func _expect(name: String, got, want) -> void:
	if got != want:
		_failures.append("%s: got %s, expected %s" % [name, got, want])

func _initialize() -> void:
	_run.call_deferred()

func _key(code: int, pressed: bool, physical := 0, ctrl := false) -> InputEventKey:
	var e := InputEventKey.new()
	e.keycode = code
	e.physical_keycode = physical
	e.pressed = pressed
	e.ctrl_pressed = ctrl
	return e

func _send(e: InputEvent) -> void:
	Input.parse_input_event(e)
	Input.flush_buffered_events()

# Query the probe: set its argument fields, then call the zero-arg @func.
func _q(fn: String, code: int, state := PRESSED, mods := 0):
	_p.set("code", code)
	_p.set("state", state)
	_p.set("mods", mods)
	return _p.call(fn)

func _act(name: String, state: int) -> bool:
	_p.set("action", name)
	_p.set("state", state)
	return _p.act()

func _event(pressed: bool, echo := false) -> String:
	_p.set("pressed", pressed)
	_p.set("echo", echo)
	return _p.check_event()

func _run() -> void:
	if not ClassDB.class_exists("InputProbe"):
		print("FAIL: InputProbe is not registered")
		print("INPUT VERIFY: FAIL")
		quit(1)
		return
	_p = ClassDB.instantiate("InputProbe")
	root.add_child(_p)
	await process_frame

	# First queries register the hidden actions; nothing is held yet.
	_expect("key idle", _q("key", KEY_SPACE), false)
	_expect("key idle released", _q("key", KEY_SPACE, RELEASED), true)
	_q("physical_key", KEY_A)
	_q("mouse", MOUSE_BUTTON_LEFT)
	_q("joy", JOY_BUTTON_A)
	_q("key_mods", KEY_S, PRESSED, KEY_MASK_CTRL)

	# Generated enums and the singleton forwarder.
	_expect("Key name", _q("key_name", KEY_SPACE), "Space")
	_expect("Key0 name", _q("key_name", KEY_0), "Key0")
	_expect("MouseMode name", _p.mouse_mode(), "Visible")

	# Space down: Pressed + JustPressed this frame, through key and action.
	_send(_key(KEY_SPACE, true))
	_expect("space pressed", _q("key", KEY_SPACE), true)
	_expect("space just pressed", _q("key", KEY_SPACE, JUST_PRESSED), true)
	_expect("space released", _q("key", KEY_SPACE, RELEASED), false)
	_expect("jump just pressed", _act("Jump", JUST_PRESSED), true)
	_expect("forwarded isKeyPressed", _q("forwarded", KEY_SPACE), true)
	_expect("_input saw the event", _p.last_seen(), "true,true,false,true")

	await process_frame
	_expect("space still pressed", _q("key", KEY_SPACE), true)
	_expect("space not just pressed next frame", _q("key", KEY_SPACE, JUST_PRESSED), false)
	_expect("jump held", _act("Jump", PRESSED), true)

	_send(_key(KEY_SPACE, false))
	_expect("space just released", _q("key", KEY_SPACE, JUST_RELEASED), true)
	_expect("space released now", _q("key", KEY_SPACE, RELEASED), true)
	_expect("jump just released", _act("Jump", JUST_RELEASED), true)
	await process_frame
	_expect("space not just released next frame", _q("key", KEY_SPACE, JUST_RELEASED), false)

	# Typed checks on single events.
	_expect("event down", _event(true), "true,true,false,true")
	_expect("event echo", _event(true, true), "false,false,false,true")
	_expect("event up", _event(false), "false,false,true,false")

	# Physical vs logical: AZERTY's Q sits where QWERTY has A.
	_send(_key(KEY_Q, true, KEY_A))
	_expect("physical A", _q("physical_key", KEY_A), true)
	_expect("logical Q", _q("key", KEY_Q), true)
	_expect("logical A not pressed", _q("key", KEY_A), false)
	_expect("move_left (physical A)", _act("MoveLeft", JUST_PRESSED), true)
	_send(_key(KEY_Q, false, KEY_A))

	# Modifiers: Ctrl+S matches the Ctrl variant, plain S does not.
	_send(_key(KEY_S, true, 0, true))
	_expect("ctrl+s", _q("key_mods", KEY_S, JUST_PRESSED, KEY_MASK_CTRL), true)
	_expect("s ignoring mods", _q("key", KEY_S), true)
	_send(_key(KEY_S, false, 0, true))
	await process_frame
	_send(_key(KEY_S, true))
	_expect("plain s is not ctrl+s", _q("key_mods", KEY_S, PRESSED, KEY_MASK_CTRL), false)
	_send(_key(KEY_S, false))

	# Mouse and joypad buttons.
	var click := InputEventMouseButton.new()
	click.button_index = MOUSE_BUTTON_LEFT
	click.pressed = true
	_send(click)
	_expect("mouse left just pressed", _q("mouse", MOUSE_BUTTON_LEFT, JUST_PRESSED), true)
	var pad := InputEventJoypadButton.new()
	pad.device = 0
	pad.button_index = JOY_BUTTON_A
	pad.pressed = true
	_send(pad)
	_expect("joy A pressed", _q("joy", JOY_BUTTON_A), true)
	_expect("jump via joypad", _act("Jump", PRESSED), true)

	# A tap that goes down and up within one frame still reads as an edge.
	await process_frame
	_send(_key(KEY_ENTER, true))
	_send(_key(KEY_ENTER, false))
	_expect("tap just pressed", _q("key", KEY_ENTER, JUST_PRESSED), true)
	_expect("tap just released", _q("key", KEY_ENTER, JUST_RELEASED), true)
	_expect("tap not held", _q("key", KEY_ENTER, PRESSED), false)

	# Analog helpers and simulated presses.
	_p.set("action", "MoveRight")
	_p.press()
	_expect("axis right", _p.axis(), 1.0)
	_expect("vector right", _p.vector(), "1.0,0.0")
	_p.release()
	_expect("axis released", _p.axis(), 0.0)

	_p.queue_free()
	await process_frame
	for f in _failures:
		print("FAIL: ", f)
	if _failures.is_empty():
		print("INPUT VERIFY: PASS")
		quit(0)
	else:
		print("INPUT VERIFY: FAIL (%d)" % _failures.size())
		quit(1)
