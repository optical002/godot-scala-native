package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `IterateIK3D`, extends `ChainIK3D`. */
abstract class IterateIK3D extends ChainIK3D {
  override def godotClassName: String = "IterateIK3D"

  /** IterateIK3D.set_max_iterations */
  final def setMaxIterations(maxIterations: Long): Unit = {
    if (gdext.classes.IterateIK3D.mb_set_max_iterations == null) gdext.classes.IterateIK3D.mb_set_max_iterations = MethodBind.get("IterateIK3D", "set_max_iterations", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.IterateIK3D.mb_set_max_iterations, livePtr, maxIterations)
  }

  /** IterateIK3D.get_max_iterations */
  final def getMaxIterations(): Long = {
    if (gdext.classes.IterateIK3D.mb_get_max_iterations == null) gdext.classes.IterateIK3D.mb_get_max_iterations = MethodBind.get("IterateIK3D", "get_max_iterations", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.IterateIK3D.mb_get_max_iterations, livePtr)
  }

  /** IterateIK3D.set_min_distance */
  final def setMinDistance(minDistance: Double): Unit = {
    if (gdext.classes.IterateIK3D.mb_set_min_distance == null) gdext.classes.IterateIK3D.mb_set_min_distance = MethodBind.get("IterateIK3D", "set_min_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.IterateIK3D.mb_set_min_distance, livePtr, minDistance)
  }

  /** IterateIK3D.get_min_distance */
  final def getMinDistance(): Double = {
    if (gdext.classes.IterateIK3D.mb_get_min_distance == null) gdext.classes.IterateIK3D.mb_get_min_distance = MethodBind.get("IterateIK3D", "get_min_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.IterateIK3D.mb_get_min_distance, livePtr)
  }

  /** IterateIK3D.set_angular_delta_limit */
  final def setAngularDeltaLimit(angularDeltaLimit: Double): Unit = {
    if (gdext.classes.IterateIK3D.mb_set_angular_delta_limit == null) gdext.classes.IterateIK3D.mb_set_angular_delta_limit = MethodBind.get("IterateIK3D", "set_angular_delta_limit", 373806689L)
    Ptrcall.callVoid1(gdext.classes.IterateIK3D.mb_set_angular_delta_limit, livePtr, angularDeltaLimit)
  }

  /** IterateIK3D.get_angular_delta_limit */
  final def getAngularDeltaLimit(): Double = {
    if (gdext.classes.IterateIK3D.mb_get_angular_delta_limit == null) gdext.classes.IterateIK3D.mb_get_angular_delta_limit = MethodBind.get("IterateIK3D", "get_angular_delta_limit", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.IterateIK3D.mb_get_angular_delta_limit, livePtr)
  }

  /** IterateIK3D.set_deterministic */
  final def setDeterministic(deterministic: Boolean): Unit = {
    if (gdext.classes.IterateIK3D.mb_set_deterministic == null) gdext.classes.IterateIK3D.mb_set_deterministic = MethodBind.get("IterateIK3D", "set_deterministic", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.IterateIK3D.mb_set_deterministic, livePtr, deterministic)
  }

  /** IterateIK3D.is_deterministic */
  final def isDeterministic(): Boolean = {
    if (gdext.classes.IterateIK3D.mb_is_deterministic == null) gdext.classes.IterateIK3D.mb_is_deterministic = MethodBind.get("IterateIK3D", "is_deterministic", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.IterateIK3D.mb_is_deterministic, livePtr)
  }

  /** IterateIK3D.set_joint_rotation_axis */
  final def setJointRotationAxis(index: Long, joint: Long, axis: gdext.classes.SkeletonModifier3D.RotationAxis): Unit = {
    if (gdext.classes.IterateIK3D.mb_set_joint_rotation_axis == null) gdext.classes.IterateIK3D.mb_set_joint_rotation_axis = MethodBind.get("IterateIK3D", "set_joint_rotation_axis", 1391134969L)
    Ptrcall.callVoid3(gdext.classes.IterateIK3D.mb_set_joint_rotation_axis, livePtr, index, joint, axis)
  }

  /** IterateIK3D.get_joint_rotation_axis */
  final def getJointRotationAxis(index: Long, joint: Long): gdext.classes.SkeletonModifier3D.RotationAxis = {
    if (gdext.classes.IterateIK3D.mb_get_joint_rotation_axis == null) gdext.classes.IterateIK3D.mb_get_joint_rotation_axis = MethodBind.get("IterateIK3D", "get_joint_rotation_axis", 3312594080L)
    gdext.classes.SkeletonModifier3D.RotationAxis(Ptrcall.call2[Long, Long, Long](gdext.classes.IterateIK3D.mb_get_joint_rotation_axis, livePtr, index, joint))
  }

  /** IterateIK3D.set_joint_rotation_axis_vector */
  final def setJointRotationAxisVector(index: Long, joint: Long, axisVector: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.IterateIK3D.mb_set_joint_rotation_axis_vector == null) gdext.classes.IterateIK3D.mb_set_joint_rotation_axis_vector = MethodBind.get("IterateIK3D", "set_joint_rotation_axis_vector", 2866752138L)
    Ptrcall.callVoid3(gdext.classes.IterateIK3D.mb_set_joint_rotation_axis_vector, livePtr, index, joint, axisVector)
  }

  /** IterateIK3D.get_joint_rotation_axis_vector */
  final def getJointRotationAxisVector(index: Long, joint: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.IterateIK3D.mb_get_joint_rotation_axis_vector == null) gdext.classes.IterateIK3D.mb_get_joint_rotation_axis_vector = MethodBind.get("IterateIK3D", "get_joint_rotation_axis_vector", 1592972041L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](gdext.classes.IterateIK3D.mb_get_joint_rotation_axis_vector, livePtr, index, joint)
  }

