package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `KinematicCollision3D`, extends `RefCounted`. */
abstract class KinematicCollision3D extends RefCounted {
  override def godotClassName: String = "KinematicCollision3D"

  /** KinematicCollision3D.get_travel */
  final def getTravel(): gdext.builtin.Vector3 = {
    if (gdext.classes.KinematicCollision3D.mb_get_travel == null) gdext.classes.KinematicCollision3D.mb_get_travel = MethodBind.get("KinematicCollision3D", "get_travel", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.KinematicCollision3D.mb_get_travel, livePtr)
  }

  /** KinematicCollision3D.get_remainder */
  final def getRemainder(): gdext.builtin.Vector3 = {
    if (gdext.classes.KinematicCollision3D.mb_get_remainder == null) gdext.classes.KinematicCollision3D.mb_get_remainder = MethodBind.get("KinematicCollision3D", "get_remainder", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.KinematicCollision3D.mb_get_remainder, livePtr)
  }

  /** KinematicCollision3D.get_depth */
  final def getDepth(): Double = {
    if (gdext.classes.KinematicCollision3D.mb_get_depth == null) gdext.classes.KinematicCollision3D.mb_get_depth = MethodBind.get("KinematicCollision3D", "get_depth", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.KinematicCollision3D.mb_get_depth, livePtr)
  }

  /** KinematicCollision3D.get_collision_count */
  final def getCollisionCount(): Long = {
    if (gdext.classes.KinematicCollision3D.mb_get_collision_count == null) gdext.classes.KinematicCollision3D.mb_get_collision_count = MethodBind.get("KinematicCollision3D", "get_collision_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.KinematicCollision3D.mb_get_collision_count, livePtr)
  }

  /** KinematicCollision3D.get_position */
  final def getPosition(collision_index: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.KinematicCollision3D.mb_get_position == null) gdext.classes.KinematicCollision3D.mb_get_position = MethodBind.get("KinematicCollision3D", "get_position", 1914908202L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.KinematicCollision3D.mb_get_position, livePtr, collision_index)
  }

  /** KinematicCollision3D.get_normal */
  final def getNormal(collision_index: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.KinematicCollision3D.mb_get_normal == null) gdext.classes.KinematicCollision3D.mb_get_normal = MethodBind.get("KinematicCollision3D", "get_normal", 1914908202L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.KinematicCollision3D.mb_get_normal, livePtr, collision_index)
  }

  /** KinematicCollision3D.get_angle */
  final def getAngle(collision_index: Long, up_direction: gdext.builtin.Vector3): Double = {
    if (gdext.classes.KinematicCollision3D.mb_get_angle == null) gdext.classes.KinematicCollision3D.mb_get_angle = MethodBind.get("KinematicCollision3D", "get_angle", 1242741860L)
    Ptrcall.call2[Long, gdext.builtin.Vector3, Double](gdext.classes.KinematicCollision3D.mb_get_angle, livePtr, collision_index, up_direction)
  }

  /** KinematicCollision3D.get_local_shape */
  final def getLocalShape(collision_index: Long): Object = {
    if (gdext.classes.KinematicCollision3D.mb_get_local_shape == null) gdext.classes.KinematicCollision3D.mb_get_local_shape = MethodBind.get("KinematicCollision3D", "get_local_shape", 2639523548L)
    Wrappers.borrowed[Object](Ptrcall.call1[Long, Long](gdext.classes.KinematicCollision3D.mb_get_local_shape, livePtr, collision_index))
  }

  /** KinematicCollision3D.get_collider */
  final def getCollider(collision_index: Long): Object = {
    if (gdext.classes.KinematicCollision3D.mb_get_collider == null) gdext.classes.KinematicCollision3D.mb_get_collider = MethodBind.get("KinematicCollision3D", "get_collider", 2639523548L)
    Wrappers.borrowed[Object](Ptrcall.call1[Long, Long](gdext.classes.KinematicCollision3D.mb_get_collider, livePtr, collision_index))
  }

  /** KinematicCollision3D.get_collider_id */
  final def getColliderId(collision_index: Long): Long = {
    if (gdext.classes.KinematicCollision3D.mb_get_collider_id == null) gdext.classes.KinematicCollision3D.mb_get_collider_id = MethodBind.get("KinematicCollision3D", "get_collider_id", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.KinematicCollision3D.mb_get_collider_id, livePtr, collision_index)
  }

  /** KinematicCollision3D.get_collider_shape */
  final def getColliderShape(collision_index: Long): Object = {
    if (gdext.classes.KinematicCollision3D.mb_get_collider_shape == null) gdext.classes.KinematicCollision3D.mb_get_collider_shape = MethodBind.get("KinematicCollision3D", "get_collider_shape", 2639523548L)
    Wrappers.borrowed[Object](Ptrcall.call1[Long, Long](gdext.classes.KinematicCollision3D.mb_get_collider_shape, livePtr, collision_index))
  }

  /** KinematicCollision3D.get_collider_shape_index */
  final def getColliderShapeIndex(collision_index: Long): Long = {
    if (gdext.classes.KinematicCollision3D.mb_get_collider_shape_index == null) gdext.classes.KinematicCollision3D.mb_get_collider_shape_index = MethodBind.get("KinematicCollision3D", "get_collider_shape_index", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.KinematicCollision3D.mb_get_collider_shape_index, livePtr, collision_index)
  }

  /** KinematicCollision3D.get_collider_velocity */
  final def getColliderVelocity(collision_index: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.KinematicCollision3D.mb_get_collider_velocity == null) gdext.classes.KinematicCollision3D.mb_get_collider_velocity = MethodBind.get("KinematicCollision3D", "get_collider_velocity", 1914908202L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.KinematicCollision3D.mb_get_collider_velocity, livePtr, collision_index)
  }

}

object KinematicCollision3D {
  private[classes] var mb_get_travel: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_remainder: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_local_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_shape_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_velocity: GDExtensionMethodBindPtr = null
}
