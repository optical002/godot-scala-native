package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsTestMotionParameters2D`, extends `RefCounted`. */
abstract class PhysicsTestMotionParameters2D extends RefCounted {
  override def godotClassName: String = "PhysicsTestMotionParameters2D"

  /** PhysicsTestMotionParameters2D.get_from */
  final def getFrom(): gdext.builtin.Transform2D = {
    if (gdext.classes.PhysicsTestMotionParameters2D.mb_get_from == null) gdext.classes.PhysicsTestMotionParameters2D.mb_get_from = MethodBind.get("PhysicsTestMotionParameters2D", "get_from", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.PhysicsTestMotionParameters2D.mb_get_from, livePtr)
  }

  /** PhysicsTestMotionParameters2D.set_from */
  final def setFrom(from: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.PhysicsTestMotionParameters2D.mb_set_from == null) gdext.classes.PhysicsTestMotionParameters2D.mb_set_from = MethodBind.get("PhysicsTestMotionParameters2D", "set_from", 2761652528L)
    Ptrcall.callVoid1(gdext.classes.PhysicsTestMotionParameters2D.mb_set_from, livePtr, from)
  }

  /** PhysicsTestMotionParameters2D.get_motion */
  final def getMotion(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsTestMotionParameters2D.mb_get_motion == null) gdext.classes.PhysicsTestMotionParameters2D.mb_get_motion = MethodBind.get("PhysicsTestMotionParameters2D", "get_motion", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsTestMotionParameters2D.mb_get_motion, livePtr)
  }

  /** PhysicsTestMotionParameters2D.set_motion */
  final def setMotion(motion: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.PhysicsTestMotionParameters2D.mb_set_motion == null) gdext.classes.PhysicsTestMotionParameters2D.mb_set_motion = MethodBind.get("PhysicsTestMotionParameters2D", "set_motion", 743155724L)
    Ptrcall.callVoid1(gdext.classes.PhysicsTestMotionParameters2D.mb_set_motion, livePtr, motion)
  }

  /** PhysicsTestMotionParameters2D.get_margin */
  final def getMargin(): Double = {
    if (gdext.classes.PhysicsTestMotionParameters2D.mb_get_margin == null) gdext.classes.PhysicsTestMotionParameters2D.mb_get_margin = MethodBind.get("PhysicsTestMotionParameters2D", "get_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsTestMotionParameters2D.mb_get_margin, livePtr)
  }

  /** PhysicsTestMotionParameters2D.set_margin */
  final def setMargin(margin: Double): Unit = {
    if (gdext.classes.PhysicsTestMotionParameters2D.mb_set_margin == null) gdext.classes.PhysicsTestMotionParameters2D.mb_set_margin = MethodBind.get("PhysicsTestMotionParameters2D", "set_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicsTestMotionParameters2D.mb_set_margin, livePtr, margin)
  }

  /** PhysicsTestMotionParameters2D.is_collide_separation_ray_enabled */
  final def isCollideSeparationRayEnabled(): Boolean = {
    if (gdext.classes.PhysicsTestMotionParameters2D.mb_is_collide_separation_ray_enabled == null) gdext.classes.PhysicsTestMotionParameters2D.mb_is_collide_separation_ray_enabled = MethodBind.get("PhysicsTestMotionParameters2D", "is_collide_separation_ray_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsTestMotionParameters2D.mb_is_collide_separation_ray_enabled, livePtr)
  }

  /** PhysicsTestMotionParameters2D.set_collide_separation_ray_enabled */
  final def setCollideSeparationRayEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.PhysicsTestMotionParameters2D.mb_set_collide_separation_ray_enabled == null) gdext.classes.PhysicsTestMotionParameters2D.mb_set_collide_separation_ray_enabled = MethodBind.get("PhysicsTestMotionParameters2D", "set_collide_separation_ray_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsTestMotionParameters2D.mb_set_collide_separation_ray_enabled, livePtr, enabled)
  }

  /** PhysicsTestMotionParameters2D.is_recovery_as_collision_enabled */
  final def isRecoveryAsCollisionEnabled(): Boolean = {
    if (gdext.classes.PhysicsTestMotionParameters2D.mb_is_recovery_as_collision_enabled == null) gdext.classes.PhysicsTestMotionParameters2D.mb_is_recovery_as_collision_enabled = MethodBind.get("PhysicsTestMotionParameters2D", "is_recovery_as_collision_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsTestMotionParameters2D.mb_is_recovery_as_collision_enabled, livePtr)
  }

  /** PhysicsTestMotionParameters2D.set_recovery_as_collision_enabled */
  final def setRecoveryAsCollisionEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.PhysicsTestMotionParameters2D.mb_set_recovery_as_collision_enabled == null) gdext.classes.PhysicsTestMotionParameters2D.mb_set_recovery_as_collision_enabled = MethodBind.get("PhysicsTestMotionParameters2D", "set_recovery_as_collision_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsTestMotionParameters2D.mb_set_recovery_as_collision_enabled, livePtr, enabled)
  }

}

object PhysicsTestMotionParameters2D {
  private[classes] var mb_get_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_motion: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_motion: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_separation_ray_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_separation_ray_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_recovery_as_collision_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_recovery_as_collision_enabled: GDExtensionMethodBindPtr = null
}
