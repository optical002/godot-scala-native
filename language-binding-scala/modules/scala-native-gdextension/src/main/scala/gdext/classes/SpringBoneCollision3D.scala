package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SpringBoneCollision3D`, extends `Node3D`. */
abstract class SpringBoneCollision3D extends Node3D {
  override def godotClassName: String = "SpringBoneCollision3D"

  /** SpringBoneCollision3D.get_skeleton */
  final def getSkeleton(): Skeleton3D = {
    if (gdext.classes.SpringBoneCollision3D.mb_get_skeleton == null) gdext.classes.SpringBoneCollision3D.mb_get_skeleton = MethodBind.get("SpringBoneCollision3D", "get_skeleton", 1488626673L)
    Wrappers.borrowed[Skeleton3D](Ptrcall.call0[Long](gdext.classes.SpringBoneCollision3D.mb_get_skeleton, livePtr))
  }

  /** SpringBoneCollision3D.set_bone_name */
  final def setBoneName(boneName: String): Unit = {
    if (gdext.classes.SpringBoneCollision3D.mb_set_bone_name == null) gdext.classes.SpringBoneCollision3D.mb_set_bone_name = MethodBind.get("SpringBoneCollision3D", "set_bone_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneCollision3D.mb_set_bone_name, livePtr, boneName)
  }

  /** SpringBoneCollision3D.get_bone_name */
  final def getBoneName(): String = {
    if (gdext.classes.SpringBoneCollision3D.mb_get_bone_name == null) gdext.classes.SpringBoneCollision3D.mb_get_bone_name = MethodBind.get("SpringBoneCollision3D", "get_bone_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.SpringBoneCollision3D.mb_get_bone_name, livePtr)
  }

  /** SpringBoneCollision3D.set_bone */
  final def setBone(bone: Long): Unit = {
    if (gdext.classes.SpringBoneCollision3D.mb_set_bone == null) gdext.classes.SpringBoneCollision3D.mb_set_bone = MethodBind.get("SpringBoneCollision3D", "set_bone", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneCollision3D.mb_set_bone, livePtr, bone)
  }

  /** SpringBoneCollision3D.get_bone */
  final def getBone(): Long = {
    if (gdext.classes.SpringBoneCollision3D.mb_get_bone == null) gdext.classes.SpringBoneCollision3D.mb_get_bone = MethodBind.get("SpringBoneCollision3D", "get_bone", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SpringBoneCollision3D.mb_get_bone, livePtr)
  }

  /** SpringBoneCollision3D.set_position_offset */
  final def setPositionOffset(offset: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.SpringBoneCollision3D.mb_set_position_offset == null) gdext.classes.SpringBoneCollision3D.mb_set_position_offset = MethodBind.get("SpringBoneCollision3D", "set_position_offset", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneCollision3D.mb_set_position_offset, livePtr, offset)
  }

  /** SpringBoneCollision3D.get_position_offset */
  final def getPositionOffset(): gdext.builtin.Vector3 = {
    if (gdext.classes.SpringBoneCollision3D.mb_get_position_offset == null) gdext.classes.SpringBoneCollision3D.mb_get_position_offset = MethodBind.get("SpringBoneCollision3D", "get_position_offset", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.SpringBoneCollision3D.mb_get_position_offset, livePtr)
  }

  /** SpringBoneCollision3D.set_rotation_offset */
  final def setRotationOffset(offset: gdext.builtin.Quaternion): Unit = {
    if (gdext.classes.SpringBoneCollision3D.mb_set_rotation_offset == null) gdext.classes.SpringBoneCollision3D.mb_set_rotation_offset = MethodBind.get("SpringBoneCollision3D", "set_rotation_offset", 1727505552L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneCollision3D.mb_set_rotation_offset, livePtr, offset)
  }

  /** SpringBoneCollision3D.get_rotation_offset */
  final def getRotationOffset(): gdext.builtin.Quaternion = {
    if (gdext.classes.SpringBoneCollision3D.mb_get_rotation_offset == null) gdext.classes.SpringBoneCollision3D.mb_get_rotation_offset = MethodBind.get("SpringBoneCollision3D", "get_rotation_offset", 1222331677L)
    Ptrcall.call0[gdext.builtin.Quaternion](gdext.classes.SpringBoneCollision3D.mb_get_rotation_offset, livePtr)
  }

}

object SpringBoneCollision3D {
  private[classes] var mb_get_skeleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation_offset: GDExtensionMethodBindPtr = null
}
