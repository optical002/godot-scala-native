package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventWithModifiers`, extends `InputEventFromWindow`. */
abstract class InputEventWithModifiers extends InputEventFromWindow {
  override def godotClassName: String = "InputEventWithModifiers"

  /** InputEventWithModifiers.set_command_or_control_autoremap */
  final def setCommandOrControlAutoremap(enable: Boolean): Unit = {
    if (gdext.classes.InputEventWithModifiers.mb_set_command_or_control_autoremap == null) gdext.classes.InputEventWithModifiers.mb_set_command_or_control_autoremap = MethodBind.get("InputEventWithModifiers", "set_command_or_control_autoremap", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventWithModifiers.mb_set_command_or_control_autoremap, livePtr, enable)
  }

  /** InputEventWithModifiers.is_command_or_control_autoremap */
  final def isCommandOrControlAutoremap(): Boolean = {
    if (gdext.classes.InputEventWithModifiers.mb_is_command_or_control_autoremap == null) gdext.classes.InputEventWithModifiers.mb_is_command_or_control_autoremap = MethodBind.get("InputEventWithModifiers", "is_command_or_control_autoremap", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEventWithModifiers.mb_is_command_or_control_autoremap, livePtr)
  }

  /** InputEventWithModifiers.is_command_or_control_pressed */
  final def isCommandOrControlPressed(): Boolean = {
    if (gdext.classes.InputEventWithModifiers.mb_is_command_or_control_pressed == null) gdext.classes.InputEventWithModifiers.mb_is_command_or_control_pressed = MethodBind.get("InputEventWithModifiers", "is_command_or_control_pressed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEventWithModifiers.mb_is_command_or_control_pressed, livePtr)
  }

  /** InputEventWithModifiers.set_alt_pressed */
  final def setAltPressed(pressed: Boolean): Unit = {
    if (gdext.classes.InputEventWithModifiers.mb_set_alt_pressed == null) gdext.classes.InputEventWithModifiers.mb_set_alt_pressed = MethodBind.get("InputEventWithModifiers", "set_alt_pressed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventWithModifiers.mb_set_alt_pressed, livePtr, pressed)
  }

  /** InputEventWithModifiers.is_alt_pressed */
  final def isAltPressed(): Boolean = {
    if (gdext.classes.InputEventWithModifiers.mb_is_alt_pressed == null) gdext.classes.InputEventWithModifiers.mb_is_alt_pressed = MethodBind.get("InputEventWithModifiers", "is_alt_pressed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEventWithModifiers.mb_is_alt_pressed, livePtr)
  }

  /** InputEventWithModifiers.set_shift_pressed */
  final def setShiftPressed(pressed: Boolean): Unit = {
    if (gdext.classes.InputEventWithModifiers.mb_set_shift_pressed == null) gdext.classes.InputEventWithModifiers.mb_set_shift_pressed = MethodBind.get("InputEventWithModifiers", "set_shift_pressed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventWithModifiers.mb_set_shift_pressed, livePtr, pressed)
  }

  /** InputEventWithModifiers.is_shift_pressed */
  final def isShiftPressed(): Boolean = {
    if (gdext.classes.InputEventWithModifiers.mb_is_shift_pressed == null) gdext.classes.InputEventWithModifiers.mb_is_shift_pressed = MethodBind.get("InputEventWithModifiers", "is_shift_pressed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEventWithModifiers.mb_is_shift_pressed, livePtr)
  }

  /** InputEventWithModifiers.set_ctrl_pressed */
  final def setCtrlPressed(pressed: Boolean): Unit = {
    if (gdext.classes.InputEventWithModifiers.mb_set_ctrl_pressed == null) gdext.classes.InputEventWithModifiers.mb_set_ctrl_pressed = MethodBind.get("InputEventWithModifiers", "set_ctrl_pressed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventWithModifiers.mb_set_ctrl_pressed, livePtr, pressed)
  }

  /** InputEventWithModifiers.is_ctrl_pressed */
  final def isCtrlPressed(): Boolean = {
    if (gdext.classes.InputEventWithModifiers.mb_is_ctrl_pressed == null) gdext.classes.InputEventWithModifiers.mb_is_ctrl_pressed = MethodBind.get("InputEventWithModifiers", "is_ctrl_pressed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEventWithModifiers.mb_is_ctrl_pressed, livePtr)
  }

  /** InputEventWithModifiers.set_meta_pressed */
  final def setMetaPressed(pressed: Boolean): Unit = {
    if (gdext.classes.InputEventWithModifiers.mb_set_meta_pressed == null) gdext.classes.InputEventWithModifiers.mb_set_meta_pressed = MethodBind.get("InputEventWithModifiers", "set_meta_pressed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventWithModifiers.mb_set_meta_pressed, livePtr, pressed)
  }

  /** InputEventWithModifiers.is_meta_pressed */
  final def isMetaPressed(): Boolean = {
    if (gdext.classes.InputEventWithModifiers.mb_is_meta_pressed == null) gdext.classes.InputEventWithModifiers.mb_is_meta_pressed = MethodBind.get("InputEventWithModifiers", "is_meta_pressed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEventWithModifiers.mb_is_meta_pressed, livePtr)
  }

  /** InputEventWithModifiers.get_modifiers_mask */
  final def getModifiersMask(): gdext.classes.KeyModifierMask = {
    if (gdext.classes.InputEventWithModifiers.mb_get_modifiers_mask == null) gdext.classes.InputEventWithModifiers.mb_get_modifiers_mask = MethodBind.get("InputEventWithModifiers", "get_modifiers_mask", 1258259499L)
    gdext.classes.KeyModifierMask(Ptrcall.call0[Long](gdext.classes.InputEventWithModifiers.mb_get_modifiers_mask, livePtr))
  }

}

object InputEventWithModifiers {
  private[classes] var mb_set_command_or_control_autoremap: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_command_or_control_autoremap: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_command_or_control_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alt_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_alt_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shift_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_shift_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ctrl_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ctrl_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_meta_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_meta_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_modifiers_mask: GDExtensionMethodBindPtr = null
}
