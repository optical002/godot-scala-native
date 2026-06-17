package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `KinematicCollision3D`, extends `RefCounted`. */
abstract class KinematicCollision3D extends RefCounted {

  /** KinematicCollision3D.get_travel */
  final def getTravel(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("KinematicCollision3D", "get_travel", 3360562783L), hostObject.objectPtr)

  /** KinematicCollision3D.get_remainder */
  final def getRemainder(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("KinematicCollision3D", "get_remainder", 3360562783L), hostObject.objectPtr)

  /** KinematicCollision3D.get_depth */
  final def getDepth(): Double =
    Ptrcall.call0[Double](MethodBind.get("KinematicCollision3D", "get_depth", 1740695150L), hostObject.objectPtr)

  /** KinematicCollision3D.get_collision_count */
  final def getCollisionCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("KinematicCollision3D", "get_collision_count", 3905245786L), hostObject.objectPtr)

  /** KinematicCollision3D.get_position */
  final def getPosition(collision_index: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("KinematicCollision3D", "get_position", 1914908202L), hostObject.objectPtr, collision_index)

  /** KinematicCollision3D.get_normal */
  final def getNormal(collision_index: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("KinematicCollision3D", "get_normal", 1914908202L), hostObject.objectPtr, collision_index)

  /** KinematicCollision3D.get_angle */
  final def getAngle(collision_index: Long, up_direction: io.github.optical002.godot.builtin.Vector3): Double =
    Ptrcall.call2[Long, io.github.optical002.godot.builtin.Vector3, Double](MethodBind.get("KinematicCollision3D", "get_angle", 1242741860L), hostObject.objectPtr, collision_index, up_direction)

  /** KinematicCollision3D.get_local_shape */
  final def getLocalShape(collision_index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("KinematicCollision3D", "get_local_shape", 2639523548L), hostObject.objectPtr, collision_index)

  /** KinematicCollision3D.get_collider */
  final def getCollider(collision_index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("KinematicCollision3D", "get_collider", 2639523548L), hostObject.objectPtr, collision_index)

  /** KinematicCollision3D.get_collider_id */
  final def getColliderId(collision_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("KinematicCollision3D", "get_collider_id", 1591665591L), hostObject.objectPtr, collision_index)

  /** KinematicCollision3D.get_collider_shape */
  final def getColliderShape(collision_index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("KinematicCollision3D", "get_collider_shape", 2639523548L), hostObject.objectPtr, collision_index)

  /** KinematicCollision3D.get_collider_shape_index */
  final def getColliderShapeIndex(collision_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("KinematicCollision3D", "get_collider_shape_index", 1591665591L), hostObject.objectPtr, collision_index)

  /** KinematicCollision3D.get_collider_velocity */
  final def getColliderVelocity(collision_index: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("KinematicCollision3D", "get_collider_velocity", 1914908202L), hostObject.objectPtr, collision_index)

}

object KinematicCollision3D {
  /** Class metadata for Gd[KinematicCollision3D] lifetime management and casting. */
  given GodotClass[KinematicCollision3D] with {
    def className = "KinematicCollision3D"
    def isRefCounted = true
    def wrap(o: GodotObject): KinematicCollision3D = new KinematicCollision3D {}.withHost(o.objectPtr)
    def unwrap(t: KinematicCollision3D): GodotObject = t.hostObject
  }
}
