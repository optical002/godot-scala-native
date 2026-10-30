package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventJoypadButton`, extends `InputEvent`. */
abstract class InputEventJoypadButton extends InputEvent {
  override def godotClassName: String = "InputEventJoypadButton"

  /** InputEventJoypadButton.set_button_index */
  final def setButtonIndex(buttonIndex: gdext.classes.JoyButton): Unit = {
    if (gdext.classes.InputEventJoypadButton.mb_set_button_index == null) gdext.classes.InputEventJoypadButton.mb_set_button_index = MethodBind.get("InputEventJoypadButton", "set_button_index", 1466368136L)
    Ptrcall.callVoid1(gdext.classes.InputEventJoypadButton.mb_set_button_index, livePtr, buttonIndex)
  }

  /** InputEventJoypadButton.get_button_index */
  final def getButtonIndex(): gdext.classes.JoyButton = {
    if (gdext.classes.InputEventJoypadButton.mb_get_button_index == null) gdext.classes.InputEventJoypadButton.mb_get_button_index = MethodBind.get("InputEventJoypadButton", "get_button_index", 595588182L)
    gdext.classes.JoyButton(Ptrcall.call0[Long](gdext.classes.InputEventJoypadButton.mb_get_button_index, livePtr))
  }

  /** InputEventJoypadButton.set_pressure */
  final def setPressure(pressure: Double): Unit = {
    if (gdext.classes.InputEventJoypadButton.mb_set_pressure == null) gdext.classes.InputEventJoypadButton.mb_set_pressure = MethodBind.get("InputEventJoypadButton", "set_pressure", 373806689L)
    Ptrcall.callVoid1(gdext.classes.InputEventJoypadButton.mb_set_pressure, livePtr, pressure)
  }

  /** InputEventJoypadButton.get_pressure */
  final def getPressure(): Double = {
    if (gdext.classes.InputEventJoypadButton.mb_get_pressure == null) gdext.classes.InputEventJoypadButton.mb_get_pressure = MethodBind.get("InputEventJoypadButton", "get_pressure", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.InputEventJoypadButton.mb_get_pressure, livePtr)
  }

  /** InputEventJoypadButton.set_pressed */
  final def setPressed(pressed: Boolean): Unit = {
    if (gdext.classes.InputEventJoypadButton.mb_set_pressed == null) gdext.classes.InputEventJoypadButton.mb_set_pressed = MethodBind.get("InputEventJoypadButton", "set_pressed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventJoypadButton.mb_set_pressed, livePtr, pressed)
  }

}

object InputEventJoypadButton {
  private[classes] var mb_set_button_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_button_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pressure: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pressure: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pressed: GDExtensionMethodBindPtr = null
}
