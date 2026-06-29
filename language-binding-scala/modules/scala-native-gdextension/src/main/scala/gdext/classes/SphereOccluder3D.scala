package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SphereOccluder3D`, extends `Occluder3D`. */
abstract class SphereOccluder3D extends Occluder3D {
  override def godotClassName: String = "SphereOccluder3D"

  /** SphereOccluder3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SphereOccluder3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** SphereOccluder3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("SphereOccluder3D", "get_radius", 1740695150L), hostObject.objectPtr)

}
