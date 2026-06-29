package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `MenuBar`, extends `Control`. */
abstract class MenuBar extends Control {
  override def godotClassName: String = "MenuBar"

  /** MenuBar.set_switch_on_hover */
  final def setSwitchOnHover(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MenuBar", "set_switch_on_hover", 2586408642L), hostObject.objectPtr, enable)

  /** MenuBar.is_switch_on_hover */
  final def isSwitchOnHover(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MenuBar", "is_switch_on_hover", 2240911060L), hostObject.objectPtr)

  /** MenuBar.set_disable_shortcuts */
  final def setDisableShortcuts(disabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MenuBar", "set_disable_shortcuts", 2586408642L), hostObject.objectPtr, disabled)

  /** MenuBar.set_prefer_global_menu */
  final def setPreferGlobalMenu(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MenuBar", "set_prefer_global_menu", 2586408642L), hostObject.objectPtr, enabled)

  /** MenuBar.is_prefer_global_menu */
  final def isPreferGlobalMenu(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MenuBar", "is_prefer_global_menu", 36873697L), hostObject.objectPtr)

  /** MenuBar.is_native_menu */
  final def isNativeMenu(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MenuBar", "is_native_menu", 36873697L), hostObject.objectPtr)

  /** MenuBar.get_menu_count */
  final def getMenuCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("MenuBar", "get_menu_count", 3905245786L), hostObject.objectPtr)

  /** MenuBar.set_text_direction */
  final def setTextDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MenuBar", "set_text_direction", 119160795L), hostObject.objectPtr, direction)

  /** MenuBar.get_text_direction */
  final def getTextDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("MenuBar", "get_text_direction", 797257663L), hostObject.objectPtr)

  /** MenuBar.set_language */
  final def setLanguage(language: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("MenuBar", "set_language", 83702148L), hostObject.objectPtr, language)

  /** MenuBar.get_language */
  final def getLanguage(): String =
    Ptrcall.call0[String](MethodBind.get("MenuBar", "get_language", 201670096L), hostObject.objectPtr)

  /** MenuBar.set_flat */
  final def setFlat(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MenuBar", "set_flat", 2586408642L), hostObject.objectPtr, enabled)

  /** MenuBar.is_flat */
  final def isFlat(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MenuBar", "is_flat", 36873697L), hostObject.objectPtr)

  /** MenuBar.set_start_index */
  final def setStartIndex(enabled: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MenuBar", "set_start_index", 1286410249L), hostObject.objectPtr, enabled)

  /** MenuBar.get_start_index */
  final def getStartIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("MenuBar", "get_start_index", 3905245786L), hostObject.objectPtr)

  /** MenuBar.set_menu_title */
  final def setMenuTitle(menu: Long, title: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("MenuBar", "set_menu_title", 501894301L), hostObject.objectPtr, menu, title)

  /** MenuBar.get_menu_title */
  final def getMenuTitle(menu: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("MenuBar", "get_menu_title", 844755477L), hostObject.objectPtr, menu)

  /** MenuBar.set_menu_tooltip */
  final def setMenuTooltip(menu: Long, tooltip: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("MenuBar", "set_menu_tooltip", 501894301L), hostObject.objectPtr, menu, tooltip)

  /** MenuBar.get_menu_tooltip */
  final def getMenuTooltip(menu: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("MenuBar", "get_menu_tooltip", 844755477L), hostObject.objectPtr, menu)

  /** MenuBar.set_menu_disabled */
  final def setMenuDisabled(menu: Long, disabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("MenuBar", "set_menu_disabled", 300928843L), hostObject.objectPtr, menu, disabled)

  /** MenuBar.is_menu_disabled */
  final def isMenuDisabled(menu: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("MenuBar", "is_menu_disabled", 1116898809L), hostObject.objectPtr, menu)

  /** MenuBar.set_menu_hidden */
  final def setMenuHidden(menu: Long, hidden: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("MenuBar", "set_menu_hidden", 300928843L), hostObject.objectPtr, menu, hidden)

  /** MenuBar.is_menu_hidden */
  final def isMenuHidden(menu: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("MenuBar", "is_menu_hidden", 1116898809L), hostObject.objectPtr, menu)

  /** MenuBar.get_menu_popup */
  final def getMenuPopup(menu: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("MenuBar", "get_menu_popup", 2100501353L), hostObject.objectPtr, menu)

}
