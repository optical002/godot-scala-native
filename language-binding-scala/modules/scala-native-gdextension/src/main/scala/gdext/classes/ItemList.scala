package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ItemList`, extends `Control`. */
abstract class ItemList extends Control {
  override def godotClassName: String = "ItemList"

  /** ItemList.add_item */
  final def addItem(text: String, icon: Texture2D, selectable: Boolean): Long = {
    if (gdext.classes.ItemList.mb_add_item == null) gdext.classes.ItemList.mb_add_item = MethodBind.get("ItemList", "add_item", 359861678L)
    Ptrcall.call3[String, GodotObject, Boolean, Long](gdext.classes.ItemList.mb_add_item, livePtr, text, Wrappers.handle(icon), selectable)
  }

  /** ItemList.add_icon_item */
  final def addIconItem(icon: Texture2D, selectable: Boolean): Long = {
    if (gdext.classes.ItemList.mb_add_icon_item == null) gdext.classes.ItemList.mb_add_icon_item = MethodBind.get("ItemList", "add_icon_item", 4256579627L)
    Ptrcall.call2[GodotObject, Boolean, Long](gdext.classes.ItemList.mb_add_icon_item, livePtr, Wrappers.handle(icon), selectable)
  }

  /** ItemList.set_item_text */
  final def setItemText(idx: Long, text: String): Unit = {
    if (gdext.classes.ItemList.mb_set_item_text == null) gdext.classes.ItemList.mb_set_item_text = MethodBind.get("ItemList", "set_item_text", 501894301L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_text, livePtr, idx, text)
  }

  /** ItemList.get_item_text */
  final def getItemText(idx: Long): String = {
    if (gdext.classes.ItemList.mb_get_item_text == null) gdext.classes.ItemList.mb_get_item_text = MethodBind.get("ItemList", "get_item_text", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.ItemList.mb_get_item_text, livePtr, idx)
  }

  /** ItemList.set_item_icon */
  final def setItemIcon(idx: Long, icon: Texture2D): Unit = {
    if (gdext.classes.ItemList.mb_set_item_icon == null) gdext.classes.ItemList.mb_set_item_icon = MethodBind.get("ItemList", "set_item_icon", 666127730L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_icon, livePtr, idx, Wrappers.handle(icon))
  }

  /** ItemList.get_item_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getItemIcon(idx: Long): Texture2D = {
    if (gdext.classes.ItemList.mb_get_item_icon == null) gdext.classes.ItemList.mb_get_item_icon = MethodBind.get("ItemList", "get_item_icon", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.ItemList.mb_get_item_icon, livePtr, idx))
  }

  /** ItemList.set_item_text_direction */
  final def setItemTextDirection(idx: Long, direction: Long): Unit = {
    if (gdext.classes.ItemList.mb_set_item_text_direction == null) gdext.classes.ItemList.mb_set_item_text_direction = MethodBind.get("ItemList", "set_item_text_direction", 1707680378L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_text_direction, livePtr, idx, direction)
  }

  /** ItemList.get_item_text_direction */
  final def getItemTextDirection(idx: Long): Long = {
    if (gdext.classes.ItemList.mb_get_item_text_direction == null) gdext.classes.ItemList.mb_get_item_text_direction = MethodBind.get("ItemList", "get_item_text_direction", 4235602388L)
    Ptrcall.call1[Long, Long](gdext.classes.ItemList.mb_get_item_text_direction, livePtr, idx)
  }

  /** ItemList.set_item_language */
  final def setItemLanguage(idx: Long, language: String): Unit = {
    if (gdext.classes.ItemList.mb_set_item_language == null) gdext.classes.ItemList.mb_set_item_language = MethodBind.get("ItemList", "set_item_language", 501894301L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_language, livePtr, idx, language)
  }

  /** ItemList.get_item_language */
  final def getItemLanguage(idx: Long): String = {
    if (gdext.classes.ItemList.mb_get_item_language == null) gdext.classes.ItemList.mb_get_item_language = MethodBind.get("ItemList", "get_item_language", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.ItemList.mb_get_item_language, livePtr, idx)
  }

  /** ItemList.set_item_auto_translate_mode */
  final def setItemAutoTranslateMode(idx: Long, mode: Long): Unit = {
    if (gdext.classes.ItemList.mb_set_item_auto_translate_mode == null) gdext.classes.ItemList.mb_set_item_auto_translate_mode = MethodBind.get("ItemList", "set_item_auto_translate_mode", 287402019L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_auto_translate_mode, livePtr, idx, mode)
  }

  /** ItemList.get_item_auto_translate_mode */
  final def getItemAutoTranslateMode(idx: Long): Long = {
    if (gdext.classes.ItemList.mb_get_item_auto_translate_mode == null) gdext.classes.ItemList.mb_get_item_auto_translate_mode = MethodBind.get("ItemList", "get_item_auto_translate_mode", 906302372L)
    Ptrcall.call1[Long, Long](gdext.classes.ItemList.mb_get_item_auto_translate_mode, livePtr, idx)
  }

  /** ItemList.set_item_icon_transposed */
  final def setItemIconTransposed(idx: Long, transposed: Boolean): Unit = {
    if (gdext.classes.ItemList.mb_set_item_icon_transposed == null) gdext.classes.ItemList.mb_set_item_icon_transposed = MethodBind.get("ItemList", "set_item_icon_transposed", 300928843L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_icon_transposed, livePtr, idx, transposed)
  }

  /** ItemList.is_item_icon_transposed */
  final def isItemIconTransposed(idx: Long): Boolean = {
    if (gdext.classes.ItemList.mb_is_item_icon_transposed == null) gdext.classes.ItemList.mb_is_item_icon_transposed = MethodBind.get("ItemList", "is_item_icon_transposed", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.ItemList.mb_is_item_icon_transposed, livePtr, idx)
  }

  /** ItemList.set_item_icon_region */
  final def setItemIconRegion(idx: Long, rect: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.ItemList.mb_set_item_icon_region == null) gdext.classes.ItemList.mb_set_item_icon_region = MethodBind.get("ItemList", "set_item_icon_region", 1356297692L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_icon_region, livePtr, idx, rect)
  }

  /** ItemList.get_item_icon_region */
  final def getItemIconRegion(idx: Long): gdext.builtin.Rect2 = {
    if (gdext.classes.ItemList.mb_get_item_icon_region == null) gdext.classes.ItemList.mb_get_item_icon_region = MethodBind.get("ItemList", "get_item_icon_region", 3327874267L)
    Ptrcall.call1[Long, gdext.builtin.Rect2](gdext.classes.ItemList.mb_get_item_icon_region, livePtr, idx)
  }

  /** ItemList.set_item_icon_modulate */
  final def setItemIconModulate(idx: Long, modulate: gdext.builtin.Color): Unit = {
    if (gdext.classes.ItemList.mb_set_item_icon_modulate == null) gdext.classes.ItemList.mb_set_item_icon_modulate = MethodBind.get("ItemList", "set_item_icon_modulate", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_icon_modulate, livePtr, idx, modulate)
  }

  /** ItemList.get_item_icon_modulate */
  final def getItemIconModulate(idx: Long): gdext.builtin.Color = {
    if (gdext.classes.ItemList.mb_get_item_icon_modulate == null) gdext.classes.ItemList.mb_get_item_icon_modulate = MethodBind.get("ItemList", "get_item_icon_modulate", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.ItemList.mb_get_item_icon_modulate, livePtr, idx)
  }

  /** ItemList.set_item_selectable */
  final def setItemSelectable(idx: Long, selectable: Boolean): Unit = {
    if (gdext.classes.ItemList.mb_set_item_selectable == null) gdext.classes.ItemList.mb_set_item_selectable = MethodBind.get("ItemList", "set_item_selectable", 300928843L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_selectable, livePtr, idx, selectable)
  }

  /** ItemList.is_item_selectable */
  final def isItemSelectable(idx: Long): Boolean = {
    if (gdext.classes.ItemList.mb_is_item_selectable == null) gdext.classes.ItemList.mb_is_item_selectable = MethodBind.get("ItemList", "is_item_selectable", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.ItemList.mb_is_item_selectable, livePtr, idx)
  }

  /** ItemList.set_item_disabled */
  final def setItemDisabled(idx: Long, disabled: Boolean): Unit = {
    if (gdext.classes.ItemList.mb_set_item_disabled == null) gdext.classes.ItemList.mb_set_item_disabled = MethodBind.get("ItemList", "set_item_disabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_disabled, livePtr, idx, disabled)
  }

  /** ItemList.is_item_disabled */
  final def isItemDisabled(idx: Long): Boolean = {
    if (gdext.classes.ItemList.mb_is_item_disabled == null) gdext.classes.ItemList.mb_is_item_disabled = MethodBind.get("ItemList", "is_item_disabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.ItemList.mb_is_item_disabled, livePtr, idx)
  }

  /** ItemList.set_item_custom_bg_color */
  final def setItemCustomBgColor(idx: Long, custom_bg_color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ItemList.mb_set_item_custom_bg_color == null) gdext.classes.ItemList.mb_set_item_custom_bg_color = MethodBind.get("ItemList", "set_item_custom_bg_color", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_custom_bg_color, livePtr, idx, custom_bg_color)
  }

  /** ItemList.get_item_custom_bg_color */
  final def getItemCustomBgColor(idx: Long): gdext.builtin.Color = {
    if (gdext.classes.ItemList.mb_get_item_custom_bg_color == null) gdext.classes.ItemList.mb_get_item_custom_bg_color = MethodBind.get("ItemList", "get_item_custom_bg_color", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.ItemList.mb_get_item_custom_bg_color, livePtr, idx)
  }

  /** ItemList.set_item_custom_fg_color */
  final def setItemCustomFgColor(idx: Long, custom_fg_color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ItemList.mb_set_item_custom_fg_color == null) gdext.classes.ItemList.mb_set_item_custom_fg_color = MethodBind.get("ItemList", "set_item_custom_fg_color", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_custom_fg_color, livePtr, idx, custom_fg_color)
  }

  /** ItemList.get_item_custom_fg_color */
  final def getItemCustomFgColor(idx: Long): gdext.builtin.Color = {
    if (gdext.classes.ItemList.mb_get_item_custom_fg_color == null) gdext.classes.ItemList.mb_get_item_custom_fg_color = MethodBind.get("ItemList", "get_item_custom_fg_color", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.ItemList.mb_get_item_custom_fg_color, livePtr, idx)
  }

  /** ItemList.get_item_rect */
  final def getItemRect(idx: Long, expand: Boolean): gdext.builtin.Rect2 = {
    if (gdext.classes.ItemList.mb_get_item_rect == null) gdext.classes.ItemList.mb_get_item_rect = MethodBind.get("ItemList", "get_item_rect", 159227807L)
    Ptrcall.call2[Long, Boolean, gdext.builtin.Rect2](gdext.classes.ItemList.mb_get_item_rect, livePtr, idx, expand)
  }

  /** ItemList.set_item_tooltip_enabled */
  final def setItemTooltipEnabled(idx: Long, enable: Boolean): Unit = {
    if (gdext.classes.ItemList.mb_set_item_tooltip_enabled == null) gdext.classes.ItemList.mb_set_item_tooltip_enabled = MethodBind.get("ItemList", "set_item_tooltip_enabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_tooltip_enabled, livePtr, idx, enable)
  }

  /** ItemList.is_item_tooltip_enabled */
  final def isItemTooltipEnabled(idx: Long): Boolean = {
    if (gdext.classes.ItemList.mb_is_item_tooltip_enabled == null) gdext.classes.ItemList.mb_is_item_tooltip_enabled = MethodBind.get("ItemList", "is_item_tooltip_enabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.ItemList.mb_is_item_tooltip_enabled, livePtr, idx)
  }

  /** ItemList.set_item_tooltip */
  final def setItemTooltip(idx: Long, tooltip: String): Unit = {
    if (gdext.classes.ItemList.mb_set_item_tooltip == null) gdext.classes.ItemList.mb_set_item_tooltip = MethodBind.get("ItemList", "set_item_tooltip", 501894301L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_set_item_tooltip, livePtr, idx, tooltip)
  }

  /** ItemList.get_item_tooltip */
  final def getItemTooltip(idx: Long): String = {
    if (gdext.classes.ItemList.mb_get_item_tooltip == null) gdext.classes.ItemList.mb_get_item_tooltip = MethodBind.get("ItemList", "get_item_tooltip", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.ItemList.mb_get_item_tooltip, livePtr, idx)
  }

  /** ItemList.select */
  final def select(idx: Long, single: Boolean): Unit = {
    if (gdext.classes.ItemList.mb_select == null) gdext.classes.ItemList.mb_select = MethodBind.get("ItemList", "select", 972357352L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_select, livePtr, idx, single)
  }

  /** ItemList.deselect */
  final def deselect(idx: Long): Unit = {
    if (gdext.classes.ItemList.mb_deselect == null) gdext.classes.ItemList.mb_deselect = MethodBind.get("ItemList", "deselect", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_deselect, livePtr, idx)
  }

  /** ItemList.deselect_all */
  final def deselectAll(): Unit = {
    if (gdext.classes.ItemList.mb_deselect_all == null) gdext.classes.ItemList.mb_deselect_all = MethodBind.get("ItemList", "deselect_all", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ItemList.mb_deselect_all, livePtr)
  }

  /** ItemList.is_selected */
  final def isSelected(idx: Long): Boolean = {
    if (gdext.classes.ItemList.mb_is_selected == null) gdext.classes.ItemList.mb_is_selected = MethodBind.get("ItemList", "is_selected", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.ItemList.mb_is_selected, livePtr, idx)
  }

  /** ItemList.move_item */
  final def moveItem(from_idx: Long, to_idx: Long): Unit = {
    if (gdext.classes.ItemList.mb_move_item == null) gdext.classes.ItemList.mb_move_item = MethodBind.get("ItemList", "move_item", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.ItemList.mb_move_item, livePtr, from_idx, to_idx)
  }

  /** ItemList.set_item_count */
  final def setItemCount(count: Long): Unit = {
    if (gdext.classes.ItemList.mb_set_item_count == null) gdext.classes.ItemList.mb_set_item_count = MethodBind.get("ItemList", "set_item_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_item_count, livePtr, count)
  }

  /** ItemList.get_item_count */
  final def getItemCount(): Long = {
    if (gdext.classes.ItemList.mb_get_item_count == null) gdext.classes.ItemList.mb_get_item_count = MethodBind.get("ItemList", "get_item_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ItemList.mb_get_item_count, livePtr)
  }

  /** ItemList.remove_item */
  final def removeItem(idx: Long): Unit = {
    if (gdext.classes.ItemList.mb_remove_item == null) gdext.classes.ItemList.mb_remove_item = MethodBind.get("ItemList", "remove_item", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_remove_item, livePtr, idx)
  }

  /** ItemList.clear */
  final def clear(): Unit = {
    if (gdext.classes.ItemList.mb_clear == null) gdext.classes.ItemList.mb_clear = MethodBind.get("ItemList", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ItemList.mb_clear, livePtr)
  }

  /** ItemList.sort_items_by_text */
  final def sortItemsByText(): Unit = {
    if (gdext.classes.ItemList.mb_sort_items_by_text == null) gdext.classes.ItemList.mb_sort_items_by_text = MethodBind.get("ItemList", "sort_items_by_text", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ItemList.mb_sort_items_by_text, livePtr)
  }

  /** ItemList.set_fixed_column_width */
  final def setFixedColumnWidth(width: Long): Unit = {
    if (gdext.classes.ItemList.mb_set_fixed_column_width == null) gdext.classes.ItemList.mb_set_fixed_column_width = MethodBind.get("ItemList", "set_fixed_column_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_fixed_column_width, livePtr, width)
  }

  /** ItemList.get_fixed_column_width */
  final def getFixedColumnWidth(): Long = {
    if (gdext.classes.ItemList.mb_get_fixed_column_width == null) gdext.classes.ItemList.mb_get_fixed_column_width = MethodBind.get("ItemList", "get_fixed_column_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ItemList.mb_get_fixed_column_width, livePtr)
  }

  /** ItemList.set_same_column_width */
  final def setSameColumnWidth(enable: Boolean): Unit = {
    if (gdext.classes.ItemList.mb_set_same_column_width == null) gdext.classes.ItemList.mb_set_same_column_width = MethodBind.get("ItemList", "set_same_column_width", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_same_column_width, livePtr, enable)
  }

  /** ItemList.is_same_column_width */
  final def isSameColumnWidth(): Boolean = {
    if (gdext.classes.ItemList.mb_is_same_column_width == null) gdext.classes.ItemList.mb_is_same_column_width = MethodBind.get("ItemList", "is_same_column_width", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ItemList.mb_is_same_column_width, livePtr)
  }

  /** ItemList.set_max_text_lines */
  final def setMaxTextLines(lines: Long): Unit = {
    if (gdext.classes.ItemList.mb_set_max_text_lines == null) gdext.classes.ItemList.mb_set_max_text_lines = MethodBind.get("ItemList", "set_max_text_lines", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_max_text_lines, livePtr, lines)
  }

  /** ItemList.get_max_text_lines */
  final def getMaxTextLines(): Long = {
    if (gdext.classes.ItemList.mb_get_max_text_lines == null) gdext.classes.ItemList.mb_get_max_text_lines = MethodBind.get("ItemList", "get_max_text_lines", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ItemList.mb_get_max_text_lines, livePtr)
  }

  /** ItemList.set_max_columns */
  final def setMaxColumns(amount: Long): Unit = {
    if (gdext.classes.ItemList.mb_set_max_columns == null) gdext.classes.ItemList.mb_set_max_columns = MethodBind.get("ItemList", "set_max_columns", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_max_columns, livePtr, amount)
  }

  /** ItemList.get_max_columns */
  final def getMaxColumns(): Long = {
    if (gdext.classes.ItemList.mb_get_max_columns == null) gdext.classes.ItemList.mb_get_max_columns = MethodBind.get("ItemList", "get_max_columns", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ItemList.mb_get_max_columns, livePtr)
  }

  /** ItemList.set_select_mode */
  final def setSelectMode(mode: Long): Unit = {
    if (gdext.classes.ItemList.mb_set_select_mode == null) gdext.classes.ItemList.mb_set_select_mode = MethodBind.get("ItemList", "set_select_mode", 928267388L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_select_mode, livePtr, mode)
  }

  /** ItemList.get_select_mode */
  final def getSelectMode(): Long = {
    if (gdext.classes.ItemList.mb_get_select_mode == null) gdext.classes.ItemList.mb_get_select_mode = MethodBind.get("ItemList", "get_select_mode", 1191945842L)
    Ptrcall.call0[Long](gdext.classes.ItemList.mb_get_select_mode, livePtr)
  }

  /** ItemList.set_icon_mode */
  final def setIconMode(mode: Long): Unit = {
    if (gdext.classes.ItemList.mb_set_icon_mode == null) gdext.classes.ItemList.mb_set_icon_mode = MethodBind.get("ItemList", "set_icon_mode", 2025053633L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_icon_mode, livePtr, mode)
  }

  /** ItemList.get_icon_mode */
  final def getIconMode(): Long = {
    if (gdext.classes.ItemList.mb_get_icon_mode == null) gdext.classes.ItemList.mb_get_icon_mode = MethodBind.get("ItemList", "get_icon_mode", 3353929232L)
    Ptrcall.call0[Long](gdext.classes.ItemList.mb_get_icon_mode, livePtr)
  }

  /** ItemList.set_fixed_icon_size */
  final def setFixedIconSize(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.ItemList.mb_set_fixed_icon_size == null) gdext.classes.ItemList.mb_set_fixed_icon_size = MethodBind.get("ItemList", "set_fixed_icon_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_fixed_icon_size, livePtr, size)
  }

  /** ItemList.get_fixed_icon_size */
  final def getFixedIconSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.ItemList.mb_get_fixed_icon_size == null) gdext.classes.ItemList.mb_get_fixed_icon_size = MethodBind.get("ItemList", "get_fixed_icon_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.ItemList.mb_get_fixed_icon_size, livePtr)
  }

  /** ItemList.set_icon_scale */
  final def setIconScale(scale: Double): Unit = {
    if (gdext.classes.ItemList.mb_set_icon_scale == null) gdext.classes.ItemList.mb_set_icon_scale = MethodBind.get("ItemList", "set_icon_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_icon_scale, livePtr, scale)
  }

  /** ItemList.get_icon_scale */
  final def getIconScale(): Double = {
    if (gdext.classes.ItemList.mb_get_icon_scale == null) gdext.classes.ItemList.mb_get_icon_scale = MethodBind.get("ItemList", "get_icon_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ItemList.mb_get_icon_scale, livePtr)
  }

  /** ItemList.set_allow_rmb_select */
  final def setAllowRmbSelect(allow: Boolean): Unit = {
    if (gdext.classes.ItemList.mb_set_allow_rmb_select == null) gdext.classes.ItemList.mb_set_allow_rmb_select = MethodBind.get("ItemList", "set_allow_rmb_select", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_allow_rmb_select, livePtr, allow)
  }

  /** ItemList.get_allow_rmb_select */
  final def getAllowRmbSelect(): Boolean = {
    if (gdext.classes.ItemList.mb_get_allow_rmb_select == null) gdext.classes.ItemList.mb_get_allow_rmb_select = MethodBind.get("ItemList", "get_allow_rmb_select", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ItemList.mb_get_allow_rmb_select, livePtr)
  }

  /** ItemList.set_allow_reselect */
  final def setAllowReselect(allow: Boolean): Unit = {
    if (gdext.classes.ItemList.mb_set_allow_reselect == null) gdext.classes.ItemList.mb_set_allow_reselect = MethodBind.get("ItemList", "set_allow_reselect", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_allow_reselect, livePtr, allow)
  }

  /** ItemList.get_allow_reselect */
  final def getAllowReselect(): Boolean = {
    if (gdext.classes.ItemList.mb_get_allow_reselect == null) gdext.classes.ItemList.mb_get_allow_reselect = MethodBind.get("ItemList", "get_allow_reselect", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ItemList.mb_get_allow_reselect, livePtr)
  }

  /** ItemList.set_allow_search */
  final def setAllowSearch(allow: Boolean): Unit = {
    if (gdext.classes.ItemList.mb_set_allow_search == null) gdext.classes.ItemList.mb_set_allow_search = MethodBind.get("ItemList", "set_allow_search", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_allow_search, livePtr, allow)
  }

  /** ItemList.get_allow_search */
  final def getAllowSearch(): Boolean = {
    if (gdext.classes.ItemList.mb_get_allow_search == null) gdext.classes.ItemList.mb_get_allow_search = MethodBind.get("ItemList", "get_allow_search", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ItemList.mb_get_allow_search, livePtr)
  }

  /** ItemList.set_auto_width */
  final def setAutoWidth(enable: Boolean): Unit = {
    if (gdext.classes.ItemList.mb_set_auto_width == null) gdext.classes.ItemList.mb_set_auto_width = MethodBind.get("ItemList", "set_auto_width", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_auto_width, livePtr, enable)
  }

  /** ItemList.has_auto_width */
  final def hasAutoWidth(): Boolean = {
    if (gdext.classes.ItemList.mb_has_auto_width == null) gdext.classes.ItemList.mb_has_auto_width = MethodBind.get("ItemList", "has_auto_width", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ItemList.mb_has_auto_width, livePtr)
  }

  /** ItemList.set_auto_height */
  final def setAutoHeight(enable: Boolean): Unit = {
    if (gdext.classes.ItemList.mb_set_auto_height == null) gdext.classes.ItemList.mb_set_auto_height = MethodBind.get("ItemList", "set_auto_height", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_auto_height, livePtr, enable)
  }

  /** ItemList.has_auto_height */
  final def hasAutoHeight(): Boolean = {
    if (gdext.classes.ItemList.mb_has_auto_height == null) gdext.classes.ItemList.mb_has_auto_height = MethodBind.get("ItemList", "has_auto_height", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ItemList.mb_has_auto_height, livePtr)
  }

  /** ItemList.is_anything_selected */
  final def isAnythingSelected(): Boolean = {
    if (gdext.classes.ItemList.mb_is_anything_selected == null) gdext.classes.ItemList.mb_is_anything_selected = MethodBind.get("ItemList", "is_anything_selected", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.ItemList.mb_is_anything_selected, livePtr)
  }

  /** ItemList.get_item_at_position */
  final def getItemAtPosition(position: gdext.builtin.Vector2, exact: Boolean): Long = {
    if (gdext.classes.ItemList.mb_get_item_at_position == null) gdext.classes.ItemList.mb_get_item_at_position = MethodBind.get("ItemList", "get_item_at_position", 2300324924L)
    Ptrcall.call2[gdext.builtin.Vector2, Boolean, Long](gdext.classes.ItemList.mb_get_item_at_position, livePtr, position, exact)
  }

  /** ItemList.ensure_current_is_visible */
  final def ensureCurrentIsVisible(): Unit = {
    if (gdext.classes.ItemList.mb_ensure_current_is_visible == null) gdext.classes.ItemList.mb_ensure_current_is_visible = MethodBind.get("ItemList", "ensure_current_is_visible", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ItemList.mb_ensure_current_is_visible, livePtr)
  }

  /** ItemList.get_v_scroll_bar */
  final def getVScrollBar(): VScrollBar = {
    if (gdext.classes.ItemList.mb_get_v_scroll_bar == null) gdext.classes.ItemList.mb_get_v_scroll_bar = MethodBind.get("ItemList", "get_v_scroll_bar", 2630340773L)
    Wrappers.borrowed[VScrollBar](Ptrcall.call0[Long](gdext.classes.ItemList.mb_get_v_scroll_bar, livePtr))
  }

  /** ItemList.get_h_scroll_bar */
  final def getHScrollBar(): HScrollBar = {
    if (gdext.classes.ItemList.mb_get_h_scroll_bar == null) gdext.classes.ItemList.mb_get_h_scroll_bar = MethodBind.get("ItemList", "get_h_scroll_bar", 4004517983L)
    Wrappers.borrowed[HScrollBar](Ptrcall.call0[Long](gdext.classes.ItemList.mb_get_h_scroll_bar, livePtr))
  }

  /** ItemList.set_scroll_hint_mode */
  final def setScrollHintMode(scroll_hint_mode: Long): Unit = {
    if (gdext.classes.ItemList.mb_set_scroll_hint_mode == null) gdext.classes.ItemList.mb_set_scroll_hint_mode = MethodBind.get("ItemList", "set_scroll_hint_mode", 2917787337L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_scroll_hint_mode, livePtr, scroll_hint_mode)
  }

  /** ItemList.get_scroll_hint_mode */
  final def getScrollHintMode(): Long = {
    if (gdext.classes.ItemList.mb_get_scroll_hint_mode == null) gdext.classes.ItemList.mb_get_scroll_hint_mode = MethodBind.get("ItemList", "get_scroll_hint_mode", 2522227939L)
    Ptrcall.call0[Long](gdext.classes.ItemList.mb_get_scroll_hint_mode, livePtr)
  }

  /** ItemList.set_tile_scroll_hint */
  final def setTileScrollHint(tile_scroll_hint: Boolean): Unit = {
    if (gdext.classes.ItemList.mb_set_tile_scroll_hint == null) gdext.classes.ItemList.mb_set_tile_scroll_hint = MethodBind.get("ItemList", "set_tile_scroll_hint", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_tile_scroll_hint, livePtr, tile_scroll_hint)
  }

  /** ItemList.is_scroll_hint_tiled */
  final def isScrollHintTiled(): Boolean = {
    if (gdext.classes.ItemList.mb_is_scroll_hint_tiled == null) gdext.classes.ItemList.mb_is_scroll_hint_tiled = MethodBind.get("ItemList", "is_scroll_hint_tiled", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.ItemList.mb_is_scroll_hint_tiled, livePtr)
  }

  /** ItemList.set_text_overrun_behavior */
  final def setTextOverrunBehavior(overrun_behavior: Long): Unit = {
    if (gdext.classes.ItemList.mb_set_text_overrun_behavior == null) gdext.classes.ItemList.mb_set_text_overrun_behavior = MethodBind.get("ItemList", "set_text_overrun_behavior", 1008890932L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_text_overrun_behavior, livePtr, overrun_behavior)
  }

  /** ItemList.get_text_overrun_behavior */
  final def getTextOverrunBehavior(): Long = {
    if (gdext.classes.ItemList.mb_get_text_overrun_behavior == null) gdext.classes.ItemList.mb_get_text_overrun_behavior = MethodBind.get("ItemList", "get_text_overrun_behavior", 3779142101L)
    Ptrcall.call0[Long](gdext.classes.ItemList.mb_get_text_overrun_behavior, livePtr)
  }

  /** ItemList.set_wraparound_items */
  final def setWraparoundItems(enable: Boolean): Unit = {
    if (gdext.classes.ItemList.mb_set_wraparound_items == null) gdext.classes.ItemList.mb_set_wraparound_items = MethodBind.get("ItemList", "set_wraparound_items", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ItemList.mb_set_wraparound_items, livePtr, enable)
  }

  /** ItemList.has_wraparound_items */
  final def hasWraparoundItems(): Boolean = {
    if (gdext.classes.ItemList.mb_has_wraparound_items == null) gdext.classes.ItemList.mb_has_wraparound_items = MethodBind.get("ItemList", "has_wraparound_items", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ItemList.mb_has_wraparound_items, livePtr)
  }

  /** ItemList.force_update_list_size */
  final def forceUpdateListSize(): Unit = {
    if (gdext.classes.ItemList.mb_force_update_list_size == null) gdext.classes.ItemList.mb_force_update_list_size = MethodBind.get("ItemList", "force_update_list_size", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ItemList.mb_force_update_list_size, livePtr)
  }

}

object ItemList {
  private[classes] var mb_add_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_icon_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_auto_translate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_auto_translate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_icon_transposed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_item_icon_transposed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_icon_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_icon_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_icon_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_icon_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_selectable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_item_selectable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_item_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_custom_bg_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_custom_bg_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_custom_fg_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_custom_fg_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_tooltip_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_item_tooltip_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_select: GDExtensionMethodBindPtr = null
  private[classes] var mb_deselect: GDExtensionMethodBindPtr = null
  private[classes] var mb_deselect_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_selected: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_sort_items_by_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fixed_column_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fixed_column_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_same_column_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_same_column_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_text_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_text_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_columns: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_columns: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_select_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_select_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_icon_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_icon_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fixed_icon_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fixed_icon_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_icon_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_icon_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_rmb_select: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_allow_rmb_select: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_reselect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_allow_reselect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_search: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_allow_search: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_auto_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_auto_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_anything_selected: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_at_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_ensure_current_is_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_scroll_bar: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_h_scroll_bar: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scroll_hint_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scroll_hint_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_scroll_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scroll_hint_tiled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_wraparound_items: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_wraparound_items: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_update_list_size: GDExtensionMethodBindPtr = null
}
