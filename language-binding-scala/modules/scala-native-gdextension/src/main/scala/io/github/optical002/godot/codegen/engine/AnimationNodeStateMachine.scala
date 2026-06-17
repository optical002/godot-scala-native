package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeStateMachine`, extends `AnimationRootNode`. */
abstract class AnimationNodeStateMachine extends AnimationRootNode {

  /** AnimationNodeStateMachine.add_node */
  final def addNode(name: io.github.optical002.godot.builtin.StringName, node: AnimationNode, position: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid3(MethodBind.get("AnimationNodeStateMachine", "add_node", 1980270704L), hostObject.objectPtr, name, node.hostObject, position)

  /** AnimationNodeStateMachine.replace_node */
  final def replaceNode(name: io.github.optical002.godot.builtin.StringName, node: AnimationNode): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeStateMachine", "replace_node", 2559412862L), hostObject.objectPtr, name, node.hostObject)

  /** AnimationNodeStateMachine.get_node */
  final def getNode(name: io.github.optical002.godot.builtin.StringName): GodotObject =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, GodotObject](MethodBind.get("AnimationNodeStateMachine", "get_node", 625644256L), hostObject.objectPtr, name)

  /** AnimationNodeStateMachine.remove_node */
  final def removeNode(name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachine", "remove_node", 3304788590L), hostObject.objectPtr, name)

  /** AnimationNodeStateMachine.rename_node */
  final def renameNode(name: io.github.optical002.godot.builtin.StringName, new_name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeStateMachine", "rename_node", 3740211285L), hostObject.objectPtr, name, new_name)

  /** AnimationNodeStateMachine.has_node */
  final def hasNode(name: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("AnimationNodeStateMachine", "has_node", 2619796661L), hostObject.objectPtr, name)

  /** AnimationNodeStateMachine.get_node_name */
  final def getNodeName(node: AnimationNode): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[GodotObject, io.github.optical002.godot.builtin.StringName](MethodBind.get("AnimationNodeStateMachine", "get_node_name", 739213945L), hostObject.objectPtr, node.hostObject)

  /** AnimationNodeStateMachine.set_node_position */
  final def setNodePosition(name: io.github.optical002.godot.builtin.StringName, position: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeStateMachine", "set_node_position", 1999414630L), hostObject.objectPtr, name, position)

  /** AnimationNodeStateMachine.get_node_position */
  final def getNodePosition(name: io.github.optical002.godot.builtin.StringName): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.Vector2](MethodBind.get("AnimationNodeStateMachine", "get_node_position", 3100822709L), hostObject.objectPtr, name)

  /** AnimationNodeStateMachine.has_transition */
  final def hasTransition(from: io.github.optical002.godot.builtin.StringName, to: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("AnimationNodeStateMachine", "has_transition", 471820014L), hostObject.objectPtr, from, to)

  /** AnimationNodeStateMachine.add_transition */
  final def addTransition(from: io.github.optical002.godot.builtin.StringName, to: io.github.optical002.godot.builtin.StringName, transition: AnimationNodeStateMachineTransition): Unit =
    Ptrcall.callVoid3(MethodBind.get("AnimationNodeStateMachine", "add_transition", 795486887L), hostObject.objectPtr, from, to, transition.hostObject)

  /** AnimationNodeStateMachine.get_transition */
  final def getTransition(idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("AnimationNodeStateMachine", "get_transition", 4192381260L), hostObject.objectPtr, idx)

  /** AnimationNodeStateMachine.get_transition_from */
  final def getTransitionFrom(idx: Long): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.StringName](MethodBind.get("AnimationNodeStateMachine", "get_transition_from", 659327637L), hostObject.objectPtr, idx)

  /** AnimationNodeStateMachine.get_transition_to */
  final def getTransitionTo(idx: Long): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.StringName](MethodBind.get("AnimationNodeStateMachine", "get_transition_to", 659327637L), hostObject.objectPtr, idx)

  /** AnimationNodeStateMachine.get_transition_count */
  final def getTransitionCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNodeStateMachine", "get_transition_count", 3905245786L), hostObject.objectPtr)

  /** AnimationNodeStateMachine.remove_transition_by_index */
  final def removeTransitionByIndex(idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachine", "remove_transition_by_index", 1286410249L), hostObject.objectPtr, idx)

  /** AnimationNodeStateMachine.remove_transition */
  final def removeTransition(from: io.github.optical002.godot.builtin.StringName, to: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeStateMachine", "remove_transition", 3740211285L), hostObject.objectPtr, from, to)

  /** AnimationNodeStateMachine.set_graph_offset */
  final def setGraphOffset(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachine", "set_graph_offset", 743155724L), hostObject.objectPtr, offset)

  /** AnimationNodeStateMachine.get_graph_offset */
  final def getGraphOffset(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("AnimationNodeStateMachine", "get_graph_offset", 3341600327L), hostObject.objectPtr)

  /** AnimationNodeStateMachine.set_state_machine_type */
  final def setStateMachineType(state_machine_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachine", "set_state_machine_type", 2584759088L), hostObject.objectPtr, state_machine_type)

  /** AnimationNodeStateMachine.get_state_machine_type */
  final def getStateMachineType(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNodeStateMachine", "get_state_machine_type", 1140726469L), hostObject.objectPtr)

  /** AnimationNodeStateMachine.set_allow_transition_to_self */
  final def setAllowTransitionToSelf(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachine", "set_allow_transition_to_self", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNodeStateMachine.is_allow_transition_to_self */
  final def isAllowTransitionToSelf(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeStateMachine", "is_allow_transition_to_self", 36873697L), hostObject.objectPtr)

  /** AnimationNodeStateMachine.set_reset_ends */
  final def setResetEnds(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeStateMachine", "set_reset_ends", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNodeStateMachine.are_ends_reset */
  final def areEndsReset(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeStateMachine", "are_ends_reset", 36873697L), hostObject.objectPtr)

}

object AnimationNodeStateMachine {
  /** Class metadata for Gd[AnimationNodeStateMachine] lifetime management and casting. */
  given GodotClass[AnimationNodeStateMachine] with {
    def className = "AnimationNodeStateMachine"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeStateMachine = new AnimationNodeStateMachine {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeStateMachine): GodotObject = t.hostObject
  }
}
