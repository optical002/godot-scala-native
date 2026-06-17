package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `TwoBoneIK3D`, extends `IKModifier3D`. */
abstract class TwoBoneIK3D extends IKModifier3D {

  /** TwoBoneIK3D.set_root_bone_name */
  final def setRootBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TwoBoneIK3D", "set_root_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** TwoBoneIK3D.get_root_bone_name */
  final def getRootBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TwoBoneIK3D", "get_root_bone_name", 844755477L), hostObject.objectPtr, index)

  /** TwoBoneIK3D.set_root_bone */
  final def setRootBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TwoBoneIK3D", "set_root_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** TwoBoneIK3D.get_root_bone */
  final def getRootBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TwoBoneIK3D", "get_root_bone", 923996154L), hostObject.objectPtr, index)

  /** TwoBoneIK3D.set_middle_bone_name */
  final def setMiddleBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TwoBoneIK3D", "set_middle_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** TwoBoneIK3D.get_middle_bone_name */
  final def getMiddleBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TwoBoneIK3D", "get_middle_bone_name", 844755477L), hostObject.objectPtr, index)

  /** TwoBoneIK3D.set_middle_bone */
  final def setMiddleBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TwoBoneIK3D", "set_middle_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** TwoBoneIK3D.get_middle_bone */
  final def getMiddleBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TwoBoneIK3D", "get_middle_bone", 923996154L), hostObject.objectPtr, index)

  /** TwoBoneIK3D.set_pole_direction */
  final def setPoleDirection(index: Long, direction: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TwoBoneIK3D", "set_pole_direction", 258741388L), hostObject.objectPtr, index, direction)

  /** TwoBoneIK3D.get_pole_direction */
  final def getPoleDirection(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TwoBoneIK3D", "get_pole_direction", 377522128L), hostObject.objectPtr, index)

  /** TwoBoneIK3D.set_pole_direction_vector */
  final def setPoleDirectionVector(index: Long, vector: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("TwoBoneIK3D", "set_pole_direction_vector", 1530502735L), hostObject.objectPtr, index, vector)

  /** TwoBoneIK3D.get_pole_direction_vector */
  final def getPoleDirectionVector(index: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("TwoBoneIK3D", "get_pole_direction_vector", 711720468L), hostObject.objectPtr, index)

  /** TwoBoneIK3D.set_end_bone_name */
  final def setEndBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TwoBoneIK3D", "set_end_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** TwoBoneIK3D.get_end_bone_name */
  final def getEndBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TwoBoneIK3D", "get_end_bone_name", 844755477L), hostObject.objectPtr, index)

  /** TwoBoneIK3D.set_end_bone */
  final def setEndBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TwoBoneIK3D", "set_end_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** TwoBoneIK3D.get_end_bone */
  final def getEndBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TwoBoneIK3D", "get_end_bone", 923996154L), hostObject.objectPtr, index)

  /** TwoBoneIK3D.set_use_virtual_end */
  final def setUseVirtualEnd(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TwoBoneIK3D", "set_use_virtual_end", 300928843L), hostObject.objectPtr, index, enabled)

  /** TwoBoneIK3D.is_using_virtual_end */
  final def isUsingVirtualEnd(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TwoBoneIK3D", "is_using_virtual_end", 1116898809L), hostObject.objectPtr, index)

  /** TwoBoneIK3D.set_extend_end_bone */
  final def setExtendEndBone(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TwoBoneIK3D", "set_extend_end_bone", 300928843L), hostObject.objectPtr, index, enabled)

  /** TwoBoneIK3D.is_end_bone_extended */
  final def isEndBoneExtended(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TwoBoneIK3D", "is_end_bone_extended", 1116898809L), hostObject.objectPtr, index)

  /** TwoBoneIK3D.set_end_bone_direction */
  final def setEndBoneDirection(index: Long, bone_direction: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TwoBoneIK3D", "set_end_bone_direction", 2838484201L), hostObject.objectPtr, index, bone_direction)

  /** TwoBoneIK3D.get_end_bone_direction */
  final def getEndBoneDirection(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TwoBoneIK3D", "get_end_bone_direction", 1843036459L), hostObject.objectPtr, index)

  /** TwoBoneIK3D.set_end_bone_length */
  final def setEndBoneLength(index: Long, length: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("TwoBoneIK3D", "set_end_bone_length", 1602489585L), hostObject.objectPtr, index, length)

  /** TwoBoneIK3D.get_end_bone_length */
  final def getEndBoneLength(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("TwoBoneIK3D", "get_end_bone_length", 2339986948L), hostObject.objectPtr, index)

}

object TwoBoneIK3D {
  /** Class metadata for Gd[TwoBoneIK3D] lifetime management and casting. */
  given GodotClass[TwoBoneIK3D] with {
    def className = "TwoBoneIK3D"
    def isRefCounted = false
    def wrap(o: GodotObject): TwoBoneIK3D = new TwoBoneIK3D {}.withHost(o.objectPtr)
    def unwrap(t: TwoBoneIK3D): GodotObject = t.hostObject
  }
}
