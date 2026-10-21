package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RigidBody3D`, extends `PhysicsBody3D`. */
abstract class RigidBody3D extends PhysicsBody3D {
  override def godotClassName: String = "RigidBody3D"

  /** RigidBody3D.set_mass */
  final def setMass(mass: Double): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_mass == null) gdext.classes.RigidBody3D.mb_set_mass = MethodBind.get("RigidBody3D", "set_mass", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_mass, livePtr, mass)
  }

  /** RigidBody3D.get_mass */
  final def getMass(): Double = {
    if (gdext.classes.RigidBody3D.mb_get_mass == null) gdext.classes.RigidBody3D.mb_get_mass = MethodBind.get("RigidBody3D", "get_mass", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RigidBody3D.mb_get_mass, livePtr)
  }

  /** RigidBody3D.set_inertia */
  final def setInertia(inertia: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_inertia == null) gdext.classes.RigidBody3D.mb_set_inertia = MethodBind.get("RigidBody3D", "set_inertia", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_inertia, livePtr, inertia)
  }

  /** RigidBody3D.get_inertia */
  final def getInertia(): gdext.builtin.Vector3 = {
    if (gdext.classes.RigidBody3D.mb_get_inertia == null) gdext.classes.RigidBody3D.mb_get_inertia = MethodBind.get("RigidBody3D", "get_inertia", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.RigidBody3D.mb_get_inertia, livePtr)
  }

  /** RigidBody3D.set_center_of_mass_mode */
  final def setCenterOfMassMode(mode: Long): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_center_of_mass_mode == null) gdext.classes.RigidBody3D.mb_set_center_of_mass_mode = MethodBind.get("RigidBody3D", "set_center_of_mass_mode", 3625866032L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_center_of_mass_mode, livePtr, mode)
  }

  /** RigidBody3D.get_center_of_mass_mode */
  final def getCenterOfMassMode(): Long = {
    if (gdext.classes.RigidBody3D.mb_get_center_of_mass_mode == null) gdext.classes.RigidBody3D.mb_get_center_of_mass_mode = MethodBind.get("RigidBody3D", "get_center_of_mass_mode", 237405040L)
    Ptrcall.call0[Long](gdext.classes.RigidBody3D.mb_get_center_of_mass_mode, livePtr)
  }

  /** RigidBody3D.set_center_of_mass */
  final def setCenterOfMass(center_of_mass: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_center_of_mass == null) gdext.classes.RigidBody3D.mb_set_center_of_mass = MethodBind.get("RigidBody3D", "set_center_of_mass", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_center_of_mass, livePtr, center_of_mass)
  }

  /** RigidBody3D.get_center_of_mass */
  final def getCenterOfMass(): gdext.builtin.Vector3 = {
    if (gdext.classes.RigidBody3D.mb_get_center_of_mass == null) gdext.classes.RigidBody3D.mb_get_center_of_mass = MethodBind.get("RigidBody3D", "get_center_of_mass", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.RigidBody3D.mb_get_center_of_mass, livePtr)
  }

  /** RigidBody3D.set_physics_material_override */
  final def setPhysicsMaterialOverride(physics_material_override: PhysicsMaterial): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_physics_material_override == null) gdext.classes.RigidBody3D.mb_set_physics_material_override = MethodBind.get("RigidBody3D", "set_physics_material_override", 1784508650L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_physics_material_override, livePtr, Wrappers.handle(physics_material_override))
  }

  /** RigidBody3D.get_physics_material_override. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPhysicsMaterialOverride(): PhysicsMaterial = {
    if (gdext.classes.RigidBody3D.mb_get_physics_material_override == null) gdext.classes.RigidBody3D.mb_get_physics_material_override = MethodBind.get("RigidBody3D", "get_physics_material_override", 2521850424L)
    Wrappers.owned[PhysicsMaterial](Ptrcall.call0[Long](gdext.classes.RigidBody3D.mb_get_physics_material_override, livePtr))
  }

  /** RigidBody3D.set_linear_velocity */
  final def setLinearVelocity(linear_velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_linear_velocity == null) gdext.classes.RigidBody3D.mb_set_linear_velocity = MethodBind.get("RigidBody3D", "set_linear_velocity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_linear_velocity, livePtr, linear_velocity)
  }

  /** RigidBody3D.get_linear_velocity */
  final def getLinearVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.RigidBody3D.mb_get_linear_velocity == null) gdext.classes.RigidBody3D.mb_get_linear_velocity = MethodBind.get("RigidBody3D", "get_linear_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.RigidBody3D.mb_get_linear_velocity, livePtr)
  }

  /** RigidBody3D.set_angular_velocity */
  final def setAngularVelocity(angular_velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_angular_velocity == null) gdext.classes.RigidBody3D.mb_set_angular_velocity = MethodBind.get("RigidBody3D", "set_angular_velocity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_angular_velocity, livePtr, angular_velocity)
  }

  /** RigidBody3D.get_angular_velocity */
  final def getAngularVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.RigidBody3D.mb_get_angular_velocity == null) gdext.classes.RigidBody3D.mb_get_angular_velocity = MethodBind.get("RigidBody3D", "get_angular_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.RigidBody3D.mb_get_angular_velocity, livePtr)
  }

  /** RigidBody3D.get_inverse_inertia_tensor */
  final def getInverseInertiaTensor(): gdext.builtin.Basis = {
    if (gdext.classes.RigidBody3D.mb_get_inverse_inertia_tensor == null) gdext.classes.RigidBody3D.mb_get_inverse_inertia_tensor = MethodBind.get("RigidBody3D", "get_inverse_inertia_tensor", 2716978435L)
    Ptrcall.call0[gdext.builtin.Basis](gdext.classes.RigidBody3D.mb_get_inverse_inertia_tensor, livePtr)
  }

  /** RigidBody3D.set_gravity_scale */
  final def setGravityScale(gravity_scale: Double): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_gravity_scale == null) gdext.classes.RigidBody3D.mb_set_gravity_scale = MethodBind.get("RigidBody3D", "set_gravity_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_gravity_scale, livePtr, gravity_scale)
  }

  /** RigidBody3D.get_gravity_scale */
  final def getGravityScale(): Double = {
    if (gdext.classes.RigidBody3D.mb_get_gravity_scale == null) gdext.classes.RigidBody3D.mb_get_gravity_scale = MethodBind.get("RigidBody3D", "get_gravity_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RigidBody3D.mb_get_gravity_scale, livePtr)
  }

  /** RigidBody3D.set_linear_damp_mode */
  final def setLinearDampMode(linear_damp_mode: Long): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_linear_damp_mode == null) gdext.classes.RigidBody3D.mb_set_linear_damp_mode = MethodBind.get("RigidBody3D", "set_linear_damp_mode", 1802035050L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_linear_damp_mode, livePtr, linear_damp_mode)
  }

  /** RigidBody3D.get_linear_damp_mode */
  final def getLinearDampMode(): Long = {
    if (gdext.classes.RigidBody3D.mb_get_linear_damp_mode == null) gdext.classes.RigidBody3D.mb_get_linear_damp_mode = MethodBind.get("RigidBody3D", "get_linear_damp_mode", 1366206940L)
    Ptrcall.call0[Long](gdext.classes.RigidBody3D.mb_get_linear_damp_mode, livePtr)
  }

  /** RigidBody3D.set_angular_damp_mode */
  final def setAngularDampMode(angular_damp_mode: Long): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_angular_damp_mode == null) gdext.classes.RigidBody3D.mb_set_angular_damp_mode = MethodBind.get("RigidBody3D", "set_angular_damp_mode", 1802035050L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_angular_damp_mode, livePtr, angular_damp_mode)
  }

  /** RigidBody3D.get_angular_damp_mode */
  final def getAngularDampMode(): Long = {
    if (gdext.classes.RigidBody3D.mb_get_angular_damp_mode == null) gdext.classes.RigidBody3D.mb_get_angular_damp_mode = MethodBind.get("RigidBody3D", "get_angular_damp_mode", 1366206940L)
    Ptrcall.call0[Long](gdext.classes.RigidBody3D.mb_get_angular_damp_mode, livePtr)
  }

  /** RigidBody3D.set_linear_damp */
  final def setLinearDamp(linear_damp: Double): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_linear_damp == null) gdext.classes.RigidBody3D.mb_set_linear_damp = MethodBind.get("RigidBody3D", "set_linear_damp", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_linear_damp, livePtr, linear_damp)
  }

  /** RigidBody3D.get_linear_damp */
  final def getLinearDamp(): Double = {
    if (gdext.classes.RigidBody3D.mb_get_linear_damp == null) gdext.classes.RigidBody3D.mb_get_linear_damp = MethodBind.get("RigidBody3D", "get_linear_damp", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RigidBody3D.mb_get_linear_damp, livePtr)
  }

  /** RigidBody3D.set_angular_damp */
  final def setAngularDamp(angular_damp: Double): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_angular_damp == null) gdext.classes.RigidBody3D.mb_set_angular_damp = MethodBind.get("RigidBody3D", "set_angular_damp", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_angular_damp, livePtr, angular_damp)
  }

  /** RigidBody3D.get_angular_damp */
  final def getAngularDamp(): Double = {
    if (gdext.classes.RigidBody3D.mb_get_angular_damp == null) gdext.classes.RigidBody3D.mb_get_angular_damp = MethodBind.get("RigidBody3D", "get_angular_damp", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RigidBody3D.mb_get_angular_damp, livePtr)
  }

  /** RigidBody3D.set_max_contacts_reported */
  final def setMaxContactsReported(amount: Long): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_max_contacts_reported == null) gdext.classes.RigidBody3D.mb_set_max_contacts_reported = MethodBind.get("RigidBody3D", "set_max_contacts_reported", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_max_contacts_reported, livePtr, amount)
  }

  /** RigidBody3D.get_max_contacts_reported */
  final def getMaxContactsReported(): Long = {
    if (gdext.classes.RigidBody3D.mb_get_max_contacts_reported == null) gdext.classes.RigidBody3D.mb_get_max_contacts_reported = MethodBind.get("RigidBody3D", "get_max_contacts_reported", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RigidBody3D.mb_get_max_contacts_reported, livePtr)
  }

  /** RigidBody3D.get_contact_count */
  final def getContactCount(): Long = {
    if (gdext.classes.RigidBody3D.mb_get_contact_count == null) gdext.classes.RigidBody3D.mb_get_contact_count = MethodBind.get("RigidBody3D", "get_contact_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RigidBody3D.mb_get_contact_count, livePtr)
  }

  /** RigidBody3D.set_use_custom_integrator */
  final def setUseCustomIntegrator(enable: Boolean): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_use_custom_integrator == null) gdext.classes.RigidBody3D.mb_set_use_custom_integrator = MethodBind.get("RigidBody3D", "set_use_custom_integrator", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_use_custom_integrator, livePtr, enable)
  }

  /** RigidBody3D.is_using_custom_integrator */
  final def isUsingCustomIntegrator(): Boolean = {
    if (gdext.classes.RigidBody3D.mb_is_using_custom_integrator == null) gdext.classes.RigidBody3D.mb_is_using_custom_integrator = MethodBind.get("RigidBody3D", "is_using_custom_integrator", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.RigidBody3D.mb_is_using_custom_integrator, livePtr)
  }

  /** RigidBody3D.set_contact_monitor */
  final def setContactMonitor(enabled: Boolean): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_contact_monitor == null) gdext.classes.RigidBody3D.mb_set_contact_monitor = MethodBind.get("RigidBody3D", "set_contact_monitor", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_contact_monitor, livePtr, enabled)
  }

  /** RigidBody3D.is_contact_monitor_enabled */
  final def isContactMonitorEnabled(): Boolean = {
    if (gdext.classes.RigidBody3D.mb_is_contact_monitor_enabled == null) gdext.classes.RigidBody3D.mb_is_contact_monitor_enabled = MethodBind.get("RigidBody3D", "is_contact_monitor_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RigidBody3D.mb_is_contact_monitor_enabled, livePtr)
  }

  /** RigidBody3D.set_use_continuous_collision_detection */
  final def setUseContinuousCollisionDetection(enable: Boolean): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_use_continuous_collision_detection == null) gdext.classes.RigidBody3D.mb_set_use_continuous_collision_detection = MethodBind.get("RigidBody3D", "set_use_continuous_collision_detection", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_use_continuous_collision_detection, livePtr, enable)
  }

  /** RigidBody3D.is_using_continuous_collision_detection */
  final def isUsingContinuousCollisionDetection(): Boolean = {
    if (gdext.classes.RigidBody3D.mb_is_using_continuous_collision_detection == null) gdext.classes.RigidBody3D.mb_is_using_continuous_collision_detection = MethodBind.get("RigidBody3D", "is_using_continuous_collision_detection", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RigidBody3D.mb_is_using_continuous_collision_detection, livePtr)
  }

  /** RigidBody3D.set_axis_velocity */
  final def setAxisVelocity(axis_velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_axis_velocity == null) gdext.classes.RigidBody3D.mb_set_axis_velocity = MethodBind.get("RigidBody3D", "set_axis_velocity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_axis_velocity, livePtr, axis_velocity)
  }

  /** RigidBody3D.apply_central_impulse */
  final def applyCentralImpulse(impulse: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_apply_central_impulse == null) gdext.classes.RigidBody3D.mb_apply_central_impulse = MethodBind.get("RigidBody3D", "apply_central_impulse", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_apply_central_impulse, livePtr, impulse)
  }

  /** RigidBody3D.apply_impulse */
  final def applyImpulse(impulse: gdext.builtin.Vector3, position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_apply_impulse == null) gdext.classes.RigidBody3D.mb_apply_impulse = MethodBind.get("RigidBody3D", "apply_impulse", 2754756483L)
    Ptrcall.callVoid2(gdext.classes.RigidBody3D.mb_apply_impulse, livePtr, impulse, position)
  }

  /** RigidBody3D.apply_torque_impulse */
  final def applyTorqueImpulse(impulse: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_apply_torque_impulse == null) gdext.classes.RigidBody3D.mb_apply_torque_impulse = MethodBind.get("RigidBody3D", "apply_torque_impulse", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_apply_torque_impulse, livePtr, impulse)
  }

  /** RigidBody3D.apply_central_force */
  final def applyCentralForce(force: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_apply_central_force == null) gdext.classes.RigidBody3D.mb_apply_central_force = MethodBind.get("RigidBody3D", "apply_central_force", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_apply_central_force, livePtr, force)
  }

  /** RigidBody3D.apply_force */
  final def applyForce(force: gdext.builtin.Vector3, position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_apply_force == null) gdext.classes.RigidBody3D.mb_apply_force = MethodBind.get("RigidBody3D", "apply_force", 2754756483L)
    Ptrcall.callVoid2(gdext.classes.RigidBody3D.mb_apply_force, livePtr, force, position)
  }

  /** RigidBody3D.apply_torque */
  final def applyTorque(torque: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_apply_torque == null) gdext.classes.RigidBody3D.mb_apply_torque = MethodBind.get("RigidBody3D", "apply_torque", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_apply_torque, livePtr, torque)
  }

  /** RigidBody3D.add_constant_central_force */
  final def addConstantCentralForce(force: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_add_constant_central_force == null) gdext.classes.RigidBody3D.mb_add_constant_central_force = MethodBind.get("RigidBody3D", "add_constant_central_force", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_add_constant_central_force, livePtr, force)
  }

  /** RigidBody3D.add_constant_force */
  final def addConstantForce(force: gdext.builtin.Vector3, position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_add_constant_force == null) gdext.classes.RigidBody3D.mb_add_constant_force = MethodBind.get("RigidBody3D", "add_constant_force", 2754756483L)
    Ptrcall.callVoid2(gdext.classes.RigidBody3D.mb_add_constant_force, livePtr, force, position)
  }

  /** RigidBody3D.add_constant_torque */
  final def addConstantTorque(torque: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_add_constant_torque == null) gdext.classes.RigidBody3D.mb_add_constant_torque = MethodBind.get("RigidBody3D", "add_constant_torque", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_add_constant_torque, livePtr, torque)
  }

  /** RigidBody3D.set_constant_force */
  final def setConstantForce(force: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_constant_force == null) gdext.classes.RigidBody3D.mb_set_constant_force = MethodBind.get("RigidBody3D", "set_constant_force", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_constant_force, livePtr, force)
  }

  /** RigidBody3D.get_constant_force */
  final def getConstantForce(): gdext.builtin.Vector3 = {
    if (gdext.classes.RigidBody3D.mb_get_constant_force == null) gdext.classes.RigidBody3D.mb_get_constant_force = MethodBind.get("RigidBody3D", "get_constant_force", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.RigidBody3D.mb_get_constant_force, livePtr)
  }

  /** RigidBody3D.set_constant_torque */
  final def setConstantTorque(torque: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_constant_torque == null) gdext.classes.RigidBody3D.mb_set_constant_torque = MethodBind.get("RigidBody3D", "set_constant_torque", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_constant_torque, livePtr, torque)
  }

  /** RigidBody3D.get_constant_torque */
  final def getConstantTorque(): gdext.builtin.Vector3 = {
    if (gdext.classes.RigidBody3D.mb_get_constant_torque == null) gdext.classes.RigidBody3D.mb_get_constant_torque = MethodBind.get("RigidBody3D", "get_constant_torque", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.RigidBody3D.mb_get_constant_torque, livePtr)
  }

  /** RigidBody3D.set_sleeping */
  final def setSleeping(sleeping: Boolean): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_sleeping == null) gdext.classes.RigidBody3D.mb_set_sleeping = MethodBind.get("RigidBody3D", "set_sleeping", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_sleeping, livePtr, sleeping)
  }

  /** RigidBody3D.is_sleeping */
  final def isSleeping(): Boolean = {
    if (gdext.classes.RigidBody3D.mb_is_sleeping == null) gdext.classes.RigidBody3D.mb_is_sleeping = MethodBind.get("RigidBody3D", "is_sleeping", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RigidBody3D.mb_is_sleeping, livePtr)
  }

  /** RigidBody3D.set_can_sleep */
  final def setCanSleep(able_to_sleep: Boolean): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_can_sleep == null) gdext.classes.RigidBody3D.mb_set_can_sleep = MethodBind.get("RigidBody3D", "set_can_sleep", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_can_sleep, livePtr, able_to_sleep)
  }

  /** RigidBody3D.is_able_to_sleep */
  final def isAbleToSleep(): Boolean = {
    if (gdext.classes.RigidBody3D.mb_is_able_to_sleep == null) gdext.classes.RigidBody3D.mb_is_able_to_sleep = MethodBind.get("RigidBody3D", "is_able_to_sleep", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RigidBody3D.mb_is_able_to_sleep, livePtr)
  }

  /** RigidBody3D.set_lock_rotation_enabled */
  final def setLockRotationEnabled(lock_rotation: Boolean): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_lock_rotation_enabled == null) gdext.classes.RigidBody3D.mb_set_lock_rotation_enabled = MethodBind.get("RigidBody3D", "set_lock_rotation_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_lock_rotation_enabled, livePtr, lock_rotation)
  }

  /** RigidBody3D.is_lock_rotation_enabled */
  final def isLockRotationEnabled(): Boolean = {
    if (gdext.classes.RigidBody3D.mb_is_lock_rotation_enabled == null) gdext.classes.RigidBody3D.mb_is_lock_rotation_enabled = MethodBind.get("RigidBody3D", "is_lock_rotation_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RigidBody3D.mb_is_lock_rotation_enabled, livePtr)
  }

  /** RigidBody3D.set_freeze_enabled */
  final def setFreezeEnabled(freeze_mode: Boolean): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_freeze_enabled == null) gdext.classes.RigidBody3D.mb_set_freeze_enabled = MethodBind.get("RigidBody3D", "set_freeze_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_freeze_enabled, livePtr, freeze_mode)
  }

  /** RigidBody3D.is_freeze_enabled */
  final def isFreezeEnabled(): Boolean = {
    if (gdext.classes.RigidBody3D.mb_is_freeze_enabled == null) gdext.classes.RigidBody3D.mb_is_freeze_enabled = MethodBind.get("RigidBody3D", "is_freeze_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RigidBody3D.mb_is_freeze_enabled, livePtr)
  }

  /** RigidBody3D.set_freeze_mode */
  final def setFreezeMode(freeze_mode: Long): Unit = {
    if (gdext.classes.RigidBody3D.mb_set_freeze_mode == null) gdext.classes.RigidBody3D.mb_set_freeze_mode = MethodBind.get("RigidBody3D", "set_freeze_mode", 1319914653L)
    Ptrcall.callVoid1(gdext.classes.RigidBody3D.mb_set_freeze_mode, livePtr, freeze_mode)
  }

  /** RigidBody3D.get_freeze_mode */
  final def getFreezeMode(): Long = {
    if (gdext.classes.RigidBody3D.mb_get_freeze_mode == null) gdext.classes.RigidBody3D.mb_get_freeze_mode = MethodBind.get("RigidBody3D", "get_freeze_mode", 2008423905L)
    Ptrcall.call0[Long](gdext.classes.RigidBody3D.mb_get_freeze_mode, livePtr)
  }

}

object RigidBody3D {
  private[classes] var mb_set_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_inertia: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inertia: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_center_of_mass_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_of_mass_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_center_of_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_of_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_material_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_material_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inverse_inertia_tensor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_linear_damp_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_linear_damp_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_angular_damp_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angular_damp_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_linear_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_linear_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_angular_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angular_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_contacts_reported: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_contacts_reported: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_custom_integrator: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_custom_integrator: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_contact_monitor: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_contact_monitor_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_continuous_collision_detection: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_continuous_collision_detection: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_axis_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_central_impulse: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_impulse: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_torque_impulse: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_central_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_torque: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_constant_central_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_constant_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_constant_torque: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_constant_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_constant_torque: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant_torque: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sleeping: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_sleeping: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_can_sleep: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_able_to_sleep: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lock_rotation_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_lock_rotation_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_freeze_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_freeze_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_freeze_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_freeze_mode: GDExtensionMethodBindPtr = null
}
