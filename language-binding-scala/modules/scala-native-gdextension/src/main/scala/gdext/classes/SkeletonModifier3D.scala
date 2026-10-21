package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonModifier3D`, extends `Node3D`. */
abstract class SkeletonModifier3D extends Node3D {
  override def godotClassName: String = "SkeletonModifier3D"

  /** SkeletonModifier3D.get_skeleton */
  final def getSkeleton(): Skeleton3D = {
    if (gdext.classes.SkeletonModifier3D.mb_get_skeleton == null) gdext.classes.SkeletonModifier3D.mb_get_skeleton = MethodBind.get("SkeletonModifier3D", "get_skeleton", 1488626673L)
    Wrappers.borrowed[Skeleton3D](Ptrcall.call0[Long](gdext.classes.SkeletonModifier3D.mb_get_skeleton, livePtr))
  }

  /** SkeletonModifier3D.set_active */
  final def setActive(active: Boolean): Unit = {
    if (gdext.classes.SkeletonModifier3D.mb_set_active == null) gdext.classes.SkeletonModifier3D.mb_set_active = MethodBind.get("SkeletonModifier3D", "set_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModifier3D.mb_set_active, livePtr, active)
  }

  /** SkeletonModifier3D.is_active */
  final def isActive(): Boolean = {
    if (gdext.classes.SkeletonModifier3D.mb_is_active == null) gdext.classes.SkeletonModifier3D.mb_is_active = MethodBind.get("SkeletonModifier3D", "is_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonModifier3D.mb_is_active, livePtr)
  }

  /** SkeletonModifier3D.set_influence */
  final def setInfluence(influence: Double): Unit = {
    if (gdext.classes.SkeletonModifier3D.mb_set_influence == null) gdext.classes.SkeletonModifier3D.mb_set_influence = MethodBind.get("SkeletonModifier3D", "set_influence", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModifier3D.mb_set_influence, livePtr, influence)
  }

  /** SkeletonModifier3D.get_influence */
  final def getInfluence(): Double = {
    if (gdext.classes.SkeletonModifier3D.mb_get_influence == null) gdext.classes.SkeletonModifier3D.mb_get_influence = MethodBind.get("SkeletonModifier3D", "get_influence", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SkeletonModifier3D.mb_get_influence, livePtr)
  }

}

object SkeletonModifier3D {
  private[classes] var mb_get_skeleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_influence: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_influence: GDExtensionMethodBindPtr = null
}
