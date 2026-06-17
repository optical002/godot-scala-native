package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsTestMotionResult3D`, extends `RefCounted`. */
abstract class PhysicsTestMotionResult3D extends RefCounted {

  /** PhysicsTestMotionResult3D.get_travel */
  final def getTravel(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsTestMotionResult3D", "get_travel", 3360562783L), hostObject.objectPtr)

  /** PhysicsTestMotionResult3D.get_remainder */
  final def getRemainder(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsTestMotionResult3D", "get_remainder", 3360562783L), hostObject.objectPtr)

  /** PhysicsTestMotionResult3D.get_collision_safe_fraction */
  final def getCollisionSafeFraction(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsTestMotionResult3D", "get_collision_safe_fraction", 1740695150L), hostObject.objectPtr)

  /** PhysicsTestMotionResult3D.get_collision_unsafe_fraction */
  final def getCollisionUnsafeFraction(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsTestMotionResult3D", "get_collision_unsafe_fraction", 1740695150L), hostObject.objectPtr)

  /** PhysicsTestMotionResult3D.get_collision_count */
  final def getCollisionCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsTestMotionResult3D", "get_collision_count", 3905245786L), hostObject.objectPtr)

  /** PhysicsTestMotionResult3D.get_collision_point */
  final def getCollisionPoint(collision_index: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsTestMotionResult3D", "get_collision_point", 1914908202L), hostObject.objectPtr, collision_index)

  /** PhysicsTestMotionResult3D.get_collision_normal */
  final def getCollisionNormal(collision_index: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsTestMotionResult3D", "get_collision_normal", 1914908202L), hostObject.objectPtr, collision_index)

  /** PhysicsTestMotionResult3D.get_collider_velocity */
  final def getColliderVelocity(collision_index: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsTestMotionResult3D", "get_collider_velocity", 1914908202L), hostObject.objectPtr, collision_index)

  /** PhysicsTestMotionResult3D.get_collider_id */
  final def getColliderId(collision_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PhysicsTestMotionResult3D", "get_collider_id", 1591665591L), hostObject.objectPtr, collision_index)

  /** PhysicsTestMotionResult3D.get_collider */
  final def getCollider(collision_index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("PhysicsTestMotionResult3D", "get_collider", 2639523548L), hostObject.objectPtr, collision_index)

  /** PhysicsTestMotionResult3D.get_collider_shape */
  final def getColliderShape(collision_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PhysicsTestMotionResult3D", "get_collider_shape", 1591665591L), hostObject.objectPtr, collision_index)

  /** PhysicsTestMotionResult3D.get_collision_local_shape */
  final def getCollisionLocalShape(collision_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PhysicsTestMotionResult3D", "get_collision_local_shape", 1591665591L), hostObject.objectPtr, collision_index)

  /** PhysicsTestMotionResult3D.get_collision_depth */
  final def getCollisionDepth(collision_index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("PhysicsTestMotionResult3D", "get_collision_depth", 218038398L), hostObject.objectPtr, collision_index)

}

object PhysicsTestMotionResult3D {
  /** Class metadata for Gd[PhysicsTestMotionResult3D] lifetime management and casting. */
  given GodotClass[PhysicsTestMotionResult3D] with {
    def className = "PhysicsTestMotionResult3D"
    def isRefCounted = true
    def wrap(o: GodotObject): PhysicsTestMotionResult3D = new PhysicsTestMotionResult3D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsTestMotionResult3D): GodotObject = t.hostObject
  }
}
