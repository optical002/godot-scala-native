package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SplitContainer`, extends `Container`. */
abstract class SplitContainer extends Container {
  override def godotClassName: String = "SplitContainer"

  /** SplitContainer.clamp_split_offset */
  final def clampSplitOffset(priority_index: Long): Unit = {
    if (gdext.classes.SplitContainer.mb_clamp_split_offset == null) gdext.classes.SplitContainer.mb_clamp_split_offset = MethodBind.get("SplitContainer", "clamp_split_offset", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.SplitContainer.mb_clamp_split_offset, livePtr, priority_index)
  }

  /** SplitContainer.set_collapsed */
  final def setCollapsed(collapsed: Boolean): Unit = {
    if (gdext.classes.SplitContainer.mb_set_collapsed == null) gdext.classes.SplitContainer.mb_set_collapsed = MethodBind.get("SplitContainer", "set_collapsed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SplitContainer.mb_set_collapsed, livePtr, collapsed)
  }

  /** SplitContainer.is_collapsed */
  final def isCollapsed(): Boolean = {
    if (gdext.classes.SplitContainer.mb_is_collapsed == null) gdext.classes.SplitContainer.mb_is_collapsed = MethodBind.get("SplitContainer", "is_collapsed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SplitContainer.mb_is_collapsed, livePtr)
  }

  /** SplitContainer.set_dragger_visibility */
  final def setDraggerVisibility(mode: Long): Unit = {
    if (gdext.classes.SplitContainer.mb_set_dragger_visibility == null) gdext.classes.SplitContainer.mb_set_dragger_visibility = MethodBind.get("SplitContainer", "set_dragger_visibility", 1168273952L)
    Ptrcall.callVoid1(gdext.classes.SplitContainer.mb_set_dragger_visibility, livePtr, mode)
  }

  /** SplitContainer.get_dragger_visibility */
  final def getDraggerVisibility(): Long = {
    if (gdext.classes.SplitContainer.mb_get_dragger_visibility == null) gdext.classes.SplitContainer.mb_get_dragger_visibility = MethodBind.get("SplitContainer", "get_dragger_visibility", 967297479L)
    Ptrcall.call0[Long](gdext.classes.SplitContainer.mb_get_dragger_visibility, livePtr)
  }

  /** SplitContainer.set_vertical */
  final def setVertical(vertical: Boolean): Unit = {
    if (gdext.classes.SplitContainer.mb_set_vertical == null) gdext.classes.SplitContainer.mb_set_vertical = MethodBind.get("SplitContainer", "set_vertical", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SplitContainer.mb_set_vertical, livePtr, vertical)
  }

  /** SplitContainer.is_vertical */
  final def isVertical(): Boolean = {
    if (gdext.classes.SplitContainer.mb_is_vertical == null) gdext.classes.SplitContainer.mb_is_vertical = MethodBind.get("SplitContainer", "is_vertical", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SplitContainer.mb_is_vertical, livePtr)
  }

  /** SplitContainer.set_dragging_enabled */
  final def setDraggingEnabled(dragging_enabled: Boolean): Unit = {
    if (gdext.classes.SplitContainer.mb_set_dragging_enabled == null) gdext.classes.SplitContainer.mb_set_dragging_enabled = MethodBind.get("SplitContainer", "set_dragging_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SplitContainer.mb_set_dragging_enabled, livePtr, dragging_enabled)
  }

  /** SplitContainer.is_dragging_enabled */
  final def isDraggingEnabled(): Boolean = {
    if (gdext.classes.SplitContainer.mb_is_dragging_enabled == null) gdext.classes.SplitContainer.mb_is_dragging_enabled = MethodBind.get("SplitContainer", "is_dragging_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SplitContainer.mb_is_dragging_enabled, livePtr)
  }

  /** SplitContainer.set_drag_area_margin_begin */
  final def setDragAreaMarginBegin(margin: Long): Unit = {
    if (gdext.classes.SplitContainer.mb_set_drag_area_margin_begin == null) gdext.classes.SplitContainer.mb_set_drag_area_margin_begin = MethodBind.get("SplitContainer", "set_drag_area_margin_begin", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SplitContainer.mb_set_drag_area_margin_begin, livePtr, margin)
  }

  /** SplitContainer.get_drag_area_margin_begin */
  final def getDragAreaMarginBegin(): Long = {
    if (gdext.classes.SplitContainer.mb_get_drag_area_margin_begin == null) gdext.classes.SplitContainer.mb_get_drag_area_margin_begin = MethodBind.get("SplitContainer", "get_drag_area_margin_begin", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SplitContainer.mb_get_drag_area_margin_begin, livePtr)
  }

  /** SplitContainer.set_drag_area_margin_end */
  final def setDragAreaMarginEnd(margin: Long): Unit = {
    if (gdext.classes.SplitContainer.mb_set_drag_area_margin_end == null) gdext.classes.SplitContainer.mb_set_drag_area_margin_end = MethodBind.get("SplitContainer", "set_drag_area_margin_end", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SplitContainer.mb_set_drag_area_margin_end, livePtr, margin)
  }

  /** SplitContainer.get_drag_area_margin_end */
  final def getDragAreaMarginEnd(): Long = {
    if (gdext.classes.SplitContainer.mb_get_drag_area_margin_end == null) gdext.classes.SplitContainer.mb_get_drag_area_margin_end = MethodBind.get("SplitContainer", "get_drag_area_margin_end", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SplitContainer.mb_get_drag_area_margin_end, livePtr)
  }

  /** SplitContainer.set_drag_area_offset */
  final def setDragAreaOffset(offset: Long): Unit = {
    if (gdext.classes.SplitContainer.mb_set_drag_area_offset == null) gdext.classes.SplitContainer.mb_set_drag_area_offset = MethodBind.get("SplitContainer", "set_drag_area_offset", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SplitContainer.mb_set_drag_area_offset, livePtr, offset)
  }

  /** SplitContainer.get_drag_area_offset */
  final def getDragAreaOffset(): Long = {
    if (gdext.classes.SplitContainer.mb_get_drag_area_offset == null) gdext.classes.SplitContainer.mb_get_drag_area_offset = MethodBind.get("SplitContainer", "get_drag_area_offset", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SplitContainer.mb_get_drag_area_offset, livePtr)
  }

  /** SplitContainer.set_drag_area_highlight_in_editor */
  final def setDragAreaHighlightInEditor(drag_area_highlight_in_editor: Boolean): Unit = {
    if (gdext.classes.SplitContainer.mb_set_drag_area_highlight_in_editor == null) gdext.classes.SplitContainer.mb_set_drag_area_highlight_in_editor = MethodBind.get("SplitContainer", "set_drag_area_highlight_in_editor", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SplitContainer.mb_set_drag_area_highlight_in_editor, livePtr, drag_area_highlight_in_editor)
  }

  /** SplitContainer.is_drag_area_highlight_in_editor_enabled */
  final def isDragAreaHighlightInEditorEnabled(): Boolean = {
    if (gdext.classes.SplitContainer.mb_is_drag_area_highlight_in_editor_enabled == null) gdext.classes.SplitContainer.mb_is_drag_area_highlight_in_editor_enabled = MethodBind.get("SplitContainer", "is_drag_area_highlight_in_editor_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SplitContainer.mb_is_drag_area_highlight_in_editor_enabled, livePtr)
  }

  /** SplitContainer.set_touch_dragger_enabled */
  final def setTouchDraggerEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.SplitContainer.mb_set_touch_dragger_enabled == null) gdext.classes.SplitContainer.mb_set_touch_dragger_enabled = MethodBind.get("SplitContainer", "set_touch_dragger_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SplitContainer.mb_set_touch_dragger_enabled, livePtr, enabled)
  }

  /** SplitContainer.is_touch_dragger_enabled */
  final def isTouchDraggerEnabled(): Boolean = {
    if (gdext.classes.SplitContainer.mb_is_touch_dragger_enabled == null) gdext.classes.SplitContainer.mb_is_touch_dragger_enabled = MethodBind.get("SplitContainer", "is_touch_dragger_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SplitContainer.mb_is_touch_dragger_enabled, livePtr)
  }

  /** SplitContainer.get_drag_area_control */
  final def getDragAreaControl(): Control = {
    if (gdext.classes.SplitContainer.mb_get_drag_area_control == null) gdext.classes.SplitContainer.mb_get_drag_area_control = MethodBind.get("SplitContainer", "get_drag_area_control", 829782337L)
    Wrappers.borrowed[Control](Ptrcall.call0[Long](gdext.classes.SplitContainer.mb_get_drag_area_control, livePtr))
  }

  /** SplitContainer.set_split_offset */
  final def setSplitOffset(offset: Long): Unit = {
    if (gdext.classes.SplitContainer.mb_set_split_offset == null) gdext.classes.SplitContainer.mb_set_split_offset = MethodBind.get("SplitContainer", "set_split_offset", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SplitContainer.mb_set_split_offset, livePtr, offset)
  }

  /** SplitContainer.get_split_offset */
  final def getSplitOffset(): Long = {
    if (gdext.classes.SplitContainer.mb_get_split_offset == null) gdext.classes.SplitContainer.mb_get_split_offset = MethodBind.get("SplitContainer", "get_split_offset", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SplitContainer.mb_get_split_offset, livePtr)
  }

}

object SplitContainer {
  private[classes] var mb_clamp_split_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collapsed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collapsed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dragger_visibility: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dragger_visibility: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_vertical: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dragging_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_dragging_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_area_margin_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag_area_margin_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_area_margin_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag_area_margin_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_area_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag_area_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_area_highlight_in_editor: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drag_area_highlight_in_editor_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_touch_dragger_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_touch_dragger_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag_area_control: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_split_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_split_offset: GDExtensionMethodBindPtr = null
}
