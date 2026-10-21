package gdext.classes

import gdext.Godot
import gdext.builtin.*
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
  final def setCcdikJointBoneIndex(joint_idx: Long, bone_idx: Long): Unit = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_bone_index == null) gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_bone_index = MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_bone_index", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_bone_index, livePtr, joint_idx, bone_idx)
  }

  /** SkeletonModification2DCCDIK.get_ccdik_joint_bone_index */
  final def getCcdikJointBoneIndex(joint_idx: Long): Long = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_bone_index == null) gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_bone_index = MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_bone_index", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_bone_index, livePtr, joint_idx)
  }

  /** SkeletonModification2DCCDIK.set_ccdik_joint_rotate_from_joint */
  final def setCcdikJointRotateFromJoint(joint_idx: Long, rotate_from_joint: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_rotate_from_joint == null) gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_rotate_from_joint = MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_rotate_from_joint", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_rotate_from_joint, livePtr, joint_idx, rotate_from_joint)
  }

  /** SkeletonModification2DCCDIK.get_ccdik_joint_rotate_from_joint */
  final def getCcdikJointRotateFromJoint(joint_idx: Long): Boolean = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_rotate_from_joint == null) gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_rotate_from_joint = MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_rotate_from_joint", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_rotate_from_joint, livePtr, joint_idx)
  }

  /** SkeletonModification2DCCDIK.set_ccdik_joint_enable_constraint */
  final def setCcdikJointEnableConstraint(joint_idx: Long, enable_constraint: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_enable_constraint == null) gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_enable_constraint = MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_enable_constraint", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_enable_constraint, livePtr, joint_idx, enable_constraint)
  }

  /** SkeletonModification2DCCDIK.get_ccdik_joint_enable_constraint */
  final def getCcdikJointEnableConstraint(joint_idx: Long): Boolean = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_enable_constraint == null) gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_enable_constraint = MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_enable_constraint", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_enable_constraint, livePtr, joint_idx)
  }

  /** SkeletonModification2DCCDIK.set_ccdik_joint_constraint_angle_min */
  final def setCcdikJointConstraintAngleMin(joint_idx: Long, angle_min: Double): Unit = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_min == null) gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_min = MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_min", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_min, livePtr, joint_idx, angle_min)
  }

  /** SkeletonModification2DCCDIK.get_ccdik_joint_constraint_angle_min */
  final def getCcdikJointConstraintAngleMin(joint_idx: Long): Double = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_min == null) gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_min = MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_min", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_min, livePtr, joint_idx)
  }

  /** SkeletonModification2DCCDIK.set_ccdik_joint_constraint_angle_max */
  final def setCcdikJointConstraintAngleMax(joint_idx: Long, angle_max: Double): Unit = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_max == null) gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_max = MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_max", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_max, livePtr, joint_idx, angle_max)
  }

  /** SkeletonModification2DCCDIK.get_ccdik_joint_constraint_angle_max */
  final def getCcdikJointConstraintAngleMax(joint_idx: Long): Double = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_max == null) gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_max = MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_max", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_max, livePtr, joint_idx)
  }

  /** SkeletonModification2DCCDIK.set_ccdik_joint_constraint_angle_invert */
  final def setCcdikJointConstraintAngleInvert(joint_idx: Long, invert: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_invert == null) gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_invert = MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_invert", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DCCDIK.mb_set_ccdik_joint_constraint_angle_invert, livePtr, joint_idx, invert)
  }

  /** SkeletonModification2DCCDIK.get_ccdik_joint_constraint_angle_invert */
  final def getCcdikJointConstraintAngleInvert(joint_idx: Long): Boolean = {
    if (gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_invert == null) gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_invert = MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_invert", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SkeletonModification2DCCDIK.mb_get_ccdik_joint_constraint_angle_invert, livePtr, joint_idx)
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
