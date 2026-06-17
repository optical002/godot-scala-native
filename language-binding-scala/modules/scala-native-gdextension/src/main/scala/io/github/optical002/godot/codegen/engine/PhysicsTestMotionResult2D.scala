package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsTestMotionResult2D`, extends `RefCounted`. */
abstract class PhysicsTestMotionResult2D extends RefCounted {

  /** PhysicsTestMotionResult2D.get_travel */
  final def getTravel(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("PhysicsTestMotionResult2D", "get_travel", 3341600327L), hostObject.objectPtr)

  /** PhysicsTestMotionResult2D.get_remainder */
  final def getRemainder(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("PhysicsTestMotionResult2D", "get_remainder", 3341600327L), hostObject.objectPtr)

  /** PhysicsTestMotionResult2D.get_collision_point */
  final def getCollisionPoint(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("PhysicsTestMotionResult2D", "get_collision_point", 3341600327L), hostObject.objectPtr)

  /** PhysicsTestMotionResult2D.get_collision_normal */
  final def getCollisionNormal(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("PhysicsTestMotionResult2D", "get_collision_normal", 3341600327L), hostObject.objectPtr)

  /** PhysicsTestMotionResult2D.get_collider_velocity */
  final def getColliderVelocity(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("PhysicsTestMotionResult2D", "get_collider_velocity", 3341600327L), hostObject.objectPtr)

  /** PhysicsTestMotionResult2D.get_collider_id */
  final def getColliderId(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsTestMotionResult2D", "get_collider_id", 3905245786L), hostObject.objectPtr)

  /** PhysicsTestMotionResult2D.get_collider */
  final def getCollider(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PhysicsTestMotionResult2D", "get_collider", 1981248198L), hostObject.objectPtr)

  /** PhysicsTestMotionResult2D.get_collider_shape */
  final def getColliderShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsTestMotionResult2D", "get_collider_shape", 3905245786L), hostObject.objectPtr)

  /** PhysicsTestMotionResult2D.get_collision_local_shape */
  final def getCollisionLocalShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsTestMotionResult2D", "get_collision_local_shape", 3905245786L), hostObject.objectPtr)

  /** PhysicsTestMotionResult2D.get_collision_depth */
  final def getCollisionDepth(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsTestMotionResult2D", "get_collision_depth", 1740695150L), hostObject.objectPtr)

  /** PhysicsTestMotionResult2D.get_collision_safe_fraction */
  final def getCollisionSafeFraction(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsTestMotionResult2D", "get_collision_safe_fraction", 1740695150L), hostObject.objectPtr)

  /** PhysicsTestMotionResult2D.get_collision_unsafe_fraction */
  final def getCollisionUnsafeFraction(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsTestMotionResult2D", "get_collision_unsafe_fraction", 1740695150L), hostObject.objectPtr)

}

object PhysicsTestMotionResult2D {
  /** Class metadata for Gd[PhysicsTestMotionResult2D] lifetime management and casting. */
  given GodotClass[PhysicsTestMotionResult2D] with {
    def className = "PhysicsTestMotionResult2D"
    def isRefCounted = true
    def wrap(o: GodotObject): PhysicsTestMotionResult2D = new PhysicsTestMotionResult2D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsTestMotionResult2D): GodotObject = t.hostObject
  }
}
