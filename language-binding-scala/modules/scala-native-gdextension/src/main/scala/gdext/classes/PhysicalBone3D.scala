package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicalBone3D`, extends `PhysicsBody3D`. */
abstract class PhysicalBone3D extends PhysicsBody3D {
  override def godotClassName: String = "PhysicalBone3D"

  /** PhysicalBone3D.apply_central_impulse */
  final def applyCentralImpulse(impulse: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "apply_central_impulse", 3460891852L), hostObject.objectPtr, impulse)

  /** PhysicalBone3D.apply_impulse */
  final def applyImpulse(impulse: gdext.builtin.Vector3, position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicalBone3D", "apply_impulse", 2754756483L), hostObject.objectPtr, impulse, position)

  /** PhysicalBone3D.set_joint_type */
  final def setJointType(joint_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_joint_type", 2289552604L), hostObject.objectPtr, joint_type)

  /** PhysicalBone3D.get_joint_type */
  final def getJointType(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicalBone3D", "get_joint_type", 931347320L), hostObject.objectPtr)

  /** PhysicalBone3D.set_joint_offset */
  final def setJointOffset(offset: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_joint_offset", 2952846383L), hostObject.objectPtr, offset)

  /** PhysicalBone3D.get_joint_offset */
  final def getJointOffset(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("PhysicalBone3D", "get_joint_offset", 3229777777L), hostObject.objectPtr)

  /** PhysicalBone3D.set_joint_rotation */
  final def setJointRotation(euler: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_joint_rotation", 3460891852L), hostObject.objectPtr, euler)

  /** PhysicalBone3D.get_joint_rotation */
  final def getJointRotation(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("PhysicalBone3D", "get_joint_rotation", 3360562783L), hostObject.objectPtr)

  /** PhysicalBone3D.set_body_offset */
  final def setBodyOffset(offset: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_body_offset", 2952846383L), hostObject.objectPtr, offset)

  /** PhysicalBone3D.get_body_offset */
  final def getBodyOffset(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("PhysicalBone3D", "get_body_offset", 3229777777L), hostObject.objectPtr)

  /** PhysicalBone3D.get_simulate_physics */
  final def getSimulatePhysics(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicalBone3D", "get_simulate_physics", 2240911060L), hostObject.objectPtr)

  /** PhysicalBone3D.is_simulating_physics */
  final def isSimulatingPhysics(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicalBone3D", "is_simulating_physics", 2240911060L), hostObject.objectPtr)

  /** PhysicalBone3D.get_bone_id */
  final def getBoneId(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicalBone3D", "get_bone_id", 3905245786L), hostObject.objectPtr)

  /** PhysicalBone3D.set_mass */
  final def setMass(mass: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_mass", 373806689L), hostObject.objectPtr, mass)

  /** PhysicalBone3D.get_mass */
  final def getMass(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicalBone3D", "get_mass", 1740695150L), hostObject.objectPtr)

  /** PhysicalBone3D.set_friction */
  final def setFriction(friction: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_friction", 373806689L), hostObject.objectPtr, friction)

  /** PhysicalBone3D.get_friction */
  final def getFriction(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicalBone3D", "get_friction", 1740695150L), hostObject.objectPtr)

  /** PhysicalBone3D.set_bounce */
  final def setBounce(bounce: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_bounce", 373806689L), hostObject.objectPtr, bounce)

  /** PhysicalBone3D.get_bounce */
  final def getBounce(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicalBone3D", "get_bounce", 1740695150L), hostObject.objectPtr)

  /** PhysicalBone3D.set_gravity_scale */
  final def setGravityScale(gravity_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_gravity_scale", 373806689L), hostObject.objectPtr, gravity_scale)

  /** PhysicalBone3D.get_gravity_scale */
  final def getGravityScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicalBone3D", "get_gravity_scale", 1740695150L), hostObject.objectPtr)

  /** PhysicalBone3D.set_linear_damp_mode */
  final def setLinearDampMode(linear_damp_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_linear_damp_mode", 1244972221L), hostObject.objectPtr, linear_damp_mode)

  /** PhysicalBone3D.get_linear_damp_mode */
  final def getLinearDampMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicalBone3D", "get_linear_damp_mode", 205884699L), hostObject.objectPtr)

  /** PhysicalBone3D.set_angular_damp_mode */
  final def setAngularDampMode(angular_damp_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_angular_damp_mode", 1244972221L), hostObject.objectPtr, angular_damp_mode)

  /** PhysicalBone3D.get_angular_damp_mode */
  final def getAngularDampMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicalBone3D", "get_angular_damp_mode", 205884699L), hostObject.objectPtr)

  /** PhysicalBone3D.set_linear_damp */
  final def setLinearDamp(linear_damp: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_linear_damp", 373806689L), hostObject.objectPtr, linear_damp)

  /** PhysicalBone3D.get_linear_damp */
  final def getLinearDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicalBone3D", "get_linear_damp", 1740695150L), hostObject.objectPtr)

  /** PhysicalBone3D.set_angular_damp */
  final def setAngularDamp(angular_damp: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_angular_damp", 373806689L), hostObject.objectPtr, angular_damp)

  /** PhysicalBone3D.get_angular_damp */
  final def getAngularDamp(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicalBone3D", "get_angular_damp", 1740695150L), hostObject.objectPtr)

  /** PhysicalBone3D.set_linear_velocity */
  final def setLinearVelocity(linear_velocity: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_linear_velocity", 3460891852L), hostObject.objectPtr, linear_velocity)

  /** PhysicalBone3D.get_linear_velocity */
  final def getLinearVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("PhysicalBone3D", "get_linear_velocity", 3360562783L), hostObject.objectPtr)

  /** PhysicalBone3D.set_angular_velocity */
  final def setAngularVelocity(angular_velocity: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_angular_velocity", 3460891852L), hostObject.objectPtr, angular_velocity)

  /** PhysicalBone3D.get_angular_velocity */
  final def getAngularVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("PhysicalBone3D", "get_angular_velocity", 3360562783L), hostObject.objectPtr)

  /** PhysicalBone3D.set_use_custom_integrator */
  final def setUseCustomIntegrator(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_use_custom_integrator", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicalBone3D.is_using_custom_integrator */
  final def isUsingCustomIntegrator(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicalBone3D", "is_using_custom_integrator", 2240911060L), hostObject.objectPtr)

  /** PhysicalBone3D.set_can_sleep */
  final def setCanSleep(able_to_sleep: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone3D", "set_can_sleep", 2586408642L), hostObject.objectPtr, able_to_sleep)

  /** PhysicalBone3D.is_able_to_sleep */
  final def isAbleToSleep(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicalBone3D", "is_able_to_sleep", 36873697L), hostObject.objectPtr)

}
