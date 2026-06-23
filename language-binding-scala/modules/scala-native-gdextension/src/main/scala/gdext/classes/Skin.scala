package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Skin`, extends `Resource`. */
abstract class Skin extends Resource {

  /** Skin.set_bind_count */
  final def setBindCount(bind_count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Skin", "set_bind_count", 1286410249L), hostObject.objectPtr, bind_count)

  /** Skin.get_bind_count */
  final def getBindCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Skin", "get_bind_count", 3905245786L), hostObject.objectPtr)

  /** Skin.add_bind */
  final def addBind(bone: Long, pose: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skin", "add_bind", 3616898986L), hostObject.objectPtr, bone, pose)

  /** Skin.add_named_bind */
  final def addNamedBind(name: String, pose: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skin", "add_named_bind", 3154712474L), hostObject.objectPtr, name, pose)

  /** Skin.set_bind_pose */
  final def setBindPose(bind_index: Long, pose: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skin", "set_bind_pose", 3616898986L), hostObject.objectPtr, bind_index, pose)

  /** Skin.get_bind_pose */
  final def getBindPose(bind_index: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("Skin", "get_bind_pose", 1965739696L), hostObject.objectPtr, bind_index)

  /** Skin.set_bind_name */
  final def setBindName(bind_index: Long, name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skin", "set_bind_name", 3780747571L), hostObject.objectPtr, bind_index, name)

  /** Skin.get_bind_name */
  final def getBindName(bind_index: Long): gdext.builtin.StringName =
    Ptrcall.call1[Long, gdext.builtin.StringName](MethodBind.get("Skin", "get_bind_name", 659327637L), hostObject.objectPtr, bind_index)

  /** Skin.set_bind_bone */
  final def setBindBone(bind_index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Skin", "set_bind_bone", 3937882851L), hostObject.objectPtr, bind_index, bone)

  /** Skin.get_bind_bone */
  final def getBindBone(bind_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Skin", "get_bind_bone", 923996154L), hostObject.objectPtr, bind_index)

  /** Skin.clear_binds */
  final def clearBinds(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Skin", "clear_binds", 3218959716L), hostObject.objectPtr)

}

object Skin {
  /** Class metadata for Gd[Skin] lifetime management and casting. */
  given GodotClass[Skin] with {
    def className = "Skin"
    def isRefCounted = true
    def wrap(o: GodotObject): Skin = new Skin {}.withHost(o.objectPtr)
    def unwrap(t: Skin): GodotObject = t.hostObject
  }
}
