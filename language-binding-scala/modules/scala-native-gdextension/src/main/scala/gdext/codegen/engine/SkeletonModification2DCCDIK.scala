package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonModification2DCCDIK`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DCCDIK extends SkeletonModification2D {

  /** SkeletonModification2DCCDIK.set_ccdik_data_chain_length */
  final def setCcdikDataChainLength(length: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_data_chain_length", 1286410249L), hostObject.objectPtr, length)

  /** SkeletonModification2DCCDIK.get_ccdik_data_chain_length */
  final def getCcdikDataChainLength(): Long =
    Ptrcall.call0[Long](MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_data_chain_length", 2455072627L), hostObject.objectPtr)

  /** SkeletonModification2DCCDIK.set_ccdik_joint_bone_index */
  final def setCcdikJointBoneIndex(joint_idx: Long, bone_idx: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_bone_index", 3937882851L), hostObject.objectPtr, joint_idx, bone_idx)

  /** SkeletonModification2DCCDIK.get_ccdik_joint_bone_index */
  final def getCcdikJointBoneIndex(joint_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_bone_index", 923996154L), hostObject.objectPtr, joint_idx)

  /** SkeletonModification2DCCDIK.set_ccdik_joint_rotate_from_joint */
  final def setCcdikJointRotateFromJoint(joint_idx: Long, rotate_from_joint: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_rotate_from_joint", 300928843L), hostObject.objectPtr, joint_idx, rotate_from_joint)

  /** SkeletonModification2DCCDIK.get_ccdik_joint_rotate_from_joint */
  final def getCcdikJointRotateFromJoint(joint_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_rotate_from_joint", 1116898809L), hostObject.objectPtr, joint_idx)

  /** SkeletonModification2DCCDIK.set_ccdik_joint_enable_constraint */
  final def setCcdikJointEnableConstraint(joint_idx: Long, enable_constraint: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_enable_constraint", 300928843L), hostObject.objectPtr, joint_idx, enable_constraint)

  /** SkeletonModification2DCCDIK.get_ccdik_joint_enable_constraint */
  final def getCcdikJointEnableConstraint(joint_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_enable_constraint", 1116898809L), hostObject.objectPtr, joint_idx)

  /** SkeletonModification2DCCDIK.set_ccdik_joint_constraint_angle_min */
  final def setCcdikJointConstraintAngleMin(joint_idx: Long, angle_min: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_min", 1602489585L), hostObject.objectPtr, joint_idx, angle_min)

  /** SkeletonModification2DCCDIK.get_ccdik_joint_constraint_angle_min */
  final def getCcdikJointConstraintAngleMin(joint_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_min", 2339986948L), hostObject.objectPtr, joint_idx)

  /** SkeletonModification2DCCDIK.set_ccdik_joint_constraint_angle_max */
  final def setCcdikJointConstraintAngleMax(joint_idx: Long, angle_max: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_max", 1602489585L), hostObject.objectPtr, joint_idx, angle_max)

  /** SkeletonModification2DCCDIK.get_ccdik_joint_constraint_angle_max */
  final def getCcdikJointConstraintAngleMax(joint_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_max", 2339986948L), hostObject.objectPtr, joint_idx)

  /** SkeletonModification2DCCDIK.set_ccdik_joint_constraint_angle_invert */
  final def setCcdikJointConstraintAngleInvert(joint_idx: Long, invert: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DCCDIK", "set_ccdik_joint_constraint_angle_invert", 300928843L), hostObject.objectPtr, joint_idx, invert)

  /** SkeletonModification2DCCDIK.get_ccdik_joint_constraint_angle_invert */
  final def getCcdikJointConstraintAngleInvert(joint_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SkeletonModification2DCCDIK", "get_ccdik_joint_constraint_angle_invert", 1116898809L), hostObject.objectPtr, joint_idx)

}

object SkeletonModification2DCCDIK {
  /** Class metadata for Gd[SkeletonModification2DCCDIK] lifetime management and casting. */
  given GodotClass[SkeletonModification2DCCDIK] with {
    def className = "SkeletonModification2DCCDIK"
    def isRefCounted = true
    def wrap(o: GodotObject): SkeletonModification2DCCDIK = new SkeletonModification2DCCDIK {}.withHost(o.objectPtr)
    def unwrap(t: SkeletonModification2DCCDIK): GodotObject = t.hostObject
  }
}
