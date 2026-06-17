package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsDirectBodyState3D`, extends `Object`. */
abstract class PhysicsDirectBodyState3D extends Object {

  /** PhysicsDirectBodyState3D.get_total_gravity */
  final def getTotalGravity(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_total_gravity", 3360562783L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.get_total_linear_damp */
  final def getTotalLinearDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsDirectBodyState3D", "get_total_linear_damp", 1740695150L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.get_total_angular_damp */
  final def getTotalAngularDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsDirectBodyState3D", "get_total_angular_damp", 1740695150L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.get_center_of_mass */
  final def getCenterOfMass(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_center_of_mass", 3360562783L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.get_center_of_mass_local */
  final def getCenterOfMassLocal(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_center_of_mass_local", 3360562783L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.get_principal_inertia_axes */
  final def getPrincipalInertiaAxes(): io.github.optical002.godot.builtin.Basis =
    Ptrcall.call0[io.github.optical002.godot.builtin.Basis](MethodBind.get("PhysicsDirectBodyState3D", "get_principal_inertia_axes", 2716978435L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.get_inverse_mass */
  final def getInverseMass(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsDirectBodyState3D", "get_inverse_mass", 1740695150L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.get_inverse_inertia */
  final def getInverseInertia(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_inverse_inertia", 3360562783L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.get_inverse_inertia_tensor */
  final def getInverseInertiaTensor(): io.github.optical002.godot.builtin.Basis =
    Ptrcall.call0[io.github.optical002.godot.builtin.Basis](MethodBind.get("PhysicsDirectBodyState3D", "get_inverse_inertia_tensor", 2716978435L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.set_linear_velocity */
  final def setLinearVelocity(velocity: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "set_linear_velocity", 3460891852L), hostObject.objectPtr, velocity)

  /** PhysicsDirectBodyState3D.get_linear_velocity */
  final def getLinearVelocity(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_linear_velocity", 3360562783L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.set_angular_velocity */
  final def setAngularVelocity(velocity: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "set_angular_velocity", 3460891852L), hostObject.objectPtr, velocity)

  /** PhysicsDirectBodyState3D.get_angular_velocity */
  final def getAngularVelocity(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_angular_velocity", 3360562783L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.set_transform */
  final def setTransform(transform: io.github.optical002.godot.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "set_transform", 2952846383L), hostObject.objectPtr, transform)

  /** PhysicsDirectBodyState3D.get_transform */
  final def getTransform(): io.github.optical002.godot.builtin.Transform3D =
    Ptrcall.call0[io.github.optical002.godot.builtin.Transform3D](MethodBind.get("PhysicsDirectBodyState3D", "get_transform", 3229777777L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.get_velocity_at_local_position */
  final def getVelocityAtLocalPosition(local_position: io.github.optical002.godot.builtin.Vector3): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector3, io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_velocity_at_local_position", 192990374L), hostObject.objectPtr, local_position)

  /** PhysicsDirectBodyState3D.apply_central_impulse */
  final def applyCentralImpulse(impulse: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "apply_central_impulse", 2007698547L), hostObject.objectPtr, impulse)

  /** PhysicsDirectBodyState3D.apply_impulse */
  final def applyImpulse(impulse: io.github.optical002.godot.builtin.Vector3, position: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicsDirectBodyState3D", "apply_impulse", 2754756483L), hostObject.objectPtr, impulse, position)

  /** PhysicsDirectBodyState3D.apply_torque_impulse */
  final def applyTorqueImpulse(impulse: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "apply_torque_impulse", 3460891852L), hostObject.objectPtr, impulse)

  /** PhysicsDirectBodyState3D.apply_central_force */
  final def applyCentralForce(force: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "apply_central_force", 2007698547L), hostObject.objectPtr, force)

  /** PhysicsDirectBodyState3D.apply_force */
  final def applyForce(force: io.github.optical002.godot.builtin.Vector3, position: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicsDirectBodyState3D", "apply_force", 2754756483L), hostObject.objectPtr, force, position)

  /** PhysicsDirectBodyState3D.apply_torque */
  final def applyTorque(torque: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "apply_torque", 3460891852L), hostObject.objectPtr, torque)

  /** PhysicsDirectBodyState3D.add_constant_central_force */
  final def addConstantCentralForce(force: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "add_constant_central_force", 2007698547L), hostObject.objectPtr, force)

  /** PhysicsDirectBodyState3D.add_constant_force */
  final def addConstantForce(force: io.github.optical002.godot.builtin.Vector3, position: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicsDirectBodyState3D", "add_constant_force", 2754756483L), hostObject.objectPtr, force, position)

  /** PhysicsDirectBodyState3D.add_constant_torque */
  final def addConstantTorque(torque: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "add_constant_torque", 3460891852L), hostObject.objectPtr, torque)

  /** PhysicsDirectBodyState3D.set_constant_force */
  final def setConstantForce(force: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "set_constant_force", 3460891852L), hostObject.objectPtr, force)

  /** PhysicsDirectBodyState3D.get_constant_force */
  final def getConstantForce(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_constant_force", 3360562783L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.set_constant_torque */
  final def setConstantTorque(torque: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "set_constant_torque", 3460891852L), hostObject.objectPtr, torque)

  /** PhysicsDirectBodyState3D.get_constant_torque */
  final def getConstantTorque(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_constant_torque", 3360562783L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.set_sleep_state */
  final def setSleepState(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "set_sleep_state", 2586408642L), hostObject.objectPtr, enabled)

  /** PhysicsDirectBodyState3D.is_sleeping */
  final def isSleeping(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsDirectBodyState3D", "is_sleeping", 36873697L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.set_collision_layer */
  final def setCollisionLayer(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "set_collision_layer", 1286410249L), hostObject.objectPtr, layer)

  /** PhysicsDirectBodyState3D.get_collision_layer */
  final def getCollisionLayer(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsDirectBodyState3D", "get_collision_layer", 3905245786L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsDirectBodyState3D", "set_collision_mask", 1286410249L), hostObject.objectPtr, mask)

  /** PhysicsDirectBodyState3D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsDirectBodyState3D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.get_contact_count */
  final def getContactCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsDirectBodyState3D", "get_contact_count", 3905245786L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.get_contact_local_position */
  final def getContactLocalPosition(contact_idx: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_contact_local_position", 711720468L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState3D.get_contact_local_normal */
  final def getContactLocalNormal(contact_idx: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_contact_local_normal", 711720468L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState3D.get_contact_impulse */
  final def getContactImpulse(contact_idx: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_contact_impulse", 711720468L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState3D.get_contact_local_shape */
  final def getContactLocalShape(contact_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PhysicsDirectBodyState3D", "get_contact_local_shape", 923996154L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState3D.get_contact_local_velocity_at_position */
  final def getContactLocalVelocityAtPosition(contact_idx: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_contact_local_velocity_at_position", 711720468L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState3D.get_contact_collider_position */
  final def getContactColliderPosition(contact_idx: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_contact_collider_position", 711720468L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState3D.get_contact_collider_id */
  final def getContactColliderId(contact_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PhysicsDirectBodyState3D", "get_contact_collider_id", 923996154L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState3D.get_contact_collider_object */
  final def getContactColliderObject(contact_idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("PhysicsDirectBodyState3D", "get_contact_collider_object", 3332903315L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState3D.get_contact_collider_shape */
  final def getContactColliderShape(contact_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PhysicsDirectBodyState3D", "get_contact_collider_shape", 923996154L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState3D.get_contact_collider_velocity_at_position */
  final def getContactColliderVelocityAtPosition(contact_idx: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("PhysicsDirectBodyState3D", "get_contact_collider_velocity_at_position", 711720468L), hostObject.objectPtr, contact_idx)

  /** PhysicsDirectBodyState3D.get_step */
  final def getStep(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsDirectBodyState3D", "get_step", 1740695150L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.integrate_forces */
  final def integrateForces(): Unit =
    Ptrcall.callVoid0(MethodBind.get("PhysicsDirectBodyState3D", "integrate_forces", 3218959716L), hostObject.objectPtr)

  /** PhysicsDirectBodyState3D.get_space_state */
  final def getSpaceState(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PhysicsDirectBodyState3D", "get_space_state", 2069328350L), hostObject.objectPtr)

}

object PhysicsDirectBodyState3D {
  /** Class metadata for Gd[PhysicsDirectBodyState3D] lifetime management and casting. */
  given GodotClass[PhysicsDirectBodyState3D] with {
    def className = "PhysicsDirectBodyState3D"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsDirectBodyState3D = new PhysicsDirectBodyState3D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsDirectBodyState3D): GodotObject = t.hostObject
  }
}
