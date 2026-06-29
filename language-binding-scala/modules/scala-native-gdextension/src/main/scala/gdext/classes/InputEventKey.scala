package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventKey`, extends `InputEventWithModifiers`. */
abstract class InputEventKey extends InputEventWithModifiers {
  override def godotClassName: String = "InputEventKey"

  /** InputEventKey.set_pressed */
  final def setPressed(pressed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventKey", "set_pressed", 2586408642L), hostObject.objectPtr, pressed)

  /** InputEventKey.set_keycode */
  final def setKeycode(keycode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventKey", "set_keycode", 888074362L), hostObject.objectPtr, keycode)

  /** InputEventKey.get_keycode */
  final def getKeycode(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventKey", "get_keycode", 1585896689L), hostObject.objectPtr)

  /** InputEventKey.set_physical_keycode */
  final def setPhysicalKeycode(physical_keycode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventKey", "set_physical_keycode", 888074362L), hostObject.objectPtr, physical_keycode)

  /** InputEventKey.get_physical_keycode */
  final def getPhysicalKeycode(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventKey", "get_physical_keycode", 1585896689L), hostObject.objectPtr)

  /** InputEventKey.set_key_label */
  final def setKeyLabel(key_label: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventKey", "set_key_label", 888074362L), hostObject.objectPtr, key_label)

  /** InputEventKey.get_key_label */
  final def getKeyLabel(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventKey", "get_key_label", 1585896689L), hostObject.objectPtr)

  /** InputEventKey.set_unicode */
  final def setUnicode(unicode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventKey", "set_unicode", 1286410249L), hostObject.objectPtr, unicode)

  /** InputEventKey.get_unicode */
  final def getUnicode(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventKey", "get_unicode", 3905245786L), hostObject.objectPtr)

  /** InputEventKey.set_location */
  final def setLocation(location: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventKey", "set_location", 634453155L), hostObject.objectPtr, location)

  /** InputEventKey.get_location */
  final def getLocation(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventKey", "get_location", 211810873L), hostObject.objectPtr)

  /** InputEventKey.set_echo */
  final def setEcho(echo: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventKey", "set_echo", 2586408642L), hostObject.objectPtr, echo)

  /** InputEventKey.get_keycode_with_modifiers */
  final def getKeycodeWithModifiers(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventKey", "get_keycode_with_modifiers", 1585896689L), hostObject.objectPtr)

  /** InputEventKey.get_physical_keycode_with_modifiers */
  final def getPhysicalKeycodeWithModifiers(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventKey", "get_physical_keycode_with_modifiers", 1585896689L), hostObject.objectPtr)

  /** InputEventKey.get_key_label_with_modifiers */
  final def getKeyLabelWithModifiers(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventKey", "get_key_label_with_modifiers", 1585896689L), hostObject.objectPtr)

  /** InputEventKey.as_text_keycode */
  final def asTextKeycode(): String =
    Ptrcall.call0[String](MethodBind.get("InputEventKey", "as_text_keycode", 201670096L), hostObject.objectPtr)

  /** InputEventKey.as_text_physical_keycode */
  final def asTextPhysicalKeycode(): String =
    Ptrcall.call0[String](MethodBind.get("InputEventKey", "as_text_physical_keycode", 201670096L), hostObject.objectPtr)

  /** InputEventKey.as_text_key_label */
  final def asTextKeyLabel(): String =
    Ptrcall.call0[String](MethodBind.get("InputEventKey", "as_text_key_label", 201670096L), hostObject.objectPtr)

  /** InputEventKey.as_text_location */
  final def asTextLocation(): String =
    Ptrcall.call0[String](MethodBind.get("InputEventKey", "as_text_location", 201670096L), hostObject.objectPtr)

}
