package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SphereOccluder3D`, extends `Occluder3D`. */
abstract class SphereOccluder3D extends Occluder3D {

  /** SphereOccluder3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SphereOccluder3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** SphereOccluder3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("SphereOccluder3D", "get_radius", 1740695150L), hostObject.objectPtr)

}

object SphereOccluder3D {
  /** Class metadata for Gd[SphereOccluder3D] lifetime management and casting. */
  given GodotClass[SphereOccluder3D] with {
    def className = "SphereOccluder3D"
    def isRefCounted = true
    def wrap(o: GodotObject): SphereOccluder3D = new SphereOccluder3D {}.withHost(o.objectPtr)
    def unwrap(t: SphereOccluder3D): GodotObject = t.hostObject
  }
}
