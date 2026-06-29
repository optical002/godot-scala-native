package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorSelection`, extends `Object`. */
abstract class EditorSelection extends Object {
  override def godotClassName: String = "EditorSelection"

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
