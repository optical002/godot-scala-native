package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GraphNode`, extends `GraphElement`. */
abstract class GraphNode extends GraphElement {
  override def godotClassName: String = "GraphNode"

  /** GraphNode.set_title */
  final def setTitle(title: String): Unit = {
    if (gdext.classes.GraphNode.mb_set_title == null) gdext.classes.GraphNode.mb_set_title = MethodBind.get("GraphNode", "set_title", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GraphNode.mb_set_title, livePtr, title)
  }

  /** GraphNode.get_title */
  final def getTitle(): String = {
    if (gdext.classes.GraphNode.mb_get_title == null) gdext.classes.GraphNode.mb_get_title = MethodBind.get("GraphNode", "get_title", 201670096L)
    Ptrcall.call0[String](gdext.classes.GraphNode.mb_get_title, livePtr)
  }

  /** GraphNode.get_titlebar_hbox */
  final def getTitlebarHbox(): HBoxContainer = {
    if (gdext.classes.GraphNode.mb_get_titlebar_hbox == null) gdext.classes.GraphNode.mb_get_titlebar_hbox = MethodBind.get("GraphNode", "get_titlebar_hbox", 3590609951L)
    Wrappers.borrowed[HBoxContainer](Ptrcall.call0[Long](gdext.classes.GraphNode.mb_get_titlebar_hbox, livePtr))
  }

  /** GraphNode.clear_slot */
  final def clearSlot(slotIndex: Long): Unit = {
    if (gdext.classes.GraphNode.mb_clear_slot == null) gdext.classes.GraphNode.mb_clear_slot = MethodBind.get("GraphNode", "clear_slot", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GraphNode.mb_clear_slot, livePtr, slotIndex)
  }

  /** GraphNode.clear_all_slots */
  final def clearAllSlots(): Unit = {
    if (gdext.classes.GraphNode.mb_clear_all_slots == null) gdext.classes.GraphNode.mb_clear_all_slots = MethodBind.get("GraphNode", "clear_all_slots", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.GraphNode.mb_clear_all_slots, livePtr)
  }

  /** GraphNode.is_slot_enabled_left */
  final def isSlotEnabledLeft(slotIndex: Long): Boolean = {
    if (gdext.classes.GraphNode.mb_is_slot_enabled_left == null) gdext.classes.GraphNode.mb_is_slot_enabled_left = MethodBind.get("GraphNode", "is_slot_enabled_left", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.GraphNode.mb_is_slot_enabled_left, livePtr, slotIndex)
  }

  /** GraphNode.set_slot_enabled_left */
  final def setSlotEnabledLeft(slotIndex: Long, enable: Boolean): Unit = {
    if (gdext.classes.GraphNode.mb_set_slot_enabled_left == null) gdext.classes.GraphNode.mb_set_slot_enabled_left = MethodBind.get("GraphNode", "set_slot_enabled_left", 300928843L)
    Ptrcall.callVoid2(gdext.classes.GraphNode.mb_set_slot_enabled_left, livePtr, slotIndex, enable)
  }

  /** GraphNode.set_slot_type_left */
  final def setSlotTypeLeft(slotIndex: Long, `type`: Long): Unit = {
    if (gdext.classes.GraphNode.mb_set_slot_type_left == null) gdext.classes.GraphNode.mb_set_slot_type_left = MethodBind.get("GraphNode", "set_slot_type_left", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.GraphNode.mb_set_slot_type_left, livePtr, slotIndex, `type`)
  }

  /** GraphNode.get_slot_type_left */
  final def getSlotTypeLeft(slotIndex: Long): Long = {
    if (gdext.classes.GraphNode.mb_get_slot_type_left == null) gdext.classes.GraphNode.mb_get_slot_type_left = MethodBind.get("GraphNode", "get_slot_type_left", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.GraphNode.mb_get_slot_type_left, livePtr, slotIndex)
  }

  /** GraphNode.set_slot_color_left */
  final def setSlotColorLeft(slotIndex: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.GraphNode.mb_set_slot_color_left == null) gdext.classes.GraphNode.mb_set_slot_color_left = MethodBind.get("GraphNode", "set_slot_color_left", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.GraphNode.mb_set_slot_color_left, livePtr, slotIndex, color)
  }

  /** GraphNode.get_slot_color_left */
  final def getSlotColorLeft(slotIndex: Long): gdext.builtin.Color = {
    if (gdext.classes.GraphNode.mb_get_slot_color_left == null) gdext.classes.GraphNode.mb_get_slot_color_left = MethodBind.get("GraphNode", "get_slot_color_left", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.GraphNode.mb_get_slot_color_left, livePtr, slotIndex)
  }

  /** GraphNode.set_slot_custom_icon_left */
  final def setSlotCustomIconLeft(slotIndex: Long, customIcon: Texture2D): Unit = {
    if (gdext.classes.GraphNode.mb_set_slot_custom_icon_left == null) gdext.classes.GraphNode.mb_set_slot_custom_icon_left = MethodBind.get("GraphNode", "set_slot_custom_icon_left", 666127730L)
    Ptrcall.callVoid2(gdext.classes.GraphNode.mb_set_slot_custom_icon_left, livePtr, slotIndex, Wrappers.handle(customIcon))
  }

  /** GraphNode.get_slot_custom_icon_left. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSlotCustomIconLeft(slotIndex: Long): Texture2D = {
    if (gdext.classes.GraphNode.mb_get_slot_custom_icon_left == null) gdext.classes.GraphNode.mb_get_slot_custom_icon_left = MethodBind.get("GraphNode", "get_slot_custom_icon_left", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.GraphNode.mb_get_slot_custom_icon_left, livePtr, slotIndex))
  }

  /** GraphNode.is_slot_enabled_right */
  final def isSlotEnabledRight(slotIndex: Long): Boolean = {
    if (gdext.classes.GraphNode.mb_is_slot_enabled_right == null) gdext.classes.GraphNode.mb_is_slot_enabled_right = MethodBind.get("GraphNode", "is_slot_enabled_right", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.GraphNode.mb_is_slot_enabled_right, livePtr, slotIndex)
  }

  /** GraphNode.set_slot_enabled_right */
  final def setSlotEnabledRight(slotIndex: Long, enable: Boolean): Unit = {
    if (gdext.classes.GraphNode.mb_set_slot_enabled_right == null) gdext.classes.GraphNode.mb_set_slot_enabled_right = MethodBind.get("GraphNode", "set_slot_enabled_right", 300928843L)
    Ptrcall.callVoid2(gdext.classes.GraphNode.mb_set_slot_enabled_right, livePtr, slotIndex, enable)
  }

  /** GraphNode.set_slot_type_right */
  final def setSlotTypeRight(slotIndex: Long, `type`: Long): Unit = {
    if (gdext.classes.GraphNode.mb_set_slot_type_right == null) gdext.classes.GraphNode.mb_set_slot_type_right = MethodBind.get("GraphNode", "set_slot_type_right", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.GraphNode.mb_set_slot_type_right, livePtr, slotIndex, `type`)
  }

  /** GraphNode.get_slot_type_right */
  final def getSlotTypeRight(slotIndex: Long): Long = {
    if (gdext.classes.GraphNode.mb_get_slot_type_right == null) gdext.classes.GraphNode.mb_get_slot_type_right = MethodBind.get("GraphNode", "get_slot_type_right", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.GraphNode.mb_get_slot_type_right, livePtr, slotIndex)
  }

  /** GraphNode.set_slot_color_right */
  final def setSlotColorRight(slotIndex: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.GraphNode.mb_set_slot_color_right == null) gdext.classes.GraphNode.mb_set_slot_color_right = MethodBind.get("GraphNode", "set_slot_color_right", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.GraphNode.mb_set_slot_color_right, livePtr, slotIndex, color)
  }

  /** GraphNode.get_slot_color_right */
  final def getSlotColorRight(slotIndex: Long): gdext.builtin.Color = {
    if (gdext.classes.GraphNode.mb_get_slot_color_right == null) gdext.classes.GraphNode.mb_get_slot_color_right = MethodBind.get("GraphNode", "get_slot_color_right", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.GraphNode.mb_get_slot_color_right, livePtr, slotIndex)
  }

  /** GraphNode.set_slot_custom_icon_right */
  final def setSlotCustomIconRight(slotIndex: Long, customIcon: Texture2D): Unit = {
    if (gdext.classes.GraphNode.mb_set_slot_custom_icon_right == null) gdext.classes.GraphNode.mb_set_slot_custom_icon_right = MethodBind.get("GraphNode", "set_slot_custom_icon_right", 666127730L)
    Ptrcall.callVoid2(gdext.classes.GraphNode.mb_set_slot_custom_icon_right, livePtr, slotIndex, Wrappers.handle(customIcon))
  }

  /** GraphNode.get_slot_custom_icon_right. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSlotCustomIconRight(slotIndex: Long): Texture2D = {
    if (gdext.classes.GraphNode.mb_get_slot_custom_icon_right == null) gdext.classes.GraphNode.mb_get_slot_custom_icon_right = MethodBind.get("GraphNode", "get_slot_custom_icon_right", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.GraphNode.mb_get_slot_custom_icon_right, livePtr, slotIndex))
  }

  /** GraphNode.is_slot_draw_stylebox */
  final def isSlotDrawStylebox(slotIndex: Long): Boolean = {
    if (gdext.classes.GraphNode.mb_is_slot_draw_stylebox == null) gdext.classes.GraphNode.mb_is_slot_draw_stylebox = MethodBind.get("GraphNode", "is_slot_draw_stylebox", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.GraphNode.mb_is_slot_draw_stylebox, livePtr, slotIndex)
  }

  /** GraphNode.set_slot_draw_stylebox */
  final def setSlotDrawStylebox(slotIndex: Long, enable: Boolean): Unit = {
    if (gdext.classes.GraphNode.mb_set_slot_draw_stylebox == null) gdext.classes.GraphNode.mb_set_slot_draw_stylebox = MethodBind.get("GraphNode", "set_slot_draw_stylebox", 300928843L)
    Ptrcall.callVoid2(gdext.classes.GraphNode.mb_set_slot_draw_stylebox, livePtr, slotIndex, enable)
  }

  /** GraphNode.set_ignore_invalid_connection_type */
  final def setIgnoreInvalidConnectionType(ignore: Boolean): Unit = {
    if (gdext.classes.GraphNode.mb_set_ignore_invalid_connection_type == null) gdext.classes.GraphNode.mb_set_ignore_invalid_connection_type = MethodBind.get("GraphNode", "set_ignore_invalid_connection_type", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphNode.mb_set_ignore_invalid_connection_type, livePtr, ignore)
  }

  /** GraphNode.is_ignoring_valid_connection_type */
  final def isIgnoringValidConnectionType(): Boolean = {
    if (gdext.classes.GraphNode.mb_is_ignoring_valid_connection_type == null) gdext.classes.GraphNode.mb_is_ignoring_valid_connection_type = MethodBind.get("GraphNode", "is_ignoring_valid_connection_type", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphNode.mb_is_ignoring_valid_connection_type, livePtr)
  }

  /** GraphNode.set_slots_focus_mode */
  final def setSlotsFocusMode(focusMode: gdext.classes.Control.FocusMode): Unit = {
    if (gdext.classes.GraphNode.mb_set_slots_focus_mode == null) gdext.classes.GraphNode.mb_set_slots_focus_mode = MethodBind.get("GraphNode", "set_slots_focus_mode", 3232914922L)
    Ptrcall.callVoid1(gdext.classes.GraphNode.mb_set_slots_focus_mode, livePtr, focusMode)
  }

  /** GraphNode.get_slots_focus_mode */
  final def getSlotsFocusMode(): gdext.classes.Control.FocusMode = {
    if (gdext.classes.GraphNode.mb_get_slots_focus_mode == null) gdext.classes.GraphNode.mb_get_slots_focus_mode = MethodBind.get("GraphNode", "get_slots_focus_mode", 2132829277L)
    gdext.classes.Control.FocusMode(Ptrcall.call0[Long](gdext.classes.GraphNode.mb_get_slots_focus_mode, livePtr))
  }

  /** GraphNode.get_input_port_count */
  final def getInputPortCount(): Long = {
    if (gdext.classes.GraphNode.mb_get_input_port_count == null) gdext.classes.GraphNode.mb_get_input_port_count = MethodBind.get("GraphNode", "get_input_port_count", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.GraphNode.mb_get_input_port_count, livePtr)
  }

  /** GraphNode.get_input_port_position */
  final def getInputPortPosition(portIdx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.GraphNode.mb_get_input_port_position == null) gdext.classes.GraphNode.mb_get_input_port_position = MethodBind.get("GraphNode", "get_input_port_position", 3114997196L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.GraphNode.mb_get_input_port_position, livePtr, portIdx)
  }

  /** GraphNode.get_input_port_type */
  final def getInputPortType(portIdx: Long): Long = {
    if (gdext.classes.GraphNode.mb_get_input_port_type == null) gdext.classes.GraphNode.mb_get_input_port_type = MethodBind.get("GraphNode", "get_input_port_type", 3744713108L)
    Ptrcall.call1[Long, Long](gdext.classes.GraphNode.mb_get_input_port_type, livePtr, portIdx)
  }

  /** GraphNode.get_input_port_color */
  final def getInputPortColor(portIdx: Long): gdext.builtin.Color = {
    if (gdext.classes.GraphNode.mb_get_input_port_color == null) gdext.classes.GraphNode.mb_get_input_port_color = MethodBind.get("GraphNode", "get_input_port_color", 2624840992L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.GraphNode.mb_get_input_port_color, livePtr, portIdx)
  }

  /** GraphNode.get_input_port_slot */
  final def getInputPortSlot(portIdx: Long): Long = {
    if (gdext.classes.GraphNode.mb_get_input_port_slot == null) gdext.classes.GraphNode.mb_get_input_port_slot = MethodBind.get("GraphNode", "get_input_port_slot", 3744713108L)
    Ptrcall.call1[Long, Long](gdext.classes.GraphNode.mb_get_input_port_slot, livePtr, portIdx)
  }

  /** GraphNode.get_output_port_count */
  final def getOutputPortCount(): Long = {
    if (gdext.classes.GraphNode.mb_get_output_port_count == null) gdext.classes.GraphNode.mb_get_output_port_count = MethodBind.get("GraphNode", "get_output_port_count", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.GraphNode.mb_get_output_port_count, livePtr)
  }

  /** GraphNode.get_output_port_position */
  final def getOutputPortPosition(portIdx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.GraphNode.mb_get_output_port_position == null) gdext.classes.GraphNode.mb_get_output_port_position = MethodBind.get("GraphNode", "get_output_port_position", 3114997196L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.GraphNode.mb_get_output_port_position, livePtr, portIdx)
  }

  /** GraphNode.get_output_port_type */
  final def getOutputPortType(portIdx: Long): Long = {
    if (gdext.classes.GraphNode.mb_get_output_port_type == null) gdext.classes.GraphNode.mb_get_output_port_type = MethodBind.get("GraphNode", "get_output_port_type", 3744713108L)
    Ptrcall.call1[Long, Long](gdext.classes.GraphNode.mb_get_output_port_type, livePtr, portIdx)
  }

  /** GraphNode.get_output_port_color */
  final def getOutputPortColor(portIdx: Long): gdext.builtin.Color = {
    if (gdext.classes.GraphNode.mb_get_output_port_color == null) gdext.classes.GraphNode.mb_get_output_port_color = MethodBind.get("GraphNode", "get_output_port_color", 2624840992L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.GraphNode.mb_get_output_port_color, livePtr, portIdx)
  }

  /** GraphNode.get_output_port_slot */
  final def getOutputPortSlot(portIdx: Long): Long = {
    if (gdext.classes.GraphNode.mb_get_output_port_slot == null) gdext.classes.GraphNode.mb_get_output_port_slot = MethodBind.get("GraphNode", "get_output_port_slot", 3744713108L)
    Ptrcall.call1[Long, Long](gdext.classes.GraphNode.mb_get_output_port_slot, livePtr, portIdx)
  }

}

object GraphNode {
  private[classes] var mb_set_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_titlebar_hbox: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_slot: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_all_slots: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_slot_enabled_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_slot_enabled_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_slot_type_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_slot_type_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_slot_color_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_slot_color_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_slot_custom_icon_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_slot_custom_icon_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_slot_enabled_right: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_slot_enabled_right: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_slot_type_right: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_slot_type_right: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_slot_color_right: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_slot_color_right: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_slot_custom_icon_right: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_slot_custom_icon_right: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_slot_draw_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_slot_draw_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ignore_invalid_connection_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ignoring_valid_connection_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_slots_focus_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_slots_focus_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_port_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_port_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_port_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_port_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_port_slot: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_output_port_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_output_port_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_output_port_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_output_port_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_output_port_slot: GDExtensionMethodBindPtr = null
}
