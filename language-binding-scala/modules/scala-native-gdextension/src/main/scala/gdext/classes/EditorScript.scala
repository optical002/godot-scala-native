package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorScript`, extends `RefCounted`. */
abstract class EditorScript extends RefCounted {
  override def godotClassName: String = "EditorScript"

  /** EditorScript.add_root_node */
  final def addRootNode(node: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorScript", "add_root_node", 1078189570L), hostObject.objectPtr, node.hostObject)

  /** EditorScript.get_scene */
  final def getScene(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorScript", "get_scene", 3160264692L), hostObject.objectPtr)

  /** EditorScript.get_editor_interface */
  final def getEditorInterface(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorScript", "get_editor_interface", 1976662476L), hostObject.objectPtr)

}
