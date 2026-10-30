package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SphereOccluder3D`, extends `Occluder3D`. */
abstract class SphereOccluder3D extends Occluder3D {
  override def godotClassName: String = "SphereOccluder3D"

  /** SphereOccluder3D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.SphereOccluder3D.mb_set_radius == null) gdext.classes.SphereOccluder3D.mb_set_radius = MethodBind.get("SphereOccluder3D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SphereOccluder3D.mb_set_radius, livePtr, radius)
  }

  /** SphereOccluder3D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.SphereOccluder3D.mb_get_radius == null) gdext.classes.SphereOccluder3D.mb_get_radius = MethodBind.get("SphereOccluder3D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SphereOccluder3D.mb_get_radius, livePtr)
  }

}

object SphereOccluder3D {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
}
