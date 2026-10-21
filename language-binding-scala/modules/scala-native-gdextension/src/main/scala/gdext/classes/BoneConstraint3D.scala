package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `BoneConstraint3D`, extends `SkeletonModifier3D`. */
abstract class BoneConstraint3D extends SkeletonModifier3D {
  override def godotClassName: String = "BoneConstraint3D"

  /** BoneConstraint3D.set_amount */
  final def setAmount(index: Long, amount: Double): Unit = {
    if (gdext.classes.BoneConstraint3D.mb_set_amount == null) gdext.classes.BoneConstraint3D.mb_set_amount = MethodBind.get("BoneConstraint3D", "set_amount", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.BoneConstraint3D.mb_set_amount, livePtr, index, amount)
  }

  /** BoneConstraint3D.get_amount */
  final def getAmount(index: Long): Double = {
    if (gdext.classes.BoneConstraint3D.mb_get_amount == null) gdext.classes.BoneConstraint3D.mb_get_amount = MethodBind.get("BoneConstraint3D", "get_amount", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.BoneConstraint3D.mb_get_amount, livePtr, index)
  }

  /** BoneConstraint3D.set_apply_bone_name */
  final def setApplyBoneName(index: Long, bone_name: String): Unit = {
    if (gdext.classes.BoneConstraint3D.mb_set_apply_bone_name == null) gdext.classes.BoneConstraint3D.mb_set_apply_bone_name = MethodBind.get("BoneConstraint3D", "set_apply_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.BoneConstraint3D.mb_set_apply_bone_name, livePtr, index, bone_name)
  }

  /** BoneConstraint3D.get_apply_bone_name */
  final def getApplyBoneName(index: Long): String = {
    if (gdext.classes.BoneConstraint3D.mb_get_apply_bone_name == null) gdext.classes.BoneConstraint3D.mb_get_apply_bone_name = MethodBind.get("BoneConstraint3D", "get_apply_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.BoneConstraint3D.mb_get_apply_bone_name, livePtr, index)
  }

  /** BoneConstraint3D.set_apply_bone */
  final def setApplyBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.BoneConstraint3D.mb_set_apply_bone == null) gdext.classes.BoneConstraint3D.mb_set_apply_bone = MethodBind.get("BoneConstraint3D", "set_apply_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.BoneConstraint3D.mb_set_apply_bone, livePtr, index, bone)
  }

  /** BoneConstraint3D.get_apply_bone */
  final def getApplyBone(index: Long): Long = {
    if (gdext.classes.BoneConstraint3D.mb_get_apply_bone == null) gdext.classes.BoneConstraint3D.mb_get_apply_bone = MethodBind.get("BoneConstraint3D", "get_apply_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.BoneConstraint3D.mb_get_apply_bone, livePtr, index)
  }

  /** BoneConstraint3D.set_reference_type */
  final def setReferenceType(index: Long, `type`: Long): Unit = {
    if (gdext.classes.BoneConstraint3D.mb_set_reference_type == null) gdext.classes.BoneConstraint3D.mb_set_reference_type = MethodBind.get("BoneConstraint3D", "set_reference_type", 1830520418L)
    Ptrcall.callVoid2(gdext.classes.BoneConstraint3D.mb_set_reference_type, livePtr, index, `type`)
  }

  /** BoneConstraint3D.get_reference_type */
  final def getReferenceType(index: Long): Long = {
    if (gdext.classes.BoneConstraint3D.mb_get_reference_type == null) gdext.classes.BoneConstraint3D.mb_get_reference_type = MethodBind.get("BoneConstraint3D", "get_reference_type", 3456416152L)
    Ptrcall.call1[Long, Long](gdext.classes.BoneConstraint3D.mb_get_reference_type, livePtr, index)
  }

  /** BoneConstraint3D.set_reference_bone_name */
  final def setReferenceBoneName(index: Long, bone_name: String): Unit = {
    if (gdext.classes.BoneConstraint3D.mb_set_reference_bone_name == null) gdext.classes.BoneConstraint3D.mb_set_reference_bone_name = MethodBind.get("BoneConstraint3D", "set_reference_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.BoneConstraint3D.mb_set_reference_bone_name, livePtr, index, bone_name)
  }

  /** BoneConstraint3D.get_reference_bone_name */
  final def getReferenceBoneName(index: Long): String = {
    if (gdext.classes.BoneConstraint3D.mb_get_reference_bone_name == null) gdext.classes.BoneConstraint3D.mb_get_reference_bone_name = MethodBind.get("BoneConstraint3D", "get_reference_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.BoneConstraint3D.mb_get_reference_bone_name, livePtr, index)
  }

  /** BoneConstraint3D.set_reference_bone */
  final def setReferenceBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.BoneConstraint3D.mb_set_reference_bone == null) gdext.classes.BoneConstraint3D.mb_set_reference_bone = MethodBind.get("BoneConstraint3D", "set_reference_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.BoneConstraint3D.mb_set_reference_bone, livePtr, index, bone)
  }

  /** BoneConstraint3D.get_reference_bone */
  final def getReferenceBone(index: Long): Long = {
    if (gdext.classes.BoneConstraint3D.mb_get_reference_bone == null) gdext.classes.BoneConstraint3D.mb_get_reference_bone = MethodBind.get("BoneConstraint3D", "get_reference_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.BoneConstraint3D.mb_get_reference_bone, livePtr, index)
  }

  /** BoneConstraint3D.set_setting_count */
  final def setSettingCount(count: Long): Unit = {
    if (gdext.classes.BoneConstraint3D.mb_set_setting_count == null) gdext.classes.BoneConstraint3D.mb_set_setting_count = MethodBind.get("BoneConstraint3D", "set_setting_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BoneConstraint3D.mb_set_setting_count, livePtr, count)
  }

  /** BoneConstraint3D.get_setting_count */
  final def getSettingCount(): Long = {
    if (gdext.classes.BoneConstraint3D.mb_get_setting_count == null) gdext.classes.BoneConstraint3D.mb_get_setting_count = MethodBind.get("BoneConstraint3D", "get_setting_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BoneConstraint3D.mb_get_setting_count, livePtr)
  }

  /** BoneConstraint3D.clear_setting */
  final def clearSetting(): Unit = {
    if (gdext.classes.BoneConstraint3D.mb_clear_setting == null) gdext.classes.BoneConstraint3D.mb_clear_setting = MethodBind.get("BoneConstraint3D", "clear_setting", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.BoneConstraint3D.mb_clear_setting, livePtr)
  }

}

object BoneConstraint3D {
  private[classes] var mb_set_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_apply_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_apply_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_apply_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_apply_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reference_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reference_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reference_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reference_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reference_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reference_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_setting_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_setting_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_setting: GDExtensionMethodBindPtr = null
}
