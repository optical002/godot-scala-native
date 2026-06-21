package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `BoneTwistDisperser3D`, extends `SkeletonModifier3D`. */
abstract class BoneTwistDisperser3D extends SkeletonModifier3D {

  /** BoneTwistDisperser3D.set_setting_count */
  final def setSettingCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoneTwistDisperser3D", "set_setting_count", 1286410249L), hostObject.objectPtr, count)

  /** BoneTwistDisperser3D.get_setting_count */
  final def getSettingCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("BoneTwistDisperser3D", "get_setting_count", 3905245786L), hostObject.objectPtr)

  /** BoneTwistDisperser3D.clear_settings */
  final def clearSettings(): Unit =
    Ptrcall.callVoid0(MethodBind.get("BoneTwistDisperser3D", "clear_settings", 3218959716L), hostObject.objectPtr)

  /** BoneTwistDisperser3D.set_mutable_bone_axes */
  final def setMutableBoneAxes(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoneTwistDisperser3D", "set_mutable_bone_axes", 2586408642L), hostObject.objectPtr, enabled)

  /** BoneTwistDisperser3D.are_bone_axes_mutable */
  final def areBoneAxesMutable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BoneTwistDisperser3D", "are_bone_axes_mutable", 36873697L), hostObject.objectPtr)

  /** BoneTwistDisperser3D.set_root_bone_name */
  final def setRootBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneTwistDisperser3D", "set_root_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** BoneTwistDisperser3D.get_root_bone_name */
  final def getRootBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("BoneTwistDisperser3D", "get_root_bone_name", 844755477L), hostObject.objectPtr, index)

  /** BoneTwistDisperser3D.set_root_bone */
  final def setRootBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneTwistDisperser3D", "set_root_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** BoneTwistDisperser3D.get_root_bone */
  final def getRootBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("BoneTwistDisperser3D", "get_root_bone", 923996154L), hostObject.objectPtr, index)

  /** BoneTwistDisperser3D.set_end_bone_name */
  final def setEndBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneTwistDisperser3D", "set_end_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** BoneTwistDisperser3D.get_end_bone_name */
  final def getEndBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("BoneTwistDisperser3D", "get_end_bone_name", 844755477L), hostObject.objectPtr, index)

  /** BoneTwistDisperser3D.set_end_bone */
  final def setEndBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneTwistDisperser3D", "set_end_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** BoneTwistDisperser3D.get_end_bone */
  final def getEndBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("BoneTwistDisperser3D", "get_end_bone", 923996154L), hostObject.objectPtr, index)

  /** BoneTwistDisperser3D.get_reference_bone_name */
  final def getReferenceBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("BoneTwistDisperser3D", "get_reference_bone_name", 844755477L), hostObject.objectPtr, index)

  /** BoneTwistDisperser3D.get_reference_bone */
  final def getReferenceBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("BoneTwistDisperser3D", "get_reference_bone", 923996154L), hostObject.objectPtr, index)

  /** BoneTwistDisperser3D.set_extend_end_bone */
  final def setExtendEndBone(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneTwistDisperser3D", "set_extend_end_bone", 300928843L), hostObject.objectPtr, index, enabled)

  /** BoneTwistDisperser3D.is_end_bone_extended */
  final def isEndBoneExtended(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("BoneTwistDisperser3D", "is_end_bone_extended", 1116898809L), hostObject.objectPtr, index)

  /** BoneTwistDisperser3D.set_end_bone_direction */
  final def setEndBoneDirection(index: Long, bone_direction: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneTwistDisperser3D", "set_end_bone_direction", 2838484201L), hostObject.objectPtr, index, bone_direction)

  /** BoneTwistDisperser3D.get_end_bone_direction */
  final def getEndBoneDirection(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("BoneTwistDisperser3D", "get_end_bone_direction", 1843036459L), hostObject.objectPtr, index)

  /** BoneTwistDisperser3D.set_twist_from_rest */
  final def setTwistFromRest(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneTwistDisperser3D", "set_twist_from_rest", 300928843L), hostObject.objectPtr, index, enabled)

  /** BoneTwistDisperser3D.is_twist_from_rest */
  final def isTwistFromRest(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("BoneTwistDisperser3D", "is_twist_from_rest", 1116898809L), hostObject.objectPtr, index)

  /** BoneTwistDisperser3D.set_twist_from */
  final def setTwistFrom(index: Long, from: gdext.builtin.Quaternion): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneTwistDisperser3D", "set_twist_from", 2823819782L), hostObject.objectPtr, index, from)

  /** BoneTwistDisperser3D.get_twist_from */
  final def getTwistFrom(index: Long): gdext.builtin.Quaternion =
    Ptrcall.call1[Long, gdext.builtin.Quaternion](MethodBind.get("BoneTwistDisperser3D", "get_twist_from", 476865136L), hostObject.objectPtr, index)

  /** BoneTwistDisperser3D.set_disperse_mode */
  final def setDisperseMode(index: Long, disperse_mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneTwistDisperser3D", "set_disperse_mode", 2954194337L), hostObject.objectPtr, index, disperse_mode)

  /** BoneTwistDisperser3D.get_disperse_mode */
  final def getDisperseMode(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("BoneTwistDisperser3D", "get_disperse_mode", 1326397005L), hostObject.objectPtr, index)

  /** BoneTwistDisperser3D.set_weight_position */
  final def setWeightPosition(index: Long, weight_position: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneTwistDisperser3D", "set_weight_position", 1602489585L), hostObject.objectPtr, index, weight_position)

  /** BoneTwistDisperser3D.get_weight_position */
  final def getWeightPosition(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("BoneTwistDisperser3D", "get_weight_position", 2339986948L), hostObject.objectPtr, index)

  /** BoneTwistDisperser3D.set_damping_curve */
  final def setDampingCurve(index: Long, curve: Curve): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneTwistDisperser3D", "set_damping_curve", 1447180063L), hostObject.objectPtr, index, curve.hostObject)

  /** BoneTwistDisperser3D.get_damping_curve */
  final def getDampingCurve(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("BoneTwistDisperser3D", "get_damping_curve", 747537754L), hostObject.objectPtr, index)

  /** BoneTwistDisperser3D.get_joint_bone_name */
  final def getJointBoneName(index: Long, joint: Long): String =
    Ptrcall.call2[Long, Long, String](MethodBind.get("BoneTwistDisperser3D", "get_joint_bone_name", 1391810591L), hostObject.objectPtr, index, joint)

  /** BoneTwistDisperser3D.get_joint_bone */
  final def getJointBone(index: Long, joint: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("BoneTwistDisperser3D", "get_joint_bone", 3175239445L), hostObject.objectPtr, index, joint)

  /** BoneTwistDisperser3D.get_joint_twist_amount */
  final def getJointTwistAmount(index: Long, joint: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("BoneTwistDisperser3D", "get_joint_twist_amount", 3085491603L), hostObject.objectPtr, index, joint)

  /** BoneTwistDisperser3D.set_joint_twist_amount */
  final def setJointTwistAmount(index: Long, joint: Long, twist_amount: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("BoneTwistDisperser3D", "set_joint_twist_amount", 3506521499L), hostObject.objectPtr, index, joint, twist_amount)

  /** BoneTwistDisperser3D.get_joint_count */
  final def getJointCount(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("BoneTwistDisperser3D", "get_joint_count", 923996154L), hostObject.objectPtr, index)

}

object BoneTwistDisperser3D {
  /** Class metadata for Gd[BoneTwistDisperser3D] lifetime management and casting. */
  given GodotClass[BoneTwistDisperser3D] with {
    def className = "BoneTwistDisperser3D"
    def isRefCounted = false
    def wrap(o: GodotObject): BoneTwistDisperser3D = new BoneTwistDisperser3D {}.withHost(o.objectPtr)
    def unwrap(t: BoneTwistDisperser3D): GodotObject = t.hostObject
  }
}
