package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ModifierBoneTarget3D`, extends `SkeletonModifier3D`. */
abstract class ModifierBoneTarget3D extends SkeletonModifier3D {

  /** ModifierBoneTarget3D.set_bone_name */
  final def setBoneName(bone_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("ModifierBoneTarget3D", "set_bone_name", 83702148L), hostObject.objectPtr, bone_name)

  /** ModifierBoneTarget3D.get_bone_name */
  final def getBoneName(): String =
    Ptrcall.call0[String](MethodBind.get("ModifierBoneTarget3D", "get_bone_name", 201670096L), hostObject.objectPtr)

  /** ModifierBoneTarget3D.set_bone */
  final def setBone(bone: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ModifierBoneTarget3D", "set_bone", 1286410249L), hostObject.objectPtr, bone)

  /** ModifierBoneTarget3D.get_bone */
  final def getBone(): Long =
    Ptrcall.call0[Long](MethodBind.get("ModifierBoneTarget3D", "get_bone", 3905245786L), hostObject.objectPtr)

}

object ModifierBoneTarget3D {
  /** Class metadata for Gd[ModifierBoneTarget3D] lifetime management and casting. */
  given GodotClass[ModifierBoneTarget3D] with {
    def className = "ModifierBoneTarget3D"
    def isRefCounted = false
    def wrap(o: GodotObject): ModifierBoneTarget3D = new ModifierBoneTarget3D {}.withHost(o.objectPtr)
    def unwrap(t: ModifierBoneTarget3D): GodotObject = t.hostObject
  }
}
