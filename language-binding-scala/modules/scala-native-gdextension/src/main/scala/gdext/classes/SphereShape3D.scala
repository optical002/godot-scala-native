package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SphereShape3D`, extends `Shape3D`. */
abstract class SphereShape3D extends Shape3D {
  override def godotClassName: String = "SphereShape3D"

  /** SphereShape3D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.SphereShape3D.mb_set_radius == null) gdext.classes.SphereShape3D.mb_set_radius = MethodBind.get("SphereShape3D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SphereShape3D.mb_set_radius, livePtr, radius)
  }

  /** SphereShape3D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.SphereShape3D.mb_get_radius == null) gdext.classes.SphereShape3D.mb_get_radius = MethodBind.get("SphereShape3D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SphereShape3D.mb_get_radius, livePtr)
  }

}

object SphereShape3D {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
}
