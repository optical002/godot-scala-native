package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorSelection`, extends `Object`. */
abstract class EditorSelection extends Object {
  override def godotClassName: String = "EditorSelection"

  /** EditorSelection.clear */
  final def clear(): Unit = {
    if (gdext.classes.EditorSelection.mb_clear == null) gdext.classes.EditorSelection.mb_clear = MethodBind.get("EditorSelection", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorSelection.mb_clear, livePtr)
  }

  /** EditorSelection.add_node */
  final def addNode(node: Node): Unit = {
    if (gdext.classes.EditorSelection.mb_add_node == null) gdext.classes.EditorSelection.mb_add_node = MethodBind.get("EditorSelection", "add_node", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.EditorSelection.mb_add_node, livePtr, Wrappers.handle(node))
  }

  /** EditorSelection.remove_node */
  final def removeNode(node: Node): Unit = {
    if (gdext.classes.EditorSelection.mb_remove_node == null) gdext.classes.EditorSelection.mb_remove_node = MethodBind.get("EditorSelection", "remove_node", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.EditorSelection.mb_remove_node, livePtr, Wrappers.handle(node))
  }

}

object EditorSelection {
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_node: GDExtensionMethodBindPtr = null
}
