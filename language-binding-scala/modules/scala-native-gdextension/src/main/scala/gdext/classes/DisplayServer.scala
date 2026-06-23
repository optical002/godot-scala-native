package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `DisplayServer`, extends `Object`. */
abstract class DisplayServer extends Object {

  /** DisplayServer.has_feature */
  final def hasFeature(feature: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("DisplayServer", "has_feature", 334065950L), hostObject.objectPtr, feature)

  /** DisplayServer.get_name */
  final def getName(): String =
    Ptrcall.call0[String](MethodBind.get("DisplayServer", "get_name", 201670096L), hostObject.objectPtr)

  /** DisplayServer.global_menu_add_submenu_item */
  final def globalMenuAddSubmenuItem(menu_root: String, label: String, submenu: String, index: Long): Long =
    Ptrcall.call4[String, String, String, Long, Long](MethodBind.get("DisplayServer", "global_menu_add_submenu_item", 2828985934L), hostObject.objectPtr, menu_root, label, submenu, index)

  /** DisplayServer.global_menu_add_separator */
  final def globalMenuAddSeparator(menu_root: String, index: Long): Long =
    Ptrcall.call2[String, Long, Long](MethodBind.get("DisplayServer", "global_menu_add_separator", 3214812433L), hostObject.objectPtr, menu_root, index)

  /** DisplayServer.global_menu_get_item_index_from_text */
  final def globalMenuGetItemIndexFromText(menu_root: String, text: String): Long =
    Ptrcall.call2[String, String, Long](MethodBind.get("DisplayServer", "global_menu_get_item_index_from_text", 2878152881L), hostObject.objectPtr, menu_root, text)

