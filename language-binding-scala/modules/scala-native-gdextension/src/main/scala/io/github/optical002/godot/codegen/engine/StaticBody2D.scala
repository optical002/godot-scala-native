package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `StaticBody2D`, extends `PhysicsBody2D`. */
abstract class StaticBody2D extends PhysicsBody2D {

  /** StaticBody2D.set_constant_linear_velocity */
  final def setConstantLinearVelocity(vel: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("StaticBody2D", "set_constant_linear_velocity", 743155724L), hostObject.objectPtr, vel)

  /** StaticBody2D.set_constant_angular_velocity */
  final def setConstantAngularVelocity(vel: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("StaticBody2D", "set_constant_angular_velocity", 373806689L), hostObject.objectPtr, vel)

  /** StaticBody2D.get_constant_linear_velocity */
  final def getConstantLinearVelocity(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("StaticBody2D", "get_constant_linear_velocity", 3341600327L), hostObject.objectPtr)

  /** StaticBody2D.get_constant_angular_velocity */
  final def getConstantAngularVelocity(): Double =
    Ptrcall.call0[Double](MethodBind.get("StaticBody2D", "get_constant_angular_velocity", 1740695150L), hostObject.objectPtr)

  /** StaticBody2D.set_physics_material_override */
  final def setPhysicsMaterialOverride(physics_material_override: PhysicsMaterial): Unit =
    Ptrcall.callVoid1(MethodBind.get("StaticBody2D", "set_physics_material_override", 1784508650L), hostObject.objectPtr, physics_material_override.hostObject)

  /** StaticBody2D.get_physics_material_override */
  final def getPhysicsMaterialOverride(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("StaticBody2D", "get_physics_material_override", 2521850424L), hostObject.objectPtr)

}

object StaticBody2D {
  /** Class metadata for Gd[StaticBody2D] lifetime management and casting. */
  given GodotClass[StaticBody2D] with {
    def className = "StaticBody2D"
    def isRefCounted = false
    def wrap(o: GodotObject): StaticBody2D = new StaticBody2D {}.withHost(o.objectPtr)
    def unwrap(t: StaticBody2D): GodotObject = t.hostObject
  }
}
