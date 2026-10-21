package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonModification2DFABRIK`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DFABRIK extends SkeletonModification2D {
  override def godotClassName: String = "SkeletonModification2DFABRIK"

  /** SkeletonModification2DFABRIK.set_fabrik_data_chain_length */
  final def setFabrikDataChainLength(length: Long): Unit = {
    if (gdext.classes.SkeletonModification2DFABRIK.mb_set_fabrik_data_chain_length == null) gdext.classes.SkeletonModification2DFABRIK.mb_set_fabrik_data_chain_length = MethodBind.get("SkeletonModification2DFABRIK", "set_fabrik_data_chain_length", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DFABRIK.mb_set_fabrik_data_chain_length, livePtr, length)
  }

  /** SkeletonModification2DFABRIK.get_fabrik_data_chain_length */
  final def getFabrikDataChainLength(): Long = {
    if (gdext.classes.SkeletonModification2DFABRIK.mb_get_fabrik_data_chain_length == null) gdext.classes.SkeletonModification2DFABRIK.mb_get_fabrik_data_chain_length = MethodBind.get("SkeletonModification2DFABRIK", "get_fabrik_data_chain_length", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.SkeletonModification2DFABRIK.mb_get_fabrik_data_chain_length, livePtr)
  }

  /** SkeletonModification2DFABRIK.set_fabrik_joint_bone_index */
  final def setFabrikJointBoneIndex(joint_idx: Long, bone_idx: Long): Unit = {
    if (gdext.classes.SkeletonModification2DFABRIK.mb_set_fabrik_joint_bone_index == null) gdext.classes.SkeletonModification2DFABRIK.mb_set_fabrik_joint_bone_index = MethodBind.get("SkeletonModification2DFABRIK", "set_fabrik_joint_bone_index", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DFABRIK.mb_set_fabrik_joint_bone_index, livePtr, joint_idx, bone_idx)
  }

  /** SkeletonModification2DFABRIK.get_fabrik_joint_bone_index */
  final def getFabrikJointBoneIndex(joint_idx: Long): Long = {
    if (gdext.classes.SkeletonModification2DFABRIK.mb_get_fabrik_joint_bone_index == null) gdext.classes.SkeletonModification2DFABRIK.mb_get_fabrik_joint_bone_index = MethodBind.get("SkeletonModification2DFABRIK", "get_fabrik_joint_bone_index", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SkeletonModification2DFABRIK.mb_get_fabrik_joint_bone_index, livePtr, joint_idx)
  }

  /** SkeletonModification2DFABRIK.set_fabrik_joint_magnet_position */
  final def setFabrikJointMagnetPosition(joint_idx: Long, magnet_position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.SkeletonModification2DFABRIK.mb_set_fabrik_joint_magnet_position == null) gdext.classes.SkeletonModification2DFABRIK.mb_set_fabrik_joint_magnet_position = MethodBind.get("SkeletonModification2DFABRIK", "set_fabrik_joint_magnet_position", 163021252L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DFABRIK.mb_set_fabrik_joint_magnet_position, livePtr, joint_idx, magnet_position)
  }

  /** SkeletonModification2DFABRIK.get_fabrik_joint_magnet_position */
  final def getFabrikJointMagnetPosition(joint_idx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.SkeletonModification2DFABRIK.mb_get_fabrik_joint_magnet_position == null) gdext.classes.SkeletonModification2DFABRIK.mb_get_fabrik_joint_magnet_position = MethodBind.get("SkeletonModification2DFABRIK", "get_fabrik_joint_magnet_position", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.SkeletonModification2DFABRIK.mb_get_fabrik_joint_magnet_position, livePtr, joint_idx)
  }

  /** SkeletonModification2DFABRIK.set_fabrik_joint_use_target_rotation */
  final def setFabrikJointUseTargetRotation(joint_idx: Long, use_target_rotation: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DFABRIK.mb_set_fabrik_joint_use_target_rotation == null) gdext.classes.SkeletonModification2DFABRIK.mb_set_fabrik_joint_use_target_rotation = MethodBind.get("SkeletonModification2DFABRIK", "set_fabrik_joint_use_target_rotation", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DFABRIK.mb_set_fabrik_joint_use_target_rotation, livePtr, joint_idx, use_target_rotation)
  }

  /** SkeletonModification2DFABRIK.get_fabrik_joint_use_target_rotation */
  final def getFabrikJointUseTargetRotation(joint_idx: Long): Boolean = {
    if (gdext.classes.SkeletonModification2DFABRIK.mb_get_fabrik_joint_use_target_rotation == null) gdext.classes.SkeletonModification2DFABRIK.mb_get_fabrik_joint_use_target_rotation = MethodBind.get("SkeletonModification2DFABRIK", "get_fabrik_joint_use_target_rotation", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SkeletonModification2DFABRIK.mb_get_fabrik_joint_use_target_rotation, livePtr, joint_idx)
  }

}

object SkeletonModification2DFABRIK {
  private[classes] var mb_set_fabrik_data_chain_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fabrik_data_chain_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fabrik_joint_bone_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fabrik_joint_bone_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fabrik_joint_magnet_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fabrik_joint_magnet_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fabrik_joint_use_target_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fabrik_joint_use_target_rotation: GDExtensionMethodBindPtr = null
}
