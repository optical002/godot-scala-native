package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationNodeBlendTree`, extends `AnimationRootNode`. */
abstract class AnimationNodeBlendTree extends AnimationRootNode {
  override def godotClassName: String = "AnimationNodeBlendTree"

  /** AnimationNodeBlendTree.add_node */
  final def addNode(name: String, node: AnimationNode, position: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): Unit = {
    if (gdext.classes.AnimationNodeBlendTree.mb_add_node == null) gdext.classes.AnimationNodeBlendTree.mb_add_node = MethodBind.get("AnimationNodeBlendTree", "add_node", 1980270704L)
    Ptrcall.callVoid3(gdext.classes.AnimationNodeBlendTree.mb_add_node, livePtr, SnArg(name), Wrappers.handle(node), position)
  }

  /** AnimationNodeBlendTree.get_node. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNode(name: String): AnimationNode = {
    if (gdext.classes.AnimationNodeBlendTree.mb_get_node == null) gdext.classes.AnimationNodeBlendTree.mb_get_node = MethodBind.get("AnimationNodeBlendTree", "get_node", 625644256L)
    Wrappers.owned[AnimationNode](Ptrcall.call1[SnArg, Long](gdext.classes.AnimationNodeBlendTree.mb_get_node, livePtr, SnArg(name)))
  }

  /** AnimationNodeBlendTree.remove_node */
  final def removeNode(name: String): Unit = {
    if (gdext.classes.AnimationNodeBlendTree.mb_remove_node == null) gdext.classes.AnimationNodeBlendTree.mb_remove_node = MethodBind.get("AnimationNodeBlendTree", "remove_node", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendTree.mb_remove_node, livePtr, SnArg(name))
  }

  /** AnimationNodeBlendTree.rename_node */
  final def renameNode(name: String, newName: String): Unit = {
    if (gdext.classes.AnimationNodeBlendTree.mb_rename_node == null) gdext.classes.AnimationNodeBlendTree.mb_rename_node = MethodBind.get("AnimationNodeBlendTree", "rename_node", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeBlendTree.mb_rename_node, livePtr, SnArg(name), SnArg(newName))
  }

  /** AnimationNodeBlendTree.has_node */
  final def hasNode(name: String): Boolean = {
    if (gdext.classes.AnimationNodeBlendTree.mb_has_node == null) gdext.classes.AnimationNodeBlendTree.mb_has_node = MethodBind.get("AnimationNodeBlendTree", "has_node", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.AnimationNodeBlendTree.mb_has_node, livePtr, SnArg(name))
  }

  /** AnimationNodeBlendTree.connect_node */
  final def connectNode(inputNode: String, inputIndex: Long, outputNode: String): Unit = {
    if (gdext.classes.AnimationNodeBlendTree.mb_connect_node == null) gdext.classes.AnimationNodeBlendTree.mb_connect_node = MethodBind.get("AnimationNodeBlendTree", "connect_node", 2168001410L)
    Ptrcall.callVoid3(gdext.classes.AnimationNodeBlendTree.mb_connect_node, livePtr, SnArg(inputNode), inputIndex, SnArg(outputNode))
  }

  /** AnimationNodeBlendTree.disconnect_node */
  final def disconnectNode(inputNode: String, inputIndex: Long): Unit = {
    if (gdext.classes.AnimationNodeBlendTree.mb_disconnect_node == null) gdext.classes.AnimationNodeBlendTree.mb_disconnect_node = MethodBind.get("AnimationNodeBlendTree", "disconnect_node", 2415702435L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeBlendTree.mb_disconnect_node, livePtr, SnArg(inputNode), inputIndex)
  }

  /** AnimationNodeBlendTree.set_node_position */
  final def setNodePosition(name: String, position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.AnimationNodeBlendTree.mb_set_node_position == null) gdext.classes.AnimationNodeBlendTree.mb_set_node_position = MethodBind.get("AnimationNodeBlendTree", "set_node_position", 1999414630L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeBlendTree.mb_set_node_position, livePtr, SnArg(name), position)
  }

  /** AnimationNodeBlendTree.get_node_position */
  final def getNodePosition(name: String): gdext.builtin.Vector2 = {
    if (gdext.classes.AnimationNodeBlendTree.mb_get_node_position == null) gdext.classes.AnimationNodeBlendTree.mb_get_node_position = MethodBind.get("AnimationNodeBlendTree", "get_node_position", 3100822709L)
    Ptrcall.call1[SnArg, gdext.builtin.Vector2](gdext.classes.AnimationNodeBlendTree.mb_get_node_position, livePtr, SnArg(name))
  }

  /** AnimationNodeBlendTree.set_graph_offset */
  final def setGraphOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.AnimationNodeBlendTree.mb_set_graph_offset == null) gdext.classes.AnimationNodeBlendTree.mb_set_graph_offset = MethodBind.get("AnimationNodeBlendTree", "set_graph_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendTree.mb_set_graph_offset, livePtr, offset)
  }

  /** AnimationNodeBlendTree.get_graph_offset */
  final def getGraphOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.AnimationNodeBlendTree.mb_get_graph_offset == null) gdext.classes.AnimationNodeBlendTree.mb_get_graph_offset = MethodBind.get("AnimationNodeBlendTree", "get_graph_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.AnimationNodeBlendTree.mb_get_graph_offset, livePtr)
  }

}

object AnimationNodeBlendTree {
  private[classes] var mb_add_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_connect_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_disconnect_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_node_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_graph_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_graph_offset: GDExtensionMethodBindPtr = null
}
