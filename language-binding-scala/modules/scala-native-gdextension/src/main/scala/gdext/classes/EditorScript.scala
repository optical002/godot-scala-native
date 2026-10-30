package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorScript`, extends `RefCounted`. */
abstract class EditorScript extends RefCounted {
  override def godotClassName: String = "EditorScript"

  /** EditorScript.add_root_node */
  final def addRootNode(node: Node): Unit = {
    if (gdext.classes.EditorScript.mb_add_root_node == null) gdext.classes.EditorScript.mb_add_root_node = MethodBind.get("EditorScript", "add_root_node", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.EditorScript.mb_add_root_node, livePtr, Wrappers.handle(node))
  }

  /** EditorScript.get_scene */
  final def getScene(): Node = {
    if (gdext.classes.EditorScript.mb_get_scene == null) gdext.classes.EditorScript.mb_get_scene = MethodBind.get("EditorScript", "get_scene", 3160264692L)
    Wrappers.borrowed[Node](Ptrcall.call0[Long](gdext.classes.EditorScript.mb_get_scene, livePtr))
  }

  /** EditorScript.get_editor_interface */
  final def getEditorInterface(): EditorInterface = {
    if (gdext.classes.EditorScript.mb_get_editor_interface == null) gdext.classes.EditorScript.mb_get_editor_interface = MethodBind.get("EditorScript", "get_editor_interface", 1976662476L)
    Wrappers.borrowed[EditorInterface](Ptrcall.call0[Long](gdext.classes.EditorScript.mb_get_editor_interface, livePtr))
  }

}

object EditorScript {
  private[classes] var mb_add_root_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scene: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_interface: GDExtensionMethodBindPtr = null
}
