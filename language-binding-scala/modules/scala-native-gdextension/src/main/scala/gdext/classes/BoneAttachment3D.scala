package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `BoneAttachment3D`, extends `Node3D`. */
abstract class BoneAttachment3D extends Node3D {

  /** BoneAttachment3D.get_skeleton */
  final def getSkeleton(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("BoneAttachment3D", "get_skeleton", 1814733083L), hostObject.objectPtr)

  /** BoneAttachment3D.set_bone_name */
  final def setBoneName(bone_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoneAttachment3D", "set_bone_name", 83702148L), hostObject.objectPtr, bone_name)

  /** BoneAttachment3D.get_bone_name */
  final def getBoneName(): String =
    Ptrcall.call0[String](MethodBind.get("BoneAttachment3D", "get_bone_name", 201670096L), hostObject.objectPtr)

  /** BoneAttachment3D.set_bone_idx */
  final def setBoneIdx(bone_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoneAttachment3D", "set_bone_idx", 1286410249L), hostObject.objectPtr, bone_idx)

  /** BoneAttachment3D.get_bone_idx */
  final def getBoneIdx(): Long =
    Ptrcall.call0[Long](MethodBind.get("BoneAttachment3D", "get_bone_idx", 3905245786L), hostObject.objectPtr)

  /** BoneAttachment3D.on_skeleton_update */
  final def onSkeletonUpdate(): Unit =
    Ptrcall.callVoid0(MethodBind.get("BoneAttachment3D", "on_skeleton_update", 3218959716L), hostObject.objectPtr)

  /** BoneAttachment3D.set_override_pose */
  final def setOverridePose(override_pose: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoneAttachment3D", "set_override_pose", 2586408642L), hostObject.objectPtr, override_pose)

  /** BoneAttachment3D.get_override_pose */
  final def getOverridePose(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BoneAttachment3D", "get_override_pose", 36873697L), hostObject.objectPtr)

  /** BoneAttachment3D.set_use_external_skeleton */
  final def setUseExternalSkeleton(use_external_skeleton: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoneAttachment3D", "set_use_external_skeleton", 2586408642L), hostObject.objectPtr, use_external_skeleton)

  /** BoneAttachment3D.get_use_external_skeleton */
  final def getUseExternalSkeleton(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BoneAttachment3D", "get_use_external_skeleton", 36873697L), hostObject.objectPtr)

}

object BoneAttachment3D {
  /** Class metadata for Gd[BoneAttachment3D] lifetime management and casting. */
  given GodotClass[BoneAttachment3D] with {
    def className = "BoneAttachment3D"
    def isRefCounted = false
    def wrap(o: GodotObject): BoneAttachment3D = new BoneAttachment3D {}.withHost(o.objectPtr)
    def unwrap(t: BoneAttachment3D): GodotObject = t.hostObject
  }
}
