package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeBlendTree`, extends `AnimationRootNode`. */
abstract class AnimationNodeBlendTree extends AnimationRootNode {

  /** AnimationNodeBlendTree.add_node */
  final def addNode(name: io.github.optical002.godot.builtin.StringName, node: AnimationNode, position: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid3(MethodBind.get("AnimationNodeBlendTree", "add_node", 1980270704L), hostObject.objectPtr, name, node.hostObject, position)

  /** AnimationNodeBlendTree.get_node */
  final def getNode(name: io.github.optical002.godot.builtin.StringName): GodotObject =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, GodotObject](MethodBind.get("AnimationNodeBlendTree", "get_node", 625644256L), hostObject.objectPtr, name)

  /** AnimationNodeBlendTree.remove_node */
  final def removeNode(name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendTree", "remove_node", 3304788590L), hostObject.objectPtr, name)

  /** AnimationNodeBlendTree.rename_node */
  final def renameNode(name: io.github.optical002.godot.builtin.StringName, new_name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeBlendTree", "rename_node", 3740211285L), hostObject.objectPtr, name, new_name)

  /** AnimationNodeBlendTree.has_node */
  final def hasNode(name: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("AnimationNodeBlendTree", "has_node", 2619796661L), hostObject.objectPtr, name)

  /** AnimationNodeBlendTree.connect_node */
  final def connectNode(input_node: io.github.optical002.godot.builtin.StringName, input_index: Long, output_node: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid3(MethodBind.get("AnimationNodeBlendTree", "connect_node", 2168001410L), hostObject.objectPtr, input_node, input_index, output_node)

  /** AnimationNodeBlendTree.disconnect_node */
  final def disconnectNode(input_node: io.github.optical002.godot.builtin.StringName, input_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeBlendTree", "disconnect_node", 2415702435L), hostObject.objectPtr, input_node, input_index)

  /** AnimationNodeBlendTree.set_node_position */
  final def setNodePosition(name: io.github.optical002.godot.builtin.StringName, position: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeBlendTree", "set_node_position", 1999414630L), hostObject.objectPtr, name, position)

  /** AnimationNodeBlendTree.get_node_position */
  final def getNodePosition(name: io.github.optical002.godot.builtin.StringName): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.Vector2](MethodBind.get("AnimationNodeBlendTree", "get_node_position", 3100822709L), hostObject.objectPtr, name)

  /** AnimationNodeBlendTree.set_graph_offset */
  final def setGraphOffset(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendTree", "set_graph_offset", 743155724L), hostObject.objectPtr, offset)

  /** AnimationNodeBlendTree.get_graph_offset */
  final def getGraphOffset(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("AnimationNodeBlendTree", "get_graph_offset", 3341600327L), hostObject.objectPtr)

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
