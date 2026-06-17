package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorScript`, extends `RefCounted`. */
abstract class EditorScript extends RefCounted {

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

object EditorScript {
  /** Class metadata for Gd[EditorScript] lifetime management and casting. */
  given GodotClass[EditorScript] with {
    def className = "EditorScript"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorScript = new EditorScript {}.withHost(o.objectPtr)
    def unwrap(t: EditorScript): GodotObject = t.hostObject
  }
}
