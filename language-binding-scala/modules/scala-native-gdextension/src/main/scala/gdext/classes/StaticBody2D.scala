package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StaticBody2D`, extends `PhysicsBody2D`. */
abstract class StaticBody2D extends PhysicsBody2D {
  override def godotClassName: String = "StaticBody2D"

  /** StaticBody2D.set_constant_linear_velocity */
  final def setConstantLinearVelocity(vel: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.StaticBody2D.mb_set_constant_linear_velocity == null) gdext.classes.StaticBody2D.mb_set_constant_linear_velocity = MethodBind.get("StaticBody2D", "set_constant_linear_velocity", 743155724L)
    Ptrcall.callVoid1(gdext.classes.StaticBody2D.mb_set_constant_linear_velocity, livePtr, vel)
  }

  /** StaticBody2D.set_constant_angular_velocity */
  final def setConstantAngularVelocity(vel: Double): Unit = {
    if (gdext.classes.StaticBody2D.mb_set_constant_angular_velocity == null) gdext.classes.StaticBody2D.mb_set_constant_angular_velocity = MethodBind.get("StaticBody2D", "set_constant_angular_velocity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.StaticBody2D.mb_set_constant_angular_velocity, livePtr, vel)
  }

  /** StaticBody2D.get_constant_linear_velocity */
  final def getConstantLinearVelocity(): gdext.builtin.Vector2 = {
    if (gdext.classes.StaticBody2D.mb_get_constant_linear_velocity == null) gdext.classes.StaticBody2D.mb_get_constant_linear_velocity = MethodBind.get("StaticBody2D", "get_constant_linear_velocity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.StaticBody2D.mb_get_constant_linear_velocity, livePtr)
  }

  /** StaticBody2D.get_constant_angular_velocity */
  final def getConstantAngularVelocity(): Double = {
    if (gdext.classes.StaticBody2D.mb_get_constant_angular_velocity == null) gdext.classes.StaticBody2D.mb_get_constant_angular_velocity = MethodBind.get("StaticBody2D", "get_constant_angular_velocity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.StaticBody2D.mb_get_constant_angular_velocity, livePtr)
  }

  /** StaticBody2D.set_physics_material_override */
  final def setPhysicsMaterialOverride(physics_material_override: PhysicsMaterial): Unit = {
    if (gdext.classes.StaticBody2D.mb_set_physics_material_override == null) gdext.classes.StaticBody2D.mb_set_physics_material_override = MethodBind.get("StaticBody2D", "set_physics_material_override", 1784508650L)
    Ptrcall.callVoid1(gdext.classes.StaticBody2D.mb_set_physics_material_override, livePtr, Wrappers.handle(physics_material_override))
  }

  /** StaticBody2D.get_physics_material_override. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPhysicsMaterialOverride(): PhysicsMaterial = {
    if (gdext.classes.StaticBody2D.mb_get_physics_material_override == null) gdext.classes.StaticBody2D.mb_get_physics_material_override = MethodBind.get("StaticBody2D", "get_physics_material_override", 2521850424L)
    Wrappers.owned[PhysicsMaterial](Ptrcall.call0[Long](gdext.classes.StaticBody2D.mb_get_physics_material_override, livePtr))
  }

}

object StaticBody2D {
  private[classes] var mb_set_constant_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_constant_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_material_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_material_override: GDExtensionMethodBindPtr = null
}
