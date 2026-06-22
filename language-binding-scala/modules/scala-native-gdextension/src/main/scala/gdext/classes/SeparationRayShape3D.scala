package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SeparationRayShape3D`, extends `Shape3D`. */
abstract class SeparationRayShape3D extends Shape3D {

  /** SeparationRayShape3D.set_length */
  final def setLength(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SeparationRayShape3D", "set_length", 373806689L), hostObject.objectPtr, length)

  /** SeparationRayShape3D.get_length */
  final def getLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("SeparationRayShape3D", "get_length", 1740695150L), hostObject.objectPtr)

  /** SeparationRayShape3D.set_slide_on_slope */
  final def setSlideOnSlope(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SeparationRayShape3D", "set_slide_on_slope", 2586408642L), hostObject.objectPtr, active)

  /** SeparationRayShape3D.get_slide_on_slope */
  final def getSlideOnSlope(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SeparationRayShape3D", "get_slide_on_slope", 36873697L), hostObject.objectPtr)

}

object SeparationRayShape3D {
  /** Class metadata for Gd[SeparationRayShape3D] lifetime management and casting. */
  given GodotClass[SeparationRayShape3D] with {
    def className = "SeparationRayShape3D"
    def isRefCounted = true
    def wrap(o: GodotObject): SeparationRayShape3D = new SeparationRayShape3D {}.withHost(o.objectPtr)
    def unwrap(t: SeparationRayShape3D): GodotObject = t.hostObject
  }
}
