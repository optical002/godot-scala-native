package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventMagnifyGesture`, extends `InputEventGesture`. */
abstract class InputEventMagnifyGesture extends InputEventGesture {

  /** InputEventMagnifyGesture.set_factor */
  final def setFactor(factor: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMagnifyGesture", "set_factor", 373806689L), hostObject.objectPtr, factor)

  /** InputEventMagnifyGesture.get_factor */
  final def getFactor(): Double =
    Ptrcall.call0[Double](MethodBind.get("InputEventMagnifyGesture", "get_factor", 1740695150L), hostObject.objectPtr)

}

object InputEventMagnifyGesture {
  /** Class metadata for Gd[InputEventMagnifyGesture] lifetime management and casting. */
  given GodotClass[InputEventMagnifyGesture] with {
    def className = "InputEventMagnifyGesture"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEventMagnifyGesture = new InputEventMagnifyGesture {}.withHost(o.objectPtr)
    def unwrap(t: InputEventMagnifyGesture): GodotObject = t.hostObject
  }
}
