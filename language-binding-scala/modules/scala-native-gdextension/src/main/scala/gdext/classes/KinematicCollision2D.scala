package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `KinematicCollision2D`, extends `RefCounted`. */
abstract class KinematicCollision2D extends RefCounted {
  override def godotClassName: String = "KinematicCollision2D"

  /** KinematicCollision2D.get_position */
  final def getPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.KinematicCollision2D.mb_get_position == null) gdext.classes.KinematicCollision2D.mb_get_position = MethodBind.get("KinematicCollision2D", "get_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.KinematicCollision2D.mb_get_position, livePtr)
  }

  /** KinematicCollision2D.get_normal */
  final def getNormal(): gdext.builtin.Vector2 = {
    if (gdext.classes.KinematicCollision2D.mb_get_normal == null) gdext.classes.KinematicCollision2D.mb_get_normal = MethodBind.get("KinematicCollision2D", "get_normal", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.KinematicCollision2D.mb_get_normal, livePtr)
  }

  /** KinematicCollision2D.get_travel */
  final def getTravel(): gdext.builtin.Vector2 = {
    if (gdext.classes.KinematicCollision2D.mb_get_travel == null) gdext.classes.KinematicCollision2D.mb_get_travel = MethodBind.get("KinematicCollision2D", "get_travel", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.KinematicCollision2D.mb_get_travel, livePtr)
  }

  /** KinematicCollision2D.get_remainder */
  final def getRemainder(): gdext.builtin.Vector2 = {
    if (gdext.classes.KinematicCollision2D.mb_get_remainder == null) gdext.classes.KinematicCollision2D.mb_get_remainder = MethodBind.get("KinematicCollision2D", "get_remainder", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.KinematicCollision2D.mb_get_remainder, livePtr)
  }

  /** KinematicCollision2D.get_angle */
  final def getAngle(upDirection: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, -1f)): Double = {
    if (gdext.classes.KinematicCollision2D.mb_get_angle == null) gdext.classes.KinematicCollision2D.mb_get_angle = MethodBind.get("KinematicCollision2D", "get_angle", 2841063350L)
    Ptrcall.call1[gdext.builtin.Vector2, Double](gdext.classes.KinematicCollision2D.mb_get_angle, livePtr, upDirection)
  }

  /** KinematicCollision2D.get_depth */
  final def getDepth(): Double = {
    if (gdext.classes.KinematicCollision2D.mb_get_depth == null) gdext.classes.KinematicCollision2D.mb_get_depth = MethodBind.get("KinematicCollision2D", "get_depth", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.KinematicCollision2D.mb_get_depth, livePtr)
  }

  /** KinematicCollision2D.get_local_shape */
  final def getLocalShape(): Object = {
    if (gdext.classes.KinematicCollision2D.mb_get_local_shape == null) gdext.classes.KinematicCollision2D.mb_get_local_shape = MethodBind.get("KinematicCollision2D", "get_local_shape", 1981248198L)
    Wrappers.borrowed[Object](Ptrcall.call0[Long](gdext.classes.KinematicCollision2D.mb_get_local_shape, livePtr))
  }

  /** KinematicCollision2D.get_collider */
  final def getCollider(): Object = {
    if (gdext.classes.KinematicCollision2D.mb_get_collider == null) gdext.classes.KinematicCollision2D.mb_get_collider = MethodBind.get("KinematicCollision2D", "get_collider", 1981248198L)
    Wrappers.borrowed[Object](Ptrcall.call0[Long](gdext.classes.KinematicCollision2D.mb_get_collider, livePtr))
  }

  /** KinematicCollision2D.get_collider_id */
  final def getColliderId(): Long = {
    if (gdext.classes.KinematicCollision2D.mb_get_collider_id == null) gdext.classes.KinematicCollision2D.mb_get_collider_id = MethodBind.get("KinematicCollision2D", "get_collider_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.KinematicCollision2D.mb_get_collider_id, livePtr)
  }

  /** KinematicCollision2D.get_collider_shape */
  final def getColliderShape(): Object = {
    if (gdext.classes.KinematicCollision2D.mb_get_collider_shape == null) gdext.classes.KinematicCollision2D.mb_get_collider_shape = MethodBind.get("KinematicCollision2D", "get_collider_shape", 1981248198L)
    Wrappers.borrowed[Object](Ptrcall.call0[Long](gdext.classes.KinematicCollision2D.mb_get_collider_shape, livePtr))
  }

  /** KinematicCollision2D.get_collider_shape_index */
  final def getColliderShapeIndex(): Long = {
    if (gdext.classes.KinematicCollision2D.mb_get_collider_shape_index == null) gdext.classes.KinematicCollision2D.mb_get_collider_shape_index = MethodBind.get("KinematicCollision2D", "get_collider_shape_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.KinematicCollision2D.mb_get_collider_shape_index, livePtr)
  }

  /** KinematicCollision2D.get_collider_velocity */
  final def getColliderVelocity(): gdext.builtin.Vector2 = {
    if (gdext.classes.KinematicCollision2D.mb_get_collider_velocity == null) gdext.classes.KinematicCollision2D.mb_get_collider_velocity = MethodBind.get("KinematicCollision2D", "get_collider_velocity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.KinematicCollision2D.mb_get_collider_velocity, livePtr)
  }

}

object KinematicCollision2D {
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_travel: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_remainder: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_local_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_shape_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_velocity: GDExtensionMethodBindPtr = null
}
