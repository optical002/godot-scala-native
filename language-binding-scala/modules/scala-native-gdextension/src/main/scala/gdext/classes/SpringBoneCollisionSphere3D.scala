package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SpringBoneCollisionSphere3D`, extends `SpringBoneCollision3D`. */
abstract class SpringBoneCollisionSphere3D extends SpringBoneCollision3D {
  override def godotClassName: String = "SpringBoneCollisionSphere3D"

  /** SpringBoneCollisionSphere3D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.SpringBoneCollisionSphere3D.mb_set_radius == null) gdext.classes.SpringBoneCollisionSphere3D.mb_set_radius = MethodBind.get("SpringBoneCollisionSphere3D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneCollisionSphere3D.mb_set_radius, livePtr, radius)
  }

  /** SpringBoneCollisionSphere3D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.SpringBoneCollisionSphere3D.mb_get_radius == null) gdext.classes.SpringBoneCollisionSphere3D.mb_get_radius = MethodBind.get("SpringBoneCollisionSphere3D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SpringBoneCollisionSphere3D.mb_get_radius, livePtr)
  }

  /** SpringBoneCollisionSphere3D.set_inside */
  final def setInside(enabled: Boolean): Unit = {
    if (gdext.classes.SpringBoneCollisionSphere3D.mb_set_inside == null) gdext.classes.SpringBoneCollisionSphere3D.mb_set_inside = MethodBind.get("SpringBoneCollisionSphere3D", "set_inside", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneCollisionSphere3D.mb_set_inside, livePtr, enabled)
  }

  /** SpringBoneCollisionSphere3D.is_inside */
  final def isInside(): Boolean = {
    if (gdext.classes.SpringBoneCollisionSphere3D.mb_is_inside == null) gdext.classes.SpringBoneCollisionSphere3D.mb_is_inside = MethodBind.get("SpringBoneCollisionSphere3D", "is_inside", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SpringBoneCollisionSphere3D.mb_is_inside, livePtr)
  }

}

object SpringBoneCollisionSphere3D {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_inside: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_inside: GDExtensionMethodBindPtr = null
}
