package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SphereShape3D`, extends `Shape3D`. */
abstract class SphereShape3D extends Shape3D {
  override def godotClassName: String = "SphereShape3D"

  /** SphereShape3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SphereShape3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** SphereShape3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("SphereShape3D", "get_radius", 1740695150L), hostObject.objectPtr)

}
