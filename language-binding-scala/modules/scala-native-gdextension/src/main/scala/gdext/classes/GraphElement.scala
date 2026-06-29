package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GraphElement`, extends `Container`. */
abstract class GraphElement extends Container {
  override def godotClassName: String = "GraphElement"

  /** GraphElement.set_resizable */
  final def setResizable(resizable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphElement", "set_resizable", 2586408642L), hostObject.objectPtr, resizable)

  /** GraphElement.is_resizable */
  final def isResizable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphElement", "is_resizable", 36873697L), hostObject.objectPtr)

  /** GraphElement.set_draggable */
  final def setDraggable(draggable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphElement", "set_draggable", 2586408642L), hostObject.objectPtr, draggable)

  /** GraphElement.is_draggable */
  final def isDraggable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphElement", "is_draggable", 2240911060L), hostObject.objectPtr)

  /** GraphElement.set_selectable */
  final def setSelectable(selectable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphElement", "set_selectable", 2586408642L), hostObject.objectPtr, selectable)

  /** GraphElement.is_selectable */
  final def isSelectable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphElement", "is_selectable", 2240911060L), hostObject.objectPtr)

  /** GraphElement.set_selected */
  final def setSelected(selected: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphElement", "set_selected", 2586408642L), hostObject.objectPtr, selected)

  /** GraphElement.is_selected */
  final def isSelected(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphElement", "is_selected", 2240911060L), hostObject.objectPtr)

  /** GraphElement.set_scaling_menus */
  final def setScalingMenus(scaling_menus: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphElement", "set_scaling_menus", 2586408642L), hostObject.objectPtr, scaling_menus)

  /** GraphElement.is_scaling_menus */
  final def isScalingMenus(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphElement", "is_scaling_menus", 36873697L), hostObject.objectPtr)

  /** GraphElement.set_position_offset */
  final def setPositionOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphElement", "set_position_offset", 743155724L), hostObject.objectPtr, offset)

  /** GraphElement.get_position_offset */
  final def getPositionOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("GraphElement", "get_position_offset", 3341600327L), hostObject.objectPtr)

}
