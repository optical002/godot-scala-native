package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GraphFrame`, extends `GraphElement`. */
abstract class GraphFrame extends GraphElement {
  override def godotClassName: String = "GraphFrame"

  /** GraphFrame.set_title */
  final def setTitle(title: String): Unit = {
    if (gdext.classes.GraphFrame.mb_set_title == null) gdext.classes.GraphFrame.mb_set_title = MethodBind.get("GraphFrame", "set_title", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GraphFrame.mb_set_title, livePtr, title)
  }

  /** GraphFrame.get_title */
  final def getTitle(): String = {
    if (gdext.classes.GraphFrame.mb_get_title == null) gdext.classes.GraphFrame.mb_get_title = MethodBind.get("GraphFrame", "get_title", 201670096L)
    Ptrcall.call0[String](gdext.classes.GraphFrame.mb_get_title, livePtr)
  }

  /** GraphFrame.get_titlebar_hbox */
  final def getTitlebarHbox(): HBoxContainer = {
    if (gdext.classes.GraphFrame.mb_get_titlebar_hbox == null) gdext.classes.GraphFrame.mb_get_titlebar_hbox = MethodBind.get("GraphFrame", "get_titlebar_hbox", 3590609951L)
    Wrappers.borrowed[HBoxContainer](Ptrcall.call0[Long](gdext.classes.GraphFrame.mb_get_titlebar_hbox, livePtr))
  }

  /** GraphFrame.set_autoshrink_enabled */
  final def setAutoshrinkEnabled(shrink: Boolean): Unit = {
    if (gdext.classes.GraphFrame.mb_set_autoshrink_enabled == null) gdext.classes.GraphFrame.mb_set_autoshrink_enabled = MethodBind.get("GraphFrame", "set_autoshrink_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphFrame.mb_set_autoshrink_enabled, livePtr, shrink)
  }

  /** GraphFrame.is_autoshrink_enabled */
  final def isAutoshrinkEnabled(): Boolean = {
    if (gdext.classes.GraphFrame.mb_is_autoshrink_enabled == null) gdext.classes.GraphFrame.mb_is_autoshrink_enabled = MethodBind.get("GraphFrame", "is_autoshrink_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphFrame.mb_is_autoshrink_enabled, livePtr)
  }

  /** GraphFrame.set_autoshrink_margin */
  final def setAutoshrinkMargin(autoshrinkMargin: Long): Unit = {
    if (gdext.classes.GraphFrame.mb_set_autoshrink_margin == null) gdext.classes.GraphFrame.mb_set_autoshrink_margin = MethodBind.get("GraphFrame", "set_autoshrink_margin", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GraphFrame.mb_set_autoshrink_margin, livePtr, autoshrinkMargin)
  }

  /** GraphFrame.get_autoshrink_margin */
  final def getAutoshrinkMargin(): Long = {
    if (gdext.classes.GraphFrame.mb_get_autoshrink_margin == null) gdext.classes.GraphFrame.mb_get_autoshrink_margin = MethodBind.get("GraphFrame", "get_autoshrink_margin", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GraphFrame.mb_get_autoshrink_margin, livePtr)
  }

  /** GraphFrame.set_drag_margin */
  final def setDragMargin(dragMargin: Long): Unit = {
    if (gdext.classes.GraphFrame.mb_set_drag_margin == null) gdext.classes.GraphFrame.mb_set_drag_margin = MethodBind.get("GraphFrame", "set_drag_margin", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GraphFrame.mb_set_drag_margin, livePtr, dragMargin)
  }

  /** GraphFrame.get_drag_margin */
  final def getDragMargin(): Long = {
    if (gdext.classes.GraphFrame.mb_get_drag_margin == null) gdext.classes.GraphFrame.mb_get_drag_margin = MethodBind.get("GraphFrame", "get_drag_margin", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GraphFrame.mb_get_drag_margin, livePtr)
  }

  /** GraphFrame.set_tint_color_enabled */
  final def setTintColorEnabled(enable: Boolean): Unit = {
    if (gdext.classes.GraphFrame.mb_set_tint_color_enabled == null) gdext.classes.GraphFrame.mb_set_tint_color_enabled = MethodBind.get("GraphFrame", "set_tint_color_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphFrame.mb_set_tint_color_enabled, livePtr, enable)
  }

  /** GraphFrame.is_tint_color_enabled */
  final def isTintColorEnabled(): Boolean = {
    if (gdext.classes.GraphFrame.mb_is_tint_color_enabled == null) gdext.classes.GraphFrame.mb_is_tint_color_enabled = MethodBind.get("GraphFrame", "is_tint_color_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphFrame.mb_is_tint_color_enabled, livePtr)
  }

  /** GraphFrame.set_tint_color */
  final def setTintColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.GraphFrame.mb_set_tint_color == null) gdext.classes.GraphFrame.mb_set_tint_color = MethodBind.get("GraphFrame", "set_tint_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.GraphFrame.mb_set_tint_color, livePtr, color)
  }

  /** GraphFrame.get_tint_color */
  final def getTintColor(): gdext.builtin.Color = {
    if (gdext.classes.GraphFrame.mb_get_tint_color == null) gdext.classes.GraphFrame.mb_get_tint_color = MethodBind.get("GraphFrame", "get_tint_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.GraphFrame.mb_get_tint_color, livePtr)
  }

}

object GraphFrame {
  private[classes] var mb_set_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_titlebar_hbox: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autoshrink_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_autoshrink_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autoshrink_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autoshrink_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tint_color_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_tint_color_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tint_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tint_color: GDExtensionMethodBindPtr = null
}
