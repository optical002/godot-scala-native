package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SpringBoneCollision3D`, extends `Node3D`. */
abstract class SpringBoneCollision3D extends Node3D {

  /** SpringBoneCollision3D.get_skeleton */
  final def getSkeleton(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SpringBoneCollision3D", "get_skeleton", 1488626673L), hostObject.objectPtr)

  /** SpringBoneCollision3D.set_bone_name */
  final def setBoneName(bone_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneCollision3D", "set_bone_name", 83702148L), hostObject.objectPtr, bone_name)

  /** SpringBoneCollision3D.get_bone_name */
  final def getBoneName(): String =
    Ptrcall.call0[String](MethodBind.get("SpringBoneCollision3D", "get_bone_name", 201670096L), hostObject.objectPtr)

  /** SpringBoneCollision3D.set_bone */
  final def setBone(bone: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneCollision3D", "set_bone", 1286410249L), hostObject.objectPtr, bone)

  /** SpringBoneCollision3D.get_bone */
  final def getBone(): Long =
    Ptrcall.call0[Long](MethodBind.get("SpringBoneCollision3D", "get_bone", 3905245786L), hostObject.objectPtr)

  /** SpringBoneCollision3D.set_position_offset */
  final def setPositionOffset(offset: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneCollision3D", "set_position_offset", 3460891852L), hostObject.objectPtr, offset)

  /** SpringBoneCollision3D.get_position_offset */
  final def getPositionOffset(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("SpringBoneCollision3D", "get_position_offset", 3360562783L), hostObject.objectPtr)

  /** SpringBoneCollision3D.set_rotation_offset */
  final def setRotationOffset(offset: gdext.builtin.Quaternion): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneCollision3D", "set_rotation_offset", 1727505552L), hostObject.objectPtr, offset)

  /** SpringBoneCollision3D.get_rotation_offset */
  final def getRotationOffset(): gdext.builtin.Quaternion =
    Ptrcall.call0[gdext.builtin.Quaternion](MethodBind.get("SpringBoneCollision3D", "get_rotation_offset", 1222331677L), hostObject.objectPtr)

}

object SpringBoneCollision3D {
  /** Class metadata for Gd[SpringBoneCollision3D] lifetime management and casting. */
  given GodotClass[SpringBoneCollision3D] with {
    def className = "SpringBoneCollision3D"
    def isRefCounted = false
    def wrap(o: GodotObject): SpringBoneCollision3D = new SpringBoneCollision3D {}.withHost(o.objectPtr)
    def unwrap(t: SpringBoneCollision3D): GodotObject = t.hostObject
  }
}
