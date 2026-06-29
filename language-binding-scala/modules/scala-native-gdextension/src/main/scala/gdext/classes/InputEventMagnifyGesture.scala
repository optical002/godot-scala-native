package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventMagnifyGesture`, extends `InputEventGesture`. */
abstract class InputEventMagnifyGesture extends InputEventGesture {
  override def godotClassName: String = "InputEventMagnifyGesture"

  /** InputEventMagnifyGesture.set_factor */
  final def setFactor(factor: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMagnifyGesture", "set_factor", 373806689L), hostObject.objectPtr, factor)

  /** InputEventMagnifyGesture.get_factor */
  final def getFactor(): Double =
    Ptrcall.call0[Double](MethodBind.get("InputEventMagnifyGesture", "get_factor", 1740695150L), hostObject.objectPtr)

}
