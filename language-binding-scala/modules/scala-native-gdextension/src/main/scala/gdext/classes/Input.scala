package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Input`, extends `Object`. */
abstract class Input extends Object {
  override def godotClassName: String = "Input"

  /** Input.is_anything_pressed */
  final def isAnythingPressed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Input", "is_anything_pressed", 36873697L), hostObject.objectPtr)

  /** Input.is_key_pressed */
  final def isKeyPressed(keycode: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Input", "is_key_pressed", 1938909964L), hostObject.objectPtr, keycode)

  /** Input.is_physical_key_pressed */
  final def isPhysicalKeyPressed(keycode: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Input", "is_physical_key_pressed", 1938909964L), hostObject.objectPtr, keycode)

  /** Input.is_key_label_pressed */
  final def isKeyLabelPressed(keycode: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Input", "is_key_label_pressed", 1938909964L), hostObject.objectPtr, keycode)

  /** Input.is_mouse_button_pressed */
  final def isMouseButtonPressed(button: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Input", "is_mouse_button_pressed", 1821097125L), hostObject.objectPtr, button)

  /** Input.is_joy_button_pressed */
  final def isJoyButtonPressed(device: Long, button: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("Input", "is_joy_button_pressed", 787208542L), hostObject.objectPtr, device, button)

  /** Input.is_action_pressed */
  final def isActionPressed(action: gdext.builtin.StringName, exact_match: Boolean): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, Boolean, Boolean](MethodBind.get("Input", "is_action_pressed", 1558498928L), hostObject.objectPtr, action, exact_match)

  /** Input.is_action_just_pressed */
  final def isActionJustPressed(action: gdext.builtin.StringName, exact_match: Boolean): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, Boolean, Boolean](MethodBind.get("Input", "is_action_just_pressed", 1558498928L), hostObject.objectPtr, action, exact_match)

  /** Input.is_action_just_released */
  final def isActionJustReleased(action: gdext.builtin.StringName, exact_match: Boolean): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, Boolean, Boolean](MethodBind.get("Input", "is_action_just_released", 1558498928L), hostObject.objectPtr, action, exact_match)

  /** Input.is_action_just_pressed_by_event */
  final def isActionJustPressedByEvent(action: gdext.builtin.StringName, event: InputEvent, exact_match: Boolean): Boolean =
    Ptrcall.call3[gdext.builtin.StringName, GodotObject, Boolean, Boolean](MethodBind.get("Input", "is_action_just_pressed_by_event", 551972873L), hostObject.objectPtr, action, event.hostObject, exact_match)

  /** Input.is_action_just_released_by_event */
  final def isActionJustReleasedByEvent(action: gdext.builtin.StringName, event: InputEvent, exact_match: Boolean): Boolean =
    Ptrcall.call3[gdext.builtin.StringName, GodotObject, Boolean, Boolean](MethodBind.get("Input", "is_action_just_released_by_event", 551972873L), hostObject.objectPtr, action, event.hostObject, exact_match)

  /** Input.get_action_strength */
  final def getActionStrength(action: gdext.builtin.StringName, exact_match: Boolean): Double =
    Ptrcall.call2[gdext.builtin.StringName, Boolean, Double](MethodBind.get("Input", "get_action_strength", 801543509L), hostObject.objectPtr, action, exact_match)

  /** Input.get_action_raw_strength */
  final def getActionRawStrength(action: gdext.builtin.StringName, exact_match: Boolean): Double =
    Ptrcall.call2[gdext.builtin.StringName, Boolean, Double](MethodBind.get("Input", "get_action_raw_strength", 801543509L), hostObject.objectPtr, action, exact_match)

  /** Input.get_axis */
  final def getAxis(negative_action: gdext.builtin.StringName, positive_action: gdext.builtin.StringName): Double =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Double](MethodBind.get("Input", "get_axis", 1958752504L), hostObject.objectPtr, negative_action, positive_action)

  /** Input.get_vector */
  final def getVector(negative_x: gdext.builtin.StringName, positive_x: gdext.builtin.StringName, negative_y: gdext.builtin.StringName, positive_y: gdext.builtin.StringName, deadzone: Double): gdext.builtin.Vector2 =
    Ptrcall.call5[gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.StringName, Double, gdext.builtin.Vector2](MethodBind.get("Input", "get_vector", 2479607902L), hostObject.objectPtr, negative_x, positive_x, negative_y, positive_y, deadzone)

  /** Input.add_joy_mapping */
  final def addJoyMapping(mapping: String, update_existing: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Input", "add_joy_mapping", 1168363258L), hostObject.objectPtr, mapping, update_existing)

  /** Input.remove_joy_mapping */
  final def removeJoyMapping(guid: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "remove_joy_mapping", 83702148L), hostObject.objectPtr, guid)

  /** Input.is_joy_known */
  final def isJoyKnown(device: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Input", "is_joy_known", 3067735520L), hostObject.objectPtr, device)

  /** Input.get_joy_axis */
  final def getJoyAxis(device: Long, axis: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("Input", "get_joy_axis", 4063175957L), hostObject.objectPtr, device, axis)

  /** Input.get_joy_name */
  final def getJoyName(device: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("Input", "get_joy_name", 990163283L), hostObject.objectPtr, device)

  /** Input.get_joy_guid */
  final def getJoyGuid(device: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("Input", "get_joy_guid", 844755477L), hostObject.objectPtr, device)

  /** Input.should_ignore_device */
  final def shouldIgnoreDevice(vendor_id: Long, product_id: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("Input", "should_ignore_device", 2522259332L), hostObject.objectPtr, vendor_id, product_id)

  /** Input.get_joy_vibration_strength */
  final def getJoyVibrationStrength(device: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("Input", "get_joy_vibration_strength", 3114997196L), hostObject.objectPtr, device)

  /** Input.get_joy_vibration_duration */
  final def getJoyVibrationDuration(device: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Input", "get_joy_vibration_duration", 4025615559L), hostObject.objectPtr, device)

  /** Input.start_joy_vibration */
  final def startJoyVibration(device: Long, weak_magnitude: Double, strong_magnitude: Double, duration: Double): Unit =
    Ptrcall.callVoid4(MethodBind.get("Input", "start_joy_vibration", 2576575033L), hostObject.objectPtr, device, weak_magnitude, strong_magnitude, duration)

  /** Input.stop_joy_vibration */
  final def stopJoyVibration(device: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "stop_joy_vibration", 1286410249L), hostObject.objectPtr, device)

  /** Input.vibrate_handheld */
  final def vibrateHandheld(duration_ms: Long, amplitude: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Input", "vibrate_handheld", 544894297L), hostObject.objectPtr, duration_ms, amplitude)

  /** Input.get_gravity */
  final def getGravity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Input", "get_gravity", 3360562783L), hostObject.objectPtr)

  /** Input.get_accelerometer */
  final def getAccelerometer(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Input", "get_accelerometer", 3360562783L), hostObject.objectPtr)

  /** Input.get_magnetometer */
  final def getMagnetometer(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Input", "get_magnetometer", 3360562783L), hostObject.objectPtr)

  /** Input.get_gyroscope */
  final def getGyroscope(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Input", "get_gyroscope", 3360562783L), hostObject.objectPtr)

  /** Input.set_gravity */
  final def setGravity(value: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "set_gravity", 3460891852L), hostObject.objectPtr, value)

  /** Input.set_accelerometer */
  final def setAccelerometer(value: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "set_accelerometer", 3460891852L), hostObject.objectPtr, value)

  /** Input.set_magnetometer */
  final def setMagnetometer(value: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "set_magnetometer", 3460891852L), hostObject.objectPtr, value)

  /** Input.set_gyroscope */
  final def setGyroscope(value: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "set_gyroscope", 3460891852L), hostObject.objectPtr, value)

  /** Input.set_joy_light */
  final def setJoyLight(device: Long, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("Input", "set_joy_light", 2878471219L), hostObject.objectPtr, device, color)

  /** Input.has_joy_light */
  final def hasJoyLight(device: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Input", "has_joy_light", 1116898809L), hostObject.objectPtr, device)

  /** Input.get_last_mouse_velocity */
  final def getLastMouseVelocity(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Input", "get_last_mouse_velocity", 1497962370L), hostObject.objectPtr)

  /** Input.get_last_mouse_screen_velocity */
  final def getLastMouseScreenVelocity(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Input", "get_last_mouse_screen_velocity", 1497962370L), hostObject.objectPtr)

  /** Input.get_mouse_button_mask */
  final def getMouseButtonMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("Input", "get_mouse_button_mask", 2512161324L), hostObject.objectPtr)

  /** Input.set_mouse_mode */
  final def setMouseMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "set_mouse_mode", 2228490894L), hostObject.objectPtr, mode)

  /** Input.get_mouse_mode */
  final def getMouseMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Input", "get_mouse_mode", 965286182L), hostObject.objectPtr)

  /** Input.warp_mouse */
  final def warpMouse(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "warp_mouse", 743155724L), hostObject.objectPtr, position)

  /** Input.action_press */
  final def actionPress(action: gdext.builtin.StringName, strength: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Input", "action_press", 1713091165L), hostObject.objectPtr, action, strength)

  /** Input.action_release */
  final def actionRelease(action: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "action_release", 3304788590L), hostObject.objectPtr, action)

  /** Input.set_default_cursor_shape */
  final def setDefaultCursorShape(shape: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "set_default_cursor_shape", 2124816902L), hostObject.objectPtr, shape)

  /** Input.get_current_cursor_shape */
  final def getCurrentCursorShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("Input", "get_current_cursor_shape", 3455658929L), hostObject.objectPtr)

  /** Input.set_custom_mouse_cursor */
  final def setCustomMouseCursor(image: Resource, shape: Long, hotspot: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid3(MethodBind.get("Input", "set_custom_mouse_cursor", 703945977L), hostObject.objectPtr, image.hostObject, shape, hotspot)

  /** Input.parse_input_event */
  final def parseInputEvent(event: InputEvent): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "parse_input_event", 3754044979L), hostObject.objectPtr, event.hostObject)

  /** Input.set_use_accumulated_input */
  final def setUseAccumulatedInput(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "set_use_accumulated_input", 2586408642L), hostObject.objectPtr, enable)

  /** Input.is_using_accumulated_input */
  final def isUsingAccumulatedInput(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Input", "is_using_accumulated_input", 2240911060L), hostObject.objectPtr)

  /** Input.flush_buffered_events */
  final def flushBufferedEvents(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Input", "flush_buffered_events", 3218959716L), hostObject.objectPtr)

  /** Input.set_emulate_mouse_from_touch */
  final def setEmulateMouseFromTouch(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "set_emulate_mouse_from_touch", 2586408642L), hostObject.objectPtr, enable)

  /** Input.is_emulating_mouse_from_touch */
  final def isEmulatingMouseFromTouch(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Input", "is_emulating_mouse_from_touch", 36873697L), hostObject.objectPtr)

  /** Input.set_emulate_touch_from_mouse */
  final def setEmulateTouchFromMouse(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Input", "set_emulate_touch_from_mouse", 2586408642L), hostObject.objectPtr, enable)

  /** Input.is_emulating_touch_from_mouse */
  final def isEmulatingTouchFromMouse(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Input", "is_emulating_touch_from_mouse", 36873697L), hostObject.objectPtr)

}

object Input {
  /** The process-global Input singleton instance. */
  def singleton: Input = new Input {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("Input").ptr))
}
