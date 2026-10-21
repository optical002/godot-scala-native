package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `BoneAttachment3D`, extends `Node3D`. */
abstract class BoneAttachment3D extends Node3D {
  override def godotClassName: String = "BoneAttachment3D"

  /** BoneAttachment3D.get_skeleton */
  final def getSkeleton(): Skeleton3D = {
    if (gdext.classes.BoneAttachment3D.mb_get_skeleton == null) gdext.classes.BoneAttachment3D.mb_get_skeleton = MethodBind.get("BoneAttachment3D", "get_skeleton", 1814733083L)
    Wrappers.borrowed[Skeleton3D](Ptrcall.call0[Long](gdext.classes.BoneAttachment3D.mb_get_skeleton, livePtr))
  }

  /** BoneAttachment3D.set_bone_name */
  final def setBoneName(bone_name: String): Unit = {
    if (gdext.classes.BoneAttachment3D.mb_set_bone_name == null) gdext.classes.BoneAttachment3D.mb_set_bone_name = MethodBind.get("BoneAttachment3D", "set_bone_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.BoneAttachment3D.mb_set_bone_name, livePtr, bone_name)
  }

  /** BoneAttachment3D.get_bone_name */
  final def getBoneName(): String = {
    if (gdext.classes.BoneAttachment3D.mb_get_bone_name == null) gdext.classes.BoneAttachment3D.mb_get_bone_name = MethodBind.get("BoneAttachment3D", "get_bone_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.BoneAttachment3D.mb_get_bone_name, livePtr)
  }

  /** BoneAttachment3D.set_bone_idx */
  final def setBoneIdx(bone_idx: Long): Unit = {
    if (gdext.classes.BoneAttachment3D.mb_set_bone_idx == null) gdext.classes.BoneAttachment3D.mb_set_bone_idx = MethodBind.get("BoneAttachment3D", "set_bone_idx", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BoneAttachment3D.mb_set_bone_idx, livePtr, bone_idx)
  }

  /** BoneAttachment3D.get_bone_idx */
  final def getBoneIdx(): Long = {
    if (gdext.classes.BoneAttachment3D.mb_get_bone_idx == null) gdext.classes.BoneAttachment3D.mb_get_bone_idx = MethodBind.get("BoneAttachment3D", "get_bone_idx", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BoneAttachment3D.mb_get_bone_idx, livePtr)
  }

  /** BoneAttachment3D.on_skeleton_update */
  final def onSkeletonUpdate(): Unit = {
    if (gdext.classes.BoneAttachment3D.mb_on_skeleton_update == null) gdext.classes.BoneAttachment3D.mb_on_skeleton_update = MethodBind.get("BoneAttachment3D", "on_skeleton_update", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.BoneAttachment3D.mb_on_skeleton_update, livePtr)
  }

  /** BoneAttachment3D.set_override_pose */
  final def setOverridePose(override_pose: Boolean): Unit = {
    if (gdext.classes.BoneAttachment3D.mb_set_override_pose == null) gdext.classes.BoneAttachment3D.mb_set_override_pose = MethodBind.get("BoneAttachment3D", "set_override_pose", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BoneAttachment3D.mb_set_override_pose, livePtr, override_pose)
  }

  /** BoneAttachment3D.get_override_pose */
  final def getOverridePose(): Boolean = {
    if (gdext.classes.BoneAttachment3D.mb_get_override_pose == null) gdext.classes.BoneAttachment3D.mb_get_override_pose = MethodBind.get("BoneAttachment3D", "get_override_pose", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BoneAttachment3D.mb_get_override_pose, livePtr)
  }

  /** BoneAttachment3D.set_use_external_skeleton */
  final def setUseExternalSkeleton(use_external_skeleton: Boolean): Unit = {
    if (gdext.classes.BoneAttachment3D.mb_set_use_external_skeleton == null) gdext.classes.BoneAttachment3D.mb_set_use_external_skeleton = MethodBind.get("BoneAttachment3D", "set_use_external_skeleton", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BoneAttachment3D.mb_set_use_external_skeleton, livePtr, use_external_skeleton)
  }

  /** BoneAttachment3D.get_use_external_skeleton */
  final def getUseExternalSkeleton(): Boolean = {
    if (gdext.classes.BoneAttachment3D.mb_get_use_external_skeleton == null) gdext.classes.BoneAttachment3D.mb_get_use_external_skeleton = MethodBind.get("BoneAttachment3D", "get_use_external_skeleton", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BoneAttachment3D.mb_get_use_external_skeleton, livePtr)
  }

}

object BoneAttachment3D {
  private[classes] var mb_get_skeleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_idx: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_idx: GDExtensionMethodBindPtr = null
  private[classes] var mb_on_skeleton_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_override_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_override_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_external_skeleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_external_skeleton: GDExtensionMethodBindPtr = null
}
