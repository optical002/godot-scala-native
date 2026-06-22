package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RigidBody2D`, extends `PhysicsBody2D`. */
abstract class RigidBody2D extends PhysicsBody2D {

  /** RigidBody2D.set_mass */
  final def setMass(mass: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_mass", 373806689L), hostObject.objectPtr, mass)

  /** RigidBody2D.get_mass */
  final def getMass(): Double =
    Ptrcall.call0[Double](MethodBind.get("RigidBody2D", "get_mass", 1740695150L), hostObject.objectPtr)

  /** RigidBody2D.get_inertia */
  final def getInertia(): Double =
    Ptrcall.call0[Double](MethodBind.get("RigidBody2D", "get_inertia", 1740695150L), hostObject.objectPtr)

  /** RigidBody2D.set_inertia */
  final def setInertia(inertia: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_inertia", 373806689L), hostObject.objectPtr, inertia)

  /** RigidBody2D.set_center_of_mass_mode */
  final def setCenterOfMassMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_center_of_mass_mode", 1757235706L), hostObject.objectPtr, mode)

  /** RigidBody2D.get_center_of_mass_mode */
  final def getCenterOfMassMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("RigidBody2D", "get_center_of_mass_mode", 3277132817L), hostObject.objectPtr)

  /** RigidBody2D.set_center_of_mass */
  final def setCenterOfMass(center_of_mass: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_center_of_mass", 743155724L), hostObject.objectPtr, center_of_mass)

  /** RigidBody2D.get_center_of_mass */
  final def getCenterOfMass(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("RigidBody2D", "get_center_of_mass", 3341600327L), hostObject.objectPtr)

  /** RigidBody2D.set_physics_material_override */
  final def setPhysicsMaterialOverride(physics_material_override: PhysicsMaterial): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_physics_material_override", 1784508650L), hostObject.objectPtr, physics_material_override.hostObject)

  /** RigidBody2D.get_physics_material_override */
  final def getPhysicsMaterialOverride(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RigidBody2D", "get_physics_material_override", 2521850424L), hostObject.objectPtr)

  /** RigidBody2D.set_gravity_scale */
  final def setGravityScale(gravity_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_gravity_scale", 373806689L), hostObject.objectPtr, gravity_scale)

  /** RigidBody2D.get_gravity_scale */
  final def getGravityScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("RigidBody2D", "get_gravity_scale", 1740695150L), hostObject.objectPtr)

  /** RigidBody2D.set_linear_damp_mode */
  final def setLinearDampMode(linear_damp_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_linear_damp_mode", 3406533708L), hostObject.objectPtr, linear_damp_mode)

  /** RigidBody2D.get_linear_damp_mode */
  final def getLinearDampMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("RigidBody2D", "get_linear_damp_mode", 2970511462L), hostObject.objectPtr)

  /** RigidBody2D.set_angular_damp_mode */
  final def setAngularDampMode(angular_damp_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_angular_damp_mode", 3406533708L), hostObject.objectPtr, angular_damp_mode)

  /** RigidBody2D.get_angular_damp_mode */
  final def getAngularDampMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("RigidBody2D", "get_angular_damp_mode", 2970511462L), hostObject.objectPtr)

  /** RigidBody2D.set_linear_damp */
  final def setLinearDamp(linear_damp: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_linear_damp", 373806689L), hostObject.objectPtr, linear_damp)

  /** RigidBody2D.get_linear_damp */
  final def getLinearDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("RigidBody2D", "get_linear_damp", 1740695150L), hostObject.objectPtr)

  /** RigidBody2D.set_angular_damp */
  final def setAngularDamp(angular_damp: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_angular_damp", 373806689L), hostObject.objectPtr, angular_damp)

  /** RigidBody2D.get_angular_damp */
  final def getAngularDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("RigidBody2D", "get_angular_damp", 1740695150L), hostObject.objectPtr)

  /** RigidBody2D.set_linear_velocity */
  final def setLinearVelocity(linear_velocity: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_linear_velocity", 743155724L), hostObject.objectPtr, linear_velocity)

  /** RigidBody2D.get_linear_velocity */
  final def getLinearVelocity(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("RigidBody2D", "get_linear_velocity", 3341600327L), hostObject.objectPtr)

  /** RigidBody2D.set_angular_velocity */
  final def setAngularVelocity(angular_velocity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_angular_velocity", 373806689L), hostObject.objectPtr, angular_velocity)

  /** RigidBody2D.get_angular_velocity */
  final def getAngularVelocity(): Double =
    Ptrcall.call0[Double](MethodBind.get("RigidBody2D", "get_angular_velocity", 1740695150L), hostObject.objectPtr)

  /** RigidBody2D.set_max_contacts_reported */
  final def setMaxContactsReported(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_max_contacts_reported", 1286410249L), hostObject.objectPtr, amount)

  /** RigidBody2D.get_max_contacts_reported */
  final def getMaxContactsReported(): Long =
    Ptrcall.call0[Long](MethodBind.get("RigidBody2D", "get_max_contacts_reported", 3905245786L), hostObject.objectPtr)

  /** RigidBody2D.get_contact_count */
  final def getContactCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RigidBody2D", "get_contact_count", 3905245786L), hostObject.objectPtr)

  /** RigidBody2D.set_use_custom_integrator */
  final def setUseCustomIntegrator(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_use_custom_integrator", 2586408642L), hostObject.objectPtr, enable)

  /** RigidBody2D.is_using_custom_integrator */
  final def isUsingCustomIntegrator(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RigidBody2D", "is_using_custom_integrator", 2240911060L), hostObject.objectPtr)

  /** RigidBody2D.set_contact_monitor */
  final def setContactMonitor(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_contact_monitor", 2586408642L), hostObject.objectPtr, enabled)

  /** RigidBody2D.is_contact_monitor_enabled */
  final def isContactMonitorEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RigidBody2D", "is_contact_monitor_enabled", 36873697L), hostObject.objectPtr)

  /** RigidBody2D.set_continuous_collision_detection_mode */
  final def setContinuousCollisionDetectionMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_continuous_collision_detection_mode", 1000241384L), hostObject.objectPtr, mode)

  /** RigidBody2D.get_continuous_collision_detection_mode */
  final def getContinuousCollisionDetectionMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("RigidBody2D", "get_continuous_collision_detection_mode", 815214376L), hostObject.objectPtr)

  /** RigidBody2D.set_axis_velocity */
  final def setAxisVelocity(axis_velocity: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_axis_velocity", 743155724L), hostObject.objectPtr, axis_velocity)

  /** RigidBody2D.apply_central_impulse */
  final def applyCentralImpulse(impulse: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "apply_central_impulse", 3862383994L), hostObject.objectPtr, impulse)

  /** RigidBody2D.apply_impulse */
  final def applyImpulse(impulse: gdext.builtin.Vector2, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("RigidBody2D", "apply_impulse", 4288681949L), hostObject.objectPtr, impulse, position)

  /** RigidBody2D.apply_torque_impulse */
  final def applyTorqueImpulse(torque: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "apply_torque_impulse", 373806689L), hostObject.objectPtr, torque)

  /** RigidBody2D.apply_central_force */
  final def applyCentralForce(force: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "apply_central_force", 743155724L), hostObject.objectPtr, force)

  /** RigidBody2D.apply_force */
  final def applyForce(force: gdext.builtin.Vector2, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("RigidBody2D", "apply_force", 4288681949L), hostObject.objectPtr, force, position)

  /** RigidBody2D.apply_torque */
  final def applyTorque(torque: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "apply_torque", 373806689L), hostObject.objectPtr, torque)

  /** RigidBody2D.add_constant_central_force */
  final def addConstantCentralForce(force: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "add_constant_central_force", 743155724L), hostObject.objectPtr, force)

  /** RigidBody2D.add_constant_force */
  final def addConstantForce(force: gdext.builtin.Vector2, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("RigidBody2D", "add_constant_force", 4288681949L), hostObject.objectPtr, force, position)

  /** RigidBody2D.add_constant_torque */
  final def addConstantTorque(torque: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "add_constant_torque", 373806689L), hostObject.objectPtr, torque)

  /** RigidBody2D.set_constant_force */
  final def setConstantForce(force: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_constant_force", 743155724L), hostObject.objectPtr, force)

  /** RigidBody2D.get_constant_force */
  final def getConstantForce(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("RigidBody2D", "get_constant_force", 3341600327L), hostObject.objectPtr)

  /** RigidBody2D.set_constant_torque */
  final def setConstantTorque(torque: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_constant_torque", 373806689L), hostObject.objectPtr, torque)

  /** RigidBody2D.get_constant_torque */
  final def getConstantTorque(): Double =
    Ptrcall.call0[Double](MethodBind.get("RigidBody2D", "get_constant_torque", 1740695150L), hostObject.objectPtr)

  /** RigidBody2D.set_sleeping */
  final def setSleeping(sleeping: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_sleeping", 2586408642L), hostObject.objectPtr, sleeping)

  /** RigidBody2D.is_sleeping */
  final def isSleeping(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RigidBody2D", "is_sleeping", 36873697L), hostObject.objectPtr)

  /** RigidBody2D.set_can_sleep */
  final def setCanSleep(able_to_sleep: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_can_sleep", 2586408642L), hostObject.objectPtr, able_to_sleep)

  /** RigidBody2D.is_able_to_sleep */
  final def isAbleToSleep(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RigidBody2D", "is_able_to_sleep", 36873697L), hostObject.objectPtr)

  /** RigidBody2D.set_lock_rotation_enabled */
  final def setLockRotationEnabled(lock_rotation: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_lock_rotation_enabled", 2586408642L), hostObject.objectPtr, lock_rotation)

  /** RigidBody2D.is_lock_rotation_enabled */
  final def isLockRotationEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RigidBody2D", "is_lock_rotation_enabled", 36873697L), hostObject.objectPtr)

  /** RigidBody2D.set_freeze_enabled */
  final def setFreezeEnabled(freeze_mode: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_freeze_enabled", 2586408642L), hostObject.objectPtr, freeze_mode)

  /** RigidBody2D.is_freeze_enabled */
  final def isFreezeEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RigidBody2D", "is_freeze_enabled", 36873697L), hostObject.objectPtr)

  /** RigidBody2D.set_freeze_mode */
  final def setFreezeMode(freeze_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RigidBody2D", "set_freeze_mode", 1705112154L), hostObject.objectPtr, freeze_mode)

  /** RigidBody2D.get_freeze_mode */
  final def getFreezeMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("RigidBody2D", "get_freeze_mode", 2016872314L), hostObject.objectPtr)

}

object RigidBody2D {
  /** Class metadata for Gd[RigidBody2D] lifetime management and casting. */
  given GodotClass[RigidBody2D] with {
    def className = "RigidBody2D"
    def isRefCounted = false
    def wrap(o: GodotObject): RigidBody2D = new RigidBody2D {}.withHost(o.objectPtr)
    def unwrap(t: RigidBody2D): GodotObject = t.hostObject
  }
}
