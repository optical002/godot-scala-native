package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GraphNode`, extends `GraphElement`. */
abstract class GraphNode extends GraphElement {

  /** GraphNode.set_title */
  final def setTitle(title: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphNode", "set_title", 83702148L), hostObject.objectPtr, title)

  /** GraphNode.get_title */
  final def getTitle(): String =
    Ptrcall.call0[String](MethodBind.get("GraphNode", "get_title", 201670096L), hostObject.objectPtr)

  /** GraphNode.get_titlebar_hbox */
  final def getTitlebarHbox(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GraphNode", "get_titlebar_hbox", 3590609951L), hostObject.objectPtr)

  /** GraphNode.clear_slot */
  final def clearSlot(slot_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphNode", "clear_slot", 1286410249L), hostObject.objectPtr, slot_index)

  /** GraphNode.clear_all_slots */
  final def clearAllSlots(): Unit =
    Ptrcall.callVoid0(MethodBind.get("GraphNode", "clear_all_slots", 3218959716L), hostObject.objectPtr)

  /** GraphNode.is_slot_enabled_left */
  final def isSlotEnabledLeft(slot_index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("GraphNode", "is_slot_enabled_left", 1116898809L), hostObject.objectPtr, slot_index)

  /** GraphNode.set_slot_enabled_left */
  final def setSlotEnabledLeft(slot_index: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("GraphNode", "set_slot_enabled_left", 300928843L), hostObject.objectPtr, slot_index, enable)

  /** GraphNode.set_slot_type_left */
  final def setSlotTypeLeft(slot_index: Long, `type`: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("GraphNode", "set_slot_type_left", 3937882851L), hostObject.objectPtr, slot_index, `type`)

  /** GraphNode.get_slot_type_left */
  final def getSlotTypeLeft(slot_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("GraphNode", "get_slot_type_left", 923996154L), hostObject.objectPtr, slot_index)

  /** GraphNode.set_slot_color_left */
  final def setSlotColorLeft(slot_index: Long, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("GraphNode", "set_slot_color_left", 2878471219L), hostObject.objectPtr, slot_index, color)

  /** GraphNode.get_slot_color_left */
  final def getSlotColorLeft(slot_index: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("GraphNode", "get_slot_color_left", 3457211756L), hostObject.objectPtr, slot_index)

  /** GraphNode.set_slot_custom_icon_left */
  final def setSlotCustomIconLeft(slot_index: Long, custom_icon: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("GraphNode", "set_slot_custom_icon_left", 666127730L), hostObject.objectPtr, slot_index, custom_icon.hostObject)

  /** GraphNode.get_slot_custom_icon_left */
  final def getSlotCustomIconLeft(slot_index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("GraphNode", "get_slot_custom_icon_left", 3536238170L), hostObject.objectPtr, slot_index)

  /** GraphNode.is_slot_enabled_right */
  final def isSlotEnabledRight(slot_index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("GraphNode", "is_slot_enabled_right", 1116898809L), hostObject.objectPtr, slot_index)

  /** GraphNode.set_slot_enabled_right */
  final def setSlotEnabledRight(slot_index: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("GraphNode", "set_slot_enabled_right", 300928843L), hostObject.objectPtr, slot_index, enable)

  /** GraphNode.set_slot_type_right */
  final def setSlotTypeRight(slot_index: Long, `type`: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("GraphNode", "set_slot_type_right", 3937882851L), hostObject.objectPtr, slot_index, `type`)

  /** GraphNode.get_slot_type_right */
  final def getSlotTypeRight(slot_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("GraphNode", "get_slot_type_right", 923996154L), hostObject.objectPtr, slot_index)

  /** GraphNode.set_slot_color_right */
  final def setSlotColorRight(slot_index: Long, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("GraphNode", "set_slot_color_right", 2878471219L), hostObject.objectPtr, slot_index, color)

  /** GraphNode.get_slot_color_right */
  final def getSlotColorRight(slot_index: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("GraphNode", "get_slot_color_right", 3457211756L), hostObject.objectPtr, slot_index)

  /** GraphNode.set_slot_custom_icon_right */
  final def setSlotCustomIconRight(slot_index: Long, custom_icon: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("GraphNode", "set_slot_custom_icon_right", 666127730L), hostObject.objectPtr, slot_index, custom_icon.hostObject)

  /** GraphNode.get_slot_custom_icon_right */
  final def getSlotCustomIconRight(slot_index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("GraphNode", "get_slot_custom_icon_right", 3536238170L), hostObject.objectPtr, slot_index)

  /** GraphNode.is_slot_draw_stylebox */
  final def isSlotDrawStylebox(slot_index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("GraphNode", "is_slot_draw_stylebox", 1116898809L), hostObject.objectPtr, slot_index)

  /** GraphNode.set_slot_draw_stylebox */
  final def setSlotDrawStylebox(slot_index: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("GraphNode", "set_slot_draw_stylebox", 300928843L), hostObject.objectPtr, slot_index, enable)

  /** GraphNode.set_ignore_invalid_connection_type */
  final def setIgnoreInvalidConnectionType(ignore: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphNode", "set_ignore_invalid_connection_type", 2586408642L), hostObject.objectPtr, ignore)

  /** GraphNode.is_ignoring_valid_connection_type */
  final def isIgnoringValidConnectionType(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphNode", "is_ignoring_valid_connection_type", 36873697L), hostObject.objectPtr)

  /** GraphNode.set_slots_focus_mode */
  final def setSlotsFocusMode(focus_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphNode", "set_slots_focus_mode", 3232914922L), hostObject.objectPtr, focus_mode)

  /** GraphNode.get_slots_focus_mode */
  final def getSlotsFocusMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("GraphNode", "get_slots_focus_mode", 2132829277L), hostObject.objectPtr)

  /** GraphNode.get_input_port_count */
  final def getInputPortCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("GraphNode", "get_input_port_count", 2455072627L), hostObject.objectPtr)

  /** GraphNode.get_input_port_position */
  final def getInputPortPosition(port_idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("GraphNode", "get_input_port_position", 3114997196L), hostObject.objectPtr, port_idx)

  /** GraphNode.get_input_port_type */
  final def getInputPortType(port_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("GraphNode", "get_input_port_type", 3744713108L), hostObject.objectPtr, port_idx)

  /** GraphNode.get_input_port_color */
  final def getInputPortColor(port_idx: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("GraphNode", "get_input_port_color", 2624840992L), hostObject.objectPtr, port_idx)

  /** GraphNode.get_input_port_slot */
  final def getInputPortSlot(port_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("GraphNode", "get_input_port_slot", 3744713108L), hostObject.objectPtr, port_idx)

  /** GraphNode.get_output_port_count */
  final def getOutputPortCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("GraphNode", "get_output_port_count", 2455072627L), hostObject.objectPtr)

  /** GraphNode.get_output_port_position */
  final def getOutputPortPosition(port_idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("GraphNode", "get_output_port_position", 3114997196L), hostObject.objectPtr, port_idx)

  /** GraphNode.get_output_port_type */
  final def getOutputPortType(port_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("GraphNode", "get_output_port_type", 3744713108L), hostObject.objectPtr, port_idx)

  /** GraphNode.get_output_port_color */
  final def getOutputPortColor(port_idx: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("GraphNode", "get_output_port_color", 2624840992L), hostObject.objectPtr, port_idx)

  /** GraphNode.get_output_port_slot */
  final def getOutputPortSlot(port_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("GraphNode", "get_output_port_slot", 3744713108L), hostObject.objectPtr, port_idx)

}

object GraphNode {
  /** Class metadata for Gd[GraphNode] lifetime management and casting. */
  given GodotClass[GraphNode] with {
    def className = "GraphNode"
    def isRefCounted = false
    def wrap(o: GodotObject): GraphNode = new GraphNode {}.withHost(o.objectPtr)
    def unwrap(t: GraphNode): GodotObject = t.hostObject
  }
}
