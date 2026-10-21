package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonProfile`, extends `Resource`. */
abstract class SkeletonProfile extends Resource {
  override def godotClassName: String = "SkeletonProfile"

  /** SkeletonProfile.set_root_bone */
  final def setRootBone(bone_name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_root_bone == null) gdext.classes.SkeletonProfile.mb_set_root_bone = MethodBind.get("SkeletonProfile", "set_root_bone", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.SkeletonProfile.mb_set_root_bone, livePtr, bone_name)
  }

  /** SkeletonProfile.get_root_bone */
  final def getRootBone(): gdext.builtin.StringName = {
    if (gdext.classes.SkeletonProfile.mb_get_root_bone == null) gdext.classes.SkeletonProfile.mb_get_root_bone = MethodBind.get("SkeletonProfile", "get_root_bone", 2737447660L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.SkeletonProfile.mb_get_root_bone, livePtr)
  }

  /** SkeletonProfile.set_scale_base_bone */
  final def setScaleBaseBone(bone_name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_scale_base_bone == null) gdext.classes.SkeletonProfile.mb_set_scale_base_bone = MethodBind.get("SkeletonProfile", "set_scale_base_bone", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.SkeletonProfile.mb_set_scale_base_bone, livePtr, bone_name)
  }

  /** SkeletonProfile.get_scale_base_bone */
  final def getScaleBaseBone(): gdext.builtin.StringName = {
    if (gdext.classes.SkeletonProfile.mb_get_scale_base_bone == null) gdext.classes.SkeletonProfile.mb_get_scale_base_bone = MethodBind.get("SkeletonProfile", "get_scale_base_bone", 2737447660L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.SkeletonProfile.mb_get_scale_base_bone, livePtr)
  }

  /** SkeletonProfile.set_group_size */
  final def setGroupSize(size: Long): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_group_size == null) gdext.classes.SkeletonProfile.mb_set_group_size = MethodBind.get("SkeletonProfile", "set_group_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonProfile.mb_set_group_size, livePtr, size)
  }

  /** SkeletonProfile.get_group_size */
  final def getGroupSize(): Long = {
    if (gdext.classes.SkeletonProfile.mb_get_group_size == null) gdext.classes.SkeletonProfile.mb_get_group_size = MethodBind.get("SkeletonProfile", "get_group_size", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.SkeletonProfile.mb_get_group_size, livePtr)
  }

  /** SkeletonProfile.get_group_name */
  final def getGroupName(group_idx: Long): gdext.builtin.StringName = {
    if (gdext.classes.SkeletonProfile.mb_get_group_name == null) gdext.classes.SkeletonProfile.mb_get_group_name = MethodBind.get("SkeletonProfile", "get_group_name", 659327637L)
    Ptrcall.call1[Long, gdext.builtin.StringName](gdext.classes.SkeletonProfile.mb_get_group_name, livePtr, group_idx)
  }

  /** SkeletonProfile.set_group_name */
  final def setGroupName(group_idx: Long, group_name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_group_name == null) gdext.classes.SkeletonProfile.mb_set_group_name = MethodBind.get("SkeletonProfile", "set_group_name", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_group_name, livePtr, group_idx, group_name)
  }

  /** SkeletonProfile.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(group_idx: Long): Texture2D = {
    if (gdext.classes.SkeletonProfile.mb_get_texture == null) gdext.classes.SkeletonProfile.mb_get_texture = MethodBind.get("SkeletonProfile", "get_texture", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.SkeletonProfile.mb_get_texture, livePtr, group_idx))
  }

  /** SkeletonProfile.set_texture */
  final def setTexture(group_idx: Long, texture: Texture2D): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_texture == null) gdext.classes.SkeletonProfile.mb_set_texture = MethodBind.get("SkeletonProfile", "set_texture", 666127730L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_texture, livePtr, group_idx, Wrappers.handle(texture))
  }

  /** SkeletonProfile.set_bone_size */
  final def setBoneSize(size: Long): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_bone_size == null) gdext.classes.SkeletonProfile.mb_set_bone_size = MethodBind.get("SkeletonProfile", "set_bone_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonProfile.mb_set_bone_size, livePtr, size)
  }

  /** SkeletonProfile.get_bone_size */
  final def getBoneSize(): Long = {
    if (gdext.classes.SkeletonProfile.mb_get_bone_size == null) gdext.classes.SkeletonProfile.mb_get_bone_size = MethodBind.get("SkeletonProfile", "get_bone_size", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.SkeletonProfile.mb_get_bone_size, livePtr)
  }

  /** SkeletonProfile.find_bone */
  final def findBone(bone_name: gdext.builtin.StringName): Long = {
    if (gdext.classes.SkeletonProfile.mb_find_bone == null) gdext.classes.SkeletonProfile.mb_find_bone = MethodBind.get("SkeletonProfile", "find_bone", 2458036349L)
    Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.SkeletonProfile.mb_find_bone, livePtr, bone_name)
  }

  /** SkeletonProfile.get_bone_name */
  final def getBoneName(bone_idx: Long): gdext.builtin.StringName = {
    if (gdext.classes.SkeletonProfile.mb_get_bone_name == null) gdext.classes.SkeletonProfile.mb_get_bone_name = MethodBind.get("SkeletonProfile", "get_bone_name", 659327637L)
    Ptrcall.call1[Long, gdext.builtin.StringName](gdext.classes.SkeletonProfile.mb_get_bone_name, livePtr, bone_idx)
  }

  /** SkeletonProfile.set_bone_name */
  final def setBoneName(bone_idx: Long, bone_name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_bone_name == null) gdext.classes.SkeletonProfile.mb_set_bone_name = MethodBind.get("SkeletonProfile", "set_bone_name", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_bone_name, livePtr, bone_idx, bone_name)
  }

  /** SkeletonProfile.get_bone_parent */
  final def getBoneParent(bone_idx: Long): gdext.builtin.StringName = {
    if (gdext.classes.SkeletonProfile.mb_get_bone_parent == null) gdext.classes.SkeletonProfile.mb_get_bone_parent = MethodBind.get("SkeletonProfile", "get_bone_parent", 659327637L)
    Ptrcall.call1[Long, gdext.builtin.StringName](gdext.classes.SkeletonProfile.mb_get_bone_parent, livePtr, bone_idx)
  }

  /** SkeletonProfile.set_bone_parent */
  final def setBoneParent(bone_idx: Long, bone_parent: gdext.builtin.StringName): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_bone_parent == null) gdext.classes.SkeletonProfile.mb_set_bone_parent = MethodBind.get("SkeletonProfile", "set_bone_parent", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_bone_parent, livePtr, bone_idx, bone_parent)
  }

  /** SkeletonProfile.get_tail_direction */
  final def getTailDirection(bone_idx: Long): Long = {
    if (gdext.classes.SkeletonProfile.mb_get_tail_direction == null) gdext.classes.SkeletonProfile.mb_get_tail_direction = MethodBind.get("SkeletonProfile", "get_tail_direction", 2675997574L)
    Ptrcall.call1[Long, Long](gdext.classes.SkeletonProfile.mb_get_tail_direction, livePtr, bone_idx)
  }

  /** SkeletonProfile.set_tail_direction */
  final def setTailDirection(bone_idx: Long, tail_direction: Long): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_tail_direction == null) gdext.classes.SkeletonProfile.mb_set_tail_direction = MethodBind.get("SkeletonProfile", "set_tail_direction", 1231951015L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_tail_direction, livePtr, bone_idx, tail_direction)
  }

  /** SkeletonProfile.get_bone_tail */
  final def getBoneTail(bone_idx: Long): gdext.builtin.StringName = {
    if (gdext.classes.SkeletonProfile.mb_get_bone_tail == null) gdext.classes.SkeletonProfile.mb_get_bone_tail = MethodBind.get("SkeletonProfile", "get_bone_tail", 659327637L)
    Ptrcall.call1[Long, gdext.builtin.StringName](gdext.classes.SkeletonProfile.mb_get_bone_tail, livePtr, bone_idx)
  }

  /** SkeletonProfile.set_bone_tail */
  final def setBoneTail(bone_idx: Long, bone_tail: gdext.builtin.StringName): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_bone_tail == null) gdext.classes.SkeletonProfile.mb_set_bone_tail = MethodBind.get("SkeletonProfile", "set_bone_tail", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_bone_tail, livePtr, bone_idx, bone_tail)
  }

  /** SkeletonProfile.get_reference_pose */
  final def getReferencePose(bone_idx: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.SkeletonProfile.mb_get_reference_pose == null) gdext.classes.SkeletonProfile.mb_get_reference_pose = MethodBind.get("SkeletonProfile", "get_reference_pose", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.SkeletonProfile.mb_get_reference_pose, livePtr, bone_idx)
  }

  /** SkeletonProfile.set_reference_pose */
  final def setReferencePose(bone_idx: Long, bone_name: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_reference_pose == null) gdext.classes.SkeletonProfile.mb_set_reference_pose = MethodBind.get("SkeletonProfile", "set_reference_pose", 3616898986L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_reference_pose, livePtr, bone_idx, bone_name)
  }

  /** SkeletonProfile.get_handle_offset */
  final def getHandleOffset(bone_idx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.SkeletonProfile.mb_get_handle_offset == null) gdext.classes.SkeletonProfile.mb_get_handle_offset = MethodBind.get("SkeletonProfile", "get_handle_offset", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.SkeletonProfile.mb_get_handle_offset, livePtr, bone_idx)
  }

  /** SkeletonProfile.set_handle_offset */
  final def setHandleOffset(bone_idx: Long, handle_offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_handle_offset == null) gdext.classes.SkeletonProfile.mb_set_handle_offset = MethodBind.get("SkeletonProfile", "set_handle_offset", 163021252L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_handle_offset, livePtr, bone_idx, handle_offset)
  }

  /** SkeletonProfile.get_group */
  final def getGroup(bone_idx: Long): gdext.builtin.StringName = {
    if (gdext.classes.SkeletonProfile.mb_get_group == null) gdext.classes.SkeletonProfile.mb_get_group = MethodBind.get("SkeletonProfile", "get_group", 659327637L)
    Ptrcall.call1[Long, gdext.builtin.StringName](gdext.classes.SkeletonProfile.mb_get_group, livePtr, bone_idx)
  }

  /** SkeletonProfile.set_group */
  final def setGroup(bone_idx: Long, group: gdext.builtin.StringName): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_group == null) gdext.classes.SkeletonProfile.mb_set_group = MethodBind.get("SkeletonProfile", "set_group", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_group, livePtr, bone_idx, group)
  }

  /** SkeletonProfile.is_required */
  final def isRequired(bone_idx: Long): Boolean = {
    if (gdext.classes.SkeletonProfile.mb_is_required == null) gdext.classes.SkeletonProfile.mb_is_required = MethodBind.get("SkeletonProfile", "is_required", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SkeletonProfile.mb_is_required, livePtr, bone_idx)
  }

  /** SkeletonProfile.set_required */
  final def setRequired(bone_idx: Long, required: Boolean): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_required == null) gdext.classes.SkeletonProfile.mb_set_required = MethodBind.get("SkeletonProfile", "set_required", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_required, livePtr, bone_idx, required)
  }

}

object SkeletonProfile {
  private[classes] var mb_set_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scale_base_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scale_base_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_group_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_group_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_group_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_group_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_parent: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_parent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tail_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tail_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_tail: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_tail: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reference_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reference_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_handle_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_handle_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_required: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_required: GDExtensionMethodBindPtr = null
}
