package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Skin`, extends `Resource`. */
abstract class Skin extends Resource {
  override def godotClassName: String = "Skin"

  /** Skin.set_bind_count */
  final def setBindCount(bind_count: Long): Unit = {
    if (gdext.classes.Skin.mb_set_bind_count == null) gdext.classes.Skin.mb_set_bind_count = MethodBind.get("Skin", "set_bind_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Skin.mb_set_bind_count, livePtr, bind_count)
  }

  /** Skin.get_bind_count */
  final def getBindCount(): Long = {
    if (gdext.classes.Skin.mb_get_bind_count == null) gdext.classes.Skin.mb_get_bind_count = MethodBind.get("Skin", "get_bind_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Skin.mb_get_bind_count, livePtr)
  }

  /** Skin.add_bind */
  final def addBind(bone: Long, pose: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.Skin.mb_add_bind == null) gdext.classes.Skin.mb_add_bind = MethodBind.get("Skin", "add_bind", 3616898986L)
    Ptrcall.callVoid2(gdext.classes.Skin.mb_add_bind, livePtr, bone, pose)
  }

  /** Skin.add_named_bind */
  final def addNamedBind(name: String, pose: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.Skin.mb_add_named_bind == null) gdext.classes.Skin.mb_add_named_bind = MethodBind.get("Skin", "add_named_bind", 3154712474L)
    Ptrcall.callVoid2(gdext.classes.Skin.mb_add_named_bind, livePtr, name, pose)
  }

  /** Skin.set_bind_pose */
  final def setBindPose(bind_index: Long, pose: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.Skin.mb_set_bind_pose == null) gdext.classes.Skin.mb_set_bind_pose = MethodBind.get("Skin", "set_bind_pose", 3616898986L)
    Ptrcall.callVoid2(gdext.classes.Skin.mb_set_bind_pose, livePtr, bind_index, pose)
  }

  /** Skin.get_bind_pose */
  final def getBindPose(bind_index: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.Skin.mb_get_bind_pose == null) gdext.classes.Skin.mb_get_bind_pose = MethodBind.get("Skin", "get_bind_pose", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.Skin.mb_get_bind_pose, livePtr, bind_index)
  }

  /** Skin.set_bind_name */
  final def setBindName(bind_index: Long, name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Skin.mb_set_bind_name == null) gdext.classes.Skin.mb_set_bind_name = MethodBind.get("Skin", "set_bind_name", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.Skin.mb_set_bind_name, livePtr, bind_index, name)
  }

  /** Skin.get_bind_name */
  final def getBindName(bind_index: Long): gdext.builtin.StringName = {
    if (gdext.classes.Skin.mb_get_bind_name == null) gdext.classes.Skin.mb_get_bind_name = MethodBind.get("Skin", "get_bind_name", 659327637L)
    Ptrcall.call1[Long, gdext.builtin.StringName](gdext.classes.Skin.mb_get_bind_name, livePtr, bind_index)
  }

  /** Skin.set_bind_bone */
  final def setBindBone(bind_index: Long, bone: Long): Unit = {
    if (gdext.classes.Skin.mb_set_bind_bone == null) gdext.classes.Skin.mb_set_bind_bone = MethodBind.get("Skin", "set_bind_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.Skin.mb_set_bind_bone, livePtr, bind_index, bone)
  }

  /** Skin.get_bind_bone */
  final def getBindBone(bind_index: Long): Long = {
    if (gdext.classes.Skin.mb_get_bind_bone == null) gdext.classes.Skin.mb_get_bind_bone = MethodBind.get("Skin", "get_bind_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.Skin.mb_get_bind_bone, livePtr, bind_index)
  }

  /** Skin.clear_binds */
  final def clearBinds(): Unit = {
    if (gdext.classes.Skin.mb_clear_binds == null) gdext.classes.Skin.mb_clear_binds = MethodBind.get("Skin", "clear_binds", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Skin.mb_clear_binds, livePtr)
  }

}

object Skin {
  private[classes] var mb_set_bind_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bind_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_bind: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_named_bind: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bind_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bind_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bind_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bind_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bind_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bind_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_binds: GDExtensionMethodBindPtr = null
}
