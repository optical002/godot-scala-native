package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicalBone3D`, extends `PhysicsBody3D`. */
abstract class PhysicalBone3D extends PhysicsBody3D {
  override def godotClassName: String = "PhysicalBone3D"

  /** PhysicalBone3D.apply_central_impulse */
  final def applyCentralImpulse(impulse: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_apply_central_impulse == null) gdext.classes.PhysicalBone3D.mb_apply_central_impulse = MethodBind.get("PhysicalBone3D", "apply_central_impulse", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_apply_central_impulse, livePtr, impulse)
  }

  /** PhysicalBone3D.apply_impulse */
  final def applyImpulse(impulse: gdext.builtin.Vector3, position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_apply_impulse == null) gdext.classes.PhysicalBone3D.mb_apply_impulse = MethodBind.get("PhysicalBone3D", "apply_impulse", 2754756483L)
    Ptrcall.callVoid2(gdext.classes.PhysicalBone3D.mb_apply_impulse, livePtr, impulse, position)
  }

  /** PhysicalBone3D.set_joint_type */
  final def setJointType(joint_type: Long): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_joint_type == null) gdext.classes.PhysicalBone3D.mb_set_joint_type = MethodBind.get("PhysicalBone3D", "set_joint_type", 2289552604L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_joint_type, livePtr, joint_type)
  }

  /** PhysicalBone3D.get_joint_type */
  final def getJointType(): Long = {
    if (gdext.classes.PhysicalBone3D.mb_get_joint_type == null) gdext.classes.PhysicalBone3D.mb_get_joint_type = MethodBind.get("PhysicalBone3D", "get_joint_type", 931347320L)
    Ptrcall.call0[Long](gdext.classes.PhysicalBone3D.mb_get_joint_type, livePtr)
  }

  /** PhysicalBone3D.set_joint_offset */
  final def setJointOffset(offset: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_joint_offset == null) gdext.classes.PhysicalBone3D.mb_set_joint_offset = MethodBind.get("PhysicalBone3D", "set_joint_offset", 2952846383L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_joint_offset, livePtr, offset)
  }

  /** PhysicalBone3D.get_joint_offset */
  final def getJointOffset(): gdext.builtin.Transform3D = {
    if (gdext.classes.PhysicalBone3D.mb_get_joint_offset == null) gdext.classes.PhysicalBone3D.mb_get_joint_offset = MethodBind.get("PhysicalBone3D", "get_joint_offset", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.PhysicalBone3D.mb_get_joint_offset, livePtr)
  }

  /** PhysicalBone3D.set_joint_rotation */
  final def setJointRotation(euler: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_joint_rotation == null) gdext.classes.PhysicalBone3D.mb_set_joint_rotation = MethodBind.get("PhysicalBone3D", "set_joint_rotation", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_joint_rotation, livePtr, euler)
  }

  /** PhysicalBone3D.get_joint_rotation */
  final def getJointRotation(): gdext.builtin.Vector3 = {
    if (gdext.classes.PhysicalBone3D.mb_get_joint_rotation == null) gdext.classes.PhysicalBone3D.mb_get_joint_rotation = MethodBind.get("PhysicalBone3D", "get_joint_rotation", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.PhysicalBone3D.mb_get_joint_rotation, livePtr)
  }

  /** PhysicalBone3D.set_body_offset */
  final def setBodyOffset(offset: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_body_offset == null) gdext.classes.PhysicalBone3D.mb_set_body_offset = MethodBind.get("PhysicalBone3D", "set_body_offset", 2952846383L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_body_offset, livePtr, offset)
  }

  /** PhysicalBone3D.get_body_offset */
  final def getBodyOffset(): gdext.builtin.Transform3D = {
    if (gdext.classes.PhysicalBone3D.mb_get_body_offset == null) gdext.classes.PhysicalBone3D.mb_get_body_offset = MethodBind.get("PhysicalBone3D", "get_body_offset", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.PhysicalBone3D.mb_get_body_offset, livePtr)
  }

  /** PhysicalBone3D.get_simulate_physics */
  final def getSimulatePhysics(): Boolean = {
    if (gdext.classes.PhysicalBone3D.mb_get_simulate_physics == null) gdext.classes.PhysicalBone3D.mb_get_simulate_physics = MethodBind.get("PhysicalBone3D", "get_simulate_physics", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicalBone3D.mb_get_simulate_physics, livePtr)
  }

  /** PhysicalBone3D.is_simulating_physics */
  final def isSimulatingPhysics(): Boolean = {
    if (gdext.classes.PhysicalBone3D.mb_is_simulating_physics == null) gdext.classes.PhysicalBone3D.mb_is_simulating_physics = MethodBind.get("PhysicalBone3D", "is_simulating_physics", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicalBone3D.mb_is_simulating_physics, livePtr)
  }

  /** PhysicalBone3D.get_bone_id */
  final def getBoneId(): Long = {
    if (gdext.classes.PhysicalBone3D.mb_get_bone_id == null) gdext.classes.PhysicalBone3D.mb_get_bone_id = MethodBind.get("PhysicalBone3D", "get_bone_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicalBone3D.mb_get_bone_id, livePtr)
  }

  /** PhysicalBone3D.set_mass */
  final def setMass(mass: Double): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_mass == null) gdext.classes.PhysicalBone3D.mb_set_mass = MethodBind.get("PhysicalBone3D", "set_mass", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_mass, livePtr, mass)
  }

  /** PhysicalBone3D.get_mass */
  final def getMass(): Double = {
    if (gdext.classes.PhysicalBone3D.mb_get_mass == null) gdext.classes.PhysicalBone3D.mb_get_mass = MethodBind.get("PhysicalBone3D", "get_mass", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicalBone3D.mb_get_mass, livePtr)
  }

  /** PhysicalBone3D.set_friction */
  final def setFriction(friction: Double): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_friction == null) gdext.classes.PhysicalBone3D.mb_set_friction = MethodBind.get("PhysicalBone3D", "set_friction", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_friction, livePtr, friction)
  }

  /** PhysicalBone3D.get_friction */
  final def getFriction(): Double = {
    if (gdext.classes.PhysicalBone3D.mb_get_friction == null) gdext.classes.PhysicalBone3D.mb_get_friction = MethodBind.get("PhysicalBone3D", "get_friction", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicalBone3D.mb_get_friction, livePtr)
  }

  /** PhysicalBone3D.set_bounce */
  final def setBounce(bounce: Double): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_bounce == null) gdext.classes.PhysicalBone3D.mb_set_bounce = MethodBind.get("PhysicalBone3D", "set_bounce", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_bounce, livePtr, bounce)
  }

  /** PhysicalBone3D.get_bounce */
  final def getBounce(): Double = {
    if (gdext.classes.PhysicalBone3D.mb_get_bounce == null) gdext.classes.PhysicalBone3D.mb_get_bounce = MethodBind.get("PhysicalBone3D", "get_bounce", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicalBone3D.mb_get_bounce, livePtr)
  }

  /** PhysicalBone3D.set_gravity_scale */
  final def setGravityScale(gravity_scale: Double): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_gravity_scale == null) gdext.classes.PhysicalBone3D.mb_set_gravity_scale = MethodBind.get("PhysicalBone3D", "set_gravity_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_gravity_scale, livePtr, gravity_scale)
  }

  /** PhysicalBone3D.get_gravity_scale */
  final def getGravityScale(): Double = {
    if (gdext.classes.PhysicalBone3D.mb_get_gravity_scale == null) gdext.classes.PhysicalBone3D.mb_get_gravity_scale = MethodBind.get("PhysicalBone3D", "get_gravity_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicalBone3D.mb_get_gravity_scale, livePtr)
  }

  /** PhysicalBone3D.set_linear_damp_mode */
  final def setLinearDampMode(linear_damp_mode: Long): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_linear_damp_mode == null) gdext.classes.PhysicalBone3D.mb_set_linear_damp_mode = MethodBind.get("PhysicalBone3D", "set_linear_damp_mode", 1244972221L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_linear_damp_mode, livePtr, linear_damp_mode)
  }

  /** PhysicalBone3D.get_linear_damp_mode */
  final def getLinearDampMode(): Long = {
    if (gdext.classes.PhysicalBone3D.mb_get_linear_damp_mode == null) gdext.classes.PhysicalBone3D.mb_get_linear_damp_mode = MethodBind.get("PhysicalBone3D", "get_linear_damp_mode", 205884699L)
    Ptrcall.call0[Long](gdext.classes.PhysicalBone3D.mb_get_linear_damp_mode, livePtr)
  }

  /** PhysicalBone3D.set_angular_damp_mode */
  final def setAngularDampMode(angular_damp_mode: Long): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_angular_damp_mode == null) gdext.classes.PhysicalBone3D.mb_set_angular_damp_mode = MethodBind.get("PhysicalBone3D", "set_angular_damp_mode", 1244972221L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_angular_damp_mode, livePtr, angular_damp_mode)
  }

  /** PhysicalBone3D.get_angular_damp_mode */
  final def getAngularDampMode(): Long = {
    if (gdext.classes.PhysicalBone3D.mb_get_angular_damp_mode == null) gdext.classes.PhysicalBone3D.mb_get_angular_damp_mode = MethodBind.get("PhysicalBone3D", "get_angular_damp_mode", 205884699L)
    Ptrcall.call0[Long](gdext.classes.PhysicalBone3D.mb_get_angular_damp_mode, livePtr)
  }

  /** PhysicalBone3D.set_linear_damp */
  final def setLinearDamp(linear_damp: Double): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_linear_damp == null) gdext.classes.PhysicalBone3D.mb_set_linear_damp = MethodBind.get("PhysicalBone3D", "set_linear_damp", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_linear_damp, livePtr, linear_damp)
  }

  /** PhysicalBone3D.get_linear_damp */
  final def getLinearDamp(): Double = {
    if (gdext.classes.PhysicalBone3D.mb_get_linear_damp == null) gdext.classes.PhysicalBone3D.mb_get_linear_damp = MethodBind.get("PhysicalBone3D", "get_linear_damp", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicalBone3D.mb_get_linear_damp, livePtr)
  }

  /** PhysicalBone3D.set_angular_damp */
  final def setAngularDamp(angular_damp: Double): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_angular_damp == null) gdext.classes.PhysicalBone3D.mb_set_angular_damp = MethodBind.get("PhysicalBone3D", "set_angular_damp", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_angular_damp, livePtr, angular_damp)
  }

  /** PhysicalBone3D.get_angular_damp */
  final def getAngularDamp(): Double = {
    if (gdext.classes.PhysicalBone3D.mb_get_angular_damp == null) gdext.classes.PhysicalBone3D.mb_get_angular_damp = MethodBind.get("PhysicalBone3D", "get_angular_damp", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicalBone3D.mb_get_angular_damp, livePtr)
  }

  /** PhysicalBone3D.set_linear_velocity */
  final def setLinearVelocity(linear_velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_linear_velocity == null) gdext.classes.PhysicalBone3D.mb_set_linear_velocity = MethodBind.get("PhysicalBone3D", "set_linear_velocity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_linear_velocity, livePtr, linear_velocity)
  }

  /** PhysicalBone3D.get_linear_velocity */
  final def getLinearVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.PhysicalBone3D.mb_get_linear_velocity == null) gdext.classes.PhysicalBone3D.mb_get_linear_velocity = MethodBind.get("PhysicalBone3D", "get_linear_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.PhysicalBone3D.mb_get_linear_velocity, livePtr)
  }

  /** PhysicalBone3D.set_angular_velocity */
  final def setAngularVelocity(angular_velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_angular_velocity == null) gdext.classes.PhysicalBone3D.mb_set_angular_velocity = MethodBind.get("PhysicalBone3D", "set_angular_velocity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_angular_velocity, livePtr, angular_velocity)
  }

  /** PhysicalBone3D.get_angular_velocity */
  final def getAngularVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.PhysicalBone3D.mb_get_angular_velocity == null) gdext.classes.PhysicalBone3D.mb_get_angular_velocity = MethodBind.get("PhysicalBone3D", "get_angular_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.PhysicalBone3D.mb_get_angular_velocity, livePtr)
  }

  /** PhysicalBone3D.set_use_custom_integrator */
  final def setUseCustomIntegrator(enable: Boolean): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_use_custom_integrator == null) gdext.classes.PhysicalBone3D.mb_set_use_custom_integrator = MethodBind.get("PhysicalBone3D", "set_use_custom_integrator", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_use_custom_integrator, livePtr, enable)
  }

  /** PhysicalBone3D.is_using_custom_integrator */
  final def isUsingCustomIntegrator(): Boolean = {
    if (gdext.classes.PhysicalBone3D.mb_is_using_custom_integrator == null) gdext.classes.PhysicalBone3D.mb_is_using_custom_integrator = MethodBind.get("PhysicalBone3D", "is_using_custom_integrator", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicalBone3D.mb_is_using_custom_integrator, livePtr)
  }

  /** PhysicalBone3D.set_can_sleep */
  final def setCanSleep(able_to_sleep: Boolean): Unit = {
    if (gdext.classes.PhysicalBone3D.mb_set_can_sleep == null) gdext.classes.PhysicalBone3D.mb_set_can_sleep = MethodBind.get("PhysicalBone3D", "set_can_sleep", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone3D.mb_set_can_sleep, livePtr, able_to_sleep)
  }

  /** PhysicalBone3D.is_able_to_sleep */
  final def isAbleToSleep(): Boolean = {
    if (gdext.classes.PhysicalBone3D.mb_is_able_to_sleep == null) gdext.classes.PhysicalBone3D.mb_is_able_to_sleep = MethodBind.get("PhysicalBone3D", "is_able_to_sleep", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicalBone3D.mb_is_able_to_sleep, livePtr)
  }

}

object PhysicalBone3D {
  private[classes] var mb_apply_central_impulse: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_impulse: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_body_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_body_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_simulate_physics: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_simulating_physics: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_friction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_friction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bounce: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bounce: GDExtensionMethodBindPtr = null
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
  private[classes] var mb_set_use_custom_integrator: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_custom_integrator: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_can_sleep: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_able_to_sleep: GDExtensionMethodBindPtr = null
}
