package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventMouse`, extends `InputEventWithModifiers`. */
abstract class InputEventMouse extends InputEventWithModifiers {
  override def godotClassName: String = "InputEventMouse"

  /** InputEventMouse.set_button_mask */
  final def setButtonMask(button_mask: Long): Unit = {
    if (gdext.classes.InputEventMouse.mb_set_button_mask == null) gdext.classes.InputEventMouse.mb_set_button_mask = MethodBind.get("InputEventMouse", "set_button_mask", 3950145251L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouse.mb_set_button_mask, livePtr, button_mask)
  }

  /** InputEventMouse.get_button_mask */
  final def getButtonMask(): Long = {
    if (gdext.classes.InputEventMouse.mb_get_button_mask == null) gdext.classes.InputEventMouse.mb_get_button_mask = MethodBind.get("InputEventMouse", "get_button_mask", 2512161324L)
    Ptrcall.call0[Long](gdext.classes.InputEventMouse.mb_get_button_mask, livePtr)
  }

  /** InputEventMouse.set_position */
  final def setPosition(position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventMouse.mb_set_position == null) gdext.classes.InputEventMouse.mb_set_position = MethodBind.get("InputEventMouse", "set_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouse.mb_set_position, livePtr, position)
  }

  /** InputEventMouse.get_position */
  final def getPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventMouse.mb_get_position == null) gdext.classes.InputEventMouse.mb_get_position = MethodBind.get("InputEventMouse", "get_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventMouse.mb_get_position, livePtr)
  }

  /** InputEventMouse.set_global_position */
  final def setGlobalPosition(global_position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventMouse.mb_set_global_position == null) gdext.classes.InputEventMouse.mb_set_global_position = MethodBind.get("InputEventMouse", "set_global_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouse.mb_set_global_position, livePtr, global_position)
  }

  /** InputEventMouse.get_global_position */
  final def getGlobalPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventMouse.mb_get_global_position == null) gdext.classes.InputEventMouse.mb_get_global_position = MethodBind.get("InputEventMouse", "get_global_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventMouse.mb_get_global_position, livePtr)
  }

}

object InputEventMouse {
  private[classes] var mb_set_button_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_button_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_position: GDExtensionMethodBindPtr = null
}
