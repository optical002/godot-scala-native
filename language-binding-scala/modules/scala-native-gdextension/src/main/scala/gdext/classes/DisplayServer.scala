package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `DisplayServer`, extends `Object`. */
abstract class DisplayServer extends Object {
  override def godotClassName: String = "DisplayServer"

  /** DisplayServer.has_feature */
  final def hasFeature(feature: gdext.classes.DisplayServer.Feature): Boolean = {
    if (gdext.classes.DisplayServer.mb_has_feature == null) gdext.classes.DisplayServer.mb_has_feature = MethodBind.get("DisplayServer", "has_feature", 334065950L)
    Ptrcall.call1[Long, Boolean](gdext.classes.DisplayServer.mb_has_feature, livePtr, feature)
  }

  /** DisplayServer.get_name */
  final def getName(): String = {
    if (gdext.classes.DisplayServer.mb_get_name == null) gdext.classes.DisplayServer.mb_get_name = MethodBind.get("DisplayServer", "get_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.DisplayServer.mb_get_name, livePtr)
  }

  /** DisplayServer.global_menu_add_submenu_item */
  final def globalMenuAddSubmenuItem(menuRoot: String, label: String, submenu: String, index: Long = -1L): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_add_submenu_item == null) gdext.classes.DisplayServer.mb_global_menu_add_submenu_item = MethodBind.get("DisplayServer", "global_menu_add_submenu_item", 2828985934L)
    Ptrcall.call4[String, String, String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_add_submenu_item, livePtr, menuRoot, label, submenu, index)
  }

  /** DisplayServer.global_menu_add_separator */
  final def globalMenuAddSeparator(menuRoot: String, index: Long = -1L): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_add_separator == null) gdext.classes.DisplayServer.mb_global_menu_add_separator = MethodBind.get("DisplayServer", "global_menu_add_separator", 3214812433L)
    Ptrcall.call2[String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_add_separator, livePtr, menuRoot, index)
  }

  /** DisplayServer.global_menu_get_item_index_from_text */
  final def globalMenuGetItemIndexFromText(menuRoot: String, text: String): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_index_from_text == null) gdext.classes.DisplayServer.mb_global_menu_get_item_index_from_text = MethodBind.get("DisplayServer", "global_menu_get_item_index_from_text", 2878152881L)
    Ptrcall.call2[String, String, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_index_from_text, livePtr, menuRoot, text)
  }

  /** DisplayServer.global_menu_is_item_checked */
  final def globalMenuIsItemChecked(menuRoot: String, idx: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_global_menu_is_item_checked == null) gdext.classes.DisplayServer.mb_global_menu_is_item_checked = MethodBind.get("DisplayServer", "global_menu_is_item_checked", 3511468594L)
    Ptrcall.call2[String, Long, Boolean](gdext.classes.DisplayServer.mb_global_menu_is_item_checked, livePtr, menuRoot, idx)
  }

  /** DisplayServer.global_menu_is_item_checkable */
  final def globalMenuIsItemCheckable(menuRoot: String, idx: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_global_menu_is_item_checkable == null) gdext.classes.DisplayServer.mb_global_menu_is_item_checkable = MethodBind.get("DisplayServer", "global_menu_is_item_checkable", 3511468594L)
    Ptrcall.call2[String, Long, Boolean](gdext.classes.DisplayServer.mb_global_menu_is_item_checkable, livePtr, menuRoot, idx)
  }

  /** DisplayServer.global_menu_is_item_radio_checkable */
  final def globalMenuIsItemRadioCheckable(menuRoot: String, idx: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_global_menu_is_item_radio_checkable == null) gdext.classes.DisplayServer.mb_global_menu_is_item_radio_checkable = MethodBind.get("DisplayServer", "global_menu_is_item_radio_checkable", 3511468594L)
    Ptrcall.call2[String, Long, Boolean](gdext.classes.DisplayServer.mb_global_menu_is_item_radio_checkable, livePtr, menuRoot, idx)
  }

  /** DisplayServer.global_menu_get_item_text */
  final def globalMenuGetItemText(menuRoot: String, idx: Long): String = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_text == null) gdext.classes.DisplayServer.mb_global_menu_get_item_text = MethodBind.get("DisplayServer", "global_menu_get_item_text", 591067909L)
    Ptrcall.call2[String, Long, String](gdext.classes.DisplayServer.mb_global_menu_get_item_text, livePtr, menuRoot, idx)
  }

  /** DisplayServer.global_menu_get_item_submenu */
  final def globalMenuGetItemSubmenu(menuRoot: String, idx: Long): String = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_submenu == null) gdext.classes.DisplayServer.mb_global_menu_get_item_submenu = MethodBind.get("DisplayServer", "global_menu_get_item_submenu", 591067909L)
    Ptrcall.call2[String, Long, String](gdext.classes.DisplayServer.mb_global_menu_get_item_submenu, livePtr, menuRoot, idx)
  }

  /** DisplayServer.global_menu_get_item_accelerator */
  final def globalMenuGetItemAccelerator(menuRoot: String, idx: Long): gdext.classes.Key = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_accelerator == null) gdext.classes.DisplayServer.mb_global_menu_get_item_accelerator = MethodBind.get("DisplayServer", "global_menu_get_item_accelerator", 936065394L)
    gdext.classes.Key(Ptrcall.call2[String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_accelerator, livePtr, menuRoot, idx))
  }

  /** DisplayServer.global_menu_is_item_disabled */
  final def globalMenuIsItemDisabled(menuRoot: String, idx: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_global_menu_is_item_disabled == null) gdext.classes.DisplayServer.mb_global_menu_is_item_disabled = MethodBind.get("DisplayServer", "global_menu_is_item_disabled", 3511468594L)
    Ptrcall.call2[String, Long, Boolean](gdext.classes.DisplayServer.mb_global_menu_is_item_disabled, livePtr, menuRoot, idx)
  }

  /** DisplayServer.global_menu_is_item_hidden */
  final def globalMenuIsItemHidden(menuRoot: String, idx: Long): Boolean = {
    if (gdext.classes.DisplayServer.mb_global_menu_is_item_hidden == null) gdext.classes.DisplayServer.mb_global_menu_is_item_hidden = MethodBind.get("DisplayServer", "global_menu_is_item_hidden", 3511468594L)
    Ptrcall.call2[String, Long, Boolean](gdext.classes.DisplayServer.mb_global_menu_is_item_hidden, livePtr, menuRoot, idx)
  }

  /** DisplayServer.global_menu_get_item_tooltip */
  final def globalMenuGetItemTooltip(menuRoot: String, idx: Long): String = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_tooltip == null) gdext.classes.DisplayServer.mb_global_menu_get_item_tooltip = MethodBind.get("DisplayServer", "global_menu_get_item_tooltip", 591067909L)
    Ptrcall.call2[String, Long, String](gdext.classes.DisplayServer.mb_global_menu_get_item_tooltip, livePtr, menuRoot, idx)
  }

  /** DisplayServer.global_menu_get_item_state */
  final def globalMenuGetItemState(menuRoot: String, idx: Long): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_state == null) gdext.classes.DisplayServer.mb_global_menu_get_item_state = MethodBind.get("DisplayServer", "global_menu_get_item_state", 3422818498L)
    Ptrcall.call2[String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_state, livePtr, menuRoot, idx)
  }

  /** DisplayServer.global_menu_get_item_max_states */
  final def globalMenuGetItemMaxStates(menuRoot: String, idx: Long): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_max_states == null) gdext.classes.DisplayServer.mb_global_menu_get_item_max_states = MethodBind.get("DisplayServer", "global_menu_get_item_max_states", 3422818498L)
    Ptrcall.call2[String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_max_states, livePtr, menuRoot, idx)
  }

  /** DisplayServer.global_menu_get_item_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def globalMenuGetItemIcon(menuRoot: String, idx: Long): Texture2D = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_icon == null) gdext.classes.DisplayServer.mb_global_menu_get_item_icon = MethodBind.get("DisplayServer", "global_menu_get_item_icon", 3591713183L)
    Wrappers.owned[Texture2D](Ptrcall.call2[String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_icon, livePtr, menuRoot, idx))
  }

  /** DisplayServer.global_menu_get_item_indentation_level */
  final def globalMenuGetItemIndentationLevel(menuRoot: String, idx: Long): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_indentation_level == null) gdext.classes.DisplayServer.mb_global_menu_get_item_indentation_level = MethodBind.get("DisplayServer", "global_menu_get_item_indentation_level", 3422818498L)
    Ptrcall.call2[String, Long, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_indentation_level, livePtr, menuRoot, idx)
  }

  /** DisplayServer.global_menu_set_item_checked */
  final def globalMenuSetItemChecked(menuRoot: String, idx: Long, checked: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_checked == null) gdext.classes.DisplayServer.mb_global_menu_set_item_checked = MethodBind.get("DisplayServer", "global_menu_set_item_checked", 4108344793L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_checked, livePtr, menuRoot, idx, checked)
  }

  /** DisplayServer.global_menu_set_item_checkable */
  final def globalMenuSetItemCheckable(menuRoot: String, idx: Long, checkable: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_checkable == null) gdext.classes.DisplayServer.mb_global_menu_set_item_checkable = MethodBind.get("DisplayServer", "global_menu_set_item_checkable", 4108344793L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_checkable, livePtr, menuRoot, idx, checkable)
  }

  /** DisplayServer.global_menu_set_item_radio_checkable */
  final def globalMenuSetItemRadioCheckable(menuRoot: String, idx: Long, checkable: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_radio_checkable == null) gdext.classes.DisplayServer.mb_global_menu_set_item_radio_checkable = MethodBind.get("DisplayServer", "global_menu_set_item_radio_checkable", 4108344793L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_radio_checkable, livePtr, menuRoot, idx, checkable)
  }

  /** DisplayServer.global_menu_set_item_text */
  final def globalMenuSetItemText(menuRoot: String, idx: Long, text: String): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_text == null) gdext.classes.DisplayServer.mb_global_menu_set_item_text = MethodBind.get("DisplayServer", "global_menu_set_item_text", 965966136L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_text, livePtr, menuRoot, idx, text)
  }

  /** DisplayServer.global_menu_set_item_submenu */
  final def globalMenuSetItemSubmenu(menuRoot: String, idx: Long, submenu: String): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_submenu == null) gdext.classes.DisplayServer.mb_global_menu_set_item_submenu = MethodBind.get("DisplayServer", "global_menu_set_item_submenu", 965966136L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_submenu, livePtr, menuRoot, idx, submenu)
  }

  /** DisplayServer.global_menu_set_item_accelerator */
  final def globalMenuSetItemAccelerator(menuRoot: String, idx: Long, keycode: gdext.classes.Key): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_accelerator == null) gdext.classes.DisplayServer.mb_global_menu_set_item_accelerator = MethodBind.get("DisplayServer", "global_menu_set_item_accelerator", 566943293L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_accelerator, livePtr, menuRoot, idx, keycode)
  }

  /** DisplayServer.global_menu_set_item_disabled */
  final def globalMenuSetItemDisabled(menuRoot: String, idx: Long, disabled: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_disabled == null) gdext.classes.DisplayServer.mb_global_menu_set_item_disabled = MethodBind.get("DisplayServer", "global_menu_set_item_disabled", 4108344793L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_disabled, livePtr, menuRoot, idx, disabled)
  }

  /** DisplayServer.global_menu_set_item_hidden */
  final def globalMenuSetItemHidden(menuRoot: String, idx: Long, hidden: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_hidden == null) gdext.classes.DisplayServer.mb_global_menu_set_item_hidden = MethodBind.get("DisplayServer", "global_menu_set_item_hidden", 4108344793L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_hidden, livePtr, menuRoot, idx, hidden)
  }

  /** DisplayServer.global_menu_set_item_tooltip */
  final def globalMenuSetItemTooltip(menuRoot: String, idx: Long, tooltip: String): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_tooltip == null) gdext.classes.DisplayServer.mb_global_menu_set_item_tooltip = MethodBind.get("DisplayServer", "global_menu_set_item_tooltip", 965966136L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_tooltip, livePtr, menuRoot, idx, tooltip)
  }

  /** DisplayServer.global_menu_set_item_state */
  final def globalMenuSetItemState(menuRoot: String, idx: Long, state: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_state == null) gdext.classes.DisplayServer.mb_global_menu_set_item_state = MethodBind.get("DisplayServer", "global_menu_set_item_state", 3474840532L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_state, livePtr, menuRoot, idx, state)
  }

  /** DisplayServer.global_menu_set_item_max_states */
  final def globalMenuSetItemMaxStates(menuRoot: String, idx: Long, maxStates: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_max_states == null) gdext.classes.DisplayServer.mb_global_menu_set_item_max_states = MethodBind.get("DisplayServer", "global_menu_set_item_max_states", 3474840532L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_max_states, livePtr, menuRoot, idx, maxStates)
  }

  /** DisplayServer.global_menu_set_item_icon */
  final def globalMenuSetItemIcon(menuRoot: String, idx: Long, icon: Texture2D): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_icon == null) gdext.classes.DisplayServer.mb_global_menu_set_item_icon = MethodBind.get("DisplayServer", "global_menu_set_item_icon", 3201338066L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_icon, livePtr, menuRoot, idx, Wrappers.handle(icon))
  }

  /** DisplayServer.global_menu_set_item_indentation_level */
  final def globalMenuSetItemIndentationLevel(menuRoot: String, idx: Long, level: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_set_item_indentation_level == null) gdext.classes.DisplayServer.mb_global_menu_set_item_indentation_level = MethodBind.get("DisplayServer", "global_menu_set_item_indentation_level", 3474840532L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_global_menu_set_item_indentation_level, livePtr, menuRoot, idx, level)
  }

  /** DisplayServer.global_menu_get_item_count */
  final def globalMenuGetItemCount(menuRoot: String): Long = {
    if (gdext.classes.DisplayServer.mb_global_menu_get_item_count == null) gdext.classes.DisplayServer.mb_global_menu_get_item_count = MethodBind.get("DisplayServer", "global_menu_get_item_count", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.DisplayServer.mb_global_menu_get_item_count, livePtr, menuRoot)
  }

  /** DisplayServer.global_menu_remove_item */
  final def globalMenuRemoveItem(menuRoot: String, idx: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_remove_item == null) gdext.classes.DisplayServer.mb_global_menu_remove_item = MethodBind.get("DisplayServer", "global_menu_remove_item", 2956805083L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_global_menu_remove_item, livePtr, menuRoot, idx)
  }

  /** DisplayServer.global_menu_clear */
  final def globalMenuClear(menuRoot: String): Unit = {
    if (gdext.classes.DisplayServer.mb_global_menu_clear == null) gdext.classes.DisplayServer.mb_global_menu_clear = MethodBind.get("DisplayServer", "global_menu_clear", 83702148L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_global_menu_clear, livePtr, menuRoot)
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
  final def mouseSetMode(mouseMode: gdext.classes.DisplayServer.MouseMode): Unit = {
    if (gdext.classes.DisplayServer.mb_mouse_set_mode == null) gdext.classes.DisplayServer.mb_mouse_set_mode = MethodBind.get("DisplayServer", "mouse_set_mode", 348288463L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_mouse_set_mode, livePtr, mouseMode)
  }

  /** DisplayServer.mouse_get_mode */
  final def mouseGetMode(): gdext.classes.DisplayServer.MouseMode = {
    if (gdext.classes.DisplayServer.mb_mouse_get_mode == null) gdext.classes.DisplayServer.mb_mouse_get_mode = MethodBind.get("DisplayServer", "mouse_get_mode", 1353961651L)
    gdext.classes.DisplayServer.MouseMode(Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_mouse_get_mode, livePtr))
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
  final def mouseGetButtonState(): gdext.classes.MouseButtonMask = {
    if (gdext.classes.DisplayServer.mb_mouse_get_button_state == null) gdext.classes.DisplayServer.mb_mouse_get_button_state = MethodBind.get("DisplayServer", "mouse_get_button_state", 2512161324L)
    gdext.classes.MouseButtonMask(Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_mouse_get_button_state, livePtr))
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
  final def clipboardSetPrimary(clipboardPrimary: String): Unit = {
    if (gdext.classes.DisplayServer.mb_clipboard_set_primary == null) gdext.classes.DisplayServer.mb_clipboard_set_primary = MethodBind.get("DisplayServer", "clipboard_set_primary", 83702148L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_clipboard_set_primary, livePtr, clipboardPrimary)
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
  final def screenGetPosition(screen: Long = -1L): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_screen_get_position == null) gdext.classes.DisplayServer.mb_screen_get_position = MethodBind.get("DisplayServer", "screen_get_position", 1725937825L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_screen_get_position, livePtr, screen)
  }

  /** DisplayServer.screen_get_size */
  final def screenGetSize(screen: Long = -1L): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_screen_get_size == null) gdext.classes.DisplayServer.mb_screen_get_size = MethodBind.get("DisplayServer", "screen_get_size", 1725937825L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_screen_get_size, livePtr, screen)
  }

  /** DisplayServer.screen_get_usable_rect */
  final def screenGetUsableRect(screen: Long = -1L): gdext.builtin.Rect2i = {
    if (gdext.classes.DisplayServer.mb_screen_get_usable_rect == null) gdext.classes.DisplayServer.mb_screen_get_usable_rect = MethodBind.get("DisplayServer", "screen_get_usable_rect", 2439012528L)
    Ptrcall.call1[Long, gdext.builtin.Rect2i](gdext.classes.DisplayServer.mb_screen_get_usable_rect, livePtr, screen)
  }

  /** DisplayServer.screen_get_dpi */
  final def screenGetDpi(screen: Long = -1L): Long = {
    if (gdext.classes.DisplayServer.mb_screen_get_dpi == null) gdext.classes.DisplayServer.mb_screen_get_dpi = MethodBind.get("DisplayServer", "screen_get_dpi", 181039630L)
    Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_screen_get_dpi, livePtr, screen)
  }

  /** DisplayServer.screen_get_scale */
  final def screenGetScale(screen: Long = -1L): Double = {
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
  final def screenGetRefreshRate(screen: Long = -1L): Double = {
    if (gdext.classes.DisplayServer.mb_screen_get_refresh_rate == null) gdext.classes.DisplayServer.mb_screen_get_refresh_rate = MethodBind.get("DisplayServer", "screen_get_refresh_rate", 909105437L)
    Ptrcall.call1[Long, Double](gdext.classes.DisplayServer.mb_screen_get_refresh_rate, livePtr, screen)
  }

  /** DisplayServer.screen_get_pixel */
  final def screenGetPixel(position: gdext.builtin.Vector2i): gdext.builtin.Color = {
    if (gdext.classes.DisplayServer.mb_screen_get_pixel == null) gdext.classes.DisplayServer.mb_screen_get_pixel = MethodBind.get("DisplayServer", "screen_get_pixel", 1532707496L)
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Color](gdext.classes.DisplayServer.mb_screen_get_pixel, livePtr, position)
  }

  /** DisplayServer.screen_get_image. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def screenGetImage(screen: Long = -1L): Image = {
    if (gdext.classes.DisplayServer.mb_screen_get_image == null) gdext.classes.DisplayServer.mb_screen_get_image = MethodBind.get("DisplayServer", "screen_get_image", 3813388802L)
    Wrappers.owned[Image](Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_screen_get_image, livePtr, screen))
  }

  /** DisplayServer.screen_get_image_rect. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def screenGetImageRect(rect: gdext.builtin.Rect2i): Image = {
    if (gdext.classes.DisplayServer.mb_screen_get_image_rect == null) gdext.classes.DisplayServer.mb_screen_get_image_rect = MethodBind.get("DisplayServer", "screen_get_image_rect", 2601441065L)
    Wrappers.owned[Image](Ptrcall.call1[gdext.builtin.Rect2i, Long](gdext.classes.DisplayServer.mb_screen_get_image_rect, livePtr, rect))
  }

  /** DisplayServer.screen_set_orientation */
  final def screenSetOrientation(orientation: gdext.classes.DisplayServer.ScreenOrientation, screen: Long = -1L): Unit = {
    if (gdext.classes.DisplayServer.mb_screen_set_orientation == null) gdext.classes.DisplayServer.mb_screen_set_orientation = MethodBind.get("DisplayServer", "screen_set_orientation", 2211511631L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_screen_set_orientation, livePtr, orientation, screen)
  }

  /** DisplayServer.screen_get_orientation */
  final def screenGetOrientation(screen: Long = -1L): gdext.classes.DisplayServer.ScreenOrientation = {
    if (gdext.classes.DisplayServer.mb_screen_get_orientation == null) gdext.classes.DisplayServer.mb_screen_get_orientation = MethodBind.get("DisplayServer", "screen_get_orientation", 133818562L)
    gdext.classes.DisplayServer.ScreenOrientation(Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_screen_get_orientation, livePtr, screen))
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
  final def windowGetNativeHandle(handleType: gdext.classes.DisplayServer.HandleType, windowId: Long = 0L): Long = {
    if (gdext.classes.DisplayServer.mb_window_get_native_handle == null) gdext.classes.DisplayServer.mb_window_get_native_handle = MethodBind.get("DisplayServer", "window_get_native_handle", 1096425680L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.DisplayServer.mb_window_get_native_handle, livePtr, handleType, windowId)
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
  final def windowSetTitle(title: String, windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_title == null) gdext.classes.DisplayServer.mb_window_set_title = MethodBind.get("DisplayServer", "window_set_title", 441246282L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_title, livePtr, title, windowId)
  }

  /** DisplayServer.window_get_title_size */
  final def windowGetTitleSize(title: String, windowId: Long = 0L): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_title_size == null) gdext.classes.DisplayServer.mb_window_get_title_size = MethodBind.get("DisplayServer", "window_get_title_size", 2925301799L)
    Ptrcall.call2[String, Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_title_size, livePtr, title, windowId)
  }

  /** DisplayServer.window_get_current_screen */
  final def windowGetCurrentScreen(windowId: Long = 0L): Long = {
    if (gdext.classes.DisplayServer.mb_window_get_current_screen == null) gdext.classes.DisplayServer.mb_window_get_current_screen = MethodBind.get("DisplayServer", "window_get_current_screen", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_window_get_current_screen, livePtr, windowId)
  }

  /** DisplayServer.window_set_current_screen */
  final def windowSetCurrentScreen(screen: Long, windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_current_screen == null) gdext.classes.DisplayServer.mb_window_set_current_screen = MethodBind.get("DisplayServer", "window_set_current_screen", 2230941749L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_current_screen, livePtr, screen, windowId)
  }

  /** DisplayServer.window_get_position */
  final def windowGetPosition(windowId: Long = 0L): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_position == null) gdext.classes.DisplayServer.mb_window_get_position = MethodBind.get("DisplayServer", "window_get_position", 763922886L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_position, livePtr, windowId)
  }

  /** DisplayServer.window_get_position_with_decorations */
  final def windowGetPositionWithDecorations(windowId: Long = 0L): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_position_with_decorations == null) gdext.classes.DisplayServer.mb_window_get_position_with_decorations = MethodBind.get("DisplayServer", "window_get_position_with_decorations", 763922886L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_position_with_decorations, livePtr, windowId)
  }

  /** DisplayServer.window_set_position */
  final def windowSetPosition(position: gdext.builtin.Vector2i, windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_position == null) gdext.classes.DisplayServer.mb_window_set_position = MethodBind.get("DisplayServer", "window_set_position", 2019273902L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_position, livePtr, position, windowId)
  }

  /** DisplayServer.window_get_size */
  final def windowGetSize(windowId: Long = 0L): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_size == null) gdext.classes.DisplayServer.mb_window_get_size = MethodBind.get("DisplayServer", "window_get_size", 763922886L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_size, livePtr, windowId)
  }

  /** DisplayServer.window_set_size */
  final def windowSetSize(size: gdext.builtin.Vector2i, windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_size == null) gdext.classes.DisplayServer.mb_window_set_size = MethodBind.get("DisplayServer", "window_set_size", 2019273902L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_size, livePtr, size, windowId)
  }

  /** DisplayServer.window_get_attached_instance_id */
  final def windowGetAttachedInstanceId(windowId: Long = 0L): Long = {
    if (gdext.classes.DisplayServer.mb_window_get_attached_instance_id == null) gdext.classes.DisplayServer.mb_window_get_attached_instance_id = MethodBind.get("DisplayServer", "window_get_attached_instance_id", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_window_get_attached_instance_id, livePtr, windowId)
  }

  /** DisplayServer.window_get_max_size */
  final def windowGetMaxSize(windowId: Long = 0L): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_max_size == null) gdext.classes.DisplayServer.mb_window_get_max_size = MethodBind.get("DisplayServer", "window_get_max_size", 763922886L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_max_size, livePtr, windowId)
  }

  /** DisplayServer.window_set_max_size */
  final def windowSetMaxSize(maxSize: gdext.builtin.Vector2i, windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_max_size == null) gdext.classes.DisplayServer.mb_window_set_max_size = MethodBind.get("DisplayServer", "window_set_max_size", 2019273902L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_max_size, livePtr, maxSize, windowId)
  }

  /** DisplayServer.window_get_min_size */
  final def windowGetMinSize(windowId: Long = 0L): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_min_size == null) gdext.classes.DisplayServer.mb_window_get_min_size = MethodBind.get("DisplayServer", "window_get_min_size", 763922886L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_min_size, livePtr, windowId)
  }

  /** DisplayServer.window_set_min_size */
  final def windowSetMinSize(minSize: gdext.builtin.Vector2i, windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_min_size == null) gdext.classes.DisplayServer.mb_window_set_min_size = MethodBind.get("DisplayServer", "window_set_min_size", 2019273902L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_min_size, livePtr, minSize, windowId)
  }

  /** DisplayServer.window_get_size_with_decorations */
  final def windowGetSizeWithDecorations(windowId: Long = 0L): gdext.builtin.Vector2i = {
    if (gdext.classes.DisplayServer.mb_window_get_size_with_decorations == null) gdext.classes.DisplayServer.mb_window_get_size_with_decorations = MethodBind.get("DisplayServer", "window_get_size_with_decorations", 763922886L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.DisplayServer.mb_window_get_size_with_decorations, livePtr, windowId)
  }

  /** DisplayServer.window_get_mode */
  final def windowGetMode(windowId: Long = 0L): gdext.classes.DisplayServer.WindowMode = {
    if (gdext.classes.DisplayServer.mb_window_get_mode == null) gdext.classes.DisplayServer.mb_window_get_mode = MethodBind.get("DisplayServer", "window_get_mode", 2185728461L)
    gdext.classes.DisplayServer.WindowMode(Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_window_get_mode, livePtr, windowId))
  }

  /** DisplayServer.window_set_mode */
  final def windowSetMode(mode: gdext.classes.DisplayServer.WindowMode, windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_mode == null) gdext.classes.DisplayServer.mb_window_set_mode = MethodBind.get("DisplayServer", "window_set_mode", 1319965401L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_mode, livePtr, mode, windowId)
  }

  /** DisplayServer.window_set_flag */
  final def windowSetFlag(flag: gdext.classes.DisplayServer.WindowFlags, enabled: Boolean, windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_flag == null) gdext.classes.DisplayServer.mb_window_set_flag = MethodBind.get("DisplayServer", "window_set_flag", 254894155L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_window_set_flag, livePtr, flag, enabled, windowId)
  }

  /** DisplayServer.window_get_flag */
  final def windowGetFlag(flag: gdext.classes.DisplayServer.WindowFlags, windowId: Long = 0L): Boolean = {
    if (gdext.classes.DisplayServer.mb_window_get_flag == null) gdext.classes.DisplayServer.mb_window_get_flag = MethodBind.get("DisplayServer", "window_get_flag", 802816991L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.DisplayServer.mb_window_get_flag, livePtr, flag, windowId)
  }

  /** DisplayServer.window_set_window_buttons_offset */
  final def windowSetWindowButtonsOffset(offset: gdext.builtin.Vector2i, windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_window_buttons_offset == null) gdext.classes.DisplayServer.mb_window_set_window_buttons_offset = MethodBind.get("DisplayServer", "window_set_window_buttons_offset", 2019273902L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_window_buttons_offset, livePtr, offset, windowId)
  }

  /** DisplayServer.window_get_safe_title_margins */
  final def windowGetSafeTitleMargins(windowId: Long = 0L): gdext.builtin.Vector3i = {
    if (gdext.classes.DisplayServer.mb_window_get_safe_title_margins == null) gdext.classes.DisplayServer.mb_window_get_safe_title_margins = MethodBind.get("DisplayServer", "window_get_safe_title_margins", 2295066620L)
    Ptrcall.call1[Long, gdext.builtin.Vector3i](gdext.classes.DisplayServer.mb_window_get_safe_title_margins, livePtr, windowId)
  }

  /** DisplayServer.window_request_attention */
  final def windowRequestAttention(windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_request_attention == null) gdext.classes.DisplayServer.mb_window_request_attention = MethodBind.get("DisplayServer", "window_request_attention", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_window_request_attention, livePtr, windowId)
  }

  /** DisplayServer.window_move_to_foreground */
  final def windowMoveToForeground(windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_move_to_foreground == null) gdext.classes.DisplayServer.mb_window_move_to_foreground = MethodBind.get("DisplayServer", "window_move_to_foreground", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_window_move_to_foreground, livePtr, windowId)
  }

  /** DisplayServer.window_is_focused */
  final def windowIsFocused(windowId: Long = 0L): Boolean = {
    if (gdext.classes.DisplayServer.mb_window_is_focused == null) gdext.classes.DisplayServer.mb_window_is_focused = MethodBind.get("DisplayServer", "window_is_focused", 1051549951L)
    Ptrcall.call1[Long, Boolean](gdext.classes.DisplayServer.mb_window_is_focused, livePtr, windowId)
  }

  /** DisplayServer.window_can_draw */
  final def windowCanDraw(windowId: Long = 0L): Boolean = {
    if (gdext.classes.DisplayServer.mb_window_can_draw == null) gdext.classes.DisplayServer.mb_window_can_draw = MethodBind.get("DisplayServer", "window_can_draw", 1051549951L)
    Ptrcall.call1[Long, Boolean](gdext.classes.DisplayServer.mb_window_can_draw, livePtr, windowId)
  }

  /** DisplayServer.window_set_transient */
  final def windowSetTransient(windowId: Long, parentWindowId: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_transient == null) gdext.classes.DisplayServer.mb_window_set_transient = MethodBind.get("DisplayServer", "window_set_transient", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_transient, livePtr, windowId, parentWindowId)
  }

  /** DisplayServer.window_set_exclusive */
  final def windowSetExclusive(windowId: Long, exclusive: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_exclusive == null) gdext.classes.DisplayServer.mb_window_set_exclusive = MethodBind.get("DisplayServer", "window_set_exclusive", 300928843L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_exclusive, livePtr, windowId, exclusive)
  }

  /** DisplayServer.window_set_ime_active */
  final def windowSetImeActive(active: Boolean, windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_ime_active == null) gdext.classes.DisplayServer.mb_window_set_ime_active = MethodBind.get("DisplayServer", "window_set_ime_active", 1661950165L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_ime_active, livePtr, active, windowId)
  }

  /** DisplayServer.window_set_ime_position */
  final def windowSetImePosition(position: gdext.builtin.Vector2i, windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_ime_position == null) gdext.classes.DisplayServer.mb_window_set_ime_position = MethodBind.get("DisplayServer", "window_set_ime_position", 2019273902L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_ime_position, livePtr, position, windowId)
  }

  /** DisplayServer.window_set_vsync_mode */
  final def windowSetVsyncMode(vsyncMode: gdext.classes.DisplayServer.VSyncMode, windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_set_vsync_mode == null) gdext.classes.DisplayServer.mb_window_set_vsync_mode = MethodBind.get("DisplayServer", "window_set_vsync_mode", 2179333492L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_set_vsync_mode, livePtr, vsyncMode, windowId)
  }

  /** DisplayServer.window_get_vsync_mode */
  final def windowGetVsyncMode(windowId: Long = 0L): gdext.classes.DisplayServer.VSyncMode = {
    if (gdext.classes.DisplayServer.mb_window_get_vsync_mode == null) gdext.classes.DisplayServer.mb_window_get_vsync_mode = MethodBind.get("DisplayServer", "window_get_vsync_mode", 578873795L)
    gdext.classes.DisplayServer.VSyncMode(Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_window_get_vsync_mode, livePtr, windowId))
  }

  /** DisplayServer.window_is_maximize_allowed */
  final def windowIsMaximizeAllowed(windowId: Long = 0L): Boolean = {
    if (gdext.classes.DisplayServer.mb_window_is_maximize_allowed == null) gdext.classes.DisplayServer.mb_window_is_maximize_allowed = MethodBind.get("DisplayServer", "window_is_maximize_allowed", 1051549951L)
    Ptrcall.call1[Long, Boolean](gdext.classes.DisplayServer.mb_window_is_maximize_allowed, livePtr, windowId)
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
  final def windowStartDrag(windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_start_drag == null) gdext.classes.DisplayServer.mb_window_start_drag = MethodBind.get("DisplayServer", "window_start_drag", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_window_start_drag, livePtr, windowId)
  }

  /** DisplayServer.window_start_resize */
  final def windowStartResize(edge: gdext.classes.DisplayServer.WindowResizeEdge, windowId: Long = 0L): Unit = {
    if (gdext.classes.DisplayServer.mb_window_start_resize == null) gdext.classes.DisplayServer.mb_window_start_resize = MethodBind.get("DisplayServer", "window_start_resize", 4009722312L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_window_start_resize, livePtr, edge, windowId)
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
  final def accessibilitySetWindowRect(windowId: Long, rectOut: gdext.builtin.Rect2, rectIn: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.DisplayServer.mb_accessibility_set_window_rect == null) gdext.classes.DisplayServer.mb_accessibility_set_window_rect = MethodBind.get("DisplayServer", "accessibility_set_window_rect", 2386961724L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_accessibility_set_window_rect, livePtr, windowId, rectOut, rectIn)
  }

  /** DisplayServer.accessibility_set_window_focused */
  final def accessibilitySetWindowFocused(windowId: Long, focused: Boolean): Unit = {
    if (gdext.classes.DisplayServer.mb_accessibility_set_window_focused == null) gdext.classes.DisplayServer.mb_accessibility_set_window_focused = MethodBind.get("DisplayServer", "accessibility_set_window_focused", 300928843L)
    Ptrcall.callVoid2(gdext.classes.DisplayServer.mb_accessibility_set_window_focused, livePtr, windowId, focused)
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
  final def virtualKeyboardShow(existingText: String, position: gdext.builtin.Rect2 = gdext.builtin.Rect2(0f, 0f, 0f, 0f), `type`: gdext.classes.DisplayServer.VirtualKeyboardType = gdext.classes.DisplayServer.VirtualKeyboardType(0L), maxLength: Long = -1L, cursorStart: Long = -1L, cursorEnd: Long = -1L): Unit = {
    if (gdext.classes.DisplayServer.mb_virtual_keyboard_show == null) gdext.classes.DisplayServer.mb_virtual_keyboard_show = MethodBind.get("DisplayServer", "virtual_keyboard_show", 3042891259L)
    Ptrcall.callVoid6(gdext.classes.DisplayServer.mb_virtual_keyboard_show, livePtr, existingText, position, `type`, maxLength, cursorStart, cursorEnd)
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
  final def cursorSetShape(shape: gdext.classes.DisplayServer.CursorShape): Unit = {
    if (gdext.classes.DisplayServer.mb_cursor_set_shape == null) gdext.classes.DisplayServer.mb_cursor_set_shape = MethodBind.get("DisplayServer", "cursor_set_shape", 2026291549L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_cursor_set_shape, livePtr, shape)
  }

  /** DisplayServer.cursor_get_shape */
  final def cursorGetShape(): gdext.classes.DisplayServer.CursorShape = {
    if (gdext.classes.DisplayServer.mb_cursor_get_shape == null) gdext.classes.DisplayServer.mb_cursor_get_shape = MethodBind.get("DisplayServer", "cursor_get_shape", 1087724927L)
    gdext.classes.DisplayServer.CursorShape(Ptrcall.call0[Long](gdext.classes.DisplayServer.mb_cursor_get_shape, livePtr))
  }

  /** DisplayServer.cursor_set_custom_image */
  final def cursorSetCustomImage(cursor: Resource, shape: gdext.classes.DisplayServer.CursorShape = gdext.classes.DisplayServer.CursorShape(0L), hotspot: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): Unit = {
    if (gdext.classes.DisplayServer.mb_cursor_set_custom_image == null) gdext.classes.DisplayServer.mb_cursor_set_custom_image = MethodBind.get("DisplayServer", "cursor_set_custom_image", 1816663697L)
    Ptrcall.callVoid3(gdext.classes.DisplayServer.mb_cursor_set_custom_image, livePtr, Wrappers.handle(cursor), shape, hotspot)
  }

  /** DisplayServer.get_swap_cancel_ok */
  final def getSwapCancelOk(): Boolean = {
    if (gdext.classes.DisplayServer.mb_get_swap_cancel_ok == null) gdext.classes.DisplayServer.mb_get_swap_cancel_ok = MethodBind.get("DisplayServer", "get_swap_cancel_ok", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.DisplayServer.mb_get_swap_cancel_ok, livePtr)
  }

  /** DisplayServer.enable_for_stealing_focus */
  final def enableForStealingFocus(processId: Long): Unit = {
    if (gdext.classes.DisplayServer.mb_enable_for_stealing_focus == null) gdext.classes.DisplayServer.mb_enable_for_stealing_focus = MethodBind.get("DisplayServer", "enable_for_stealing_focus", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.DisplayServer.mb_enable_for_stealing_focus, livePtr, processId)
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
  final def keyboardGetKeycodeFromPhysical(keycode: gdext.classes.Key): gdext.classes.Key = {
    if (gdext.classes.DisplayServer.mb_keyboard_get_keycode_from_physical == null) gdext.classes.DisplayServer.mb_keyboard_get_keycode_from_physical = MethodBind.get("DisplayServer", "keyboard_get_keycode_from_physical", 3447613187L)
    gdext.classes.Key(Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_keyboard_get_keycode_from_physical, livePtr, keycode))
  }

  /** DisplayServer.keyboard_get_label_from_physical */
  final def keyboardGetLabelFromPhysical(keycode: gdext.classes.Key): gdext.classes.Key = {
    if (gdext.classes.DisplayServer.mb_keyboard_get_label_from_physical == null) gdext.classes.DisplayServer.mb_keyboard_get_label_from_physical = MethodBind.get("DisplayServer", "keyboard_get_label_from_physical", 3447613187L)
    gdext.classes.Key(Ptrcall.call1[Long, Long](gdext.classes.DisplayServer.mb_keyboard_get_label_from_physical, livePtr, keycode))
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

  /** Forwards to [[singleton]]: DisplayServer.has_feature */
  final def hasFeature(feature: gdext.classes.DisplayServer.Feature): Boolean =
    singleton.hasFeature(feature)

  /** Forwards to [[singleton]]: DisplayServer.get_name */
  final def getName(): String =
    singleton.getName()

  /** Forwards to [[singleton]]: DisplayServer.global_menu_add_submenu_item */
  final def globalMenuAddSubmenuItem(menuRoot: String, label: String, submenu: String, index: Long = -1L): Long =
    singleton.globalMenuAddSubmenuItem(menuRoot, label, submenu, index)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_add_separator */
  final def globalMenuAddSeparator(menuRoot: String, index: Long = -1L): Long =
    singleton.globalMenuAddSeparator(menuRoot, index)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_get_item_index_from_text */
  final def globalMenuGetItemIndexFromText(menuRoot: String, text: String): Long =
    singleton.globalMenuGetItemIndexFromText(menuRoot, text)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_is_item_checked */
  final def globalMenuIsItemChecked(menuRoot: String, idx: Long): Boolean =
    singleton.globalMenuIsItemChecked(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_is_item_checkable */
  final def globalMenuIsItemCheckable(menuRoot: String, idx: Long): Boolean =
    singleton.globalMenuIsItemCheckable(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_is_item_radio_checkable */
  final def globalMenuIsItemRadioCheckable(menuRoot: String, idx: Long): Boolean =
    singleton.globalMenuIsItemRadioCheckable(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_get_item_text */
  final def globalMenuGetItemText(menuRoot: String, idx: Long): String =
    singleton.globalMenuGetItemText(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_get_item_submenu */
  final def globalMenuGetItemSubmenu(menuRoot: String, idx: Long): String =
    singleton.globalMenuGetItemSubmenu(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_get_item_accelerator */
  final def globalMenuGetItemAccelerator(menuRoot: String, idx: Long): gdext.classes.Key =
    singleton.globalMenuGetItemAccelerator(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_is_item_disabled */
  final def globalMenuIsItemDisabled(menuRoot: String, idx: Long): Boolean =
    singleton.globalMenuIsItemDisabled(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_is_item_hidden */
  final def globalMenuIsItemHidden(menuRoot: String, idx: Long): Boolean =
    singleton.globalMenuIsItemHidden(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_get_item_tooltip */
  final def globalMenuGetItemTooltip(menuRoot: String, idx: Long): String =
    singleton.globalMenuGetItemTooltip(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_get_item_state */
  final def globalMenuGetItemState(menuRoot: String, idx: Long): Long =
    singleton.globalMenuGetItemState(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_get_item_max_states */
  final def globalMenuGetItemMaxStates(menuRoot: String, idx: Long): Long =
    singleton.globalMenuGetItemMaxStates(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_get_item_icon */
  final def globalMenuGetItemIcon(menuRoot: String, idx: Long): Texture2D =
    singleton.globalMenuGetItemIcon(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_get_item_indentation_level */
  final def globalMenuGetItemIndentationLevel(menuRoot: String, idx: Long): Long =
    singleton.globalMenuGetItemIndentationLevel(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_set_item_checked */
  final def globalMenuSetItemChecked(menuRoot: String, idx: Long, checked: Boolean): Unit =
    singleton.globalMenuSetItemChecked(menuRoot, idx, checked)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_set_item_checkable */
  final def globalMenuSetItemCheckable(menuRoot: String, idx: Long, checkable: Boolean): Unit =
    singleton.globalMenuSetItemCheckable(menuRoot, idx, checkable)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_set_item_radio_checkable */
  final def globalMenuSetItemRadioCheckable(menuRoot: String, idx: Long, checkable: Boolean): Unit =
    singleton.globalMenuSetItemRadioCheckable(menuRoot, idx, checkable)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_set_item_text */
  final def globalMenuSetItemText(menuRoot: String, idx: Long, text: String): Unit =
    singleton.globalMenuSetItemText(menuRoot, idx, text)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_set_item_submenu */
  final def globalMenuSetItemSubmenu(menuRoot: String, idx: Long, submenu: String): Unit =
    singleton.globalMenuSetItemSubmenu(menuRoot, idx, submenu)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_set_item_accelerator */
  final def globalMenuSetItemAccelerator(menuRoot: String, idx: Long, keycode: gdext.classes.Key): Unit =
    singleton.globalMenuSetItemAccelerator(menuRoot, idx, keycode)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_set_item_disabled */
  final def globalMenuSetItemDisabled(menuRoot: String, idx: Long, disabled: Boolean): Unit =
    singleton.globalMenuSetItemDisabled(menuRoot, idx, disabled)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_set_item_hidden */
  final def globalMenuSetItemHidden(menuRoot: String, idx: Long, hidden: Boolean): Unit =
    singleton.globalMenuSetItemHidden(menuRoot, idx, hidden)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_set_item_tooltip */
  final def globalMenuSetItemTooltip(menuRoot: String, idx: Long, tooltip: String): Unit =
    singleton.globalMenuSetItemTooltip(menuRoot, idx, tooltip)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_set_item_state */
  final def globalMenuSetItemState(menuRoot: String, idx: Long, state: Long): Unit =
    singleton.globalMenuSetItemState(menuRoot, idx, state)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_set_item_max_states */
  final def globalMenuSetItemMaxStates(menuRoot: String, idx: Long, maxStates: Long): Unit =
    singleton.globalMenuSetItemMaxStates(menuRoot, idx, maxStates)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_set_item_icon */
  final def globalMenuSetItemIcon(menuRoot: String, idx: Long, icon: Texture2D): Unit =
    singleton.globalMenuSetItemIcon(menuRoot, idx, icon)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_set_item_indentation_level */
  final def globalMenuSetItemIndentationLevel(menuRoot: String, idx: Long, level: Long): Unit =
    singleton.globalMenuSetItemIndentationLevel(menuRoot, idx, level)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_get_item_count */
  final def globalMenuGetItemCount(menuRoot: String): Long =
    singleton.globalMenuGetItemCount(menuRoot)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_remove_item */
  final def globalMenuRemoveItem(menuRoot: String, idx: Long): Unit =
    singleton.globalMenuRemoveItem(menuRoot, idx)

  /** Forwards to [[singleton]]: DisplayServer.global_menu_clear */
  final def globalMenuClear(menuRoot: String): Unit =
    singleton.globalMenuClear(menuRoot)

  /** Forwards to [[singleton]]: DisplayServer.tts_is_speaking */
  final def ttsIsSpeaking(): Boolean =
    singleton.ttsIsSpeaking()

  /** Forwards to [[singleton]]: DisplayServer.tts_is_paused */
  final def ttsIsPaused(): Boolean =
    singleton.ttsIsPaused()

  /** Forwards to [[singleton]]: DisplayServer.tts_pause */
  final def ttsPause(): Unit =
    singleton.ttsPause()

  /** Forwards to [[singleton]]: DisplayServer.tts_resume */
  final def ttsResume(): Unit =
    singleton.ttsResume()

  /** Forwards to [[singleton]]: DisplayServer.tts_stop */
  final def ttsStop(): Unit =
    singleton.ttsStop()

  /** Forwards to [[singleton]]: DisplayServer.is_dark_mode_supported */
  final def isDarkModeSupported(): Boolean =
    singleton.isDarkModeSupported()

  /** Forwards to [[singleton]]: DisplayServer.is_dark_mode */
  final def isDarkMode(): Boolean =
    singleton.isDarkMode()

  /** Forwards to [[singleton]]: DisplayServer.get_accent_color */
  final def getAccentColor(): gdext.builtin.Color =
    singleton.getAccentColor()

  /** Forwards to [[singleton]]: DisplayServer.get_base_color */
  final def getBaseColor(): gdext.builtin.Color =
    singleton.getBaseColor()

  /** Forwards to [[singleton]]: DisplayServer.mouse_set_mode */
  final def mouseSetMode(mouseMode: gdext.classes.DisplayServer.MouseMode): Unit =
    singleton.mouseSetMode(mouseMode)

  /** Forwards to [[singleton]]: DisplayServer.mouse_get_mode */
  final def mouseGetMode(): gdext.classes.DisplayServer.MouseMode =
    singleton.mouseGetMode()

  /** Forwards to [[singleton]]: DisplayServer.warp_mouse */
  final def warpMouse(position: gdext.builtin.Vector2i): Unit =
    singleton.warpMouse(position)

  /** Forwards to [[singleton]]: DisplayServer.mouse_get_position */
  final def mouseGetPosition(): gdext.builtin.Vector2i =
    singleton.mouseGetPosition()

  /** Forwards to [[singleton]]: DisplayServer.mouse_get_button_state */
  final def mouseGetButtonState(): gdext.classes.MouseButtonMask =
    singleton.mouseGetButtonState()

  /** Forwards to [[singleton]]: DisplayServer.clipboard_set */
  final def clipboardSet(clipboard: String): Unit =
    singleton.clipboardSet(clipboard)

  /** Forwards to [[singleton]]: DisplayServer.clipboard_get */
  final def clipboardGet(): String =
    singleton.clipboardGet()

  /** Forwards to [[singleton]]: DisplayServer.clipboard_get_image */
  final def clipboardGetImage(): Image =
    singleton.clipboardGetImage()

  /** Forwards to [[singleton]]: DisplayServer.clipboard_has */
  final def clipboardHas(): Boolean =
    singleton.clipboardHas()

  /** Forwards to [[singleton]]: DisplayServer.clipboard_has_image */
  final def clipboardHasImage(): Boolean =
    singleton.clipboardHasImage()

  /** Forwards to [[singleton]]: DisplayServer.clipboard_set_primary */
  final def clipboardSetPrimary(clipboardPrimary: String): Unit =
    singleton.clipboardSetPrimary(clipboardPrimary)

  /** Forwards to [[singleton]]: DisplayServer.clipboard_get_primary */
  final def clipboardGetPrimary(): String =
    singleton.clipboardGetPrimary()

  /** Forwards to [[singleton]]: DisplayServer.get_display_safe_area */
  final def getDisplaySafeArea(): gdext.builtin.Rect2i =
    singleton.getDisplaySafeArea()

  /** Forwards to [[singleton]]: DisplayServer.get_screen_count */
  final def getScreenCount(): Long =
    singleton.getScreenCount()

  /** Forwards to [[singleton]]: DisplayServer.get_primary_screen */
  final def getPrimaryScreen(): Long =
    singleton.getPrimaryScreen()

  /** Forwards to [[singleton]]: DisplayServer.get_keyboard_focus_screen */
  final def getKeyboardFocusScreen(): Long =
    singleton.getKeyboardFocusScreen()

  /** Forwards to [[singleton]]: DisplayServer.get_screen_from_rect */
  final def getScreenFromRect(rect: gdext.builtin.Rect2): Long =
    singleton.getScreenFromRect(rect)

  /** Forwards to [[singleton]]: DisplayServer.screen_get_position */
  final def screenGetPosition(screen: Long = -1L): gdext.builtin.Vector2i =
    singleton.screenGetPosition(screen)

  /** Forwards to [[singleton]]: DisplayServer.screen_get_size */
  final def screenGetSize(screen: Long = -1L): gdext.builtin.Vector2i =
    singleton.screenGetSize(screen)

  /** Forwards to [[singleton]]: DisplayServer.screen_get_usable_rect */
  final def screenGetUsableRect(screen: Long = -1L): gdext.builtin.Rect2i =
    singleton.screenGetUsableRect(screen)

  /** Forwards to [[singleton]]: DisplayServer.screen_get_dpi */
  final def screenGetDpi(screen: Long = -1L): Long =
    singleton.screenGetDpi(screen)

  /** Forwards to [[singleton]]: DisplayServer.screen_get_scale */
  final def screenGetScale(screen: Long = -1L): Double =
    singleton.screenGetScale(screen)

  /** Forwards to [[singleton]]: DisplayServer.is_touchscreen_available */
  final def isTouchscreenAvailable(): Boolean =
    singleton.isTouchscreenAvailable()

  /** Forwards to [[singleton]]: DisplayServer.screen_get_max_scale */
  final def screenGetMaxScale(): Double =
    singleton.screenGetMaxScale()

  /** Forwards to [[singleton]]: DisplayServer.screen_get_refresh_rate */
  final def screenGetRefreshRate(screen: Long = -1L): Double =
    singleton.screenGetRefreshRate(screen)

  /** Forwards to [[singleton]]: DisplayServer.screen_get_pixel */
  final def screenGetPixel(position: gdext.builtin.Vector2i): gdext.builtin.Color =
    singleton.screenGetPixel(position)

  /** Forwards to [[singleton]]: DisplayServer.screen_get_image */
  final def screenGetImage(screen: Long = -1L): Image =
    singleton.screenGetImage(screen)

  /** Forwards to [[singleton]]: DisplayServer.screen_get_image_rect */
  final def screenGetImageRect(rect: gdext.builtin.Rect2i): Image =
    singleton.screenGetImageRect(rect)

  /** Forwards to [[singleton]]: DisplayServer.screen_set_orientation */
  final def screenSetOrientation(orientation: gdext.classes.DisplayServer.ScreenOrientation, screen: Long = -1L): Unit =
    singleton.screenSetOrientation(orientation, screen)

  /** Forwards to [[singleton]]: DisplayServer.screen_get_orientation */
  final def screenGetOrientation(screen: Long = -1L): gdext.classes.DisplayServer.ScreenOrientation =
    singleton.screenGetOrientation(screen)

  /** Forwards to [[singleton]]: DisplayServer.screen_set_keep_on */
  final def screenSetKeepOn(enable: Boolean): Unit =
    singleton.screenSetKeepOn(enable)

  /** Forwards to [[singleton]]: DisplayServer.screen_is_kept_on */
  final def screenIsKeptOn(): Boolean =
    singleton.screenIsKeptOn()

  /** Forwards to [[singleton]]: DisplayServer.get_window_at_screen_position */
  final def getWindowAtScreenPosition(position: gdext.builtin.Vector2i): Long =
    singleton.getWindowAtScreenPosition(position)

  /** Forwards to [[singleton]]: DisplayServer.window_get_native_handle */
  final def windowGetNativeHandle(handleType: gdext.classes.DisplayServer.HandleType, windowId: Long = 0L): Long =
    singleton.windowGetNativeHandle(handleType, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_active_popup */
  final def windowGetActivePopup(): Long =
    singleton.windowGetActivePopup()

  /** Forwards to [[singleton]]: DisplayServer.window_set_popup_safe_rect */
  final def windowSetPopupSafeRect(window: Long, rect: gdext.builtin.Rect2i): Unit =
    singleton.windowSetPopupSafeRect(window, rect)

  /** Forwards to [[singleton]]: DisplayServer.window_get_popup_safe_rect */
  final def windowGetPopupSafeRect(window: Long): gdext.builtin.Rect2i =
    singleton.windowGetPopupSafeRect(window)

  /** Forwards to [[singleton]]: DisplayServer.window_set_title */
  final def windowSetTitle(title: String, windowId: Long = 0L): Unit =
    singleton.windowSetTitle(title, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_title_size */
  final def windowGetTitleSize(title: String, windowId: Long = 0L): gdext.builtin.Vector2i =
    singleton.windowGetTitleSize(title, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_current_screen */
  final def windowGetCurrentScreen(windowId: Long = 0L): Long =
    singleton.windowGetCurrentScreen(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_set_current_screen */
  final def windowSetCurrentScreen(screen: Long, windowId: Long = 0L): Unit =
    singleton.windowSetCurrentScreen(screen, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_position */
  final def windowGetPosition(windowId: Long = 0L): gdext.builtin.Vector2i =
    singleton.windowGetPosition(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_position_with_decorations */
  final def windowGetPositionWithDecorations(windowId: Long = 0L): gdext.builtin.Vector2i =
    singleton.windowGetPositionWithDecorations(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_set_position */
  final def windowSetPosition(position: gdext.builtin.Vector2i, windowId: Long = 0L): Unit =
    singleton.windowSetPosition(position, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_size */
  final def windowGetSize(windowId: Long = 0L): gdext.builtin.Vector2i =
    singleton.windowGetSize(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_set_size */
  final def windowSetSize(size: gdext.builtin.Vector2i, windowId: Long = 0L): Unit =
    singleton.windowSetSize(size, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_attached_instance_id */
  final def windowGetAttachedInstanceId(windowId: Long = 0L): Long =
    singleton.windowGetAttachedInstanceId(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_max_size */
  final def windowGetMaxSize(windowId: Long = 0L): gdext.builtin.Vector2i =
    singleton.windowGetMaxSize(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_set_max_size */
  final def windowSetMaxSize(maxSize: gdext.builtin.Vector2i, windowId: Long = 0L): Unit =
    singleton.windowSetMaxSize(maxSize, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_min_size */
  final def windowGetMinSize(windowId: Long = 0L): gdext.builtin.Vector2i =
    singleton.windowGetMinSize(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_set_min_size */
  final def windowSetMinSize(minSize: gdext.builtin.Vector2i, windowId: Long = 0L): Unit =
    singleton.windowSetMinSize(minSize, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_size_with_decorations */
  final def windowGetSizeWithDecorations(windowId: Long = 0L): gdext.builtin.Vector2i =
    singleton.windowGetSizeWithDecorations(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_mode */
  final def windowGetMode(windowId: Long = 0L): gdext.classes.DisplayServer.WindowMode =
    singleton.windowGetMode(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_set_mode */
  final def windowSetMode(mode: gdext.classes.DisplayServer.WindowMode, windowId: Long = 0L): Unit =
    singleton.windowSetMode(mode, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_set_flag */
  final def windowSetFlag(flag: gdext.classes.DisplayServer.WindowFlags, enabled: Boolean, windowId: Long = 0L): Unit =
    singleton.windowSetFlag(flag, enabled, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_flag */
  final def windowGetFlag(flag: gdext.classes.DisplayServer.WindowFlags, windowId: Long = 0L): Boolean =
    singleton.windowGetFlag(flag, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_set_window_buttons_offset */
  final def windowSetWindowButtonsOffset(offset: gdext.builtin.Vector2i, windowId: Long = 0L): Unit =
    singleton.windowSetWindowButtonsOffset(offset, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_safe_title_margins */
  final def windowGetSafeTitleMargins(windowId: Long = 0L): gdext.builtin.Vector3i =
    singleton.windowGetSafeTitleMargins(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_request_attention */
  final def windowRequestAttention(windowId: Long = 0L): Unit =
    singleton.windowRequestAttention(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_move_to_foreground */
  final def windowMoveToForeground(windowId: Long = 0L): Unit =
    singleton.windowMoveToForeground(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_is_focused */
  final def windowIsFocused(windowId: Long = 0L): Boolean =
    singleton.windowIsFocused(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_can_draw */
  final def windowCanDraw(windowId: Long = 0L): Boolean =
    singleton.windowCanDraw(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_set_transient */
  final def windowSetTransient(windowId: Long, parentWindowId: Long): Unit =
    singleton.windowSetTransient(windowId, parentWindowId)

  /** Forwards to [[singleton]]: DisplayServer.window_set_exclusive */
  final def windowSetExclusive(windowId: Long, exclusive: Boolean): Unit =
    singleton.windowSetExclusive(windowId, exclusive)

  /** Forwards to [[singleton]]: DisplayServer.window_set_ime_active */
  final def windowSetImeActive(active: Boolean, windowId: Long = 0L): Unit =
    singleton.windowSetImeActive(active, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_set_ime_position */
  final def windowSetImePosition(position: gdext.builtin.Vector2i, windowId: Long = 0L): Unit =
    singleton.windowSetImePosition(position, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_set_vsync_mode */
  final def windowSetVsyncMode(vsyncMode: gdext.classes.DisplayServer.VSyncMode, windowId: Long = 0L): Unit =
    singleton.windowSetVsyncMode(vsyncMode, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_get_vsync_mode */
  final def windowGetVsyncMode(windowId: Long = 0L): gdext.classes.DisplayServer.VSyncMode =
    singleton.windowGetVsyncMode(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_is_maximize_allowed */
  final def windowIsMaximizeAllowed(windowId: Long = 0L): Boolean =
    singleton.windowIsMaximizeAllowed(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_maximize_on_title_dbl_click */
  final def windowMaximizeOnTitleDblClick(): Boolean =
    singleton.windowMaximizeOnTitleDblClick()

  /** Forwards to [[singleton]]: DisplayServer.window_minimize_on_title_dbl_click */
  final def windowMinimizeOnTitleDblClick(): Boolean =
    singleton.windowMinimizeOnTitleDblClick()

  /** Forwards to [[singleton]]: DisplayServer.window_start_drag */
  final def windowStartDrag(windowId: Long = 0L): Unit =
    singleton.windowStartDrag(windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_start_resize */
  final def windowStartResize(edge: gdext.classes.DisplayServer.WindowResizeEdge, windowId: Long = 0L): Unit =
    singleton.windowStartResize(edge, windowId)

  /** Forwards to [[singleton]]: DisplayServer.window_set_color */
  final def windowSetColor(color: gdext.builtin.Color): Unit =
    singleton.windowSetColor(color)

  /** Forwards to [[singleton]]: DisplayServer.accessibility_should_increase_contrast */
  final def accessibilityShouldIncreaseContrast(): Long =
    singleton.accessibilityShouldIncreaseContrast()

  /** Forwards to [[singleton]]: DisplayServer.accessibility_should_reduce_animation */
  final def accessibilityShouldReduceAnimation(): Long =
    singleton.accessibilityShouldReduceAnimation()

  /** Forwards to [[singleton]]: DisplayServer.accessibility_should_reduce_transparency */
  final def accessibilityShouldReduceTransparency(): Long =
    singleton.accessibilityShouldReduceTransparency()

  /** Forwards to [[singleton]]: DisplayServer.accessibility_screen_reader_active */
  final def accessibilityScreenReaderActive(): Long =
    singleton.accessibilityScreenReaderActive()

  /** Forwards to [[singleton]]: DisplayServer.accessibility_set_window_rect */
  final def accessibilitySetWindowRect(windowId: Long, rectOut: gdext.builtin.Rect2, rectIn: gdext.builtin.Rect2): Unit =
    singleton.accessibilitySetWindowRect(windowId, rectOut, rectIn)

  /** Forwards to [[singleton]]: DisplayServer.accessibility_set_window_focused */
  final def accessibilitySetWindowFocused(windowId: Long, focused: Boolean): Unit =
    singleton.accessibilitySetWindowFocused(windowId, focused)

  /** Forwards to [[singleton]]: DisplayServer.ime_get_selection */
  final def imeGetSelection(): gdext.builtin.Vector2i =
    singleton.imeGetSelection()

  /** Forwards to [[singleton]]: DisplayServer.ime_get_text */
  final def imeGetText(): String =
    singleton.imeGetText()

  /** Forwards to [[singleton]]: DisplayServer.virtual_keyboard_show */
  final def virtualKeyboardShow(existingText: String, position: gdext.builtin.Rect2 = gdext.builtin.Rect2(0f, 0f, 0f, 0f), `type`: gdext.classes.DisplayServer.VirtualKeyboardType = gdext.classes.DisplayServer.VirtualKeyboardType(0L), maxLength: Long = -1L, cursorStart: Long = -1L, cursorEnd: Long = -1L): Unit =
    singleton.virtualKeyboardShow(existingText, position, `type`, maxLength, cursorStart, cursorEnd)

  /** Forwards to [[singleton]]: DisplayServer.virtual_keyboard_hide */
  final def virtualKeyboardHide(): Unit =
    singleton.virtualKeyboardHide()

  /** Forwards to [[singleton]]: DisplayServer.virtual_keyboard_get_height */
  final def virtualKeyboardGetHeight(): Long =
    singleton.virtualKeyboardGetHeight()

  /** Forwards to [[singleton]]: DisplayServer.has_hardware_keyboard */
  final def hasHardwareKeyboard(): Boolean =
    singleton.hasHardwareKeyboard()

  /** Forwards to [[singleton]]: DisplayServer.cursor_set_shape */
  final def cursorSetShape(shape: gdext.classes.DisplayServer.CursorShape): Unit =
    singleton.cursorSetShape(shape)

  /** Forwards to [[singleton]]: DisplayServer.cursor_get_shape */
  final def cursorGetShape(): gdext.classes.DisplayServer.CursorShape =
    singleton.cursorGetShape()

  /** Forwards to [[singleton]]: DisplayServer.cursor_set_custom_image */
  final def cursorSetCustomImage(cursor: Resource, shape: gdext.classes.DisplayServer.CursorShape = gdext.classes.DisplayServer.CursorShape(0L), hotspot: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): Unit =
    singleton.cursorSetCustomImage(cursor, shape, hotspot)

  /** Forwards to [[singleton]]: DisplayServer.get_swap_cancel_ok */
  final def getSwapCancelOk(): Boolean =
    singleton.getSwapCancelOk()

  /** Forwards to [[singleton]]: DisplayServer.enable_for_stealing_focus */
  final def enableForStealingFocus(processId: Long): Unit =
    singleton.enableForStealingFocus(processId)

  /** Forwards to [[singleton]]: DisplayServer.beep */
  final def beep(): Unit =
    singleton.beep()

  /** Forwards to [[singleton]]: DisplayServer.keyboard_get_layout_count */
  final def keyboardGetLayoutCount(): Long =
    singleton.keyboardGetLayoutCount()

  /** Forwards to [[singleton]]: DisplayServer.keyboard_get_current_layout */
  final def keyboardGetCurrentLayout(): Long =
    singleton.keyboardGetCurrentLayout()

  /** Forwards to [[singleton]]: DisplayServer.keyboard_set_current_layout */
  final def keyboardSetCurrentLayout(index: Long): Unit =
    singleton.keyboardSetCurrentLayout(index)

  /** Forwards to [[singleton]]: DisplayServer.keyboard_get_layout_language */
  final def keyboardGetLayoutLanguage(index: Long): String =
    singleton.keyboardGetLayoutLanguage(index)

  /** Forwards to [[singleton]]: DisplayServer.keyboard_get_layout_name */
  final def keyboardGetLayoutName(index: Long): String =
    singleton.keyboardGetLayoutName(index)

  /** Forwards to [[singleton]]: DisplayServer.keyboard_get_keycode_from_physical */
  final def keyboardGetKeycodeFromPhysical(keycode: gdext.classes.Key): gdext.classes.Key =
    singleton.keyboardGetKeycodeFromPhysical(keycode)

  /** Forwards to [[singleton]]: DisplayServer.keyboard_get_label_from_physical */
  final def keyboardGetLabelFromPhysical(keycode: gdext.classes.Key): gdext.classes.Key =
    singleton.keyboardGetLabelFromPhysical(keycode)

  /** Forwards to [[singleton]]: DisplayServer.show_emoji_and_symbol_picker */
  final def showEmojiAndSymbolPicker(): Unit =
    singleton.showEmojiAndSymbolPicker()

  /** Forwards to [[singleton]]: DisplayServer.process_events */
  final def processEvents(): Unit =
    singleton.processEvents()

  /** Forwards to [[singleton]]: DisplayServer.force_process_and_drop_events */
  final def forceProcessAndDropEvents(): Unit =
    singleton.forceProcessAndDropEvents()

  /** Forwards to [[singleton]]: DisplayServer.set_native_icon */
  final def setNativeIcon(filename: String): Unit =
    singleton.setNativeIcon(filename)

  /** Forwards to [[singleton]]: DisplayServer.set_icon */
  final def setIcon(image: Image): Unit =
    singleton.setIcon(image)

  /** Forwards to [[singleton]]: DisplayServer.status_indicator_set_icon */
  final def statusIndicatorSetIcon(id: Long, icon: Texture2D): Unit =
    singleton.statusIndicatorSetIcon(id, icon)

  /** Forwards to [[singleton]]: DisplayServer.status_indicator_set_tooltip */
  final def statusIndicatorSetTooltip(id: Long, tooltip: String): Unit =
    singleton.statusIndicatorSetTooltip(id, tooltip)

  /** Forwards to [[singleton]]: DisplayServer.status_indicator_get_rect */
  final def statusIndicatorGetRect(id: Long): gdext.builtin.Rect2 =
    singleton.statusIndicatorGetRect(id)

  /** Forwards to [[singleton]]: DisplayServer.delete_status_indicator */
  final def deleteStatusIndicator(id: Long): Unit =
    singleton.deleteStatusIndicator(id)

  /** Forwards to [[singleton]]: DisplayServer.tablet_get_driver_count */
  final def tabletGetDriverCount(): Long =
    singleton.tabletGetDriverCount()

  /** Forwards to [[singleton]]: DisplayServer.tablet_get_driver_name */
  final def tabletGetDriverName(idx: Long): String =
    singleton.tabletGetDriverName(idx)

  /** Forwards to [[singleton]]: DisplayServer.tablet_get_current_driver */
  final def tabletGetCurrentDriver(): String =
    singleton.tabletGetCurrentDriver()

  /** Forwards to [[singleton]]: DisplayServer.tablet_set_current_driver */
  final def tabletSetCurrentDriver(name: String): Unit =
    singleton.tabletSetCurrentDriver(name)

  /** Forwards to [[singleton]]: DisplayServer.is_window_transparency_available */
  final def isWindowTransparencyAvailable(): Boolean =
    singleton.isWindowTransparencyAvailable()

  /** Forwards to [[singleton]]: DisplayServer.register_additional_output */
  final def registerAdditionalOutput(`object`: Object): Unit =
    singleton.registerAdditionalOutput(`object`)

  /** Forwards to [[singleton]]: DisplayServer.unregister_additional_output */
  final def unregisterAdditionalOutput(`object`: Object): Unit =
    singleton.unregisterAdditionalOutput(`object`)

  /** Forwards to [[singleton]]: DisplayServer.has_additional_outputs */
  final def hasAdditionalOutputs(): Boolean =
    singleton.hasAdditionalOutputs()

  /** Godot enum `DisplayServer.Feature`. */
  opaque type Feature <: Long = Long

  object Feature {
    final val GlobalMenu: Feature = 0L.asInstanceOf[Feature]
    final val Subwindows: Feature = 1L.asInstanceOf[Feature]
    final val Touchscreen: Feature = 2L.asInstanceOf[Feature]
    final val Mouse: Feature = 3L.asInstanceOf[Feature]
    final val MouseWarp: Feature = 4L.asInstanceOf[Feature]
    final val Clipboard: Feature = 5L.asInstanceOf[Feature]
    final val VirtualKeyboard: Feature = 6L.asInstanceOf[Feature]
    final val CursorShape: Feature = 7L.asInstanceOf[Feature]
    final val CustomCursorShape: Feature = 8L.asInstanceOf[Feature]
    final val NativeDialog: Feature = 9L.asInstanceOf[Feature]
    final val Ime: Feature = 10L.asInstanceOf[Feature]
    final val WindowTransparency: Feature = 11L.asInstanceOf[Feature]
    final val Hidpi: Feature = 12L.asInstanceOf[Feature]
    final val Icon: Feature = 13L.asInstanceOf[Feature]
    final val NativeIcon: Feature = 14L.asInstanceOf[Feature]
    final val Orientation: Feature = 15L.asInstanceOf[Feature]
    final val SwapBuffers: Feature = 16L.asInstanceOf[Feature]
    final val ClipboardPrimary: Feature = 18L.asInstanceOf[Feature]
    final val TextToSpeech: Feature = 19L.asInstanceOf[Feature]
    final val ExtendToTitle: Feature = 20L.asInstanceOf[Feature]
    final val ScreenCapture: Feature = 21L.asInstanceOf[Feature]
    final val StatusIndicator: Feature = 22L.asInstanceOf[Feature]
    final val NativeHelp: Feature = 23L.asInstanceOf[Feature]
    final val NativeDialogInput: Feature = 24L.asInstanceOf[Feature]
    final val NativeDialogFile: Feature = 25L.asInstanceOf[Feature]
    final val NativeDialogFileExtra: Feature = 26L.asInstanceOf[Feature]
    final val WindowDrag: Feature = 27L.asInstanceOf[Feature]
    final val ScreenExcludeFromCapture: Feature = 28L.asInstanceOf[Feature]
    final val WindowEmbedding: Feature = 29L.asInstanceOf[Feature]
    final val NativeDialogFileMime: Feature = 30L.asInstanceOf[Feature]
    final val EmojiAndSymbolPicker: Feature = 31L.asInstanceOf[Feature]
    final val NativeColorPicker: Feature = 32L.asInstanceOf[Feature]
    final val SelfFittingWindows: Feature = 33L.asInstanceOf[Feature]
    final val AccessibilityScreenReader: Feature = 34L.asInstanceOf[Feature]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Feature = value.asInstanceOf[Feature]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Feature] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L).asInstanceOf[scala.IArray[Feature]]

    extension (self: Feature)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "GlobalMenu"
        case 1L => "Subwindows"
        case 2L => "Touchscreen"
        case 3L => "Mouse"
        case 4L => "MouseWarp"
        case 5L => "Clipboard"
        case 6L => "VirtualKeyboard"
        case 7L => "CursorShape"
        case 8L => "CustomCursorShape"
        case 9L => "NativeDialog"
        case 10L => "Ime"
        case 11L => "WindowTransparency"
        case 12L => "Hidpi"
        case 13L => "Icon"
        case 14L => "NativeIcon"
        case 15L => "Orientation"
        case 16L => "SwapBuffers"
        case 18L => "ClipboardPrimary"
        case 19L => "TextToSpeech"
        case 20L => "ExtendToTitle"
        case 21L => "ScreenCapture"
        case 22L => "StatusIndicator"
        case 23L => "NativeHelp"
        case 24L => "NativeDialogInput"
        case 25L => "NativeDialogFile"
        case 26L => "NativeDialogFileExtra"
        case 27L => "WindowDrag"
        case 28L => "ScreenExcludeFromCapture"
        case 29L => "WindowEmbedding"
        case 30L => "NativeDialogFileMime"
        case 31L => "EmojiAndSymbolPicker"
        case 32L => "NativeColorPicker"
        case 33L => "SelfFittingWindows"
        case 34L => "AccessibilityScreenReader"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.AccessibilityRole`. */
  opaque type AccessibilityRole <: Long = Long

  object AccessibilityRole {
    final val Unknown: AccessibilityRole = 0L.asInstanceOf[AccessibilityRole]
    final val DefaultButton: AccessibilityRole = 1L.asInstanceOf[AccessibilityRole]
    final val Audio: AccessibilityRole = 2L.asInstanceOf[AccessibilityRole]
    final val Video: AccessibilityRole = 3L.asInstanceOf[AccessibilityRole]
    final val StaticText: AccessibilityRole = 4L.asInstanceOf[AccessibilityRole]
    final val Container: AccessibilityRole = 5L.asInstanceOf[AccessibilityRole]
    final val Panel: AccessibilityRole = 6L.asInstanceOf[AccessibilityRole]
    final val Button: AccessibilityRole = 7L.asInstanceOf[AccessibilityRole]
    final val Link: AccessibilityRole = 8L.asInstanceOf[AccessibilityRole]
    final val CheckBox: AccessibilityRole = 9L.asInstanceOf[AccessibilityRole]
    final val RadioButton: AccessibilityRole = 10L.asInstanceOf[AccessibilityRole]
    final val CheckButton: AccessibilityRole = 11L.asInstanceOf[AccessibilityRole]
    final val ScrollBar: AccessibilityRole = 12L.asInstanceOf[AccessibilityRole]
    final val ScrollView: AccessibilityRole = 13L.asInstanceOf[AccessibilityRole]
    final val Splitter: AccessibilityRole = 14L.asInstanceOf[AccessibilityRole]
    final val Slider: AccessibilityRole = 15L.asInstanceOf[AccessibilityRole]
    final val SpinButton: AccessibilityRole = 16L.asInstanceOf[AccessibilityRole]
    final val ProgressIndicator: AccessibilityRole = 17L.asInstanceOf[AccessibilityRole]
    final val TextField: AccessibilityRole = 18L.asInstanceOf[AccessibilityRole]
    final val MultilineTextField: AccessibilityRole = 19L.asInstanceOf[AccessibilityRole]
    final val ColorPicker: AccessibilityRole = 20L.asInstanceOf[AccessibilityRole]
    final val Table: AccessibilityRole = 21L.asInstanceOf[AccessibilityRole]
    final val Cell: AccessibilityRole = 22L.asInstanceOf[AccessibilityRole]
    final val Row: AccessibilityRole = 23L.asInstanceOf[AccessibilityRole]
    final val RowGroup: AccessibilityRole = 24L.asInstanceOf[AccessibilityRole]
    final val RowHeader: AccessibilityRole = 25L.asInstanceOf[AccessibilityRole]
    final val ColumnHeader: AccessibilityRole = 26L.asInstanceOf[AccessibilityRole]
    final val Tree: AccessibilityRole = 27L.asInstanceOf[AccessibilityRole]
    final val TreeItem: AccessibilityRole = 28L.asInstanceOf[AccessibilityRole]
    final val List: AccessibilityRole = 29L.asInstanceOf[AccessibilityRole]
    final val ListItem: AccessibilityRole = 30L.asInstanceOf[AccessibilityRole]
    final val ListBox: AccessibilityRole = 31L.asInstanceOf[AccessibilityRole]
    final val ListBoxOption: AccessibilityRole = 32L.asInstanceOf[AccessibilityRole]
    final val TabBar: AccessibilityRole = 33L.asInstanceOf[AccessibilityRole]
    final val Tab: AccessibilityRole = 34L.asInstanceOf[AccessibilityRole]
    final val TabPanel: AccessibilityRole = 35L.asInstanceOf[AccessibilityRole]
    final val MenuBar: AccessibilityRole = 36L.asInstanceOf[AccessibilityRole]
    final val Menu: AccessibilityRole = 37L.asInstanceOf[AccessibilityRole]
    final val MenuItem: AccessibilityRole = 38L.asInstanceOf[AccessibilityRole]
    final val MenuItemCheckBox: AccessibilityRole = 39L.asInstanceOf[AccessibilityRole]
    final val MenuItemRadio: AccessibilityRole = 40L.asInstanceOf[AccessibilityRole]
    final val Image: AccessibilityRole = 41L.asInstanceOf[AccessibilityRole]
    final val Window: AccessibilityRole = 42L.asInstanceOf[AccessibilityRole]
    final val TitleBar: AccessibilityRole = 43L.asInstanceOf[AccessibilityRole]
    final val Dialog: AccessibilityRole = 44L.asInstanceOf[AccessibilityRole]
    final val Tooltip: AccessibilityRole = 45L.asInstanceOf[AccessibilityRole]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AccessibilityRole = value.asInstanceOf[AccessibilityRole]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AccessibilityRole] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 35L, 36L, 37L, 38L, 39L, 40L, 41L, 42L, 43L, 44L, 45L).asInstanceOf[scala.IArray[AccessibilityRole]]

    extension (self: AccessibilityRole)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unknown"
        case 1L => "DefaultButton"
        case 2L => "Audio"
        case 3L => "Video"
        case 4L => "StaticText"
        case 5L => "Container"
        case 6L => "Panel"
        case 7L => "Button"
        case 8L => "Link"
        case 9L => "CheckBox"
        case 10L => "RadioButton"
        case 11L => "CheckButton"
        case 12L => "ScrollBar"
        case 13L => "ScrollView"
        case 14L => "Splitter"
        case 15L => "Slider"
        case 16L => "SpinButton"
        case 17L => "ProgressIndicator"
        case 18L => "TextField"
        case 19L => "MultilineTextField"
        case 20L => "ColorPicker"
        case 21L => "Table"
        case 22L => "Cell"
        case 23L => "Row"
        case 24L => "RowGroup"
        case 25L => "RowHeader"
        case 26L => "ColumnHeader"
        case 27L => "Tree"
        case 28L => "TreeItem"
        case 29L => "List"
        case 30L => "ListItem"
        case 31L => "ListBox"
        case 32L => "ListBoxOption"
        case 33L => "TabBar"
        case 34L => "Tab"
        case 35L => "TabPanel"
        case 36L => "MenuBar"
        case 37L => "Menu"
        case 38L => "MenuItem"
        case 39L => "MenuItemCheckBox"
        case 40L => "MenuItemRadio"
        case 41L => "Image"
        case 42L => "Window"
        case 43L => "TitleBar"
        case 44L => "Dialog"
        case 45L => "Tooltip"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.AccessibilityPopupType`. */
  opaque type AccessibilityPopupType <: Long = Long

  object AccessibilityPopupType {
    final val Menu: AccessibilityPopupType = 0L.asInstanceOf[AccessibilityPopupType]
    final val List: AccessibilityPopupType = 1L.asInstanceOf[AccessibilityPopupType]
    final val Tree: AccessibilityPopupType = 2L.asInstanceOf[AccessibilityPopupType]
    final val Dialog: AccessibilityPopupType = 3L.asInstanceOf[AccessibilityPopupType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AccessibilityPopupType = value.asInstanceOf[AccessibilityPopupType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AccessibilityPopupType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[AccessibilityPopupType]]

    extension (self: AccessibilityPopupType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Menu"
        case 1L => "List"
        case 2L => "Tree"
        case 3L => "Dialog"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.AccessibilityFlags`. */
  opaque type AccessibilityFlags <: Long = Long

  object AccessibilityFlags {
    final val Hidden: AccessibilityFlags = 0L.asInstanceOf[AccessibilityFlags]
    final val Multiselectable: AccessibilityFlags = 1L.asInstanceOf[AccessibilityFlags]
    final val Required: AccessibilityFlags = 2L.asInstanceOf[AccessibilityFlags]
    final val Visited: AccessibilityFlags = 3L.asInstanceOf[AccessibilityFlags]
    final val Busy: AccessibilityFlags = 4L.asInstanceOf[AccessibilityFlags]
    final val Modal: AccessibilityFlags = 5L.asInstanceOf[AccessibilityFlags]
    final val TouchPassthrough: AccessibilityFlags = 6L.asInstanceOf[AccessibilityFlags]
    final val Readonly: AccessibilityFlags = 7L.asInstanceOf[AccessibilityFlags]
    final val Disabled: AccessibilityFlags = 8L.asInstanceOf[AccessibilityFlags]
    final val ClipsChildren: AccessibilityFlags = 9L.asInstanceOf[AccessibilityFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AccessibilityFlags = value.asInstanceOf[AccessibilityFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AccessibilityFlags] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L).asInstanceOf[scala.IArray[AccessibilityFlags]]

    extension (self: AccessibilityFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Hidden"
        case 1L => "Multiselectable"
        case 2L => "Required"
        case 3L => "Visited"
        case 4L => "Busy"
        case 5L => "Modal"
        case 6L => "TouchPassthrough"
        case 7L => "Readonly"
        case 8L => "Disabled"
        case 9L => "ClipsChildren"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.AccessibilityAction`. */
  opaque type AccessibilityAction <: Long = Long

  object AccessibilityAction {
    final val Click: AccessibilityAction = 0L.asInstanceOf[AccessibilityAction]
    final val Focus: AccessibilityAction = 1L.asInstanceOf[AccessibilityAction]
    final val Blur: AccessibilityAction = 2L.asInstanceOf[AccessibilityAction]
    final val Collapse: AccessibilityAction = 3L.asInstanceOf[AccessibilityAction]
    final val Expand: AccessibilityAction = 4L.asInstanceOf[AccessibilityAction]
    final val Decrement: AccessibilityAction = 5L.asInstanceOf[AccessibilityAction]
    final val Increment: AccessibilityAction = 6L.asInstanceOf[AccessibilityAction]
    final val HideTooltip: AccessibilityAction = 7L.asInstanceOf[AccessibilityAction]
    final val ShowTooltip: AccessibilityAction = 8L.asInstanceOf[AccessibilityAction]
    final val SetTextSelection: AccessibilityAction = 9L.asInstanceOf[AccessibilityAction]
    final val ReplaceSelectedText: AccessibilityAction = 10L.asInstanceOf[AccessibilityAction]
    final val ScrollBackward: AccessibilityAction = 11L.asInstanceOf[AccessibilityAction]
    final val ScrollDown: AccessibilityAction = 12L.asInstanceOf[AccessibilityAction]
    final val ScrollForward: AccessibilityAction = 13L.asInstanceOf[AccessibilityAction]
    final val ScrollLeft: AccessibilityAction = 14L.asInstanceOf[AccessibilityAction]
    final val ScrollRight: AccessibilityAction = 15L.asInstanceOf[AccessibilityAction]
    final val ScrollUp: AccessibilityAction = 16L.asInstanceOf[AccessibilityAction]
    final val ScrollIntoView: AccessibilityAction = 17L.asInstanceOf[AccessibilityAction]
    final val ScrollToPoint: AccessibilityAction = 18L.asInstanceOf[AccessibilityAction]
    final val SetScrollOffset: AccessibilityAction = 19L.asInstanceOf[AccessibilityAction]
    final val SetValue: AccessibilityAction = 20L.asInstanceOf[AccessibilityAction]
    final val ShowContextMenu: AccessibilityAction = 21L.asInstanceOf[AccessibilityAction]
    final val Custom: AccessibilityAction = 22L.asInstanceOf[AccessibilityAction]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AccessibilityAction = value.asInstanceOf[AccessibilityAction]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AccessibilityAction] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L).asInstanceOf[scala.IArray[AccessibilityAction]]

    extension (self: AccessibilityAction)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Click"
        case 1L => "Focus"
        case 2L => "Blur"
        case 3L => "Collapse"
        case 4L => "Expand"
        case 5L => "Decrement"
        case 6L => "Increment"
        case 7L => "HideTooltip"
        case 8L => "ShowTooltip"
        case 9L => "SetTextSelection"
        case 10L => "ReplaceSelectedText"
        case 11L => "ScrollBackward"
        case 12L => "ScrollDown"
        case 13L => "ScrollForward"
        case 14L => "ScrollLeft"
        case 15L => "ScrollRight"
        case 16L => "ScrollUp"
        case 17L => "ScrollIntoView"
        case 18L => "ScrollToPoint"
        case 19L => "SetScrollOffset"
        case 20L => "SetValue"
        case 21L => "ShowContextMenu"
        case 22L => "Custom"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.AccessibilityLiveMode`. */
  opaque type AccessibilityLiveMode <: Long = Long

  object AccessibilityLiveMode {
    final val Off: AccessibilityLiveMode = 0L.asInstanceOf[AccessibilityLiveMode]
    final val Polite: AccessibilityLiveMode = 1L.asInstanceOf[AccessibilityLiveMode]
    final val Assertive: AccessibilityLiveMode = 2L.asInstanceOf[AccessibilityLiveMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AccessibilityLiveMode = value.asInstanceOf[AccessibilityLiveMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AccessibilityLiveMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[AccessibilityLiveMode]]

    extension (self: AccessibilityLiveMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Off"
        case 1L => "Polite"
        case 2L => "Assertive"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.AccessibilityScrollUnit`. */
  opaque type AccessibilityScrollUnit <: Long = Long

  object AccessibilityScrollUnit {
    final val Item: AccessibilityScrollUnit = 0L.asInstanceOf[AccessibilityScrollUnit]
    final val Page: AccessibilityScrollUnit = 1L.asInstanceOf[AccessibilityScrollUnit]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AccessibilityScrollUnit = value.asInstanceOf[AccessibilityScrollUnit]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AccessibilityScrollUnit] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[AccessibilityScrollUnit]]

    extension (self: AccessibilityScrollUnit)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Item"
        case 1L => "Page"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.AccessibilityScrollHint`. */
  opaque type AccessibilityScrollHint <: Long = Long

  object AccessibilityScrollHint {
    final val TopLeft: AccessibilityScrollHint = 0L.asInstanceOf[AccessibilityScrollHint]
    final val BottomRight: AccessibilityScrollHint = 1L.asInstanceOf[AccessibilityScrollHint]
    final val TopEdge: AccessibilityScrollHint = 2L.asInstanceOf[AccessibilityScrollHint]
    final val BottomEdge: AccessibilityScrollHint = 3L.asInstanceOf[AccessibilityScrollHint]
    final val LeftEdge: AccessibilityScrollHint = 4L.asInstanceOf[AccessibilityScrollHint]
    final val RightEdge: AccessibilityScrollHint = 5L.asInstanceOf[AccessibilityScrollHint]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AccessibilityScrollHint = value.asInstanceOf[AccessibilityScrollHint]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AccessibilityScrollHint] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[AccessibilityScrollHint]]

    extension (self: AccessibilityScrollHint)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "TopLeft"
        case 1L => "BottomRight"
        case 2L => "TopEdge"
        case 3L => "BottomEdge"
        case 4L => "LeftEdge"
        case 5L => "RightEdge"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.MouseMode`. */
  opaque type MouseMode <: Long = Long

  object MouseMode {
    final val Visible: MouseMode = 0L.asInstanceOf[MouseMode]
    final val Hidden: MouseMode = 1L.asInstanceOf[MouseMode]
    final val Captured: MouseMode = 2L.asInstanceOf[MouseMode]
    final val Confined: MouseMode = 3L.asInstanceOf[MouseMode]
    final val ConfinedHidden: MouseMode = 4L.asInstanceOf[MouseMode]
    final val Max: MouseMode = 5L.asInstanceOf[MouseMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MouseMode = value.asInstanceOf[MouseMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MouseMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[MouseMode]]

    extension (self: MouseMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Visible"
        case 1L => "Hidden"
        case 2L => "Captured"
        case 3L => "Confined"
        case 4L => "ConfinedHidden"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.ScreenOrientation`. */
  opaque type ScreenOrientation <: Long = Long

  object ScreenOrientation {
    final val Landscape: ScreenOrientation = 0L.asInstanceOf[ScreenOrientation]
    final val Portrait: ScreenOrientation = 1L.asInstanceOf[ScreenOrientation]
    final val ReverseLandscape: ScreenOrientation = 2L.asInstanceOf[ScreenOrientation]
    final val ReversePortrait: ScreenOrientation = 3L.asInstanceOf[ScreenOrientation]
    final val SensorLandscape: ScreenOrientation = 4L.asInstanceOf[ScreenOrientation]
    final val SensorPortrait: ScreenOrientation = 5L.asInstanceOf[ScreenOrientation]
    final val Sensor: ScreenOrientation = 6L.asInstanceOf[ScreenOrientation]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ScreenOrientation = value.asInstanceOf[ScreenOrientation]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ScreenOrientation] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[ScreenOrientation]]

    extension (self: ScreenOrientation)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Landscape"
        case 1L => "Portrait"
        case 2L => "ReverseLandscape"
        case 3L => "ReversePortrait"
        case 4L => "SensorLandscape"
        case 5L => "SensorPortrait"
        case 6L => "Sensor"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.VirtualKeyboardType`. */
  opaque type VirtualKeyboardType <: Long = Long

  object VirtualKeyboardType {
    final val Default: VirtualKeyboardType = 0L.asInstanceOf[VirtualKeyboardType]
    final val Multiline: VirtualKeyboardType = 1L.asInstanceOf[VirtualKeyboardType]
    final val Number: VirtualKeyboardType = 2L.asInstanceOf[VirtualKeyboardType]
    final val NumberDecimal: VirtualKeyboardType = 3L.asInstanceOf[VirtualKeyboardType]
    final val Phone: VirtualKeyboardType = 4L.asInstanceOf[VirtualKeyboardType]
    final val EmailAddress: VirtualKeyboardType = 5L.asInstanceOf[VirtualKeyboardType]
    final val Password: VirtualKeyboardType = 6L.asInstanceOf[VirtualKeyboardType]
    final val Url: VirtualKeyboardType = 7L.asInstanceOf[VirtualKeyboardType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): VirtualKeyboardType = value.asInstanceOf[VirtualKeyboardType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[VirtualKeyboardType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[VirtualKeyboardType]]

    extension (self: VirtualKeyboardType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Default"
        case 1L => "Multiline"
        case 2L => "Number"
        case 3L => "NumberDecimal"
        case 4L => "Phone"
        case 5L => "EmailAddress"
        case 6L => "Password"
        case 7L => "Url"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.CursorShape`. */
  opaque type CursorShape <: Long = Long

  object CursorShape {
    final val Arrow: CursorShape = 0L.asInstanceOf[CursorShape]
    final val Ibeam: CursorShape = 1L.asInstanceOf[CursorShape]
    final val PointingHand: CursorShape = 2L.asInstanceOf[CursorShape]
    final val Cross: CursorShape = 3L.asInstanceOf[CursorShape]
    final val Wait: CursorShape = 4L.asInstanceOf[CursorShape]
    final val Busy: CursorShape = 5L.asInstanceOf[CursorShape]
    final val Drag: CursorShape = 6L.asInstanceOf[CursorShape]
    final val CanDrop: CursorShape = 7L.asInstanceOf[CursorShape]
    final val Forbidden: CursorShape = 8L.asInstanceOf[CursorShape]
    final val Vsize: CursorShape = 9L.asInstanceOf[CursorShape]
    final val Hsize: CursorShape = 10L.asInstanceOf[CursorShape]
    final val Bdiagsize: CursorShape = 11L.asInstanceOf[CursorShape]
    final val Fdiagsize: CursorShape = 12L.asInstanceOf[CursorShape]
    final val Move: CursorShape = 13L.asInstanceOf[CursorShape]
    final val Vsplit: CursorShape = 14L.asInstanceOf[CursorShape]
    final val Hsplit: CursorShape = 15L.asInstanceOf[CursorShape]
    final val Help: CursorShape = 16L.asInstanceOf[CursorShape]
    final val Max: CursorShape = 17L.asInstanceOf[CursorShape]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CursorShape = value.asInstanceOf[CursorShape]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CursorShape] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L).asInstanceOf[scala.IArray[CursorShape]]

    extension (self: CursorShape)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Arrow"
        case 1L => "Ibeam"
        case 2L => "PointingHand"
        case 3L => "Cross"
        case 4L => "Wait"
        case 5L => "Busy"
        case 6L => "Drag"
        case 7L => "CanDrop"
        case 8L => "Forbidden"
        case 9L => "Vsize"
        case 10L => "Hsize"
        case 11L => "Bdiagsize"
        case 12L => "Fdiagsize"
        case 13L => "Move"
        case 14L => "Vsplit"
        case 15L => "Hsplit"
        case 16L => "Help"
        case 17L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.FileDialogMode`. */
  opaque type FileDialogMode <: Long = Long

  object FileDialogMode {
    final val OpenFile: FileDialogMode = 0L.asInstanceOf[FileDialogMode]
    final val OpenFiles: FileDialogMode = 1L.asInstanceOf[FileDialogMode]
    final val OpenDir: FileDialogMode = 2L.asInstanceOf[FileDialogMode]
    final val OpenAny: FileDialogMode = 3L.asInstanceOf[FileDialogMode]
    final val SaveFile: FileDialogMode = 4L.asInstanceOf[FileDialogMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FileDialogMode = value.asInstanceOf[FileDialogMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FileDialogMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[FileDialogMode]]

    extension (self: FileDialogMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "OpenFile"
        case 1L => "OpenFiles"
        case 2L => "OpenDir"
        case 3L => "OpenAny"
        case 4L => "SaveFile"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.WindowMode`. */
  opaque type WindowMode <: Long = Long

  object WindowMode {
    final val Windowed: WindowMode = 0L.asInstanceOf[WindowMode]
    final val Minimized: WindowMode = 1L.asInstanceOf[WindowMode]
    final val Maximized: WindowMode = 2L.asInstanceOf[WindowMode]
    final val Fullscreen: WindowMode = 3L.asInstanceOf[WindowMode]
    final val ExclusiveFullscreen: WindowMode = 4L.asInstanceOf[WindowMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): WindowMode = value.asInstanceOf[WindowMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[WindowMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[WindowMode]]

    extension (self: WindowMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Windowed"
        case 1L => "Minimized"
        case 2L => "Maximized"
        case 3L => "Fullscreen"
        case 4L => "ExclusiveFullscreen"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.WindowFlags`. */
  opaque type WindowFlags <: Long = Long

  object WindowFlags {
    final val ResizeDisabled: WindowFlags = 0L.asInstanceOf[WindowFlags]
    final val Borderless: WindowFlags = 1L.asInstanceOf[WindowFlags]
    final val AlwaysOnTop: WindowFlags = 2L.asInstanceOf[WindowFlags]
    final val Transparent: WindowFlags = 3L.asInstanceOf[WindowFlags]
    final val NoFocus: WindowFlags = 4L.asInstanceOf[WindowFlags]
    final val Popup: WindowFlags = 5L.asInstanceOf[WindowFlags]
    final val ExtendToTitle: WindowFlags = 6L.asInstanceOf[WindowFlags]
    final val MousePassthrough: WindowFlags = 7L.asInstanceOf[WindowFlags]
    final val SharpCorners: WindowFlags = 8L.asInstanceOf[WindowFlags]
    final val ExcludeFromCapture: WindowFlags = 9L.asInstanceOf[WindowFlags]
    final val PopupWmHint: WindowFlags = 10L.asInstanceOf[WindowFlags]
    final val MinimizeDisabled: WindowFlags = 11L.asInstanceOf[WindowFlags]
    final val MaximizeDisabled: WindowFlags = 12L.asInstanceOf[WindowFlags]
    final val Max: WindowFlags = 13L.asInstanceOf[WindowFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): WindowFlags = value.asInstanceOf[WindowFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[WindowFlags] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L).asInstanceOf[scala.IArray[WindowFlags]]

    extension (self: WindowFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ResizeDisabled"
        case 1L => "Borderless"
        case 2L => "AlwaysOnTop"
        case 3L => "Transparent"
        case 4L => "NoFocus"
        case 5L => "Popup"
        case 6L => "ExtendToTitle"
        case 7L => "MousePassthrough"
        case 8L => "SharpCorners"
        case 9L => "ExcludeFromCapture"
        case 10L => "PopupWmHint"
        case 11L => "MinimizeDisabled"
        case 12L => "MaximizeDisabled"
        case 13L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.WindowEvent`. */
  opaque type WindowEvent <: Long = Long

  object WindowEvent {
    final val MouseEnter: WindowEvent = 0L.asInstanceOf[WindowEvent]
    final val MouseExit: WindowEvent = 1L.asInstanceOf[WindowEvent]
    final val FocusIn: WindowEvent = 2L.asInstanceOf[WindowEvent]
    final val FocusOut: WindowEvent = 3L.asInstanceOf[WindowEvent]
    final val CloseRequest: WindowEvent = 4L.asInstanceOf[WindowEvent]
    final val GoBackRequest: WindowEvent = 5L.asInstanceOf[WindowEvent]
    final val DpiChange: WindowEvent = 6L.asInstanceOf[WindowEvent]
    final val TitlebarChange: WindowEvent = 7L.asInstanceOf[WindowEvent]
    final val ForceClose: WindowEvent = 8L.asInstanceOf[WindowEvent]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): WindowEvent = value.asInstanceOf[WindowEvent]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[WindowEvent] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[WindowEvent]]

    extension (self: WindowEvent)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "MouseEnter"
        case 1L => "MouseExit"
        case 2L => "FocusIn"
        case 3L => "FocusOut"
        case 4L => "CloseRequest"
        case 5L => "GoBackRequest"
        case 6L => "DpiChange"
        case 7L => "TitlebarChange"
        case 8L => "ForceClose"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.WindowResizeEdge`. */
  opaque type WindowResizeEdge <: Long = Long

  object WindowResizeEdge {
    final val TopLeft: WindowResizeEdge = 0L.asInstanceOf[WindowResizeEdge]
    final val Top: WindowResizeEdge = 1L.asInstanceOf[WindowResizeEdge]
    final val TopRight: WindowResizeEdge = 2L.asInstanceOf[WindowResizeEdge]
    final val Left: WindowResizeEdge = 3L.asInstanceOf[WindowResizeEdge]
    final val Right: WindowResizeEdge = 4L.asInstanceOf[WindowResizeEdge]
    final val BottomLeft: WindowResizeEdge = 5L.asInstanceOf[WindowResizeEdge]
    final val Bottom: WindowResizeEdge = 6L.asInstanceOf[WindowResizeEdge]
    final val BottomRight: WindowResizeEdge = 7L.asInstanceOf[WindowResizeEdge]
    final val Max: WindowResizeEdge = 8L.asInstanceOf[WindowResizeEdge]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): WindowResizeEdge = value.asInstanceOf[WindowResizeEdge]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[WindowResizeEdge] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[WindowResizeEdge]]

    extension (self: WindowResizeEdge)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "TopLeft"
        case 1L => "Top"
        case 2L => "TopRight"
        case 3L => "Left"
        case 4L => "Right"
        case 5L => "BottomLeft"
        case 6L => "Bottom"
        case 7L => "BottomRight"
        case 8L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.VSyncMode`. */
  opaque type VSyncMode <: Long = Long

  object VSyncMode {
    final val Disabled: VSyncMode = 0L.asInstanceOf[VSyncMode]
    final val Enabled: VSyncMode = 1L.asInstanceOf[VSyncMode]
    final val Adaptive: VSyncMode = 2L.asInstanceOf[VSyncMode]
    final val Mailbox: VSyncMode = 3L.asInstanceOf[VSyncMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): VSyncMode = value.asInstanceOf[VSyncMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[VSyncMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[VSyncMode]]

    extension (self: VSyncMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Enabled"
        case 2L => "Adaptive"
        case 3L => "Mailbox"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.HandleType`. */
  opaque type HandleType <: Long = Long

  object HandleType {
    final val DisplayHandle: HandleType = 0L.asInstanceOf[HandleType]
    final val WindowHandle: HandleType = 1L.asInstanceOf[HandleType]
    final val WindowView: HandleType = 2L.asInstanceOf[HandleType]
    final val OpenglContext: HandleType = 3L.asInstanceOf[HandleType]
    final val EglDisplay: HandleType = 4L.asInstanceOf[HandleType]
    final val EglConfig: HandleType = 5L.asInstanceOf[HandleType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): HandleType = value.asInstanceOf[HandleType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[HandleType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[HandleType]]

    extension (self: HandleType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "DisplayHandle"
        case 1L => "WindowHandle"
        case 2L => "WindowView"
        case 3L => "OpenglContext"
        case 4L => "EglDisplay"
        case 5L => "EglConfig"
        case other => other.toString
      }
  }

  /** Godot enum `DisplayServer.TTSUtteranceEvent`. */
  opaque type TTSUtteranceEvent <: Long = Long

  object TTSUtteranceEvent {
    final val Started: TTSUtteranceEvent = 0L.asInstanceOf[TTSUtteranceEvent]
    final val Ended: TTSUtteranceEvent = 1L.asInstanceOf[TTSUtteranceEvent]
    final val Canceled: TTSUtteranceEvent = 2L.asInstanceOf[TTSUtteranceEvent]
    final val Boundary: TTSUtteranceEvent = 3L.asInstanceOf[TTSUtteranceEvent]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TTSUtteranceEvent = value.asInstanceOf[TTSUtteranceEvent]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TTSUtteranceEvent] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[TTSUtteranceEvent]]

    extension (self: TTSUtteranceEvent)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Started"
        case 1L => "Ended"
        case 2L => "Canceled"
        case 3L => "Boundary"
        case other => other.toString
      }
  }
}
