package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `StaticBody2D`, extends `PhysicsBody2D`. */
abstract class StaticBody2D extends PhysicsBody2D {
  override def godotClassName: String = "StaticBody2D"

  /** StaticBody2D.set_constant_linear_velocity */
  final def setConstantLinearVelocity(vel: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("StaticBody2D", "set_constant_linear_velocity", 743155724L), hostObject.objectPtr, vel)

  /** StaticBody2D.set_constant_angular_velocity */
  final def setConstantAngularVelocity(vel: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("StaticBody2D", "set_constant_angular_velocity", 373806689L), hostObject.objectPtr, vel)

  /** StaticBody2D.get_constant_linear_velocity */
  final def getConstantLinearVelocity(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("StaticBody2D", "get_constant_linear_velocity", 3341600327L), hostObject.objectPtr)

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
