package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `BoneConstraint3D`, extends `SkeletonModifier3D`. */
abstract class BoneConstraint3D extends SkeletonModifier3D {

  /** BoneConstraint3D.set_amount */
  final def setAmount(index: Long, amount: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneConstraint3D", "set_amount", 1602489585L), hostObject.objectPtr, index, amount)

  /** BoneConstraint3D.get_amount */
  final def getAmount(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("BoneConstraint3D", "get_amount", 2339986948L), hostObject.objectPtr, index)

  /** BoneConstraint3D.set_apply_bone_name */
  final def setApplyBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneConstraint3D", "set_apply_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** BoneConstraint3D.get_apply_bone_name */
  final def getApplyBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("BoneConstraint3D", "get_apply_bone_name", 844755477L), hostObject.objectPtr, index)

  /** BoneConstraint3D.set_apply_bone */
  final def setApplyBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneConstraint3D", "set_apply_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** BoneConstraint3D.get_apply_bone */
  final def getApplyBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("BoneConstraint3D", "get_apply_bone", 923996154L), hostObject.objectPtr, index)

  /** BoneConstraint3D.set_reference_type */
  final def setReferenceType(index: Long, `type`: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneConstraint3D", "set_reference_type", 1830520418L), hostObject.objectPtr, index, `type`)

  /** BoneConstraint3D.get_reference_type */
  final def getReferenceType(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("BoneConstraint3D", "get_reference_type", 3456416152L), hostObject.objectPtr, index)

  /** BoneConstraint3D.set_reference_bone_name */
  final def setReferenceBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneConstraint3D", "set_reference_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** BoneConstraint3D.get_reference_bone_name */
  final def getReferenceBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("BoneConstraint3D", "get_reference_bone_name", 844755477L), hostObject.objectPtr, index)

  /** BoneConstraint3D.set_reference_bone */
  final def setReferenceBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneConstraint3D", "set_reference_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** BoneConstraint3D.get_reference_bone */
  final def getReferenceBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("BoneConstraint3D", "get_reference_bone", 923996154L), hostObject.objectPtr, index)

  /** BoneConstraint3D.set_setting_count */
  final def setSettingCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoneConstraint3D", "set_setting_count", 1286410249L), hostObject.objectPtr, count)

  /** BoneConstraint3D.get_setting_count */
  final def getSettingCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("BoneConstraint3D", "get_setting_count", 3905245786L), hostObject.objectPtr)

  /** BoneConstraint3D.clear_setting */
  final def clearSetting(): Unit =
    Ptrcall.callVoid0(MethodBind.get("BoneConstraint3D", "clear_setting", 3218959716L), hostObject.objectPtr)

}

object BoneConstraint3D {
  /** Class metadata for Gd[BoneConstraint3D] lifetime management and casting. */
  given GodotClass[BoneConstraint3D] with {
    def className = "BoneConstraint3D"
    def isRefCounted = false
    def wrap(o: GodotObject): BoneConstraint3D = new BoneConstraint3D {}.withHost(o.objectPtr)
    def unwrap(t: BoneConstraint3D): GodotObject = t.hostObject
  }
}
