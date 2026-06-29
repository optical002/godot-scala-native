package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `StaticBody3D`, extends `PhysicsBody3D`. */
abstract class StaticBody3D extends PhysicsBody3D {
  override def godotClassName: String = "StaticBody3D"

  /** StaticBody3D.set_constant_linear_velocity */
  final def setConstantLinearVelocity(vel: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("StaticBody3D", "set_constant_linear_velocity", 3460891852L), hostObject.objectPtr, vel)

  /** StaticBody3D.set_constant_angular_velocity */
  final def setConstantAngularVelocity(vel: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("StaticBody3D", "set_constant_angular_velocity", 3460891852L), hostObject.objectPtr, vel)

  /** StaticBody3D.get_constant_linear_velocity */
  final def getConstantLinearVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("StaticBody3D", "get_constant_linear_velocity", 3360562783L), hostObject.objectPtr)

  /** StaticBody3D.get_constant_angular_velocity */
  final def getConstantAngularVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("StaticBody3D", "get_constant_angular_velocity", 3360562783L), hostObject.objectPtr)

  /** StaticBody3D.set_physics_material_override */
  final def setPhysicsMaterialOverride(physics_material_override: PhysicsMaterial): Unit =
    Ptrcall.callVoid1(MethodBind.get("StaticBody3D", "set_physics_material_override", 1784508650L), hostObject.objectPtr, physics_material_override.hostObject)

  /** StaticBody3D.get_physics_material_override */
  final def getPhysicsMaterialOverride(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("StaticBody3D", "get_physics_material_override", 2521850424L), hostObject.objectPtr)

}
