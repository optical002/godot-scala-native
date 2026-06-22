package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonModification2DFABRIK`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DFABRIK extends SkeletonModification2D {

  /** SkeletonModification2DFABRIK.set_fabrik_data_chain_length */
  final def setFabrikDataChainLength(length: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DFABRIK", "set_fabrik_data_chain_length", 1286410249L), hostObject.objectPtr, length)

  /** SkeletonModification2DFABRIK.get_fabrik_data_chain_length */
  final def getFabrikDataChainLength(): Long =
    Ptrcall.call0[Long](MethodBind.get("SkeletonModification2DFABRIK", "get_fabrik_data_chain_length", 2455072627L), hostObject.objectPtr)

  /** SkeletonModification2DFABRIK.set_fabrik_joint_bone_index */
  final def setFabrikJointBoneIndex(joint_idx: Long, bone_idx: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DFABRIK", "set_fabrik_joint_bone_index", 3937882851L), hostObject.objectPtr, joint_idx, bone_idx)

  /** SkeletonModification2DFABRIK.get_fabrik_joint_bone_index */
  final def getFabrikJointBoneIndex(joint_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SkeletonModification2DFABRIK", "get_fabrik_joint_bone_index", 923996154L), hostObject.objectPtr, joint_idx)

  /** SkeletonModification2DFABRIK.set_fabrik_joint_magnet_position */
  final def setFabrikJointMagnetPosition(joint_idx: Long, magnet_position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DFABRIK", "set_fabrik_joint_magnet_position", 163021252L), hostObject.objectPtr, joint_idx, magnet_position)

  /** SkeletonModification2DFABRIK.get_fabrik_joint_magnet_position */
  final def getFabrikJointMagnetPosition(joint_idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("SkeletonModification2DFABRIK", "get_fabrik_joint_magnet_position", 2299179447L), hostObject.objectPtr, joint_idx)

  /** SkeletonModification2DFABRIK.set_fabrik_joint_use_target_rotation */
  final def setFabrikJointUseTargetRotation(joint_idx: Long, use_target_rotation: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DFABRIK", "set_fabrik_joint_use_target_rotation", 300928843L), hostObject.objectPtr, joint_idx, use_target_rotation)

  /** SkeletonModification2DFABRIK.get_fabrik_joint_use_target_rotation */
  final def getFabrikJointUseTargetRotation(joint_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SkeletonModification2DFABRIK", "get_fabrik_joint_use_target_rotation", 1116898809L), hostObject.objectPtr, joint_idx)

}

object SkeletonModification2DFABRIK {
  /** Class metadata for Gd[SkeletonModification2DFABRIK] lifetime management and casting. */
  given GodotClass[SkeletonModification2DFABRIK] with {
    def className = "SkeletonModification2DFABRIK"
    def isRefCounted = true
    def wrap(o: GodotObject): SkeletonModification2DFABRIK = new SkeletonModification2DFABRIK {}.withHost(o.objectPtr)
    def unwrap(t: SkeletonModification2DFABRIK): GodotObject = t.hostObject
  }
}
