package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RetargetModifier3D`, extends `SkeletonModifier3D`. */
abstract class RetargetModifier3D extends SkeletonModifier3D {
  override def godotClassName: String = "RetargetModifier3D"

  /** RetargetModifier3D.set_profile */
  final def setProfile(profile: SkeletonProfile): Unit = {
    if (gdext.classes.RetargetModifier3D.mb_set_profile == null) gdext.classes.RetargetModifier3D.mb_set_profile = MethodBind.get("RetargetModifier3D", "set_profile", 3870374136L)
    Ptrcall.callVoid1(gdext.classes.RetargetModifier3D.mb_set_profile, livePtr, Wrappers.handle(profile))
  }

  /** RetargetModifier3D.get_profile. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getProfile(): SkeletonProfile = {
    if (gdext.classes.RetargetModifier3D.mb_get_profile == null) gdext.classes.RetargetModifier3D.mb_get_profile = MethodBind.get("RetargetModifier3D", "get_profile", 4291782652L)
    Wrappers.owned[SkeletonProfile](Ptrcall.call0[Long](gdext.classes.RetargetModifier3D.mb_get_profile, livePtr))
  }

  /** RetargetModifier3D.set_use_global_pose */
  final def setUseGlobalPose(use_global_pose: Boolean): Unit = {
    if (gdext.classes.RetargetModifier3D.mb_set_use_global_pose == null) gdext.classes.RetargetModifier3D.mb_set_use_global_pose = MethodBind.get("RetargetModifier3D", "set_use_global_pose", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RetargetModifier3D.mb_set_use_global_pose, livePtr, use_global_pose)
  }

  /** RetargetModifier3D.is_using_global_pose */
  final def isUsingGlobalPose(): Boolean = {
    if (gdext.classes.RetargetModifier3D.mb_is_using_global_pose == null) gdext.classes.RetargetModifier3D.mb_is_using_global_pose = MethodBind.get("RetargetModifier3D", "is_using_global_pose", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RetargetModifier3D.mb_is_using_global_pose, livePtr)
  }

  /** RetargetModifier3D.set_enable_flags */
  final def setEnableFlags(enable_flags: Long): Unit = {
    if (gdext.classes.RetargetModifier3D.mb_set_enable_flags == null) gdext.classes.RetargetModifier3D.mb_set_enable_flags = MethodBind.get("RetargetModifier3D", "set_enable_flags", 2687954213L)
    Ptrcall.callVoid1(gdext.classes.RetargetModifier3D.mb_set_enable_flags, livePtr, enable_flags)
  }

  /** RetargetModifier3D.get_enable_flags */
  final def getEnableFlags(): Long = {
    if (gdext.classes.RetargetModifier3D.mb_get_enable_flags == null) gdext.classes.RetargetModifier3D.mb_get_enable_flags = MethodBind.get("RetargetModifier3D", "get_enable_flags", 358995420L)
    Ptrcall.call0[Long](gdext.classes.RetargetModifier3D.mb_get_enable_flags, livePtr)
  }

  /** RetargetModifier3D.set_position_enabled */
  final def setPositionEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.RetargetModifier3D.mb_set_position_enabled == null) gdext.classes.RetargetModifier3D.mb_set_position_enabled = MethodBind.get("RetargetModifier3D", "set_position_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RetargetModifier3D.mb_set_position_enabled, livePtr, enabled)
  }

  /** RetargetModifier3D.is_position_enabled */
  final def isPositionEnabled(): Boolean = {
    if (gdext.classes.RetargetModifier3D.mb_is_position_enabled == null) gdext.classes.RetargetModifier3D.mb_is_position_enabled = MethodBind.get("RetargetModifier3D", "is_position_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RetargetModifier3D.mb_is_position_enabled, livePtr)
  }

  /** RetargetModifier3D.set_rotation_enabled */
  final def setRotationEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.RetargetModifier3D.mb_set_rotation_enabled == null) gdext.classes.RetargetModifier3D.mb_set_rotation_enabled = MethodBind.get("RetargetModifier3D", "set_rotation_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RetargetModifier3D.mb_set_rotation_enabled, livePtr, enabled)
  }

  /** RetargetModifier3D.is_rotation_enabled */
  final def isRotationEnabled(): Boolean = {
    if (gdext.classes.RetargetModifier3D.mb_is_rotation_enabled == null) gdext.classes.RetargetModifier3D.mb_is_rotation_enabled = MethodBind.get("RetargetModifier3D", "is_rotation_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RetargetModifier3D.mb_is_rotation_enabled, livePtr)
  }

  /** RetargetModifier3D.set_scale_enabled */
  final def setScaleEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.RetargetModifier3D.mb_set_scale_enabled == null) gdext.classes.RetargetModifier3D.mb_set_scale_enabled = MethodBind.get("RetargetModifier3D", "set_scale_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RetargetModifier3D.mb_set_scale_enabled, livePtr, enabled)
  }

  /** RetargetModifier3D.is_scale_enabled */
  final def isScaleEnabled(): Boolean = {
    if (gdext.classes.RetargetModifier3D.mb_is_scale_enabled == null) gdext.classes.RetargetModifier3D.mb_is_scale_enabled = MethodBind.get("RetargetModifier3D", "is_scale_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RetargetModifier3D.mb_is_scale_enabled, livePtr)
  }

}

object RetargetModifier3D {
  private[classes] var mb_set_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_global_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_global_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_position_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_rotation_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scale_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scale_enabled: GDExtensionMethodBindPtr = null
}
