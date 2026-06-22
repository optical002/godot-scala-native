package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SeparationRayShape2D`, extends `Shape2D`. */
abstract class SeparationRayShape2D extends Shape2D {

  /** SeparationRayShape2D.set_length */
  final def setLength(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SeparationRayShape2D", "set_length", 373806689L), hostObject.objectPtr, length)

  /** SeparationRayShape2D.get_length */
  final def getLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("SeparationRayShape2D", "get_length", 1740695150L), hostObject.objectPtr)

  /** SeparationRayShape2D.set_slide_on_slope */
  final def setSlideOnSlope(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SeparationRayShape2D", "set_slide_on_slope", 2586408642L), hostObject.objectPtr, active)

  /** SeparationRayShape2D.get_slide_on_slope */
  final def getSlideOnSlope(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SeparationRayShape2D", "get_slide_on_slope", 36873697L), hostObject.objectPtr)

}

object SeparationRayShape2D {
  /** Class metadata for Gd[SeparationRayShape2D] lifetime management and casting. */
  given GodotClass[SeparationRayShape2D] with {
    def className = "SeparationRayShape2D"
    def isRefCounted = true
    def wrap(o: GodotObject): SeparationRayShape2D = new SeparationRayShape2D {}.withHost(o.objectPtr)
    def unwrap(t: SeparationRayShape2D): GodotObject = t.hostObject
  }
}
