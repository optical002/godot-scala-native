package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonProfile`, extends `Resource`. */
abstract class SkeletonProfile extends Resource {

  /** SkeletonProfile.set_root_bone */
  final def setRootBone(bone_name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonProfile", "set_root_bone", 3304788590L), hostObject.objectPtr, bone_name)

  /** SkeletonProfile.get_root_bone */
  final def getRootBone(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("SkeletonProfile", "get_root_bone", 2737447660L), hostObject.objectPtr)

  /** SkeletonProfile.set_scale_base_bone */
  final def setScaleBaseBone(bone_name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonProfile", "set_scale_base_bone", 3304788590L), hostObject.objectPtr, bone_name)

  /** SkeletonProfile.get_scale_base_bone */
  final def getScaleBaseBone(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("SkeletonProfile", "get_scale_base_bone", 2737447660L), hostObject.objectPtr)

  /** SkeletonProfile.set_group_size */
  final def setGroupSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonProfile", "set_group_size", 1286410249L), hostObject.objectPtr, size)

  /** SkeletonProfile.get_group_size */
  final def getGroupSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("SkeletonProfile", "get_group_size", 2455072627L), hostObject.objectPtr)

  /** SkeletonProfile.get_group_name */
  final def getGroupName(group_idx: Long): gdext.builtin.StringName =
    Ptrcall.call1[Long, gdext.builtin.StringName](MethodBind.get("SkeletonProfile", "get_group_name", 659327637L), hostObject.objectPtr, group_idx)

  /** SkeletonProfile.set_group_name */
  final def setGroupName(group_idx: Long, group_name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonProfile", "set_group_name", 3780747571L), hostObject.objectPtr, group_idx, group_name)

  /** SkeletonProfile.get_texture */
  final def getTexture(group_idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("SkeletonProfile", "get_texture", 3536238170L), hostObject.objectPtr, group_idx)

  /** SkeletonProfile.set_texture */
  final def setTexture(group_idx: Long, texture: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonProfile", "set_texture", 666127730L), hostObject.objectPtr, group_idx, texture.hostObject)

  /** SkeletonProfile.set_bone_size */
  final def setBoneSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonProfile", "set_bone_size", 1286410249L), hostObject.objectPtr, size)

  /** SkeletonProfile.get_bone_size */
  final def getBoneSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("SkeletonProfile", "get_bone_size", 2455072627L), hostObject.objectPtr)

  /** SkeletonProfile.find_bone */
  final def findBone(bone_name: gdext.builtin.StringName): Long =
    Ptrcall.call1[gdext.builtin.StringName, Long](MethodBind.get("SkeletonProfile", "find_bone", 2458036349L), hostObject.objectPtr, bone_name)

  /** SkeletonProfile.get_bone_name */
  final def getBoneName(bone_idx: Long): gdext.builtin.StringName =
    Ptrcall.call1[Long, gdext.builtin.StringName](MethodBind.get("SkeletonProfile", "get_bone_name", 659327637L), hostObject.objectPtr, bone_idx)

  /** SkeletonProfile.set_bone_name */
  final def setBoneName(bone_idx: Long, bone_name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonProfile", "set_bone_name", 3780747571L), hostObject.objectPtr, bone_idx, bone_name)

  /** SkeletonProfile.get_bone_parent */
  final def getBoneParent(bone_idx: Long): gdext.builtin.StringName =
    Ptrcall.call1[Long, gdext.builtin.StringName](MethodBind.get("SkeletonProfile", "get_bone_parent", 659327637L), hostObject.objectPtr, bone_idx)

  /** SkeletonProfile.set_bone_parent */
  final def setBoneParent(bone_idx: Long, bone_parent: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonProfile", "set_bone_parent", 3780747571L), hostObject.objectPtr, bone_idx, bone_parent)

  /** SkeletonProfile.get_tail_direction */
  final def getTailDirection(bone_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SkeletonProfile", "get_tail_direction", 2675997574L), hostObject.objectPtr, bone_idx)

  /** SkeletonProfile.set_tail_direction */
  final def setTailDirection(bone_idx: Long, tail_direction: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonProfile", "set_tail_direction", 1231951015L), hostObject.objectPtr, bone_idx, tail_direction)

  /** SkeletonProfile.get_bone_tail */
  final def getBoneTail(bone_idx: Long): gdext.builtin.StringName =
    Ptrcall.call1[Long, gdext.builtin.StringName](MethodBind.get("SkeletonProfile", "get_bone_tail", 659327637L), hostObject.objectPtr, bone_idx)

  /** SkeletonProfile.set_bone_tail */
  final def setBoneTail(bone_idx: Long, bone_tail: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonProfile", "set_bone_tail", 3780747571L), hostObject.objectPtr, bone_idx, bone_tail)

  /** SkeletonProfile.get_reference_pose */
  final def getReferencePose(bone_idx: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("SkeletonProfile", "get_reference_pose", 1965739696L), hostObject.objectPtr, bone_idx)

  /** SkeletonProfile.set_reference_pose */
  final def setReferencePose(bone_idx: Long, bone_name: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonProfile", "set_reference_pose", 3616898986L), hostObject.objectPtr, bone_idx, bone_name)

  /** SkeletonProfile.get_handle_offset */
  final def getHandleOffset(bone_idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("SkeletonProfile", "get_handle_offset", 2299179447L), hostObject.objectPtr, bone_idx)

  /** SkeletonProfile.set_handle_offset */
  final def setHandleOffset(bone_idx: Long, handle_offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonProfile", "set_handle_offset", 163021252L), hostObject.objectPtr, bone_idx, handle_offset)

  /** SkeletonProfile.get_group */
  final def getGroup(bone_idx: Long): gdext.builtin.StringName =
    Ptrcall.call1[Long, gdext.builtin.StringName](MethodBind.get("SkeletonProfile", "get_group", 659327637L), hostObject.objectPtr, bone_idx)

  /** SkeletonProfile.set_group */
  final def setGroup(bone_idx: Long, group: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonProfile", "set_group", 3780747571L), hostObject.objectPtr, bone_idx, group)

  /** SkeletonProfile.is_required */
  final def isRequired(bone_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SkeletonProfile", "is_required", 1116898809L), hostObject.objectPtr, bone_idx)

  /** SkeletonProfile.set_required */
  final def setRequired(bone_idx: Long, required: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonProfile", "set_required", 300928843L), hostObject.objectPtr, bone_idx, required)

}

object SkeletonProfile {
  /** Class metadata for Gd[SkeletonProfile] lifetime management and casting. */
  given GodotClass[SkeletonProfile] with {
    def className = "SkeletonProfile"
    def isRefCounted = true
    def wrap(o: GodotObject): SkeletonProfile = new SkeletonProfile {}.withHost(o.objectPtr)
    def unwrap(t: SkeletonProfile): GodotObject = t.hostObject
  }
}
