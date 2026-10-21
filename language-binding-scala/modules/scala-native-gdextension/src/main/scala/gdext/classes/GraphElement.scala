package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GraphElement`, extends `Container`. */
abstract class GraphElement extends Container {
  override def godotClassName: String = "GraphElement"

  /** GraphElement.set_resizable */
  final def setResizable(resizable: Boolean): Unit = {
    if (gdext.classes.GraphElement.mb_set_resizable == null) gdext.classes.GraphElement.mb_set_resizable = MethodBind.get("GraphElement", "set_resizable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphElement.mb_set_resizable, livePtr, resizable)
  }

  /** GraphElement.is_resizable */
  final def isResizable(): Boolean = {
    if (gdext.classes.GraphElement.mb_is_resizable == null) gdext.classes.GraphElement.mb_is_resizable = MethodBind.get("GraphElement", "is_resizable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphElement.mb_is_resizable, livePtr)
  }

  /** GraphElement.set_draggable */
  final def setDraggable(draggable: Boolean): Unit = {
    if (gdext.classes.GraphElement.mb_set_draggable == null) gdext.classes.GraphElement.mb_set_draggable = MethodBind.get("GraphElement", "set_draggable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphElement.mb_set_draggable, livePtr, draggable)
  }

  /** GraphElement.is_draggable */
  final def isDraggable(): Boolean = {
    if (gdext.classes.GraphElement.mb_is_draggable == null) gdext.classes.GraphElement.mb_is_draggable = MethodBind.get("GraphElement", "is_draggable", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.GraphElement.mb_is_draggable, livePtr)
  }

  /** GraphElement.set_selectable */
  final def setSelectable(selectable: Boolean): Unit = {
    if (gdext.classes.GraphElement.mb_set_selectable == null) gdext.classes.GraphElement.mb_set_selectable = MethodBind.get("GraphElement", "set_selectable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphElement.mb_set_selectable, livePtr, selectable)
  }

  /** GraphElement.is_selectable */
  final def isSelectable(): Boolean = {
    if (gdext.classes.GraphElement.mb_is_selectable == null) gdext.classes.GraphElement.mb_is_selectable = MethodBind.get("GraphElement", "is_selectable", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.GraphElement.mb_is_selectable, livePtr)
  }

  /** GraphElement.set_selected */
  final def setSelected(selected: Boolean): Unit = {
    if (gdext.classes.GraphElement.mb_set_selected == null) gdext.classes.GraphElement.mb_set_selected = MethodBind.get("GraphElement", "set_selected", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphElement.mb_set_selected, livePtr, selected)
  }

  /** GraphElement.is_selected */
  final def isSelected(): Boolean = {
    if (gdext.classes.GraphElement.mb_is_selected == null) gdext.classes.GraphElement.mb_is_selected = MethodBind.get("GraphElement", "is_selected", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.GraphElement.mb_is_selected, livePtr)
  }

  /** GraphElement.set_scaling_menus */
  final def setScalingMenus(scaling_menus: Boolean): Unit = {
    if (gdext.classes.GraphElement.mb_set_scaling_menus == null) gdext.classes.GraphElement.mb_set_scaling_menus = MethodBind.get("GraphElement", "set_scaling_menus", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphElement.mb_set_scaling_menus, livePtr, scaling_menus)
  }

  /** GraphElement.is_scaling_menus */
  final def isScalingMenus(): Boolean = {
    if (gdext.classes.GraphElement.mb_is_scaling_menus == null) gdext.classes.GraphElement.mb_is_scaling_menus = MethodBind.get("GraphElement", "is_scaling_menus", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphElement.mb_is_scaling_menus, livePtr)
  }

  /** GraphElement.set_position_offset */
  final def setPositionOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.GraphElement.mb_set_position_offset == null) gdext.classes.GraphElement.mb_set_position_offset = MethodBind.get("GraphElement", "set_position_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.GraphElement.mb_set_position_offset, livePtr, offset)
  }

  /** GraphElement.get_position_offset */
  final def getPositionOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.GraphElement.mb_get_position_offset == null) gdext.classes.GraphElement.mb_get_position_offset = MethodBind.get("GraphElement", "get_position_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.GraphElement.mb_get_position_offset, livePtr)
  }

}

object GraphElement {
  private[classes] var mb_set_resizable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_resizable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draggable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_draggable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selectable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_selectable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selected: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_selected: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scaling_menus: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scaling_menus: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position_offset: GDExtensionMethodBindPtr = null
}
