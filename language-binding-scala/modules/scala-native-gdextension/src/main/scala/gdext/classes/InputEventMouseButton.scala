package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventMouseButton`, extends `InputEventMouse`. */
abstract class InputEventMouseButton extends InputEventMouse {

  /** InputEventMouseButton.set_factor */
  final def setFactor(factor: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouseButton", "set_factor", 373806689L), hostObject.objectPtr, factor)

  /** InputEventMouseButton.get_factor */
  final def getFactor(): Double =
    Ptrcall.call0[Double](MethodBind.get("InputEventMouseButton", "get_factor", 1740695150L), hostObject.objectPtr)

  /** InputEventMouseButton.set_button_index */
  final def setButtonIndex(button_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouseButton", "set_button_index", 3624991109L), hostObject.objectPtr, button_index)

  /** InputEventMouseButton.get_button_index */
  final def getButtonIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventMouseButton", "get_button_index", 1132662608L), hostObject.objectPtr)

  /** InputEventMouseButton.set_pressed */
  final def setPressed(pressed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouseButton", "set_pressed", 2586408642L), hostObject.objectPtr, pressed)

  /** InputEventMouseButton.set_canceled */
  final def setCanceled(canceled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouseButton", "set_canceled", 2586408642L), hostObject.objectPtr, canceled)

  /** InputEventMouseButton.set_double_click */
  final def setDoubleClick(double_click: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouseButton", "set_double_click", 2586408642L), hostObject.objectPtr, double_click)

  /** InputEventMouseButton.is_double_click */
  final def isDoubleClick(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEventMouseButton", "is_double_click", 36873697L), hostObject.objectPtr)

}

object InputEventMouseButton {
  /** Class metadata for Gd[InputEventMouseButton] lifetime management and casting. */
  given GodotClass[InputEventMouseButton] with {
    def className = "InputEventMouseButton"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEventMouseButton = new InputEventMouseButton {}.withHost(o.objectPtr)
    def unwrap(t: InputEventMouseButton): GodotObject = t.hostObject
  }
}