  /** IterateIK3D.set_joint_limitation */
  final def setJointLimitation(index: Long, joint: Long, limitation: JointLimitation3D): Unit = {
    if (gdext.classes.IterateIK3D.mb_set_joint_limitation == null) gdext.classes.IterateIK3D.mb_set_joint_limitation = MethodBind.get("IterateIK3D", "set_joint_limitation", 1194636955L)
    Ptrcall.callVoid3(gdext.classes.IterateIK3D.mb_set_joint_limitation, livePtr, index, joint, Wrappers.handle(limitation))
  }

  /** IterateIK3D.get_joint_limitation. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getJointLimitation(index: Long, joint: Long): JointLimitation3D = {
    if (gdext.classes.IterateIK3D.mb_get_joint_limitation == null) gdext.classes.IterateIK3D.mb_get_joint_limitation = MethodBind.get("IterateIK3D", "get_joint_limitation", 91665146L)
    Wrappers.owned[JointLimitation3D](Ptrcall.call2[Long, Long, Long](gdext.classes.IterateIK3D.mb_get_joint_limitation, livePtr, index, joint))
  }

  /** IterateIK3D.set_joint_limitation_right_axis */
  final def setJointLimitationRightAxis(index: Long, joint: Long, direction: gdext.classes.SkeletonModifier3D.SecondaryDirection): Unit = {
    if (gdext.classes.IterateIK3D.mb_set_joint_limitation_right_axis == null) gdext.classes.IterateIK3D.mb_set_joint_limitation_right_axis = MethodBind.get("IterateIK3D", "set_joint_limitation_right_axis", 3838967147L)
    Ptrcall.callVoid3(gdext.classes.IterateIK3D.mb_set_joint_limitation_right_axis, livePtr, index, joint, direction)
  }

  /** IterateIK3D.get_joint_limitation_right_axis */
  final def getJointLimitationRightAxis(index: Long, joint: Long): gdext.classes.SkeletonModifier3D.SecondaryDirection = {
    if (gdext.classes.IterateIK3D.mb_get_joint_limitation_right_axis == null) gdext.classes.IterateIK3D.mb_get_joint_limitation_right_axis = MethodBind.get("IterateIK3D", "get_joint_limitation_right_axis", 623936134L)
    gdext.classes.SkeletonModifier3D.SecondaryDirection(Ptrcall.call2[Long, Long, Long](gdext.classes.IterateIK3D.mb_get_joint_limitation_right_axis, livePtr, index, joint))
  }

  /** IterateIK3D.set_joint_limitation_right_axis_vector */
  final def setJointLimitationRightAxisVector(index: Long, joint: Long, vector: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.IterateIK3D.mb_set_joint_limitation_right_axis_vector == null) gdext.classes.IterateIK3D.mb_set_joint_limitation_right_axis_vector = MethodBind.get("IterateIK3D", "set_joint_limitation_right_axis_vector", 2866752138L)
    Ptrcall.callVoid3(gdext.classes.IterateIK3D.mb_set_joint_limitation_right_axis_vector, livePtr, index, joint, vector)
  }

  /** IterateIK3D.get_joint_limitation_right_axis_vector */
  final def getJointLimitationRightAxisVector(index: Long, joint: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.IterateIK3D.mb_get_joint_limitation_right_axis_vector == null) gdext.classes.IterateIK3D.mb_get_joint_limitation_right_axis_vector = MethodBind.get("IterateIK3D", "get_joint_limitation_right_axis_vector", 1592972041L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](gdext.classes.IterateIK3D.mb_get_joint_limitation_right_axis_vector, livePtr, index, joint)
  }

  /** IterateIK3D.set_joint_limitation_rotation_offset */
  final def setJointLimitationRotationOffset(index: Long, joint: Long, offset: gdext.builtin.Quaternion): Unit = {
    if (gdext.classes.IterateIK3D.mb_set_joint_limitation_rotation_offset == null) gdext.classes.IterateIK3D.mb_set_joint_limitation_rotation_offset = MethodBind.get("IterateIK3D", "set_joint_limitation_rotation_offset", 4188936002L)
    Ptrcall.callVoid3(gdext.classes.IterateIK3D.mb_set_joint_limitation_rotation_offset, livePtr, index, joint, offset)
  }

  /** IterateIK3D.get_joint_limitation_rotation_offset */
  final def getJointLimitationRotationOffset(index: Long, joint: Long): gdext.builtin.Quaternion = {
    if (gdext.classes.IterateIK3D.mb_get_joint_limitation_rotation_offset == null) gdext.classes.IterateIK3D.mb_get_joint_limitation_rotation_offset = MethodBind.get("IterateIK3D", "get_joint_limitation_rotation_offset", 2722473700L)
    Ptrcall.call2[Long, Long, gdext.builtin.Quaternion](gdext.classes.IterateIK3D.mb_get_joint_limitation_rotation_offset, livePtr, index, joint)
  }

}

object IterateIK3D {
  private[classes] var mb_set_max_iterations: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_iterations: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_angular_delta_limit: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angular_delta_limit: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_deterministic: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_deterministic: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_rotation_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_rotation_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_rotation_axis_vector: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_rotation_axis_vector: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_limitation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_limitation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_limitation_right_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_limitation_right_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_limitation_right_axis_vector: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_limitation_right_axis_vector: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_limitation_rotation_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_limitation_rotation_offset: GDExtensionMethodBindPtr = null
}
