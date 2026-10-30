package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonModification2DCCDIK`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DCCDIK extends SkeletonModification2D {
  override def godotClassName: String = "SkeletonModification2DCCDIK"

  /** SkeletonModification2DCCDIK.set_ccdik_data_chain_length */
  final def setCcdikDataChainLength(length: Long): Unit = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_data_chain_length == null) gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_data_chain_length = MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_data_chain_length", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_data_chain_length, livePtr, length)
  }

  /** SkeletonModification2DCCDIK.get_ccdik_data_chain_length */
  final def getCcdikDataChainLength(): Long = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_data_chain_length == null) gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_data_chain_length = MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_data_chain_length", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_data_chain_length, livePtr)
  }

  /** SkeletonModification2DCCDIK.set_ccdik_joint_bone_index */
  final def setCcdikJointBoneIndex(jointIdx: Long, boneIdx: Long): Unit = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_bone_index == null) gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_bone_index = MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_bone_index", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_bone_index, livePtr, jointIdx, boneIdx)
  }

  /** SkeletonModification2DCCDIK.get_ccdik_joint_bone_index */
  final def getCcdikJointBoneIndex(jointIdx: Long): Long = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_bone_index == null) gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_bone_index = MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_bone_index", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_bone_index, livePtr, jointIdx)
  }

  /** SkeletonModification2DCCDIK.set_ccdik_joint_rotate_from_joint */
  final def setCcdikJointRotateFromJoint(jointIdx: Long, rotateFromJoint: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_rotate_from_joint == null) gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_rotate_from_joint = MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_rotate_from_joint", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_rotate_from_joint, livePtr, jointIdx, rotateFromJoint)
  }

  /** SkeletonModification2DCCDIK.get_ccdik_joint_rotate_from_joint */
  final def getCcdikJointRotateFromJoint(jointIdx: Long): Boolean = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_rotate_from_joint == null) gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_rotate_from_joint = MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_rotate_from_joint", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_rotate_from_joint, livePtr, jointIdx)
  }

  /** SkeletonModification2DCCDIK.set_ccdik_joint_enable_constraint */
  final def setCcdikJointEnableConstraint(jointIdx: Long, enableConstraint: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_enable_constraint == null) gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_enable_constraint = MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_enable_constraint", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_enable_constraint, livePtr, jointIdx, enableConstraint)
  }

  /** SkeletonModification2DCCDIK.get_ccdik_joint_enable_constraint */
  final def getCcdikJointEnableConstraint(jointIdx: Long): Boolean = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_enable_constraint == null) gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_enable_constraint = MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_enable_constraint", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_enable_constraint, livePtr, jointIdx)
  }

  /** SkeletonModification2DCCDIK.set_ccdik_joint_constraint_angle_min */
  final def setCcdikJointConstraintAngleMin(jointIdx: Long, angleMin: Double): Unit = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_min == null) gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_min = MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_min", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_min, livePtr, jointIdx, angleMin)
  }

  /** SkeletonModification2DCCDIK.get_ccdik_joint_constraint_angle_min */
  final def getCcdikJointConstraintAngleMin(jointIdx: Long): Double = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_min == null) gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_min = MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_min", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_min, livePtr, jointIdx)
  }

  /** SkeletonModification2DCCDIK.set_ccdik_joint_constraint_angle_max */
  final def setCcdikJointConstraintAngleMax(jointIdx: Long, angleMax: Double): Unit = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_max == null) gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_max = MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_max", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_max, livePtr, jointIdx, angleMax)
  }

  /** SkeletonModification2DCCDIK.get_ccdik_joint_constraint_angle_max */
  final def getCcdikJointConstraintAngleMax(jointIdx: Long): Double = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_max == null) gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_max = MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_max", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_max, livePtr, jointIdx)
  }

  /** SkeletonModification2DCCDIK.set_ccdik_joint_constraint_angle_invert */
  final def setCcdikJointConstraintAngleInvert(jointIdx: Long, invert: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_invert == null) gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_invert = MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_invert", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_invert, livePtr, jointIdx, invert)
  }

  /** SkeletonModification2DCCDIK.get_ccdik_joint_constraint_angle_invert */
  final def getCcdikJointConstraintAngleInvert(jointIdx: Long): Boolean = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_invert == null) gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_invert = MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_invert", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_invert, livePtr, jointIdx)
  }

}

object SkeletonModification2DCCDIK {
  private[classes] var mb_set_ccdik_data_chain_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ccdik_data_chain_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ccdik_joint_bone_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ccdik_joint_bone_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ccdik_joint_rotate_from_joint: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ccdik_joint_rotate_from_joint: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ccdik_joint_enable_constraint: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ccdik_joint_enable_constraint: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ccdik_joint_constraint_angle_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ccdik_joint_constraint_angle_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ccdik_joint_constraint_angle_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ccdik_joint_constraint_angle_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ccdik_joint_constraint_angle_invert: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ccdik_joint_constraint_angle_invert: GDExtensionMethodBindPtr = null
}
