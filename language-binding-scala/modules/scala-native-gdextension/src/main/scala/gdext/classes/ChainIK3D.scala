package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ChainIK3D`, extends `IKModifier3D`. */
abstract class ChainIK3D extends IKModifier3D {

  /** ChainIK3D.set_root_bone_name */
  final def setRootBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("ChainIK3D", "set_root_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** ChainIK3D.get_root_bone_name */
  final def getRootBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("ChainIK3D", "get_root_bone_name", 844755477L), hostObject.objectPtr, index)

  /** ChainIK3D.set_root_bone */
  final def setRootBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ChainIK3D", "set_root_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** ChainIK3D.get_root_bone */
  final def getRootBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ChainIK3D", "get_root_bone", 923996154L), hostObject.objectPtr, index)

  /** ChainIK3D.set_end_bone_name */
  final def setEndBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("ChainIK3D", "set_end_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** ChainIK3D.get_end_bone_name */
  final def getEndBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("ChainIK3D", "get_end_bone_name", 844755477L), hostObject.objectPtr, index)

  /** ChainIK3D.set_end_bone */
  final def setEndBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ChainIK3D", "set_end_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** ChainIK3D.get_end_bone */
  final def getEndBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ChainIK3D", "get_end_bone", 923996154L), hostObject.objectPtr, index)

  /** ChainIK3D.set_extend_end_bone */
  final def setExtendEndBone(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ChainIK3D", "set_extend_end_bone", 300928843L), hostObject.objectPtr, index, enabled)

  /** ChainIK3D.is_end_bone_extended */
  final def isEndBoneExtended(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("ChainIK3D", "is_end_bone_extended", 1116898809L), hostObject.objectPtr, index)

  /** ChainIK3D.set_end_bone_direction */
  final def setEndBoneDirection(index: Long, bone_direction: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ChainIK3D", "set_end_bone_direction", 2838484201L), hostObject.objectPtr, index, bone_direction)

  /** ChainIK3D.get_end_bone_direction */
  final def getEndBoneDirection(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ChainIK3D", "get_end_bone_direction", 1843036459L), hostObject.objectPtr, index)

  /** ChainIK3D.set_end_bone_length */
  final def setEndBoneLength(index: Long, length: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("ChainIK3D", "set_end_bone_length", 1602489585L), hostObject.objectPtr, index, length)

  /** ChainIK3D.get_end_bone_length */
  final def getEndBoneLength(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("ChainIK3D", "get_end_bone_length", 2339986948L), hostObject.objectPtr, index)

  /** ChainIK3D.get_joint_bone_name */
  final def getJointBoneName(index: Long, joint: Long): String =
    Ptrcall.call2[Long, Long, String](MethodBind.get("ChainIK3D", "get_joint_bone_name", 1391810591L), hostObject.objectPtr, index, joint)

  /** ChainIK3D.get_joint_bone */
  final def getJointBone(index: Long, joint: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("ChainIK3D", "get_joint_bone", 3175239445L), hostObject.objectPtr, index, joint)

  /** ChainIK3D.get_joint_count */
  final def getJointCount(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ChainIK3D", "get_joint_count", 923996154L), hostObject.objectPtr, index)

}

object ChainIK3D {
  /** Class metadata for Gd[ChainIK3D] lifetime management and casting. */
  given GodotClass[ChainIK3D] with {
    def className = "ChainIK3D"
    def isRefCounted = false
    def wrap(o: GodotObject): ChainIK3D = new ChainIK3D {}.withHost(o.objectPtr)
    def unwrap(t: ChainIK3D): GodotObject = t.hostObject
  }
}
