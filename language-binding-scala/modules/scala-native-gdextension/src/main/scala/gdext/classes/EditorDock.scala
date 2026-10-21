package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorDock`, extends `MarginContainer`. */
abstract class EditorDock extends MarginContainer {
  override def godotClassName: String = "EditorDock"

  /** EditorDock.open */
  final def open(): Unit = {
    if (gdext.classes.EditorDock.mb_open == null) gdext.classes.EditorDock.mb_open = MethodBind.get("EditorDock", "open", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorDock.mb_open, livePtr)
  }

  /** EditorDock.make_visible */
  final def makeVisible(): Unit = {
    if (gdext.classes.EditorDock.mb_make_visible == null) gdext.classes.EditorDock.mb_make_visible = MethodBind.get("EditorDock", "make_visible", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorDock.mb_make_visible, livePtr)
  }

  /** EditorDock.close */
  final def close(): Unit = {
    if (gdext.classes.EditorDock.mb_close == null) gdext.classes.EditorDock.mb_close = MethodBind.get("EditorDock", "close", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorDock.mb_close, livePtr)
  }

  /** EditorDock.set_title */
  final def setTitle(title: String): Unit = {
    if (gdext.classes.EditorDock.mb_set_title == null) gdext.classes.EditorDock.mb_set_title = MethodBind.get("EditorDock", "set_title", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorDock.mb_set_title, livePtr, title)
  }

  /** EditorDock.get_title */
  final def getTitle(): String = {
    if (gdext.classes.EditorDock.mb_get_title == null) gdext.classes.EditorDock.mb_get_title = MethodBind.get("EditorDock", "get_title", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorDock.mb_get_title, livePtr)
  }

  /** EditorDock.set_layout_key */
  final def setLayoutKey(layout_key: String): Unit = {
    if (gdext.classes.EditorDock.mb_set_layout_key == null) gdext.classes.EditorDock.mb_set_layout_key = MethodBind.get("EditorDock", "set_layout_key", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorDock.mb_set_layout_key, livePtr, layout_key)
  }

  /** EditorDock.get_layout_key */
  final def getLayoutKey(): String = {
    if (gdext.classes.EditorDock.mb_get_layout_key == null) gdext.classes.EditorDock.mb_get_layout_key = MethodBind.get("EditorDock", "get_layout_key", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorDock.mb_get_layout_key, livePtr)
  }

  /** EditorDock.set_global */
  final def setGlobal(global: Boolean): Unit = {
    if (gdext.classes.EditorDock.mb_set_global == null) gdext.classes.EditorDock.mb_set_global = MethodBind.get("EditorDock", "set_global", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorDock.mb_set_global, livePtr, global)
  }

  /** EditorDock.is_global */
  final def isGlobal(): Boolean = {
    if (gdext.classes.EditorDock.mb_is_global == null) gdext.classes.EditorDock.mb_is_global = MethodBind.get("EditorDock", "is_global", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorDock.mb_is_global, livePtr)
  }

  /** EditorDock.set_transient */
  final def setTransient(transient: Boolean): Unit = {
    if (gdext.classes.EditorDock.mb_set_transient == null) gdext.classes.EditorDock.mb_set_transient = MethodBind.get("EditorDock", "set_transient", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorDock.mb_set_transient, livePtr, transient)
  }

  /** EditorDock.is_transient */
  final def isTransient(): Boolean = {
    if (gdext.classes.EditorDock.mb_is_transient == null) gdext.classes.EditorDock.mb_is_transient = MethodBind.get("EditorDock", "is_transient", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorDock.mb_is_transient, livePtr)
  }

  /** EditorDock.set_closable */
  final def setClosable(closable: Boolean): Unit = {
    if (gdext.classes.EditorDock.mb_set_closable == null) gdext.classes.EditorDock.mb_set_closable = MethodBind.get("EditorDock", "set_closable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorDock.mb_set_closable, livePtr, closable)
  }

  /** EditorDock.is_closable */
  final def isClosable(): Boolean = {
    if (gdext.classes.EditorDock.mb_is_closable == null) gdext.classes.EditorDock.mb_is_closable = MethodBind.get("EditorDock", "is_closable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorDock.mb_is_closable, livePtr)
  }

  /** EditorDock.set_icon_name */
  final def setIconName(icon_name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.EditorDock.mb_set_icon_name == null) gdext.classes.EditorDock.mb_set_icon_name = MethodBind.get("EditorDock", "set_icon_name", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.EditorDock.mb_set_icon_name, livePtr, icon_name)
  }

  /** EditorDock.get_icon_name */
  final def getIconName(): gdext.builtin.StringName = {
    if (gdext.classes.EditorDock.mb_get_icon_name == null) gdext.classes.EditorDock.mb_get_icon_name = MethodBind.get("EditorDock", "get_icon_name", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.EditorDock.mb_get_icon_name, livePtr)
  }

  /** EditorDock.set_dock_icon */
  final def setDockIcon(icon: Texture2D): Unit = {
    if (gdext.classes.EditorDock.mb_set_dock_icon == null) gdext.classes.EditorDock.mb_set_dock_icon = MethodBind.get("EditorDock", "set_dock_icon", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.EditorDock.mb_set_dock_icon, livePtr, Wrappers.handle(icon))
  }

  /** EditorDock.get_dock_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDockIcon(): Texture2D = {
    if (gdext.classes.EditorDock.mb_get_dock_icon == null) gdext.classes.EditorDock.mb_get_dock_icon = MethodBind.get("EditorDock", "get_dock_icon", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.EditorDock.mb_get_dock_icon, livePtr))
  }

  /** EditorDock.set_force_show_icon */
  final def setForceShowIcon(force: Boolean): Unit = {
    if (gdext.classes.EditorDock.mb_set_force_show_icon == null) gdext.classes.EditorDock.mb_set_force_show_icon = MethodBind.get("EditorDock", "set_force_show_icon", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorDock.mb_set_force_show_icon, livePtr, force)
  }

  /** EditorDock.get_force_show_icon */
  final def getForceShowIcon(): Boolean = {
    if (gdext.classes.EditorDock.mb_get_force_show_icon == null) gdext.classes.EditorDock.mb_get_force_show_icon = MethodBind.get("EditorDock", "get_force_show_icon", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorDock.mb_get_force_show_icon, livePtr)
  }

  /** EditorDock.set_title_color */
  final def setTitleColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.EditorDock.mb_set_title_color == null) gdext.classes.EditorDock.mb_set_title_color = MethodBind.get("EditorDock", "set_title_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.EditorDock.mb_set_title_color, livePtr, color)
  }

  /** EditorDock.get_title_color */
  final def getTitleColor(): gdext.builtin.Color = {
    if (gdext.classes.EditorDock.mb_get_title_color == null) gdext.classes.EditorDock.mb_get_title_color = MethodBind.get("EditorDock", "get_title_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.EditorDock.mb_get_title_color, livePtr)
  }

  /** EditorDock.set_dock_shortcut */
  final def setDockShortcut(shortcut: Shortcut): Unit = {
    if (gdext.classes.EditorDock.mb_set_dock_shortcut == null) gdext.classes.EditorDock.mb_set_dock_shortcut = MethodBind.get("EditorDock", "set_dock_shortcut", 857163497L)
    Ptrcall.callVoid1(gdext.classes.EditorDock.mb_set_dock_shortcut, livePtr, Wrappers.handle(shortcut))
  }

  /** EditorDock.get_dock_shortcut. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDockShortcut(): Shortcut = {
    if (gdext.classes.EditorDock.mb_get_dock_shortcut == null) gdext.classes.EditorDock.mb_get_dock_shortcut = MethodBind.get("EditorDock", "get_dock_shortcut", 3415666916L)
    Wrappers.owned[Shortcut](Ptrcall.call0[Long](gdext.classes.EditorDock.mb_get_dock_shortcut, livePtr))
  }

  /** EditorDock.set_default_slot */
  final def setDefaultSlot(slot: Long): Unit = {
    if (gdext.classes.EditorDock.mb_set_default_slot == null) gdext.classes.EditorDock.mb_set_default_slot = MethodBind.get("EditorDock", "set_default_slot", 4142995464L)
    Ptrcall.callVoid1(gdext.classes.EditorDock.mb_set_default_slot, livePtr, slot)
  }

  /** EditorDock.get_default_slot */
  final def getDefaultSlot(): Long = {
    if (gdext.classes.EditorDock.mb_get_default_slot == null) gdext.classes.EditorDock.mb_get_default_slot = MethodBind.get("EditorDock", "get_default_slot", 3298961740L)
    Ptrcall.call0[Long](gdext.classes.EditorDock.mb_get_default_slot, livePtr)
  }

  /** EditorDock.set_available_layouts */
  final def setAvailableLayouts(layouts: Long): Unit = {
    if (gdext.classes.EditorDock.mb_set_available_layouts == null) gdext.classes.EditorDock.mb_set_available_layouts = MethodBind.get("EditorDock", "set_available_layouts", 3440531249L)
    Ptrcall.callVoid1(gdext.classes.EditorDock.mb_set_available_layouts, livePtr, layouts)
  }

  /** EditorDock.get_available_layouts */
  final def getAvailableLayouts(): Long = {
    if (gdext.classes.EditorDock.mb_get_available_layouts == null) gdext.classes.EditorDock.mb_get_available_layouts = MethodBind.get("EditorDock", "get_available_layouts", 495015512L)
    Ptrcall.call0[Long](gdext.classes.EditorDock.mb_get_available_layouts, livePtr)
  }

}

object EditorDock {
  private[classes] var mb_open: GDExtensionMethodBindPtr = null
  private[classes] var mb_make_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_close: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layout_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layout_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_global: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transient: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_transient: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_closable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_closable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_icon_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_icon_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dock_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dock_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_force_show_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_force_show_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_title_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_title_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dock_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dock_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_slot: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_slot: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_available_layouts: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_available_layouts: GDExtensionMethodBindPtr = null
}
