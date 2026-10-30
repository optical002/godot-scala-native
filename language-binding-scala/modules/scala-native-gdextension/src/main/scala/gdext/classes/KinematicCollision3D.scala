package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def getPosition(collisionIndex: Long = 0L): gdext.builtin.Vector3 = {
    if (gdext.classes.KinematicCollision3D.mb_get_position == null) gdext.classes.KinematicCollision3D.mb_get_position = MethodBind.get("KinematicCollision3D", "get_position", 1914908202L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.KinematicCollision3D.mb_get_position, livePtr, collisionIndex)
  }

  /** KinematicCollision3D.get_normal */
  final def getNormal(collisionIndex: Long = 0L): gdext.builtin.Vector3 = {
    if (gdext.classes.KinematicCollision3D.mb_get_normal == null) gdext.classes.KinematicCollision3D.mb_get_normal = MethodBind.get("KinematicCollision3D", "get_normal", 1914908202L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.KinematicCollision3D.mb_get_normal, livePtr, collisionIndex)
  }

  /** KinematicCollision3D.get_angle */
  final def getAngle(collisionIndex: Long = 0L, upDirection: gdext.builtin.Vector3 = gdext.builtin.Vector3(0f, 1f, 0f)): Double = {
    if (gdext.classes.KinematicCollision3D.mb_get_angle == null) gdext.classes.KinematicCollision3D.mb_get_angle = MethodBind.get("KinematicCollision3D", "get_angle", 1242741860L)
    Ptrcall.call2[Long, gdext.builtin.Vector3, Double](gdext.classes.KinematicCollision3D.mb_get_angle, livePtr, collisionIndex, upDirection)
  }

  /** KinematicCollision3D.get_local_shape */
  final def getLocalShape(collisionIndex: Long = 0L): Object = {
    if (gdext.classes.KinematicCollision3D.mb_get_local_shape == null) gdext.classes.KinematicCollision3D.mb_get_local_shape = MethodBind.get("KinematicCollision3D", "get_local_shape", 2639523548L)
    Wrappers.borrowed[Object](Ptrcall.call1[Long, Long](gdext.classes.KinematicCollision3D.mb_get_local_shape, livePtr, collisionIndex))
  }

  /** KinematicCollision3D.get_collider */
  final def getCollider(collisionIndex: Long = 0L): Object = {
    if (gdext.classes.KinematicCollision3D.mb_get_collider == null) gdext.classes.KinematicCollision3D.mb_get_collider = MethodBind.get("KinematicCollision3D", "get_collider", 2639523548L)
    Wrappers.borrowed[Object](Ptrcall.call1[Long, Long](gdext.classes.KinematicCollision3D.mb_get_collider, livePtr, collisionIndex))
  }

  /** KinematicCollision3D.get_collider_id */
  final def getColliderId(collisionIndex: Long = 0L): Long = {
    if (gdext.classes.KinematicCollision3D.mb_get_collider_id == null) gdext.classes.KinematicCollision3D.mb_get_collider_id = MethodBind.get("KinematicCollision3D", "get_collider_id", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.KinematicCollision3D.mb_get_collider_id, livePtr, collisionIndex)
  }

  /** KinematicCollision3D.get_collider_shape */
  final def getColliderShape(collisionIndex: Long = 0L): Object = {
    if (gdext.classes.KinematicCollision3D.mb_get_collider_shape == null) gdext.classes.KinematicCollision3D.mb_get_collider_shape = MethodBind.get("KinematicCollision3D", "get_collider_shape", 2639523548L)
    Wrappers.borrowed[Object](Ptrcall.call1[Long, Long](gdext.classes.KinematicCollision3D.mb_get_collider_shape, livePtr, collisionIndex))
  }

  /** KinematicCollision3D.get_collider_shape_index */
  final def getColliderShapeIndex(collisionIndex: Long = 0L): Long = {
    if (gdext.classes.KinematicCollision3D.mb_get_collider_shape_index == null) gdext.classes.KinematicCollision3D.mb_get_collider_shape_index = MethodBind.get("KinematicCollision3D", "get_collider_shape_index", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.KinematicCollision3D.mb_get_collider_shape_index, livePtr, collisionIndex)
  }

  /** KinematicCollision3D.get_collider_velocity */
  final def getColliderVelocity(collisionIndex: Long = 0L): gdext.builtin.Vector3 = {
    if (gdext.classes.KinematicCollision3D.mb_get_collider_velocity == null) gdext.classes.KinematicCollision3D.mb_get_collider_velocity = MethodBind.get("KinematicCollision3D", "get_collider_velocity", 1914908202L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.KinematicCollision3D.mb_get_collider_velocity, livePtr, collisionIndex)
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
