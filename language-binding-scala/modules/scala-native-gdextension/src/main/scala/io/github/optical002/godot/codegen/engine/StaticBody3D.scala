package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `StaticBody3D`, extends `PhysicsBody3D`. */
abstract class StaticBody3D extends PhysicsBody3D {

  /** StaticBody3D.set_constant_linear_velocity */
  final def setConstantLinearVelocity(vel: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("StaticBody3D", "set_constant_linear_velocity", 3460891852L), hostObject.objectPtr, vel)

  /** StaticBody3D.set_constant_angular_velocity */
  final def setConstantAngularVelocity(vel: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("StaticBody3D", "set_constant_angular_velocity", 3460891852L), hostObject.objectPtr, vel)

  /** StaticBody3D.get_constant_linear_velocity */
  final def getConstantLinearVelocity(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("StaticBody3D", "get_constant_linear_velocity", 3360562783L), hostObject.objectPtr)

  /** StaticBody3D.get_constant_angular_velocity */
  final def getConstantAngularVelocity(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("StaticBody3D", "get_constant_angular_velocity", 3360562783L), hostObject.objectPtr)

  /** StaticBody3D.set_physics_material_override */
  final def setPhysicsMaterialOverride(physics_material_override: PhysicsMaterial): Unit =
    Ptrcall.callVoid1(MethodBind.get("StaticBody3D", "set_physics_material_override", 1784508650L), hostObject.objectPtr, physics_material_override.hostObject)

  /** StaticBody3D.get_physics_material_override */
  final def getPhysicsMaterialOverride(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("StaticBody3D", "get_physics_material_override", 2521850424L), hostObject.objectPtr)

}

object StaticBody3D {
  /** Class metadata for Gd[StaticBody3D] lifetime management and casting. */
  given GodotClass[StaticBody3D] with {
    def className = "StaticBody3D"
    def isRefCounted = false
    def wrap(o: GodotObject): StaticBody3D = new StaticBody3D {}.withHost(o.objectPtr)
    def unwrap(t: StaticBody3D): GodotObject = t.hostObject
  }
}
