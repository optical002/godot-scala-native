package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsDirectBodyState2D`, extends `Object`. */
abstract class PhysicsDirectBodyState2D extends Object {
  override def godotClassName: String = "PhysicsDirectBodyState2D"

  /** PhysicsDirectBodyState2D.get_total_gravity */
  final def getTotalGravity(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("PhysicsDirectBodyState2D", "get_total_gravity", 3341600327L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.get_total_linear_damp */
  final def getTotalLinearDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsDirectBodyState2D", "get_total_linear_damp", 1740695150L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.get_total_angular_damp */
  final def getTotalAngularDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsDirectBodyState2D", "get_total_angular_damp", 1740695150L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.get_center_of_mass */
  final def getCenterOfMass(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("PhysicsDirectBodyState2D", "get_center_of_mass", 3341600327L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.get_center_of_mass_local */
  final def getCenterOfMassLocal(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("PhysicsDirectBodyState2D", "get_center_of_mass_local", 3341600327L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.get_inverse_mass */
  final def getInverseMass(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsDirectBodyState2D", "get_inverse_mass", 1740695150L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.get_inverse_inertia */
  final def getInverseInertia(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsDirectBodyState2D", "get_inverse_inertia", 1740695150L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.set_linear_velocity */
  final def setLinearVelocity(velocity: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "set_linear_velocity", 743155724L), hostObject.objectPtr, velocity)

  /** PhysicsDirectBodyState2D.get_linear_velocity */
  final def getLinearVelocity(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("PhysicsDirectBodyState2D", "get_linear_velocity", 3341600327L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.set_angular_velocity */
  final def setAngularVelocity(velocity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "set_angular_velocity", 373806689L), hostObject.objectPtr, velocity)

  /** PhysicsDirectBodyState2D.get_angular_velocity */
  final def getAngularVelocity(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsDirectBodyState2D", "get_angular_velocity", 1740695150L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.set_transform */
  final def setTransform(transform: gdext.builtin.Transform2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "set_transform", 2761652528L), hostObject.objectPtr, transform)

  /** PhysicsDirectBodyState2D.get_transform */
  final def getTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("PhysicsDirectBodyState2D", "get_transform", 3814499831L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.get_velocity_at_local_position */
  final def getVelocityAtLocalPosition(local_position: gdext.builtin.Vector2): gdext.builtin.Vector2 =
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2](MethodBind.get("PhysicsDirectBodyState2D", "get_velocity_at_local_position", 2656412154L), hostObject.objectPtr, local_position)

  /** PhysicsDirectBodyState2D.apply_central_impulse */
  final def applyCentralImpulse(impulse: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "apply_central_impulse", 743155724L), hostObject.objectPtr, impulse)

  /** PhysicsDirectBodyState2D.apply_torque_impulse */
  final def applyTorqueImpulse(impulse: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "apply_torque_impulse", 373806689L), hostObject.objectPtr, impulse)

  /** PhysicsDirectBodyState2D.apply_impulse */
  final def applyImpulse(impulse: gdext.builtin.Vector2, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicsDirectBodyState2D", "apply_impulse", 4288681949L), hostObject.objectPtr, impulse, position)

  /** PhysicsDirectBodyState2D.apply_central_force */
  final def applyCentralForce(force: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "apply_central_force", 3862383994L), hostObject.objectPtr, force)

  /** PhysicsDirectBodyState2D.apply_force */
  final def applyForce(force: gdext.builtin.Vector2, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicsDirectBodyState2D", "apply_force", 4288681949L), hostObject.objectPtr, force, position)

  /** PhysicsDirectBodyState2D.apply_torque */
  final def applyTorque(torque: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "apply_torque", 373806689L), hostObject.objectPtr, torque)

  /** PhysicsDirectBodyState2D.add_constant_central_force */
  final def addConstantCentralForce(force: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "add_constant_central_force", 3862383994L), hostObject.objectPtr, force)

  /** PhysicsDirectBodyState2D.add_constant_force */
  final def addConstantForce(force: gdext.builtin.Vector2, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicsDirectBodyState2D", "add_constant_force", 4288681949L), hostObject.objectPtr, force, position)

  /** PhysicsDirectBodyState2D.add_constant_torque */
  final def addConstantTorque(torque: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "add_constant_torque", 373806689L), hostObject.objectPtr, torque)

  /** PhysicsDirectBodyState2D.set_constant_force */
  final def setConstantForce(force: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "set_constant_force", 743155724L), hostObject.objectPtr, force)

  /** PhysicsDirectBodyState2D.get_constant_force */
  final def getConstantForce(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("PhysicsDirectBodyState2D", "get_constant_force", 3341600327L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.set_constant_torque */
  final def setConstantTorque(torque: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "set_constant_torque", 373806689L), hostObject.objectPtr, torque)

  /** PhysicsDirectBodyState2D.get_constant_torque */
  final def getConstantTorque(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsDirectBodyState2D", "get_constant_torque", 1740695150L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.set_sleep_state */
  final def setSleepState(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "set_sleep_state", 2586408642L), hostObject.objectPtr, enabled)

  /** PhysicsDirectBodyState2D.is_sleeping */
  final def isSleeping(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsDirectBodyState2D", "is_sleeping", 36873697L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.set_collision_layer */
  final def setCollisionLayer(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "set_collision_layer", 1286410249L), hostObject.objectPtr, layer)

  /** PhysicsDirectBodyState2D.get_collision_layer */
  final def getCollisionLayer(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsDirectBodyState2D", "get_collision_layer", 3905245786L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState2D", "set_collision_mask", 1286410249L), hostObject.objectPtr, mask)

  /** PhysicsDirectBodyState2D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsDirectBodyState2D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.get_contact_count */
  final def getContactCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsDirectBodyState2D", "get_contact_count", 3905245786L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.get_contact_local_position */
  final def getContactLocalPosition(contact_idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("PhysicsDirectBodyState2D", "get_contact_local_position", 2299179447L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState2D.get_contact_local_normal */
  final def getContactLocalNormal(contact_idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("PhysicsDirectBodyState2D", "get_contact_local_normal", 2299179447L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState2D.get_contact_local_shape */
  final def getContactLocalShape(contact_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PhysicsDirectBodyState2D", "get_contact_local_shape", 923996154L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState2D.get_contact_local_velocity_at_position */
  final def getContactLocalVelocityAtPosition(contact_idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("PhysicsDirectBodyState2D", "get_contact_local_velocity_at_position", 2299179447L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState2D.get_contact_collider_position */
  final def getContactColliderPosition(contact_idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("PhysicsDirectBodyState2D", "get_contact_collider_position", 2299179447L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState2D.get_contact_collider_id */
  final def getContactColliderId(contact_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PhysicsDirectBodyState2D", "get_contact_collider_id", 923996154L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState2D.get_contact_collider_object */
  final def getContactColliderObject(contact_idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("PhysicsDirectBodyState2D", "get_contact_collider_object", 3332903315L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState2D.get_contact_collider_shape */
  final def getContactColliderShape(contact_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PhysicsDirectBodyState2D", "get_contact_collider_shape", 923996154L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState2D.get_contact_collider_velocity_at_position */
  final def getContactColliderVelocityAtPosition(contact_idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("PhysicsDirectBodyState2D", "get_contact_collider_velocity_at_position", 2299179447L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState2D.get_contact_impulse */
  final def getContactImpulse(contact_idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("PhysicsDirectBodyState2D", "get_contact_impulse", 2299179447L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState2D.get_step */
  final def getStep(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsDirectBodyState2D", "get_step", 1740695150L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.integrate_forces */
  final def integrateForces(): Unit =
    Ptrcall.callVoid0(MethodBind.get("PhysicsDirectBodyState2D", "integrate_forces", 3218959716L), hostObject.objectPtr)

  /** PhysicsDirectBodyState2D.get_space_state */
  final def getSpaceState(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PhysicsDirectBodyState2D", "get_space_state", 2506717822L), hostObject.objectPtr)

}
