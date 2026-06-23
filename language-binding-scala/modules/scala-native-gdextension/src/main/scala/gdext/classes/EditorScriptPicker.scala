package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorScriptPicker`, extends `EditorResourcePicker`. */
abstract class EditorScriptPicker extends EditorResourcePicker {

  /** EditorScriptPicker.set_script_owner */
  final def setScriptOwner(owner_node: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorScriptPicker", "set_script_owner", 1078189570L), hostObject.objectPtr, owner_node.hostObject)

  /** EditorScriptPicker.get_script_owner */
  final def getScriptOwner(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorScriptPicker", "get_script_owner", 3160264692L), hostObject.objectPtr)

}

object EditorScriptPicker {
  /** Class metadata for Gd[EditorScriptPicker] lifetime management and casting. */
  given GodotClass[EditorScriptPicker] with {
    def className = "EditorScriptPicker"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorScriptPicker = new EditorScriptPicker {}.withHost(o.objectPtr)
    def unwrap(t: EditorScriptPicker): GodotObject = t.hostObject
  }
}
