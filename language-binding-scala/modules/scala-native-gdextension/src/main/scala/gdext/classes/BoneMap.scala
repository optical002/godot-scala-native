package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `BoneMap`, extends `Resource`. */
abstract class BoneMap extends Resource {
  override def godotClassName: String = "BoneMap"

  /** BoneMap.get_profile. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getProfile(): SkeletonProfile = {
    if (gdext.classes.BoneMap.mb_get_profile == null) gdext.classes.BoneMap.mb_get_profile = MethodBind.get("BoneMap", "get_profile", 4291782652L)
    Wrappers.owned[SkeletonProfile](Ptrcall.call0[Long](gdext.classes.BoneMap.mb_get_profile, livePtr))
  }

  /** BoneMap.set_profile */
  final def setProfile(profile: SkeletonProfile): Unit = {
    if (gdext.classes.BoneMap.mb_set_profile == null) gdext.classes.BoneMap.mb_set_profile = MethodBind.get("BoneMap", "set_profile", 3870374136L)
    Ptrcall.callVoid1(gdext.classes.BoneMap.mb_set_profile, livePtr, Wrappers.handle(profile))
  }

  /** BoneMap.get_skeleton_bone_name */
  final def getSkeletonBoneName(profile_bone_name: gdext.builtin.StringName): gdext.builtin.StringName = {
    if (gdext.classes.BoneMap.mb_get_skeleton_bone_name == null) gdext.classes.BoneMap.mb_get_skeleton_bone_name = MethodBind.get("BoneMap", "get_skeleton_bone_name", 1965194235L)
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.StringName](gdext.classes.BoneMap.mb_get_skeleton_bone_name, livePtr, profile_bone_name)
  }

  /** BoneMap.set_skeleton_bone_name */
  final def setSkeletonBoneName(profile_bone_name: gdext.builtin.StringName, skeleton_bone_name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.BoneMap.mb_set_skeleton_bone_name == null) gdext.classes.BoneMap.mb_set_skeleton_bone_name = MethodBind.get("BoneMap", "set_skeleton_bone_name", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.BoneMap.mb_set_skeleton_bone_name, livePtr, profile_bone_name, skeleton_bone_name)
  }

  /** BoneMap.find_profile_bone_name */
  final def findProfileBoneName(skeleton_bone_name: gdext.builtin.StringName): gdext.builtin.StringName = {
    if (gdext.classes.BoneMap.mb_find_profile_bone_name == null) gdext.classes.BoneMap.mb_find_profile_bone_name = MethodBind.get("BoneMap", "find_profile_bone_name", 1965194235L)
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.StringName](gdext.classes.BoneMap.mb_find_profile_bone_name, livePtr, skeleton_bone_name)
  }

}

object BoneMap {
  private[classes] var mb_get_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skeleton_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_skeleton_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_profile_bone_name: GDExtensionMethodBindPtr = null
}
