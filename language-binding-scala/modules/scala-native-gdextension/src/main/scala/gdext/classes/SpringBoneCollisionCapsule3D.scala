package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SpringBoneCollisionCapsule3D`, extends `SpringBoneCollision3D`. */
abstract class SpringBoneCollisionCapsule3D extends SpringBoneCollision3D {
  override def godotClassName: String = "SpringBoneCollisionCapsule3D"

  /** SpringBoneCollisionCapsule3D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.SpringBoneCollisionCapsule3D.mb_set_radius == null) gdext.classes.SpringBoneCollisionCapsule3D.mb_set_radius = MethodBind.get("SpringBoneCollisionCapsule3D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneCollisionCapsule3D.mb_set_radius, livePtr, radius)
  }

  /** SpringBoneCollisionCapsule3D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.SpringBoneCollisionCapsule3D.mb_get_radius == null) gdext.classes.SpringBoneCollisionCapsule3D.mb_get_radius = MethodBind.get("SpringBoneCollisionCapsule3D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SpringBoneCollisionCapsule3D.mb_get_radius, livePtr)
  }

  /** SpringBoneCollisionCapsule3D.set_height */
  final def setHeight(height: Double): Unit = {
    if (gdext.classes.SpringBoneCollisionCapsule3D.mb_set_height == null) gdext.classes.SpringBoneCollisionCapsule3D.mb_set_height = MethodBind.get("SpringBoneCollisionCapsule3D", "set_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneCollisionCapsule3D.mb_set_height, livePtr, height)
  }

  /** SpringBoneCollisionCapsule3D.get_height */
  final def getHeight(): Double = {
    if (gdext.classes.SpringBoneCollisionCapsule3D.mb_get_height == null) gdext.classes.SpringBoneCollisionCapsule3D.mb_get_height = MethodBind.get("SpringBoneCollisionCapsule3D", "get_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SpringBoneCollisionCapsule3D.mb_get_height, livePtr)
  }

  /** SpringBoneCollisionCapsule3D.set_mid_height */
  final def setMidHeight(mid_height: Double): Unit = {
    if (gdext.classes.SpringBoneCollisionCapsule3D.mb_set_mid_height == null) gdext.classes.SpringBoneCollisionCapsule3D.mb_set_mid_height = MethodBind.get("SpringBoneCollisionCapsule3D", "set_mid_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneCollisionCapsule3D.mb_set_mid_height, livePtr, mid_height)
  }

  /** SpringBoneCollisionCapsule3D.get_mid_height */
  final def getMidHeight(): Double = {
    if (gdext.classes.SpringBoneCollisionCapsule3D.mb_get_mid_height == null) gdext.classes.SpringBoneCollisionCapsule3D.mb_get_mid_height = MethodBind.get("SpringBoneCollisionCapsule3D", "get_mid_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SpringBoneCollisionCapsule3D.mb_get_mid_height, livePtr)
  }

  /** SpringBoneCollisionCapsule3D.set_inside */
  final def setInside(enabled: Boolean): Unit = {
    if (gdext.classes.SpringBoneCollisionCapsule3D.mb_set_inside == null) gdext.classes.SpringBoneCollisionCapsule3D.mb_set_inside = MethodBind.get("SpringBoneCollisionCapsule3D", "set_inside", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneCollisionCapsule3D.mb_set_inside, livePtr, enabled)
  }

  /** SpringBoneCollisionCapsule3D.is_inside */
  final def isInside(): Boolean = {
    if (gdext.classes.SpringBoneCollisionCapsule3D.mb_is_inside == null) gdext.classes.SpringBoneCollisionCapsule3D.mb_is_inside = MethodBind.get("SpringBoneCollisionCapsule3D", "is_inside", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SpringBoneCollisionCapsule3D.mb_is_inside, livePtr)
  }

}

object SpringBoneCollisionCapsule3D {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mid_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mid_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_inside: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_inside: GDExtensionMethodBindPtr = null
}
