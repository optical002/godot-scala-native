package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationNodeStateMachine`, extends `AnimationRootNode`. */
abstract class AnimationNodeStateMachine extends AnimationRootNode {
  override def godotClassName: String = "AnimationNodeStateMachine"

  /** AnimationNodeStateMachine.add_node */
  final def addNode(name: String, node: AnimationNode, position: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): Unit = {
    if (gdext.classes.AnimationNodeStateMachine.mb_add_node == null) gdext.classes.AnimationNodeStateMachine.mb_add_node = MethodBind.get("AnimationNodeStateMachine", "add_node", 1980270704L)
    Ptrcall.callVoid3(gdext.classes.AnimationNodeStateMachine.mb_add_node, livePtr, SnArg(name), Wrappers.handle(node), position)
  }

  /** AnimationNodeStateMachine.replace_node */
  final def replaceNode(name: String, node: AnimationNode): Unit = {
    if (gdext.classes.AnimationNodeStateMachine.mb_replace_node == null) gdext.classes.AnimationNodeStateMachine.mb_replace_node = MethodBind.get("AnimationNodeStateMachine", "replace_node", 2559412862L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeStateMachine.mb_replace_node, livePtr, SnArg(name), Wrappers.handle(node))
  }

  /** AnimationNodeStateMachine.get_node. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNode(name: String): AnimationNode = {
    if (gdext.classes.AnimationNodeStateMachine.mb_get_node == null) gdext.classes.AnimationNodeStateMachine.mb_get_node = MethodBind.get("AnimationNodeStateMachine", "get_node", 625644256L)
    Wrappers.owned[AnimationNode](Ptrcall.call1[SnArg, Long](gdext.classes.AnimationNodeStateMachine.mb_get_node, livePtr, SnArg(name)))
  }

  /** AnimationNodeStateMachine.remove_node */
  final def removeNode(name: String): Unit = {
    if (gdext.classes.AnimationNodeStateMachine.mb_remove_node == null) gdext.classes.AnimationNodeStateMachine.mb_remove_node = MethodBind.get("AnimationNodeStateMachine", "remove_node", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachine.mb_remove_node, livePtr, SnArg(name))
  }

  /** AnimationNodeStateMachine.rename_node */
  final def renameNode(name: String, newName: String): Unit = {
    if (gdext.classes.AnimationNodeStateMachine.mb_rename_node == null) gdext.classes.AnimationNodeStateMachine.mb_rename_node = MethodBind.get("AnimationNodeStateMachine", "rename_node", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeStateMachine.mb_rename_node, livePtr, SnArg(name), SnArg(newName))
  }

  /** AnimationNodeStateMachine.has_node */
  final def hasNode(name: String): Boolean = {
    if (gdext.classes.AnimationNodeStateMachine.mb_has_node == null) gdext.classes.AnimationNodeStateMachine.mb_has_node = MethodBind.get("AnimationNodeStateMachine", "has_node", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.AnimationNodeStateMachine.mb_has_node, livePtr, SnArg(name))
  }

  /** AnimationNodeStateMachine.get_node_name */
  final def getNodeName(node: AnimationNode): String = {
    if (gdext.classes.AnimationNodeStateMachine.mb_get_node_name == null) gdext.classes.AnimationNodeStateMachine.mb_get_node_name = MethodBind.get("AnimationNodeStateMachine", "get_node_name", 739213945L)
    Ptrcall.call1[GodotObject, SnArg](gdext.classes.AnimationNodeStateMachine.mb_get_node_name, livePtr, Wrappers.handle(node))
  }

  /** AnimationNodeStateMachine.set_node_position */
  final def setNodePosition(name: String, position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.AnimationNodeStateMachine.mb_set_node_position == null) gdext.classes.AnimationNodeStateMachine.mb_set_node_position = MethodBind.get("AnimationNodeStateMachine", "set_node_position", 1999414630L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeStateMachine.mb_set_node_position, livePtr, SnArg(name), position)
  }

  /** AnimationNodeStateMachine.get_node_position */
  final def getNodePosition(name: String): gdext.builtin.Vector2 = {
    if (gdext.classes.AnimationNodeStateMachine.mb_get_node_position == null) gdext.classes.AnimationNodeStateMachine.mb_get_node_position = MethodBind.get("AnimationNodeStateMachine", "get_node_position", 3100822709L)
    Ptrcall.call1[SnArg, gdext.builtin.Vector2](gdext.classes.AnimationNodeStateMachine.mb_get_node_position, livePtr, SnArg(name))
  }

  /** AnimationNodeStateMachine.has_transition */
  final def hasTransition(from: String, to: String): Boolean = {
    if (gdext.classes.AnimationNodeStateMachine.mb_has_transition == null) gdext.classes.AnimationNodeStateMachine.mb_has_transition = MethodBind.get("AnimationNodeStateMachine", "has_transition", 471820014L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.AnimationNodeStateMachine.mb_has_transition, livePtr, SnArg(from), SnArg(to))
  }

  /** AnimationNodeStateMachine.add_transition */
  final def addTransition(from: String, to: String, transition: AnimationNodeStateMachineTransition): Unit = {
    if (gdext.classes.AnimationNodeStateMachine.mb_add_transition == null) gdext.classes.AnimationNodeStateMachine.mb_add_transition = MethodBind.get("AnimationNodeStateMachine", "add_transition", 795486887L)
    Ptrcall.callVoid3(gdext.classes.AnimationNodeStateMachine.mb_add_transition, livePtr, SnArg(from), SnArg(to), Wrappers.handle(transition))
  }

  /** AnimationNodeStateMachine.get_transition. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTransition(idx: Long): AnimationNodeStateMachineTransition = {
    if (gdext.classes.AnimationNodeStateMachine.mb_get_transition == null) gdext.classes.AnimationNodeStateMachine.mb_get_transition = MethodBind.get("AnimationNodeStateMachine", "get_transition", 4192381260L)
    Wrappers.owned[AnimationNodeStateMachineTransition](Ptrcall.call1[Long, Long](gdext.classes.AnimationNodeStateMachine.mb_get_transition, livePtr, idx))
  }

  /** AnimationNodeStateMachine.get_transition_from */
  final def getTransitionFrom(idx: Long): String = {
    if (gdext.classes.AnimationNodeStateMachine.mb_get_transition_from == null) gdext.classes.AnimationNodeStateMachine.mb_get_transition_from = MethodBind.get("AnimationNodeStateMachine", "get_transition_from", 659327637L)
    Ptrcall.call1[Long, SnArg](gdext.classes.AnimationNodeStateMachine.mb_get_transition_from, livePtr, idx)
  }

  /** AnimationNodeStateMachine.get_transition_to */
  final def getTransitionTo(idx: Long): String = {
    if (gdext.classes.AnimationNodeStateMachine.mb_get_transition_to == null) gdext.classes.AnimationNodeStateMachine.mb_get_transition_to = MethodBind.get("AnimationNodeStateMachine", "get_transition_to", 659327637L)
    Ptrcall.call1[Long, SnArg](gdext.classes.AnimationNodeStateMachine.mb_get_transition_to, livePtr, idx)
  }

  /** AnimationNodeStateMachine.get_transition_count */
  final def getTransitionCount(): Long = {
    if (gdext.classes.AnimationNodeStateMachine.mb_get_transition_count == null) gdext.classes.AnimationNodeStateMachine.mb_get_transition_count = MethodBind.get("AnimationNodeStateMachine", "get_transition_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AnimationNodeStateMachine.mb_get_transition_count, livePtr)
  }

  /** AnimationNodeStateMachine.remove_transition_by_index */
  final def removeTransitionByIndex(idx: Long): Unit = {
    if (gdext.classes.AnimationNodeStateMachine.mb_remove_transition_by_index == null) gdext.classes.AnimationNodeStateMachine.mb_remove_transition_by_index = MethodBind.get("AnimationNodeStateMachine", "remove_transition_by_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachine.mb_remove_transition_by_index, livePtr, idx)
  }

  /** AnimationNodeStateMachine.remove_transition */
  final def removeTransition(from: String, to: String): Unit = {
    if (gdext.classes.AnimationNodeStateMachine.mb_remove_transition == null) gdext.classes.AnimationNodeStateMachine.mb_remove_transition = MethodBind.get("AnimationNodeStateMachine", "remove_transition", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeStateMachine.mb_remove_transition, livePtr, SnArg(from), SnArg(to))
  }

  /** AnimationNodeStateMachine.set_graph_offset */
  final def setGraphOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.AnimationNodeStateMachine.mb_set_graph_offset == null) gdext.classes.AnimationNodeStateMachine.mb_set_graph_offset = MethodBind.get("AnimationNodeStateMachine", "set_graph_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachine.mb_set_graph_offset, livePtr, offset)
  }

  /** AnimationNodeStateMachine.get_graph_offset */
  final def getGraphOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.AnimationNodeStateMachine.mb_get_graph_offset == null) gdext.classes.AnimationNodeStateMachine.mb_get_graph_offset = MethodBind.get("AnimationNodeStateMachine", "get_graph_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.AnimationNodeStateMachine.mb_get_graph_offset, livePtr)
  }

  /** AnimationNodeStateMachine.set_state_machine_type */
  final def setStateMachineType(stateMachineType: gdext.classes.AnimationNodeStateMachine.StateMachineType): Unit = {
    if (gdext.classes.AnimationNodeStateMachine.mb_set_state_machine_type == null) gdext.classes.AnimationNodeStateMachine.mb_set_state_machine_type = MethodBind.get("AnimationNodeStateMachine", "set_state_machine_type", 2584759088L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachine.mb_set_state_machine_type, livePtr, stateMachineType)
  }

  /** AnimationNodeStateMachine.get_state_machine_type */
  final def getStateMachineType(): gdext.classes.AnimationNodeStateMachine.StateMachineType = {
    if (gdext.classes.AnimationNodeStateMachine.mb_get_state_machine_type == null) gdext.classes.AnimationNodeStateMachine.mb_get_state_machine_type = MethodBind.get("AnimationNodeStateMachine", "get_state_machine_type", 1140726469L)
    gdext.classes.AnimationNodeStateMachine.StateMachineType(Ptrcall.call0[Long](gdext.classes.AnimationNodeStateMachine.mb_get_state_machine_type, livePtr))
  }

  /** AnimationNodeStateMachine.set_allow_transition_to_self */
  final def setAllowTransitionToSelf(enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeStateMachine.mb_set_allow_transition_to_self == null) gdext.classes.AnimationNodeStateMachine.mb_set_allow_transition_to_self = MethodBind.get("AnimationNodeStateMachine", "set_allow_transition_to_self", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachine.mb_set_allow_transition_to_self, livePtr, enable)
  }

  /** AnimationNodeStateMachine.is_allow_transition_to_self */
  final def isAllowTransitionToSelf(): Boolean = {
    if (gdext.classes.AnimationNodeStateMachine.mb_is_allow_transition_to_self == null) gdext.classes.AnimationNodeStateMachine.mb_is_allow_transition_to_self = MethodBind.get("AnimationNodeStateMachine", "is_allow_transition_to_self", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeStateMachine.mb_is_allow_transition_to_self, livePtr)
  }

  /** AnimationNodeStateMachine.set_reset_ends */
  final def setResetEnds(enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeStateMachine.mb_set_reset_ends == null) gdext.classes.AnimationNodeStateMachine.mb_set_reset_ends = MethodBind.get("AnimationNodeStateMachine", "set_reset_ends", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeStateMachine.mb_set_reset_ends, livePtr, enable)
  }

  /** AnimationNodeStateMachine.are_ends_reset */
  final def areEndsReset(): Boolean = {
    if (gdext.classes.AnimationNodeStateMachine.mb_are_ends_reset == null) gdext.classes.AnimationNodeStateMachine.mb_are_ends_reset = MethodBind.get("AnimationNodeStateMachine", "are_ends_reset", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeStateMachine.mb_are_ends_reset, livePtr)
  }

}

object AnimationNodeStateMachine {
  private[classes] var mb_add_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_replace_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_node_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_transition: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_transition: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transition: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transition_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transition_to: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transition_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_transition_by_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_transition: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_graph_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_graph_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_state_machine_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_state_machine_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_transition_to_self: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_allow_transition_to_self: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reset_ends: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_ends_reset: GDExtensionMethodBindPtr = null

  /** Godot enum `AnimationNodeStateMachine.StateMachineType`. */
  opaque type StateMachineType <: Long = Long

  object StateMachineType {
    final val Root: StateMachineType = 0L.asInstanceOf[StateMachineType]
    final val Nested: StateMachineType = 1L.asInstanceOf[StateMachineType]
    final val Grouped: StateMachineType = 2L.asInstanceOf[StateMachineType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): StateMachineType = value.asInstanceOf[StateMachineType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[StateMachineType] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[StateMachineType]]

    extension (self: StateMachineType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Root"
        case 1L => "Nested"
        case 2L => "Grouped"
        case other => other.toString
      }
  }
}
