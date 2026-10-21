package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RigidBody2D`, extends `PhysicsBody2D`. */
abstract class RigidBody2D extends PhysicsBody2D {
  override def godotClassName: String = "RigidBody2D"

  /** RigidBody2D.set_mass */
  final def setMass(mass: Double): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_mass == null) gdext.classes.RigidBody2D.mb_set_mass = MethodBind.get("RigidBody2D", "set_mass", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_mass, livePtr, mass)
  }

  /** RigidBody2D.get_mass */
  final def getMass(): Double = {
    if (gdext.classes.RigidBody2D.mb_get_mass == null) gdext.classes.RigidBody2D.mb_get_mass = MethodBind.get("RigidBody2D", "get_mass", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RigidBody2D.mb_get_mass, livePtr)
  }

  /** RigidBody2D.get_inertia */
  final def getInertia(): Double = {
    if (gdext.classes.RigidBody2D.mb_get_inertia == null) gdext.classes.RigidBody2D.mb_get_inertia = MethodBind.get("RigidBody2D", "get_inertia", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RigidBody2D.mb_get_inertia, livePtr)
  }

  /** RigidBody2D.set_inertia */
  final def setInertia(inertia: Double): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_inertia == null) gdext.classes.RigidBody2D.mb_set_inertia = MethodBind.get("RigidBody2D", "set_inertia", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_inertia, livePtr, inertia)
  }

  /** RigidBody2D.set_center_of_mass_mode */
  final def setCenterOfMassMode(mode: Long): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_center_of_mass_mode == null) gdext.classes.RigidBody2D.mb_set_center_of_mass_mode = MethodBind.get("RigidBody2D", "set_center_of_mass_mode", 1757235706L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_center_of_mass_mode, livePtr, mode)
  }

  /** RigidBody2D.get_center_of_mass_mode */
  final def getCenterOfMassMode(): Long = {
    if (gdext.classes.RigidBody2D.mb_get_center_of_mass_mode == null) gdext.classes.RigidBody2D.mb_get_center_of_mass_mode = MethodBind.get("RigidBody2D", "get_center_of_mass_mode", 3277132817L)
    Ptrcall.call0[Long](gdext.classes.RigidBody2D.mb_get_center_of_mass_mode, livePtr)
  }

  /** RigidBody2D.set_center_of_mass */
  final def setCenterOfMass(center_of_mass: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_center_of_mass == null) gdext.classes.RigidBody2D.mb_set_center_of_mass = MethodBind.get("RigidBody2D", "set_center_of_mass", 743155724L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_center_of_mass, livePtr, center_of_mass)
  }

  /** RigidBody2D.get_center_of_mass */
  final def getCenterOfMass(): gdext.builtin.Vector2 = {
    if (gdext.classes.RigidBody2D.mb_get_center_of_mass == null) gdext.classes.RigidBody2D.mb_get_center_of_mass = MethodBind.get("RigidBody2D", "get_center_of_mass", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.RigidBody2D.mb_get_center_of_mass, livePtr)
  }

  /** RigidBody2D.set_physics_material_override */
  final def setPhysicsMaterialOverride(physics_material_override: PhysicsMaterial): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_physics_material_override == null) gdext.classes.RigidBody2D.mb_set_physics_material_override = MethodBind.get("RigidBody2D", "set_physics_material_override", 1784508650L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_physics_material_override, livePtr, Wrappers.handle(physics_material_override))
  }

  /** RigidBody2D.get_physics_material_override. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPhysicsMaterialOverride(): PhysicsMaterial = {
    if (gdext.classes.RigidBody2D.mb_get_physics_material_override == null) gdext.classes.RigidBody2D.mb_get_physics_material_override = MethodBind.get("RigidBody2D", "get_physics_material_override", 2521850424L)
    Wrappers.owned[PhysicsMaterial](Ptrcall.call0[Long](gdext.classes.RigidBody2D.mb_get_physics_material_override, livePtr))
  }

  /** RigidBody2D.set_gravity_scale */
  final def setGravityScale(gravity_scale: Double): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_gravity_scale == null) gdext.classes.RigidBody2D.mb_set_gravity_scale = MethodBind.get("RigidBody2D", "set_gravity_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_gravity_scale, livePtr, gravity_scale)
  }

  /** RigidBody2D.get_gravity_scale */
  final def getGravityScale(): Double = {
    if (gdext.classes.RigidBody2D.mb_get_gravity_scale == null) gdext.classes.RigidBody2D.mb_get_gravity_scale = MethodBind.get("RigidBody2D", "get_gravity_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RigidBody2D.mb_get_gravity_scale, livePtr)
  }

  /** RigidBody2D.set_linear_damp_mode */
  final def setLinearDampMode(linear_damp_mode: Long): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_linear_damp_mode == null) gdext.classes.RigidBody2D.mb_set_linear_damp_mode = MethodBind.get("RigidBody2D", "set_linear_damp_mode", 3406533708L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_linear_damp_mode, livePtr, linear_damp_mode)
  }

  /** RigidBody2D.get_linear_damp_mode */
  final def getLinearDampMode(): Long = {
    if (gdext.classes.RigidBody2D.mb_get_linear_damp_mode == null) gdext.classes.RigidBody2D.mb_get_linear_damp_mode = MethodBind.get("RigidBody2D", "get_linear_damp_mode", 2970511462L)
    Ptrcall.call0[Long](gdext.classes.RigidBody2D.mb_get_linear_damp_mode, livePtr)
  }

  /** RigidBody2D.set_angular_damp_mode */
  final def setAngularDampMode(angular_damp_mode: Long): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_angular_damp_mode == null) gdext.classes.RigidBody2D.mb_set_angular_damp_mode = MethodBind.get("RigidBody2D", "set_angular_damp_mode", 3406533708L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_angular_damp_mode, livePtr, angular_damp_mode)
  }

  /** RigidBody2D.get_angular_damp_mode */
  final def getAngularDampMode(): Long = {
    if (gdext.classes.RigidBody2D.mb_get_angular_damp_mode == null) gdext.classes.RigidBody2D.mb_get_angular_damp_mode = MethodBind.get("RigidBody2D", "get_angular_damp_mode", 2970511462L)
    Ptrcall.call0[Long](gdext.classes.RigidBody2D.mb_get_angular_damp_mode, livePtr)
  }

  /** RigidBody2D.set_linear_damp */
  final def setLinearDamp(linear_damp: Double): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_linear_damp == null) gdext.classes.RigidBody2D.mb_set_linear_damp = MethodBind.get("RigidBody2D", "set_linear_damp", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_linear_damp, livePtr, linear_damp)
  }

  /** RigidBody2D.get_linear_damp */
  final def getLinearDamp(): Double = {
    if (gdext.classes.RigidBody2D.mb_get_linear_damp == null) gdext.classes.RigidBody2D.mb_get_linear_damp = MethodBind.get("RigidBody2D", "get_linear_damp", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RigidBody2D.mb_get_linear_damp, livePtr)
  }

  /** RigidBody2D.set_angular_damp */
  final def setAngularDamp(angular_damp: Double): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_angular_damp == null) gdext.classes.RigidBody2D.mb_set_angular_damp = MethodBind.get("RigidBody2D", "set_angular_damp", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_angular_damp, livePtr, angular_damp)
  }

  /** RigidBody2D.get_angular_damp */
  final def getAngularDamp(): Double = {
    if (gdext.classes.RigidBody2D.mb_get_angular_damp == null) gdext.classes.RigidBody2D.mb_get_angular_damp = MethodBind.get("RigidBody2D", "get_angular_damp", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RigidBody2D.mb_get_angular_damp, livePtr)
  }

  /** RigidBody2D.set_linear_velocity */
  final def setLinearVelocity(linear_velocity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_linear_velocity == null) gdext.classes.RigidBody2D.mb_set_linear_velocity = MethodBind.get("RigidBody2D", "set_linear_velocity", 743155724L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_linear_velocity, livePtr, linear_velocity)
  }

  /** RigidBody2D.get_linear_velocity */
  final def getLinearVelocity(): gdext.builtin.Vector2 = {
    if (gdext.classes.RigidBody2D.mb_get_linear_velocity == null) gdext.classes.RigidBody2D.mb_get_linear_velocity = MethodBind.get("RigidBody2D", "get_linear_velocity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.RigidBody2D.mb_get_linear_velocity, livePtr)
  }

  /** RigidBody2D.set_angular_velocity */
  final def setAngularVelocity(angular_velocity: Double): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_angular_velocity == null) gdext.classes.RigidBody2D.mb_set_angular_velocity = MethodBind.get("RigidBody2D", "set_angular_velocity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_angular_velocity, livePtr, angular_velocity)
  }

  /** RigidBody2D.get_angular_velocity */
  final def getAngularVelocity(): Double = {
    if (gdext.classes.RigidBody2D.mb_get_angular_velocity == null) gdext.classes.RigidBody2D.mb_get_angular_velocity = MethodBind.get("RigidBody2D", "get_angular_velocity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RigidBody2D.mb_get_angular_velocity, livePtr)
  }

  /** RigidBody2D.set_max_contacts_reported */
  final def setMaxContactsReported(amount: Long): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_max_contacts_reported == null) gdext.classes.RigidBody2D.mb_set_max_contacts_reported = MethodBind.get("RigidBody2D", "set_max_contacts_reported", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_max_contacts_reported, livePtr, amount)
  }

  /** RigidBody2D.get_max_contacts_reported */
  final def getMaxContactsReported(): Long = {
    if (gdext.classes.RigidBody2D.mb_get_max_contacts_reported == null) gdext.classes.RigidBody2D.mb_get_max_contacts_reported = MethodBind.get("RigidBody2D", "get_max_contacts_reported", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RigidBody2D.mb_get_max_contacts_reported, livePtr)
  }

  /** RigidBody2D.get_contact_count */
  final def getContactCount(): Long = {
    if (gdext.classes.RigidBody2D.mb_get_contact_count == null) gdext.classes.RigidBody2D.mb_get_contact_count = MethodBind.get("RigidBody2D", "get_contact_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RigidBody2D.mb_get_contact_count, livePtr)
  }

  /** RigidBody2D.set_use_custom_integrator */
  final def setUseCustomIntegrator(enable: Boolean): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_use_custom_integrator == null) gdext.classes.RigidBody2D.mb_set_use_custom_integrator = MethodBind.get("RigidBody2D", "set_use_custom_integrator", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_use_custom_integrator, livePtr, enable)
  }

  /** RigidBody2D.is_using_custom_integrator */
  final def isUsingCustomIntegrator(): Boolean = {
    if (gdext.classes.RigidBody2D.mb_is_using_custom_integrator == null) gdext.classes.RigidBody2D.mb_is_using_custom_integrator = MethodBind.get("RigidBody2D", "is_using_custom_integrator", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.RigidBody2D.mb_is_using_custom_integrator, livePtr)
  }

  /** RigidBody2D.set_contact_monitor */
  final def setContactMonitor(enabled: Boolean): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_contact_monitor == null) gdext.classes.RigidBody2D.mb_set_contact_monitor = MethodBind.get("RigidBody2D", "set_contact_monitor", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_contact_monitor, livePtr, enabled)
  }

  /** RigidBody2D.is_contact_monitor_enabled */
  final def isContactMonitorEnabled(): Boolean = {
    if (gdext.classes.RigidBody2D.mb_is_contact_monitor_enabled == null) gdext.classes.RigidBody2D.mb_is_contact_monitor_enabled = MethodBind.get("RigidBody2D", "is_contact_monitor_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RigidBody2D.mb_is_contact_monitor_enabled, livePtr)
  }

  /** RigidBody2D.set_continuous_collision_detection_mode */
  final def setContinuousCollisionDetectionMode(mode: Long): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_continuous_collision_detection_mode == null) gdext.classes.RigidBody2D.mb_set_continuous_collision_detection_mode = MethodBind.get("RigidBody2D", "set_continuous_collision_detection_mode", 1000241384L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_continuous_collision_detection_mode, livePtr, mode)
  }

  /** RigidBody2D.get_continuous_collision_detection_mode */
  final def getContinuousCollisionDetectionMode(): Long = {
    if (gdext.classes.RigidBody2D.mb_get_continuous_collision_detection_mode == null) gdext.classes.RigidBody2D.mb_get_continuous_collision_detection_mode = MethodBind.get("RigidBody2D", "get_continuous_collision_detection_mode", 815214376L)
    Ptrcall.call0[Long](gdext.classes.RigidBody2D.mb_get_continuous_collision_detection_mode, livePtr)
  }

  /** RigidBody2D.set_axis_velocity */
  final def setAxisVelocity(axis_velocity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_axis_velocity == null) gdext.classes.RigidBody2D.mb_set_axis_velocity = MethodBind.get("RigidBody2D", "set_axis_velocity", 743155724L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_axis_velocity, livePtr, axis_velocity)
  }

  /** RigidBody2D.apply_central_impulse */
  final def applyCentralImpulse(impulse: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.RigidBody2D.mb_apply_central_impulse == null) gdext.classes.RigidBody2D.mb_apply_central_impulse = MethodBind.get("RigidBody2D", "apply_central_impulse", 3862383994L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_apply_central_impulse, livePtr, impulse)
  }

  /** RigidBody2D.apply_impulse */
  final def applyImpulse(impulse: gdext.builtin.Vector2, position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.RigidBody2D.mb_apply_impulse == null) gdext.classes.RigidBody2D.mb_apply_impulse = MethodBind.get("RigidBody2D", "apply_impulse", 4288681949L)
    Ptrcall.callVoid2(gdext.classes.RigidBody2D.mb_apply_impulse, livePtr, impulse, position)
  }

  /** RigidBody2D.apply_torque_impulse */
  final def applyTorqueImpulse(torque: Double): Unit = {
    if (gdext.classes.RigidBody2D.mb_apply_torque_impulse == null) gdext.classes.RigidBody2D.mb_apply_torque_impulse = MethodBind.get("RigidBody2D", "apply_torque_impulse", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_apply_torque_impulse, livePtr, torque)
  }

  /** RigidBody2D.apply_central_force */
  final def applyCentralForce(force: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.RigidBody2D.mb_apply_central_force == null) gdext.classes.RigidBody2D.mb_apply_central_force = MethodBind.get("RigidBody2D", "apply_central_force", 743155724L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_apply_central_force, livePtr, force)
  }

  /** RigidBody2D.apply_force */
  final def applyForce(force: gdext.builtin.Vector2, position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.RigidBody2D.mb_apply_force == null) gdext.classes.RigidBody2D.mb_apply_force = MethodBind.get("RigidBody2D", "apply_force", 4288681949L)
    Ptrcall.callVoid2(gdext.classes.RigidBody2D.mb_apply_force, livePtr, force, position)
  }

  /** RigidBody2D.apply_torque */
  final def applyTorque(torque: Double): Unit = {
    if (gdext.classes.RigidBody2D.mb_apply_torque == null) gdext.classes.RigidBody2D.mb_apply_torque = MethodBind.get("RigidBody2D", "apply_torque", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_apply_torque, livePtr, torque)
  }

  /** RigidBody2D.add_constant_central_force */
  final def addConstantCentralForce(force: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.RigidBody2D.mb_add_constant_central_force == null) gdext.classes.RigidBody2D.mb_add_constant_central_force = MethodBind.get("RigidBody2D", "add_constant_central_force", 743155724L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_add_constant_central_force, livePtr, force)
  }

  /** RigidBody2D.add_constant_force */
  final def addConstantForce(force: gdext.builtin.Vector2, position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.RigidBody2D.mb_add_constant_force == null) gdext.classes.RigidBody2D.mb_add_constant_force = MethodBind.get("RigidBody2D", "add_constant_force", 4288681949L)
    Ptrcall.callVoid2(gdext.classes.RigidBody2D.mb_add_constant_force, livePtr, force, position)
  }

  /** RigidBody2D.add_constant_torque */
  final def addConstantTorque(torque: Double): Unit = {
    if (gdext.classes.RigidBody2D.mb_add_constant_torque == null) gdext.classes.RigidBody2D.mb_add_constant_torque = MethodBind.get("RigidBody2D", "add_constant_torque", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_add_constant_torque, livePtr, torque)
  }

  /** RigidBody2D.set_constant_force */
  final def setConstantForce(force: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_constant_force == null) gdext.classes.RigidBody2D.mb_set_constant_force = MethodBind.get("RigidBody2D", "set_constant_force", 743155724L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_constant_force, livePtr, force)
  }

  /** RigidBody2D.get_constant_force */
  final def getConstantForce(): gdext.builtin.Vector2 = {
    if (gdext.classes.RigidBody2D.mb_get_constant_force == null) gdext.classes.RigidBody2D.mb_get_constant_force = MethodBind.get("RigidBody2D", "get_constant_force", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.RigidBody2D.mb_get_constant_force, livePtr)
  }

  /** RigidBody2D.set_constant_torque */
  final def setConstantTorque(torque: Double): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_constant_torque == null) gdext.classes.RigidBody2D.mb_set_constant_torque = MethodBind.get("RigidBody2D", "set_constant_torque", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_constant_torque, livePtr, torque)
  }

  /** RigidBody2D.get_constant_torque */
  final def getConstantTorque(): Double = {
    if (gdext.classes.RigidBody2D.mb_get_constant_torque == null) gdext.classes.RigidBody2D.mb_get_constant_torque = MethodBind.get("RigidBody2D", "get_constant_torque", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RigidBody2D.mb_get_constant_torque, livePtr)
  }

  /** RigidBody2D.set_sleeping */
  final def setSleeping(sleeping: Boolean): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_sleeping == null) gdext.classes.RigidBody2D.mb_set_sleeping = MethodBind.get("RigidBody2D", "set_sleeping", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_sleeping, livePtr, sleeping)
  }

  /** RigidBody2D.is_sleeping */
  final def isSleeping(): Boolean = {
    if (gdext.classes.RigidBody2D.mb_is_sleeping == null) gdext.classes.RigidBody2D.mb_is_sleeping = MethodBind.get("RigidBody2D", "is_sleeping", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RigidBody2D.mb_is_sleeping, livePtr)
  }

  /** RigidBody2D.set_can_sleep */
  final def setCanSleep(able_to_sleep: Boolean): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_can_sleep == null) gdext.classes.RigidBody2D.mb_set_can_sleep = MethodBind.get("RigidBody2D", "set_can_sleep", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_can_sleep, livePtr, able_to_sleep)
  }

  /** RigidBody2D.is_able_to_sleep */
  final def isAbleToSleep(): Boolean = {
    if (gdext.classes.RigidBody2D.mb_is_able_to_sleep == null) gdext.classes.RigidBody2D.mb_is_able_to_sleep = MethodBind.get("RigidBody2D", "is_able_to_sleep", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RigidBody2D.mb_is_able_to_sleep, livePtr)
  }

  /** RigidBody2D.set_lock_rotation_enabled */
  final def setLockRotationEnabled(lock_rotation: Boolean): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_lock_rotation_enabled == null) gdext.classes.RigidBody2D.mb_set_lock_rotation_enabled = MethodBind.get("RigidBody2D", "set_lock_rotation_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_lock_rotation_enabled, livePtr, lock_rotation)
  }

  /** RigidBody2D.is_lock_rotation_enabled */
  final def isLockRotationEnabled(): Boolean = {
    if (gdext.classes.RigidBody2D.mb_is_lock_rotation_enabled == null) gdext.classes.RigidBody2D.mb_is_lock_rotation_enabled = MethodBind.get("RigidBody2D", "is_lock_rotation_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RigidBody2D.mb_is_lock_rotation_enabled, livePtr)
  }

  /** RigidBody2D.set_freeze_enabled */
  final def setFreezeEnabled(freeze_mode: Boolean): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_freeze_enabled == null) gdext.classes.RigidBody2D.mb_set_freeze_enabled = MethodBind.get("RigidBody2D", "set_freeze_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_freeze_enabled, livePtr, freeze_mode)
  }

  /** RigidBody2D.is_freeze_enabled */
  final def isFreezeEnabled(): Boolean = {
    if (gdext.classes.RigidBody2D.mb_is_freeze_enabled == null) gdext.classes.RigidBody2D.mb_is_freeze_enabled = MethodBind.get("RigidBody2D", "is_freeze_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RigidBody2D.mb_is_freeze_enabled, livePtr)
  }

  /** RigidBody2D.set_freeze_mode */
  final def setFreezeMode(freeze_mode: Long): Unit = {
    if (gdext.classes.RigidBody2D.mb_set_freeze_mode == null) gdext.classes.RigidBody2D.mb_set_freeze_mode = MethodBind.get("RigidBody2D", "set_freeze_mode", 1705112154L)
    Ptrcall.callVoid1(gdext.classes.RigidBody2D.mb_set_freeze_mode, livePtr, freeze_mode)
  }

  /** RigidBody2D.get_freeze_mode */
  final def getFreezeMode(): Long = {
    if (gdext.classes.RigidBody2D.mb_get_freeze_mode == null) gdext.classes.RigidBody2D.mb_get_freeze_mode = MethodBind.get("RigidBody2D", "get_freeze_mode", 2016872314L)
    Ptrcall.call0[Long](gdext.classes.RigidBody2D.mb_get_freeze_mode, livePtr)
  }

}

object RigidBody2D {
  private[classes] var mb_set_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inertia: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_inertia: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_center_of_mass_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_of_mass_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_center_of_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_of_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_material_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_material_override: GDExtensionMethodBindPtr = null
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
  private[classes] var mb_set_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_contacts_reported: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_contacts_reported: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_custom_integrator: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_custom_integrator: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_contact_monitor: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_contact_monitor_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_continuous_collision_detection_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_continuous_collision_detection_mode: GDExtensionMethodBindPtr = null
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
