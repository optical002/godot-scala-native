package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ChainIK3D`, extends `IKModifier3D`. */
abstract class ChainIK3D extends IKModifier3D {
  override def godotClassName: String = "ChainIK3D"

  /** ChainIK3D.set_root_bone_name */
  final def setRootBoneName(index: Long, boneName: String): Unit = {
    if (gdext.classes.ChainIK3D.mb_set_root_bone_name == null) gdext.classes.ChainIK3D.mb_set_root_bone_name = MethodBind.get("ChainIK3D", "set_root_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.ChainIK3D.mb_set_root_bone_name, livePtr, index, boneName)
  }

  /** ChainIK3D.get_root_bone_name */
  final def getRootBoneName(index: Long): String = {
    if (gdext.classes.ChainIK3D.mb_get_root_bone_name == null) gdext.classes.ChainIK3D.mb_get_root_bone_name = MethodBind.get("ChainIK3D", "get_root_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.ChainIK3D.mb_get_root_bone_name, livePtr, index)
  }

  /** ChainIK3D.set_root_bone */
  final def setRootBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.ChainIK3D.mb_set_root_bone == null) gdext.classes.ChainIK3D.mb_set_root_bone = MethodBind.get("ChainIK3D", "set_root_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.ChainIK3D.mb_set_root_bone, livePtr, index, bone)
  }

  /** ChainIK3D.get_root_bone */
  final def getRootBone(index: Long): Long = {
    if (gdext.classes.ChainIK3D.mb_get_root_bone == null) gdext.classes.ChainIK3D.mb_get_root_bone = MethodBind.get("ChainIK3D", "get_root_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.ChainIK3D.mb_get_root_bone, livePtr, index)
  }

  /** ChainIK3D.set_end_bone_name */
  final def setEndBoneName(index: Long, boneName: String): Unit = {
    if (gdext.classes.ChainIK3D.mb_set_end_bone_name == null) gdext.classes.ChainIK3D.mb_set_end_bone_name = MethodBind.get("ChainIK3D", "set_end_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.ChainIK3D.mb_set_end_bone_name, livePtr, index, boneName)
  }

  /** ChainIK3D.get_end_bone_name */
  final def getEndBoneName(index: Long): String = {
    if (gdext.classes.ChainIK3D.mb_get_end_bone_name == null) gdext.classes.ChainIK3D.mb_get_end_bone_name = MethodBind.get("ChainIK3D", "get_end_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.ChainIK3D.mb_get_end_bone_name, livePtr, index)
  }

  /** ChainIK3D.set_end_bone */
  final def setEndBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.ChainIK3D.mb_set_end_bone == null) gdext.classes.ChainIK3D.mb_set_end_bone = MethodBind.get("ChainIK3D", "set_end_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.ChainIK3D.mb_set_end_bone, livePtr, index, bone)
  }

  /** ChainIK3D.get_end_bone */
  final def getEndBone(index: Long): Long = {
    if (gdext.classes.ChainIK3D.mb_get_end_bone == null) gdext.classes.ChainIK3D.mb_get_end_bone = MethodBind.get("ChainIK3D", "get_end_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.ChainIK3D.mb_get_end_bone, livePtr, index)
  }

  /** ChainIK3D.set_extend_end_bone */
  final def setExtendEndBone(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.ChainIK3D.mb_set_extend_end_bone == null) gdext.classes.ChainIK3D.mb_set_extend_end_bone = MethodBind.get("ChainIK3D", "set_extend_end_bone", 300928843L)
    Ptrcall.callVoid2(gdext.classes.ChainIK3D.mb_set_extend_end_bone, livePtr, index, enabled)
  }

  /** ChainIK3D.is_end_bone_extended */
  final def isEndBoneExtended(index: Long): Boolean = {
    if (gdext.classes.ChainIK3D.mb_is_end_bone_extended == null) gdext.classes.ChainIK3D.mb_is_end_bone_extended = MethodBind.get("ChainIK3D", "is_end_bone_extended", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.ChainIK3D.mb_is_end_bone_extended, livePtr, index)
  }

  /** ChainIK3D.set_end_bone_direction */
  final def setEndBoneDirection(index: Long, boneDirection: gdext.classes.SkeletonModifier3D.BoneDirection): Unit = {
    if (gdext.classes.ChainIK3D.mb_set_end_bone_direction == null) gdext.classes.ChainIK3D.mb_set_end_bone_direction = MethodBind.get("ChainIK3D", "set_end_bone_direction", 2838484201L)
    Ptrcall.callVoid2(gdext.classes.ChainIK3D.mb_set_end_bone_direction, livePtr, index, boneDirection)
  }

  /** ChainIK3D.get_end_bone_direction */
  final def getEndBoneDirection(index: Long): gdext.classes.SkeletonModifier3D.BoneDirection = {
    if (gdext.classes.ChainIK3D.mb_get_end_bone_direction == null) gdext.classes.ChainIK3D.mb_get_end_bone_direction = MethodBind.get("ChainIK3D", "get_end_bone_direction", 1843036459L)
    gdext.classes.SkeletonModifier3D.BoneDirection(Ptrcall.call1[Long, Long](gdext.classes.ChainIK3D.mb_get_end_bone_direction, livePtr, index))
  }

  /** ChainIK3D.set_end_bone_length */
  final def setEndBoneLength(index: Long, length: Double): Unit = {
    if (gdext.classes.ChainIK3D.mb_set_end_bone_length == null) gdext.classes.ChainIK3D.mb_set_end_bone_length = MethodBind.get("ChainIK3D", "set_end_bone_length", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.ChainIK3D.mb_set_end_bone_length, livePtr, index, length)
  }

  /** ChainIK3D.get_end_bone_length */
  final def getEndBoneLength(index: Long): Double = {
    if (gdext.classes.ChainIK3D.mb_get_end_bone_length == null) gdext.classes.ChainIK3D.mb_get_end_bone_length = MethodBind.get("ChainIK3D", "get_end_bone_length", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.ChainIK3D.mb_get_end_bone_length, livePtr, index)
  }

  /** ChainIK3D.get_joint_bone_name */
  final def getJointBoneName(index: Long, joint: Long): String = {
    if (gdext.classes.ChainIK3D.mb_get_joint_bone_name == null) gdext.classes.ChainIK3D.mb_get_joint_bone_name = MethodBind.get("ChainIK3D", "get_joint_bone_name", 1391810591L)
    Ptrcall.call2[Long, Long, String](gdext.classes.ChainIK3D.mb_get_joint_bone_name, livePtr, index, joint)
  }

  /** ChainIK3D.get_joint_bone */
  final def getJointBone(index: Long, joint: Long): Long = {
    if (gdext.classes.ChainIK3D.mb_get_joint_bone == null) gdext.classes.ChainIK3D.mb_get_joint_bone = MethodBind.get("ChainIK3D", "get_joint_bone", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.ChainIK3D.mb_get_joint_bone, livePtr, index, joint)
  }

  /** ChainIK3D.get_joint_count */
  final def getJointCount(index: Long): Long = {
    if (gdext.classes.ChainIK3D.mb_get_joint_count == null) gdext.classes.ChainIK3D.mb_get_joint_count = MethodBind.get("ChainIK3D", "get_joint_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.ChainIK3D.mb_get_joint_count, livePtr, index)
  }

}

object ChainIK3D {
  private[classes] var mb_set_root_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_extend_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_end_bone_extended: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_count: GDExtensionMethodBindPtr = null
}
