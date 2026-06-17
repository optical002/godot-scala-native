package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsTestMotionParameters3D`, extends `RefCounted`. */
abstract class PhysicsTestMotionParameters3D extends RefCounted {

  /** PhysicsTestMotionParameters3D.get_from */
  final def getFrom(): io.github.optical002.godot.builtin.Transform3D =
    Ptrcall.call0[io.github.optical002.godot.builtin.Transform3D](MethodBind.get("PhysicsTestMotionParameters3D", "get_from", 3229777777L), hostObject.objectPtr)

  /** PhysicsTestMotionParameters3D.set_from */
  final def setFrom(from: io.github.optical002.godot.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsTestMotionParameters3D", "set_from", 2952846383L), hostObject.objectPtr, from)

  /** PhysicsTestMotionParameters3D.get_motion */
  final def getMotion(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsTestMotionParameters3D", "get_motion", 3360562783L), hostObject.objectPtr)

  /** PhysicsTestMotionParameters3D.set_motion */
  final def setMotion(motion: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsTestMotionParameters3D", "set_motion", 3460891852L), hostObject.objectPtr, motion)

  /** PhysicsTestMotionParameters3D.get_margin */
  final def getMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsTestMotionParameters3D", "get_margin", 1740695150L), hostObject.objectPtr)

  /** PhysicsTestMotionParameters3D.set_margin */
  final def setMargin(margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsTestMotionParameters3D", "set_margin", 373806689L), hostObject.objectPtr, margin)

  /** PhysicsTestMotionParameters3D.get_max_collisions */
  final def getMaxCollisions(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsTestMotionParameters3D", "get_max_collisions", 3905245786L), hostObject.objectPtr)

  /** PhysicsTestMotionParameters3D.set_max_collisions */
  final def setMaxCollisions(max_collisions: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsTestMotionParameters3D", "set_max_collisions", 1286410249L), hostObject.objectPtr, max_collisions)

  /** PhysicsTestMotionParameters3D.is_collide_separation_ray_enabled */
  final def isCollideSeparationRayEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsTestMotionParameters3D", "is_collide_separation_ray_enabled", 36873697L), hostObject.objectPtr)

  /** PhysicsTestMotionParameters3D.set_collide_separation_ray_enabled */
  final def setCollideSeparationRayEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsTestMotionParameters3D", "set_collide_separation_ray_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** PhysicsTestMotionParameters3D.is_recovery_as_collision_enabled */
  final def isRecoveryAsCollisionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsTestMotionParameters3D", "is_recovery_as_collision_enabled", 36873697L), hostObject.objectPtr)

  /** PhysicsTestMotionParameters3D.set_recovery_as_collision_enabled */
  final def setRecoveryAsCollisionEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsTestMotionParameters3D", "set_recovery_as_collision_enabled", 2586408642L), hostObject.objectPtr, enabled)

}

object PhysicsTestMotionParameters3D {
  /** Class metadata for Gd[PhysicsTestMotionParameters3D] lifetime management and casting. */
  given GodotClass[PhysicsTestMotionParameters3D] with {
    def className = "PhysicsTestMotionParameters3D"
    def isRefCounted = true
    def wrap(o: GodotObject): PhysicsTestMotionParameters3D = new PhysicsTestMotionParameters3D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsTestMotionParameters3D): GodotObject = t.hostObject
  }
}
