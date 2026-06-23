package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PopupMenu`, extends `Popup`. */
abstract class PopupMenu extends Popup {

  /** PopupMenu.activate_item_by_event */
  final def activateItemByEvent(event: InputEvent, for_global_only: Boolean): Boolean =
    Ptrcall.call2[GodotObject, Boolean, Boolean](MethodBind.get("PopupMenu", "activate_item_by_event", 3716412023L), hostObject.objectPtr, event.hostObject, for_global_only)

  /** PopupMenu.set_prefer_native_menu */
  final def setPreferNativeMenu(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "set_prefer_native_menu", 2586408642L), hostObject.objectPtr, enabled)

  /** PopupMenu.is_prefer_native_menu */
  final def isPreferNativeMenu(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PopupMenu", "is_prefer_native_menu", 36873697L), hostObject.objectPtr)

  /** PopupMenu.is_native_menu */
  final def isNativeMenu(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PopupMenu", "is_native_menu", 36873697L), hostObject.objectPtr)

  /** PopupMenu.add_item */
  final def addItem(label: String, id: Long, accel: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("PopupMenu", "add_item", 3674230041L), hostObject.objectPtr, label, id, accel)

  /** PopupMenu.add_icon_item */
  final def addIconItem(texture: Texture2D, label: String, id: Long, accel: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("PopupMenu", "add_icon_item", 1086190128L), hostObject.objectPtr, texture.hostObject, label, id, accel)

  /** PopupMenu.add_check_item */
  final def addCheckItem(label: String, id: Long, accel: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("PopupMenu", "add_check_item", 3674230041L), hostObject.objectPtr, label, id, accel)

  /** PopupMenu.add_icon_check_item */
  final def addIconCheckItem(texture: Texture2D, label: String, id: Long, accel: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("PopupMenu", "add_icon_check_item", 1086190128L), hostObject.objectPtr, texture.hostObject, label, id, accel)

  /** PopupMenu.add_radio_check_item */
  final def addRadioCheckItem(label: String, id: Long, accel: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("PopupMenu", "add_radio_check_item", 3674230041L), hostObject.objectPtr, label, id, accel)

  /** PopupMenu.add_icon_radio_check_item */
  final def addIconRadioCheckItem(texture: Texture2D, label: String, id: Long, accel: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("PopupMenu", "add_icon_radio_check_item", 1086190128L), hostObject.objectPtr, texture.hostObject, label, id, accel)

  /** PopupMenu.add_multistate_item */
  final def addMultistateItem(label: String, max_states: Long, default_state: Long, id: Long, accel: Long): Unit =
    Ptrcall.callVoid5(MethodBind.get("PopupMenu", "add_multistate_item", 150780458L), hostObject.objectPtr, label, max_states, default_state, id, accel)

  /** PopupMenu.add_shortcut */
  final def addShortcut(shortcut: Shortcut, id: Long, global: Boolean, allow_echo: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("PopupMenu", "add_shortcut", 3451850107L), hostObject.objectPtr, shortcut.hostObject, id, global, allow_echo)

  /** PopupMenu.add_icon_shortcut */
  final def addIconShortcut(texture: Texture2D, shortcut: Shortcut, id: Long, global: Boolean, allow_echo: Boolean): Unit =
    Ptrcall.callVoid5(MethodBind.get("PopupMenu", "add_icon_shortcut", 2997871092L), hostObject.objectPtr, texture.hostObject, shortcut.hostObject, id, global, allow_echo)

  /** PopupMenu.add_check_shortcut */
  final def addCheckShortcut(shortcut: Shortcut, id: Long, global: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("PopupMenu", "add_check_shortcut", 1642193386L), hostObject.objectPtr, shortcut.hostObject, id, global)

  /** PopupMenu.add_icon_check_shortcut */
  final def addIconCheckShortcut(texture: Texture2D, shortcut: Shortcut, id: Long, global: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("PopupMenu", "add_icon_check_shortcut", 3856247530L), hostObject.objectPtr, texture.hostObject, shortcut.hostObject, id, global)

  /** PopupMenu.add_radio_check_shortcut */
  final def addRadioCheckShortcut(shortcut: Shortcut, id: Long, global: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("PopupMenu", "add_radio_check_shortcut", 1642193386L), hostObject.objectPtr, shortcut.hostObject, id, global)

  /** PopupMenu.add_icon_radio_check_shortcut */
  final def addIconRadioCheckShortcut(texture: Texture2D, shortcut: Shortcut, id: Long, global: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("PopupMenu", "add_icon_radio_check_shortcut", 3856247530L), hostObject.objectPtr, texture.hostObject, shortcut.hostObject, id, global)

  /** PopupMenu.add_submenu_item */
  final def addSubmenuItem(label: String, submenu: String, id: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("PopupMenu", "add_submenu_item", 2979222410L), hostObject.objectPtr, label, submenu, id)

  /** PopupMenu.add_submenu_node_item */
  final def addSubmenuNodeItem(label: String, submenu: PopupMenu, id: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("PopupMenu", "add_submenu_node_item", 1325455216L), hostObject.objectPtr, label, submenu.hostObject, id)

  /** PopupMenu.set_item_text */
  final def setItemText(index: Long, text: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_text", 501894301L), hostObject.objectPtr, index, text)

  /** PopupMenu.set_item_text_direction */
  final def setItemTextDirection(index: Long, direction: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_text_direction", 1707680378L), hostObject.objectPtr, index, direction)

  /** PopupMenu.set_item_language */
  final def setItemLanguage(index: Long, language: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_language", 501894301L), hostObject.objectPtr, index, language)

  /** PopupMenu.set_item_auto_translate_mode */
  final def setItemAutoTranslateMode(index: Long, mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_auto_translate_mode", 287402019L), hostObject.objectPtr, index, mode)

  /** PopupMenu.set_item_icon */
  final def setItemIcon(index: Long, icon: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_icon", 666127730L), hostObject.objectPtr, index, icon.hostObject)

  /** PopupMenu.set_item_icon_max_width */
  final def setItemIconMaxWidth(index: Long, width: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_icon_max_width", 3937882851L), hostObject.objectPtr, index, width)

  /** PopupMenu.set_item_icon_modulate */
  final def setItemIconModulate(index: Long, modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_icon_modulate", 2878471219L), hostObject.objectPtr, index, modulate)

  /** PopupMenu.set_item_checked */
  final def setItemChecked(index: Long, checked: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_checked", 300928843L), hostObject.objectPtr, index, checked)

  /** PopupMenu.set_item_id */
  final def setItemId(index: Long, id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_id", 3937882851L), hostObject.objectPtr, index, id)

  /** PopupMenu.set_item_accelerator */
  final def setItemAccelerator(index: Long, accel: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_accelerator", 2992817551L), hostObject.objectPtr, index, accel)

  /** PopupMenu.set_item_disabled */
  final def setItemDisabled(index: Long, disabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_disabled", 300928843L), hostObject.objectPtr, index, disabled)

  /** PopupMenu.set_item_submenu */
  final def setItemSubmenu(index: Long, submenu: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_submenu", 501894301L), hostObject.objectPtr, index, submenu)

  /** PopupMenu.set_item_submenu_node */
  final def setItemSubmenuNode(index: Long, submenu: PopupMenu): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_submenu_node", 1068370740L), hostObject.objectPtr, index, submenu.hostObject)

  /** PopupMenu.set_item_as_separator */
  final def setItemAsSeparator(index: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_as_separator", 300928843L), hostObject.objectPtr, index, enable)

  /** PopupMenu.set_item_as_checkable */
  final def setItemAsCheckable(index: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_as_checkable", 300928843L), hostObject.objectPtr, index, enable)

  /** PopupMenu.set_item_as_radio_checkable */
  final def setItemAsRadioCheckable(index: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_as_radio_checkable", 300928843L), hostObject.objectPtr, index, enable)

  /** PopupMenu.set_item_tooltip */
  final def setItemTooltip(index: Long, tooltip: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_tooltip", 501894301L), hostObject.objectPtr, index, tooltip)

  /** PopupMenu.set_item_shortcut */
  final def setItemShortcut(index: Long, shortcut: Shortcut, global: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("PopupMenu", "set_item_shortcut", 825127832L), hostObject.objectPtr, index, shortcut.hostObject, global)

  /** PopupMenu.set_item_indent */
  final def setItemIndent(index: Long, indent: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_indent", 3937882851L), hostObject.objectPtr, index, indent)

  /** PopupMenu.set_item_multistate */
  final def setItemMultistate(index: Long, state: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_multistate", 3937882851L), hostObject.objectPtr, index, state)

  /** PopupMenu.set_item_multistate_max */
  final def setItemMultistateMax(index: Long, max_states: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_multistate_max", 3937882851L), hostObject.objectPtr, index, max_states)

  /** PopupMenu.set_item_shortcut_disabled */
  final def setItemShortcutDisabled(index: Long, disabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "set_item_shortcut_disabled", 300928843L), hostObject.objectPtr, index, disabled)

  /** PopupMenu.toggle_item_checked */
  final def toggleItemChecked(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "toggle_item_checked", 1286410249L), hostObject.objectPtr, index)

  /** PopupMenu.toggle_item_multistate */
  final def toggleItemMultistate(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "toggle_item_multistate", 1286410249L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_text */
  final def getItemText(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("PopupMenu", "get_item_text", 844755477L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_text_direction */
  final def getItemTextDirection(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PopupMenu", "get_item_text_direction", 4235602388L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_language */
  final def getItemLanguage(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("PopupMenu", "get_item_language", 844755477L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_auto_translate_mode */
  final def getItemAutoTranslateMode(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PopupMenu", "get_item_auto_translate_mode", 906302372L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_icon */
  final def getItemIcon(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("PopupMenu", "get_item_icon", 3536238170L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_icon_max_width */
  final def getItemIconMaxWidth(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PopupMenu", "get_item_icon_max_width", 923996154L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_icon_modulate */
  final def getItemIconModulate(index: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("PopupMenu", "get_item_icon_modulate", 3457211756L), hostObject.objectPtr, index)

  /** PopupMenu.is_item_checked */
  final def isItemChecked(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("PopupMenu", "is_item_checked", 1116898809L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_id */
  final def getItemId(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PopupMenu", "get_item_id", 923996154L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_index */
  final def getItemIndex(id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PopupMenu", "get_item_index", 923996154L), hostObject.objectPtr, id)

  /** PopupMenu.get_item_accelerator */
  final def getItemAccelerator(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PopupMenu", "get_item_accelerator", 253789942L), hostObject.objectPtr, index)

  /** PopupMenu.is_item_disabled */
  final def isItemDisabled(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("PopupMenu", "is_item_disabled", 1116898809L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_submenu */
  final def getItemSubmenu(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("PopupMenu", "get_item_submenu", 844755477L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_submenu_node */
  final def getItemSubmenuNode(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("PopupMenu", "get_item_submenu_node", 2100501353L), hostObject.objectPtr, index)

  /** PopupMenu.is_item_separator */
  final def isItemSeparator(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("PopupMenu", "is_item_separator", 1116898809L), hostObject.objectPtr, index)

  /** PopupMenu.is_item_checkable */
  final def isItemCheckable(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("PopupMenu", "is_item_checkable", 1116898809L), hostObject.objectPtr, index)

  /** PopupMenu.is_item_radio_checkable */
  final def isItemRadioCheckable(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("PopupMenu", "is_item_radio_checkable", 1116898809L), hostObject.objectPtr, index)

  /** PopupMenu.is_item_shortcut_disabled */
  final def isItemShortcutDisabled(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("PopupMenu", "is_item_shortcut_disabled", 1116898809L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_tooltip */
  final def getItemTooltip(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("PopupMenu", "get_item_tooltip", 844755477L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_shortcut */
  final def getItemShortcut(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("PopupMenu", "get_item_shortcut", 1449483325L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_indent */
  final def getItemIndent(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PopupMenu", "get_item_indent", 923996154L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_multistate_max */
  final def getItemMultistateMax(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PopupMenu", "get_item_multistate_max", 923996154L), hostObject.objectPtr, index)

  /** PopupMenu.get_item_multistate */
  final def getItemMultistate(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("PopupMenu", "get_item_multistate", 923996154L), hostObject.objectPtr, index)

  /** PopupMenu.set_focused_item */
  final def setFocusedItem(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "set_focused_item", 1286410249L), hostObject.objectPtr, index)

  /** PopupMenu.get_focused_item */
  final def getFocusedItem(): Long =
    Ptrcall.call0[Long](MethodBind.get("PopupMenu", "get_focused_item", 3905245786L), hostObject.objectPtr)

  /** PopupMenu.set_item_count */
  final def setItemCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "set_item_count", 1286410249L), hostObject.objectPtr, count)

  /** PopupMenu.get_item_count */
  final def getItemCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("PopupMenu", "get_item_count", 3905245786L), hostObject.objectPtr)

  /** PopupMenu.scroll_to_item */
  final def scrollToItem(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "scroll_to_item", 1286410249L), hostObject.objectPtr, index)

  /** PopupMenu.remove_item */
  final def removeItem(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "remove_item", 1286410249L), hostObject.objectPtr, index)

  /** PopupMenu.add_separator */
  final def addSeparator(label: String, id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("PopupMenu", "add_separator", 2266703459L), hostObject.objectPtr, label, id)

  /** PopupMenu.clear */
  final def clear(free_submenus: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "clear", 107499316L), hostObject.objectPtr, free_submenus)

  /** PopupMenu.set_hide_on_item_selection */
  final def setHideOnItemSelection(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "set_hide_on_item_selection", 2586408642L), hostObject.objectPtr, enable)

  /** PopupMenu.is_hide_on_item_selection */
  final def isHideOnItemSelection(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PopupMenu", "is_hide_on_item_selection", 36873697L), hostObject.objectPtr)

  /** PopupMenu.set_hide_on_checkable_item_selection */
  final def setHideOnCheckableItemSelection(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "set_hide_on_checkable_item_selection", 2586408642L), hostObject.objectPtr, enable)

  /** PopupMenu.is_hide_on_checkable_item_selection */
  final def isHideOnCheckableItemSelection(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PopupMenu", "is_hide_on_checkable_item_selection", 36873697L), hostObject.objectPtr)

  /** PopupMenu.set_hide_on_state_item_selection */
  final def setHideOnStateItemSelection(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "set_hide_on_state_item_selection", 2586408642L), hostObject.objectPtr, enable)

  /** PopupMenu.is_hide_on_state_item_selection */
  final def isHideOnStateItemSelection(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PopupMenu", "is_hide_on_state_item_selection", 36873697L), hostObject.objectPtr)

  /** PopupMenu.set_submenu_popup_delay */
  final def setSubmenuPopupDelay(seconds: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "set_submenu_popup_delay", 373806689L), hostObject.objectPtr, seconds)

  /** PopupMenu.get_submenu_popup_delay */
  final def getSubmenuPopupDelay(): Double =
    Ptrcall.call0[Double](MethodBind.get("PopupMenu", "get_submenu_popup_delay", 1740695150L), hostObject.objectPtr)

  /** PopupMenu.set_allow_search */
  final def setAllowSearch(allow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "set_allow_search", 2586408642L), hostObject.objectPtr, allow)

  /** PopupMenu.get_allow_search */
  final def getAllowSearch(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PopupMenu", "get_allow_search", 36873697L), hostObject.objectPtr)

  /** PopupMenu.is_system_menu */
  final def isSystemMenu(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PopupMenu", "is_system_menu", 36873697L), hostObject.objectPtr)

  /** PopupMenu.set_system_menu */
  final def setSystemMenu(system_menu_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "set_system_menu", 600639674L), hostObject.objectPtr, system_menu_id)

  /** PopupMenu.get_system_menu */
  final def getSystemMenu(): Long =
    Ptrcall.call0[Long](MethodBind.get("PopupMenu", "get_system_menu", 1222557358L), hostObject.objectPtr)

  /** PopupMenu.set_shrink_height */
  final def setShrinkHeight(shrink: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "set_shrink_height", 2586408642L), hostObject.objectPtr, shrink)

  /** PopupMenu.get_shrink_height */
  final def getShrinkHeight(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PopupMenu", "get_shrink_height", 36873697L), hostObject.objectPtr)

  /** PopupMenu.set_shrink_width */
  final def setShrinkWidth(shrink: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PopupMenu", "set_shrink_width", 2586408642L), hostObject.objectPtr, shrink)

  /** PopupMenu.get_shrink_width */
  final def getShrinkWidth(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PopupMenu", "get_shrink_width", 36873697L), hostObject.objectPtr)

}

object PopupMenu {
  /** Class metadata for Gd[PopupMenu] lifetime management and casting. */
  given GodotClass[PopupMenu] with {
    def className = "PopupMenu"
    def isRefCounted = false
    def wrap(o: GodotObject): PopupMenu = new PopupMenu {}.withHost(o.objectPtr)
    def unwrap(t: PopupMenu): GodotObject = t.hostObject
  }
}
