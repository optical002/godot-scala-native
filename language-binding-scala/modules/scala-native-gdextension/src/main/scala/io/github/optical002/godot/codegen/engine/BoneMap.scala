package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `BoneMap`, extends `Resource`. */
abstract class BoneMap extends Resource {

  /** BoneMap.get_profile */
  final def getProfile(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("BoneMap", "get_profile", 4291782652L), hostObject.objectPtr)

  /** BoneMap.set_profile */
  final def setProfile(profile: SkeletonProfile): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoneMap", "set_profile", 3870374136L), hostObject.objectPtr, profile.hostObject)

  /** BoneMap.get_skeleton_bone_name */
  final def getSkeletonBoneName(profile_bone_name: io.github.optical002.godot.builtin.StringName): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName](MethodBind.get("BoneMap", "get_skeleton_bone_name", 1965194235L), hostObject.objectPtr, profile_bone_name)

  /** BoneMap.set_skeleton_bone_name */
  final def setSkeletonBoneName(profile_bone_name: io.github.optical002.godot.builtin.StringName, skeleton_bone_name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("BoneMap", "set_skeleton_bone_name", 3740211285L), hostObject.objectPtr, profile_bone_name, skeleton_bone_name)

  /** BoneMap.find_profile_bone_name */
  final def findProfileBoneName(skeleton_bone_name: io.github.optical002.godot.builtin.StringName): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName](MethodBind.get("BoneMap", "find_profile_bone_name", 1965194235L), hostObject.objectPtr, skeleton_bone_name)

}

object BoneMap {
  /** Class metadata for Gd[BoneMap] lifetime management and casting. */
  given GodotClass[BoneMap] with {
    def className = "BoneMap"
    def isRefCounted = true
    def wrap(o: GodotObject): BoneMap = new BoneMap {}.withHost(o.objectPtr)
    def unwrap(t: BoneMap): GodotObject = t.hostObject
  }
}
