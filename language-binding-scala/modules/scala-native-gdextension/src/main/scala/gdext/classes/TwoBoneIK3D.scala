package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TwoBoneIK3D`, extends `IKModifier3D`. */
abstract class TwoBoneIK3D extends IKModifier3D {
  override def godotClassName: String = "TwoBoneIK3D"

  /** TwoBoneIK3D.set_root_bone_name */
  final def setRootBoneName(index: Long, boneName: String): Unit = {
    if (gdext.classes.TwoBoneIK3D.mb_set_root_bone_name == null) gdext.classes.TwoBoneIK3D.mb_set_root_bone_name = MethodBind.get("TwoBoneIK3D", "set_root_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TwoBoneIK3D.mb_set_root_bone_name, livePtr, index, boneName)
  }

  /** TwoBoneIK3D.get_root_bone_name */
  final def getRootBoneName(index: Long): String = {
    if (gdext.classes.TwoBoneIK3D.mb_get_root_bone_name == null) gdext.classes.TwoBoneIK3D.mb_get_root_bone_name = MethodBind.get("TwoBoneIK3D", "get_root_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TwoBoneIK3D.mb_get_root_bone_name, livePtr, index)
  }

  /** TwoBoneIK3D.set_root_bone */
  final def setRootBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.TwoBoneIK3D.mb_set_root_bone == null) gdext.classes.TwoBoneIK3D.mb_set_root_bone = MethodBind.get("TwoBoneIK3D", "set_root_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TwoBoneIK3D.mb_set_root_bone, livePtr, index, bone)
  }

  /** TwoBoneIK3D.get_root_bone */
  final def getRootBone(index: Long): Long = {
    if (gdext.classes.TwoBoneIK3D.mb_get_root_bone == null) gdext.classes.TwoBoneIK3D.mb_get_root_bone = MethodBind.get("TwoBoneIK3D", "get_root_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TwoBoneIK3D.mb_get_root_bone, livePtr, index)
  }

  /** TwoBoneIK3D.set_middle_bone_name */
  final def setMiddleBoneName(index: Long, boneName: String): Unit = {
    if (gdext.classes.TwoBoneIK3D.mb_set_middle_bone_name == null) gdext.classes.TwoBoneIK3D.mb_set_middle_bone_name = MethodBind.get("TwoBoneIK3D", "set_middle_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TwoBoneIK3D.mb_set_middle_bone_name, livePtr, index, boneName)
  }

  /** TwoBoneIK3D.get_middle_bone_name */
  final def getMiddleBoneName(index: Long): String = {
    if (gdext.classes.TwoBoneIK3D.mb_get_middle_bone_name == null) gdext.classes.TwoBoneIK3D.mb_get_middle_bone_name = MethodBind.get("TwoBoneIK3D", "get_middle_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TwoBoneIK3D.mb_get_middle_bone_name, livePtr, index)
  }

  /** TwoBoneIK3D.set_middle_bone */
  final def setMiddleBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.TwoBoneIK3D.mb_set_middle_bone == null) gdext.classes.TwoBoneIK3D.mb_set_middle_bone = MethodBind.get("TwoBoneIK3D", "set_middle_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TwoBoneIK3D.mb_set_middle_bone, livePtr, index, bone)
  }

  /** TwoBoneIK3D.get_middle_bone */
  final def getMiddleBone(index: Long): Long = {
    if (gdext.classes.TwoBoneIK3D.mb_get_middle_bone == null) gdext.classes.TwoBoneIK3D.mb_get_middle_bone = MethodBind.get("TwoBoneIK3D", "get_middle_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TwoBoneIK3D.mb_get_middle_bone, livePtr, index)
  }

  /** TwoBoneIK3D.set_pole_direction */
  final def setPoleDirection(index: Long, direction: gdext.classes.SkeletonModifier3D.SecondaryDirection): Unit = {
    if (gdext.classes.TwoBoneIK3D.mb_set_pole_direction == null) gdext.classes.TwoBoneIK3D.mb_set_pole_direction = MethodBind.get("TwoBoneIK3D", "set_pole_direction", 258741388L)
    Ptrcall.callVoid2(gdext.classes.TwoBoneIK3D.mb_set_pole_direction, livePtr, index, direction)
  }

  /** TwoBoneIK3D.get_pole_direction */
  final def getPoleDirection(index: Long): gdext.classes.SkeletonModifier3D.SecondaryDirection = {
    if (gdext.classes.TwoBoneIK3D.mb_get_pole_direction == null) gdext.classes.TwoBoneIK3D.mb_get_pole_direction = MethodBind.get("TwoBoneIK3D", "get_pole_direction", 377522128L)
    gdext.classes.SkeletonModifier3D.SecondaryDirection(Ptrcall.call1[Long, Long](gdext.classes.TwoBoneIK3D.mb_get_pole_direction, livePtr, index))
  }

  /** TwoBoneIK3D.set_pole_direction_vector */
  final def setPoleDirectionVector(index: Long, vector: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.TwoBoneIK3D.mb_set_pole_direction_vector == null) gdext.classes.TwoBoneIK3D.mb_set_pole_direction_vector = MethodBind.get("TwoBoneIK3D", "set_pole_direction_vector", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.TwoBoneIK3D.mb_set_pole_direction_vector, livePtr, index, vector)
  }

  /** TwoBoneIK3D.get_pole_direction_vector */
  final def getPoleDirectionVector(index: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.TwoBoneIK3D.mb_get_pole_direction_vector == null) gdext.classes.TwoBoneIK3D.mb_get_pole_direction_vector = MethodBind.get("TwoBoneIK3D", "get_pole_direction_vector", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.TwoBoneIK3D.mb_get_pole_direction_vector, livePtr, index)
  }

  /** TwoBoneIK3D.set_end_bone_name */
  final def setEndBoneName(index: Long, boneName: String): Unit = {
    if (gdext.classes.TwoBoneIK3D.mb_set_end_bone_name == null) gdext.classes.TwoBoneIK3D.mb_set_end_bone_name = MethodBind.get("TwoBoneIK3D", "set_end_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TwoBoneIK3D.mb_set_end_bone_name, livePtr, index, boneName)
  }

  /** TwoBoneIK3D.get_end_bone_name */
  final def getEndBoneName(index: Long): String = {
    if (gdext.classes.TwoBoneIK3D.mb_get_end_bone_name == null) gdext.classes.TwoBoneIK3D.mb_get_end_bone_name = MethodBind.get("TwoBoneIK3D", "get_end_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TwoBoneIK3D.mb_get_end_bone_name, livePtr, index)
  }

  /** TwoBoneIK3D.set_end_bone */
  final def setEndBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.TwoBoneIK3D.mb_set_end_bone == null) gdext.classes.TwoBoneIK3D.mb_set_end_bone = MethodBind.get("TwoBoneIK3D", "set_end_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TwoBoneIK3D.mb_set_end_bone, livePtr, index, bone)
  }

  /** TwoBoneIK3D.get_end_bone */
  final def getEndBone(index: Long): Long = {
    if (gdext.classes.TwoBoneIK3D.mb_get_end_bone == null) gdext.classes.TwoBoneIK3D.mb_get_end_bone = MethodBind.get("TwoBoneIK3D", "get_end_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TwoBoneIK3D.mb_get_end_bone, livePtr, index)
  }

  /** TwoBoneIK3D.set_use_virtual_end */
  final def setUseVirtualEnd(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.TwoBoneIK3D.mb_set_use_virtual_end == null) gdext.classes.TwoBoneIK3D.mb_set_use_virtual_end = MethodBind.get("TwoBoneIK3D", "set_use_virtual_end", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TwoBoneIK3D.mb_set_use_virtual_end, livePtr, index, enabled)
  }

  /** TwoBoneIK3D.is_using_virtual_end */
  final def isUsingVirtualEnd(index: Long): Boolean = {
    if (gdext.classes.TwoBoneIK3D.mb_is_using_virtual_end == null) gdext.classes.TwoBoneIK3D.mb_is_using_virtual_end = MethodBind.get("TwoBoneIK3D", "is_using_virtual_end", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TwoBoneIK3D.mb_is_using_virtual_end, livePtr, index)
  }

  /** TwoBoneIK3D.set_extend_end_bone */
  final def setExtendEndBone(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.TwoBoneIK3D.mb_set_extend_end_bone == null) gdext.classes.TwoBoneIK3D.mb_set_extend_end_bone = MethodBind.get("TwoBoneIK3D", "set_extend_end_bone", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TwoBoneIK3D.mb_set_extend_end_bone, livePtr, index, enabled)
  }

  /** TwoBoneIK3D.is_end_bone_extended */
  final def isEndBoneExtended(index: Long): Boolean = {
    if (gdext.classes.TwoBoneIK3D.mb_is_end_bone_extended == null) gdext.classes.TwoBoneIK3D.mb_is_end_bone_extended = MethodBind.get("TwoBoneIK3D", "is_end_bone_extended", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TwoBoneIK3D.mb_is_end_bone_extended, livePtr, index)
  }

  /** TwoBoneIK3D.set_end_bone_direction */
  final def setEndBoneDirection(index: Long, boneDirection: gdext.classes.SkeletonModifier3D.BoneDirection): Unit = {
    if (gdext.classes.TwoBoneIK3D.mb_set_end_bone_direction == null) gdext.classes.TwoBoneIK3D.mb_set_end_bone_direction = MethodBind.get("TwoBoneIK3D", "set_end_bone_direction", 2838484201L)
    Ptrcall.callVoid2(gdext.classes.TwoBoneIK3D.mb_set_end_bone_direction, livePtr, index, boneDirection)
  }

  /** TwoBoneIK3D.get_end_bone_direction */
  final def getEndBoneDirection(index: Long): gdext.classes.SkeletonModifier3D.BoneDirection = {
    if (gdext.classes.TwoBoneIK3D.mb_get_end_bone_direction == null) gdext.classes.TwoBoneIK3D.mb_get_end_bone_direction = MethodBind.get("TwoBoneIK3D", "get_end_bone_direction", 1843036459L)
    gdext.classes.SkeletonModifier3D.BoneDirection(Ptrcall.call1[Long, Long](gdext.classes.TwoBoneIK3D.mb_get_end_bone_direction, livePtr, index))
  }

  /** TwoBoneIK3D.set_end_bone_length */
  final def setEndBoneLength(index: Long, length: Double): Unit = {
    if (gdext.classes.TwoBoneIK3D.mb_set_end_bone_length == null) gdext.classes.TwoBoneIK3D.mb_set_end_bone_length = MethodBind.get("TwoBoneIK3D", "set_end_bone_length", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.TwoBoneIK3D.mb_set_end_bone_length, livePtr, index, length)
  }

  /** TwoBoneIK3D.get_end_bone_length */
  final def getEndBoneLength(index: Long): Double = {
    if (gdext.classes.TwoBoneIK3D.mb_get_end_bone_length == null) gdext.classes.TwoBoneIK3D.mb_get_end_bone_length = MethodBind.get("TwoBoneIK3D", "get_end_bone_length", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.TwoBoneIK3D.mb_get_end_bone_length, livePtr, index)
  }

}

object TwoBoneIK3D {
  private[classes] var mb_set_root_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_middle_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_middle_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_middle_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_middle_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pole_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pole_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pole_direction_vector: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pole_direction_vector: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_virtual_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_virtual_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_extend_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_end_bone_extended: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone_length: GDExtensionMethodBindPtr = null
}
