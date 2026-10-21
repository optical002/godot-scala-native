package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsTestMotionResult3D`, extends `RefCounted`. */
abstract class PhysicsTestMotionResult3D extends RefCounted {
  override def godotClassName: String = "PhysicsTestMotionResult3D"

  /** PhysicsTestMotionResult3D.get_travel */
  final def getTravel(): gdext.builtin.Vector3 = {
    if (gdext.classes.PhysicsTestMotionResult3D.mb_get_travel == null) gdext.classes.PhysicsTestMotionResult3D.mb_get_travel = MethodBind.get("PhysicsTestMotionResult3D", "get_travel", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.PhysicsTestMotionResult3D.mb_get_travel, livePtr)
  }

  /** PhysicsTestMotionResult3D.get_remainder */
  final def getRemainder(): gdext.builtin.Vector3 = {
    if (gdext.classes.PhysicsTestMotionResult3D.mb_get_remainder == null) gdext.classes.PhysicsTestMotionResult3D.mb_get_remainder = MethodBind.get("PhysicsTestMotionResult3D", "get_remainder", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.PhysicsTestMotionResult3D.mb_get_remainder, livePtr)
  }

  /** PhysicsTestMotionResult3D.get_collision_safe_fraction */
  final def getCollisionSafeFraction(): Double = {
    if (gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_safe_fraction == null) gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_safe_fraction = MethodBind.get("PhysicsTestMotionResult3D", "get_collision_safe_fraction", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_safe_fraction, livePtr)
  }

  /** PhysicsTestMotionResult3D.get_collision_unsafe_fraction */
  final def getCollisionUnsafeFraction(): Double = {
    if (gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_unsafe_fraction == null) gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_unsafe_fraction = MethodBind.get("PhysicsTestMotionResult3D", "get_collision_unsafe_fraction", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_unsafe_fraction, livePtr)
  }

  /** PhysicsTestMotionResult3D.get_collision_count */
  final def getCollisionCount(): Long = {
    if (gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_count == null) gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_count = MethodBind.get("PhysicsTestMotionResult3D", "get_collision_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_count, livePtr)
  }

  /** PhysicsTestMotionResult3D.get_collision_point */
  final def getCollisionPoint(collision_index: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_point == null) gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_point = MethodBind.get("PhysicsTestMotionResult3D", "get_collision_point", 1914908202L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_point, livePtr, collision_index)
  }

  /** PhysicsTestMotionResult3D.get_collision_normal */
  final def getCollisionNormal(collision_index: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_normal == null) gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_normal = MethodBind.get("PhysicsTestMotionResult3D", "get_collision_normal", 1914908202L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_normal, livePtr, collision_index)
  }

  /** PhysicsTestMotionResult3D.get_collider_velocity */
  final def getColliderVelocity(collision_index: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.PhysicsTestMotionResult3D.mb_get_collider_velocity == null) gdext.classes.PhysicsTestMotionResult3D.mb_get_collider_velocity = MethodBind.get("PhysicsTestMotionResult3D", "get_collider_velocity", 1914908202L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.PhysicsTestMotionResult3D.mb_get_collider_velocity, livePtr, collision_index)
  }

  /** PhysicsTestMotionResult3D.get_collider_id */
  final def getColliderId(collision_index: Long): Long = {
    if (gdext.classes.PhysicsTestMotionResult3D.mb_get_collider_id == null) gdext.classes.PhysicsTestMotionResult3D.mb_get_collider_id = MethodBind.get("PhysicsTestMotionResult3D", "get_collider_id", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.PhysicsTestMotionResult3D.mb_get_collider_id, livePtr, collision_index)
  }

  /** PhysicsTestMotionResult3D.get_collider */
  final def getCollider(collision_index: Long): Object = {
    if (gdext.classes.PhysicsTestMotionResult3D.mb_get_collider == null) gdext.classes.PhysicsTestMotionResult3D.mb_get_collider = MethodBind.get("PhysicsTestMotionResult3D", "get_collider", 2639523548L)
    Wrappers.borrowed[Object](Ptrcall.call1[Long, Long](gdext.classes.PhysicsTestMotionResult3D.mb_get_collider, livePtr, collision_index))
  }

  /** PhysicsTestMotionResult3D.get_collider_shape */
  final def getColliderShape(collision_index: Long): Long = {
    if (gdext.classes.PhysicsTestMotionResult3D.mb_get_collider_shape == null) gdext.classes.PhysicsTestMotionResult3D.mb_get_collider_shape = MethodBind.get("PhysicsTestMotionResult3D", "get_collider_shape", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.PhysicsTestMotionResult3D.mb_get_collider_shape, livePtr, collision_index)
  }

  /** PhysicsTestMotionResult3D.get_collision_local_shape */
  final def getCollisionLocalShape(collision_index: Long): Long = {
    if (gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_local_shape == null) gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_local_shape = MethodBind.get("PhysicsTestMotionResult3D", "get_collision_local_shape", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_local_shape, livePtr, collision_index)
  }

  /** PhysicsTestMotionResult3D.get_collision_depth */
  final def getCollisionDepth(collision_index: Long): Double = {
    if (gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_depth == null) gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_depth = MethodBind.get("PhysicsTestMotionResult3D", "get_collision_depth", 218038398L)
    Ptrcall.call1[Long, Double](gdext.classes.PhysicsTestMotionResult3D.mb_get_collision_depth, livePtr, collision_index)
  }

}

object PhysicsTestMotionResult3D {
  private[classes] var mb_get_travel: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_remainder: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_safe_fraction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_unsafe_fraction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_local_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_depth: GDExtensionMethodBindPtr = null
}
