package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `SplitContainer`, extends `Container`. */
abstract class SplitContainer extends Container {

  /** SplitContainer.clamp_split_offset */
  final def clampSplitOffset(priority_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SplitContainer", "clamp_split_offset", 1995695955L), hostObject.objectPtr, priority_index)

  /** SplitContainer.set_collapsed */
  final def setCollapsed(collapsed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SplitContainer", "set_collapsed", 2586408642L), hostObject.objectPtr, collapsed)

  /** SplitContainer.is_collapsed */
  final def isCollapsed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SplitContainer", "is_collapsed", 36873697L), hostObject.objectPtr)

  /** SplitContainer.set_dragger_visibility */
  final def setDraggerVisibility(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SplitContainer", "set_dragger_visibility", 1168273952L), hostObject.objectPtr, mode)

  /** SplitContainer.get_dragger_visibility */
  final def getDraggerVisibility(): Long =
    Ptrcall.call0[Long](MethodBind.get("SplitContainer", "get_dragger_visibility", 967297479L), hostObject.objectPtr)

  /** SplitContainer.set_vertical */
  final def setVertical(vertical: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SplitContainer", "set_vertical", 2586408642L), hostObject.objectPtr, vertical)

  /** SplitContainer.is_vertical */
  final def isVertical(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SplitContainer", "is_vertical", 36873697L), hostObject.objectPtr)

  /** SplitContainer.set_dragging_enabled */
  final def setDraggingEnabled(dragging_enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SplitContainer", "set_dragging_enabled", 2586408642L), hostObject.objectPtr, dragging_enabled)

  /** SplitContainer.is_dragging_enabled */
  final def isDraggingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SplitContainer", "is_dragging_enabled", 36873697L), hostObject.objectPtr)

  /** SplitContainer.set_drag_area_margin_begin */
  final def setDragAreaMarginBegin(margin: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SplitContainer", "set_drag_area_margin_begin", 1286410249L), hostObject.objectPtr, margin)

  /** SplitContainer.get_drag_area_margin_begin */
  final def getDragAreaMarginBegin(): Long =
    Ptrcall.call0[Long](MethodBind.get("SplitContainer", "get_drag_area_margin_begin", 3905245786L), hostObject.objectPtr)

  /** SplitContainer.set_drag_area_margin_end */
  final def setDragAreaMarginEnd(margin: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SplitContainer", "set_drag_area_margin_end", 1286410249L), hostObject.objectPtr, margin)

  /** SplitContainer.get_drag_area_margin_end */
  final def getDragAreaMarginEnd(): Long =
    Ptrcall.call0[Long](MethodBind.get("SplitContainer", "get_drag_area_margin_end", 3905245786L), hostObject.objectPtr)

  /** SplitContainer.set_drag_area_offset */
  final def setDragAreaOffset(offset: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SplitContainer", "set_drag_area_offset", 1286410249L), hostObject.objectPtr, offset)

  /** SplitContainer.get_drag_area_offset */
  final def getDragAreaOffset(): Long =
    Ptrcall.call0[Long](MethodBind.get("SplitContainer", "get_drag_area_offset", 3905245786L), hostObject.objectPtr)

  /** SplitContainer.set_drag_area_highlight_in_editor */
  final def setDragAreaHighlightInEditor(drag_area_highlight_in_editor: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SplitContainer", "set_drag_area_highlight_in_editor", 2586408642L), hostObject.objectPtr, drag_area_highlight_in_editor)

  /** SplitContainer.is_drag_area_highlight_in_editor_enabled */
  final def isDragAreaHighlightInEditorEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SplitContainer", "is_drag_area_highlight_in_editor_enabled", 36873697L), hostObject.objectPtr)

  /** SplitContainer.set_touch_dragger_enabled */
  final def setTouchDraggerEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SplitContainer", "set_touch_dragger_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** SplitContainer.is_touch_dragger_enabled */
  final def isTouchDraggerEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SplitContainer", "is_touch_dragger_enabled", 36873697L), hostObject.objectPtr)

  /** SplitContainer.get_drag_area_control */
  final def getDragAreaControl(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SplitContainer", "get_drag_area_control", 829782337L), hostObject.objectPtr)

  /** SplitContainer.set_split_offset */
  final def setSplitOffset(offset: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SplitContainer", "set_split_offset", 1286410249L), hostObject.objectPtr, offset)

  /** SplitContainer.get_split_offset */
  final def getSplitOffset(): Long =
    Ptrcall.call0[Long](MethodBind.get("SplitContainer", "get_split_offset", 3905245786L), hostObject.objectPtr)

}

object SplitContainer {
  /** Class metadata for Gd[SplitContainer] lifetime management and casting. */
  given GodotClass[SplitContainer] with {
    def className = "SplitContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): SplitContainer = new SplitContainer {}.withHost(o.objectPtr)
    def unwrap(t: SplitContainer): GodotObject = t.hostObject
  }
}
