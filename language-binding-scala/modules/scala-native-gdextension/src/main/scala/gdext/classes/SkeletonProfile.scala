package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonProfile`, extends `Resource`. */
abstract class SkeletonProfile extends Resource {
  override def godotClassName: String = "SkeletonProfile"

  /** SkeletonProfile.set_root_bone */
  final def setRootBone(boneName: String): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_root_bone == null) gdext.classes.SkeletonProfile.mb_set_root_bone = MethodBind.get("SkeletonProfile", "set_root_bone", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.SkeletonProfile.mb_set_root_bone, livePtr, SnArg(boneName))
  }

  /** SkeletonProfile.get_root_bone */
  final def getRootBone(): String = {
    if (gdext.classes.SkeletonProfile.mb_get_root_bone == null) gdext.classes.SkeletonProfile.mb_get_root_bone = MethodBind.get("SkeletonProfile", "get_root_bone", 2737447660L)
    Ptrcall.call0[SnArg](gdext.classes.SkeletonProfile.mb_get_root_bone, livePtr)
  }

  /** SkeletonProfile.set_scale_base_bone */
  final def setScaleBaseBone(boneName: String): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_scale_base_bone == null) gdext.classes.SkeletonProfile.mb_set_scale_base_bone = MethodBind.get("SkeletonProfile", "set_scale_base_bone", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.SkeletonProfile.mb_set_scale_base_bone, livePtr, SnArg(boneName))
  }

  /** SkeletonProfile.get_scale_base_bone */
  final def getScaleBaseBone(): String = {
    if (gdext.classes.SkeletonProfile.mb_get_scale_base_bone == null) gdext.classes.SkeletonProfile.mb_get_scale_base_bone = MethodBind.get("SkeletonProfile", "get_scale_base_bone", 2737447660L)
    Ptrcall.call0[SnArg](gdext.classes.SkeletonProfile.mb_get_scale_base_bone, livePtr)
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
  final def getGroupName(groupIdx: Long): String = {
    if (gdext.classes.SkeletonProfile.mb_get_group_name == null) gdext.classes.SkeletonProfile.mb_get_group_name = MethodBind.get("SkeletonProfile", "get_group_name", 659327637L)
    Ptrcall.call1[Long, SnArg](gdext.classes.SkeletonProfile.mb_get_group_name, livePtr, groupIdx)
  }

  /** SkeletonProfile.set_group_name */
  final def setGroupName(groupIdx: Long, groupName: String): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_group_name == null) gdext.classes.SkeletonProfile.mb_set_group_name = MethodBind.get("SkeletonProfile", "set_group_name", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_group_name, livePtr, groupIdx, SnArg(groupName))
  }

  /** SkeletonProfile.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(groupIdx: Long): Texture2D = {
    if (gdext.classes.SkeletonProfile.mb_get_texture == null) gdext.classes.SkeletonProfile.mb_get_texture = MethodBind.get("SkeletonProfile", "get_texture", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.SkeletonProfile.mb_get_texture, livePtr, groupIdx))
  }

  /** SkeletonProfile.set_texture */
  final def setTexture(groupIdx: Long, texture: Texture2D): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_texture == null) gdext.classes.SkeletonProfile.mb_set_texture = MethodBind.get("SkeletonProfile", "set_texture", 666127730L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_texture, livePtr, groupIdx, Wrappers.handle(texture))
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
  final def findBone(boneName: String): Long = {
    if (gdext.classes.SkeletonProfile.mb_find_bone == null) gdext.classes.SkeletonProfile.mb_find_bone = MethodBind.get("SkeletonProfile", "find_bone", 2458036349L)
    Ptrcall.call1[SnArg, Long](gdext.classes.SkeletonProfile.mb_find_bone, livePtr, SnArg(boneName))
  }

  /** SkeletonProfile.get_bone_name */
  final def getBoneName(boneIdx: Long): String = {
    if (gdext.classes.SkeletonProfile.mb_get_bone_name == null) gdext.classes.SkeletonProfile.mb_get_bone_name = MethodBind.get("SkeletonProfile", "get_bone_name", 659327637L)
    Ptrcall.call1[Long, SnArg](gdext.classes.SkeletonProfile.mb_get_bone_name, livePtr, boneIdx)
  }

  /** SkeletonProfile.set_bone_name */
  final def setBoneName(boneIdx: Long, boneName: String): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_bone_name == null) gdext.classes.SkeletonProfile.mb_set_bone_name = MethodBind.get("SkeletonProfile", "set_bone_name", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_bone_name, livePtr, boneIdx, SnArg(boneName))
  }

  /** SkeletonProfile.get_bone_parent */
  final def getBoneParent(boneIdx: Long): String = {
    if (gdext.classes.SkeletonProfile.mb_get_bone_parent == null) gdext.classes.SkeletonProfile.mb_get_bone_parent = MethodBind.get("SkeletonProfile", "get_bone_parent", 659327637L)
    Ptrcall.call1[Long, SnArg](gdext.classes.SkeletonProfile.mb_get_bone_parent, livePtr, boneIdx)
  }

  /** SkeletonProfile.set_bone_parent */
  final def setBoneParent(boneIdx: Long, boneParent: String): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_bone_parent == null) gdext.classes.SkeletonProfile.mb_set_bone_parent = MethodBind.get("SkeletonProfile", "set_bone_parent", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_bone_parent, livePtr, boneIdx, SnArg(boneParent))
  }

  /** SkeletonProfile.get_tail_direction */
  final def getTailDirection(boneIdx: Long): gdext.classes.SkeletonProfile.TailDirection = {
    if (gdext.classes.SkeletonProfile.mb_get_tail_direction == null) gdext.classes.SkeletonProfile.mb_get_tail_direction = MethodBind.get("SkeletonProfile", "get_tail_direction", 2675997574L)
    gdext.classes.SkeletonProfile.TailDirection(Ptrcall.call1[Long, Long](gdext.classes.SkeletonProfile.mb_get_tail_direction, livePtr, boneIdx))
  }

  /** SkeletonProfile.set_tail_direction */
  final def setTailDirection(boneIdx: Long, tailDirection: gdext.classes.SkeletonProfile.TailDirection): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_tail_direction == null) gdext.classes.SkeletonProfile.mb_set_tail_direction = MethodBind.get("SkeletonProfile", "set_tail_direction", 1231951015L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_tail_direction, livePtr, boneIdx, tailDirection)
  }

  /** SkeletonProfile.get_bone_tail */
  final def getBoneTail(boneIdx: Long): String = {
    if (gdext.classes.SkeletonProfile.mb_get_bone_tail == null) gdext.classes.SkeletonProfile.mb_get_bone_tail = MethodBind.get("SkeletonProfile", "get_bone_tail", 659327637L)
    Ptrcall.call1[Long, SnArg](gdext.classes.SkeletonProfile.mb_get_bone_tail, livePtr, boneIdx)
  }

  /** SkeletonProfile.set_bone_tail */
  final def setBoneTail(boneIdx: Long, boneTail: String): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_bone_tail == null) gdext.classes.SkeletonProfile.mb_set_bone_tail = MethodBind.get("SkeletonProfile", "set_bone_tail", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_bone_tail, livePtr, boneIdx, SnArg(boneTail))
  }

  /** SkeletonProfile.get_reference_pose */
  final def getReferencePose(boneIdx: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.SkeletonProfile.mb_get_reference_pose == null) gdext.classes.SkeletonProfile.mb_get_reference_pose = MethodBind.get("SkeletonProfile", "get_reference_pose", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.SkeletonProfile.mb_get_reference_pose, livePtr, boneIdx)
  }

  /** SkeletonProfile.set_reference_pose */
  final def setReferencePose(boneIdx: Long, boneName: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_reference_pose == null) gdext.classes.SkeletonProfile.mb_set_reference_pose = MethodBind.get("SkeletonProfile", "set_reference_pose", 3616898986L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_reference_pose, livePtr, boneIdx, boneName)
  }

  /** SkeletonProfile.get_handle_offset */
  final def getHandleOffset(boneIdx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.SkeletonProfile.mb_get_handle_offset == null) gdext.classes.SkeletonProfile.mb_get_handle_offset = MethodBind.get("SkeletonProfile", "get_handle_offset", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.SkeletonProfile.mb_get_handle_offset, livePtr, boneIdx)
  }

  /** SkeletonProfile.set_handle_offset */
  final def setHandleOffset(boneIdx: Long, handleOffset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_handle_offset == null) gdext.classes.SkeletonProfile.mb_set_handle_offset = MethodBind.get("SkeletonProfile", "set_handle_offset", 163021252L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_handle_offset, livePtr, boneIdx, handleOffset)
  }

  /** SkeletonProfile.get_group */
  final def getGroup(boneIdx: Long): String = {
    if (gdext.classes.SkeletonProfile.mb_get_group == null) gdext.classes.SkeletonProfile.mb_get_group = MethodBind.get("SkeletonProfile", "get_group", 659327637L)
    Ptrcall.call1[Long, SnArg](gdext.classes.SkeletonProfile.mb_get_group, livePtr, boneIdx)
  }

  /** SkeletonProfile.set_group */
  final def setGroup(boneIdx: Long, group: String): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_group == null) gdext.classes.SkeletonProfile.mb_set_group = MethodBind.get("SkeletonProfile", "set_group", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_group, livePtr, boneIdx, SnArg(group))
  }

  /** SkeletonProfile.is_required */
  final def isRequired(boneIdx: Long): Boolean = {
    if (gdext.classes.SkeletonProfile.mb_is_required == null) gdext.classes.SkeletonProfile.mb_is_required = MethodBind.get("SkeletonProfile", "is_required", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SkeletonProfile.mb_is_required, livePtr, boneIdx)
  }

  /** SkeletonProfile.set_required */
  final def setRequired(boneIdx: Long, required: Boolean): Unit = {
    if (gdext.classes.SkeletonProfile.mb_set_required == null) gdext.classes.SkeletonProfile.mb_set_required = MethodBind.get("SkeletonProfile", "set_required", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SkeletonProfile.mb_set_required, livePtr, boneIdx, required)
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

  /** Godot enum `SkeletonProfile.TailDirection`. */
  opaque type TailDirection <: Long = Long

  object TailDirection {
    final val AverageChildren: TailDirection = 0L.asInstanceOf[TailDirection]
    final val SpecificChild: TailDirection = 1L.asInstanceOf[TailDirection]
    final val End: TailDirection = 2L.asInstanceOf[TailDirection]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TailDirection = value.asInstanceOf[TailDirection]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TailDirection] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[TailDirection]]

    extension (self: TailDirection)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "AverageChildren"
        case 1L => "SpecificChild"
        case 2L => "End"
        case other => other.toString
      }
  }
}
