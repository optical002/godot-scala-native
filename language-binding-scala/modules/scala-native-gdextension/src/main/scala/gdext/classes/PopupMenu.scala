package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PopupMenu`, extends `Popup`. */
abstract class PopupMenu extends Popup {
  override def godotClassName: String = "PopupMenu"

  /** PopupMenu.activate_item_by_event */
  final def activateItemByEvent(event: InputEvent, forGlobalOnly: Boolean = false): Boolean = {
    if (gdext.classes.PopupMenu.mb_activate_item_by_event == null) gdext.classes.PopupMenu.mb_activate_item_by_event = MethodBind.get("PopupMenu", "activate_item_by_event", 3716412023L)
    Ptrcall.call2[GodotObject, Boolean, Boolean](gdext.classes.PopupMenu.mb_activate_item_by_event, livePtr, Wrappers.handle(event), forGlobalOnly)
  }

  /** PopupMenu.set_prefer_native_menu */
  final def setPreferNativeMenu(enabled: Boolean): Unit = {
    if (gdext.classes.PopupMenu.mb_set_prefer_native_menu == null) gdext.classes.PopupMenu.mb_set_prefer_native_menu = MethodBind.get("PopupMenu", "set_prefer_native_menu", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_set_prefer_native_menu, livePtr, enabled)
  }

  /** PopupMenu.is_prefer_native_menu */
  final def isPreferNativeMenu(): Boolean = {
    if (gdext.classes.PopupMenu.mb_is_prefer_native_menu == null) gdext.classes.PopupMenu.mb_is_prefer_native_menu = MethodBind.get("PopupMenu", "is_prefer_native_menu", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PopupMenu.mb_is_prefer_native_menu, livePtr)
  }

  /** PopupMenu.is_native_menu */
  final def isNativeMenu(): Boolean = {
    if (gdext.classes.PopupMenu.mb_is_native_menu == null) gdext.classes.PopupMenu.mb_is_native_menu = MethodBind.get("PopupMenu", "is_native_menu", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PopupMenu.mb_is_native_menu, livePtr)
  }

  /** PopupMenu.add_item */
  final def addItem(label: String, id: Long = -1L, accel: gdext.classes.Key = gdext.classes.Key(0L)): Unit = {
    if (gdext.classes.PopupMenu.mb_add_item == null) gdext.classes.PopupMenu.mb_add_item = MethodBind.get("PopupMenu", "add_item", 3674230041L)
    Ptrcall.callVoid3(gdext.classes.PopupMenu.mb_add_item, livePtr, label, id, accel)
  }

  /** PopupMenu.add_icon_item */
  final def addIconItem(texture: Texture2D, label: String, id: Long = -1L, accel: gdext.classes.Key = gdext.classes.Key(0L)): Unit = {
    if (gdext.classes.PopupMenu.mb_add_icon_item == null) gdext.classes.PopupMenu.mb_add_icon_item = MethodBind.get("PopupMenu", "add_icon_item", 1086190128L)
    Ptrcall.callVoid4(gdext.classes.PopupMenu.mb_add_icon_item, livePtr, Wrappers.handle(texture), label, id, accel)
  }

  /** PopupMenu.add_check_item */
  final def addCheckItem(label: String, id: Long = -1L, accel: gdext.classes.Key = gdext.classes.Key(0L)): Unit = {
    if (gdext.classes.PopupMenu.mb_add_check_item == null) gdext.classes.PopupMenu.mb_add_check_item = MethodBind.get("PopupMenu", "add_check_item", 3674230041L)
    Ptrcall.callVoid3(gdext.classes.PopupMenu.mb_add_check_item, livePtr, label, id, accel)
  }

  /** PopupMenu.add_icon_check_item */
  final def addIconCheckItem(texture: Texture2D, label: String, id: Long = -1L, accel: gdext.classes.Key = gdext.classes.Key(0L)): Unit = {
    if (gdext.classes.PopupMenu.mb_add_icon_check_item == null) gdext.classes.PopupMenu.mb_add_icon_check_item = MethodBind.get("PopupMenu", "add_icon_check_item", 1086190128L)
    Ptrcall.callVoid4(gdext.classes.PopupMenu.mb_add_icon_check_item, livePtr, Wrappers.handle(texture), label, id, accel)
  }

  /** PopupMenu.add_radio_check_item */
  final def addRadioCheckItem(label: String, id: Long = -1L, accel: gdext.classes.Key = gdext.classes.Key(0L)): Unit = {
    if (gdext.classes.PopupMenu.mb_add_radio_check_item == null) gdext.classes.PopupMenu.mb_add_radio_check_item = MethodBind.get("PopupMenu", "add_radio_check_item", 3674230041L)
    Ptrcall.callVoid3(gdext.classes.PopupMenu.mb_add_radio_check_item, livePtr, label, id, accel)
  }

  /** PopupMenu.add_icon_radio_check_item */
  final def addIconRadioCheckItem(texture: Texture2D, label: String, id: Long = -1L, accel: gdext.classes.Key = gdext.classes.Key(0L)): Unit = {
    if (gdext.classes.PopupMenu.mb_add_icon_radio_check_item == null) gdext.classes.PopupMenu.mb_add_icon_radio_check_item = MethodBind.get("PopupMenu", "add_icon_radio_check_item", 1086190128L)
    Ptrcall.callVoid4(gdext.classes.PopupMenu.mb_add_icon_radio_check_item, livePtr, Wrappers.handle(texture), label, id, accel)
  }

  /** PopupMenu.add_multistate_item */
  final def addMultistateItem(label: String, maxStates: Long, defaultState: Long = 0L, id: Long = -1L, accel: gdext.classes.Key = gdext.classes.Key(0L)): Unit = {
    if (gdext.classes.PopupMenu.mb_add_multistate_item == null) gdext.classes.PopupMenu.mb_add_multistate_item = MethodBind.get("PopupMenu", "add_multistate_item", 150780458L)
    Ptrcall.callVoid5(gdext.classes.PopupMenu.mb_add_multistate_item, livePtr, label, maxStates, defaultState, id, accel)
  }

  /** PopupMenu.add_shortcut */
  final def addShortcut(shortcut: Shortcut, id: Long = -1L, global: Boolean = false, allowEcho: Boolean = false): Unit = {
    if (gdext.classes.PopupMenu.mb_add_shortcut == null) gdext.classes.PopupMenu.mb_add_shortcut = MethodBind.get("PopupMenu", "add_shortcut", 3451850107L)
    Ptrcall.callVoid4(gdext.classes.PopupMenu.mb_add_shortcut, livePtr, Wrappers.handle(shortcut), id, global, allowEcho)
  }

  /** PopupMenu.add_icon_shortcut */
  final def addIconShortcut(texture: Texture2D, shortcut: Shortcut, id: Long = -1L, global: Boolean = false, allowEcho: Boolean = false): Unit = {
    if (gdext.classes.PopupMenu.mb_add_icon_shortcut == null) gdext.classes.PopupMenu.mb_add_icon_shortcut = MethodBind.get("PopupMenu", "add_icon_shortcut", 2997871092L)
    Ptrcall.callVoid5(gdext.classes.PopupMenu.mb_add_icon_shortcut, livePtr, Wrappers.handle(texture), Wrappers.handle(shortcut), id, global, allowEcho)
  }

  /** PopupMenu.add_check_shortcut */
  final def addCheckShortcut(shortcut: Shortcut, id: Long = -1L, global: Boolean = false): Unit = {
    if (gdext.classes.PopupMenu.mb_add_check_shortcut == null) gdext.classes.PopupMenu.mb_add_check_shortcut = MethodBind.get("PopupMenu", "add_check_shortcut", 1642193386L)
    Ptrcall.callVoid3(gdext.classes.PopupMenu.mb_add_check_shortcut, livePtr, Wrappers.handle(shortcut), id, global)
  }

  /** PopupMenu.add_icon_check_shortcut */
  final def addIconCheckShortcut(texture: Texture2D, shortcut: Shortcut, id: Long = -1L, global: Boolean = false): Unit = {
    if (gdext.classes.PopupMenu.mb_add_icon_check_shortcut == null) gdext.classes.PopupMenu.mb_add_icon_check_shortcut = MethodBind.get("PopupMenu", "add_icon_check_shortcut", 3856247530L)
    Ptrcall.callVoid4(gdext.classes.PopupMenu.mb_add_icon_check_shortcut, livePtr, Wrappers.handle(texture), Wrappers.handle(shortcut), id, global)
  }

  /** PopupMenu.add_radio_check_shortcut */
  final def addRadioCheckShortcut(shortcut: Shortcut, id: Long = -1L, global: Boolean = false): Unit = {
    if (gdext.classes.PopupMenu.mb_add_radio_check_shortcut == null) gdext.classes.PopupMenu.mb_add_radio_check_shortcut = MethodBind.get("PopupMenu", "add_radio_check_shortcut", 1642193386L)
    Ptrcall.callVoid3(gdext.classes.PopupMenu.mb_add_radio_check_shortcut, livePtr, Wrappers.handle(shortcut), id, global)
  }

  /** PopupMenu.add_icon_radio_check_shortcut */
  final def addIconRadioCheckShortcut(texture: Texture2D, shortcut: Shortcut, id: Long = -1L, global: Boolean = false): Unit = {
    if (gdext.classes.PopupMenu.mb_add_icon_radio_check_shortcut == null) gdext.classes.PopupMenu.mb_add_icon_radio_check_shortcut = MethodBind.get("PopupMenu", "add_icon_radio_check_shortcut", 3856247530L)
    Ptrcall.callVoid4(gdext.classes.PopupMenu.mb_add_icon_radio_check_shortcut, livePtr, Wrappers.handle(texture), Wrappers.handle(shortcut), id, global)
  }

  /** PopupMenu.add_submenu_item */
  final def addSubmenuItem(label: String, submenu: String, id: Long = -1L): Unit = {
    if (gdext.classes.PopupMenu.mb_add_submenu_item == null) gdext.classes.PopupMenu.mb_add_submenu_item = MethodBind.get("PopupMenu", "add_submenu_item", 2979222410L)
    Ptrcall.callVoid3(gdext.classes.PopupMenu.mb_add_submenu_item, livePtr, label, submenu, id)
  }

  /** PopupMenu.add_submenu_node_item */
  final def addSubmenuNodeItem(label: String, submenu: PopupMenu, id: Long = -1L): Unit = {
    if (gdext.classes.PopupMenu.mb_add_submenu_node_item == null) gdext.classes.PopupMenu.mb_add_submenu_node_item = MethodBind.get("PopupMenu", "add_submenu_node_item", 1325455216L)
    Ptrcall.callVoid3(gdext.classes.PopupMenu.mb_add_submenu_node_item, livePtr, label, Wrappers.handle(submenu), id)
  }

  /** PopupMenu.set_item_text */
  final def setItemText(index: Long, text: String): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_text == null) gdext.classes.PopupMenu.mb_set_item_text = MethodBind.get("PopupMenu", "set_item_text", 501894301L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_text, livePtr, index, text)
  }

  /** PopupMenu.set_item_text_direction */
  final def setItemTextDirection(index: Long, direction: gdext.classes.Control.TextDirection): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_text_direction == null) gdext.classes.PopupMenu.mb_set_item_text_direction = MethodBind.get("PopupMenu", "set_item_text_direction", 1707680378L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_text_direction, livePtr, index, direction)
  }

  /** PopupMenu.set_item_language */
  final def setItemLanguage(index: Long, language: String): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_language == null) gdext.classes.PopupMenu.mb_set_item_language = MethodBind.get("PopupMenu", "set_item_language", 501894301L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_language, livePtr, index, language)
  }

  /** PopupMenu.set_item_auto_translate_mode */
  final def setItemAutoTranslateMode(index: Long, mode: gdext.classes.Node.AutoTranslateMode): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_auto_translate_mode == null) gdext.classes.PopupMenu.mb_set_item_auto_translate_mode = MethodBind.get("PopupMenu", "set_item_auto_translate_mode", 287402019L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_auto_translate_mode, livePtr, index, mode)
  }

  /** PopupMenu.set_item_icon */
  final def setItemIcon(index: Long, icon: Texture2D): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_icon == null) gdext.classes.PopupMenu.mb_set_item_icon = MethodBind.get("PopupMenu", "set_item_icon", 666127730L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_icon, livePtr, index, Wrappers.handle(icon))
  }

  /** PopupMenu.set_item_icon_max_width */
  final def setItemIconMaxWidth(index: Long, width: Long): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_icon_max_width == null) gdext.classes.PopupMenu.mb_set_item_icon_max_width = MethodBind.get("PopupMenu", "set_item_icon_max_width", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_icon_max_width, livePtr, index, width)
  }

  /** PopupMenu.set_item_icon_modulate */
  final def setItemIconModulate(index: Long, modulate: gdext.builtin.Color): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_icon_modulate == null) gdext.classes.PopupMenu.mb_set_item_icon_modulate = MethodBind.get("PopupMenu", "set_item_icon_modulate", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_icon_modulate, livePtr, index, modulate)
  }

  /** PopupMenu.set_item_checked */
  final def setItemChecked(index: Long, checked: Boolean): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_checked == null) gdext.classes.PopupMenu.mb_set_item_checked = MethodBind.get("PopupMenu", "set_item_checked", 300928843L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_checked, livePtr, index, checked)
  }

  /** PopupMenu.set_item_id */
  final def setItemId(index: Long, id: Long): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_id == null) gdext.classes.PopupMenu.mb_set_item_id = MethodBind.get("PopupMenu", "set_item_id", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_id, livePtr, index, id)
  }

  /** PopupMenu.set_item_accelerator */
  final def setItemAccelerator(index: Long, accel: gdext.classes.Key): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_accelerator == null) gdext.classes.PopupMenu.mb_set_item_accelerator = MethodBind.get("PopupMenu", "set_item_accelerator", 2992817551L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_accelerator, livePtr, index, accel)
  }

  /** PopupMenu.set_item_disabled */
  final def setItemDisabled(index: Long, disabled: Boolean): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_disabled == null) gdext.classes.PopupMenu.mb_set_item_disabled = MethodBind.get("PopupMenu", "set_item_disabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_disabled, livePtr, index, disabled)
  }

  /** PopupMenu.set_item_submenu */
  final def setItemSubmenu(index: Long, submenu: String): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_submenu == null) gdext.classes.PopupMenu.mb_set_item_submenu = MethodBind.get("PopupMenu", "set_item_submenu", 501894301L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_submenu, livePtr, index, submenu)
  }

  /** PopupMenu.set_item_submenu_node */
  final def setItemSubmenuNode(index: Long, submenu: PopupMenu): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_submenu_node == null) gdext.classes.PopupMenu.mb_set_item_submenu_node = MethodBind.get("PopupMenu", "set_item_submenu_node", 1068370740L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_submenu_node, livePtr, index, Wrappers.handle(submenu))
  }

  /** PopupMenu.set_item_as_separator */
  final def setItemAsSeparator(index: Long, enable: Boolean): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_as_separator == null) gdext.classes.PopupMenu.mb_set_item_as_separator = MethodBind.get("PopupMenu", "set_item_as_separator", 300928843L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_as_separator, livePtr, index, enable)
  }

  /** PopupMenu.set_item_as_checkable */
  final def setItemAsCheckable(index: Long, enable: Boolean): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_as_checkable == null) gdext.classes.PopupMenu.mb_set_item_as_checkable = MethodBind.get("PopupMenu", "set_item_as_checkable", 300928843L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_as_checkable, livePtr, index, enable)
  }

  /** PopupMenu.set_item_as_radio_checkable */
  final def setItemAsRadioCheckable(index: Long, enable: Boolean): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_as_radio_checkable == null) gdext.classes.PopupMenu.mb_set_item_as_radio_checkable = MethodBind.get("PopupMenu", "set_item_as_radio_checkable", 300928843L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_as_radio_checkable, livePtr, index, enable)
  }

  /** PopupMenu.set_item_tooltip */
  final def setItemTooltip(index: Long, tooltip: String): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_tooltip == null) gdext.classes.PopupMenu.mb_set_item_tooltip = MethodBind.get("PopupMenu", "set_item_tooltip", 501894301L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_tooltip, livePtr, index, tooltip)
  }

  /** PopupMenu.set_item_shortcut */
  final def setItemShortcut(index: Long, shortcut: Shortcut, global: Boolean = false): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_shortcut == null) gdext.classes.PopupMenu.mb_set_item_shortcut = MethodBind.get("PopupMenu", "set_item_shortcut", 825127832L)
    Ptrcall.callVoid3(gdext.classes.PopupMenu.mb_set_item_shortcut, livePtr, index, Wrappers.handle(shortcut), global)
  }

  /** PopupMenu.set_item_indent */
  final def setItemIndent(index: Long, indent: Long): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_indent == null) gdext.classes.PopupMenu.mb_set_item_indent = MethodBind.get("PopupMenu", "set_item_indent", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_indent, livePtr, index, indent)
  }

  /** PopupMenu.set_item_multistate */
  final def setItemMultistate(index: Long, state: Long): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_multistate == null) gdext.classes.PopupMenu.mb_set_item_multistate = MethodBind.get("PopupMenu", "set_item_multistate", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_multistate, livePtr, index, state)
  }

  /** PopupMenu.set_item_multistate_max */
  final def setItemMultistateMax(index: Long, maxStates: Long): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_multistate_max == null) gdext.classes.PopupMenu.mb_set_item_multistate_max = MethodBind.get("PopupMenu", "set_item_multistate_max", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_multistate_max, livePtr, index, maxStates)
  }

  /** PopupMenu.set_item_shortcut_disabled */
  final def setItemShortcutDisabled(index: Long, disabled: Boolean): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_shortcut_disabled == null) gdext.classes.PopupMenu.mb_set_item_shortcut_disabled = MethodBind.get("PopupMenu", "set_item_shortcut_disabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_set_item_shortcut_disabled, livePtr, index, disabled)
  }

  /** PopupMenu.toggle_item_checked */
  final def toggleItemChecked(index: Long): Unit = {
    if (gdext.classes.PopupMenu.mb_toggle_item_checked == null) gdext.classes.PopupMenu.mb_toggle_item_checked = MethodBind.get("PopupMenu", "toggle_item_checked", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_toggle_item_checked, livePtr, index)
  }

  /** PopupMenu.toggle_item_multistate */
  final def toggleItemMultistate(index: Long): Unit = {
    if (gdext.classes.PopupMenu.mb_toggle_item_multistate == null) gdext.classes.PopupMenu.mb_toggle_item_multistate = MethodBind.get("PopupMenu", "toggle_item_multistate", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_toggle_item_multistate, livePtr, index)
  }

  /** PopupMenu.get_item_text */
  final def getItemText(index: Long): String = {
    if (gdext.classes.PopupMenu.mb_get_item_text == null) gdext.classes.PopupMenu.mb_get_item_text = MethodBind.get("PopupMenu", "get_item_text", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.PopupMenu.mb_get_item_text, livePtr, index)
  }

  /** PopupMenu.get_item_text_direction */
  final def getItemTextDirection(index: Long): gdext.classes.Control.TextDirection = {
    if (gdext.classes.PopupMenu.mb_get_item_text_direction == null) gdext.classes.PopupMenu.mb_get_item_text_direction = MethodBind.get("PopupMenu", "get_item_text_direction", 4235602388L)
    gdext.classes.Control.TextDirection(Ptrcall.call1[Long, Long](gdext.classes.PopupMenu.mb_get_item_text_direction, livePtr, index))
  }

  /** PopupMenu.get_item_language */
  final def getItemLanguage(index: Long): String = {
    if (gdext.classes.PopupMenu.mb_get_item_language == null) gdext.classes.PopupMenu.mb_get_item_language = MethodBind.get("PopupMenu", "get_item_language", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.PopupMenu.mb_get_item_language, livePtr, index)
  }

  /** PopupMenu.get_item_auto_translate_mode */
  final def getItemAutoTranslateMode(index: Long): gdext.classes.Node.AutoTranslateMode = {
    if (gdext.classes.PopupMenu.mb_get_item_auto_translate_mode == null) gdext.classes.PopupMenu.mb_get_item_auto_translate_mode = MethodBind.get("PopupMenu", "get_item_auto_translate_mode", 906302372L)
    gdext.classes.Node.AutoTranslateMode(Ptrcall.call1[Long, Long](gdext.classes.PopupMenu.mb_get_item_auto_translate_mode, livePtr, index))
  }

  /** PopupMenu.get_item_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getItemIcon(index: Long): Texture2D = {
    if (gdext.classes.PopupMenu.mb_get_item_icon == null) gdext.classes.PopupMenu.mb_get_item_icon = MethodBind.get("PopupMenu", "get_item_icon", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.PopupMenu.mb_get_item_icon, livePtr, index))
  }

  /** PopupMenu.get_item_icon_max_width */
  final def getItemIconMaxWidth(index: Long): Long = {
    if (gdext.classes.PopupMenu.mb_get_item_icon_max_width == null) gdext.classes.PopupMenu.mb_get_item_icon_max_width = MethodBind.get("PopupMenu", "get_item_icon_max_width", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.PopupMenu.mb_get_item_icon_max_width, livePtr, index)
  }

  /** PopupMenu.get_item_icon_modulate */
  final def getItemIconModulate(index: Long): gdext.builtin.Color = {
    if (gdext.classes.PopupMenu.mb_get_item_icon_modulate == null) gdext.classes.PopupMenu.mb_get_item_icon_modulate = MethodBind.get("PopupMenu", "get_item_icon_modulate", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.PopupMenu.mb_get_item_icon_modulate, livePtr, index)
  }

  /** PopupMenu.is_item_checked */
  final def isItemChecked(index: Long): Boolean = {
    if (gdext.classes.PopupMenu.mb_is_item_checked == null) gdext.classes.PopupMenu.mb_is_item_checked = MethodBind.get("PopupMenu", "is_item_checked", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.PopupMenu.mb_is_item_checked, livePtr, index)
  }

  /** PopupMenu.get_item_id */
  final def getItemId(index: Long): Long = {
    if (gdext.classes.PopupMenu.mb_get_item_id == null) gdext.classes.PopupMenu.mb_get_item_id = MethodBind.get("PopupMenu", "get_item_id", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.PopupMenu.mb_get_item_id, livePtr, index)
  }

  /** PopupMenu.get_item_index */
  final def getItemIndex(id: Long): Long = {
    if (gdext.classes.PopupMenu.mb_get_item_index == null) gdext.classes.PopupMenu.mb_get_item_index = MethodBind.get("PopupMenu", "get_item_index", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.PopupMenu.mb_get_item_index, livePtr, id)
  }

  /** PopupMenu.get_item_accelerator */
  final def getItemAccelerator(index: Long): gdext.classes.Key = {
    if (gdext.classes.PopupMenu.mb_get_item_accelerator == null) gdext.classes.PopupMenu.mb_get_item_accelerator = MethodBind.get("PopupMenu", "get_item_accelerator", 253789942L)
    gdext.classes.Key(Ptrcall.call1[Long, Long](gdext.classes.PopupMenu.mb_get_item_accelerator, livePtr, index))
  }

  /** PopupMenu.is_item_disabled */
  final def isItemDisabled(index: Long): Boolean = {
    if (gdext.classes.PopupMenu.mb_is_item_disabled == null) gdext.classes.PopupMenu.mb_is_item_disabled = MethodBind.get("PopupMenu", "is_item_disabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.PopupMenu.mb_is_item_disabled, livePtr, index)
  }

  /** PopupMenu.get_item_submenu */
  final def getItemSubmenu(index: Long): String = {
    if (gdext.classes.PopupMenu.mb_get_item_submenu == null) gdext.classes.PopupMenu.mb_get_item_submenu = MethodBind.get("PopupMenu", "get_item_submenu", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.PopupMenu.mb_get_item_submenu, livePtr, index)
  }

  /** PopupMenu.get_item_submenu_node */
  final def getItemSubmenuNode(index: Long): PopupMenu = {
    if (gdext.classes.PopupMenu.mb_get_item_submenu_node == null) gdext.classes.PopupMenu.mb_get_item_submenu_node = MethodBind.get("PopupMenu", "get_item_submenu_node", 2100501353L)
    Wrappers.borrowed[PopupMenu](Ptrcall.call1[Long, Long](gdext.classes.PopupMenu.mb_get_item_submenu_node, livePtr, index))
  }

  /** PopupMenu.is_item_separator */
  final def isItemSeparator(index: Long): Boolean = {
    if (gdext.classes.PopupMenu.mb_is_item_separator == null) gdext.classes.PopupMenu.mb_is_item_separator = MethodBind.get("PopupMenu", "is_item_separator", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.PopupMenu.mb_is_item_separator, livePtr, index)
  }

  /** PopupMenu.is_item_checkable */
  final def isItemCheckable(index: Long): Boolean = {
    if (gdext.classes.PopupMenu.mb_is_item_checkable == null) gdext.classes.PopupMenu.mb_is_item_checkable = MethodBind.get("PopupMenu", "is_item_checkable", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.PopupMenu.mb_is_item_checkable, livePtr, index)
  }

  /** PopupMenu.is_item_radio_checkable */
  final def isItemRadioCheckable(index: Long): Boolean = {
    if (gdext.classes.PopupMenu.mb_is_item_radio_checkable == null) gdext.classes.PopupMenu.mb_is_item_radio_checkable = MethodBind.get("PopupMenu", "is_item_radio_checkable", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.PopupMenu.mb_is_item_radio_checkable, livePtr, index)
  }

  /** PopupMenu.is_item_shortcut_disabled */
  final def isItemShortcutDisabled(index: Long): Boolean = {
    if (gdext.classes.PopupMenu.mb_is_item_shortcut_disabled == null) gdext.classes.PopupMenu.mb_is_item_shortcut_disabled = MethodBind.get("PopupMenu", "is_item_shortcut_disabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.PopupMenu.mb_is_item_shortcut_disabled, livePtr, index)
  }

  /** PopupMenu.get_item_tooltip */
  final def getItemTooltip(index: Long): String = {
    if (gdext.classes.PopupMenu.mb_get_item_tooltip == null) gdext.classes.PopupMenu.mb_get_item_tooltip = MethodBind.get("PopupMenu", "get_item_tooltip", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.PopupMenu.mb_get_item_tooltip, livePtr, index)
  }

  /** PopupMenu.get_item_shortcut. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getItemShortcut(index: Long): Shortcut = {
    if (gdext.classes.PopupMenu.mb_get_item_shortcut == null) gdext.classes.PopupMenu.mb_get_item_shortcut = MethodBind.get("PopupMenu", "get_item_shortcut", 1449483325L)
    Wrappers.owned[Shortcut](Ptrcall.call1[Long, Long](gdext.classes.PopupMenu.mb_get_item_shortcut, livePtr, index))
  }

  /** PopupMenu.get_item_indent */
  final def getItemIndent(index: Long): Long = {
    if (gdext.classes.PopupMenu.mb_get_item_indent == null) gdext.classes.PopupMenu.mb_get_item_indent = MethodBind.get("PopupMenu", "get_item_indent", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.PopupMenu.mb_get_item_indent, livePtr, index)
  }

  /** PopupMenu.get_item_multistate_max */
  final def getItemMultistateMax(index: Long): Long = {
    if (gdext.classes.PopupMenu.mb_get_item_multistate_max == null) gdext.classes.PopupMenu.mb_get_item_multistate_max = MethodBind.get("PopupMenu", "get_item_multistate_max", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.PopupMenu.mb_get_item_multistate_max, livePtr, index)
  }

  /** PopupMenu.get_item_multistate */
  final def getItemMultistate(index: Long): Long = {
    if (gdext.classes.PopupMenu.mb_get_item_multistate == null) gdext.classes.PopupMenu.mb_get_item_multistate = MethodBind.get("PopupMenu", "get_item_multistate", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.PopupMenu.mb_get_item_multistate, livePtr, index)
  }

  /** PopupMenu.set_focused_item */
  final def setFocusedItem(index: Long): Unit = {
    if (gdext.classes.PopupMenu.mb_set_focused_item == null) gdext.classes.PopupMenu.mb_set_focused_item = MethodBind.get("PopupMenu", "set_focused_item", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_set_focused_item, livePtr, index)
  }

  /** PopupMenu.get_focused_item */
  final def getFocusedItem(): Long = {
    if (gdext.classes.PopupMenu.mb_get_focused_item == null) gdext.classes.PopupMenu.mb_get_focused_item = MethodBind.get("PopupMenu", "get_focused_item", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PopupMenu.mb_get_focused_item, livePtr)
  }

  /** PopupMenu.set_item_count */
  final def setItemCount(count: Long): Unit = {
    if (gdext.classes.PopupMenu.mb_set_item_count == null) gdext.classes.PopupMenu.mb_set_item_count = MethodBind.get("PopupMenu", "set_item_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_set_item_count, livePtr, count)
  }

  /** PopupMenu.get_item_count */
  final def getItemCount(): Long = {
    if (gdext.classes.PopupMenu.mb_get_item_count == null) gdext.classes.PopupMenu.mb_get_item_count = MethodBind.get("PopupMenu", "get_item_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PopupMenu.mb_get_item_count, livePtr)
  }

  /** PopupMenu.scroll_to_item */
  final def scrollToItem(index: Long): Unit = {
    if (gdext.classes.PopupMenu.mb_scroll_to_item == null) gdext.classes.PopupMenu.mb_scroll_to_item = MethodBind.get("PopupMenu", "scroll_to_item", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_scroll_to_item, livePtr, index)
  }

  /** PopupMenu.remove_item */
  final def removeItem(index: Long): Unit = {
    if (gdext.classes.PopupMenu.mb_remove_item == null) gdext.classes.PopupMenu.mb_remove_item = MethodBind.get("PopupMenu", "remove_item", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_remove_item, livePtr, index)
  }

  /** PopupMenu.add_separator */
  final def addSeparator(label: String = "", id: Long = -1L): Unit = {
    if (gdext.classes.PopupMenu.mb_add_separator == null) gdext.classes.PopupMenu.mb_add_separator = MethodBind.get("PopupMenu", "add_separator", 2266703459L)
    Ptrcall.callVoid2(gdext.classes.PopupMenu.mb_add_separator, livePtr, label, id)
  }

  /** PopupMenu.clear */
  final def clear(freeSubmenus: Boolean = false): Unit = {
    if (gdext.classes.PopupMenu.mb_clear == null) gdext.classes.PopupMenu.mb_clear = MethodBind.get("PopupMenu", "clear", 107499316L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_clear, livePtr, freeSubmenus)
  }

  /** PopupMenu.set_hide_on_item_selection */
  final def setHideOnItemSelection(enable: Boolean): Unit = {
    if (gdext.classes.PopupMenu.mb_set_hide_on_item_selection == null) gdext.classes.PopupMenu.mb_set_hide_on_item_selection = MethodBind.get("PopupMenu", "set_hide_on_item_selection", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_set_hide_on_item_selection, livePtr, enable)
  }

  /** PopupMenu.is_hide_on_item_selection */
  final def isHideOnItemSelection(): Boolean = {
    if (gdext.classes.PopupMenu.mb_is_hide_on_item_selection == null) gdext.classes.PopupMenu.mb_is_hide_on_item_selection = MethodBind.get("PopupMenu", "is_hide_on_item_selection", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PopupMenu.mb_is_hide_on_item_selection, livePtr)
  }

  /** PopupMenu.set_hide_on_checkable_item_selection */
  final def setHideOnCheckableItemSelection(enable: Boolean): Unit = {
    if (gdext.classes.PopupMenu.mb_set_hide_on_checkable_item_selection == null) gdext.classes.PopupMenu.mb_set_hide_on_checkable_item_selection = MethodBind.get("PopupMenu", "set_hide_on_checkable_item_selection", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_set_hide_on_checkable_item_selection, livePtr, enable)
  }

  /** PopupMenu.is_hide_on_checkable_item_selection */
  final def isHideOnCheckableItemSelection(): Boolean = {
    if (gdext.classes.PopupMenu.mb_is_hide_on_checkable_item_selection == null) gdext.classes.PopupMenu.mb_is_hide_on_checkable_item_selection = MethodBind.get("PopupMenu", "is_hide_on_checkable_item_selection", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PopupMenu.mb_is_hide_on_checkable_item_selection, livePtr)
  }

  /** PopupMenu.set_hide_on_state_item_selection */
  final def setHideOnStateItemSelection(enable: Boolean): Unit = {
    if (gdext.classes.PopupMenu.mb_set_hide_on_state_item_selection == null) gdext.classes.PopupMenu.mb_set_hide_on_state_item_selection = MethodBind.get("PopupMenu", "set_hide_on_state_item_selection", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_set_hide_on_state_item_selection, livePtr, enable)
  }

  /** PopupMenu.is_hide_on_state_item_selection */
  final def isHideOnStateItemSelection(): Boolean = {
    if (gdext.classes.PopupMenu.mb_is_hide_on_state_item_selection == null) gdext.classes.PopupMenu.mb_is_hide_on_state_item_selection = MethodBind.get("PopupMenu", "is_hide_on_state_item_selection", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PopupMenu.mb_is_hide_on_state_item_selection, livePtr)
  }

  /** PopupMenu.set_submenu_popup_delay */
  final def setSubmenuPopupDelay(seconds: Double): Unit = {
    if (gdext.classes.PopupMenu.mb_set_submenu_popup_delay == null) gdext.classes.PopupMenu.mb_set_submenu_popup_delay = MethodBind.get("PopupMenu", "set_submenu_popup_delay", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_set_submenu_popup_delay, livePtr, seconds)
  }

  /** PopupMenu.get_submenu_popup_delay */
  final def getSubmenuPopupDelay(): Double = {
    if (gdext.classes.PopupMenu.mb_get_submenu_popup_delay == null) gdext.classes.PopupMenu.mb_get_submenu_popup_delay = MethodBind.get("PopupMenu", "get_submenu_popup_delay", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PopupMenu.mb_get_submenu_popup_delay, livePtr)
  }

  /** PopupMenu.set_allow_search */
  final def setAllowSearch(allow: Boolean): Unit = {
    if (gdext.classes.PopupMenu.mb_set_allow_search == null) gdext.classes.PopupMenu.mb_set_allow_search = MethodBind.get("PopupMenu", "set_allow_search", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_set_allow_search, livePtr, allow)
  }

  /** PopupMenu.get_allow_search */
  final def getAllowSearch(): Boolean = {
    if (gdext.classes.PopupMenu.mb_get_allow_search == null) gdext.classes.PopupMenu.mb_get_allow_search = MethodBind.get("PopupMenu", "get_allow_search", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PopupMenu.mb_get_allow_search, livePtr)
  }

  /** PopupMenu.is_system_menu */
  final def isSystemMenu(): Boolean = {
    if (gdext.classes.PopupMenu.mb_is_system_menu == null) gdext.classes.PopupMenu.mb_is_system_menu = MethodBind.get("PopupMenu", "is_system_menu", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PopupMenu.mb_is_system_menu, livePtr)
  }

  /** PopupMenu.set_system_menu */
  final def setSystemMenu(systemMenuId: gdext.classes.NativeMenu.SystemMenus): Unit = {
    if (gdext.classes.PopupMenu.mb_set_system_menu == null) gdext.classes.PopupMenu.mb_set_system_menu = MethodBind.get("PopupMenu", "set_system_menu", 600639674L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_set_system_menu, livePtr, systemMenuId)
  }

  /** PopupMenu.get_system_menu */
  final def getSystemMenu(): gdext.classes.NativeMenu.SystemMenus = {
    if (gdext.classes.PopupMenu.mb_get_system_menu == null) gdext.classes.PopupMenu.mb_get_system_menu = MethodBind.get("PopupMenu", "get_system_menu", 1222557358L)
    gdext.classes.NativeMenu.SystemMenus(Ptrcall.call0[Long](gdext.classes.PopupMenu.mb_get_system_menu, livePtr))
  }

  /** PopupMenu.set_shrink_height */
  final def setShrinkHeight(shrink: Boolean): Unit = {
    if (gdext.classes.PopupMenu.mb_set_shrink_height == null) gdext.classes.PopupMenu.mb_set_shrink_height = MethodBind.get("PopupMenu", "set_shrink_height", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_set_shrink_height, livePtr, shrink)
  }

  /** PopupMenu.get_shrink_height */
  final def getShrinkHeight(): Boolean = {
    if (gdext.classes.PopupMenu.mb_get_shrink_height == null) gdext.classes.PopupMenu.mb_get_shrink_height = MethodBind.get("PopupMenu", "get_shrink_height", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PopupMenu.mb_get_shrink_height, livePtr)
  }

  /** PopupMenu.set_shrink_width */
  final def setShrinkWidth(shrink: Boolean): Unit = {
    if (gdext.classes.PopupMenu.mb_set_shrink_width == null) gdext.classes.PopupMenu.mb_set_shrink_width = MethodBind.get("PopupMenu", "set_shrink_width", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PopupMenu.mb_set_shrink_width, livePtr, shrink)
  }

  /** PopupMenu.get_shrink_width */
  final def getShrinkWidth(): Boolean = {
    if (gdext.classes.PopupMenu.mb_get_shrink_width == null) gdext.classes.PopupMenu.mb_get_shrink_width = MethodBind.get("PopupMenu", "get_shrink_width", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PopupMenu.mb_get_shrink_width, livePtr)
  }

}

object PopupMenu {
  private[classes] var mb_activate_item_by_event: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_prefer_native_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_prefer_native_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_native_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_icon_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_check_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_icon_check_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_radio_check_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_icon_radio_check_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_multistate_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_icon_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_check_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_icon_check_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_radio_check_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_icon_radio_check_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_submenu_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_submenu_node_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_auto_translate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_icon_max_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_icon_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_checked: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_accelerator: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_submenu: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_submenu_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_as_separator: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_as_checkable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_as_radio_checkable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_indent: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_multistate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_multistate_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_shortcut_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_toggle_item_checked: GDExtensionMethodBindPtr = null
  private[classes] var mb_toggle_item_multistate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_auto_translate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_icon_max_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_icon_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_item_checked: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_accelerator: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_item_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_submenu: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_submenu_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_item_separator: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_item_checkable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_item_radio_checkable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_item_shortcut_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_indent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_multistate_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_multistate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_focused_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_focused_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_scroll_to_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_separator: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hide_on_item_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hide_on_item_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hide_on_checkable_item_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hide_on_checkable_item_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hide_on_state_item_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hide_on_state_item_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_submenu_popup_delay: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_submenu_popup_delay: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_search: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_allow_search: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_system_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_system_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_system_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shrink_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shrink_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shrink_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shrink_width: GDExtensionMethodBindPtr = null
}
