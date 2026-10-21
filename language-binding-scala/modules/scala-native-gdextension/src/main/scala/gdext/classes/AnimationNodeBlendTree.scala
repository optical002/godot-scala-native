package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationNodeBlendTree`, extends `AnimationRootNode`. */
abstract class AnimationNodeBlendTree extends AnimationRootNode {
  override def godotClassName: String = "AnimationNodeBlendTree"

  /** AnimationNodeBlendTree.add_node */
  final def addNode(name: gdext.builtin.StringName, node: AnimationNode, position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.AnimationNodeBlendTree.mb_add_node == null) gdext.classes.AnimationNodeBlendTree.mb_add_node = MethodBind.get("AnimationNodeBlendTree", "add_node", 1980270704L)
    Ptrcall.callVoid3(gdext.classes.AnimationNodeBlendTree.mb_add_node, livePtr, name, Wrappers.handle(node), position)
  }

  /** AnimationNodeBlendTree.get_node. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNode(name: gdext.builtin.StringName): AnimationNode = {
    if (gdext.classes.AnimationNodeBlendTree.mb_get_node == null) gdext.classes.AnimationNodeBlendTree.mb_get_node = MethodBind.get("AnimationNodeBlendTree", "get_node", 625644256L)
    Wrappers.owned[AnimationNode](Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.AnimationNodeBlendTree.mb_get_node, livePtr, name))
  }

  /** AnimationNodeBlendTree.remove_node */
  final def removeNode(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AnimationNodeBlendTree.mb_remove_node == null) gdext.classes.AnimationNodeBlendTree.mb_remove_node = MethodBind.get("AnimationNodeBlendTree", "remove_node", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendTree.mb_remove_node, livePtr, name)
  }

  /** AnimationNodeBlendTree.rename_node */
  final def renameNode(name: gdext.builtin.StringName, new_name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AnimationNodeBlendTree.mb_rename_node == null) gdext.classes.AnimationNodeBlendTree.mb_rename_node = MethodBind.get("AnimationNodeBlendTree", "rename_node", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeBlendTree.mb_rename_node, livePtr, name, new_name)
  }

  /** AnimationNodeBlendTree.has_node */
  final def hasNode(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.AnimationNodeBlendTree.mb_has_node == null) gdext.classes.AnimationNodeBlendTree.mb_has_node = MethodBind.get("AnimationNodeBlendTree", "has_node", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.AnimationNodeBlendTree.mb_has_node, livePtr, name)
  }

  /** AnimationNodeBlendTree.connect_node */
  final def connectNode(input_node: gdext.builtin.StringName, input_index: Long, output_node: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AnimationNodeBlendTree.mb_connect_node == null) gdext.classes.AnimationNodeBlendTree.mb_connect_node = MethodBind.get("AnimationNodeBlendTree", "connect_node", 2168001410L)
    Ptrcall.callVoid3(gdext.classes.AnimationNodeBlendTree.mb_connect_node, livePtr, input_node, input_index, output_node)
  }

  /** AnimationNodeBlendTree.disconnect_node */
  final def disconnectNode(input_node: gdext.builtin.StringName, input_index: Long): Unit = {
    if (gdext.classes.AnimationNodeBlendTree.mb_disconnect_node == null) gdext.classes.AnimationNodeBlendTree.mb_disconnect_node = MethodBind.get("AnimationNodeBlendTree", "disconnect_node", 2415702435L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeBlendTree.mb_disconnect_node, livePtr, input_node, input_index)
  }

  /** AnimationNodeBlendTree.set_node_position */
  final def setNodePosition(name: gdext.builtin.StringName, position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.AnimationNodeBlendTree.mb_set_node_position == null) gdext.classes.AnimationNodeBlendTree.mb_set_node_position = MethodBind.get("AnimationNodeBlendTree", "set_node_position", 1999414630L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeBlendTree.mb_set_node_position, livePtr, name, position)
  }

  /** AnimationNodeBlendTree.get_node_position */
  final def getNodePosition(name: gdext.builtin.StringName): gdext.builtin.Vector2 = {
    if (gdext.classes.AnimationNodeBlendTree.mb_get_node_position == null) gdext.classes.AnimationNodeBlendTree.mb_get_node_position = MethodBind.get("AnimationNodeBlendTree", "get_node_position", 3100822709L)
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.Vector2](gdext.classes.AnimationNodeBlendTree.mb_get_node_position, livePtr, name)
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
