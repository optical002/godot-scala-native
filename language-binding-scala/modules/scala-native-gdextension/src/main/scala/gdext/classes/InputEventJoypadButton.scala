package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventJoypadButton`, extends `InputEvent`. */
abstract class InputEventJoypadButton extends InputEvent {

  /** InputEventJoypadButton.set_button_index */
  final def setButtonIndex(button_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventJoypadButton", "set_button_index", 1466368136L), hostObject.objectPtr, button_index)

  /** InputEventJoypadButton.get_button_index */
  final def getButtonIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventJoypadButton", "get_button_index", 595588182L), hostObject.objectPtr)

  /** InputEventJoypadButton.set_pressure */
  final def setPressure(pressure: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventJoypadButton", "set_pressure", 373806689L), hostObject.objectPtr, pressure)

  /** InputEventJoypadButton.get_pressure */
  final def getPressure(): Double =
    Ptrcall.call0[Double](MethodBind.get("InputEventJoypadButton", "get_pressure", 1740695150L), hostObject.objectPtr)

  /** InputEventJoypadButton.set_pressed */
  final def setPressed(pressed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventJoypadButton", "set_pressed", 2586408642L), hostObject.objectPtr, pressed)

}

object InputEventJoypadButton {
  /** Class metadata for Gd[InputEventJoypadButton] lifetime management and casting. */
  given GodotClass[InputEventJoypadButton] with {
    def className = "InputEventJoypadButton"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEventJoypadButton = new InputEventJoypadButton {}.withHost(o.objectPtr)
    def unwrap(t: InputEventJoypadButton): GodotObject = t.hostObject
  }
}
