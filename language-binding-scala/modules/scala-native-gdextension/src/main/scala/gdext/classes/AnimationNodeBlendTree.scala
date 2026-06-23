package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeBlendTree`, extends `AnimationRootNode`. */
abstract class AnimationNodeBlendTree extends AnimationRootNode {

  /** AnimationNodeBlendTree.add_node */
  final def addNode(name: gdext.builtin.StringName, node: AnimationNode, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid3(MethodBind.get("AnimationNodeBlendTree", "add_node", 1980270704L), hostObject.objectPtr, name, node.hostObject, position)

  /** AnimationNodeBlendTree.get_node */
  final def getNode(name: gdext.builtin.StringName): GodotObject =
    Ptrcall.call1[gdext.builtin.StringName, GodotObject](MethodBind.get("AnimationNodeBlendTree", "get_node", 625644256L), hostObject.objectPtr, name)

  /** AnimationNodeBlendTree.remove_node */
  final def removeNode(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendTree", "remove_node", 3304788590L), hostObject.objectPtr, name)

  /** AnimationNodeBlendTree.rename_node */
  final def renameNode(name: gdext.builtin.StringName, new_name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeBlendTree", "rename_node", 3740211285L), hostObject.objectPtr, name, new_name)

  /** AnimationNodeBlendTree.has_node */
  final def hasNode(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("AnimationNodeBlendTree", "has_node", 2619796661L), hostObject.objectPtr, name)

  /** AnimationNodeBlendTree.connect_node */
  final def connectNode(input_node: gdext.builtin.StringName, input_index: Long, output_node: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid3(MethodBind.get("AnimationNodeBlendTree", "connect_node", 2168001410L), hostObject.objectPtr, input_node, input_index, output_node)

  /** AnimationNodeBlendTree.disconnect_node */
  final def disconnectNode(input_node: gdext.builtin.StringName, input_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeBlendTree", "disconnect_node", 2415702435L), hostObject.objectPtr, input_node, input_index)

  /** AnimationNodeBlendTree.set_node_position */
  final def setNodePosition(name: gdext.builtin.StringName, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeBlendTree", "set_node_position", 1999414630L), hostObject.objectPtr, name, position)

  /** AnimationNodeBlendTree.get_node_position */
  final def getNodePosition(name: gdext.builtin.StringName): gdext.builtin.Vector2 =
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.Vector2](MethodBind.get("AnimationNodeBlendTree", "get_node_position", 3100822709L), hostObject.objectPtr, name)

  /** AnimationNodeBlendTree.set_graph_offset */
  final def setGraphOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendTree", "set_graph_offset", 743155724L), hostObject.objectPtr, offset)

  /** AnimationNodeBlendTree.get_graph_offset */
  final def getGraphOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("AnimationNodeBlendTree", "get_graph_offset", 3341600327L), hostObject.objectPtr)

}

object AnimationNodeBlendTree {
  /** Class metadata for Gd[AnimationNodeBlendTree] lifetime management and casting. */
  given GodotClass[AnimationNodeBlendTree] with {
    def className = "AnimationNodeBlendTree"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeBlendTree = new AnimationNodeBlendTree {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeBlendTree): GodotObject = t.hostObject
  }
}
