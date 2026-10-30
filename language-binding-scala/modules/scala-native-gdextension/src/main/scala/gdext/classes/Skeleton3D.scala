package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Skeleton3D`, extends `Node3D`. */
abstract class Skeleton3D extends Node3D {
  override def godotClassName: String = "Skeleton3D"

  /** Skeleton3D.add_bone */
  final def addBone(name: String): Long = {
    if (gdext.classes.Skeleton3D.mb_add_bone == null) gdext.classes.Skeleton3D.mb_add_bone = MethodBind.get("Skeleton3D", "add_bone", 1597066294L)
    Ptrcall.call1[String, Long](gdext.classes.Skeleton3D.mb_add_bone, livePtr, name)
  }

  /** Skeleton3D.find_bone */
  final def findBone(name: String): Long = {
    if (gdext.classes.Skeleton3D.mb_find_bone == null) gdext.classes.Skeleton3D.mb_find_bone = MethodBind.get("Skeleton3D", "find_bone", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.Skeleton3D.mb_find_bone, livePtr, name)
  }

  /** Skeleton3D.get_bone_name */
  final def getBoneName(boneIdx: Long): String = {
    if (gdext.classes.Skeleton3D.mb_get_bone_name == null) gdext.classes.Skeleton3D.mb_get_bone_name = MethodBind.get("Skeleton3D", "get_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.Skeleton3D.mb_get_bone_name, livePtr, boneIdx)
  }

  /** Skeleton3D.set_bone_name */
  final def setBoneName(boneIdx: Long, name: String): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_bone_name == null) gdext.classes.Skeleton3D.mb_set_bone_name = MethodBind.get("Skeleton3D", "set_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.Skeleton3D.mb_set_bone_name, livePtr, boneIdx, name)
  }

  /** Skeleton3D.has_bone_meta */
  final def hasBoneMeta(boneIdx: Long, key: String): Boolean = {
    if (gdext.classes.Skeleton3D.mb_has_bone_meta == null) gdext.classes.Skeleton3D.mb_has_bone_meta = MethodBind.get("Skeleton3D", "has_bone_meta", 921227809L)
    Ptrcall.call2[Long, SnArg, Boolean](gdext.classes.Skeleton3D.mb_has_bone_meta, livePtr, boneIdx, SnArg(key))
  }

  /** Skeleton3D.get_concatenated_bone_names */
  final def getConcatenatedBoneNames(): String = {
    if (gdext.classes.Skeleton3D.mb_get_concatenated_bone_names == null) gdext.classes.Skeleton3D.mb_get_concatenated_bone_names = MethodBind.get("Skeleton3D", "get_concatenated_bone_names", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.Skeleton3D.mb_get_concatenated_bone_names, livePtr)
  }

  /** Skeleton3D.get_bone_parent */
  final def getBoneParent(boneIdx: Long): Long = {
    if (gdext.classes.Skeleton3D.mb_get_bone_parent == null) gdext.classes.Skeleton3D.mb_get_bone_parent = MethodBind.get("Skeleton3D", "get_bone_parent", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.Skeleton3D.mb_get_bone_parent, livePtr, boneIdx)
  }

  /** Skeleton3D.set_bone_parent */
  final def setBoneParent(boneIdx: Long, parentIdx: Long): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_bone_parent == null) gdext.classes.Skeleton3D.mb_set_bone_parent = MethodBind.get("Skeleton3D", "set_bone_parent", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.Skeleton3D.mb_set_bone_parent, livePtr, boneIdx, parentIdx)
  }

  /** Skeleton3D.get_bone_count */
  final def getBoneCount(): Long = {
    if (gdext.classes.Skeleton3D.mb_get_bone_count == null) gdext.classes.Skeleton3D.mb_get_bone_count = MethodBind.get("Skeleton3D", "get_bone_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Skeleton3D.mb_get_bone_count, livePtr)
  }

  /** Skeleton3D.get_version */
  final def getVersion(): Long = {
    if (gdext.classes.Skeleton3D.mb_get_version == null) gdext.classes.Skeleton3D.mb_get_version = MethodBind.get("Skeleton3D", "get_version", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Skeleton3D.mb_get_version, livePtr)
  }

  /** Skeleton3D.unparent_bone_and_rest */
  final def unparentBoneAndRest(boneIdx: Long): Unit = {
    if (gdext.classes.Skeleton3D.mb_unparent_bone_and_rest == null) gdext.classes.Skeleton3D.mb_unparent_bone_and_rest = MethodBind.get("Skeleton3D", "unparent_bone_and_rest", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Skeleton3D.mb_unparent_bone_and_rest, livePtr, boneIdx)
  }

  /** Skeleton3D.get_bone_rest */
  final def getBoneRest(boneIdx: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.Skeleton3D.mb_get_bone_rest == null) gdext.classes.Skeleton3D.mb_get_bone_rest = MethodBind.get("Skeleton3D", "get_bone_rest", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.Skeleton3D.mb_get_bone_rest, livePtr, boneIdx)
  }

  /** Skeleton3D.set_bone_rest */
  final def setBoneRest(boneIdx: Long, rest: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_bone_rest == null) gdext.classes.Skeleton3D.mb_set_bone_rest = MethodBind.get("Skeleton3D", "set_bone_rest", 3616898986L)
    Ptrcall.callVoid2(gdext.classes.Skeleton3D.mb_set_bone_rest, livePtr, boneIdx, rest)
  }

  /** Skeleton3D.get_bone_global_rest */
  final def getBoneGlobalRest(boneIdx: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.Skeleton3D.mb_get_bone_global_rest == null) gdext.classes.Skeleton3D.mb_get_bone_global_rest = MethodBind.get("Skeleton3D", "get_bone_global_rest", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.Skeleton3D.mb_get_bone_global_rest, livePtr, boneIdx)
  }

  /** Skeleton3D.create_skin_from_rest_transforms. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createSkinFromRestTransforms(): Skin = {
    if (gdext.classes.Skeleton3D.mb_create_skin_from_rest_transforms == null) gdext.classes.Skeleton3D.mb_create_skin_from_rest_transforms = MethodBind.get("Skeleton3D", "create_skin_from_rest_transforms", 1032037385L)
    Wrappers.owned[Skin](Ptrcall.call0[Long](gdext.classes.Skeleton3D.mb_create_skin_from_rest_transforms, livePtr))
  }

  /** Skeleton3D.register_skin. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def registerSkin(skin: Skin): SkinReference = {
    if (gdext.classes.Skeleton3D.mb_register_skin == null) gdext.classes.Skeleton3D.mb_register_skin = MethodBind.get("Skeleton3D", "register_skin", 3405789568L)
    Wrappers.owned[SkinReference](Ptrcall.call1[GodotObject, Long](gdext.classes.Skeleton3D.mb_register_skin, livePtr, Wrappers.handle(skin)))
  }

  /** Skeleton3D.localize_rests */
  final def localizeRests(): Unit = {
    if (gdext.classes.Skeleton3D.mb_localize_rests == null) gdext.classes.Skeleton3D.mb_localize_rests = MethodBind.get("Skeleton3D", "localize_rests", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Skeleton3D.mb_localize_rests, livePtr)
  }

  /** Skeleton3D.clear_bones */
  final def clearBones(): Unit = {
    if (gdext.classes.Skeleton3D.mb_clear_bones == null) gdext.classes.Skeleton3D.mb_clear_bones = MethodBind.get("Skeleton3D", "clear_bones", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Skeleton3D.mb_clear_bones, livePtr)
  }

  /** Skeleton3D.get_bone_pose */
  final def getBonePose(boneIdx: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.Skeleton3D.mb_get_bone_pose == null) gdext.classes.Skeleton3D.mb_get_bone_pose = MethodBind.get("Skeleton3D", "get_bone_pose", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.Skeleton3D.mb_get_bone_pose, livePtr, boneIdx)
  }

  /** Skeleton3D.set_bone_pose */
  final def setBonePose(boneIdx: Long, pose: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_bone_pose == null) gdext.classes.Skeleton3D.mb_set_bone_pose = MethodBind.get("Skeleton3D", "set_bone_pose", 3616898986L)
    Ptrcall.callVoid2(gdext.classes.Skeleton3D.mb_set_bone_pose, livePtr, boneIdx, pose)
  }

  /** Skeleton3D.set_bone_pose_position */
  final def setBonePosePosition(boneIdx: Long, position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_bone_pose_position == null) gdext.classes.Skeleton3D.mb_set_bone_pose_position = MethodBind.get("Skeleton3D", "set_bone_pose_position", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.Skeleton3D.mb_set_bone_pose_position, livePtr, boneIdx, position)
  }

  /** Skeleton3D.set_bone_pose_rotation */
  final def setBonePoseRotation(boneIdx: Long, rotation: gdext.builtin.Quaternion): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_bone_pose_rotation == null) gdext.classes.Skeleton3D.mb_set_bone_pose_rotation = MethodBind.get("Skeleton3D", "set_bone_pose_rotation", 2823819782L)
    Ptrcall.callVoid2(gdext.classes.Skeleton3D.mb_set_bone_pose_rotation, livePtr, boneIdx, rotation)
  }

  /** Skeleton3D.set_bone_pose_scale */
  final def setBonePoseScale(boneIdx: Long, scale: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_bone_pose_scale == null) gdext.classes.Skeleton3D.mb_set_bone_pose_scale = MethodBind.get("Skeleton3D", "set_bone_pose_scale", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.Skeleton3D.mb_set_bone_pose_scale, livePtr, boneIdx, scale)
  }

  /** Skeleton3D.get_bone_pose_position */
  final def getBonePosePosition(boneIdx: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.Skeleton3D.mb_get_bone_pose_position == null) gdext.classes.Skeleton3D.mb_get_bone_pose_position = MethodBind.get("Skeleton3D", "get_bone_pose_position", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.Skeleton3D.mb_get_bone_pose_position, livePtr, boneIdx)
  }

  /** Skeleton3D.get_bone_pose_rotation */
  final def getBonePoseRotation(boneIdx: Long): gdext.builtin.Quaternion = {
    if (gdext.classes.Skeleton3D.mb_get_bone_pose_rotation == null) gdext.classes.Skeleton3D.mb_get_bone_pose_rotation = MethodBind.get("Skeleton3D", "get_bone_pose_rotation", 476865136L)
    Ptrcall.call1[Long, gdext.builtin.Quaternion](gdext.classes.Skeleton3D.mb_get_bone_pose_rotation, livePtr, boneIdx)
  }

  /** Skeleton3D.get_bone_pose_scale */
  final def getBonePoseScale(boneIdx: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.Skeleton3D.mb_get_bone_pose_scale == null) gdext.classes.Skeleton3D.mb_get_bone_pose_scale = MethodBind.get("Skeleton3D", "get_bone_pose_scale", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.Skeleton3D.mb_get_bone_pose_scale, livePtr, boneIdx)
  }

  /** Skeleton3D.reset_bone_pose */
  final def resetBonePose(boneIdx: Long): Unit = {
    if (gdext.classes.Skeleton3D.mb_reset_bone_pose == null) gdext.classes.Skeleton3D.mb_reset_bone_pose = MethodBind.get("Skeleton3D", "reset_bone_pose", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Skeleton3D.mb_reset_bone_pose, livePtr, boneIdx)
  }

  /** Skeleton3D.reset_bone_poses */
  final def resetBonePoses(): Unit = {
    if (gdext.classes.Skeleton3D.mb_reset_bone_poses == null) gdext.classes.Skeleton3D.mb_reset_bone_poses = MethodBind.get("Skeleton3D", "reset_bone_poses", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Skeleton3D.mb_reset_bone_poses, livePtr)
  }

  /** Skeleton3D.is_bone_enabled */
  final def isBoneEnabled(boneIdx: Long): Boolean = {
    if (gdext.classes.Skeleton3D.mb_is_bone_enabled == null) gdext.classes.Skeleton3D.mb_is_bone_enabled = MethodBind.get("Skeleton3D", "is_bone_enabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Skeleton3D.mb_is_bone_enabled, livePtr, boneIdx)
  }

  /** Skeleton3D.set_bone_enabled */
  final def setBoneEnabled(boneIdx: Long, enabled: Boolean = true): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_bone_enabled == null) gdext.classes.Skeleton3D.mb_set_bone_enabled = MethodBind.get("Skeleton3D", "set_bone_enabled", 972357352L)
    Ptrcall.callVoid2(gdext.classes.Skeleton3D.mb_set_bone_enabled, livePtr, boneIdx, enabled)
  }

  /** Skeleton3D.get_bone_global_pose */
  final def getBoneGlobalPose(boneIdx: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.Skeleton3D.mb_get_bone_global_pose == null) gdext.classes.Skeleton3D.mb_get_bone_global_pose = MethodBind.get("Skeleton3D", "get_bone_global_pose", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.Skeleton3D.mb_get_bone_global_pose, livePtr, boneIdx)
  }

  /** Skeleton3D.set_bone_global_pose */
  final def setBoneGlobalPose(boneIdx: Long, pose: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_bone_global_pose == null) gdext.classes.Skeleton3D.mb_set_bone_global_pose = MethodBind.get("Skeleton3D", "set_bone_global_pose", 3616898986L)
    Ptrcall.callVoid2(gdext.classes.Skeleton3D.mb_set_bone_global_pose, livePtr, boneIdx, pose)
  }

  /** Skeleton3D.force_update_all_bone_transforms */
  final def forceUpdateAllBoneTransforms(): Unit = {
    if (gdext.classes.Skeleton3D.mb_force_update_all_bone_transforms == null) gdext.classes.Skeleton3D.mb_force_update_all_bone_transforms = MethodBind.get("Skeleton3D", "force_update_all_bone_transforms", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Skeleton3D.mb_force_update_all_bone_transforms, livePtr)
  }

  /** Skeleton3D.force_update_bone_child_transform */
  final def forceUpdateBoneChildTransform(boneIdx: Long): Unit = {
    if (gdext.classes.Skeleton3D.mb_force_update_bone_child_transform == null) gdext.classes.Skeleton3D.mb_force_update_bone_child_transform = MethodBind.get("Skeleton3D", "force_update_bone_child_transform", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Skeleton3D.mb_force_update_bone_child_transform, livePtr, boneIdx)
  }

  /** Skeleton3D.set_motion_scale */
  final def setMotionScale(motionScale: Double): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_motion_scale == null) gdext.classes.Skeleton3D.mb_set_motion_scale = MethodBind.get("Skeleton3D", "set_motion_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Skeleton3D.mb_set_motion_scale, livePtr, motionScale)
  }

  /** Skeleton3D.get_motion_scale */
  final def getMotionScale(): Double = {
    if (gdext.classes.Skeleton3D.mb_get_motion_scale == null) gdext.classes.Skeleton3D.mb_get_motion_scale = MethodBind.get("Skeleton3D", "get_motion_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Skeleton3D.mb_get_motion_scale, livePtr)
  }

  /** Skeleton3D.set_show_rest_only */
  final def setShowRestOnly(enabled: Boolean): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_show_rest_only == null) gdext.classes.Skeleton3D.mb_set_show_rest_only = MethodBind.get("Skeleton3D", "set_show_rest_only", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Skeleton3D.mb_set_show_rest_only, livePtr, enabled)
  }

  /** Skeleton3D.is_show_rest_only */
  final def isShowRestOnly(): Boolean = {
    if (gdext.classes.Skeleton3D.mb_is_show_rest_only == null) gdext.classes.Skeleton3D.mb_is_show_rest_only = MethodBind.get("Skeleton3D", "is_show_rest_only", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Skeleton3D.mb_is_show_rest_only, livePtr)
  }

  /** Skeleton3D.set_modifier_callback_mode_process */
  final def setModifierCallbackModeProcess(mode: gdext.classes.Skeleton3D.ModifierCallbackModeProcess): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_modifier_callback_mode_process == null) gdext.classes.Skeleton3D.mb_set_modifier_callback_mode_process = MethodBind.get("Skeleton3D", "set_modifier_callback_mode_process", 3916362634L)
    Ptrcall.callVoid1(gdext.classes.Skeleton3D.mb_set_modifier_callback_mode_process, livePtr, mode)
  }

  /** Skeleton3D.get_modifier_callback_mode_process */
  final def getModifierCallbackModeProcess(): gdext.classes.Skeleton3D.ModifierCallbackModeProcess = {
    if (gdext.classes.Skeleton3D.mb_get_modifier_callback_mode_process == null) gdext.classes.Skeleton3D.mb_get_modifier_callback_mode_process = MethodBind.get("Skeleton3D", "get_modifier_callback_mode_process", 997182536L)
    gdext.classes.Skeleton3D.ModifierCallbackModeProcess(Ptrcall.call0[Long](gdext.classes.Skeleton3D.mb_get_modifier_callback_mode_process, livePtr))
  }

  /** Skeleton3D.advance */
  final def advance(delta: Double): Unit = {
    if (gdext.classes.Skeleton3D.mb_advance == null) gdext.classes.Skeleton3D.mb_advance = MethodBind.get("Skeleton3D", "advance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Skeleton3D.mb_advance, livePtr, delta)
  }

  /** Skeleton3D.clear_bones_global_pose_override */
  final def clearBonesGlobalPoseOverride(): Unit = {
    if (gdext.classes.Skeleton3D.mb_clear_bones_global_pose_override == null) gdext.classes.Skeleton3D.mb_clear_bones_global_pose_override = MethodBind.get("Skeleton3D", "clear_bones_global_pose_override", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Skeleton3D.mb_clear_bones_global_pose_override, livePtr)
  }

  /** Skeleton3D.set_bone_global_pose_override */
  final def setBoneGlobalPoseOverride(boneIdx: Long, pose: gdext.builtin.Transform3D, amount: Double, persistent: Boolean = false): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_bone_global_pose_override == null) gdext.classes.Skeleton3D.mb_set_bone_global_pose_override = MethodBind.get("Skeleton3D", "set_bone_global_pose_override", 3483398371L)
    Ptrcall.callVoid4(gdext.classes.Skeleton3D.mb_set_bone_global_pose_override, livePtr, boneIdx, pose, amount, persistent)
  }

  /** Skeleton3D.get_bone_global_pose_override */
  final def getBoneGlobalPoseOverride(boneIdx: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.Skeleton3D.mb_get_bone_global_pose_override == null) gdext.classes.Skeleton3D.mb_get_bone_global_pose_override = MethodBind.get("Skeleton3D", "get_bone_global_pose_override", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.Skeleton3D.mb_get_bone_global_pose_override, livePtr, boneIdx)
  }

  /** Skeleton3D.get_bone_global_pose_no_override */
  final def getBoneGlobalPoseNoOverride(boneIdx: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.Skeleton3D.mb_get_bone_global_pose_no_override == null) gdext.classes.Skeleton3D.mb_get_bone_global_pose_no_override = MethodBind.get("Skeleton3D", "get_bone_global_pose_no_override", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.Skeleton3D.mb_get_bone_global_pose_no_override, livePtr, boneIdx)
  }

  /** Skeleton3D.set_animate_physical_bones */
  final def setAnimatePhysicalBones(enabled: Boolean): Unit = {
    if (gdext.classes.Skeleton3D.mb_set_animate_physical_bones == null) gdext.classes.Skeleton3D.mb_set_animate_physical_bones = MethodBind.get("Skeleton3D", "set_animate_physical_bones", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Skeleton3D.mb_set_animate_physical_bones, livePtr, enabled)
  }

  /** Skeleton3D.get_animate_physical_bones */
  final def getAnimatePhysicalBones(): Boolean = {
    if (gdext.classes.Skeleton3D.mb_get_animate_physical_bones == null) gdext.classes.Skeleton3D.mb_get_animate_physical_bones = MethodBind.get("Skeleton3D", "get_animate_physical_bones", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Skeleton3D.mb_get_animate_physical_bones, livePtr)
  }

  /** Skeleton3D.physical_bones_stop_simulation */
  final def physicalBonesStopSimulation(): Unit = {
    if (gdext.classes.Skeleton3D.mb_physical_bones_stop_simulation == null) gdext.classes.Skeleton3D.mb_physical_bones_stop_simulation = MethodBind.get("Skeleton3D", "physical_bones_stop_simulation", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Skeleton3D.mb_physical_bones_stop_simulation, livePtr)
  }

}

object Skeleton3D {
  private[classes] var mb_add_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_bone_meta: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_concatenated_bone_names: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_parent: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_parent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_version: GDExtensionMethodBindPtr = null
  private[classes] var mb_unparent_bone_and_rest: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_rest: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_rest: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_global_rest: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_skin_from_rest_transforms: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_skin: GDExtensionMethodBindPtr = null
  private[classes] var mb_localize_rests: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_bones: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_pose_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_pose_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_pose_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_pose_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_pose_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_pose_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset_bone_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset_bone_poses: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_bone_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_global_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_global_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_update_all_bone_transforms: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_update_bone_child_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_motion_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_motion_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_show_rest_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_show_rest_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_modifier_callback_mode_process: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_modifier_callback_mode_process: GDExtensionMethodBindPtr = null
  private[classes] var mb_advance: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_bones_global_pose_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_global_pose_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_global_pose_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_global_pose_no_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_animate_physical_bones: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_animate_physical_bones: GDExtensionMethodBindPtr = null
  private[classes] var mb_physical_bones_stop_simulation: GDExtensionMethodBindPtr = null

  /** Godot enum `Skeleton3D.ModifierCallbackModeProcess`. */
  opaque type ModifierCallbackModeProcess <: Long = Long

  object ModifierCallbackModeProcess {
    final val Physics: ModifierCallbackModeProcess = 0L.asInstanceOf[ModifierCallbackModeProcess]
    final val Idle: ModifierCallbackModeProcess = 1L.asInstanceOf[ModifierCallbackModeProcess]
    final val Manual: ModifierCallbackModeProcess = 2L.asInstanceOf[ModifierCallbackModeProcess]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ModifierCallbackModeProcess = value.asInstanceOf[ModifierCallbackModeProcess]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ModifierCallbackModeProcess] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ModifierCallbackModeProcess]]

    extension (self: ModifierCallbackModeProcess)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Physics"
        case 1L => "Idle"
        case 2L => "Manual"
        case other => other.toString
      }
  }
}
