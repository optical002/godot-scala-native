package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `BoneTwistDisperser3D`, extends `SkeletonModifier3D`. */
abstract class BoneTwistDisperser3D extends SkeletonModifier3D {
  override def godotClassName: String = "BoneTwistDisperser3D"

  /** BoneTwistDisperser3D.set_setting_count */
  final def setSettingCount(count: Long): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_setting_count == null) gdext.classes.BoneTwistDisperser3D.mb_set_setting_count = MethodBind.get("BoneTwistDisperser3D", "set_setting_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BoneTwistDisperser3D.mb_set_setting_count, livePtr, count)
  }

  /** BoneTwistDisperser3D.get_setting_count */
  final def getSettingCount(): Long = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_setting_count == null) gdext.classes.BoneTwistDisperser3D.mb_get_setting_count = MethodBind.get("BoneTwistDisperser3D", "get_setting_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BoneTwistDisperser3D.mb_get_setting_count, livePtr)
  }

  /** BoneTwistDisperser3D.clear_settings */
  final def clearSettings(): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_clear_settings == null) gdext.classes.BoneTwistDisperser3D.mb_clear_settings = MethodBind.get("BoneTwistDisperser3D", "clear_settings", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.BoneTwistDisperser3D.mb_clear_settings, livePtr)
  }

  /** BoneTwistDisperser3D.set_mutable_bone_axes */
  final def setMutableBoneAxes(enabled: Boolean): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_mutable_bone_axes == null) gdext.classes.BoneTwistDisperser3D.mb_set_mutable_bone_axes = MethodBind.get("BoneTwistDisperser3D", "set_mutable_bone_axes", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BoneTwistDisperser3D.mb_set_mutable_bone_axes, livePtr, enabled)
  }

  /** BoneTwistDisperser3D.are_bone_axes_mutable */
  final def areBoneAxesMutable(): Boolean = {
    if (gdext.classes.BoneTwistDisperser3D.mb_are_bone_axes_mutable == null) gdext.classes.BoneTwistDisperser3D.mb_are_bone_axes_mutable = MethodBind.get("BoneTwistDisperser3D", "are_bone_axes_mutable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BoneTwistDisperser3D.mb_are_bone_axes_mutable, livePtr)
  }

  /** BoneTwistDisperser3D.set_root_bone_name */
  final def setRootBoneName(index: Long, bone_name: String): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_root_bone_name == null) gdext.classes.BoneTwistDisperser3D.mb_set_root_bone_name = MethodBind.get("BoneTwistDisperser3D", "set_root_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.BoneTwistDisperser3D.mb_set_root_bone_name, livePtr, index, bone_name)
  }

  /** BoneTwistDisperser3D.get_root_bone_name */
  final def getRootBoneName(index: Long): String = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_root_bone_name == null) gdext.classes.BoneTwistDisperser3D.mb_get_root_bone_name = MethodBind.get("BoneTwistDisperser3D", "get_root_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.BoneTwistDisperser3D.mb_get_root_bone_name, livePtr, index)
  }

  /** BoneTwistDisperser3D.set_root_bone */
  final def setRootBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_root_bone == null) gdext.classes.BoneTwistDisperser3D.mb_set_root_bone = MethodBind.get("BoneTwistDisperser3D", "set_root_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.BoneTwistDisperser3D.mb_set_root_bone, livePtr, index, bone)
  }

  /** BoneTwistDisperser3D.get_root_bone */
  final def getRootBone(index: Long): Long = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_root_bone == null) gdext.classes.BoneTwistDisperser3D.mb_get_root_bone = MethodBind.get("BoneTwistDisperser3D", "get_root_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.BoneTwistDisperser3D.mb_get_root_bone, livePtr, index)
  }

  /** BoneTwistDisperser3D.set_end_bone_name */
  final def setEndBoneName(index: Long, bone_name: String): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_end_bone_name == null) gdext.classes.BoneTwistDisperser3D.mb_set_end_bone_name = MethodBind.get("BoneTwistDisperser3D", "set_end_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.BoneTwistDisperser3D.mb_set_end_bone_name, livePtr, index, bone_name)
  }

  /** BoneTwistDisperser3D.get_end_bone_name */
  final def getEndBoneName(index: Long): String = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_end_bone_name == null) gdext.classes.BoneTwistDisperser3D.mb_get_end_bone_name = MethodBind.get("BoneTwistDisperser3D", "get_end_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.BoneTwistDisperser3D.mb_get_end_bone_name, livePtr, index)
  }

  /** BoneTwistDisperser3D.set_end_bone */
  final def setEndBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_end_bone == null) gdext.classes.BoneTwistDisperser3D.mb_set_end_bone = MethodBind.get("BoneTwistDisperser3D", "set_end_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.BoneTwistDisperser3D.mb_set_end_bone, livePtr, index, bone)
  }

  /** BoneTwistDisperser3D.get_end_bone */
  final def getEndBone(index: Long): Long = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_end_bone == null) gdext.classes.BoneTwistDisperser3D.mb_get_end_bone = MethodBind.get("BoneTwistDisperser3D", "get_end_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.BoneTwistDisperser3D.mb_get_end_bone, livePtr, index)
  }

  /** BoneTwistDisperser3D.get_reference_bone_name */
  final def getReferenceBoneName(index: Long): String = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_reference_bone_name == null) gdext.classes.BoneTwistDisperser3D.mb_get_reference_bone_name = MethodBind.get("BoneTwistDisperser3D", "get_reference_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.BoneTwistDisperser3D.mb_get_reference_bone_name, livePtr, index)
  }

  /** BoneTwistDisperser3D.get_reference_bone */
  final def getReferenceBone(index: Long): Long = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_reference_bone == null) gdext.classes.BoneTwistDisperser3D.mb_get_reference_bone = MethodBind.get("BoneTwistDisperser3D", "get_reference_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.BoneTwistDisperser3D.mb_get_reference_bone, livePtr, index)
  }

  /** BoneTwistDisperser3D.set_extend_end_bone */
  final def setExtendEndBone(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_extend_end_bone == null) gdext.classes.BoneTwistDisperser3D.mb_set_extend_end_bone = MethodBind.get("BoneTwistDisperser3D", "set_extend_end_bone", 300928843L)
    Ptrcall.callVoid2(gdext.classes.BoneTwistDisperser3D.mb_set_extend_end_bone, livePtr, index, enabled)
  }

  /** BoneTwistDisperser3D.is_end_bone_extended */
  final def isEndBoneExtended(index: Long): Boolean = {
    if (gdext.classes.BoneTwistDisperser3D.mb_is_end_bone_extended == null) gdext.classes.BoneTwistDisperser3D.mb_is_end_bone_extended = MethodBind.get("BoneTwistDisperser3D", "is_end_bone_extended", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.BoneTwistDisperser3D.mb_is_end_bone_extended, livePtr, index)
  }

  /** BoneTwistDisperser3D.set_end_bone_direction */
  final def setEndBoneDirection(index: Long, bone_direction: Long): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_end_bone_direction == null) gdext.classes.BoneTwistDisperser3D.mb_set_end_bone_direction = MethodBind.get("BoneTwistDisperser3D", "set_end_bone_direction", 2838484201L)
    Ptrcall.callVoid2(gdext.classes.BoneTwistDisperser3D.mb_set_end_bone_direction, livePtr, index, bone_direction)
  }

  /** BoneTwistDisperser3D.get_end_bone_direction */
  final def getEndBoneDirection(index: Long): Long = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_end_bone_direction == null) gdext.classes.BoneTwistDisperser3D.mb_get_end_bone_direction = MethodBind.get("BoneTwistDisperser3D", "get_end_bone_direction", 1843036459L)
    Ptrcall.call1[Long, Long](gdext.classes.BoneTwistDisperser3D.mb_get_end_bone_direction, livePtr, index)
  }

  /** BoneTwistDisperser3D.set_twist_from_rest */
  final def setTwistFromRest(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_twist_from_rest == null) gdext.classes.BoneTwistDisperser3D.mb_set_twist_from_rest = MethodBind.get("BoneTwistDisperser3D", "set_twist_from_rest", 300928843L)
    Ptrcall.callVoid2(gdext.classes.BoneTwistDisperser3D.mb_set_twist_from_rest, livePtr, index, enabled)
  }

  /** BoneTwistDisperser3D.is_twist_from_rest */
  final def isTwistFromRest(index: Long): Boolean = {
    if (gdext.classes.BoneTwistDisperser3D.mb_is_twist_from_rest == null) gdext.classes.BoneTwistDisperser3D.mb_is_twist_from_rest = MethodBind.get("BoneTwistDisperser3D", "is_twist_from_rest", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.BoneTwistDisperser3D.mb_is_twist_from_rest, livePtr, index)
  }

  /** BoneTwistDisperser3D.set_twist_from */
  final def setTwistFrom(index: Long, from: gdext.builtin.Quaternion): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_twist_from == null) gdext.classes.BoneTwistDisperser3D.mb_set_twist_from = MethodBind.get("BoneTwistDisperser3D", "set_twist_from", 2823819782L)
    Ptrcall.callVoid2(gdext.classes.BoneTwistDisperser3D.mb_set_twist_from, livePtr, index, from)
  }

  /** BoneTwistDisperser3D.get_twist_from */
  final def getTwistFrom(index: Long): gdext.builtin.Quaternion = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_twist_from == null) gdext.classes.BoneTwistDisperser3D.mb_get_twist_from = MethodBind.get("BoneTwistDisperser3D", "get_twist_from", 476865136L)
    Ptrcall.call1[Long, gdext.builtin.Quaternion](gdext.classes.BoneTwistDisperser3D.mb_get_twist_from, livePtr, index)
  }

  /** BoneTwistDisperser3D.set_disperse_mode */
  final def setDisperseMode(index: Long, disperse_mode: Long): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_disperse_mode == null) gdext.classes.BoneTwistDisperser3D.mb_set_disperse_mode = MethodBind.get("BoneTwistDisperser3D", "set_disperse_mode", 2954194337L)
    Ptrcall.callVoid2(gdext.classes.BoneTwistDisperser3D.mb_set_disperse_mode, livePtr, index, disperse_mode)
  }

  /** BoneTwistDisperser3D.get_disperse_mode */
  final def getDisperseMode(index: Long): Long = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_disperse_mode == null) gdext.classes.BoneTwistDisperser3D.mb_get_disperse_mode = MethodBind.get("BoneTwistDisperser3D", "get_disperse_mode", 1326397005L)
    Ptrcall.call1[Long, Long](gdext.classes.BoneTwistDisperser3D.mb_get_disperse_mode, livePtr, index)
  }

  /** BoneTwistDisperser3D.set_weight_position */
  final def setWeightPosition(index: Long, weight_position: Double): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_weight_position == null) gdext.classes.BoneTwistDisperser3D.mb_set_weight_position = MethodBind.get("BoneTwistDisperser3D", "set_weight_position", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.BoneTwistDisperser3D.mb_set_weight_position, livePtr, index, weight_position)
  }

  /** BoneTwistDisperser3D.get_weight_position */
  final def getWeightPosition(index: Long): Double = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_weight_position == null) gdext.classes.BoneTwistDisperser3D.mb_get_weight_position = MethodBind.get("BoneTwistDisperser3D", "get_weight_position", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.BoneTwistDisperser3D.mb_get_weight_position, livePtr, index)
  }

  /** BoneTwistDisperser3D.set_damping_curve */
  final def setDampingCurve(index: Long, curve: Curve): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_damping_curve == null) gdext.classes.BoneTwistDisperser3D.mb_set_damping_curve = MethodBind.get("BoneTwistDisperser3D", "set_damping_curve", 1447180063L)
    Ptrcall.callVoid2(gdext.classes.BoneTwistDisperser3D.mb_set_damping_curve, livePtr, index, Wrappers.handle(curve))
  }

  /** BoneTwistDisperser3D.get_damping_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDampingCurve(index: Long): Curve = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_damping_curve == null) gdext.classes.BoneTwistDisperser3D.mb_get_damping_curve = MethodBind.get("BoneTwistDisperser3D", "get_damping_curve", 747537754L)
    Wrappers.owned[Curve](Ptrcall.call1[Long, Long](gdext.classes.BoneTwistDisperser3D.mb_get_damping_curve, livePtr, index))
  }

  /** BoneTwistDisperser3D.get_joint_bone_name */
  final def getJointBoneName(index: Long, joint: Long): String = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_joint_bone_name == null) gdext.classes.BoneTwistDisperser3D.mb_get_joint_bone_name = MethodBind.get("BoneTwistDisperser3D", "get_joint_bone_name", 1391810591L)
    Ptrcall.call2[Long, Long, String](gdext.classes.BoneTwistDisperser3D.mb_get_joint_bone_name, livePtr, index, joint)
  }

  /** BoneTwistDisperser3D.get_joint_bone */
  final def getJointBone(index: Long, joint: Long): Long = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_joint_bone == null) gdext.classes.BoneTwistDisperser3D.mb_get_joint_bone = MethodBind.get("BoneTwistDisperser3D", "get_joint_bone", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.BoneTwistDisperser3D.mb_get_joint_bone, livePtr, index, joint)
  }

  /** BoneTwistDisperser3D.get_joint_twist_amount */
  final def getJointTwistAmount(index: Long, joint: Long): Double = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_joint_twist_amount == null) gdext.classes.BoneTwistDisperser3D.mb_get_joint_twist_amount = MethodBind.get("BoneTwistDisperser3D", "get_joint_twist_amount", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.BoneTwistDisperser3D.mb_get_joint_twist_amount, livePtr, index, joint)
  }

  /** BoneTwistDisperser3D.set_joint_twist_amount */
  final def setJointTwistAmount(index: Long, joint: Long, twist_amount: Double): Unit = {
    if (gdext.classes.BoneTwistDisperser3D.mb_set_joint_twist_amount == null) gdext.classes.BoneTwistDisperser3D.mb_set_joint_twist_amount = MethodBind.get("BoneTwistDisperser3D", "set_joint_twist_amount", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.BoneTwistDisperser3D.mb_set_joint_twist_amount, livePtr, index, joint, twist_amount)
  }

  /** BoneTwistDisperser3D.get_joint_count */
  final def getJointCount(index: Long): Long = {
    if (gdext.classes.BoneTwistDisperser3D.mb_get_joint_count == null) gdext.classes.BoneTwistDisperser3D.mb_get_joint_count = MethodBind.get("BoneTwistDisperser3D", "get_joint_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.BoneTwistDisperser3D.mb_get_joint_count, livePtr, index)
  }

}

object BoneTwistDisperser3D {
  private[classes] var mb_set_setting_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_setting_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_settings: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mutable_bone_axes: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_bone_axes_mutable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_root_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reference_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reference_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_extend_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_end_bone_extended: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_twist_from_rest: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_twist_from_rest: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_twist_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_twist_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disperse_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_disperse_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_weight_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_weight_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_damping_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_damping_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_twist_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_twist_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_count: GDExtensionMethodBindPtr = null
}
