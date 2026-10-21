package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventKey`, extends `InputEventWithModifiers`. */
abstract class InputEventKey extends InputEventWithModifiers {
  override def godotClassName: String = "InputEventKey"

  /** InputEventKey.set_pressed */
  final def setPressed(pressed: Boolean): Unit = {
    if (gdext.classes.InputEventKey.mb_set_pressed == null) gdext.classes.InputEventKey.mb_set_pressed = MethodBind.get("InputEventKey", "set_pressed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventKey.mb_set_pressed, livePtr, pressed)
  }

  /** InputEventKey.set_keycode */
  final def setKeycode(keycode: Long): Unit = {
    if (gdext.classes.InputEventKey.mb_set_keycode == null) gdext.classes.InputEventKey.mb_set_keycode = MethodBind.get("InputEventKey", "set_keycode", 888074362L)
    Ptrcall.callVoid1(gdext.classes.InputEventKey.mb_set_keycode, livePtr, keycode)
  }

  /** InputEventKey.get_keycode */
  final def getKeycode(): Long = {
    if (gdext.classes.InputEventKey.mb_get_keycode == null) gdext.classes.InputEventKey.mb_get_keycode = MethodBind.get("InputEventKey", "get_keycode", 1585896689L)
    Ptrcall.call0[Long](gdext.classes.InputEventKey.mb_get_keycode, livePtr)
  }

  /** InputEventKey.set_physical_keycode */
  final def setPhysicalKeycode(physical_keycode: Long): Unit = {
    if (gdext.classes.InputEventKey.mb_set_physical_keycode == null) gdext.classes.InputEventKey.mb_set_physical_keycode = MethodBind.get("InputEventKey", "set_physical_keycode", 888074362L)
    Ptrcall.callVoid1(gdext.classes.InputEventKey.mb_set_physical_keycode, livePtr, physical_keycode)
  }

  /** InputEventKey.get_physical_keycode */
  final def getPhysicalKeycode(): Long = {
    if (gdext.classes.InputEventKey.mb_get_physical_keycode == null) gdext.classes.InputEventKey.mb_get_physical_keycode = MethodBind.get("InputEventKey", "get_physical_keycode", 1585896689L)
    Ptrcall.call0[Long](gdext.classes.InputEventKey.mb_get_physical_keycode, livePtr)
  }

  /** InputEventKey.set_key_label */
  final def setKeyLabel(key_label: Long): Unit = {
    if (gdext.classes.InputEventKey.mb_set_key_label == null) gdext.classes.InputEventKey.mb_set_key_label = MethodBind.get("InputEventKey", "set_key_label", 888074362L)
    Ptrcall.callVoid1(gdext.classes.InputEventKey.mb_set_key_label, livePtr, key_label)
  }

  /** InputEventKey.get_key_label */
  final def getKeyLabel(): Long = {
    if (gdext.classes.InputEventKey.mb_get_key_label == null) gdext.classes.InputEventKey.mb_get_key_label = MethodBind.get("InputEventKey", "get_key_label", 1585896689L)
    Ptrcall.call0[Long](gdext.classes.InputEventKey.mb_get_key_label, livePtr)
  }

  /** InputEventKey.set_unicode */
  final def setUnicode(unicode: Long): Unit = {
    if (gdext.classes.InputEventKey.mb_set_unicode == null) gdext.classes.InputEventKey.mb_set_unicode = MethodBind.get("InputEventKey", "set_unicode", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.InputEventKey.mb_set_unicode, livePtr, unicode)
  }

  /** InputEventKey.get_unicode */
  final def getUnicode(): Long = {
    if (gdext.classes.InputEventKey.mb_get_unicode == null) gdext.classes.InputEventKey.mb_get_unicode = MethodBind.get("InputEventKey", "get_unicode", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.InputEventKey.mb_get_unicode, livePtr)
  }

  /** InputEventKey.set_location */
  final def setLocation(location: Long): Unit = {
    if (gdext.classes.InputEventKey.mb_set_location == null) gdext.classes.InputEventKey.mb_set_location = MethodBind.get("InputEventKey", "set_location", 634453155L)
    Ptrcall.callVoid1(gdext.classes.InputEventKey.mb_set_location, livePtr, location)
  }

  /** InputEventKey.get_location */
  final def getLocation(): Long = {
    if (gdext.classes.InputEventKey.mb_get_location == null) gdext.classes.InputEventKey.mb_get_location = MethodBind.get("InputEventKey", "get_location", 211810873L)
    Ptrcall.call0[Long](gdext.classes.InputEventKey.mb_get_location, livePtr)
  }

  /** InputEventKey.set_echo */
  final def setEcho(echo: Boolean): Unit = {
    if (gdext.classes.InputEventKey.mb_set_echo == null) gdext.classes.InputEventKey.mb_set_echo = MethodBind.get("InputEventKey", "set_echo", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventKey.mb_set_echo, livePtr, echo)
  }

  /** InputEventKey.get_keycode_with_modifiers */
  final def getKeycodeWithModifiers(): Long = {
    if (gdext.classes.InputEventKey.mb_get_keycode_with_modifiers == null) gdext.classes.InputEventKey.mb_get_keycode_with_modifiers = MethodBind.get("InputEventKey", "get_keycode_with_modifiers", 1585896689L)
    Ptrcall.call0[Long](gdext.classes.InputEventKey.mb_get_keycode_with_modifiers, livePtr)
  }

  /** InputEventKey.get_physical_keycode_with_modifiers */
  final def getPhysicalKeycodeWithModifiers(): Long = {
    if (gdext.classes.InputEventKey.mb_get_physical_keycode_with_modifiers == null) gdext.classes.InputEventKey.mb_get_physical_keycode_with_modifiers = MethodBind.get("InputEventKey", "get_physical_keycode_with_modifiers", 1585896689L)
    Ptrcall.call0[Long](gdext.classes.InputEventKey.mb_get_physical_keycode_with_modifiers, livePtr)
  }

  /** InputEventKey.get_key_label_with_modifiers */
  final def getKeyLabelWithModifiers(): Long = {
    if (gdext.classes.InputEventKey.mb_get_key_label_with_modifiers == null) gdext.classes.InputEventKey.mb_get_key_label_with_modifiers = MethodBind.get("InputEventKey", "get_key_label_with_modifiers", 1585896689L)
    Ptrcall.call0[Long](gdext.classes.InputEventKey.mb_get_key_label_with_modifiers, livePtr)
  }

  /** InputEventKey.as_text_keycode */
  final def asTextKeycode(): String = {
    if (gdext.classes.InputEventKey.mb_as_text_keycode == null) gdext.classes.InputEventKey.mb_as_text_keycode = MethodBind.get("InputEventKey", "as_text_keycode", 201670096L)
    Ptrcall.call0[String](gdext.classes.InputEventKey.mb_as_text_keycode, livePtr)
  }

  /** InputEventKey.as_text_physical_keycode */
  final def asTextPhysicalKeycode(): String = {
    if (gdext.classes.InputEventKey.mb_as_text_physical_keycode == null) gdext.classes.InputEventKey.mb_as_text_physical_keycode = MethodBind.get("InputEventKey", "as_text_physical_keycode", 201670096L)
    Ptrcall.call0[String](gdext.classes.InputEventKey.mb_as_text_physical_keycode, livePtr)
  }

  /** InputEventKey.as_text_key_label */
  final def asTextKeyLabel(): String = {
    if (gdext.classes.InputEventKey.mb_as_text_key_label == null) gdext.classes.InputEventKey.mb_as_text_key_label = MethodBind.get("InputEventKey", "as_text_key_label", 201670096L)
    Ptrcall.call0[String](gdext.classes.InputEventKey.mb_as_text_key_label, livePtr)
  }

  /** InputEventKey.as_text_location */
  final def asTextLocation(): String = {
    if (gdext.classes.InputEventKey.mb_as_text_location == null) gdext.classes.InputEventKey.mb_as_text_location = MethodBind.get("InputEventKey", "as_text_location", 201670096L)
    Ptrcall.call0[String](gdext.classes.InputEventKey.mb_as_text_location, livePtr)
  }

}

object InputEventKey {
  private[classes] var mb_set_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keycode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_keycode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physical_keycode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physical_keycode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_key_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_key_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_unicode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_unicode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_location: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_location: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_echo: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_keycode_with_modifiers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physical_keycode_with_modifiers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_key_label_with_modifiers: GDExtensionMethodBindPtr = null
  private[classes] var mb_as_text_keycode: GDExtensionMethodBindPtr = null
  private[classes] var mb_as_text_physical_keycode: GDExtensionMethodBindPtr = null
  private[classes] var mb_as_text_key_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_as_text_location: GDExtensionMethodBindPtr = null
}
