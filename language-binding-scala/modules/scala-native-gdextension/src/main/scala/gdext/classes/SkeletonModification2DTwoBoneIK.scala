package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonModification2DTwoBoneIK`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DTwoBoneIK extends SkeletonModification2D {
  override def godotClassName: String = "SkeletonModification2DTwoBoneIK"

  /** SkeletonModification2DTwoBoneIK.set_target_minimum_distance */
  final def setTargetMinimumDistance(minimum_distance: Double): Unit = {
    if (gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_target_minimum_distance == null) gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_target_minimum_distance = MethodBind.get("SkeletonModification2DTwoBoneIK", "set_target_minimum_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_target_minimum_distance, livePtr, minimum_distance)
  }

  /** SkeletonModification2DTwoBoneIK.get_target_minimum_distance */
  final def getTargetMinimumDistance(): Double = {
    if (gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_target_minimum_distance == null) gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_target_minimum_distance = MethodBind.get("SkeletonModification2DTwoBoneIK", "get_target_minimum_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_target_minimum_distance, livePtr)
  }

  /** SkeletonModification2DTwoBoneIK.set_target_maximum_distance */
  final def setTargetMaximumDistance(maximum_distance: Double): Unit = {
    if (gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_target_maximum_distance == null) gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_target_maximum_distance = MethodBind.get("SkeletonModification2DTwoBoneIK", "set_target_maximum_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_target_maximum_distance, livePtr, maximum_distance)
  }

  /** SkeletonModification2DTwoBoneIK.get_target_maximum_distance */
  final def getTargetMaximumDistance(): Double = {
    if (gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_target_maximum_distance == null) gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_target_maximum_distance = MethodBind.get("SkeletonModification2DTwoBoneIK", "get_target_maximum_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_target_maximum_distance, livePtr)
  }

  /** SkeletonModification2DTwoBoneIK.set_flip_bend_direction */
  final def setFlipBendDirection(flip_direction: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_flip_bend_direction == null) gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_flip_bend_direction = MethodBind.get("SkeletonModification2DTwoBoneIK", "set_flip_bend_direction", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_flip_bend_direction, livePtr, flip_direction)
  }

  /** SkeletonModification2DTwoBoneIK.get_flip_bend_direction */
  final def getFlipBendDirection(): Boolean = {
    if (gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_flip_bend_direction == null) gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_flip_bend_direction = MethodBind.get("SkeletonModification2DTwoBoneIK", "get_flip_bend_direction", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_flip_bend_direction, livePtr)
  }

  /** SkeletonModification2DTwoBoneIK.set_joint_one_bone_idx */
  final def setJointOneBoneIdx(bone_idx: Long): Unit = {
    if (gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_joint_one_bone_idx == null) gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_joint_one_bone_idx = MethodBind.get("SkeletonModification2DTwoBoneIK", "set_joint_one_bone_idx", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_joint_one_bone_idx, livePtr, bone_idx)
  }

  /** SkeletonModification2DTwoBoneIK.get_joint_one_bone_idx */
  final def getJointOneBoneIdx(): Long = {
    if (gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_joint_one_bone_idx == null) gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_joint_one_bone_idx = MethodBind.get("SkeletonModification2DTwoBoneIK", "get_joint_one_bone_idx", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_joint_one_bone_idx, livePtr)
  }

  /** SkeletonModification2DTwoBoneIK.set_joint_two_bone_idx */
  final def setJointTwoBoneIdx(bone_idx: Long): Unit = {
    if (gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_joint_two_bone_idx == null) gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_joint_two_bone_idx = MethodBind.get("SkeletonModification2DTwoBoneIK", "set_joint_two_bone_idx", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DTwoBoneIK.mb_set_joint_two_bone_idx, livePtr, bone_idx)
  }

  /** SkeletonModification2DTwoBoneIK.get_joint_two_bone_idx */
  final def getJointTwoBoneIdx(): Long = {
    if (gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_joint_two_bone_idx == null) gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_joint_two_bone_idx = MethodBind.get("SkeletonModification2DTwoBoneIK", "get_joint_two_bone_idx", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SkeletonModification2DTwoBoneIK.mb_get_joint_two_bone_idx, livePtr)
  }

}

object SkeletonModification2DTwoBoneIK {
  private[classes] var mb_set_target_minimum_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_target_minimum_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_target_maximum_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_target_maximum_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_bend_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flip_bend_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_one_bone_idx: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_one_bone_idx: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_two_bone_idx: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_two_bone_idx: GDExtensionMethodBindPtr = null
}
