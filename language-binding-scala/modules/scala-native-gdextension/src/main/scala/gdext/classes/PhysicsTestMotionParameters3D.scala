package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsTestMotionParameters3D`, extends `RefCounted`. */
abstract class PhysicsTestMotionParameters3D extends RefCounted {
  override def godotClassName: String = "PhysicsTestMotionParameters3D"

  /** PhysicsTestMotionParameters3D.get_from */
  final def getFrom(): gdext.builtin.Transform3D = {
    if (gdext.classes.PhysicsTestMotionParameters3D.mb_get_from == null) gdext.classes.PhysicsTestMotionParameters3D.mb_get_from = MethodBind.get("PhysicsTestMotionParameters3D", "get_from", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.PhysicsTestMotionParameters3D.mb_get_from, livePtr)
  }

  /** PhysicsTestMotionParameters3D.set_from */
  final def setFrom(from: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.PhysicsTestMotionParameters3D.mb_set_from == null) gdext.classes.PhysicsTestMotionParameters3D.mb_set_from = MethodBind.get("PhysicsTestMotionParameters3D", "set_from", 2952846383L)
    Ptrcall.callVoid1(gdext.classes.PhysicsTestMotionParameters3D.mb_set_from, livePtr, from)
  }

  /** PhysicsTestMotionParameters3D.get_motion */
  final def getMotion(): gdext.builtin.Vector3 = {
    if (gdext.classes.PhysicsTestMotionParameters3D.mb_get_motion == null) gdext.classes.PhysicsTestMotionParameters3D.mb_get_motion = MethodBind.get("PhysicsTestMotionParameters3D", "get_motion", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.PhysicsTestMotionParameters3D.mb_get_motion, livePtr)
  }

  /** PhysicsTestMotionParameters3D.set_motion */
  final def setMotion(motion: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.PhysicsTestMotionParameters3D.mb_set_motion == null) gdext.classes.PhysicsTestMotionParameters3D.mb_set_motion = MethodBind.get("PhysicsTestMotionParameters3D", "set_motion", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.PhysicsTestMotionParameters3D.mb_set_motion, livePtr, motion)
  }

  /** PhysicsTestMotionParameters3D.get_margin */
  final def getMargin(): Double = {
    if (gdext.classes.PhysicsTestMotionParameters3D.mb_get_margin == null) gdext.classes.PhysicsTestMotionParameters3D.mb_get_margin = MethodBind.get("PhysicsTestMotionParameters3D", "get_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsTestMotionParameters3D.mb_get_margin, livePtr)
  }

  /** PhysicsTestMotionParameters3D.set_margin */
  final def setMargin(margin: Double): Unit = {
    if (gdext.classes.PhysicsTestMotionParameters3D.mb_set_margin == null) gdext.classes.PhysicsTestMotionParameters3D.mb_set_margin = MethodBind.get("PhysicsTestMotionParameters3D", "set_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicsTestMotionParameters3D.mb_set_margin, livePtr, margin)
  }

  /** PhysicsTestMotionParameters3D.get_max_collisions */
  final def getMaxCollisions(): Long = {
    if (gdext.classes.PhysicsTestMotionParameters3D.mb_get_max_collisions == null) gdext.classes.PhysicsTestMotionParameters3D.mb_get_max_collisions = MethodBind.get("PhysicsTestMotionParameters3D", "get_max_collisions", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicsTestMotionParameters3D.mb_get_max_collisions, livePtr)
  }

  /** PhysicsTestMotionParameters3D.set_max_collisions */
  final def setMaxCollisions(max_collisions: Long): Unit = {
    if (gdext.classes.PhysicsTestMotionParameters3D.mb_set_max_collisions == null) gdext.classes.PhysicsTestMotionParameters3D.mb_set_max_collisions = MethodBind.get("PhysicsTestMotionParameters3D", "set_max_collisions", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PhysicsTestMotionParameters3D.mb_set_max_collisions, livePtr, max_collisions)
  }

  /** PhysicsTestMotionParameters3D.is_collide_separation_ray_enabled */
  final def isCollideSeparationRayEnabled(): Boolean = {
    if (gdext.classes.PhysicsTestMotionParameters3D.mb_is_collide_separation_ray_enabled == null) gdext.classes.PhysicsTestMotionParameters3D.mb_is_collide_separation_ray_enabled = MethodBind.get("PhysicsTestMotionParameters3D", "is_collide_separation_ray_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsTestMotionParameters3D.mb_is_collide_separation_ray_enabled, livePtr)
  }

  /** PhysicsTestMotionParameters3D.set_collide_separation_ray_enabled */
  final def setCollideSeparationRayEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.PhysicsTestMotionParameters3D.mb_set_collide_separation_ray_enabled == null) gdext.classes.PhysicsTestMotionParameters3D.mb_set_collide_separation_ray_enabled = MethodBind.get("PhysicsTestMotionParameters3D", "set_collide_separation_ray_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsTestMotionParameters3D.mb_set_collide_separation_ray_enabled, livePtr, enabled)
  }

  /** PhysicsTestMotionParameters3D.is_recovery_as_collision_enabled */
  final def isRecoveryAsCollisionEnabled(): Boolean = {
    if (gdext.classes.PhysicsTestMotionParameters3D.mb_is_recovery_as_collision_enabled == null) gdext.classes.PhysicsTestMotionParameters3D.mb_is_recovery_as_collision_enabled = MethodBind.get("PhysicsTestMotionParameters3D", "is_recovery_as_collision_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsTestMotionParameters3D.mb_is_recovery_as_collision_enabled, livePtr)
  }

  /** PhysicsTestMotionParameters3D.set_recovery_as_collision_enabled */
  final def setRecoveryAsCollisionEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.PhysicsTestMotionParameters3D.mb_set_recovery_as_collision_enabled == null) gdext.classes.PhysicsTestMotionParameters3D.mb_set_recovery_as_collision_enabled = MethodBind.get("PhysicsTestMotionParameters3D", "set_recovery_as_collision_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsTestMotionParameters3D.mb_set_recovery_as_collision_enabled, livePtr, enabled)
  }

}

object PhysicsTestMotionParameters3D {
  private[classes] var mb_get_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_motion: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_motion: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_collisions: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_collisions: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_separation_ray_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_separation_ray_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_recovery_as_collision_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_recovery_as_collision_enabled: GDExtensionMethodBindPtr = null
}
