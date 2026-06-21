package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RetargetModifier3D`, extends `SkeletonModifier3D`. */
abstract class RetargetModifier3D extends SkeletonModifier3D {

  /** RetargetModifier3D.set_profile */
  final def setProfile(profile: SkeletonProfile): Unit =
    Ptrcall.callVoid1(MethodBind.get("RetargetModifier3D", "set_profile", 3870374136L), hostObject.objectPtr, profile.hostObject)

  /** RetargetModifier3D.get_profile */
  final def getProfile(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RetargetModifier3D", "get_profile", 4291782652L), hostObject.objectPtr)

  /** RetargetModifier3D.set_use_global_pose */
  final def setUseGlobalPose(use_global_pose: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RetargetModifier3D", "set_use_global_pose", 2586408642L), hostObject.objectPtr, use_global_pose)

  /** RetargetModifier3D.is_using_global_pose */
  final def isUsingGlobalPose(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RetargetModifier3D", "is_using_global_pose", 36873697L), hostObject.objectPtr)

  /** RetargetModifier3D.set_enable_flags */
  final def setEnableFlags(enable_flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RetargetModifier3D", "set_enable_flags", 2687954213L), hostObject.objectPtr, enable_flags)

  /** RetargetModifier3D.get_enable_flags */
  final def getEnableFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("RetargetModifier3D", "get_enable_flags", 358995420L), hostObject.objectPtr)

  /** RetargetModifier3D.set_position_enabled */
  final def setPositionEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RetargetModifier3D", "set_position_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** RetargetModifier3D.is_position_enabled */
  final def isPositionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RetargetModifier3D", "is_position_enabled", 36873697L), hostObject.objectPtr)

  /** RetargetModifier3D.set_rotation_enabled */
  final def setRotationEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RetargetModifier3D", "set_rotation_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** RetargetModifier3D.is_rotation_enabled */
  final def isRotationEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RetargetModifier3D", "is_rotation_enabled", 36873697L), hostObject.objectPtr)

  /** RetargetModifier3D.set_scale_enabled */
  final def setScaleEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RetargetModifier3D", "set_scale_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** RetargetModifier3D.is_scale_enabled */
  final def isScaleEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RetargetModifier3D", "is_scale_enabled", 36873697L), hostObject.objectPtr)

}

object RetargetModifier3D {
  /** Class metadata for Gd[RetargetModifier3D] lifetime management and casting. */
  given GodotClass[RetargetModifier3D] with {
    def className = "RetargetModifier3D"
    def isRefCounted = false
    def wrap(o: GodotObject): RetargetModifier3D = new RetargetModifier3D {}.withHost(o.objectPtr)
    def unwrap(t: RetargetModifier3D): GodotObject = t.hostObject
  }
}
