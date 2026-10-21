package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRHand`, extends `Node3D`. */
abstract class OpenXRHand extends Node3D {
  override def godotClassName: String = "OpenXRHand"

  /** OpenXRHand.set_hand */
  final def setHand(hand: Long): Unit = {
    if (gdext.classes.OpenXRHand.mb_set_hand == null) gdext.classes.OpenXRHand.mb_set_hand = MethodBind.get("OpenXRHand", "set_hand", 1849328560L)
    Ptrcall.callVoid1(gdext.classes.OpenXRHand.mb_set_hand, livePtr, hand)
  }

  /** OpenXRHand.get_hand */
  final def getHand(): Long = {
    if (gdext.classes.OpenXRHand.mb_get_hand == null) gdext.classes.OpenXRHand.mb_get_hand = MethodBind.get("OpenXRHand", "get_hand", 2850644561L)
    Ptrcall.call0[Long](gdext.classes.OpenXRHand.mb_get_hand, livePtr)
  }

  /** OpenXRHand.set_motion_range */
  final def setMotionRange(motion_range: Long): Unit = {
    if (gdext.classes.OpenXRHand.mb_set_motion_range == null) gdext.classes.OpenXRHand.mb_set_motion_range = MethodBind.get("OpenXRHand", "set_motion_range", 3326516003L)
    Ptrcall.callVoid1(gdext.classes.OpenXRHand.mb_set_motion_range, livePtr, motion_range)
  }

  /** OpenXRHand.get_motion_range */
  final def getMotionRange(): Long = {
    if (gdext.classes.OpenXRHand.mb_get_motion_range == null) gdext.classes.OpenXRHand.mb_get_motion_range = MethodBind.get("OpenXRHand", "get_motion_range", 2191822314L)
    Ptrcall.call0[Long](gdext.classes.OpenXRHand.mb_get_motion_range, livePtr)
  }

  /** OpenXRHand.set_skeleton_rig */
  final def setSkeletonRig(skeleton_rig: Long): Unit = {
    if (gdext.classes.OpenXRHand.mb_set_skeleton_rig == null) gdext.classes.OpenXRHand.mb_set_skeleton_rig = MethodBind.get("OpenXRHand", "set_skeleton_rig", 1528072213L)
    Ptrcall.callVoid1(gdext.classes.OpenXRHand.mb_set_skeleton_rig, livePtr, skeleton_rig)
  }

  /** OpenXRHand.get_skeleton_rig */
  final def getSkeletonRig(): Long = {
    if (gdext.classes.OpenXRHand.mb_get_skeleton_rig == null) gdext.classes.OpenXRHand.mb_get_skeleton_rig = MethodBind.get("OpenXRHand", "get_skeleton_rig", 968409338L)
    Ptrcall.call0[Long](gdext.classes.OpenXRHand.mb_get_skeleton_rig, livePtr)
  }

  /** OpenXRHand.set_bone_update */
  final def setBoneUpdate(bone_update: Long): Unit = {
    if (gdext.classes.OpenXRHand.mb_set_bone_update == null) gdext.classes.OpenXRHand.mb_set_bone_update = MethodBind.get("OpenXRHand", "set_bone_update", 3144625444L)
    Ptrcall.callVoid1(gdext.classes.OpenXRHand.mb_set_bone_update, livePtr, bone_update)
  }

  /** OpenXRHand.get_bone_update */
  final def getBoneUpdate(): Long = {
    if (gdext.classes.OpenXRHand.mb_get_bone_update == null) gdext.classes.OpenXRHand.mb_get_bone_update = MethodBind.get("OpenXRHand", "get_bone_update", 1310695248L)
    Ptrcall.call0[Long](gdext.classes.OpenXRHand.mb_get_bone_update, livePtr)
  }

}

object OpenXRHand {
  private[classes] var mb_set_hand: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_motion_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_motion_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_skeleton_rig: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skeleton_rig: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_update: GDExtensionMethodBindPtr = null
}
