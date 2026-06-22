package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorSelection`, extends `Object`. */
abstract class EditorSelection extends Object {

  /** EditorSelection.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorSelection", "clear", 3218959716L), hostObject.objectPtr)

  /** EditorSelection.add_node */
  final def addNode(node: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorSelection", "add_node", 1078189570L), hostObject.objectPtr, node.hostObject)

  /** EditorSelection.remove_node */
  final def removeNode(node: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorSelection", "remove_node", 1078189570L), hostObject.objectPtr, node.hostObject)

}

object EditorSelection {
  /** Class metadata for Gd[EditorSelection] lifetime management and casting. */
  given GodotClass[EditorSelection] with {
    def className = "EditorSelection"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorSelection = new EditorSelection {}.withHost(o.objectPtr)
    def unwrap(t: EditorSelection): GodotObject = t.hostObject
  }
}
