package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsDirectBodyState2D`, extends `Object`. */
abstract class PhysicsDirectBodyState2D extends Object {
  override def godotClassName: String = "PhysicsDirectBodyState2D"

  /** PhysicsDirectBodyState2D.get_total_gravity */
  final def getTotalGravity(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_total_gravity == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_total_gravity = MethodBind.get("PhysicsDirectBodyState2D", "get_total_gravity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsDirectBodyState2D.mb_get_total_gravity, livePtr)
  }

  /** PhysicsDirectBodyState2D.get_total_linear_damp */
  final def getTotalLinearDamp(): Double = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_total_linear_damp == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_total_linear_damp = MethodBind.get("PhysicsDirectBodyState2D", "get_total_linear_damp", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsDirectBodyState2D.mb_get_total_linear_damp, livePtr)
  }

  /** PhysicsDirectBodyState2D.get_total_angular_damp */
  final def getTotalAngularDamp(): Double = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_total_angular_damp == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_total_angular_damp = MethodBind.get("PhysicsDirectBodyState2D", "get_total_angular_damp", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsDirectBodyState2D.mb_get_total_angular_damp, livePtr)
  }

  /** PhysicsDirectBodyState2D.get_center_of_mass */
  final def getCenterOfMass(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_center_of_mass == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_center_of_mass = MethodBind.get("PhysicsDirectBodyState2D", "get_center_of_mass", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsDirectBodyState2D.mb_get_center_of_mass, livePtr)
  }

  /** PhysicsDirectBodyState2D.get_center_of_mass_local */
  final def getCenterOfMassLocal(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_center_of_mass_local == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_center_of_mass_local = MethodBind.get("PhysicsDirectBodyState2D", "get_center_of_mass_local", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsDirectBodyState2D.mb_get_center_of_mass_local, livePtr)
  }

  /** PhysicsDirectBodyState2D.get_inverse_mass */
  final def getInverseMass(): Double = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_inverse_mass == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_inverse_mass = MethodBind.get("PhysicsDirectBodyState2D", "get_inverse_mass", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsDirectBodyState2D.mb_get_inverse_mass, livePtr)
  }

  /** PhysicsDirectBodyState2D.get_inverse_inertia */
  final def getInverseInertia(): Double = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_inverse_inertia == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_inverse_inertia = MethodBind.get("PhysicsDirectBodyState2D", "get_inverse_inertia", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsDirectBodyState2D.mb_get_inverse_inertia, livePtr)
  }

  /** PhysicsDirectBodyState2D.set_linear_velocity */
  final def setLinearVelocity(velocity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_set_linear_velocity == null) gdext.classes.PhysicsDirectBodyState2D.mb_set_linear_velocity = MethodBind.get("PhysicsDirectBodyState2D", "set_linear_velocity", 743155724L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_set_linear_velocity, livePtr, velocity)
  }

  /** PhysicsDirectBodyState2D.get_linear_velocity */
  final def getLinearVelocity(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_linear_velocity == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_linear_velocity = MethodBind.get("PhysicsDirectBodyState2D", "get_linear_velocity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsDirectBodyState2D.mb_get_linear_velocity, livePtr)
  }

  /** PhysicsDirectBodyState2D.set_angular_velocity */
  final def setAngularVelocity(velocity: Double): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_set_angular_velocity == null) gdext.classes.PhysicsDirectBodyState2D.mb_set_angular_velocity = MethodBind.get("PhysicsDirectBodyState2D", "set_angular_velocity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_set_angular_velocity, livePtr, velocity)
  }

  /** PhysicsDirectBodyState2D.get_angular_velocity */
  final def getAngularVelocity(): Double = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_angular_velocity == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_angular_velocity = MethodBind.get("PhysicsDirectBodyState2D", "get_angular_velocity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsDirectBodyState2D.mb_get_angular_velocity, livePtr)
  }

  /** PhysicsDirectBodyState2D.set_transform */
  final def setTransform(transform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_set_transform == null) gdext.classes.PhysicsDirectBodyState2D.mb_set_transform = MethodBind.get("PhysicsDirectBodyState2D", "set_transform", 2761652528L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_set_transform, livePtr, transform)
  }

  /** PhysicsDirectBodyState2D.get_transform */
  final def getTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_transform == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_transform = MethodBind.get("PhysicsDirectBodyState2D", "get_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.PhysicsDirectBodyState2D.mb_get_transform, livePtr)
  }

  /** PhysicsDirectBodyState2D.get_velocity_at_local_position */
  final def getVelocityAtLocalPosition(localPosition: gdext.builtin.Vector2): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_velocity_at_local_position == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_velocity_at_local_position = MethodBind.get("PhysicsDirectBodyState2D", "get_velocity_at_local_position", 2656412154L)
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2](gdext.classes.PhysicsDirectBodyState2D.mb_get_velocity_at_local_position, livePtr, localPosition)
  }

  /** PhysicsDirectBodyState2D.apply_central_impulse */
  final def applyCentralImpulse(impulse: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_apply_central_impulse == null) gdext.classes.PhysicsDirectBodyState2D.mb_apply_central_impulse = MethodBind.get("PhysicsDirectBodyState2D", "apply_central_impulse", 743155724L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_apply_central_impulse, livePtr, impulse)
  }

  /** PhysicsDirectBodyState2D.apply_torque_impulse */
  final def applyTorqueImpulse(impulse: Double): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_apply_torque_impulse == null) gdext.classes.PhysicsDirectBodyState2D.mb_apply_torque_impulse = MethodBind.get("PhysicsDirectBodyState2D", "apply_torque_impulse", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_apply_torque_impulse, livePtr, impulse)
  }

  /** PhysicsDirectBodyState2D.apply_impulse */
  final def applyImpulse(impulse: gdext.builtin.Vector2, position: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_apply_impulse == null) gdext.classes.PhysicsDirectBodyState2D.mb_apply_impulse = MethodBind.get("PhysicsDirectBodyState2D", "apply_impulse", 4288681949L)
    Ptrcall.callVoid2(gdext.classes.PhysicsDirectBodyState2D.mb_apply_impulse, livePtr, impulse, position)
  }

  /** PhysicsDirectBodyState2D.apply_central_force */
  final def applyCentralForce(force: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_apply_central_force == null) gdext.classes.PhysicsDirectBodyState2D.mb_apply_central_force = MethodBind.get("PhysicsDirectBodyState2D", "apply_central_force", 3862383994L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_apply_central_force, livePtr, force)
  }

  /** PhysicsDirectBodyState2D.apply_force */
  final def applyForce(force: gdext.builtin.Vector2, position: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_apply_force == null) gdext.classes.PhysicsDirectBodyState2D.mb_apply_force = MethodBind.get("PhysicsDirectBodyState2D", "apply_force", 4288681949L)
    Ptrcall.callVoid2(gdext.classes.PhysicsDirectBodyState2D.mb_apply_force, livePtr, force, position)
  }

  /** PhysicsDirectBodyState2D.apply_torque */
  final def applyTorque(torque: Double): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_apply_torque == null) gdext.classes.PhysicsDirectBodyState2D.mb_apply_torque = MethodBind.get("PhysicsDirectBodyState2D", "apply_torque", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_apply_torque, livePtr, torque)
  }

  /** PhysicsDirectBodyState2D.add_constant_central_force */
  final def addConstantCentralForce(force: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_add_constant_central_force == null) gdext.classes.PhysicsDirectBodyState2D.mb_add_constant_central_force = MethodBind.get("PhysicsDirectBodyState2D", "add_constant_central_force", 3862383994L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_add_constant_central_force, livePtr, force)
  }

  /** PhysicsDirectBodyState2D.add_constant_force */
  final def addConstantForce(force: gdext.builtin.Vector2, position: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_add_constant_force == null) gdext.classes.PhysicsDirectBodyState2D.mb_add_constant_force = MethodBind.get("PhysicsDirectBodyState2D", "add_constant_force", 4288681949L)
    Ptrcall.callVoid2(gdext.classes.PhysicsDirectBodyState2D.mb_add_constant_force, livePtr, force, position)
  }

  /** PhysicsDirectBodyState2D.add_constant_torque */
  final def addConstantTorque(torque: Double): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_add_constant_torque == null) gdext.classes.PhysicsDirectBodyState2D.mb_add_constant_torque = MethodBind.get("PhysicsDirectBodyState2D", "add_constant_torque", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_add_constant_torque, livePtr, torque)
  }

  /** PhysicsDirectBodyState2D.set_constant_force */
  final def setConstantForce(force: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_set_constant_force == null) gdext.classes.PhysicsDirectBodyState2D.mb_set_constant_force = MethodBind.get("PhysicsDirectBodyState2D", "set_constant_force", 743155724L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_set_constant_force, livePtr, force)
  }

  /** PhysicsDirectBodyState2D.get_constant_force */
  final def getConstantForce(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_constant_force == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_constant_force = MethodBind.get("PhysicsDirectBodyState2D", "get_constant_force", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsDirectBodyState2D.mb_get_constant_force, livePtr)
  }

  /** PhysicsDirectBodyState2D.set_constant_torque */
  final def setConstantTorque(torque: Double): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_set_constant_torque == null) gdext.classes.PhysicsDirectBodyState2D.mb_set_constant_torque = MethodBind.get("PhysicsDirectBodyState2D", "set_constant_torque", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_set_constant_torque, livePtr, torque)
  }

  /** PhysicsDirectBodyState2D.get_constant_torque */
  final def getConstantTorque(): Double = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_constant_torque == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_constant_torque = MethodBind.get("PhysicsDirectBodyState2D", "get_constant_torque", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsDirectBodyState2D.mb_get_constant_torque, livePtr)
  }

  /** PhysicsDirectBodyState2D.set_sleep_state */
  final def setSleepState(enabled: Boolean): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_set_sleep_state == null) gdext.classes.PhysicsDirectBodyState2D.mb_set_sleep_state = MethodBind.get("PhysicsDirectBodyState2D", "set_sleep_state", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_set_sleep_state, livePtr, enabled)
  }

  /** PhysicsDirectBodyState2D.is_sleeping */
  final def isSleeping(): Boolean = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_is_sleeping == null) gdext.classes.PhysicsDirectBodyState2D.mb_is_sleeping = MethodBind.get("PhysicsDirectBodyState2D", "is_sleeping", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsDirectBodyState2D.mb_is_sleeping, livePtr)
  }

  /** PhysicsDirectBodyState2D.set_collision_layer */
  final def setCollisionLayer(layer: Long): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_set_collision_layer == null) gdext.classes.PhysicsDirectBodyState2D.mb_set_collision_layer = MethodBind.get("PhysicsDirectBodyState2D", "set_collision_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_set_collision_layer, livePtr, layer)
  }

  /** PhysicsDirectBodyState2D.get_collision_layer */
  final def getCollisionLayer(): Long = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_collision_layer == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_collision_layer = MethodBind.get("PhysicsDirectBodyState2D", "get_collision_layer", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicsDirectBodyState2D.mb_get_collision_layer, livePtr)
  }

  /** PhysicsDirectBodyState2D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_set_collision_mask == null) gdext.classes.PhysicsDirectBodyState2D.mb_set_collision_mask = MethodBind.get("PhysicsDirectBodyState2D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PhysicsDirectBodyState2D.mb_set_collision_mask, livePtr, mask)
  }

  /** PhysicsDirectBodyState2D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_collision_mask == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_collision_mask = MethodBind.get("PhysicsDirectBodyState2D", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicsDirectBodyState2D.mb_get_collision_mask, livePtr)
  }

  /** PhysicsDirectBodyState2D.get_contact_count */
  final def getContactCount(): Long = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_count == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_count = MethodBind.get("PhysicsDirectBodyState2D", "get_contact_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_count, livePtr)
  }

  /** PhysicsDirectBodyState2D.get_contact_local_position */
  final def getContactLocalPosition(contactIdx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_local_position == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_local_position = MethodBind.get("PhysicsDirectBodyState2D", "get_contact_local_position", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_local_position, livePtr, contactIdx)
  }

  /** PhysicsDirectBodyState2D.get_contact_local_normal */
  final def getContactLocalNormal(contactIdx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_local_normal == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_local_normal = MethodBind.get("PhysicsDirectBodyState2D", "get_contact_local_normal", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_local_normal, livePtr, contactIdx)
  }

  /** PhysicsDirectBodyState2D.get_contact_local_shape */
  final def getContactLocalShape(contactIdx: Long): Long = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_local_shape == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_local_shape = MethodBind.get("PhysicsDirectBodyState2D", "get_contact_local_shape", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_local_shape, livePtr, contactIdx)
  }

  /** PhysicsDirectBodyState2D.get_contact_local_velocity_at_position */
  final def getContactLocalVelocityAtPosition(contactIdx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_local_velocity_at_position == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_local_velocity_at_position = MethodBind.get("PhysicsDirectBodyState2D", "get_contact_local_velocity_at_position", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_local_velocity_at_position, livePtr, contactIdx)
  }

  /** PhysicsDirectBodyState2D.get_contact_collider_position */
  final def getContactColliderPosition(contactIdx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_position == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_position = MethodBind.get("PhysicsDirectBodyState2D", "get_contact_collider_position", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_position, livePtr, contactIdx)
  }

  /** PhysicsDirectBodyState2D.get_contact_collider_id */
  final def getContactColliderId(contactIdx: Long): Long = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_id == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_id = MethodBind.get("PhysicsDirectBodyState2D", "get_contact_collider_id", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_id, livePtr, contactIdx)
  }

  /** PhysicsDirectBodyState2D.get_contact_collider_object */
  final def getContactColliderObject(contactIdx: Long): Object = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_object == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_object = MethodBind.get("PhysicsDirectBodyState2D", "get_contact_collider_object", 3332903315L)
    Wrappers.borrowed[Object](Ptrcall.call1[Long, Long](gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_object, livePtr, contactIdx))
  }

  /** PhysicsDirectBodyState2D.get_contact_collider_shape */
  final def getContactColliderShape(contactIdx: Long): Long = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_shape == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_shape = MethodBind.get("PhysicsDirectBodyState2D", "get_contact_collider_shape", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_shape, livePtr, contactIdx)
  }

  /** PhysicsDirectBodyState2D.get_contact_collider_velocity_at_position */
  final def getContactColliderVelocityAtPosition(contactIdx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_velocity_at_position == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_velocity_at_position = MethodBind.get("PhysicsDirectBodyState2D", "get_contact_collider_velocity_at_position", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_collider_velocity_at_position, livePtr, contactIdx)
  }

  /** PhysicsDirectBodyState2D.get_contact_impulse */
  final def getContactImpulse(contactIdx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_impulse == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_impulse = MethodBind.get("PhysicsDirectBodyState2D", "get_contact_impulse", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.PhysicsDirectBodyState2D.mb_get_contact_impulse, livePtr, contactIdx)
  }

  /** PhysicsDirectBodyState2D.get_step */
  final def getStep(): Double = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_step == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_step = MethodBind.get("PhysicsDirectBodyState2D", "get_step", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsDirectBodyState2D.mb_get_step, livePtr)
  }

  /** PhysicsDirectBodyState2D.integrate_forces */
  final def integrateForces(): Unit = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_integrate_forces == null) gdext.classes.PhysicsDirectBodyState2D.mb_integrate_forces = MethodBind.get("PhysicsDirectBodyState2D", "integrate_forces", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.PhysicsDirectBodyState2D.mb_integrate_forces, livePtr)
  }

  /** PhysicsDirectBodyState2D.get_space_state */
  final def getSpaceState(): PhysicsDirectSpaceState2D = {
    if (gdext.classes.PhysicsDirectBodyState2D.mb_get_space_state == null) gdext.classes.PhysicsDirectBodyState2D.mb_get_space_state = MethodBind.get("PhysicsDirectBodyState2D", "get_space_state", 2506717822L)
    Wrappers.borrowed[PhysicsDirectSpaceState2D](Ptrcall.call0[Long](gdext.classes.PhysicsDirectBodyState2D.mb_get_space_state, livePtr))
  }

}

object PhysicsDirectBodyState2D {
  private[classes] var mb_get_total_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_total_linear_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_total_angular_damp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_of_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_of_mass_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inverse_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inverse_inertia: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_velocity_at_local_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_central_impulse: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_torque_impulse: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_impulse: GDExtensionMethodBindPtr = null
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
  private[classes] var mb_set_sleep_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_sleeping: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_local_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_local_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_local_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_local_velocity_at_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_collider_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_collider_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_collider_object: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_collider_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_collider_velocity_at_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_impulse: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_integrate_forces: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_space_state: GDExtensionMethodBindPtr = null
}
