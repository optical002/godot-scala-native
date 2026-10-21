package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ModifierBoneTarget3D`, extends `SkeletonModifier3D`. */
abstract class ModifierBoneTarget3D extends SkeletonModifier3D {
  override def godotClassName: String = "ModifierBoneTarget3D"

  /** ModifierBoneTarget3D.set_bone_name */
  final def setBoneName(bone_name: String): Unit = {
    if (gdext.classes.ModifierBoneTarget3D.mb_set_bone_name == null) gdext.classes.ModifierBoneTarget3D.mb_set_bone_name = MethodBind.get("ModifierBoneTarget3D", "set_bone_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.ModifierBoneTarget3D.mb_set_bone_name, livePtr, bone_name)
  }

  /** ModifierBoneTarget3D.get_bone_name */
  final def getBoneName(): String = {
    if (gdext.classes.ModifierBoneTarget3D.mb_get_bone_name == null) gdext.classes.ModifierBoneTarget3D.mb_get_bone_name = MethodBind.get("ModifierBoneTarget3D", "get_bone_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.ModifierBoneTarget3D.mb_get_bone_name, livePtr)
  }

  /** ModifierBoneTarget3D.set_bone */
  final def setBone(bone: Long): Unit = {
    if (gdext.classes.ModifierBoneTarget3D.mb_set_bone == null) gdext.classes.ModifierBoneTarget3D.mb_set_bone = MethodBind.get("ModifierBoneTarget3D", "set_bone", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ModifierBoneTarget3D.mb_set_bone, livePtr, bone)
  }

  /** ModifierBoneTarget3D.get_bone */
  final def getBone(): Long = {
    if (gdext.classes.ModifierBoneTarget3D.mb_get_bone == null) gdext.classes.ModifierBoneTarget3D.mb_get_bone = MethodBind.get("ModifierBoneTarget3D", "get_bone", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ModifierBoneTarget3D.mb_get_bone, livePtr)
  }

}

object ModifierBoneTarget3D {
  private[classes] var mb_set_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone: GDExtensionMethodBindPtr = null
}
