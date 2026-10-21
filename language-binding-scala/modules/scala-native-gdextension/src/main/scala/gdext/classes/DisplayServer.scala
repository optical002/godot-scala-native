package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `DisplayServer`, extends `Object`. */
abstract class DisplayServer extends Object {
  override def godotClassName: String = "DisplayServer"

  /** DisplayServer.has_feature */
  final def hasFeature(feature: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_has_feature == null) gdext.classes.DisplayServer.mb_has_feature = MethodBind.get("DisplayServer", "has_feature", 334065950L)
    Ptrcall.call1[Long, Boolean](gdext.classes.DisplayServer.mb_has_feature, livePtr, feature)
  }

  /** DisplayServer.get_name */
  final def getName(): String = {
    if (gdext.classes.DisplayServer.mb_get_name == null) gdext.classes.DisplayServer.mb_get_name = MethodBind.get("DisplayServer", "get_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.DisplayServer.mb_get_name, livePtr)
  }

  /** DisplayServer.global_menu_add_submenu_item */
  final def globalMenuAddSubmenuItem(menu_root: String, label: String, submenu: String, index: Long): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_add_submenu_item == null) gdext.classes.DisplayServer.mb_global_menu_add_submenu_item = MethodBind.get("DisplayServer", "global_menu_add_submenu_item", 2828985934L)
    Ptrcall.call4[String, String, String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_add_submenu_item, livePtr, menu_root, label, submenu, index)
  }

  /** DisplayServer.global_menu_add_separator */
  final def globalMenuAddSeparator(menu_root: String, index: Long): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_add_separator == null) gdext.classes.DisplayServer.mb_global_menu_add_separator = MethodBind.get("DisplayServer", "global_menu_add_separator", 3214812433L)
    Ptrcall.call2[String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_add_separator, livePtr, menu_root, index)
  }

  /** DisplayServer.global_menu_get_item_index_from_text */
  final def globalMenuGetItemIndexFromText(menu_root: String, text: String): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_index_from_text == null) gdext.classes.DisplayServer.mb_global_menu_get_item_index_from_text = MethodBind.get("DisplayServer", "global_menu_get_item_index_from_text", 2878152881L)
    Ptrcall.call2[String, String, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_index_from_text, livePtr, menu_root, text)
  }

  /** DisplayServer.global_menu_is_item_checked */
  final def globalMenuIsItemChecked(menu_root: String, idx: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_global_menu_is_item_checked == null) gdext.classes.DisplayServer.mb_global_menu_is_item_checked = MethodBind.get("DisplayServer", "global_menu_is_item_checked", 3511468594L)
    Ptrcall.call2[String, Long, Boolean](gdext.classes.DisplayServer.mb_global_menu_is_item_checked, livePtr, menu_root, idx)
  }

  /** DisplayServer.global_menu_is_item_checkable */
  final def globalMenuIsItemCheckable(menu_root: String, idx: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_global_menu_is_item_checkable == null) gdext.classes.DisplayServer.mb_global_menu_is_item_checkable = MethodBind.get("DisplayServer", "global_menu_is_item_checkable", 3511468594L)
    Ptrcall.call2[String, Long, Boolean](gdext.classes.DisplayServer.mb_global_menu_is_item_checkable, livePtr, menu_root, idx)
  }

  /** DisplayServer.global_menu_is_item_radio_checkable */
  final def globalMenuIsItemRadioCheckable(menu_root: String, idx: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_global_menu_is_item_radio_checkable == null) gdext.classes.DisplayServer.mb_global_menu_is_item_radio_checkable = MethodBind.get("DisplayServer", "global_menu_is_item_radio_checkable", 3511468594L)
    Ptrcall.call2[String, Long, Boolean](gdext.classes.DisplayServer.mb_global_menu_is_item_radio_checkable, livePtr, menu_root, idx)
  }

  /** DisplayServer.global_menu_get_item_text */
  final def globalMenuGetItemText(menu_root: String, idx: Long): String = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_text == null) gdext.classes.DisplayServer.mb_global_menu_get_item_text = MethodBind.get("DisplayServer", "global_menu_get_item_text", 591067909L)
    Ptrcall.call2[String, Long, String](gdext.classes.DisplayServer.mb_global_menu_get_item_text, livePtr, menu_root, idx)
  }

  /** DisplayServer.global_menu_get_item_submenu */
  final def globalMenuGetItemSubmenu(menu_root: String, idx: Long): String = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_submenu == null) gdext.classes.DisplayServer.mb_global_menu_get_item_submenu = MethodBind.get("DisplayServer", "global_menu_get_item_submenu", 591067909L)
    Ptrcall.call2[String, Long, String](gdext.classes.DisplayServer.mb_global_menu_get_item_submenu, livePtr, menu_root, idx)
  }

  /** DisplayServer.global_menu_get_item_accelerator */
  final def globalMenuGetItemAccelerator(menu_root: String, idx: Long): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_accelerator == null) gdext.classes.DisplayServer.mb_global_menu_get_item_accelerator = MethodBind.get("DisplayServer", "global_menu_get_item_accelerator", 936065394L)
    Ptrcall.call2[String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_accelerator, livePtr, menu_root, idx)
  }

  /** DisplayServer.global_menu_is_item_disabled */
  final def globalMenuIsItemDisabled(menu_root: String, idx: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_global_menu_is_item_disabled == null) gdext.classes.DisplayServer.mb_global_menu_is_item_disabled = MethodBind.get("DisplayServer", "global_menu_is_item_disabled", 3511468594L)
    Ptrcall.call2[String, Long, Boolean](gdext.classes.DisplayServer.mb_global_menu_is_item_disabled, livePtr, menu_root, idx)
  }

  /** DisplayServer.global_menu_is_item_hidden */
  final def globalMenuIsItemHidden(menu_root: String, idx: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_global_menu_is_item_hidden == null) gdext.classes.DisplayServer.mb_global_menu_is_item_hidden = MethodBind.get("DisplayServer", "global_menu_is_item_hidden", 3511468594L)
    Ptrcall.call2[String, Long, Boolean](gdext.classes.DisplayServer.mb_global_menu_is_item_hidden, livePtr, menu_root, idx)
  }

  /** DisplayServer.global_menu_get_item_tooltip */
  final def globalMenuGetItemTooltip(menu_root: String, idx: Long): String = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_tooltip == null) gdext.classes.DisplayServer.mb_global_menu_get_item_tooltip = MethodBind.get("DisplayServer", "global_menu_get_item_tooltip", 591067909L)
    Ptrcall.call2[String, Long, String](gdext.classes.DisplayServer.mb_global_menu_get_item_tooltip, livePtr, menu_root, idx)
  }

  /** DisplayServer.global_menu_get_item_state */
  final def globalMenuGetItemState(menu_root: String, idx: Long): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_state == null) gdext.classes.DisplayServer.mb_global_menu_get_item_state = MethodBind.get("DisplayServer", "global_menu_get_item_state", 3422818498L)
    Ptrcall.call2[String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_state, livePtr, menu_root, idx)
  }

  /** DisplayServer.global_menu_get_item_max_states */
  final def globalMenuGetItemMaxStates(menu_root: String, idx: Long): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_max_states == null) gdext.classes.DisplayServer.mb_global_menu_get_item_max_states = MethodBind.get("DisplayServer", "global_menu_get_item_max_states", 3422818498L)
    Ptrcall.call2[String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_max_states, livePtr, menu_root, idx)
  }

  /** DisplayServer.global_menu_get_item_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def globalMenuGetItemIcon(menu_root: String, idx: Long): Texture2D = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_icon == null) gdext.classes.DisplayServer.mb_global_menu_get_item_icon = MethodBind.get("DisplayServer", "global_menu_get_item_icon", 3591713183L)
    Wrappers.owned[Texture2D](Ptrcall.call2[String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_icon, livePtr, menu_root, idx))
  }

  /** DisplayServer.global_menu_get_item_indentation_level */
  final def globalMenuGetItemIndentationLevel(menu_root: String, idx: Long): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_indentation_level == null) gdext.classes.DisplayServer.mb_global_menu_get_item_indentation_level = MethodBind.get("DisplayServer", "global_menu_get_item_indentation_level", 3422818498L)
    Ptrcall.call2[String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_indentation_level, livePtr, menu_root, idx)
  }

  /** DisplayServer.global_menu_set_item_checked */
  final def globalMenuSetItemChecked(menu_root: String, idx: Long, checked: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_checked == null) gdext.classes.DisplayServer.mb_global_menu_set_item_checked = MethodBind.get("DisplayServer", "global_menu_set_item_checked", 4108344793L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_checked, livePtr, menu_root, idx, checked)
  }

  /** DisplayServer.global_menu_set_item_checkable */
  final def globalMenuSetItemCheckable(menu_root: String, idx: Long, checkable: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_checkable == null) gdext.classes.DisplayServer.mb_global_menu_set_item_checkable = MethodBind.get("DisplayServer", "global_menu_set_item_checkable", 4108344793L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_checkable, livePtr, menu_root, idx, checkable)
  }

  /** DisplayServer.global_menu_set_item_radio_checkable */
  final def globalMenuSetItemRadioCheckable(menu_root: String, idx: Long, checkable: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_radio_checkable == null) gdext.classes.DisplayServer.mb_global_menu_set_item_radio_checkable = MethodBind.get("DisplayServer", "global_menu_set_item_radio_checkable", 4108344793L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_radio_checkable, livePtr, menu_root, idx, checkable)
  }

  /** DisplayServer.global_menu_set_item_text */
  final def globalMenuSetItemText(menu_root: String, idx: Long, text: String): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_text == null) gdext.classes.DisplayServer.mb_global_menu_set_item_text = MethodBind.get("DisplayServer", "global_menu_set_item_text", 965966136L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_text, livePtr, menu_root, idx, text)
  }

  /** DisplayServer.global_menu_set_item_submenu */
  final def globalMenuSetItemSubmenu(menu_root: String, idx: Long, submenu: String): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_submenu == null) gdext.classes.DisplayServer.mb_global_menu_set_item_submenu = MethodBind.get("DisplayServer", "global_menu_set_item_submenu", 965966136L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_submenu, livePtr, menu_root, idx, submenu)
  }

  /** DisplayServer.global_menu_set_item_accelerator */
  final def globalMenuSetItemAccelerator(menu_root: String, idx: Long, keycode: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_accelerator == null) gdext.classes.DisplayServer.mb_global_menu_set_item_accelerator = MethodBind.get("DisplayServer", "global_menu_set_item_accelerator", 566943293L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_accelerator, livePtr, menu_root, idx, keycode)
  }

  /** DisplayServer.global_menu_set_item_disabled */
  final def globalMenuSetItemDisabled(menu_root: String, idx: Long, disabled: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_disabled == null) gdext.classes.DisplayServer.mb_global_menu_set_item_disabled = MethodBind.get("DisplayServer", "global_menu_set_item_disabled", 4108344793L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_disabled, livePtr, menu_root, idx, disabled)
  }

  /** DisplayServer.global_menu_set_item_hidden */
  final def globalMenuSetItemHidden(menu_root: String, idx: Long, hidden: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_hidden == null) gdext.classes.DisplayServer.mb_global_menu_set_item_hidden = MethodBind.get("DisplayServer", "global_menu_set_item_hidden", 4108344793L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_hidden, livePtr, menu_root, idx, hidden)
  }

  /** DisplayServer.global_menu_set_item_tooltip */
  final def globalMenuSetItemTooltip(menu_root: String, idx: Long, tooltip: String): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_tooltip == null) gdext.classes.DisplayServer.mb_global_menu_set_item_tooltip = MethodBind.get("DisplayServer", "global_menu_set_item_tooltip", 965966136L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_tooltip, livePtr, menu_root, idx, tooltip)
  }

  /** DisplayServer.global_menu_set_item_state */
  final def globalMenuSetItemState(menu_root: String, idx: Long, state: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_state == null) gdext.classes.DisplayServer.mb_global_menu_set_item_state = MethodBind.get("DisplayServer", "global_menu_set_item_state", 3474840532L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_state, livePtr, menu_root, idx, state)
  }

  /** DisplayServer.global_menu_set_item_max_states */
  final def globalMenuSetItemMaxStates(menu_root: String, idx: Long, max_states: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_max_states == null) gdext.classes.DisplayServer.mb_global_menu_set_item_max_states = MethodBind.get("DisplayServer", "global_menu_set_item_max_states", 3474840532L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_max_states, livePtr, menu_root, idx, max_states)
  }

  /** DisplayServer.global_menu_set_item_icon */
  final def globalMenuSetItemIcon(menu_root: String, idx: Long, icon: Texture2D): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_icon == null) gdext.classes.DisplayServer.mb_global_menu_set_item_icon = MethodBind.get("DisplayServer", "global_menu_set_item_icon", 3201338066L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_icon, livePtr, menu_root, idx, Wrappers.handle(icon))
  }

  /** DisplayServer.global_menu_set_item_indentation_level */
  final def globalMenuSetItemIndentationLevel(menu_root: String, idx: Long, level: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_indentation_level == null) gdext.classes.DisplayServer.mb_global_menu_set_item_indentation_level = MethodBind.get("DisplayServer", "global_menu_set_item_indentation_level", 3474840532L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_indentation_level, livePtr, menu_root, idx, level)
  }

  /** DisplayServer.global_menu_get_item_count */
  final def globalMenuGetItemCount(menu_root: String): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_count == null) gdext.classes.DisplayServer.mb_global_menu_get_item_count = MethodBind.get("DisplayServer", "global_menu_get_item_count", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_count, livePtr, menu_root)
  }

  /** DisplayServer.global_menu_remove_item */
  final def globalMenuRemoveItem(menu_root: String, idx: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_remove_item == null) gdext.classes.DisplayServer.mb_global_menu_remove_item = MethodBind.get("DisplayServer", "global_menu_remove_item", 2956805083L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_global_menu_remove_item, livePtr, menu_root, idx)
  }

  /** DisplayServer.global_menu_clear */
  final def globalMenuClear(menu_root: String): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_clear == null) gdext.classes.DisplayServer.mb_global_menu_clear = MethodBind.get("DisplayServer", "global_menu_clear", 83702148L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_global_menu_clear, livePtr, menu_root)
  }

  /** DisplayServer.tts_is_speaking */
  final def ttsIsSpeaking(): Boolean = {
    if (gdext.classes.DisplayServer.mb_tts_is_speaking == null) gdext.classes.DisplayServer.mb_tts_is_speaking = MethodBind.get("DisplayServer", "tts_is_speaking", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_tts_is_speaking, livePtr)
  }

  /** DisplayServer.tts_is_paused */
  final def ttsIsPaused(): Boolean = {
    if (gdext.classes.DisplayServer.mb_tts_is_paused == null) gdext.classes.DisplayServer.mb_tts_is_paused = MethodBind.get("DisplayServer", "tts_is_paused", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_tts_is_paused, livePtr)
  }

  /** DisplayServer.tts_pause */
  final def ttsPause(): Unit = {
    if (gdext.classes.DisplayServer.mb_tts_pause == null) gdext.classes.DisplayServer.mb_tts_pause = MethodBind.get("DisplayServer", "tts_pause", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.DisplayServer.mb_tts_pause, livePtr)
  }

  /** DisplayServer.tts_resume */
  final def ttsResume(): Unit = {
    if (gdext.classes.DisplayServer.mb_tts_resume == null) gdext.classes.DisplayServer.mb_tts_resume = MethodBind.get("DisplayServer", "tts_resume", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.DisplayServer.mb_tts_resume, livePtr)
  }

  /** DisplayServer.tts_stop */
  final def ttsStop(): Unit = {
    if (gdext.classes.DisplayServer.mb_tts_stop == null) gdext.classes.DisplayServer.mb_tts_stop = MethodBind.get("DisplayServer", "tts_stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.DisplayServer.mb_tts_stop, livePtr)
  }

  /** DisplayServer.is_dark_mode_supported */
  final def isDarkModeSupported(): Boolean = {
    if (gdext.classes.DisplayServer.mb_is_dark_mode_supported == null) gdext.classes.DisplayServer.mb_is_dark_mode_supported = MethodBind.get("DisplayServer", "is_dark_mode_supported", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_is_dark_mode_supported, livePtr)
  }

  /** DisplayServer.is_dark_mode */
  final def isDarkMode(): Boolean = {
    if (gdext.classes.DisplayServer.mb_is_dark_mode == null) gdext.classes.DisplayServer.mb_is_dark_mode = MethodBind.get("DisplayServer", "is_dark_mode", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_is_dark_mode, livePtr)
  }

  /** DisplayServer.get_accent_color */
  final def getAccentColor(): gdext.builtin.Color = {
    if (gdext.classes.DisplayServer.mb_get_accent_color == null) gdext.classes.DisplayServer.mb_get_accent_color = MethodBind.get("DisplayServer", "get_accent_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.DisplayServer.mb_get_accent_color, livePtr)
  }

  /** DisplayServer.get_base_color */
  final def getBaseColor(): gdext.builtin.Color = {
    if (gdext.classes.DisplayServer.mb_get_base_color == null) gdext.classes.DisplayServer.mb_get_base_color = MethodBind.get("DisplayServer", "get_base_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.DisplayServer.mb_get_base_color, livePtr)
  }

  /** DisplayServer.mouse_set_mode */
  final def mouseSetMode(mouse_mode: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_mouse_set_mode == null) gdext.classes.DisplayServer.mb_mouse_set_mode = MethodBind.get("DisplayServer", "mouse_set_mode", 348288463L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_mouse_set_mode, livePtr, mouse_mode)
  }

  /** DisplayServer.mouse_get_mode */
  final def mouseGetMode(): Long = {
    if (gdext.classes.DisplayServer.mb_mouse_get_mode == null) gdext.classes.DisplayServer.mb_mouse_get_mode = MethodBind.get("DisplayServer", "mouse_get_mode", 1353961651L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_mouse_get_mode, livePtr)
  }

  /** DisplayServer.warp_mouse */
  final def warpMouse(position: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.DisplayServer.mb_warp_mouse == null) gdext.classes.DisplayServer.mb_warp_mouse = MethodBind.get("DisplayServer", "warp_mouse", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_warp_mouse, livePtr, position)
  }

  /** DisplayServer.mouse_get_position */
  final def mouseGetPosition(): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_mouse_get_position == null) gdext.classes.DisplayServer.mb_mouse_get_position = MethodBind.get("DisplayServer", "mouse_get_position", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_mouse_get_position, livePtr)
  }

  /** DisplayServer.mouse_get_button_state */
  final def mouseGetButtonState(): Long = {
    if (gdext.classes.DisplayServer.mb_mouse_get_button_state == null) gdext.classes.DisplayServer.mb_mouse_get_button_state = MethodBind.get("DisplayServer", "mouse_get_button_state", 2512161324L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_mouse_get_button_state, livePtr)
  }

  /** DisplayServer.clipboard_set */
  final def clipboardSet(clipboard: String): Unit = {
    if (gdext.classes.DisplayServer.mb_clipboard_set == null) gdext.classes.DisplayServer.mb_clipboard_set = MethodBind.get("DisplayServer", "clipboard_set", 83702148L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_clipboard_set, livePtr, clipboard)
  }

  /** DisplayServer.clipboard_get */
  final def clipboardGet(): String = {
    if (gdext.classes.DisplayServer.mb_clipboard_get == null) gdext.classes.DisplayServer.mb_clipboard_get = MethodBind.get("DisplayServer", "clipboard_get", 201670096L)
    Ptrcall.call0[String](gdext.classes.DisplayServer.mb_clipboard_get, livePtr)
  }

  /** DisplayServer.clipboard_get_image. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def clipboardGetImage(): Image = {
    if (gdext.classes.DisplayServer.mb_clipboard_get_image == null) gdext.classes.DisplayServer.mb_clipboard_get_image = MethodBind.get("DisplayServer", "clipboard_get_image", 4190603485L)
    Wrappers.owned[Image](Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_clipboard_get_image, livePtr))
  }

  /** DisplayServer.clipboard_has */
  final def clipboardHas(): Boolean = {
    if (gdext.classes.DisplayServer.mb_clipboard_has == null) gdext.classes.DisplayServer.mb_clipboard_has = MethodBind.get("DisplayServer", "clipboard_has", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_clipboard_has, livePtr)
  }

  /** DisplayServer.clipboard_has_image */
  final def clipboardHasImage(): Boolean = {
    if (gdext.classes.DisplayServer.mb_clipboard_has_image == null) gdext.classes.DisplayServer.mb_clipboard_has_image = MethodBind.get("DisplayServer", "clipboard_has_image", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_clipboard_has_image, livePtr)
  }

  /** DisplayServer.clipboard_set_primary */
  final def clipboardSetPrimary(clipboard_primary: String): Unit = {
    if (gdext.classes.DisplayServer.mb_clipboard_set_primary == null) gdext.classes.DisplayServer.mb_clipboard_set_primary = MethodBind.get("DisplayServer", "clipboard_set_primary", 83702148L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_clipboard_set_primary, livePtr, clipboard_primary)
  }

  /** DisplayServer.clipboard_get_primary */
  final def clipboardGetPrimary(): String = {
    if (gdext.classes.DisplayServer.mb_clipboard_get_primary == null) gdext.classes.DisplayServer.mb_clipboard_get_primary = MethodBind.get("DisplayServer", "clipboard_get_primary", 201670096L)
    Ptrcall.call0[String](gdext.classes.DisplayServer.mb_clipboard_get_primary, livePtr)
  }

  /** DisplayServer.get_display_safe_area */
  final def getDisplaySafeArea(): gdext.builtin.Rect2i = {
    if (gdext.classes.DisplayServer.mb_get_display_safe_area == null) gdext.classes.DisplayServer.mb_get_display_safe_area = MethodBind.get("DisplayServer", "get_display_safe_area", 410525958L)
    Ptrcall.call0[gdext.builtin.Rect2i](gdext.classes.DisplayServer.mb_get_display_safe_area, livePtr)
  }

  /** DisplayServer.get_screen_count */
  final def getScreenCount(): Long = {
    if (gdext.classes.DisplayServer.mb_get_screen_count == null) gdext.classes.DisplayServer.mb_get_screen_count = MethodBind.get("DisplayServer", "get_screen_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_get_screen_count, livePtr)
  }

  /** DisplayServer.get_primary_screen */
  final def getPrimaryScreen(): Long = {
    if (gdext.classes.DisplayServer.mb_get_primary_screen == null) gdext.classes.DisplayServer.mb_get_primary_screen = MethodBind.get("DisplayServer", "get_primary_screen", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_get_primary_screen, livePtr)
  }

  /** DisplayServer.get_keyboard_focus_screen */
  final def getKeyboardFocusScreen(): Long = {
    if (gdext.classes.DisplayServer.mb_get_keyboard_focus_screen == null) gdext.classes.DisplayServer.mb_get_keyboard_focus_screen = MethodBind.get("DisplayServer", "get_keyboard_focus_screen", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_get_keyboard_focus_screen, livePtr)
  }

  /** DisplayServer.get_screen_from_rect */
  final def getScreenFromRect(rect: gdext.builtin.Rect2): Long = {
    if (gdext.classes.DisplayServer.mb_get_screen_from_rect == null) gdext.classes.DisplayServer.mb_get_screen_from_rect = MethodBind.get("DisplayServer", "get_screen_from_rect", 741354659L)
    Ptrcall.call1[gdext.builtin.Rect2, Long](gdext.classes.DisplayServer.mb_get_screen_from_rect, livePtr, rect)
  }

  /** DisplayServer.screen_get_position */
  final def screenGetPosition(screen: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_screen_get_position == null) gdext.classes.DisplayServer.mb_screen_get_position = MethodBind.get("DisplayServer", "screen_get_position", 1725937825L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_screen_get_position, livePtr, screen)
  }

  /** DisplayServer.screen_get_size */
  final def screenGetSize(screen: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_screen_get_size == null) gdext.classes.DisplayServer.mb_screen_get_size = MethodBind.get("DisplayServer", "screen_get_size", 1725937825L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_screen_get_size, livePtr, screen)
  }

  /** DisplayServer.screen_get_usable_rect */
  final def screenGetUsableRect(screen: Long): gdext.builtin.Rect2i = {
    if (gdext.classes.DisplayServer.mb_screen_get_usable_rect == null) gdext.classes.DisplayServer.mb_screen_get_usable_rect = MethodBind.get("DisplayServer", "screen_get_usable_rect", 2439012528L)
    Ptrcall.call1[Long, gdext.builtin.Rect2i](gdext.classes.DisplayServer.mb_screen_get_usable_rect, livePtr, screen)
  }

  /** DisplayServer.screen_get_dpi */
  final def screenGetDpi(screen: Long): Long = {
    if (gdext.classes.DisplayServer.mb_screen_get_dpi == null) gdext.classes.DisplayServer.mb_screen_get_dpi = MethodBind.get("DisplayServer", "screen_get_dpi", 181039630L)
    Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_screen_get_dpi, livePtr, screen)
  }

  /** DisplayServer.screen_get_scale */
  final def screenGetScale(screen: Long): Double = {
    if (gdext.classes.DisplayServer.mb_screen_get_scale == null) gdext.classes.DisplayServer.mb_screen_get_scale = MethodBind.get("DisplayServer", "screen_get_scale", 909105437L)
    Ptrcall.call1[Long, Double](gdext.classes.DisplayServer.mb_screen_get_scale, livePtr, screen)
  }

  /** DisplayServer.is_touchscreen_available */
  final def isTouchscreenAvailable(): Boolean = {
    if (gdext.classes.DisplayServer.mb_is_touchscreen_available == null) gdext.classes.DisplayServer.mb_is_touchscreen_available = MethodBind.get("DisplayServer", "is_touchscreen_available", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_is_touchscreen_available, livePtr)
  }

  /** DisplayServer.screen_get_max_scale */
  final def screenGetMaxScale(): Double = {
    if (gdext.classes.DisplayServer.mb_screen_get_max_scale == null) gdext.classes.DisplayServer.mb_screen_get_max_scale = MethodBind.get("DisplayServer", "screen_get_max_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.DisplayServer.mb_screen_get_max_scale, livePtr)
  }

  /** DisplayServer.screen_get_refresh_rate */
  final def screenGetRefreshRate(screen: Long): Double = {
    if (gdext.classes.DisplayServer.mb_screen_get_refresh_rate == null) gdext.classes.DisplayServer.mb_screen_get_refresh_rate = MethodBind.get("DisplayServer", "screen_get_refresh_rate", 909105437L)
    Ptrcall.call1[Long, Double](gdext.classes.DisplayServer.mb_screen_get_refresh_rate, livePtr, screen)
  }

  /** DisplayServer.screen_get_pixel */
  final def screenGetPixel(position: gdext.builtin.Vector2i): gdext.builtin.Color = {
    if (gdext.classes.DisplayServer.mb_screen_get_pixel == null) gdext.classes.DisplayServer.mb_screen_get_pixel = MethodBind.get("DisplayServer", "screen_get_pixel", 1532707496L)
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Color](gdext.classes.DisplayServer.mb_screen_get_pixel, livePtr, position)
  }

  /** DisplayServer.screen_get_image. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def screenGetImage(screen: Long): Image = {
    if (gdext.classes.DisplayServer.mb_screen_get_image == null) gdext.classes.DisplayServer.mb_screen_get_image = MethodBind.get("DisplayServer", "screen_get_image", 3813388802L)
    Wrappers.owned[Image](Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_screen_get_image, livePtr, screen))
  }

  /** DisplayServer.screen_get_image_rect. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def screenGetImageRect(rect: gdext.builtin.Rect2i): Image = {
    if (gdext.classes.DisplayServer.mb_screen_get_image_rect == null) gdext.classes.DisplayServer.mb_screen_get_image_rect = MethodBind.get("DisplayServer", "screen_get_image_rect", 2601441065L)
    Wrappers.owned[Image](Ptrcall.call1[gdext.builtin.Rect2i, Long](gdext.classes.DisplayServer.mb_screen_get_image_rect, livePtr, rect))
  }

  /** DisplayServer.screen_set_orientation */
  final def screenSetOrientation(orientation: Long, screen: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_screen_set_orientation == null) gdext.classes.DisplayServer.mb_screen_set_orientation = MethodBind.get("DisplayServer", "screen_set_orientation", 2211511631L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_screen_set_orientation, livePtr, orientation, screen)
  }

  /** DisplayServer.screen_get_orientation */
  final def screenGetOrientation(screen: Long): Long = {
    if (gdext.classes.DisplayServer.mb_screen_get_orientation == null) gdext.classes.DisplayServer.mb_screen_get_orientation = MethodBind.get("DisplayServer", "screen_get_orientation", 133818562L)
    Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_screen_get_orientation, livePtr, screen)
  }

  /** DisplayServer.screen_set_keep_on */
  final def screenSetKeepOn(enable: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_screen_set_keep_on == null) gdext.classes.DisplayServer.mb_screen_set_keep_on = MethodBind.get("DisplayServer", "screen_set_keep_on", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_screen_set_keep_on, livePtr, enable)
  }

  /** DisplayServer.screen_is_kept_on */
  final def screenIsKeptOn(): Boolean = {
    if (gdext.classes.DisplayServer.mb_screen_is_kept_on == null) gdext.classes.DisplayServer.mb_screen_is_kept_on = MethodBind.get("DisplayServer", "screen_is_kept_on", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_screen_is_kept_on, livePtr)
  }

  /** DisplayServer.get_window_at_screen_position */
  final def getWindowAtScreenPosition(position: gdext.builtin.Vector2i): Long = {
    if (gdext.classes.DisplayServer.mb_get_window_at_screen_position == null) gdext.classes.DisplayServer.mb_get_window_at_screen_position = MethodBind.get("DisplayServer", "get_window_at_screen_position", 2485466453L)
    Ptrcall.call1[gdext.builtin.Vector2i, Long](gdext.classes.DisplayServer.mb_get_window_at_screen_position, livePtr, position)
  }

  /** DisplayServer.window_get_native_handle */
  final def windowGetNativeHandle(handle_type: Long, window_id: Long): Long = {
    if (gdext.classes.DisplayServer.mb_window_get_native_handle == null) gdext.classes.DisplayServer.mb_window_get_native_handle = MethodBind.get("DisplayServer", "window_get_native_handle", 1096425680L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.DisplayServer.mb_window_get_native_handle, livePtr, handle_type, window_id)
  }

  /** DisplayServer.window_get_active_popup */
  final def windowGetActivePopup(): Long = {
    if (gdext.classes.DisplayServer.mb_window_get_active_popup == null) gdext.classes.DisplayServer.mb_window_get_active_popup = MethodBind.get("DisplayServer", "window_get_active_popup", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_window_get_active_popup, livePtr)
  }

  /** DisplayServer.window_set_popup_safe_rect */
  final def windowSetPopupSafeRect(window: Long, rect: gdext.builtin.Rect2i): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_popup_safe_rect == null) gdext.classes.DisplayServer.mb_window_set_popup_safe_rect = MethodBind.get("DisplayServer", "window_set_popup_safe_rect", 3317281434L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_popup_safe_rect, livePtr, window, rect)
  }

  /** DisplayServer.window_get_popup_safe_rect */
  final def windowGetPopupSafeRect(window: Long): gdext.builtin.Rect2i = {
    if (gdext.classes.DisplayServer.mb_window_get_popup_safe_rect == null) gdext.classes.DisplayServer.mb_window_get_popup_safe_rect = MethodBind.get("DisplayServer", "window_get_popup_safe_rect", 2161169500L)
    Ptrcall.call1[Long, gdext.builtin.Rect2i](gdext.classes.DisplayServer.mb_window_get_popup_safe_rect, livePtr, window)
  }

  /** DisplayServer.window_set_title */
  final def windowSetTitle(title: String, window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_title == null) gdext.classes.DisplayServer.mb_window_set_title = MethodBind.get("DisplayServer", "window_set_title", 441246282L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_title, livePtr, title, window_id)
  }

  /** DisplayServer.window_get_title_size */
  final def windowGetTitleSize(title: String, window_id: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_title_size == null) gdext.classes.DisplayServer.mb_window_get_title_size = MethodBind.get("DisplayServer", "window_get_title_size", 2925301799L)
    Ptrcall.call2[String, Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_title_size, livePtr, title, window_id)
  }

  /** DisplayServer.window_get_current_screen */
  final def windowGetCurrentScreen(window_id: Long): Long = {
    if (gdext.classes.DisplayServer.mb_window_get_current_screen == null) gdext.classes.DisplayServer.mb_window_get_current_screen = MethodBind.get("DisplayServer", "window_get_current_screen", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_window_get_current_screen, livePtr, window_id)
  }

  /** DisplayServer.window_set_current_screen */
  final def windowSetCurrentScreen(screen: Long, window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_current_screen == null) gdext.classes.DisplayServer.mb_window_set_current_screen = MethodBind.get("DisplayServer", "window_set_current_screen", 2230941749L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_current_screen, livePtr, screen, window_id)
  }

  /** DisplayServer.window_get_position */
  final def windowGetPosition(window_id: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_position == null) gdext.classes.DisplayServer.mb_window_get_position = MethodBind.get("DisplayServer", "window_get_position", 763922886L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_position, livePtr, window_id)
  }

  /** DisplayServer.window_get_position_with_decorations */
  final def windowGetPositionWithDecorations(window_id: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_position_with_decorations == null) gdext.classes.DisplayServer.mb_window_get_position_with_decorations = MethodBind.get("DisplayServer", "window_get_position_with_decorations", 763922886L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_position_with_decorations, livePtr, window_id)
  }

  /** DisplayServer.window_set_position */
  final def windowSetPosition(position: gdext.builtin.Vector2i, window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_position == null) gdext.classes.DisplayServer.mb_window_set_position = MethodBind.get("DisplayServer", "window_set_position", 2019273902L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_position, livePtr, position, window_id)
  }

  /** DisplayServer.window_get_size */
  final def windowGetSize(window_id: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_size == null) gdext.classes.DisplayServer.mb_window_get_size = MethodBind.get("DisplayServer", "window_get_size", 763922886L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_size, livePtr, window_id)
  }

  /** DisplayServer.window_set_size */
  final def windowSetSize(size: gdext.builtin.Vector2i, window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_size == null) gdext.classes.DisplayServer.mb_window_set_size = MethodBind.get("DisplayServer", "window_set_size", 2019273902L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_size, livePtr, size, window_id)
  }

  /** DisplayServer.window_get_attached_instance_id */
  final def windowGetAttachedInstanceId(window_id: Long): Long = {
    if (gdext.classes.DisplayServer.mb_window_get_attached_instance_id == null) gdext.classes.DisplayServer.mb_window_get_attached_instance_id = MethodBind.get("DisplayServer", "window_get_attached_instance_id", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_window_get_attached_instance_id, livePtr, window_id)
  }

  /** DisplayServer.window_get_max_size */
  final def windowGetMaxSize(window_id: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_max_size == null) gdext.classes.DisplayServer.mb_window_get_max_size = MethodBind.get("DisplayServer", "window_get_max_size", 763922886L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_max_size, livePtr, window_id)
  }

  /** DisplayServer.window_set_max_size */
  final def windowSetMaxSize(max_size: gdext.builtin.Vector2i, window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_max_size == null) gdext.classes.DisplayServer.mb_window_set_max_size = MethodBind.get("DisplayServer", "window_set_max_size", 2019273902L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_max_size, livePtr, max_size, window_id)
  }

  /** DisplayServer.window_get_min_size */
  final def windowGetMinSize(window_id: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_min_size == null) gdext.classes.DisplayServer.mb_window_get_min_size = MethodBind.get("DisplayServer", "window_get_min_size", 763922886L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_min_size, livePtr, window_id)
  }

  /** DisplayServer.window_set_min_size */
  final def windowSetMinSize(min_size: gdext.builtin.Vector2i, window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_min_size == null) gdext.classes.DisplayServer.mb_window_set_min_size = MethodBind.get("DisplayServer", "window_set_min_size", 2019273902L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_min_size, livePtr, min_size, window_id)
  }

  /** DisplayServer.window_get_size_with_decorations */
  final def windowGetSizeWithDecorations(window_id: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_size_with_decorations == null) gdext.classes.DisplayServer.mb_window_get_size_with_decorations = MethodBind.get("DisplayServer", "window_get_size_with_decorations", 763922886L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_size_with_decorations, livePtr, window_id)
  }

  /** DisplayServer.window_get_mode */
  final def windowGetMode(window_id: Long): Long = {
    if (gdext.classes.DisplayServer.mb_window_get_mode == null) gdext.classes.DisplayServer.mb_window_get_mode = MethodBind.get("DisplayServer", "window_get_mode", 2185728461L)
    Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_window_get_mode, livePtr, window_id)
  }

  /** DisplayServer.window_set_mode */
  final def windowSetMode(mode: Long, window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_mode == null) gdext.classes.DisplayServer.mb_window_set_mode = MethodBind.get("DisplayServer", "window_set_mode", 1319965401L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_mode, livePtr, mode, window_id)
  }

  /** DisplayServer.window_set_flag */
  final def windowSetFlag(flag: Long, enabled: Boolean, window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_flag == null) gdext.classes.DisplayServer.mb_window_set_flag = MethodBind.get("DisplayServer", "window_set_flag", 254894155L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_window_set_flag, livePtr, flag, enabled, window_id)
  }

  /** DisplayServer.window_get_flag */
  final def windowGetFlag(flag: Long, window_id: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_window_get_flag == null) gdext.classes.DisplayServer.mb_window_get_flag = MethodBind.get("DisplayServer", "window_get_flag", 802816991L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.DisplayServer.mb_window_get_flag, livePtr, flag, window_id)
  }

  /** DisplayServer.window_set_window_buttons_offset */
  final def windowSetWindowButtonsOffset(offset: gdext.builtin.Vector2i, window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_window_buttons_offset == null) gdext.classes.DisplayServer.mb_window_set_window_buttons_offset = MethodBind.get("DisplayServer", "window_set_window_buttons_offset", 2019273902L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_window_buttons_offset, livePtr, offset, window_id)
  }

  /** DisplayServer.window_get_safe_title_margins */
  final def windowGetSafeTitleMargins(window_id: Long): gdext.builtin.Vector3i = {
    if (gdext.classes.DisplayServer.mb_window_get_safe_title_margins == null) gdext.classes.DisplayServer.mb_window_get_safe_title_margins = MethodBind.get("DisplayServer", "window_get_safe_title_margins", 2295066620L)
    Ptrcall.call1[Long, gdext.builtin.Vector3i](gdext.classes.DisplayServer.mb_window_get_safe_title_margins, livePtr, window_id)
  }

  /** DisplayServer.window_request_attention */
  final def windowRequestAttention(window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_request_attention == null) gdext.classes.DisplayServer.mb_window_request_attention = MethodBind.get("DisplayServer", "window_request_attention", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_window_request_attention, livePtr, window_id)
  }

  /** DisplayServer.window_move_to_foreground */
  final def windowMoveToForeground(window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_move_to_foreground == null) gdext.classes.DisplayServer.mb_window_move_to_foreground = MethodBind.get("DisplayServer", "window_move_to_foreground", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_window_move_to_foreground, livePtr, window_id)
  }

  /** DisplayServer.window_is_focused */
  final def windowIsFocused(window_id: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_window_is_focused == null) gdext.classes.DisplayServer.mb_window_is_focused = MethodBind.get("DisplayServer", "window_is_focused", 1051549951L)
    Ptrcall.call1[Long, Boolean](gdext.classes.DisplayServer.mb_window_is_focused, livePtr, window_id)
  }

  /** DisplayServer.window_can_draw */
  final def windowCanDraw(window_id: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_window_can_draw == null) gdext.classes.DisplayServer.mb_window_can_draw = MethodBind.get("DisplayServer", "window_can_draw", 1051549951L)
    Ptrcall.call1[Long, Boolean](gdext.classes.DisplayServer.mb_window_can_draw, livePtr, window_id)
  }

  /** DisplayServer.window_set_transient */
  final def windowSetTransient(window_id: Long, parent_window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_transient == null) gdext.classes.DisplayServer.mb_window_set_transient = MethodBind.get("DisplayServer", "window_set_transient", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_transient, livePtr, window_id, parent_window_id)
  }

  /** DisplayServer.window_set_exclusive */
  final def windowSetExclusive(window_id: Long, exclusive: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_exclusive == null) gdext.classes.DisplayServer.mb_window_set_exclusive = MethodBind.get("DisplayServer", "window_set_exclusive", 300928843L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_exclusive, livePtr, window_id, exclusive)
  }

  /** DisplayServer.window_set_ime_active */
  final def windowSetImeActive(active: Boolean, window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_ime_active == null) gdext.classes.DisplayServer.mb_window_set_ime_active = MethodBind.get("DisplayServer", "window_set_ime_active", 1661950165L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_ime_active, livePtr, active, window_id)
  }

  /** DisplayServer.window_set_ime_position */
  final def windowSetImePosition(position: gdext.builtin.Vector2i, window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_ime_position == null) gdext.classes.DisplayServer.mb_window_set_ime_position = MethodBind.get("DisplayServer", "window_set_ime_position", 2019273902L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_ime_position, livePtr, position, window_id)
  }

  /** DisplayServer.window_set_vsync_mode */
  final def windowSetVsyncMode(vsync_mode: Long, window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_vsync_mode == null) gdext.classes.DisplayServer.mb_window_set_vsync_mode = MethodBind.get("DisplayServer", "window_set_vsync_mode", 2179333492L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_vsync_mode, livePtr, vsync_mode, window_id)
  }

  /** DisplayServer.window_get_vsync_mode */
  final def windowGetVsyncMode(window_id: Long): Long = {
    if (gdext.classes.DisplayServer.mb_window_get_vsync_mode == null) gdext.classes.DisplayServer.mb_window_get_vsync_mode = MethodBind.get("DisplayServer", "window_get_vsync_mode", 578873795L)
    Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_window_get_vsync_mode, livePtr, window_id)
  }

  /** DisplayServer.window_is_maximize_allowed */
  final def windowIsMaximizeAllowed(window_id: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_window_is_maximize_allowed == null) gdext.classes.DisplayServer.mb_window_is_maximize_allowed = MethodBind.get("DisplayServer", "window_is_maximize_allowed", 1051549951L)
    Ptrcall.call1[Long, Boolean](gdext.classes.DisplayServer.mb_window_is_maximize_allowed, livePtr, window_id)
  }

  /** DisplayServer.window_maximize_on_title_dbl_click */
  final def windowMaximizeOnTitleDblClick(): Boolean = {
    if (gdext.classes.DisplayServer.mb_window_maximize_on_title_dbl_click == null) gdext.classes.DisplayServer.mb_window_maximize_on_title_dbl_click = MethodBind.get("DisplayServer", "window_maximize_on_title_dbl_click", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_window_maximize_on_title_dbl_click, livePtr)
  }

  /** DisplayServer.window_minimize_on_title_dbl_click */
  final def windowMinimizeOnTitleDblClick(): Boolean = {
    if (gdext.classes.DisplayServer.mb_window_minimize_on_title_dbl_click == null) gdext.classes.DisplayServer.mb_window_minimize_on_title_dbl_click = MethodBind.get("DisplayServer", "window_minimize_on_title_dbl_click", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_window_minimize_on_title_dbl_click, livePtr)
  }

  /** DisplayServer.window_start_drag */
  final def windowStartDrag(window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_start_drag == null) gdext.classes.DisplayServer.mb_window_start_drag = MethodBind.get("DisplayServer", "window_start_drag", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_window_start_drag, livePtr, window_id)
  }

  /** DisplayServer.window_start_resize */
  final def windowStartResize(edge: Long, window_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_start_resize == null) gdext.classes.DisplayServer.mb_window_start_resize = MethodBind.get("DisplayServer", "window_start_resize", 4009722312L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_start_resize, livePtr, edge, window_id)
  }

  /** DisplayServer.window_set_color */
  final def windowSetColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_color == null) gdext.classes.DisplayServer.mb_window_set_color = MethodBind.get("DisplayServer", "window_set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_window_set_color, livePtr, color)
  }

  /** DisplayServer.accessibility_should_increase_contrast */
  final def accessibilityShouldIncreaseContrast(): Long = {
    if (gdext.classes.DisplayServer.mb_accessibility_should_increase_contrast == null) gdext.classes.DisplayServer.mb_accessibility_should_increase_contrast = MethodBind.get("DisplayServer", "accessibility_should_increase_contrast", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_accessibility_should_increase_contrast, livePtr)
  }

  /** DisplayServer.accessibility_should_reduce_animation */
  final def accessibilityShouldReduceAnimation(): Long = {
    if (gdext.classes.DisplayServer.mb_accessibility_should_reduce_animation == null) gdext.classes.DisplayServer.mb_accessibility_should_reduce_animation = MethodBind.get("DisplayServer", "accessibility_should_reduce_animation", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_accessibility_should_reduce_animation, livePtr)
  }

  /** DisplayServer.accessibility_should_reduce_transparency */
  final def accessibilityShouldReduceTransparency(): Long = {
    if (gdext.classes.DisplayServer.mb_accessibility_should_reduce_transparency == null) gdext.classes.DisplayServer.mb_accessibility_should_reduce_transparency = MethodBind.get("DisplayServer", "accessibility_should_reduce_transparency", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_accessibility_should_reduce_transparency, livePtr)
  }

  /** DisplayServer.accessibility_screen_reader_active */
  final def accessibilityScreenReaderActive(): Long = {
    if (gdext.classes.DisplayServer.mb_accessibility_screen_reader_active == null) gdext.classes.DisplayServer.mb_accessibility_screen_reader_active = MethodBind.get("DisplayServer", "accessibility_screen_reader_active", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_accessibility_screen_reader_active, livePtr)
  }

  /** DisplayServer.accessibility_set_window_rect */
  final def accessibilitySetWindowRect(window_id: Long, rect_out: gdext.builtin.Rect2, rect_in: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.DisplayServer.mb_accessibility_set_window_rect == null) gdext.classes.DisplayServer.mb_accessibility_set_window_rect = MethodBind.get("DisplayServer", "accessibility_set_window_rect", 2386961724L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_accessibility_set_window_rect, livePtr, window_id, rect_out, rect_in)
  }

  /** DisplayServer.accessibility_set_window_focused */
  final def accessibilitySetWindowFocused(window_id: Long, focused: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_accessibility_set_window_focused == null) gdext.classes.DisplayServer.mb_accessibility_set_window_focused = MethodBind.get("DisplayServer", "accessibility_set_window_focused", 300928843L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_accessibility_set_window_focused, livePtr, window_id, focused)
  }

  /** DisplayServer.ime_get_selection */
  final def imeGetSelection(): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_ime_get_selection == null) gdext.classes.DisplayServer.mb_ime_get_selection = MethodBind.get("DisplayServer", "ime_get_selection", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_ime_get_selection, livePtr)
  }

  /** DisplayServer.ime_get_text */
  final def imeGetText(): String = {
    if (gdext.classes.DisplayServer.mb_ime_get_text == null) gdext.classes.DisplayServer.mb_ime_get_text = MethodBind.get("DisplayServer", "ime_get_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.DisplayServer.mb_ime_get_text, livePtr)
  }

  /** DisplayServer.virtual_keyboard_show */
  final def virtualKeyboardShow(existing_text: String, position: gdext.builtin.Rect2, `type`: Long, max_length: Long, cursor_start: Long, cursor_end: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_virtual_keyboard_show == null) gdext.classes.DisplayServer.mb_virtual_keyboard_show = MethodBind.get("DisplayServer", "virtual_keyboard_show", 3042891259L)
    Ptrcall.callVoid6(gdext.classes.DisplayServer.mb_virtual_keyboard_show, livePtr, existing_text, position, `type`, max_length, cursor_start, cursor_end)
  }

  /** DisplayServer.virtual_keyboard_hide */
  final def virtualKeyboardHide(): Unit = {
    if (gdext.classes.DisplayServer.mb_virtual_keyboard_hide == null) gdext.classes.DisplayServer.mb_virtual_keyboard_hide = MethodBind.get("DisplayServer", "virtual_keyboard_hide", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.DisplayServer.mb_virtual_keyboard_hide, livePtr)
  }

  /** DisplayServer.virtual_keyboard_get_height */
  final def virtualKeyboardGetHeight(): Long = {
    if (gdext.classes.DisplayServer.mb_virtual_keyboard_get_height == null) gdext.classes.DisplayServer.mb_virtual_keyboard_get_height = MethodBind.get("DisplayServer", "virtual_keyboard_get_height", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_virtual_keyboard_get_height, livePtr)
  }

  /** DisplayServer.has_hardware_keyboard */
  final def hasHardwareKeyboard(): Boolean = {
    if (gdext.classes.DisplayServer.mb_has_hardware_keyboard == null) gdext.classes.DisplayServer.mb_has_hardware_keyboard = MethodBind.get("DisplayServer", "has_hardware_keyboard", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_has_hardware_keyboard, livePtr)
  }

  /** DisplayServer.cursor_set_shape */
  final def cursorSetShape(shape: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_cursor_set_shape == null) gdext.classes.DisplayServer.mb_cursor_set_shape = MethodBind.get("DisplayServer", "cursor_set_shape", 2026291549L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_cursor_set_shape, livePtr, shape)
  }

  /** DisplayServer.cursor_get_shape */
  final def cursorGetShape(): Long = {
    if (gdext.classes.DisplayServer.mb_cursor_get_shape == null) gdext.classes.DisplayServer.mb_cursor_get_shape = MethodBind.get("DisplayServer", "cursor_get_shape", 1087724927L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_cursor_get_shape, livePtr)
  }

  /** DisplayServer.cursor_set_custom_image */
  final def cursorSetCustomImage(cursor: Resource, shape: Long, hotspot: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.DisplayServer.mb_cursor_set_custom_image == null) gdext.classes.DisplayServer.mb_cursor_set_custom_image = MethodBind.get("DisplayServer", "cursor_set_custom_image", 1816663697L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_cursor_set_custom_image, livePtr, Wrappers.handle(cursor), shape, hotspot)
  }

  /** DisplayServer.get_swap_cancel_ok */
  final def getSwapCancelOk(): Boolean = {
    if (gdext.classes.DisplayServer.mb_get_swap_cancel_ok == null) gdext.classes.DisplayServer.mb_get_swap_cancel_ok = MethodBind.get("DisplayServer", "get_swap_cancel_ok", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_get_swap_cancel_ok, livePtr)
  }

  /** DisplayServer.enable_for_stealing_focus */
  final def enableForStealingFocus(process_id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_enable_for_stealing_focus == null) gdext.classes.DisplayServer.mb_enable_for_stealing_focus = MethodBind.get("DisplayServer", "enable_for_stealing_focus", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_enable_for_stealing_focus, livePtr, process_id)
  }

  /** DisplayServer.beep */
  final def beep(): Unit = {
    if (gdext.classes.DisplayServer.mb_beep == null) gdext.classes.DisplayServer.mb_beep = MethodBind.get("DisplayServer", "beep", 4051624405L)
    Ptrcall.callVoid0(gdext.classes.DisplayServer.mb_beep, livePtr)
  }

  /** DisplayServer.keyboard_get_layout_count */
  final def keyboardGetLayoutCount(): Long = {
    if (gdext.classes.DisplayServer.mb_keyboard_get_layout_count == null) gdext.classes.DisplayServer.mb_keyboard_get_layout_count = MethodBind.get("DisplayServer", "keyboard_get_layout_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_keyboard_get_layout_count, livePtr)
  }

  /** DisplayServer.keyboard_get_current_layout */
  final def keyboardGetCurrentLayout(): Long = {
    if (gdext.classes.DisplayServer.mb_keyboard_get_current_layout == null) gdext.classes.DisplayServer.mb_keyboard_get_current_layout = MethodBind.get("DisplayServer", "keyboard_get_current_layout", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_keyboard_get_current_layout, livePtr)
  }

  /** DisplayServer.keyboard_set_current_layout */
  final def keyboardSetCurrentLayout(index: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_keyboard_set_current_layout == null) gdext.classes.DisplayServer.mb_keyboard_set_current_layout = MethodBind.get("DisplayServer", "keyboard_set_current_layout", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_keyboard_set_current_layout, livePtr, index)
  }

  /** DisplayServer.keyboard_get_layout_language */
  final def keyboardGetLayoutLanguage(index: Long): String = {
    if (gdext.classes.DisplayServer.mb_keyboard_get_layout_language == null) gdext.classes.DisplayServer.mb_keyboard_get_layout_language = MethodBind.get("DisplayServer", "keyboard_get_layout_language", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.DisplayServer.mb_keyboard_get_layout_language, livePtr, index)
  }

  /** DisplayServer.keyboard_get_layout_name */
  final def keyboardGetLayoutName(index: Long): String = {
    if (gdext.classes.DisplayServer.mb_keyboard_get_layout_name == null) gdext.classes.DisplayServer.mb_keyboard_get_layout_name = MethodBind.get("DisplayServer", "keyboard_get_layout_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.DisplayServer.mb_keyboard_get_layout_name, livePtr, index)
  }

  /** DisplayServer.keyboard_get_keycode_from_physical */
  final def keyboardGetKeycodeFromPhysical(keycode: Long): Long = {
    if (gdext.classes.DisplayServer.mb_keyboard_get_keycode_from_physical == null) gdext.classes.DisplayServer.mb_keyboard_get_keycode_from_physical = MethodBind.get("DisplayServer", "keyboard_get_keycode_from_physical", 3447613187L)
    Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_keyboard_get_keycode_from_physical, livePtr, keycode)
  }

  /** DisplayServer.keyboard_get_label_from_physical */
  final def keyboardGetLabelFromPhysical(keycode: Long): Long = {
    if (gdext.classes.DisplayServer.mb_keyboard_get_label_from_physical == null) gdext.classes.DisplayServer.mb_keyboard_get_label_from_physical = MethodBind.get("DisplayServer", "keyboard_get_label_from_physical", 3447613187L)
    Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_keyboard_get_label_from_physical, livePtr, keycode)
  }

  /** DisplayServer.show_emoji_and_symbol_picker */
  final def showEmojiAndSymbolPicker(): Unit = {
    if (gdext.classes.DisplayServer.mb_show_emoji_and_symbol_picker == null) gdext.classes.DisplayServer.mb_show_emoji_and_symbol_picker = MethodBind.get("DisplayServer", "show_emoji_and_symbol_picker", 4051624405L)
    Ptrcall.callVoid0(gdext.classes.DisplayServer.mb_show_emoji_and_symbol_picker, livePtr)
  }

  /** DisplayServer.process_events */
  final def processEvents(): Unit = {
    if (gdext.classes.DisplayServer.mb_process_events == null) gdext.classes.DisplayServer.mb_process_events = MethodBind.get("DisplayServer", "process_events", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.DisplayServer.mb_process_events, livePtr)
  }

  /** DisplayServer.force_process_and_drop_events */
  final def forceProcessAndDropEvents(): Unit = {
    if (gdext.classes.DisplayServer.mb_force_process_and_drop_events == null) gdext.classes.DisplayServer.mb_force_process_and_drop_events = MethodBind.get("DisplayServer", "force_process_and_drop_events", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.DisplayServer.mb_force_process_and_drop_events, livePtr)
  }

  /** DisplayServer.set_native_icon */
  final def setNativeIcon(filename: String): Unit = {
    if (gdext.classes.DisplayServer.mb_set_native_icon == null) gdext.classes.DisplayServer.mb_set_native_icon = MethodBind.get("DisplayServer", "set_native_icon", 83702148L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_set_native_icon, livePtr, filename)
  }

  /** DisplayServer.set_icon */
  final def setIcon(image: Image): Unit = {
    if (gdext.classes.DisplayServer.mb_set_icon == null) gdext.classes.DisplayServer.mb_set_icon = MethodBind.get("DisplayServer", "set_icon", 532598488L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_set_icon, livePtr, Wrappers.handle(image))
  }

  /** DisplayServer.status_indicator_set_icon */
  final def statusIndicatorSetIcon(id: Long, icon: Texture2D): Unit = {
    if (gdext.classes.DisplayServer.mb_status_indicator_set_icon == null) gdext.classes.DisplayServer.mb_status_indicator_set_icon = MethodBind.get("DisplayServer", "status_indicator_set_icon", 666127730L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_status_indicator_set_icon, livePtr, id, Wrappers.handle(icon))
  }

  /** DisplayServer.status_indicator_set_tooltip */
  final def statusIndicatorSetTooltip(id: Long, tooltip: String): Unit = {
    if (gdext.classes.DisplayServer.mb_status_indicator_set_tooltip == null) gdext.classes.DisplayServer.mb_status_indicator_set_tooltip = MethodBind.get("DisplayServer", "status_indicator_set_tooltip", 501894301L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_status_indicator_set_tooltip, livePtr, id, tooltip)
  }

  /** DisplayServer.status_indicator_get_rect */
  final def statusIndicatorGetRect(id: Long): gdext.builtin.Rect2 = {
    if (gdext.classes.DisplayServer.mb_status_indicator_get_rect == null) gdext.classes.DisplayServer.mb_status_indicator_get_rect = MethodBind.get("DisplayServer", "status_indicator_get_rect", 3327874267L)
    Ptrcall.call1[Long, gdext.builtin.Rect2](gdext.classes.DisplayServer.mb_status_indicator_get_rect, livePtr, id)
  }

  /** DisplayServer.delete_status_indicator */
  final def deleteStatusIndicator(id: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_delete_status_indicator == null) gdext.classes.DisplayServer.mb_delete_status_indicator = MethodBind.get("DisplayServer", "delete_status_indicator", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_delete_status_indicator, livePtr, id)
  }

  /** DisplayServer.tablet_get_driver_count */
  final def tabletGetDriverCount(): Long = {
    if (gdext.classes.DisplayServer.mb_tablet_get_driver_count == null) gdext.classes.DisplayServer.mb_tablet_get_driver_count = MethodBind.get("DisplayServer", "tablet_get_driver_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_tablet_get_driver_count, livePtr)
  }

  /** DisplayServer.tablet_get_driver_name */
  final def tabletGetDriverName(idx: Long): String = {
    if (gdext.classes.DisplayServer.mb_tablet_get_driver_name == null) gdext.classes.DisplayServer.mb_tablet_get_driver_name = MethodBind.get("DisplayServer", "tablet_get_driver_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.DisplayServer.mb_tablet_get_driver_name, livePtr, idx)
  }

  /** DisplayServer.tablet_get_current_driver */
  final def tabletGetCurrentDriver(): String = {
    if (gdext.classes.DisplayServer.mb_tablet_get_current_driver == null) gdext.classes.DisplayServer.mb_tablet_get_current_driver = MethodBind.get("DisplayServer", "tablet_get_current_driver", 201670096L)
    Ptrcall.call0[String](gdext.classes.DisplayServer.mb_tablet_get_current_driver, livePtr)
  }

  /** DisplayServer.tablet_set_current_driver */
  final def tabletSetCurrentDriver(name: String): Unit = {
    if (gdext.classes.DisplayServer.mb_tablet_set_current_driver == null) gdext.classes.DisplayServer.mb_tablet_set_current_driver = MethodBind.get("DisplayServer", "tablet_set_current_driver", 83702148L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_tablet_set_current_driver, livePtr, name)
  }

  /** DisplayServer.is_window_transparency_available */
  final def isWindowTransparencyAvailable(): Boolean = {
    if (gdext.classes.DisplayServer.mb_is_window_transparency_available == null) gdext.classes.DisplayServer.mb_is_window_transparency_available = MethodBind.get("DisplayServer", "is_window_transparency_available", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_is_window_transparency_available, livePtr)
  }

  /** DisplayServer.register_additional_output */
  final def registerAdditionalOutput(`object`: Object): Unit = {
    if (gdext.classes.DisplayServer.mb_register_additional_output == null) gdext.classes.DisplayServer.mb_register_additional_output = MethodBind.get("DisplayServer", "register_additional_output", 3975164845L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_register_additional_output, livePtr, Wrappers.handle(`object`))
  }

  /** DisplayServer.unregister_additional_output */
  final def unregisterAdditionalOutput(`object`: Object): Unit = {
    if (gdext.classes.DisplayServer.mb_unregister_additional_output == null) gdext.classes.DisplayServer.mb_unregister_additional_output = MethodBind.get("DisplayServer", "unregister_additional_output", 3975164845L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_unregister_additional_output, livePtr, Wrappers.handle(`object`))
  }

  /** DisplayServer.has_additional_outputs */
  final def hasAdditionalOutputs(): Boolean = {
    if (gdext.classes.DisplayServer.mb_has_additional_outputs == null) gdext.classes.DisplayServer.mb_has_additional_outputs = MethodBind.get("DisplayServer", "has_additional_outputs", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_has_additional_outputs, livePtr)
  }

}

object DisplayServer {
  private[classes] var mb_has_feature: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_add_submenu_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_add_separator: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_get_item_index_from_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_is_item_checked: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_is_item_checkable: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_is_item_radio_checkable: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_get_item_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_get_item_submenu: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_get_item_accelerator: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_is_item_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_is_item_hidden: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_get_item_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_get_item_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_get_item_max_states: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_get_item_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_get_item_indentation_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_set_item_checked: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_set_item_checkable: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_set_item_radio_checkable: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_set_item_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_set_item_submenu: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_set_item_accelerator: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_set_item_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_set_item_hidden: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_set_item_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_set_item_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_set_item_max_states: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_set_item_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_set_item_indentation_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_get_item_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_remove_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_menu_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_tts_is_speaking: GDExtensionMethodBindPtr = null
  private[classes] var mb_tts_is_paused: GDExtensionMethodBindPtr = null
  private[classes] var mb_tts_pause: GDExtensionMethodBindPtr = null
  private[classes] var mb_tts_resume: GDExtensionMethodBindPtr = null
  private[classes] var mb_tts_stop: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_dark_mode_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_dark_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_accent_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_base_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_mouse_set_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_mouse_get_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_warp_mouse: GDExtensionMethodBindPtr = null
  private[classes] var mb_mouse_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_mouse_get_button_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_clipboard_set: GDExtensionMethodBindPtr = null
  private[classes] var mb_clipboard_get: GDExtensionMethodBindPtr = null
  private[classes] var mb_clipboard_get_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_clipboard_has: GDExtensionMethodBindPtr = null
  private[classes] var mb_clipboard_has_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_clipboard_set_primary: GDExtensionMethodBindPtr = null
  private[classes] var mb_clipboard_get_primary: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_display_safe_area: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_primary_screen: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_keyboard_focus_screen: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_from_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_usable_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_dpi: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_touchscreen_available: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_max_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_refresh_rate: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_pixel: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_image_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_set_orientation: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_orientation: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_set_keep_on: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_is_kept_on: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_window_at_screen_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_native_handle: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_active_popup: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_popup_safe_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_popup_safe_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_title_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_current_screen: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_current_screen: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_position_with_decorations: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_attached_instance_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_max_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_max_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_min_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_min_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_size_with_decorations: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_window_buttons_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_safe_title_margins: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_request_attention: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_move_to_foreground: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_is_focused: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_can_draw: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_transient: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_exclusive: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_ime_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_ime_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_vsync_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_get_vsync_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_is_maximize_allowed: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_maximize_on_title_dbl_click: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_minimize_on_title_dbl_click: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_start_drag: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_start_resize: GDExtensionMethodBindPtr = null
  private[classes] var mb_window_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_accessibility_should_increase_contrast: GDExtensionMethodBindPtr = null
  private[classes] var mb_accessibility_should_reduce_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_accessibility_should_reduce_transparency: GDExtensionMethodBindPtr = null
  private[classes] var mb_accessibility_screen_reader_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_accessibility_set_window_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_accessibility_set_window_focused: GDExtensionMethodBindPtr = null
  private[classes] var mb_ime_get_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_ime_get_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_virtual_keyboard_show: GDExtensionMethodBindPtr = null
  private[classes] var mb_virtual_keyboard_hide: GDExtensionMethodBindPtr = null
  private[classes] var mb_virtual_keyboard_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_hardware_keyboard: GDExtensionMethodBindPtr = null
  private[classes] var mb_cursor_set_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_cursor_get_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_cursor_set_custom_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_swap_cancel_ok: GDExtensionMethodBindPtr = null
  private[classes] var mb_enable_for_stealing_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_beep: GDExtensionMethodBindPtr = null
  private[classes] var mb_keyboard_get_layout_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_keyboard_get_current_layout: GDExtensionMethodBindPtr = null
  private[classes] var mb_keyboard_set_current_layout: GDExtensionMethodBindPtr = null
  private[classes] var mb_keyboard_get_layout_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_keyboard_get_layout_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_keyboard_get_keycode_from_physical: GDExtensionMethodBindPtr = null
  private[classes] var mb_keyboard_get_label_from_physical: GDExtensionMethodBindPtr = null
  private[classes] var mb_show_emoji_and_symbol_picker: GDExtensionMethodBindPtr = null
  private[classes] var mb_process_events: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_process_and_drop_events: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_native_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_status_indicator_set_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_status_indicator_set_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_status_indicator_get_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_delete_status_indicator: GDExtensionMethodBindPtr = null
  private[classes] var mb_tablet_get_driver_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_tablet_get_driver_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_tablet_get_current_driver: GDExtensionMethodBindPtr = null
  private[classes] var mb_tablet_set_current_driver: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_window_transparency_available: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_additional_output: GDExtensionMethodBindPtr = null
  private[classes] var mb_unregister_additional_output: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_additional_outputs: GDExtensionMethodBindPtr = null

  private var instance: DisplayServer = null

  /** The process-global DisplayServer singleton instance. */
  def singleton: DisplayServer = {
    if (instance == null)
      instance = Wrappers.borrowed[DisplayServer](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("DisplayServer").ptr)))
    instance
  }
}
