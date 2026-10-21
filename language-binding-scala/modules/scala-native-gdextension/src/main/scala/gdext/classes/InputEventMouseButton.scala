package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventMouseButton`, extends `InputEventMouse`. */
abstract class InputEventMouseButton extends InputEventMouse {
  override def godotClassName: String = "InputEventMouseButton"

  /** InputEventMouseButton.set_factor */
  final def setFactor(factor: Double): Unit = {
    if (gdext.classes.InputEventMouseButton.mb_set_factor == null) gdext.classes.InputEventMouseButton.mb_set_factor = MethodBind.get("InputEventMouseButton", "set_factor", 373806689L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouseButton.mb_set_factor, livePtr, factor)
  }

  /** InputEventMouseButton.get_factor */
  final def getFactor(): Double = {
    if (gdext.classes.InputEventMouseButton.mb_get_factor == null) gdext.classes.InputEventMouseButton.mb_get_factor = MethodBind.get("InputEventMouseButton", "get_factor", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.InputEventMouseButton.mb_get_factor, livePtr)
  }

  /** InputEventMouseButton.set_button_index */
  final def setButtonIndex(button_index: Long): Unit = {
    if (gdext.classes.InputEventMouseButton.mb_set_button_index == null) gdext.classes.InputEventMouseButton.mb_set_button_index = MethodBind.get("InputEventMouseButton", "set_button_index", 3624991109L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouseButton.mb_set_button_index, livePtr, button_index)
  }

  /** InputEventMouseButton.get_button_index */
  final def getButtonIndex(): Long = {
    if (gdext.classes.InputEventMouseButton.mb_get_button_index == null) gdext.classes.InputEventMouseButton.mb_get_button_index = MethodBind.get("InputEventMouseButton", "get_button_index", 1132662608L)
    Ptrcall.call0[Long](gdext.classes.InputEventMouseButton.mb_get_button_index, livePtr)
  }

  /** InputEventMouseButton.set_pressed */
  final def setPressed(pressed: Boolean): Unit = {
    if (gdext.classes.InputEventMouseButton.mb_set_pressed == null) gdext.classes.InputEventMouseButton.mb_set_pressed = MethodBind.get("InputEventMouseButton", "set_pressed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouseButton.mb_set_pressed, livePtr, pressed)
  }

  /** InputEventMouseButton.set_canceled */
  final def setCanceled(canceled: Boolean): Unit = {
    if (gdext.classes.InputEventMouseButton.mb_set_canceled == null) gdext.classes.InputEventMouseButton.mb_set_canceled = MethodBind.get("InputEventMouseButton", "set_canceled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouseButton.mb_set_canceled, livePtr, canceled)
  }

  /** InputEventMouseButton.set_double_click */
  final def setDoubleClick(double_click: Boolean): Unit = {
    if (gdext.classes.InputEventMouseButton.mb_set_double_click == null) gdext.classes.InputEventMouseButton.mb_set_double_click = MethodBind.get("InputEventMouseButton", "set_double_click", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouseButton.mb_set_double_click, livePtr, double_click)
  }

  /** InputEventMouseButton.is_double_click */
  final def isDoubleClick(): Boolean = {
    if (gdext.classes.InputEventMouseButton.mb_is_double_click == null) gdext.classes.InputEventMouseButton.mb_is_double_click = MethodBind.get("InputEventMouseButton", "is_double_click", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEventMouseButton.mb_is_double_click, livePtr)
  }

}

object InputEventMouseButton {
  private[classes] var mb_set_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_button_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_button_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_canceled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_double_click: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_double_click: GDExtensionMethodBindPtr = null
}
