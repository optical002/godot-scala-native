package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MenuBar`, extends `Control`. */
abstract class MenuBar extends Control {
  override def godotClassName: String = "MenuBar"

  /** MenuBar.set_switch_on_hover */
  final def setSwitchOnHover(enable: Boolean): Unit = {
    if (gdext.classes.MenuBar.mb_set_switch_on_hover == null) gdext.classes.MenuBar.mb_set_switch_on_hover = MethodBind.get("MenuBar", "set_switch_on_hover", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MenuBar.mb_set_switch_on_hover, livePtr, enable)
  }

  /** MenuBar.is_switch_on_hover */
  final def isSwitchOnHover(): Boolean = {
    if (gdext.classes.MenuBar.mb_is_switch_on_hover == null) gdext.classes.MenuBar.mb_is_switch_on_hover = MethodBind.get("MenuBar", "is_switch_on_hover", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.MenuBar.mb_is_switch_on_hover, livePtr)
  }

  /** MenuBar.set_disable_shortcuts */
  final def setDisableShortcuts(disabled: Boolean): Unit = {
    if (gdext.classes.MenuBar.mb_set_disable_shortcuts == null) gdext.classes.MenuBar.mb_set_disable_shortcuts = MethodBind.get("MenuBar", "set_disable_shortcuts", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MenuBar.mb_set_disable_shortcuts, livePtr, disabled)
  }

  /** MenuBar.set_prefer_global_menu */
  final def setPreferGlobalMenu(enabled: Boolean): Unit = {
    if (gdext.classes.MenuBar.mb_set_prefer_global_menu == null) gdext.classes.MenuBar.mb_set_prefer_global_menu = MethodBind.get("MenuBar", "set_prefer_global_menu", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MenuBar.mb_set_prefer_global_menu, livePtr, enabled)
  }

  /** MenuBar.is_prefer_global_menu */
  final def isPreferGlobalMenu(): Boolean = {
    if (gdext.classes.MenuBar.mb_is_prefer_global_menu == null) gdext.classes.MenuBar.mb_is_prefer_global_menu = MethodBind.get("MenuBar", "is_prefer_global_menu", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MenuBar.mb_is_prefer_global_menu, livePtr)
  }

  /** MenuBar.is_native_menu */
  final def isNativeMenu(): Boolean = {
    if (gdext.classes.MenuBar.mb_is_native_menu == null) gdext.classes.MenuBar.mb_is_native_menu = MethodBind.get("MenuBar", "is_native_menu", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MenuBar.mb_is_native_menu, livePtr)
  }

  /** MenuBar.get_menu_count */
  final def getMenuCount(): Long = {
    if (gdext.classes.MenuBar.mb_get_menu_count == null) gdext.classes.MenuBar.mb_get_menu_count = MethodBind.get("MenuBar", "get_menu_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MenuBar.mb_get_menu_count, livePtr)
  }

  /** MenuBar.set_text_direction */
  final def setTextDirection(direction: Long): Unit = {
    if (gdext.classes.MenuBar.mb_set_text_direction == null) gdext.classes.MenuBar.mb_set_text_direction = MethodBind.get("MenuBar", "set_text_direction", 119160795L)
    Ptrcall.callVoid1(gdext.classes.MenuBar.mb_set_text_direction, livePtr, direction)
  }

  /** MenuBar.get_text_direction */
  final def getTextDirection(): Long = {
    if (gdext.classes.MenuBar.mb_get_text_direction == null) gdext.classes.MenuBar.mb_get_text_direction = MethodBind.get("MenuBar", "get_text_direction", 797257663L)
    Ptrcall.call0[Long](gdext.classes.MenuBar.mb_get_text_direction, livePtr)
  }

  /** MenuBar.set_language */
  final def setLanguage(language: String): Unit = {
    if (gdext.classes.MenuBar.mb_set_language == null) gdext.classes.MenuBar.mb_set_language = MethodBind.get("MenuBar", "set_language", 83702148L)
    Ptrcall.callVoid1(gdext.classes.MenuBar.mb_set_language, livePtr, language)
  }

  /** MenuBar.get_language */
  final def getLanguage(): String = {
    if (gdext.classes.MenuBar.mb_get_language == null) gdext.classes.MenuBar.mb_get_language = MethodBind.get("MenuBar", "get_language", 201670096L)
    Ptrcall.call0[String](gdext.classes.MenuBar.mb_get_language, livePtr)
  }

  /** MenuBar.set_flat */
  final def setFlat(enabled: Boolean): Unit = {
    if (gdext.classes.MenuBar.mb_set_flat == null) gdext.classes.MenuBar.mb_set_flat = MethodBind.get("MenuBar", "set_flat", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MenuBar.mb_set_flat, livePtr, enabled)
  }

  /** MenuBar.is_flat */
  final def isFlat(): Boolean = {
    if (gdext.classes.MenuBar.mb_is_flat == null) gdext.classes.MenuBar.mb_is_flat = MethodBind.get("MenuBar", "is_flat", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MenuBar.mb_is_flat, livePtr)
  }

  /** MenuBar.set_start_index */
  final def setStartIndex(enabled: Long): Unit = {
    if (gdext.classes.MenuBar.mb_set_start_index == null) gdext.classes.MenuBar.mb_set_start_index = MethodBind.get("MenuBar", "set_start_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MenuBar.mb_set_start_index, livePtr, enabled)
  }

  /** MenuBar.get_start_index */
  final def getStartIndex(): Long = {
    if (gdext.classes.MenuBar.mb_get_start_index == null) gdext.classes.MenuBar.mb_get_start_index = MethodBind.get("MenuBar", "get_start_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MenuBar.mb_get_start_index, livePtr)
  }

  /** MenuBar.set_menu_title */
  final def setMenuTitle(menu: Long, title: String): Unit = {
    if (gdext.classes.MenuBar.mb_set_menu_title == null) gdext.classes.MenuBar.mb_set_menu_title = MethodBind.get("MenuBar", "set_menu_title", 501894301L)
    Ptrcall.callVoid2(gdext.classes.MenuBar.mb_set_menu_title, livePtr, menu, title)
  }

  /** MenuBar.get_menu_title */
  final def getMenuTitle(menu: Long): String = {
    if (gdext.classes.MenuBar.mb_get_menu_title == null) gdext.classes.MenuBar.mb_get_menu_title = MethodBind.get("MenuBar", "get_menu_title", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.MenuBar.mb_get_menu_title, livePtr, menu)
  }

  /** MenuBar.set_menu_tooltip */
  final def setMenuTooltip(menu: Long, tooltip: String): Unit = {
    if (gdext.classes.MenuBar.mb_set_menu_tooltip == null) gdext.classes.MenuBar.mb_set_menu_tooltip = MethodBind.get("MenuBar", "set_menu_tooltip", 501894301L)
    Ptrcall.callVoid2(gdext.classes.MenuBar.mb_set_menu_tooltip, livePtr, menu, tooltip)
  }

  /** MenuBar.get_menu_tooltip */
  final def getMenuTooltip(menu: Long): String = {
    if (gdext.classes.MenuBar.mb_get_menu_tooltip == null) gdext.classes.MenuBar.mb_get_menu_tooltip = MethodBind.get("MenuBar", "get_menu_tooltip", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.MenuBar.mb_get_menu_tooltip, livePtr, menu)
  }

  /** MenuBar.set_menu_disabled */
  final def setMenuDisabled(menu: Long, disabled: Boolean): Unit = {
    if (gdext.classes.MenuBar.mb_set_menu_disabled == null) gdext.classes.MenuBar.mb_set_menu_disabled = MethodBind.get("MenuBar", "set_menu_disabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.MenuBar.mb_set_menu_disabled, livePtr, menu, disabled)
  }

  /** MenuBar.is_menu_disabled */
  final def isMenuDisabled(menu: Long): Boolean = {
    if (gdext.classes.MenuBar.mb_is_menu_disabled == null) gdext.classes.MenuBar.mb_is_menu_disabled = MethodBind.get("MenuBar", "is_menu_disabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.MenuBar.mb_is_menu_disabled, livePtr, menu)
  }

  /** MenuBar.set_menu_hidden */
  final def setMenuHidden(menu: Long, hidden: Boolean): Unit = {
    if (gdext.classes.MenuBar.mb_set_menu_hidden == null) gdext.classes.MenuBar.mb_set_menu_hidden = MethodBind.get("MenuBar", "set_menu_hidden", 300928843L)
    Ptrcall.callVoid2(gdext.classes.MenuBar.mb_set_menu_hidden, livePtr, menu, hidden)
  }

  /** MenuBar.is_menu_hidden */
  final def isMenuHidden(menu: Long): Boolean = {
    if (gdext.classes.MenuBar.mb_is_menu_hidden == null) gdext.classes.MenuBar.mb_is_menu_hidden = MethodBind.get("MenuBar", "is_menu_hidden", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.MenuBar.mb_is_menu_hidden, livePtr, menu)
  }

  /** MenuBar.get_menu_popup */
  final def getMenuPopup(menu: Long): PopupMenu = {
    if (gdext.classes.MenuBar.mb_get_menu_popup == null) gdext.classes.MenuBar.mb_get_menu_popup = MethodBind.get("MenuBar", "get_menu_popup", 2100501353L)
    Wrappers.borrowed[PopupMenu](Ptrcall.call1[Long, Long](gdext.classes.MenuBar.mb_get_menu_popup, livePtr, menu))
  }

}

object MenuBar {
  private[classes] var mb_set_switch_on_hover: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_switch_on_hover: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_shortcuts: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_prefer_global_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_prefer_global_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_native_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_menu_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flat: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flat: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_start_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_start_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_menu_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_menu_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_menu_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_menu_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_menu_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_menu_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_menu_hidden: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_menu_hidden: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_menu_popup: GDExtensionMethodBindPtr = null
}
