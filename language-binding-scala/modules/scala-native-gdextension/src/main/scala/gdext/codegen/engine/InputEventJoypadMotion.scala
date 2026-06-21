package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventJoypadMotion`, extends `InputEvent`. */
abstract class InputEventJoypadMotion extends InputEvent {

  /** InputEventJoypadMotion.set_axis */
  final def setAxis(axis: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventJoypadMotion", "set_axis", 1332685170L), hostObject.objectPtr, axis)

  /** InputEventJoypadMotion.get_axis */
  final def getAxis(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventJoypadMotion", "get_axis", 4019121683L), hostObject.objectPtr)

  /** InputEventJoypadMotion.set_axis_value */
  final def setAxisValue(axis_value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventJoypadMotion", "set_axis_value", 373806689L), hostObject.objectPtr, axis_value)

  /** InputEventJoypadMotion.get_axis_value */
  final def getAxisValue(): Double =
    Ptrcall.call0[Double](MethodBind.get("InputEventJoypadMotion", "get_axis_value", 1740695150L), hostObject.objectPtr)

}

object InputEventJoypadMotion {
  /** Class metadata for Gd[InputEventJoypadMotion] lifetime management and casting. */
  given GodotClass[InputEventJoypadMotion] with {
    def className = "InputEventJoypadMotion"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEventJoypadMotion = new InputEventJoypadMotion {}.withHost(o.objectPtr)
    def unwrap(t: InputEventJoypadMotion): GodotObject = t.hostObject
  }
}
