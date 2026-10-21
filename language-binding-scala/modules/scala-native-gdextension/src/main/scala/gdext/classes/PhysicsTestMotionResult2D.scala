package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsTestMotionResult2D`, extends `RefCounted`. */
abstract class PhysicsTestMotionResult2D extends RefCounted {
  override def godotClassName: String = "PhysicsTestMotionResult2D"

  /** PhysicsTestMotionResult2D.get_travel */
  final def getTravel(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsTestMotionResult2D.mb_get_travel == null) gdext.classes.PhysicsTestMotionResult2D.mb_get_travel = MethodBind.get("PhysicsTestMotionResult2D", "get_travel", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsTestMotionResult2D.mb_get_travel, livePtr)
  }

  /** PhysicsTestMotionResult2D.get_remainder */
  final def getRemainder(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsTestMotionResult2D.mb_get_remainder == null) gdext.classes.PhysicsTestMotionResult2D.mb_get_remainder = MethodBind.get("PhysicsTestMotionResult2D", "get_remainder", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsTestMotionResult2D.mb_get_remainder, livePtr)
  }

  /** PhysicsTestMotionResult2D.get_collision_point */
  final def getCollisionPoint(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_point == null) gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_point = MethodBind.get("PhysicsTestMotionResult2D", "get_collision_point", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_point, livePtr)
  }

  /** PhysicsTestMotionResult2D.get_collision_normal */
  final def getCollisionNormal(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_normal == null) gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_normal = MethodBind.get("PhysicsTestMotionResult2D", "get_collision_normal", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_normal, livePtr)
  }

  /** PhysicsTestMotionResult2D.get_collider_velocity */
  final def getColliderVelocity(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsTestMotionResult2D.mb_get_collider_velocity == null) gdext.classes.PhysicsTestMotionResult2D.mb_get_collider_velocity = MethodBind.get("PhysicsTestMotionResult2D", "get_collider_velocity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsTestMotionResult2D.mb_get_collider_velocity, livePtr)
  }

  /** PhysicsTestMotionResult2D.get_collider_id */
  final def getColliderId(): Long = {
    if (gdext.classes.PhysicsTestMotionResult2D.mb_get_collider_id == null) gdext.classes.PhysicsTestMotionResult2D.mb_get_collider_id = MethodBind.get("PhysicsTestMotionResult2D", "get_collider_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicsTestMotionResult2D.mb_get_collider_id, livePtr)
  }

  /** PhysicsTestMotionResult2D.get_collider */
  final def getCollider(): Object = {
    if (gdext.classes.PhysicsTestMotionResult2D.mb_get_collider == null) gdext.classes.PhysicsTestMotionResult2D.mb_get_collider = MethodBind.get("PhysicsTestMotionResult2D", "get_collider", 1981248198L)
    Wrappers.borrowed[Object](Ptrcall.call0[Long](gdext.classes.PhysicsTestMotionResult2D.mb_get_collider, livePtr))
  }

  /** PhysicsTestMotionResult2D.get_collider_shape */
  final def getColliderShape(): Long = {
    if (gdext.classes.PhysicsTestMotionResult2D.mb_get_collider_shape == null) gdext.classes.PhysicsTestMotionResult2D.mb_get_collider_shape = MethodBind.get("PhysicsTestMotionResult2D", "get_collider_shape", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicsTestMotionResult2D.mb_get_collider_shape, livePtr)
  }

  /** PhysicsTestMotionResult2D.get_collision_local_shape */
  final def getCollisionLocalShape(): Long = {
    if (gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_local_shape == null) gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_local_shape = MethodBind.get("PhysicsTestMotionResult2D", "get_collision_local_shape", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_local_shape, livePtr)
  }

  /** PhysicsTestMotionResult2D.get_collision_depth */
  final def getCollisionDepth(): Double = {
    if (gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_depth == null) gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_depth = MethodBind.get("PhysicsTestMotionResult2D", "get_collision_depth", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_depth, livePtr)
  }

  /** PhysicsTestMotionResult2D.get_collision_safe_fraction */
  final def getCollisionSafeFraction(): Double = {
    if (gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_safe_fraction == null) gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_safe_fraction = MethodBind.get("PhysicsTestMotionResult2D", "get_collision_safe_fraction", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_safe_fraction, livePtr)
  }

  /** PhysicsTestMotionResult2D.get_collision_unsafe_fraction */
  final def getCollisionUnsafeFraction(): Double = {
    if (gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_unsafe_fraction == null) gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_unsafe_fraction = MethodBind.get("PhysicsTestMotionResult2D", "get_collision_unsafe_fraction", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsTestMotionResult2D.mb_get_collision_unsafe_fraction, livePtr)
  }

}

object PhysicsTestMotionResult2D {
  private[classes] var mb_get_travel: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_remainder: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_local_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_safe_fraction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_unsafe_fraction: GDExtensionMethodBindPtr = null
}
