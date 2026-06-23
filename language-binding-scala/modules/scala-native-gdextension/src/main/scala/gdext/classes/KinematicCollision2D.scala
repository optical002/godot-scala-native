package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `KinematicCollision2D`, extends `RefCounted`. */
abstract class KinematicCollision2D extends RefCounted {

  /** KinematicCollision2D.get_position */
  final def getPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("KinematicCollision2D", "get_position", 3341600327L), hostObject.objectPtr)

  /** KinematicCollision2D.get_normal */
  final def getNormal(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("KinematicCollision2D", "get_normal", 3341600327L), hostObject.objectPtr)

  /** KinematicCollision2D.get_travel */
  final def getTravel(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("KinematicCollision2D", "get_travel", 3341600327L), hostObject.objectPtr)

  /** KinematicCollision2D.get_remainder */
  final def getRemainder(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("KinematicCollision2D", "get_remainder", 3341600327L), hostObject.objectPtr)

  /** KinematicCollision2D.get_angle */
  final def getAngle(up_direction: gdext.builtin.Vector2): Double =
    Ptrcall.call1[gdext.builtin.Vector2, Double](MethodBind.get("KinematicCollision2D", "get_angle", 2841063350L), hostObject.objectPtr, up_direction)

  /** KinematicCollision2D.get_depth */
  final def getDepth(): Double =
    Ptrcall.call0[Double](MethodBind.get("KinematicCollision2D", "get_depth", 1740695150L), hostObject.objectPtr)

  /** KinematicCollision2D.get_local_shape */
  final def getLocalShape(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("KinematicCollision2D", "get_local_shape", 1981248198L), hostObject.objectPtr)

  /** KinematicCollision2D.get_collider */
  final def getCollider(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("KinematicCollision2D", "get_collider", 1981248198L), hostObject.objectPtr)

  /** KinematicCollision2D.get_collider_id */
  final def getColliderId(): Long =
    Ptrcall.call0[Long](MethodBind.get("KinematicCollision2D", "get_collider_id", 3905245786L), hostObject.objectPtr)

  /** KinematicCollision2D.get_collider_shape */
  final def getColliderShape(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("KinematicCollision2D", "get_collider_shape", 1981248198L), hostObject.objectPtr)

  /** KinematicCollision2D.get_collider_shape_index */
  final def getColliderShapeIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("KinematicCollision2D", "get_collider_shape_index", 3905245786L), hostObject.objectPtr)

  /** KinematicCollision2D.get_collider_velocity */
  final def getColliderVelocity(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("KinematicCollision2D", "get_collider_velocity", 3341600327L), hostObject.objectPtr)

}

object KinematicCollision2D {
  /** Class metadata for Gd[KinematicCollision2D] lifetime management and casting. */
  given GodotClass[KinematicCollision2D] with {
    def className = "KinematicCollision2D"
    def isRefCounted = true
    def wrap(o: GodotObject): KinematicCollision2D = new KinematicCollision2D {}.withHost(o.objectPtr)
    def unwrap(t: KinematicCollision2D): GodotObject = t.hostObject
  }
}
