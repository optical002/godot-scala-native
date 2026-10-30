package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StaticBody3D`, extends `PhysicsBody3D`. */
abstract class StaticBody3D extends PhysicsBody3D {
  override def godotClassName: String = "StaticBody3D"

  /** StaticBody3D.set_constant_linear_velocity */
  final def setConstantLinearVelocity(vel: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.StaticBody3D.mb_set_constant_linear_velocity == null) gdext.classes.StaticBody3D.mb_set_constant_linear_velocity = MethodBind.get("StaticBody3D", "set_constant_linear_velocity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.StaticBody3D.mb_set_constant_linear_velocity, livePtr, vel)
  }

  /** StaticBody3D.set_constant_angular_velocity */
  final def setConstantAngularVelocity(vel: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.StaticBody3D.mb_set_constant_angular_velocity == null) gdext.classes.StaticBody3D.mb_set_constant_angular_velocity = MethodBind.get("StaticBody3D", "set_constant_angular_velocity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.StaticBody3D.mb_set_constant_angular_velocity, livePtr, vel)
  }

  /** StaticBody3D.get_constant_linear_velocity */
  final def getConstantLinearVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.StaticBody3D.mb_get_constant_linear_velocity == null) gdext.classes.StaticBody3D.mb_get_constant_linear_velocity = MethodBind.get("StaticBody3D", "get_constant_linear_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.StaticBody3D.mb_get_constant_linear_velocity, livePtr)
  }

  /** StaticBody3D.get_constant_angular_velocity */
  final def getConstantAngularVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.StaticBody3D.mb_get_constant_angular_velocity == null) gdext.classes.StaticBody3D.mb_get_constant_angular_velocity = MethodBind.get("StaticBody3D", "get_constant_angular_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.StaticBody3D.mb_get_constant_angular_velocity, livePtr)
  }

  /** StaticBody3D.set_physics_material_override */
  final def setPhysicsMaterialOverride(physicsMaterialOverride: PhysicsMaterial): Unit = {
    if (gdext.classes.StaticBody3D.mb_set_physics_material_override == null) gdext.classes.StaticBody3D.mb_set_physics_material_override = MethodBind.get("StaticBody3D", "set_physics_material_override", 1784508650L)
    Ptrcall.callVoid1(gdext.classes.StaticBody3D.mb_set_physics_material_override, livePtr, Wrappers.handle(physicsMaterialOverride))
  }

  /** StaticBody3D.get_physics_material_override. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPhysicsMaterialOverride(): PhysicsMaterial = {
    if (gdext.classes.StaticBody3D.mb_get_physics_material_override == null) gdext.classes.StaticBody3D.mb_get_physics_material_override = MethodBind.get("StaticBody3D", "get_physics_material_override", 2521850424L)
    Wrappers.owned[PhysicsMaterial](Ptrcall.call0[Long](gdext.classes.StaticBody3D.mb_get_physics_material_override, livePtr))
  }

}

object StaticBody3D {
  private[classes] var mb_set_constant_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_constant_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_material_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_material_override: GDExtensionMethodBindPtr = null
}