  /** DisplayServer.global_menu_is_item_checked */
  final def globalMenuIsItemChecked(menu_root: String, idx: Long): Boolean =
    Ptrcall.call2[String, Long, Boolean](MethodBind.get("DisplayServer", "global_menu_is_item_checked", 3511468594L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_is_item_checkable */
  final def globalMenuIsItemCheckable(menu_root: String, idx: Long): Boolean =
    Ptrcall.call2[String, Long, Boolean](MethodBind.get("DisplayServer", "global_menu_is_item_checkable", 3511468594L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_is_item_radio_checkable */
  final def globalMenuIsItemRadioCheckable(menu_root: String, idx: Long): Boolean =
    Ptrcall.call2[String, Long, Boolean](MethodBind.get("DisplayServer", "global_menu_is_item_radio_checkable", 3511468594L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_get_item_text */
  final def globalMenuGetItemText(menu_root: String, idx: Long): String =
    Ptrcall.call2[String, Long, String](MethodBind.get("DisplayServer", "global_menu_get_item_text", 591067909L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_get_item_submenu */
  final def globalMenuGetItemSubmenu(menu_root: String, idx: Long): String =
    Ptrcall.call2[String, Long, String](MethodBind.get("DisplayServer", "global_menu_get_item_submenu", 591067909L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_get_item_accelerator */
  final def globalMenuGetItemAccelerator(menu_root: String, idx: Long): Long =
    Ptrcall.call2[String, Long, Long](MethodBind.get("DisplayServer", "global_menu_get_item_accelerator", 936065394L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_is_item_disabled */
  final def globalMenuIsItemDisabled(menu_root: String, idx: Long): Boolean =
    Ptrcall.call2[String, Long, Boolean](MethodBind.get("DisplayServer", "global_menu_is_item_disabled", 3511468594L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_is_item_hidden */
  final def globalMenuIsItemHidden(menu_root: String, idx: Long): Boolean =
    Ptrcall.call2[String, Long, Boolean](MethodBind.get("DisplayServer", "global_menu_is_item_hidden", 3511468594L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_get_item_tooltip */
  final def globalMenuGetItemTooltip(menu_root: String, idx: Long): String =
    Ptrcall.call2[String, Long, String](MethodBind.get("DisplayServer", "global_menu_get_item_tooltip", 591067909L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_get_item_state */
  final def globalMenuGetItemState(menu_root: String, idx: Long): Long =
    Ptrcall.call2[String, Long, Long](MethodBind.get("DisplayServer", "global_menu_get_item_state", 3422818498L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_get_item_max_states */
  final def globalMenuGetItemMaxStates(menu_root: String, idx: Long): Long =
    Ptrcall.call2[String, Long, Long](MethodBind.get("DisplayServer", "global_menu_get_item_max_states", 3422818498L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_get_item_icon */
  final def globalMenuGetItemIcon(menu_root: String, idx: Long): GodotObject =
    Ptrcall.call2[String, Long, GodotObject](MethodBind.get("DisplayServer", "global_menu_get_item_icon", 3591713183L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_get_item_indentation_level */
  final def globalMenuGetItemIndentationLevel(menu_root: String, idx: Long): Long =
    Ptrcall.call2[String, Long, Long](MethodBind.get("DisplayServer", "global_menu_get_item_indentation_level", 3422818498L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_set_item_checked */
  final def globalMenuSetItemChecked(menu_root: String, idx: Long, checked: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "global_menu_set_item_checked", 4108344793L), hostObject.objectPtr, menu_root, idx, checked)

  /** DisplayServer.global_menu_set_item_checkable */
  final def globalMenuSetItemCheckable(menu_root: String, idx: Long, checkable: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "global_menu_set_item_checkable", 4108344793L), hostObject.objectPtr, menu_root, idx, checkable)

  /** DisplayServer.global_menu_set_item_radio_checkable */
  final def globalMenuSetItemRadioCheckable(menu_root: String, idx: Long, checkable: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "global_menu_set_item_radio_checkable", 4108344793L), hostObject.objectPtr, menu_root, idx, checkable)

  /** DisplayServer.global_menu_set_item_text */
  final def globalMenuSetItemText(menu_root: String, idx: Long, text: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "global_menu_set_item_text", 965966136L), hostObject.objectPtr, menu_root, idx, text)

  /** DisplayServer.global_menu_set_item_submenu */
  final def globalMenuSetItemSubmenu(menu_root: String, idx: Long, submenu: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "global_menu_set_item_submenu", 965966136L), hostObject.objectPtr, menu_root, idx, submenu)

  /** DisplayServer.global_menu_set_item_accelerator */
  final def globalMenuSetItemAccelerator(menu_root: String, idx: Long, keycode: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "global_menu_set_item_accelerator", 566943293L), hostObject.objectPtr, menu_root, idx, keycode)

  /** DisplayServer.global_menu_set_item_disabled */
  final def globalMenuSetItemDisabled(menu_root: String, idx: Long, disabled: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "global_menu_set_item_disabled", 4108344793L), hostObject.objectPtr, menu_root, idx, disabled)

  /** DisplayServer.global_menu_set_item_hidden */
  final def globalMenuSetItemHidden(menu_root: String, idx: Long, hidden: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "global_menu_set_item_hidden", 4108344793L), hostObject.objectPtr, menu_root, idx, hidden)

  /** DisplayServer.global_menu_set_item_tooltip */
  final def globalMenuSetItemTooltip(menu_root: String, idx: Long, tooltip: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "global_menu_set_item_tooltip", 965966136L), hostObject.objectPtr, menu_root, idx, tooltip)

  /** DisplayServer.global_menu_set_item_state */
  final def globalMenuSetItemState(menu_root: String, idx: Long, state: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "global_menu_set_item_state", 3474840532L), hostObject.objectPtr, menu_root, idx, state)

  /** DisplayServer.global_menu_set_item_max_states */
  final def globalMenuSetItemMaxStates(menu_root: String, idx: Long, max_states: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "global_menu_set_item_max_states", 3474840532L), hostObject.objectPtr, menu_root, idx, max_states)

  /** DisplayServer.global_menu_set_item_icon */
  final def globalMenuSetItemIcon(menu_root: String, idx: Long, icon: Texture2D): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "global_menu_set_item_icon", 3201338066L), hostObject.objectPtr, menu_root, idx, icon.hostObject)

  /** DisplayServer.global_menu_set_item_indentation_level */
  final def globalMenuSetItemIndentationLevel(menu_root: String, idx: Long, level: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "global_menu_set_item_indentation_level", 3474840532L), hostObject.objectPtr, menu_root, idx, level)

  /** DisplayServer.global_menu_get_item_count */
  final def globalMenuGetItemCount(menu_root: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("DisplayServer", "global_menu_get_item_count", 1321353865L), hostObject.objectPtr, menu_root)

  /** DisplayServer.global_menu_remove_item */
  final def globalMenuRemoveItem(menu_root: String, idx: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "global_menu_remove_item", 2956805083L), hostObject.objectPtr, menu_root, idx)

  /** DisplayServer.global_menu_clear */
  final def globalMenuClear(menu_root: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "global_menu_clear", 83702148L), hostObject.objectPtr, menu_root)

  /** DisplayServer.tts_is_speaking */
  final def ttsIsSpeaking(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "tts_is_speaking", 36873697L), hostObject.objectPtr)

  /** DisplayServer.tts_is_paused */
  final def ttsIsPaused(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "tts_is_paused", 36873697L), hostObject.objectPtr)

  /** DisplayServer.tts_pause */
  final def ttsPause(): Unit =
    Ptrcall.callVoid0(MethodBind.get("DisplayServer", "tts_pause", 3218959716L), hostObject.objectPtr)

  /** DisplayServer.tts_resume */
  final def ttsResume(): Unit =
    Ptrcall.callVoid0(MethodBind.get("DisplayServer", "tts_resume", 3218959716L), hostObject.objectPtr)

  /** DisplayServer.tts_stop */
  final def ttsStop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("DisplayServer", "tts_stop", 3218959716L), hostObject.objectPtr)

  /** DisplayServer.is_dark_mode_supported */
  final def isDarkModeSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "is_dark_mode_supported", 36873697L), hostObject.objectPtr)

  /** DisplayServer.is_dark_mode */
  final def isDarkMode(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "is_dark_mode", 36873697L), hostObject.objectPtr)

  /** DisplayServer.get_accent_color */
  final def getAccentColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("DisplayServer", "get_accent_color", 3444240500L), hostObject.objectPtr)

  /** DisplayServer.get_base_color */
  final def getBaseColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("DisplayServer", "get_base_color", 3444240500L), hostObject.objectPtr)

  /** DisplayServer.mouse_set_mode */
  final def mouseSetMode(mouse_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "mouse_set_mode", 348288463L), hostObject.objectPtr, mouse_mode)

  /** DisplayServer.mouse_get_mode */
  final def mouseGetMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "mouse_get_mode", 1353961651L), hostObject.objectPtr)

  /** DisplayServer.warp_mouse */
  final def warpMouse(position: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "warp_mouse", 1130785943L), hostObject.objectPtr, position)

  /** DisplayServer.mouse_get_position */
  final def mouseGetPosition(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("DisplayServer", "mouse_get_position", 3690982128L), hostObject.objectPtr)

  /** DisplayServer.mouse_get_button_state */
  final def mouseGetButtonState(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "mouse_get_button_state", 2512161324L), hostObject.objectPtr)

  /** DisplayServer.clipboard_set */
  final def clipboardSet(clipboard: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "clipboard_set", 83702148L), hostObject.objectPtr, clipboard)

  /** DisplayServer.clipboard_get */
  final def clipboardGet(): String =
    Ptrcall.call0[String](MethodBind.get("DisplayServer", "clipboard_get", 201670096L), hostObject.objectPtr)

  /** DisplayServer.clipboard_get_image */
  final def clipboardGetImage(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("DisplayServer", "clipboard_get_image", 4190603485L), hostObject.objectPtr)

  /** DisplayServer.clipboard_has */
  final def clipboardHas(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "clipboard_has", 36873697L), hostObject.objectPtr)

  /** DisplayServer.clipboard_has_image */
  final def clipboardHasImage(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "clipboard_has_image", 36873697L), hostObject.objectPtr)

  /** DisplayServer.clipboard_set_primary */
  final def clipboardSetPrimary(clipboard_primary: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "clipboard_set_primary", 83702148L), hostObject.objectPtr, clipboard_primary)

  /** DisplayServer.clipboard_get_primary */
  final def clipboardGetPrimary(): String =
    Ptrcall.call0[String](MethodBind.get("DisplayServer", "clipboard_get_primary", 201670096L), hostObject.objectPtr)

  /** DisplayServer.get_display_safe_area */
  final def getDisplaySafeArea(): gdext.builtin.Rect2i =
    Ptrcall.call0[gdext.builtin.Rect2i](MethodBind.get("DisplayServer", "get_display_safe_area", 410525958L), hostObject.objectPtr)

  /** DisplayServer.get_screen_count */
  final def getScreenCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "get_screen_count", 3905245786L), hostObject.objectPtr)

  /** DisplayServer.get_primary_screen */
  final def getPrimaryScreen(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "get_primary_screen", 3905245786L), hostObject.objectPtr)

  /** DisplayServer.get_keyboard_focus_screen */
  final def getKeyboardFocusScreen(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "get_keyboard_focus_screen", 3905245786L), hostObject.objectPtr)

  /** DisplayServer.get_screen_from_rect */
  final def getScreenFromRect(rect: gdext.builtin.Rect2): Long =
    Ptrcall.call1[gdext.builtin.Rect2, Long](MethodBind.get("DisplayServer", "get_screen_from_rect", 741354659L), hostObject.objectPtr, rect)

  /** DisplayServer.screen_get_position */
  final def screenGetPosition(screen: Long): gdext.builtin.Vector2i =
    Ptrcall.call1[Long, gdext.builtin.Vector2i](MethodBind.get("DisplayServer", "screen_get_position", 1725937825L), hostObject.objectPtr, screen)

  /** DisplayServer.screen_get_size */
  final def screenGetSize(screen: Long): gdext.builtin.Vector2i =
    Ptrcall.call1[Long, gdext.builtin.Vector2i](MethodBind.get("DisplayServer", "screen_get_size", 1725937825L), hostObject.objectPtr, screen)

  /** DisplayServer.screen_get_usable_rect */
  final def screenGetUsableRect(screen: Long): gdext.builtin.Rect2i =
    Ptrcall.call1[Long, gdext.builtin.Rect2i](MethodBind.get("DisplayServer", "screen_get_usable_rect", 2439012528L), hostObject.objectPtr, screen)

  /** DisplayServer.screen_get_dpi */
  final def screenGetDpi(screen: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("DisplayServer", "screen_get_dpi", 181039630L), hostObject.objectPtr, screen)

  /** DisplayServer.screen_get_scale */
  final def screenGetScale(screen: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("DisplayServer", "screen_get_scale", 909105437L), hostObject.objectPtr, screen)

  /** DisplayServer.is_touchscreen_available */
  final def isTouchscreenAvailable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "is_touchscreen_available", 36873697L), hostObject.objectPtr)

  /** DisplayServer.screen_get_max_scale */
  final def screenGetMaxScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("DisplayServer", "screen_get_max_scale", 1740695150L), hostObject.objectPtr)

  /** DisplayServer.screen_get_refresh_rate */
  final def screenGetRefreshRate(screen: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("DisplayServer", "screen_get_refresh_rate", 909105437L), hostObject.objectPtr, screen)

  /** DisplayServer.screen_get_pixel */
  final def screenGetPixel(position: gdext.builtin.Vector2i): gdext.builtin.Color =
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Color](MethodBind.get("DisplayServer", "screen_get_pixel", 1532707496L), hostObject.objectPtr, position)

  /** DisplayServer.screen_get_image */
  final def screenGetImage(screen: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("DisplayServer", "screen_get_image", 3813388802L), hostObject.objectPtr, screen)

  /** DisplayServer.screen_get_image_rect */
  final def screenGetImageRect(rect: gdext.builtin.Rect2i): GodotObject =
    Ptrcall.call1[gdext.builtin.Rect2i, GodotObject](MethodBind.get("DisplayServer", "screen_get_image_rect", 2601441065L), hostObject.objectPtr, rect)

  /** DisplayServer.screen_set_orientation */
  final def screenSetOrientation(orientation: Long, screen: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "screen_set_orientation", 2211511631L), hostObject.objectPtr, orientation, screen)

  /** DisplayServer.screen_get_orientation */
  final def screenGetOrientation(screen: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("DisplayServer", "screen_get_orientation", 133818562L), hostObject.objectPtr, screen)

  /** DisplayServer.screen_set_keep_on */
  final def screenSetKeepOn(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "screen_set_keep_on", 2586408642L), hostObject.objectPtr, enable)

  /** DisplayServer.screen_is_kept_on */
  final def screenIsKeptOn(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "screen_is_kept_on", 36873697L), hostObject.objectPtr)

  /** DisplayServer.get_window_at_screen_position */
  final def getWindowAtScreenPosition(position: gdext.builtin.Vector2i): Long =
    Ptrcall.call1[gdext.builtin.Vector2i, Long](MethodBind.get("DisplayServer", "get_window_at_screen_position", 2485466453L), hostObject.objectPtr, position)

  /** DisplayServer.window_get_native_handle */
  final def windowGetNativeHandle(handle_type: Long, window_id: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("DisplayServer", "window_get_native_handle", 1096425680L), hostObject.objectPtr, handle_type, window_id)

  /** DisplayServer.window_get_active_popup */
  final def windowGetActivePopup(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "window_get_active_popup", 3905245786L), hostObject.objectPtr)

  /** DisplayServer.window_set_popup_safe_rect */
  final def windowSetPopupSafeRect(window: Long, rect: gdext.builtin.Rect2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_popup_safe_rect", 3317281434L), hostObject.objectPtr, window, rect)

  /** DisplayServer.window_get_popup_safe_rect */
  final def windowGetPopupSafeRect(window: Long): gdext.builtin.Rect2i =
    Ptrcall.call1[Long, gdext.builtin.Rect2i](MethodBind.get("DisplayServer", "window_get_popup_safe_rect", 2161169500L), hostObject.objectPtr, window)

  /** DisplayServer.window_set_title */
  final def windowSetTitle(title: String, window_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_title", 441246282L), hostObject.objectPtr, title, window_id)

  /** DisplayServer.window_get_title_size */
  final def windowGetTitleSize(title: String, window_id: Long): gdext.builtin.Vector2i =
    Ptrcall.call2[String, Long, gdext.builtin.Vector2i](MethodBind.get("DisplayServer", "window_get_title_size", 2925301799L), hostObject.objectPtr, title, window_id)

  /** DisplayServer.window_get_current_screen */
  final def windowGetCurrentScreen(window_id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("DisplayServer", "window_get_current_screen", 1591665591L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_set_current_screen */
  final def windowSetCurrentScreen(screen: Long, window_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_current_screen", 2230941749L), hostObject.objectPtr, screen, window_id)

  /** DisplayServer.window_get_position */
  final def windowGetPosition(window_id: Long): gdext.builtin.Vector2i =
    Ptrcall.call1[Long, gdext.builtin.Vector2i](MethodBind.get("DisplayServer", "window_get_position", 763922886L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_get_position_with_decorations */
  final def windowGetPositionWithDecorations(window_id: Long): gdext.builtin.Vector2i =
    Ptrcall.call1[Long, gdext.builtin.Vector2i](MethodBind.get("DisplayServer", "window_get_position_with_decorations", 763922886L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_set_position */
  final def windowSetPosition(position: gdext.builtin.Vector2i, window_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_position", 2019273902L), hostObject.objectPtr, position, window_id)

  /** DisplayServer.window_get_size */
  final def windowGetSize(window_id: Long): gdext.builtin.Vector2i =
    Ptrcall.call1[Long, gdext.builtin.Vector2i](MethodBind.get("DisplayServer", "window_get_size", 763922886L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_set_size */
  final def windowSetSize(size: gdext.builtin.Vector2i, window_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_size", 2019273902L), hostObject.objectPtr, size, window_id)

  /** DisplayServer.window_get_attached_instance_id */
  final def windowGetAttachedInstanceId(window_id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("DisplayServer", "window_get_attached_instance_id", 1591665591L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_get_max_size */
  final def windowGetMaxSize(window_id: Long): gdext.builtin.Vector2i =
    Ptrcall.call1[Long, gdext.builtin.Vector2i](MethodBind.get("DisplayServer", "window_get_max_size", 763922886L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_set_max_size */
  final def windowSetMaxSize(max_size: gdext.builtin.Vector2i, window_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_max_size", 2019273902L), hostObject.objectPtr, max_size, window_id)

  /** DisplayServer.window_get_min_size */
  final def windowGetMinSize(window_id: Long): gdext.builtin.Vector2i =
    Ptrcall.call1[Long, gdext.builtin.Vector2i](MethodBind.get("DisplayServer", "window_get_min_size", 763922886L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_set_min_size */
  final def windowSetMinSize(min_size: gdext.builtin.Vector2i, window_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_min_size", 2019273902L), hostObject.objectPtr, min_size, window_id)

  /** DisplayServer.window_get_size_with_decorations */
  final def windowGetSizeWithDecorations(window_id: Long): gdext.builtin.Vector2i =
    Ptrcall.call1[Long, gdext.builtin.Vector2i](MethodBind.get("DisplayServer", "window_get_size_with_decorations", 763922886L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_get_mode */
  final def windowGetMode(window_id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("DisplayServer", "window_get_mode", 2185728461L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_set_mode */
  final def windowSetMode(mode: Long, window_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_mode", 1319965401L), hostObject.objectPtr, mode, window_id)

  /** DisplayServer.window_set_flag */
  final def windowSetFlag(flag: Long, enabled: Boolean, window_id: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "window_set_flag", 254894155L), hostObject.objectPtr, flag, enabled, window_id)

  /** DisplayServer.window_get_flag */
  final def windowGetFlag(flag: Long, window_id: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("DisplayServer", "window_get_flag", 802816991L), hostObject.objectPtr, flag, window_id)

  /** DisplayServer.window_set_window_buttons_offset */
  final def windowSetWindowButtonsOffset(offset: gdext.builtin.Vector2i, window_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_window_buttons_offset", 2019273902L), hostObject.objectPtr, offset, window_id)

  /** DisplayServer.window_get_safe_title_margins */
  final def windowGetSafeTitleMargins(window_id: Long): gdext.builtin.Vector3i =
    Ptrcall.call1[Long, gdext.builtin.Vector3i](MethodBind.get("DisplayServer", "window_get_safe_title_margins", 2295066620L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_request_attention */
  final def windowRequestAttention(window_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "window_request_attention", 1995695955L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_move_to_foreground */
  final def windowMoveToForeground(window_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "window_move_to_foreground", 1995695955L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_is_focused */
  final def windowIsFocused(window_id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("DisplayServer", "window_is_focused", 1051549951L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_can_draw */
  final def windowCanDraw(window_id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("DisplayServer", "window_can_draw", 1051549951L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_set_transient */
  final def windowSetTransient(window_id: Long, parent_window_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_transient", 3937882851L), hostObject.objectPtr, window_id, parent_window_id)

  /** DisplayServer.window_set_exclusive */
  final def windowSetExclusive(window_id: Long, exclusive: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_exclusive", 300928843L), hostObject.objectPtr, window_id, exclusive)

  /** DisplayServer.window_set_ime_active */
  final def windowSetImeActive(active: Boolean, window_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_ime_active", 1661950165L), hostObject.objectPtr, active, window_id)

  /** DisplayServer.window_set_ime_position */
  final def windowSetImePosition(position: gdext.builtin.Vector2i, window_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_ime_position", 2019273902L), hostObject.objectPtr, position, window_id)

  /** DisplayServer.window_set_vsync_mode */
  final def windowSetVsyncMode(vsync_mode: Long, window_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_set_vsync_mode", 2179333492L), hostObject.objectPtr, vsync_mode, window_id)

  /** DisplayServer.window_get_vsync_mode */
  final def windowGetVsyncMode(window_id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("DisplayServer", "window_get_vsync_mode", 578873795L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_is_maximize_allowed */
  final def windowIsMaximizeAllowed(window_id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("DisplayServer", "window_is_maximize_allowed", 1051549951L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_maximize_on_title_dbl_click */
  final def windowMaximizeOnTitleDblClick(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "window_maximize_on_title_dbl_click", 36873697L), hostObject.objectPtr)

  /** DisplayServer.window_minimize_on_title_dbl_click */
  final def windowMinimizeOnTitleDblClick(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "window_minimize_on_title_dbl_click", 36873697L), hostObject.objectPtr)

  /** DisplayServer.window_start_drag */
  final def windowStartDrag(window_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "window_start_drag", 1995695955L), hostObject.objectPtr, window_id)

  /** DisplayServer.window_start_resize */
  final def windowStartResize(edge: Long, window_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "window_start_resize", 4009722312L), hostObject.objectPtr, edge, window_id)

  /** DisplayServer.window_set_color */
  final def windowSetColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "window_set_color", 2920490490L), hostObject.objectPtr, color)

  /** DisplayServer.accessibility_should_increase_contrast */
  final def accessibilityShouldIncreaseContrast(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "accessibility_should_increase_contrast", 3905245786L), hostObject.objectPtr)

  /** DisplayServer.accessibility_should_reduce_animation */
  final def accessibilityShouldReduceAnimation(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "accessibility_should_reduce_animation", 3905245786L), hostObject.objectPtr)

  /** DisplayServer.accessibility_should_reduce_transparency */
  final def accessibilityShouldReduceTransparency(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "accessibility_should_reduce_transparency", 3905245786L), hostObject.objectPtr)

  /** DisplayServer.accessibility_screen_reader_active */
  final def accessibilityScreenReaderActive(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "accessibility_screen_reader_active", 3905245786L), hostObject.objectPtr)

  /** DisplayServer.accessibility_set_window_rect */
  final def accessibilitySetWindowRect(window_id: Long, rect_out: gdext.builtin.Rect2, rect_in: gdext.builtin.Rect2): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "accessibility_set_window_rect", 2386961724L), hostObject.objectPtr, window_id, rect_out, rect_in)

  /** DisplayServer.accessibility_set_window_focused */
  final def accessibilitySetWindowFocused(window_id: Long, focused: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "accessibility_set_window_focused", 300928843L), hostObject.objectPtr, window_id, focused)

  /** DisplayServer.ime_get_selection */
  final def imeGetSelection(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("DisplayServer", "ime_get_selection", 3690982128L), hostObject.objectPtr)

  /** DisplayServer.ime_get_text */
  final def imeGetText(): String =
    Ptrcall.call0[String](MethodBind.get("DisplayServer", "ime_get_text", 201670096L), hostObject.objectPtr)

  /** DisplayServer.virtual_keyboard_show */
  final def virtualKeyboardShow(existing_text: String, position: gdext.builtin.Rect2, `type`: Long, max_length: Long, cursor_start: Long, cursor_end: Long): Unit =
    Ptrcall.callVoid6(MethodBind.get("DisplayServer", "virtual_keyboard_show", 3042891259L), hostObject.objectPtr, existing_text, position, `type`, max_length, cursor_start, cursor_end)

  /** DisplayServer.virtual_keyboard_hide */
  final def virtualKeyboardHide(): Unit =
    Ptrcall.callVoid0(MethodBind.get("DisplayServer", "virtual_keyboard_hide", 3218959716L), hostObject.objectPtr)

  /** DisplayServer.virtual_keyboard_get_height */
  final def virtualKeyboardGetHeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "virtual_keyboard_get_height", 3905245786L), hostObject.objectPtr)

  /** DisplayServer.has_hardware_keyboard */
  final def hasHardwareKeyboard(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "has_hardware_keyboard", 36873697L), hostObject.objectPtr)

  /** DisplayServer.cursor_set_shape */
  final def cursorSetShape(shape: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "cursor_set_shape", 2026291549L), hostObject.objectPtr, shape)

  /** DisplayServer.cursor_get_shape */
  final def cursorGetShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "cursor_get_shape", 1087724927L), hostObject.objectPtr)

  /** DisplayServer.cursor_set_custom_image */
  final def cursorSetCustomImage(cursor: Resource, shape: Long, hotspot: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid3(MethodBind.get("DisplayServer", "cursor_set_custom_image", 1816663697L), hostObject.objectPtr, cursor.hostObject, shape, hotspot)

  /** DisplayServer.get_swap_cancel_ok */
  final def getSwapCancelOk(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "get_swap_cancel_ok", 2240911060L), hostObject.objectPtr)

  /** DisplayServer.enable_for_stealing_focus */
  final def enableForStealingFocus(process_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "enable_for_stealing_focus", 1286410249L), hostObject.objectPtr, process_id)

  /** DisplayServer.beep */
  final def beep(): Unit =
    Ptrcall.callVoid0(MethodBind.get("DisplayServer", "beep", 4051624405L), hostObject.objectPtr)

  /** DisplayServer.keyboard_get_layout_count */
  final def keyboardGetLayoutCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "keyboard_get_layout_count", 3905245786L), hostObject.objectPtr)

  /** DisplayServer.keyboard_get_current_layout */
  final def keyboardGetCurrentLayout(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "keyboard_get_current_layout", 3905245786L), hostObject.objectPtr)

  /** DisplayServer.keyboard_set_current_layout */
  final def keyboardSetCurrentLayout(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "keyboard_set_current_layout", 1286410249L), hostObject.objectPtr, index)

  /** DisplayServer.keyboard_get_layout_language */
  final def keyboardGetLayoutLanguage(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("DisplayServer", "keyboard_get_layout_language", 844755477L), hostObject.objectPtr, index)

  /** DisplayServer.keyboard_get_layout_name */
  final def keyboardGetLayoutName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("DisplayServer", "keyboard_get_layout_name", 844755477L), hostObject.objectPtr, index)

  /** DisplayServer.keyboard_get_keycode_from_physical */
  final def keyboardGetKeycodeFromPhysical(keycode: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("DisplayServer", "keyboard_get_keycode_from_physical", 3447613187L), hostObject.objectPtr, keycode)

  /** DisplayServer.keyboard_get_label_from_physical */
  final def keyboardGetLabelFromPhysical(keycode: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("DisplayServer", "keyboard_get_label_from_physical", 3447613187L), hostObject.objectPtr, keycode)

  /** DisplayServer.show_emoji_and_symbol_picker */
  final def showEmojiAndSymbolPicker(): Unit =
    Ptrcall.callVoid0(MethodBind.get("DisplayServer", "show_emoji_and_symbol_picker", 4051624405L), hostObject.objectPtr)

  /** DisplayServer.process_events */
  final def processEvents(): Unit =
    Ptrcall.callVoid0(MethodBind.get("DisplayServer", "process_events", 3218959716L), hostObject.objectPtr)

  /** DisplayServer.force_process_and_drop_events */
  final def forceProcessAndDropEvents(): Unit =
    Ptrcall.callVoid0(MethodBind.get("DisplayServer", "force_process_and_drop_events", 3218959716L), hostObject.objectPtr)

  /** DisplayServer.set_native_icon */
  final def setNativeIcon(filename: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "set_native_icon", 83702148L), hostObject.objectPtr, filename)

  /** DisplayServer.set_icon */
  final def setIcon(image: Image): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "set_icon", 532598488L), hostObject.objectPtr, image.hostObject)

  /** DisplayServer.status_indicator_set_icon */
  final def statusIndicatorSetIcon(id: Long, icon: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "status_indicator_set_icon", 666127730L), hostObject.objectPtr, id, icon.hostObject)

  /** DisplayServer.status_indicator_set_tooltip */
  final def statusIndicatorSetTooltip(id: Long, tooltip: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("DisplayServer", "status_indicator_set_tooltip", 501894301L), hostObject.objectPtr, id, tooltip)

  /** DisplayServer.status_indicator_get_rect */
  final def statusIndicatorGetRect(id: Long): gdext.builtin.Rect2 =
    Ptrcall.call1[Long, gdext.builtin.Rect2](MethodBind.get("DisplayServer", "status_indicator_get_rect", 3327874267L), hostObject.objectPtr, id)

  /** DisplayServer.delete_status_indicator */
  final def deleteStatusIndicator(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "delete_status_indicator", 1286410249L), hostObject.objectPtr, id)

  /** DisplayServer.tablet_get_driver_count */
  final def tabletGetDriverCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("DisplayServer", "tablet_get_driver_count", 3905245786L), hostObject.objectPtr)

  /** DisplayServer.tablet_get_driver_name */
  final def tabletGetDriverName(idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("DisplayServer", "tablet_get_driver_name", 844755477L), hostObject.objectPtr, idx)

  /** DisplayServer.tablet_get_current_driver */
  final def tabletGetCurrentDriver(): String =
    Ptrcall.call0[String](MethodBind.get("DisplayServer", "tablet_get_current_driver", 201670096L), hostObject.objectPtr)

  /** DisplayServer.tablet_set_current_driver */
  final def tabletSetCurrentDriver(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "tablet_set_current_driver", 83702148L), hostObject.objectPtr, name)

  /** DisplayServer.is_window_transparency_available */
  final def isWindowTransparencyAvailable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "is_window_transparency_available", 36873697L), hostObject.objectPtr)

  /** DisplayServer.register_additional_output */
  final def registerAdditionalOutput(`object`: Object): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "register_additional_output", 3975164845L), hostObject.objectPtr, `object`.hostObject)

  /** DisplayServer.unregister_additional_output */
  final def unregisterAdditionalOutput(`object`: Object): Unit =
    Ptrcall.callVoid1(MethodBind.get("DisplayServer", "unregister_additional_output", 3975164845L), hostObject.objectPtr, `object`.hostObject)

  /** DisplayServer.has_additional_outputs */
  final def hasAdditionalOutputs(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DisplayServer", "has_additional_outputs", 36873697L), hostObject.objectPtr)

}

object DisplayServer {
  /** Class metadata for Gd[DisplayServer] lifetime management and casting. */
  given GodotClass[DisplayServer] with {
    def className = "DisplayServer"
    def isRefCounted = false
    def wrap(o: GodotObject): DisplayServer = new DisplayServer {}.withHost(o.objectPtr)
    def unwrap(t: DisplayServer): GodotObject = t.hostObject
  }

  /** The process-global DisplayServer singleton instance. */
  def singleton: DisplayServer = new DisplayServer {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("DisplayServer").ptr))
}
