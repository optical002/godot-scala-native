package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RigidBody3D`, extends `PhysicsBody3D`. */
abstract class RigidBody3D extends PhysicsBody3D {

  /** RigidBody3D.set_mass */
  final def setMass(mass: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_mass", 373806689L), hostObject.objectPtr, mass)

  /** RigidBody3D.get_mass */
  final def getMass(): Double =
    Ptrcall.call0[Double](MethodBind.get("RigidBody3D", "get_mass", 1740695150L), hostObject.objectPtr)

  /** RigidBody3D.set_inertia */
  final def setInertia(inertia: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_inertia", 3460891852L), hostObject.objectPtr, inertia)

  /** RigidBody3D.get_inertia */
  final def getInertia(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("RigidBody3D", "get_inertia", 3360562783L), hostObject.objectPtr)

  /** RigidBody3D.set_center_of_mass_mode */
  final def setCenterOfMassMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_center_of_mass_mode", 3625866032L), hostObject.objectPtr, mode)

  /** RigidBody3D.get_center_of_mass_mode */
  final def getCenterOfMassMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("RigidBody3D", "get_center_of_mass_mode", 237405040L), hostObject.objectPtr)

  /** RigidBody3D.set_center_of_mass */
  final def setCenterOfMass(center_of_mass: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_center_of_mass", 3460891852L), hostObject.objectPtr, center_of_mass)

  /** RigidBody3D.get_center_of_mass */
  final def getCenterOfMass(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("RigidBody3D", "get_center_of_mass", 3360562783L), hostObject.objectPtr)

  /** RigidBody3D.set_physics_material_override */
  final def setPhysicsMaterialOverride(physics_material_override: PhysicsMaterial): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_physics_material_override", 1784508650L), hostObject.objectPtr, physics_material_override.hostObject)

  /** RigidBody3D.get_physics_material_override */
  final def getPhysicsMaterialOverride(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RigidBody3D", "get_physics_material_override", 2521850424L), hostObject.objectPtr)

  /** RigidBody3D.set_linear_velocity */
  final def setLinearVelocity(linear_velocity: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_linear_velocity", 3460891852L), hostObject.objectPtr, linear_velocity)

  /** RigidBody3D.get_linear_velocity */
  final def getLinearVelocity(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("RigidBody3D", "get_linear_velocity", 3360562783L), hostObject.objectPtr)

  /** RigidBody3D.set_angular_velocity */
  final def setAngularVelocity(angular_velocity: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_angular_velocity", 3460891852L), hostObject.objectPtr, angular_velocity)

  /** RigidBody3D.get_angular_velocity */
  final def getAngularVelocity(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("RigidBody3D", "get_angular_velocity", 3360562783L), hostObject.objectPtr)

  /** RigidBody3D.get_inverse_inertia_tensor */
  final def getInverseInertiaTensor(): io.github.optical002.godot.builtin.Basis =
    Ptrcall.call0[io.github.optical002.godot.builtin.Basis](MethodBind.get("RigidBody3D", "get_inverse_inertia_tensor", 2716978435L), hostObject.objectPtr)

  /** RigidBody3D.set_gravity_scale */
  final def setGravityScale(gravity_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_gravity_scale", 373806689L), hostObject.objectPtr, gravity_scale)

  /** RigidBody3D.get_gravity_scale */
  final def getGravityScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("RigidBody3D", "get_gravity_scale", 1740695150L), hostObject.objectPtr)

  /** RigidBody3D.set_linear_damp_mode */
  final def setLinearDampMode(linear_damp_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_linear_damp_mode", 1802035050L), hostObject.objectPtr, linear_damp_mode)

  /** RigidBody3D.get_linear_damp_mode */
  final def getLinearDampMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("RigidBody3D", "get_linear_damp_mode", 1366206940L), hostObject.objectPtr)

  /** RigidBody3D.set_angular_damp_mode */
  final def setAngularDampMode(angular_damp_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_angular_damp_mode", 1802035050L), hostObject.objectPtr, angular_damp_mode)

  /** RigidBody3D.get_angular_damp_mode */
  final def getAngularDampMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("RigidBody3D", "get_angular_damp_mode", 1366206940L), hostObject.objectPtr)

  /** RigidBody3D.set_linear_damp */
  final def setLinearDamp(linear_damp: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_linear_damp", 373806689L), hostObject.objectPtr, linear_damp)

  /** RigidBody3D.get_linear_damp */
  final def getLinearDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("RigidBody3D", "get_linear_damp", 1740695150L), hostObject.objectPtr)

  /** RigidBody3D.set_angular_damp */
  final def setAngularDamp(angular_damp: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_angular_damp", 373806689L), hostObject.objectPtr, angular_damp)

  /** RigidBody3D.get_angular_damp */
  final def getAngularDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("RigidBody3D", "get_angular_damp", 1740695150L), hostObject.objectPtr)

  /** RigidBody3D.set_max_contacts_reported */
  final def setMaxContactsReported(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_max_contacts_reported", 1286410249L), hostObject.objectPtr, amount)

  /** RigidBody3D.get_max_contacts_reported */
  final def getMaxContactsReported(): Long =
    Ptrcall.call0[Long](MethodBind.get("RigidBody3D", "get_max_contacts_reported", 3905245786L), hostObject.objectPtr)

  /** RigidBody3D.get_contact_count */
  final def getContactCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RigidBody3D", "get_contact_count", 3905245786L), hostObject.objectPtr)

  /** RigidBody3D.set_use_custom_integrator */
  final def setUseCustomIntegrator(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_use_custom_integrator", 2586408642L), hostObject.objectPtr, enable)

  /** RigidBody3D.is_using_custom_integrator */
  final def isUsingCustomIntegrator(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RigidBody3D", "is_using_custom_integrator", 2240911060L), hostObject.objectPtr)

  /** RigidBody3D.set_contact_monitor */
  final def setContactMonitor(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_contact_monitor", 2586408642L), hostObject.objectPtr, enabled)

  /** RigidBody3D.is_contact_monitor_enabled */
  final def isContactMonitorEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RigidBody3D", "is_contact_monitor_enabled", 36873697L), hostObject.objectPtr)

  /** RigidBody3D.set_use_continuous_collision_detection */
  final def setUseContinuousCollisionDetection(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_use_continuous_collision_detection", 2586408642L), hostObject.objectPtr, enable)

  /** RigidBody3D.is_using_continuous_collision_detection */
  final def isUsingContinuousCollisionDetection(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RigidBody3D", "is_using_continuous_collision_detection", 36873697L), hostObject.objectPtr)

  /** RigidBody3D.set_axis_velocity */
  final def setAxisVelocity(axis_velocity: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_axis_velocity", 3460891852L), hostObject.objectPtr, axis_velocity)

  /** RigidBody3D.apply_central_impulse */
  final def applyCentralImpulse(impulse: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "apply_central_impulse", 3460891852L), hostObject.objectPtr, impulse)

  /** RigidBody3D.apply_impulse */
  final def applyImpulse(impulse: io.github.optical002.godot.builtin.Vector3, position: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("RigidBody3D", "apply_impulse", 2754756483L), hostObject.objectPtr, impulse, position)

  /** RigidBody3D.apply_torque_impulse */
  final def applyTorqueImpulse(impulse: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "apply_torque_impulse", 3460891852L), hostObject.objectPtr, impulse)

  /** RigidBody3D.apply_central_force */
  final def applyCentralForce(force: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "apply_central_force", 3460891852L), hostObject.objectPtr, force)

  /** RigidBody3D.apply_force */
  final def applyForce(force: io.github.optical002.godot.builtin.Vector3, position: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("RigidBody3D", "apply_force", 2754756483L), hostObject.objectPtr, force, position)

  /** RigidBody3D.apply_torque */
  final def applyTorque(torque: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "apply_torque", 3460891852L), hostObject.objectPtr, torque)

  /** RigidBody3D.add_constant_central_force */
  final def addConstantCentralForce(force: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "add_constant_central_force", 3460891852L), hostObject.objectPtr, force)

  /** RigidBody3D.add_constant_force */
  final def addConstantForce(force: io.github.optical002.godot.builtin.Vector3, position: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("RigidBody3D", "add_constant_force", 2754756483L), hostObject.objectPtr, force, position)

  /** RigidBody3D.add_constant_torque */
  final def addConstantTorque(torque: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "add_constant_torque", 3460891852L), hostObject.objectPtr, torque)

  /** RigidBody3D.set_constant_force */
  final def setConstantForce(force: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_constant_force", 3460891852L), hostObject.objectPtr, force)

  /** RigidBody3D.get_constant_force */
  final def getConstantForce(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("RigidBody3D", "get_constant_force", 3360562783L), hostObject.objectPtr)

  /** RigidBody3D.set_constant_torque */
  final def setConstantTorque(torque: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_constant_torque", 3460891852L), hostObject.objectPtr, torque)

  /** RigidBody3D.get_constant_torque */
  final def getConstantTorque(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("RigidBody3D", "get_constant_torque", 3360562783L), hostObject.objectPtr)

  /** RigidBody3D.set_sleeping */
  final def setSleeping(sleeping: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_sleeping", 2586408642L), hostObject.objectPtr, sleeping)

  /** RigidBody3D.is_sleeping */
  final def isSleeping(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RigidBody3D", "is_sleeping", 36873697L), hostObject.objectPtr)

  /** RigidBody3D.set_can_sleep */
  final def setCanSleep(able_to_sleep: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_can_sleep", 2586408642L), hostObject.objectPtr, able_to_sleep)

  /** RigidBody3D.is_able_to_sleep */
  final def isAbleToSleep(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RigidBody3D", "is_able_to_sleep", 36873697L), hostObject.objectPtr)

  /** RigidBody3D.set_lock_rotation_enabled */
  final def setLockRotationEnabled(lock_rotation: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_lock_rotation_enabled", 2586408642L), hostObject.objectPtr, lock_rotation)

  /** RigidBody3D.is_lock_rotation_enabled */
  final def isLockRotationEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RigidBody3D", "is_lock_rotation_enabled", 36873697L), hostObject.objectPtr)

  /** RigidBody3D.set_freeze_enabled */
  final def setFreezeEnabled(freeze_mode: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_freeze_enabled", 2586408642L), hostObject.objectPtr, freeze_mode)

  /** RigidBody3D.is_freeze_enabled */
  final def isFreezeEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RigidBody3D", "is_freeze_enabled", 36873697L), hostObject.objectPtr)

  /** RigidBody3D.set_freeze_mode */
  final def setFreezeMode(freeze_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody3D", "set_freeze_mode", 1319914653L), hostObject.objectPtr, freeze_mode)

  /** RigidBody3D.get_freeze_mode */
  final def getFreezeMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("RigidBody3D", "get_freeze_mode", 2008423905L), hostObject.objectPtr)

}

object RigidBody3D {
  /** Class metadata for Gd[RigidBody3D] lifetime management and casting. */
  given GodotClass[RigidBody3D] with {
    def className = "RigidBody3D"
    def isRefCounted = false
    def wrap(o: GodotObject): RigidBody3D = new RigidBody3D {}.withHost(o.objectPtr)
    def unwrap(t: RigidBody3D): GodotObject = t.hostObject
  }
}
