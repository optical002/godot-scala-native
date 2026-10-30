package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Input`, extends `Object`. */
abstract class Input extends Object {
  override def godotClassName: String = "Input"

  /** Input.is_anything_pressed */
  final def isAnythingPressed(): Boolean = {
    if (gdext.classes.Input.mb_is_anything_pressed == null) gdext.classes.Input.mb_is_anything_pressed = MethodBind.get("Input", "is_anything_pressed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Input.mb_is_anything_pressed, livePtr)
  }

  /** Input.is_key_pressed */
  final def isKeyPressed(keycode: gdext.classes.Key): Boolean = {
    if (gdext.classes.Input.mb_is_key_pressed == null) gdext.classes.Input.mb_is_key_pressed = MethodBind.get("Input", "is_key_pressed", 1938909964L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Input.mb_is_key_pressed, livePtr, keycode)
  }

  /** Input.is_physical_key_pressed */
  final def isPhysicalKeyPressed(keycode: gdext.classes.Key): Boolean = {
    if (gdext.classes.Input.mb_is_physical_key_pressed == null) gdext.classes.Input.mb_is_physical_key_pressed = MethodBind.get("Input", "is_physical_key_pressed", 1938909964L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Input.mb_is_physical_key_pressed, livePtr, keycode)
  }

  /** Input.is_key_label_pressed */
  final def isKeyLabelPressed(keycode: gdext.classes.Key): Boolean = {
    if (gdext.classes.Input.mb_is_key_label_pressed == null) gdext.classes.Input.mb_is_key_label_pressed = MethodBind.get("Input", "is_key_label_pressed", 1938909964L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Input.mb_is_key_label_pressed, livePtr, keycode)
  }

  /** Input.is_mouse_button_pressed */
  final def isMouseButtonPressed(button: gdext.classes.MouseButton): Boolean = {
    if (gdext.classes.Input.mb_is_mouse_button_pressed == null) gdext.classes.Input.mb_is_mouse_button_pressed = MethodBind.get("Input", "is_mouse_button_pressed", 1821097125L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Input.mb_is_mouse_button_pressed, livePtr, button)
  }

  /** Input.is_joy_button_pressed */
  final def isJoyButtonPressed(device: Long, button: gdext.classes.JoyButton): Boolean = {
    if (gdext.classes.Input.mb_is_joy_button_pressed == null) gdext.classes.Input.mb_is_joy_button_pressed = MethodBind.get("Input", "is_joy_button_pressed", 787208542L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.Input.mb_is_joy_button_pressed, livePtr, device, button)
  }

  /** Input.is_action_pressed */
  final def isActionPressed(action: String, exactMatch: Boolean = false): Boolean = {
    if (gdext.classes.Input.mb_is_action_pressed == null) gdext.classes.Input.mb_is_action_pressed = MethodBind.get("Input", "is_action_pressed", 1558498928L)
    Ptrcall.call2[SnArg, Boolean, Boolean](gdext.classes.Input.mb_is_action_pressed, livePtr, SnArg(action), exactMatch)
  }

  /** Input.is_action_just_pressed */
  final def isActionJustPressed(action: String, exactMatch: Boolean = false): Boolean = {
    if (gdext.classes.Input.mb_is_action_just_pressed == null) gdext.classes.Input.mb_is_action_just_pressed = MethodBind.get("Input", "is_action_just_pressed", 1558498928L)
    Ptrcall.call2[SnArg, Boolean, Boolean](gdext.classes.Input.mb_is_action_just_pressed, livePtr, SnArg(action), exactMatch)
  }

  /** Input.is_action_just_released */
  final def isActionJustReleased(action: String, exactMatch: Boolean = false): Boolean = {
    if (gdext.classes.Input.mb_is_action_just_released == null) gdext.classes.Input.mb_is_action_just_released = MethodBind.get("Input", "is_action_just_released", 1558498928L)
    Ptrcall.call2[SnArg, Boolean, Boolean](gdext.classes.Input.mb_is_action_just_released, livePtr, SnArg(action), exactMatch)
  }

  /** Input.is_action_just_pressed_by_event */
  final def isActionJustPressedByEvent(action: String, event: InputEvent, exactMatch: Boolean = false): Boolean = {
    if (gdext.classes.Input.mb_is_action_just_pressed_by_event == null) gdext.classes.Input.mb_is_action_just_pressed_by_event = MethodBind.get("Input", "is_action_just_pressed_by_event", 551972873L)
    Ptrcall.call3[SnArg, GodotObject, Boolean, Boolean](gdext.classes.Input.mb_is_action_just_pressed_by_event, livePtr, SnArg(action), Wrappers.handle(event), exactMatch)
  }

  /** Input.is_action_just_released_by_event */
  final def isActionJustReleasedByEvent(action: String, event: InputEvent, exactMatch: Boolean = false): Boolean = {
    if (gdext.classes.Input.mb_is_action_just_released_by_event == null) gdext.classes.Input.mb_is_action_just_released_by_event = MethodBind.get("Input", "is_action_just_released_by_event", 551972873L)
    Ptrcall.call3[SnArg, GodotObject, Boolean, Boolean](gdext.classes.Input.mb_is_action_just_released_by_event, livePtr, SnArg(action), Wrappers.handle(event), exactMatch)
  }

  /** Input.get_action_strength */
  final def getActionStrength(action: String, exactMatch: Boolean = false): Double = {
    if (gdext.classes.Input.mb_get_action_strength == null) gdext.classes.Input.mb_get_action_strength = MethodBind.get("Input", "get_action_strength", 801543509L)
    Ptrcall.call2[SnArg, Boolean, Double](gdext.classes.Input.mb_get_action_strength, livePtr, SnArg(action), exactMatch)
  }

  /** Input.get_action_raw_strength */
  final def getActionRawStrength(action: String, exactMatch: Boolean = false): Double = {
    if (gdext.classes.Input.mb_get_action_raw_strength == null) gdext.classes.Input.mb_get_action_raw_strength = MethodBind.get("Input", "get_action_raw_strength", 801543509L)
    Ptrcall.call2[SnArg, Boolean, Double](gdext.classes.Input.mb_get_action_raw_strength, livePtr, SnArg(action), exactMatch)
  }

  /** Input.get_axis */
  final def getAxis(negativeAction: String, positiveAction: String): Double = {
    if (gdext.classes.Input.mb_get_axis == null) gdext.classes.Input.mb_get_axis = MethodBind.get("Input", "get_axis", 1958752504L)
    Ptrcall.call2[SnArg, SnArg, Double](gdext.classes.Input.mb_get_axis, livePtr, SnArg(negativeAction), SnArg(positiveAction))
  }

  /** Input.get_vector */
  final def getVector(negativeX: String, positiveX: String, negativeY: String, positiveY: String, deadzone: Double = -1.0): gdext.builtin.Vector2 = {
    if (gdext.classes.Input.mb_get_vector == null) gdext.classes.Input.mb_get_vector = MethodBind.get("Input", "get_vector", 2479607902L)
    Ptrcall.call5[SnArg, SnArg, SnArg, SnArg, Double, gdext.builtin.Vector2](gdext.classes.Input.mb_get_vector, livePtr, SnArg(negativeX), SnArg(positiveX), SnArg(negativeY), SnArg(positiveY), deadzone)
  }

  /** Input.add_joy_mapping */
  final def addJoyMapping(mapping: String, updateExisting: Boolean = false): Unit = {
    if (gdext.classes.Input.mb_add_joy_mapping == null) gdext.classes.Input.mb_add_joy_mapping = MethodBind.get("Input", "add_joy_mapping", 1168363258L)
    Ptrcall.callVoid2(gdext.classes.Input.mb_add_joy_mapping, livePtr, mapping, updateExisting)
  }

  /** Input.remove_joy_mapping */
  final def removeJoyMapping(guid: String): Unit = {
    if (gdext.classes.Input.mb_remove_joy_mapping == null) gdext.classes.Input.mb_remove_joy_mapping = MethodBind.get("Input", "remove_joy_mapping", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_remove_joy_mapping, livePtr, guid)
  }

  /** Input.is_joy_known */
  final def isJoyKnown(device: Long): Boolean = {
    if (gdext.classes.Input.mb_is_joy_known == null) gdext.classes.Input.mb_is_joy_known = MethodBind.get("Input", "is_joy_known", 3067735520L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Input.mb_is_joy_known, livePtr, device)
  }

  /** Input.get_joy_axis */
  final def getJoyAxis(device: Long, axis: gdext.classes.JoyAxis): Double = {
    if (gdext.classes.Input.mb_get_joy_axis == null) gdext.classes.Input.mb_get_joy_axis = MethodBind.get("Input", "get_joy_axis", 4063175957L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.Input.mb_get_joy_axis, livePtr, device, axis)
  }

  /** Input.get_joy_name */
  final def getJoyName(device: Long): String = {
    if (gdext.classes.Input.mb_get_joy_name == null) gdext.classes.Input.mb_get_joy_name = MethodBind.get("Input", "get_joy_name", 990163283L)
    Ptrcall.call1[Long, String](gdext.classes.Input.mb_get_joy_name, livePtr, device)
  }

  /** Input.get_joy_guid */
  final def getJoyGuid(device: Long): String = {
    if (gdext.classes.Input.mb_get_joy_guid == null) gdext.classes.Input.mb_get_joy_guid = MethodBind.get("Input", "get_joy_guid", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.Input.mb_get_joy_guid, livePtr, device)
  }

  /** Input.should_ignore_device */
  final def shouldIgnoreDevice(vendorId: Long, productId: Long): Boolean = {
    if (gdext.classes.Input.mb_should_ignore_device == null) gdext.classes.Input.mb_should_ignore_device = MethodBind.get("Input", "should_ignore_device", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.Input.mb_should_ignore_device, livePtr, vendorId, productId)
  }

  /** Input.get_joy_vibration_strength */
  final def getJoyVibrationStrength(device: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.Input.mb_get_joy_vibration_strength == null) gdext.classes.Input.mb_get_joy_vibration_strength = MethodBind.get("Input", "get_joy_vibration_strength", 3114997196L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.Input.mb_get_joy_vibration_strength, livePtr, device)
  }

  /** Input.get_joy_vibration_duration */
  final def getJoyVibrationDuration(device: Long): Double = {
    if (gdext.classes.Input.mb_get_joy_vibration_duration == null) gdext.classes.Input.mb_get_joy_vibration_duration = MethodBind.get("Input", "get_joy_vibration_duration", 4025615559L)
    Ptrcall.call1[Long, Double](gdext.classes.Input.mb_get_joy_vibration_duration, livePtr, device)
  }

  /** Input.start_joy_vibration */
  final def startJoyVibration(device: Long, weakMagnitude: Double, strongMagnitude: Double, duration: Double = 0.0): Unit = {
    if (gdext.classes.Input.mb_start_joy_vibration == null) gdext.classes.Input.mb_start_joy_vibration = MethodBind.get("Input", "start_joy_vibration", 2576575033L)
    Ptrcall.callVoid4(gdext.classes.Input.mb_start_joy_vibration, livePtr, device, weakMagnitude, strongMagnitude, duration)
  }

  /** Input.stop_joy_vibration */
  final def stopJoyVibration(device: Long): Unit = {
    if (gdext.classes.Input.mb_stop_joy_vibration == null) gdext.classes.Input.mb_stop_joy_vibration = MethodBind.get("Input", "stop_joy_vibration", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_stop_joy_vibration, livePtr, device)
  }

  /** Input.vibrate_handheld */
  final def vibrateHandheld(durationMs: Long = 500L, amplitude: Double = -1.0): Unit = {
    if (gdext.classes.Input.mb_vibrate_handheld == null) gdext.classes.Input.mb_vibrate_handheld = MethodBind.get("Input", "vibrate_handheld", 544894297L)
    Ptrcall.callVoid2(gdext.classes.Input.mb_vibrate_handheld, livePtr, durationMs, amplitude)
  }

  /** Input.get_gravity */
  final def getGravity(): gdext.builtin.Vector3 = {
    if (gdext.classes.Input.mb_get_gravity == null) gdext.classes.Input.mb_get_gravity = MethodBind.get("Input", "get_gravity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Input.mb_get_gravity, livePtr)
  }

  /** Input.get_accelerometer */
  final def getAccelerometer(): gdext.builtin.Vector3 = {
    if (gdext.classes.Input.mb_get_accelerometer == null) gdext.classes.Input.mb_get_accelerometer = MethodBind.get("Input", "get_accelerometer", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Input.mb_get_accelerometer, livePtr)
  }

  /** Input.get_magnetometer */
  final def getMagnetometer(): gdext.builtin.Vector3 = {
    if (gdext.classes.Input.mb_get_magnetometer == null) gdext.classes.Input.mb_get_magnetometer = MethodBind.get("Input", "get_magnetometer", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Input.mb_get_magnetometer, livePtr)
  }

  /** Input.get_gyroscope */
  final def getGyroscope(): gdext.builtin.Vector3 = {
    if (gdext.classes.Input.mb_get_gyroscope == null) gdext.classes.Input.mb_get_gyroscope = MethodBind.get("Input", "get_gyroscope", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Input.mb_get_gyroscope, livePtr)
  }

  /** Input.set_gravity */
  final def setGravity(value: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Input.mb_set_gravity == null) gdext.classes.Input.mb_set_gravity = MethodBind.get("Input", "set_gravity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_set_gravity, livePtr, value)
  }

  /** Input.set_accelerometer */
  final def setAccelerometer(value: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Input.mb_set_accelerometer == null) gdext.classes.Input.mb_set_accelerometer = MethodBind.get("Input", "set_accelerometer", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_set_accelerometer, livePtr, value)
  }

  /** Input.set_magnetometer */
  final def setMagnetometer(value: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Input.mb_set_magnetometer == null) gdext.classes.Input.mb_set_magnetometer = MethodBind.get("Input", "set_magnetometer", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_set_magnetometer, livePtr, value)
  }

  /** Input.set_gyroscope */
  final def setGyroscope(value: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Input.mb_set_gyroscope == null) gdext.classes.Input.mb_set_gyroscope = MethodBind.get("Input", "set_gyroscope", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_set_gyroscope, livePtr, value)
  }

  /** Input.set_joy_light */
  final def setJoyLight(device: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Input.mb_set_joy_light == null) gdext.classes.Input.mb_set_joy_light = MethodBind.get("Input", "set_joy_light", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.Input.mb_set_joy_light, livePtr, device, color)
  }

  /** Input.has_joy_light */
  final def hasJoyLight(device: Long): Boolean = {
    if (gdext.classes.Input.mb_has_joy_light == null) gdext.classes.Input.mb_has_joy_light = MethodBind.get("Input", "has_joy_light", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Input.mb_has_joy_light, livePtr, device)
  }

  /** Input.get_last_mouse_velocity */
  final def getLastMouseVelocity(): gdext.builtin.Vector2 = {
    if (gdext.classes.Input.mb_get_last_mouse_velocity == null) gdext.classes.Input.mb_get_last_mouse_velocity = MethodBind.get("Input", "get_last_mouse_velocity", 1497962370L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Input.mb_get_last_mouse_velocity, livePtr)
  }

  /** Input.get_last_mouse_screen_velocity */
  final def getLastMouseScreenVelocity(): gdext.builtin.Vector2 = {
    if (gdext.classes.Input.mb_get_last_mouse_screen_velocity == null) gdext.classes.Input.mb_get_last_mouse_screen_velocity = MethodBind.get("Input", "get_last_mouse_screen_velocity", 1497962370L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Input.mb_get_last_mouse_screen_velocity, livePtr)
  }

  /** Input.get_mouse_button_mask */
  final def getMouseButtonMask(): gdext.classes.MouseButtonMask = {
    if (gdext.classes.Input.mb_get_mouse_button_mask == null) gdext.classes.Input.mb_get_mouse_button_mask = MethodBind.get("Input", "get_mouse_button_mask", 2512161324L)
    gdext.classes.MouseButtonMask(Ptrcall.call0[Long](gdext.classes.Input.mb_get_mouse_button_mask, livePtr))
  }

  /** Input.set_mouse_mode */
  final def setMouseMode(mode: gdext.classes.Input.MouseMode): Unit = {
    if (gdext.classes.Input.mb_set_mouse_mode == null) gdext.classes.Input.mb_set_mouse_mode = MethodBind.get("Input", "set_mouse_mode", 2228490894L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_set_mouse_mode, livePtr, mode)
  }

  /** Input.get_mouse_mode */
  final def getMouseMode(): gdext.classes.Input.MouseMode = {
    if (gdext.classes.Input.mb_get_mouse_mode == null) gdext.classes.Input.mb_get_mouse_mode = MethodBind.get("Input", "get_mouse_mode", 965286182L)
    gdext.classes.Input.MouseMode(Ptrcall.call0[Long](gdext.classes.Input.mb_get_mouse_mode, livePtr))
  }

  /** Input.warp_mouse */
  final def warpMouse(position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Input.mb_warp_mouse == null) gdext.classes.Input.mb_warp_mouse = MethodBind.get("Input", "warp_mouse", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_warp_mouse, livePtr, position)
  }

  /** Input.action_press */
  final def actionPress(action: String, strength: Double = 1.0): Unit = {
    if (gdext.classes.Input.mb_action_press == null) gdext.classes.Input.mb_action_press = MethodBind.get("Input", "action_press", 1713091165L)
    Ptrcall.callVoid2(gdext.classes.Input.mb_action_press, livePtr, SnArg(action), strength)
  }

  /** Input.action_release */
  final def actionRelease(action: String): Unit = {
    if (gdext.classes.Input.mb_action_release == null) gdext.classes.Input.mb_action_release = MethodBind.get("Input", "action_release", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_action_release, livePtr, SnArg(action))
  }

  /** Input.set_default_cursor_shape */
  final def setDefaultCursorShape(shape: gdext.classes.Input.CursorShape = gdext.classes.Input.CursorShape(0L)): Unit = {
    if (gdext.classes.Input.mb_set_default_cursor_shape == null) gdext.classes.Input.mb_set_default_cursor_shape = MethodBind.get("Input", "set_default_cursor_shape", 2124816902L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_set_default_cursor_shape, livePtr, shape)
  }

  /** Input.get_current_cursor_shape */
  final def getCurrentCursorShape(): gdext.classes.Input.CursorShape = {
    if (gdext.classes.Input.mb_get_current_cursor_shape == null) gdext.classes.Input.mb_get_current_cursor_shape = MethodBind.get("Input", "get_current_cursor_shape", 3455658929L)
    gdext.classes.Input.CursorShape(Ptrcall.call0[Long](gdext.classes.Input.mb_get_current_cursor_shape, livePtr))
  }

  /** Input.set_custom_mouse_cursor */
  final def setCustomMouseCursor(image: Resource, shape: gdext.classes.Input.CursorShape = gdext.classes.Input.CursorShape(0L), hotspot: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): Unit = {
    if (gdext.classes.Input.mb_set_custom_mouse_cursor == null) gdext.classes.Input.mb_set_custom_mouse_cursor = MethodBind.get("Input", "set_custom_mouse_cursor", 703945977L)
    Ptrcall.callVoid3(gdext.classes.Input.mb_set_custom_mouse_cursor, livePtr, Wrappers.handle(image), shape, hotspot)
  }

  /** Input.parse_input_event */
  final def parseInputEvent(event: InputEvent): Unit = {
    if (gdext.classes.Input.mb_parse_input_event == null) gdext.classes.Input.mb_parse_input_event = MethodBind.get("Input", "parse_input_event", 3754044979L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_parse_input_event, livePtr, Wrappers.handle(event))
  }

  /** Input.set_use_accumulated_input */
  final def setUseAccumulatedInput(enable: Boolean): Unit = {
    if (gdext.classes.Input.mb_set_use_accumulated_input == null) gdext.classes.Input.mb_set_use_accumulated_input = MethodBind.get("Input", "set_use_accumulated_input", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_set_use_accumulated_input, livePtr, enable)
  }

  /** Input.is_using_accumulated_input */
  final def isUsingAccumulatedInput(): Boolean = {
    if (gdext.classes.Input.mb_is_using_accumulated_input == null) gdext.classes.Input.mb_is_using_accumulated_input = MethodBind.get("Input", "is_using_accumulated_input", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Input.mb_is_using_accumulated_input, livePtr)
  }

  /** Input.flush_buffered_events */
  final def flushBufferedEvents(): Unit = {
    if (gdext.classes.Input.mb_flush_buffered_events == null) gdext.classes.Input.mb_flush_buffered_events = MethodBind.get("Input", "flush_buffered_events", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Input.mb_flush_buffered_events, livePtr)
  }

  /** Input.set_emulate_mouse_from_touch */
  final def setEmulateMouseFromTouch(enable: Boolean): Unit = {
    if (gdext.classes.Input.mb_set_emulate_mouse_from_touch == null) gdext.classes.Input.mb_set_emulate_mouse_from_touch = MethodBind.get("Input", "set_emulate_mouse_from_touch", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_set_emulate_mouse_from_touch, livePtr, enable)
  }

  /** Input.is_emulating_mouse_from_touch */
  final def isEmulatingMouseFromTouch(): Boolean = {
    if (gdext.classes.Input.mb_is_emulating_mouse_from_touch == null) gdext.classes.Input.mb_is_emulating_mouse_from_touch = MethodBind.get("Input", "is_emulating_mouse_from_touch", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Input.mb_is_emulating_mouse_from_touch, livePtr)
  }

  /** Input.set_emulate_touch_from_mouse */
  final def setEmulateTouchFromMouse(enable: Boolean): Unit = {
    if (gdext.classes.Input.mb_set_emulate_touch_from_mouse == null) gdext.classes.Input.mb_set_emulate_touch_from_mouse = MethodBind.get("Input", "set_emulate_touch_from_mouse", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Input.mb_set_emulate_touch_from_mouse, livePtr, enable)
  }

  /** Input.is_emulating_touch_from_mouse */
  final def isEmulatingTouchFromMouse(): Boolean = {
    if (gdext.classes.Input.mb_is_emulating_touch_from_mouse == null) gdext.classes.Input.mb_is_emulating_touch_from_mouse = MethodBind.get("Input", "is_emulating_touch_from_mouse", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Input.mb_is_emulating_touch_from_mouse, livePtr)
  }

}

object Input extends gdext.internal.input.InputOps {
  private[classes] var mb_is_anything_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_key_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_physical_key_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_key_label_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_mouse_button_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_joy_button_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_action_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_action_just_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_action_just_released: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_action_just_pressed_by_event: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_action_just_released_by_event: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action_raw_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vector: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_joy_mapping: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_joy_mapping: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_joy_known: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joy_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joy_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joy_guid: GDExtensionMethodBindPtr = null
  private[classes] var mb_should_ignore_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joy_vibration_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joy_vibration_duration: GDExtensionMethodBindPtr = null
  private[classes] var mb_start_joy_vibration: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop_joy_vibration: GDExtensionMethodBindPtr = null
  private[classes] var mb_vibrate_handheld: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_accelerometer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_magnetometer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gyroscope: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_accelerometer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_magnetometer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gyroscope: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joy_light: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_joy_light: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_last_mouse_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_last_mouse_screen_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mouse_button_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mouse_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mouse_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_warp_mouse: GDExtensionMethodBindPtr = null
  private[classes] var mb_action_press: GDExtensionMethodBindPtr = null
  private[classes] var mb_action_release: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_cursor_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_cursor_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_mouse_cursor: GDExtensionMethodBindPtr = null
  private[classes] var mb_parse_input_event: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_accumulated_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_accumulated_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_flush_buffered_events: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emulate_mouse_from_touch: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_emulating_mouse_from_touch: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emulate_touch_from_mouse: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_emulating_touch_from_mouse: GDExtensionMethodBindPtr = null

  private var instance: Input = null

  /** The process-global Input singleton instance. */
  def singleton: Input = {
    if (instance == null)
      instance = Wrappers.borrowed[Input](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("Input").ptr)))
    instance
  }

  /** Forwards to [[singleton]]: Input.is_anything_pressed */
  final def isAnythingPressed(): Boolean =
    singleton.isAnythingPressed()

  /** Forwards to [[singleton]]: Input.is_key_pressed */
  final def isKeyPressed(keycode: gdext.classes.Key): Boolean =
    singleton.isKeyPressed(keycode)

  /** Forwards to [[singleton]]: Input.is_physical_key_pressed */
  final def isPhysicalKeyPressed(keycode: gdext.classes.Key): Boolean =
    singleton.isPhysicalKeyPressed(keycode)

  /** Forwards to [[singleton]]: Input.is_key_label_pressed */
  final def isKeyLabelPressed(keycode: gdext.classes.Key): Boolean =
    singleton.isKeyLabelPressed(keycode)

  /** Forwards to [[singleton]]: Input.is_mouse_button_pressed */
  final def isMouseButtonPressed(button: gdext.classes.MouseButton): Boolean =
    singleton.isMouseButtonPressed(button)

  /** Forwards to [[singleton]]: Input.is_joy_button_pressed */
  final def isJoyButtonPressed(device: Long, button: gdext.classes.JoyButton): Boolean =
    singleton.isJoyButtonPressed(device, button)

  /** Forwards to [[singleton]]: Input.is_action_pressed */
  final def isActionPressed(action: String, exactMatch: Boolean = false): Boolean =
    singleton.isActionPressed(action, exactMatch)

  /** Forwards to [[singleton]]: Input.is_action_just_pressed */
  final def isActionJustPressed(action: String, exactMatch: Boolean = false): Boolean =
    singleton.isActionJustPressed(action, exactMatch)

  /** Forwards to [[singleton]]: Input.is_action_just_released */
  final def isActionJustReleased(action: String, exactMatch: Boolean = false): Boolean =
    singleton.isActionJustReleased(action, exactMatch)

  /** Forwards to [[singleton]]: Input.is_action_just_pressed_by_event */
  final def isActionJustPressedByEvent(action: String, event: InputEvent, exactMatch: Boolean = false): Boolean =
    singleton.isActionJustPressedByEvent(action, event, exactMatch)

  /** Forwards to [[singleton]]: Input.is_action_just_released_by_event */
  final def isActionJustReleasedByEvent(action: String, event: InputEvent, exactMatch: Boolean = false): Boolean =
    singleton.isActionJustReleasedByEvent(action, event, exactMatch)

  /** Forwards to [[singleton]]: Input.get_action_strength */
  final def getActionStrength(action: String, exactMatch: Boolean = false): Double =
    singleton.getActionStrength(action, exactMatch)

  /** Forwards to [[singleton]]: Input.get_action_raw_strength */
  final def getActionRawStrength(action: String, exactMatch: Boolean = false): Double =
    singleton.getActionRawStrength(action, exactMatch)

  /** Forwards to [[singleton]]: Input.get_axis */
  final def getAxis(negativeAction: String, positiveAction: String): Double =
    singleton.getAxis(negativeAction, positiveAction)

  /** Forwards to [[singleton]]: Input.get_vector */
  final def getVector(negativeX: String, positiveX: String, negativeY: String, positiveY: String, deadzone: Double = -1.0): gdext.builtin.Vector2 =
    singleton.getVector(negativeX, positiveX, negativeY, positiveY, deadzone)

  /** Forwards to [[singleton]]: Input.add_joy_mapping */
  final def addJoyMapping(mapping: String, updateExisting: Boolean = false): Unit =
    singleton.addJoyMapping(mapping, updateExisting)

  /** Forwards to [[singleton]]: Input.remove_joy_mapping */
  final def removeJoyMapping(guid: String): Unit =
    singleton.removeJoyMapping(guid)

  /** Forwards to [[singleton]]: Input.is_joy_known */
  final def isJoyKnown(device: Long): Boolean =
    singleton.isJoyKnown(device)

  /** Forwards to [[singleton]]: Input.get_joy_axis */
  final def getJoyAxis(device: Long, axis: gdext.classes.JoyAxis): Double =
    singleton.getJoyAxis(device, axis)

  /** Forwards to [[singleton]]: Input.get_joy_name */
  final def getJoyName(device: Long): String =
    singleton.getJoyName(device)

  /** Forwards to [[singleton]]: Input.get_joy_guid */
  final def getJoyGuid(device: Long): String =
    singleton.getJoyGuid(device)

  /** Forwards to [[singleton]]: Input.should_ignore_device */
  final def shouldIgnoreDevice(vendorId: Long, productId: Long): Boolean =
    singleton.shouldIgnoreDevice(vendorId, productId)

  /** Forwards to [[singleton]]: Input.get_joy_vibration_strength */
  final def getJoyVibrationStrength(device: Long): gdext.builtin.Vector2 =
    singleton.getJoyVibrationStrength(device)

  /** Forwards to [[singleton]]: Input.get_joy_vibration_duration */
  final def getJoyVibrationDuration(device: Long): Double =
    singleton.getJoyVibrationDuration(device)

  /** Forwards to [[singleton]]: Input.start_joy_vibration */
  final def startJoyVibration(device: Long, weakMagnitude: Double, strongMagnitude: Double, duration: Double = 0.0): Unit =
    singleton.startJoyVibration(device, weakMagnitude, strongMagnitude, duration)

  /** Forwards to [[singleton]]: Input.stop_joy_vibration */
  final def stopJoyVibration(device: Long): Unit =
    singleton.stopJoyVibration(device)

  /** Forwards to [[singleton]]: Input.vibrate_handheld */
  final def vibrateHandheld(durationMs: Long = 500L, amplitude: Double = -1.0): Unit =
    singleton.vibrateHandheld(durationMs, amplitude)

  /** Forwards to [[singleton]]: Input.get_gravity */
  final def getGravity(): gdext.builtin.Vector3 =
    singleton.getGravity()

  /** Forwards to [[singleton]]: Input.get_accelerometer */
  final def getAccelerometer(): gdext.builtin.Vector3 =
    singleton.getAccelerometer()

  /** Forwards to [[singleton]]: Input.get_magnetometer */
  final def getMagnetometer(): gdext.builtin.Vector3 =
    singleton.getMagnetometer()

  /** Forwards to [[singleton]]: Input.get_gyroscope */
  final def getGyroscope(): gdext.builtin.Vector3 =
    singleton.getGyroscope()

  /** Forwards to [[singleton]]: Input.set_gravity */
  final def setGravity(value: gdext.builtin.Vector3): Unit =
    singleton.setGravity(value)

  /** Forwards to [[singleton]]: Input.set_accelerometer */
  final def setAccelerometer(value: gdext.builtin.Vector3): Unit =
    singleton.setAccelerometer(value)

  /** Forwards to [[singleton]]: Input.set_magnetometer */
  final def setMagnetometer(value: gdext.builtin.Vector3): Unit =
    singleton.setMagnetometer(value)

  /** Forwards to [[singleton]]: Input.set_gyroscope */
  final def setGyroscope(value: gdext.builtin.Vector3): Unit =
    singleton.setGyroscope(value)

  /** Forwards to [[singleton]]: Input.set_joy_light */
  final def setJoyLight(device: Long, color: gdext.builtin.Color): Unit =
    singleton.setJoyLight(device, color)

  /** Forwards to [[singleton]]: Input.has_joy_light */
  final def hasJoyLight(device: Long): Boolean =
    singleton.hasJoyLight(device)

  /** Forwards to [[singleton]]: Input.get_last_mouse_velocity */
  final def getLastMouseVelocity(): gdext.builtin.Vector2 =
    singleton.getLastMouseVelocity()

  /** Forwards to [[singleton]]: Input.get_last_mouse_screen_velocity */
  final def getLastMouseScreenVelocity(): gdext.builtin.Vector2 =
    singleton.getLastMouseScreenVelocity()

  /** Forwards to [[singleton]]: Input.get_mouse_button_mask */
  final def getMouseButtonMask(): gdext.classes.MouseButtonMask =
    singleton.getMouseButtonMask()

  /** Forwards to [[singleton]]: Input.set_mouse_mode */
  final def setMouseMode(mode: gdext.classes.Input.MouseMode): Unit =
    singleton.setMouseMode(mode)

  /** Forwards to [[singleton]]: Input.get_mouse_mode */
  final def getMouseMode(): gdext.classes.Input.MouseMode =
    singleton.getMouseMode()

  /** Forwards to [[singleton]]: Input.warp_mouse */
  final def warpMouse(position: gdext.builtin.Vector2): Unit =
    singleton.warpMouse(position)

  /** Forwards to [[singleton]]: Input.action_press */
  final def actionPress(action: String, strength: Double = 1.0): Unit =
    singleton.actionPress(action, strength)

  /** Forwards to [[singleton]]: Input.action_release */
  final def actionRelease(action: String): Unit =
    singleton.actionRelease(action)

  /** Forwards to [[singleton]]: Input.set_default_cursor_shape */
  final def setDefaultCursorShape(shape: gdext.classes.Input.CursorShape = gdext.classes.Input.CursorShape(0L)): Unit =
    singleton.setDefaultCursorShape(shape)

  /** Forwards to [[singleton]]: Input.get_current_cursor_shape */
  final def getCurrentCursorShape(): gdext.classes.Input.CursorShape =
    singleton.getCurrentCursorShape()

  /** Forwards to [[singleton]]: Input.set_custom_mouse_cursor */
  final def setCustomMouseCursor(image: Resource, shape: gdext.classes.Input.CursorShape = gdext.classes.Input.CursorShape(0L), hotspot: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): Unit =
    singleton.setCustomMouseCursor(image, shape, hotspot)

  /** Forwards to [[singleton]]: Input.parse_input_event */
  final def parseInputEvent(event: InputEvent): Unit =
    singleton.parseInputEvent(event)

  /** Forwards to [[singleton]]: Input.set_use_accumulated_input */
  final def setUseAccumulatedInput(enable: Boolean): Unit =
    singleton.setUseAccumulatedInput(enable)

  /** Forwards to [[singleton]]: Input.is_using_accumulated_input */
  final def isUsingAccumulatedInput(): Boolean =
    singleton.isUsingAccumulatedInput()

  /** Forwards to [[singleton]]: Input.flush_buffered_events */
  final def flushBufferedEvents(): Unit =
    singleton.flushBufferedEvents()

  /** Forwards to [[singleton]]: Input.set_emulate_mouse_from_touch */
  final def setEmulateMouseFromTouch(enable: Boolean): Unit =
    singleton.setEmulateMouseFromTouch(enable)

  /** Forwards to [[singleton]]: Input.is_emulating_mouse_from_touch */
  final def isEmulatingMouseFromTouch(): Boolean =
    singleton.isEmulatingMouseFromTouch()

  /** Forwards to [[singleton]]: Input.set_emulate_touch_from_mouse */
  final def setEmulateTouchFromMouse(enable: Boolean): Unit =
    singleton.setEmulateTouchFromMouse(enable)

  /** Forwards to [[singleton]]: Input.is_emulating_touch_from_mouse */
  final def isEmulatingTouchFromMouse(): Boolean =
    singleton.isEmulatingTouchFromMouse()

  /** Godot enum `Input.MouseMode`. */
  opaque type MouseMode <: Long = Long

  object MouseMode {
    final val Visible: MouseMode = 0L.asInstanceOf[MouseMode]
    final val Hidden: MouseMode = 1L.asInstanceOf[MouseMode]
    final val Captured: MouseMode = 2L.asInstanceOf[MouseMode]
    final val Confined: MouseMode = 3L.asInstanceOf[MouseMode]
    final val ConfinedHidden: MouseMode = 4L.asInstanceOf[MouseMode]
    final val Max: MouseMode = 5L.asInstanceOf[MouseMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MouseMode = value.asInstanceOf[MouseMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MouseMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[MouseMode]]

    extension (self: MouseMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Visible"
        case 1L => "Hidden"
        case 2L => "Captured"
        case 3L => "Confined"
        case 4L => "ConfinedHidden"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `Input.CursorShape`. */
  opaque type CursorShape <: Long = Long

  object CursorShape {
    final val Arrow: CursorShape = 0L.asInstanceOf[CursorShape]
    final val Ibeam: CursorShape = 1L.asInstanceOf[CursorShape]
    final val PointingHand: CursorShape = 2L.asInstanceOf[CursorShape]
    final val Cross: CursorShape = 3L.asInstanceOf[CursorShape]
    final val Wait: CursorShape = 4L.asInstanceOf[CursorShape]
    final val Busy: CursorShape = 5L.asInstanceOf[CursorShape]
    final val Drag: CursorShape = 6L.asInstanceOf[CursorShape]
    final val CanDrop: CursorShape = 7L.asInstanceOf[CursorShape]
    final val Forbidden: CursorShape = 8L.asInstanceOf[CursorShape]
    final val Vsize: CursorShape = 9L.asInstanceOf[CursorShape]
    final val Hsize: CursorShape = 10L.asInstanceOf[CursorShape]
    final val Bdiagsize: CursorShape = 11L.asInstanceOf[CursorShape]
    final val Fdiagsize: CursorShape = 12L.asInstanceOf[CursorShape]
    final val Move: CursorShape = 13L.asInstanceOf[CursorShape]
    final val Vsplit: CursorShape = 14L.asInstanceOf[CursorShape]
    final val Hsplit: CursorShape = 15L.asInstanceOf[CursorShape]
    final val Help: CursorShape = 16L.asInstanceOf[CursorShape]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CursorShape = value.asInstanceOf[CursorShape]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CursorShape] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L).asInstanceOf[scala.IArray[CursorShape]]

    extension (self: CursorShape)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Arrow"
        case 1L => "Ibeam"
        case 2L => "PointingHand"
        case 3L => "Cross"
        case 4L => "Wait"
        case 5L => "Busy"
        case 6L => "Drag"
        case 7L => "CanDrop"
        case 8L => "Forbidden"
        case 9L => "Vsize"
        case 10L => "Hsize"
        case 11L => "Bdiagsize"
        case 12L => "Fdiagsize"
        case 13L => "Move"
        case 14L => "Vsplit"
        case 15L => "Hsplit"
        case 16L => "Help"
        case other => other.toString
      }
  }
}
