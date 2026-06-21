package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Skeleton3D`, extends `Node3D`. */
abstract class Skeleton3D extends Node3D {

  /** Skeleton3D.add_bone */
  final def addBone(name: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("Skeleton3D", "add_bone", 1597066294L), hostObject.objectPtr, name)

  /** Skeleton3D.find_bone */
  final def findBone(name: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("Skeleton3D", "find_bone", 1321353865L), hostObject.objectPtr, name)

  /** Skeleton3D.get_bone_name */
  final def getBoneName(bone_idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("Skeleton3D", "get_bone_name", 844755477L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.set_bone_name */
  final def setBoneName(bone_idx: Long, name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skeleton3D", "set_bone_name", 501894301L), hostObject.objectPtr, bone_idx, name)

  /** Skeleton3D.has_bone_meta */
  final def hasBoneMeta(bone_idx: Long, key: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[Long, gdext.builtin.StringName, Boolean](MethodBind.get("Skeleton3D", "has_bone_meta", 921227809L), hostObject.objectPtr, bone_idx, key)

  /** Skeleton3D.get_concatenated_bone_names */
  final def getConcatenatedBoneNames(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("Skeleton3D", "get_concatenated_bone_names", 2002593661L), hostObject.objectPtr)

  /** Skeleton3D.get_bone_parent */
  final def getBoneParent(bone_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Skeleton3D", "get_bone_parent", 923996154L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.set_bone_parent */
  final def setBoneParent(bone_idx: Long, parent_idx: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skeleton3D", "set_bone_parent", 3937882851L), hostObject.objectPtr, bone_idx, parent_idx)

  /** Skeleton3D.get_bone_count */
  final def getBoneCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Skeleton3D", "get_bone_count", 3905245786L), hostObject.objectPtr)

  /** Skeleton3D.get_version */
  final def getVersion(): Long =
    Ptrcall.call0[Long](MethodBind.get("Skeleton3D", "get_version", 3905245786L), hostObject.objectPtr)

  /** Skeleton3D.unparent_bone_and_rest */
  final def unparentBoneAndRest(bone_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Skeleton3D", "unparent_bone_and_rest", 1286410249L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.get_bone_rest */
  final def getBoneRest(bone_idx: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("Skeleton3D", "get_bone_rest", 1965739696L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.set_bone_rest */
  final def setBoneRest(bone_idx: Long, rest: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skeleton3D", "set_bone_rest", 3616898986L), hostObject.objectPtr, bone_idx, rest)

  /** Skeleton3D.get_bone_global_rest */
  final def getBoneGlobalRest(bone_idx: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("Skeleton3D", "get_bone_global_rest", 1965739696L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.create_skin_from_rest_transforms */
  final def createSkinFromRestTransforms(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Skeleton3D", "create_skin_from_rest_transforms", 1032037385L), hostObject.objectPtr)

  /** Skeleton3D.register_skin */
  final def registerSkin(skin: Skin): GodotObject =
    Ptrcall.call1[GodotObject, GodotObject](MethodBind.get("Skeleton3D", "register_skin", 3405789568L), hostObject.objectPtr, skin.hostObject)

  /** Skeleton3D.localize_rests */
  final def localizeRests(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Skeleton3D", "localize_rests", 3218959716L), hostObject.objectPtr)

  /** Skeleton3D.clear_bones */
  final def clearBones(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Skeleton3D", "clear_bones", 3218959716L), hostObject.objectPtr)

  /** Skeleton3D.get_bone_pose */
  final def getBonePose(bone_idx: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("Skeleton3D", "get_bone_pose", 1965739696L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.set_bone_pose */
  final def setBonePose(bone_idx: Long, pose: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skeleton3D", "set_bone_pose", 3616898986L), hostObject.objectPtr, bone_idx, pose)

  /** Skeleton3D.set_bone_pose_position */
  final def setBonePosePosition(bone_idx: Long, position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skeleton3D", "set_bone_pose_position", 1530502735L), hostObject.objectPtr, bone_idx, position)

  /** Skeleton3D.set_bone_pose_rotation */
  final def setBonePoseRotation(bone_idx: Long, rotation: gdext.builtin.Quaternion): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skeleton3D", "set_bone_pose_rotation", 2823819782L), hostObject.objectPtr, bone_idx, rotation)

  /** Skeleton3D.set_bone_pose_scale */
  final def setBonePoseScale(bone_idx: Long, scale: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skeleton3D", "set_bone_pose_scale", 1530502735L), hostObject.objectPtr, bone_idx, scale)

  /** Skeleton3D.get_bone_pose_position */
  final def getBonePosePosition(bone_idx: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("Skeleton3D", "get_bone_pose_position", 711720468L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.get_bone_pose_rotation */
  final def getBonePoseRotation(bone_idx: Long): gdext.builtin.Quaternion =
    Ptrcall.call1[Long, gdext.builtin.Quaternion](MethodBind.get("Skeleton3D", "get_bone_pose_rotation", 476865136L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.get_bone_pose_scale */
  final def getBonePoseScale(bone_idx: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("Skeleton3D", "get_bone_pose_scale", 711720468L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.reset_bone_pose */
  final def resetBonePose(bone_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Skeleton3D", "reset_bone_pose", 1286410249L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.reset_bone_poses */
  final def resetBonePoses(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Skeleton3D", "reset_bone_poses", 3218959716L), hostObject.objectPtr)

  /** Skeleton3D.is_bone_enabled */
  final def isBoneEnabled(bone_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Skeleton3D", "is_bone_enabled", 1116898809L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.set_bone_enabled */
  final def setBoneEnabled(bone_idx: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skeleton3D", "set_bone_enabled", 972357352L), hostObject.objectPtr, bone_idx, enabled)

  /** Skeleton3D.get_bone_global_pose */
  final def getBoneGlobalPose(bone_idx: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("Skeleton3D", "get_bone_global_pose", 1965739696L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.set_bone_global_pose */
  final def setBoneGlobalPose(bone_idx: Long, pose: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skeleton3D", "set_bone_global_pose", 3616898986L), hostObject.objectPtr, bone_idx, pose)

  /** Skeleton3D.force_update_all_bone_transforms */
  final def forceUpdateAllBoneTransforms(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Skeleton3D", "force_update_all_bone_transforms", 3218959716L), hostObject.objectPtr)

  /** Skeleton3D.force_update_bone_child_transform */
  final def forceUpdateBoneChildTransform(bone_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Skeleton3D", "force_update_bone_child_transform", 1286410249L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.set_motion_scale */
  final def setMotionScale(motion_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Skeleton3D", "set_motion_scale", 373806689L), hostObject.objectPtr, motion_scale)

  /** Skeleton3D.get_motion_scale */
  final def getMotionScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("Skeleton3D", "get_motion_scale", 1740695150L), hostObject.objectPtr)

  /** Skeleton3D.set_show_rest_only */
  final def setShowRestOnly(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Skeleton3D", "set_show_rest_only", 2586408642L), hostObject.objectPtr, enabled)

  /** Skeleton3D.is_show_rest_only */
  final def isShowRestOnly(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Skeleton3D", "is_show_rest_only", 36873697L), hostObject.objectPtr)

  /** Skeleton3D.set_modifier_callback_mode_process */
  final def setModifierCallbackModeProcess(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Skeleton3D", "set_modifier_callback_mode_process", 3916362634L), hostObject.objectPtr, mode)

  /** Skeleton3D.get_modifier_callback_mode_process */
  final def getModifierCallbackModeProcess(): Long =
    Ptrcall.call0[Long](MethodBind.get("Skeleton3D", "get_modifier_callback_mode_process", 997182536L), hostObject.objectPtr)

  /** Skeleton3D.advance */
  final def advance(delta: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Skeleton3D", "advance", 373806689L), hostObject.objectPtr, delta)

  /** Skeleton3D.clear_bones_global_pose_override */
  final def clearBonesGlobalPoseOverride(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Skeleton3D", "clear_bones_global_pose_override", 3218959716L), hostObject.objectPtr)

  /** Skeleton3D.set_bone_global_pose_override */
  final def setBoneGlobalPoseOverride(bone_idx: Long, pose: gdext.builtin.Transform3D, amount: Double, persistent: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("Skeleton3D", "set_bone_global_pose_override", 3483398371L), hostObject.objectPtr, bone_idx, pose, amount, persistent)

  /** Skeleton3D.get_bone_global_pose_override */
  final def getBoneGlobalPoseOverride(bone_idx: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("Skeleton3D", "get_bone_global_pose_override", 1965739696L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.get_bone_global_pose_no_override */
  final def getBoneGlobalPoseNoOverride(bone_idx: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("Skeleton3D", "get_bone_global_pose_no_override", 1965739696L), hostObject.objectPtr, bone_idx)

  /** Skeleton3D.set_animate_physical_bones */
  final def setAnimatePhysicalBones(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Skeleton3D", "set_animate_physical_bones", 2586408642L), hostObject.objectPtr, enabled)

  /** Skeleton3D.get_animate_physical_bones */
  final def getAnimatePhysicalBones(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Skeleton3D", "get_animate_physical_bones", 36873697L), hostObject.objectPtr)

  /** Skeleton3D.physical_bones_stop_simulation */
  final def physicalBonesStopSimulation(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Skeleton3D", "physical_bones_stop_simulation", 3218959716L), hostObject.objectPtr)

}

object Skeleton3D {
  /** Class metadata for Gd[Skeleton3D] lifetime management and casting. */
  given GodotClass[Skeleton3D] with {
    def className = "Skeleton3D"
    def isRefCounted = false
    def wrap(o: GodotObject): Skeleton3D = new Skeleton3D {}.withHost(o.objectPtr)
    def unwrap(t: Skeleton3D): GodotObject = t.hostObject
  }
}
