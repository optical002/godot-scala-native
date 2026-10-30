package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Skeleton2D`, extends `Node2D`. */
abstract class Skeleton2D extends Node2D {
  override def godotClassName: String = "Skeleton2D"

  /** Skeleton2D.get_bone_count */
  final def getBoneCount(): Long = {
    if (gdext.classes.Skeleton2D.mb_get_bone_count == null) gdext.classes.Skeleton2D.mb_get_bone_count = MethodBind.get("Skeleton2D", "get_bone_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Skeleton2D.mb_get_bone_count, livePtr)
  }

  /** Skeleton2D.get_bone */
  final def getBone(idx: Long): Bone2D = {
    if (gdext.classes.Skeleton2D.mb_get_bone == null) gdext.classes.Skeleton2D.mb_get_bone = MethodBind.get("Skeleton2D", "get_bone", 2556267111L)
    Wrappers.borrowed[Bone2D](Ptrcall.call1[Long, Long](gdext.classes.Skeleton2D.mb_get_bone, livePtr, idx))
  }

  /** Skeleton2D.set_modification_stack */
  final def setModificationStack(modificationStack: SkeletonModificationStack2D): Unit = {
    if (gdext.classes.Skeleton2D.mb_set_modification_stack == null) gdext.classes.Skeleton2D.mb_set_modification_stack = MethodBind.get("Skeleton2D", "set_modification_stack", 3907307132L)
    Ptrcall.callVoid1(gdext.classes.Skeleton2D.mb_set_modification_stack, livePtr, Wrappers.handle(modificationStack))
  }

  /** Skeleton2D.get_modification_stack. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getModificationStack(): SkeletonModificationStack2D = {
    if (gdext.classes.Skeleton2D.mb_get_modification_stack == null) gdext.classes.Skeleton2D.mb_get_modification_stack = MethodBind.get("Skeleton2D", "get_modification_stack", 2107508396L)
    Wrappers.owned[SkeletonModificationStack2D](Ptrcall.call0[Long](gdext.classes.Skeleton2D.mb_get_modification_stack, livePtr))
  }

  /** Skeleton2D.execute_modifications */
  final def executeModifications(delta: Double, executionMode: Long): Unit = {
    if (gdext.classes.Skeleton2D.mb_execute_modifications == null) gdext.classes.Skeleton2D.mb_execute_modifications = MethodBind.get("Skeleton2D", "execute_modifications", 1005356550L)
    Ptrcall.callVoid2(gdext.classes.Skeleton2D.mb_execute_modifications, livePtr, delta, executionMode)
  }

  /** Skeleton2D.set_bone_local_pose_override */
  final def setBoneLocalPoseOverride(boneIdx: Long, overridePose: gdext.builtin.Transform2D, strength: Double, persistent: Boolean): Unit = {
    if (gdext.classes.Skeleton2D.mb_set_bone_local_pose_override == null) gdext.classes.Skeleton2D.mb_set_bone_local_pose_override = MethodBind.get("Skeleton2D", "set_bone_local_pose_override", 555457532L)
    Ptrcall.callVoid4(gdext.classes.Skeleton2D.mb_set_bone_local_pose_override, livePtr, boneIdx, overridePose, strength, persistent)
  }

  /** Skeleton2D.get_bone_local_pose_override */
  final def getBoneLocalPoseOverride(boneIdx: Long): gdext.builtin.Transform2D = {
    if (gdext.classes.Skeleton2D.mb_get_bone_local_pose_override == null) gdext.classes.Skeleton2D.mb_get_bone_local_pose_override = MethodBind.get("Skeleton2D", "get_bone_local_pose_override", 2995540667L)
    Ptrcall.call1[Long, gdext.builtin.Transform2D](gdext.classes.Skeleton2D.mb_get_bone_local_pose_override, livePtr, boneIdx)
  }

}

object Skeleton2D {
  private[classes] var mb_get_bone_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_modification_stack: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_modification_stack: GDExtensionMethodBindPtr = null
  private[classes] var mb_execute_modifications: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_local_pose_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_local_pose_override: GDExtensionMethodBindPtr = null
}
