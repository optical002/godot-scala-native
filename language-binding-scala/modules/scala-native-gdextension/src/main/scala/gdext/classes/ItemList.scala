package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ItemList`, extends `Control`. */
abstract class ItemList extends Control {

  /** ItemList.add_item */
  final def addItem(text: String, icon: Texture2D, selectable: Boolean): Long =
    Ptrcall.call3[String, GodotObject, Boolean, Long](MethodBind.get("ItemList", "add_item", 359861678L), hostObject.objectPtr, text, icon.hostObject, selectable)

  /** ItemList.add_icon_item */
  final def addIconItem(icon: Texture2D, selectable: Boolean): Long =
    Ptrcall.call2[GodotObject, Boolean, Long](MethodBind.get("ItemList", "add_icon_item", 4256579627L), hostObject.objectPtr, icon.hostObject, selectable)

  /** ItemList.set_item_text */
  final def setItemText(idx: Long, text: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_text", 501894301L), hostObject.objectPtr, idx, text)

  /** ItemList.get_item_text */
  final def getItemText(idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("ItemList", "get_item_text", 844755477L), hostObject.objectPtr, idx)

  /** ItemList.set_item_icon */
  final def setItemIcon(idx: Long, icon: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_icon", 666127730L), hostObject.objectPtr, idx, icon.hostObject)

  /** ItemList.get_item_icon */
  final def getItemIcon(idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("ItemList", "get_item_icon", 3536238170L), hostObject.objectPtr, idx)

  /** ItemList.set_item_text_direction */
  final def setItemTextDirection(idx: Long, direction: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_text_direction", 1707680378L), hostObject.objectPtr, idx, direction)

  /** ItemList.get_item_text_direction */
  final def getItemTextDirection(idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ItemList", "get_item_text_direction", 4235602388L), hostObject.objectPtr, idx)

  /** ItemList.set_item_language */
  final def setItemLanguage(idx: Long, language: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_language", 501894301L), hostObject.objectPtr, idx, language)

  /** ItemList.get_item_language */
  final def getItemLanguage(idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("ItemList", "get_item_language", 844755477L), hostObject.objectPtr, idx)

  /** ItemList.set_item_auto_translate_mode */
  final def setItemAutoTranslateMode(idx: Long, mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_auto_translate_mode", 287402019L), hostObject.objectPtr, idx, mode)

  /** ItemList.get_item_auto_translate_mode */
  final def getItemAutoTranslateMode(idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ItemList", "get_item_auto_translate_mode", 906302372L), hostObject.objectPtr, idx)

  /** ItemList.set_item_icon_transposed */
  final def setItemIconTransposed(idx: Long, transposed: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_icon_transposed", 300928843L), hostObject.objectPtr, idx, transposed)

  /** ItemList.is_item_icon_transposed */
  final def isItemIconTransposed(idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("ItemList", "is_item_icon_transposed", 1116898809L), hostObject.objectPtr, idx)

  /** ItemList.set_item_icon_region */
  final def setItemIconRegion(idx: Long, rect: gdext.builtin.Rect2): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_icon_region", 1356297692L), hostObject.objectPtr, idx, rect)

  /** ItemList.get_item_icon_region */
  final def getItemIconRegion(idx: Long): gdext.builtin.Rect2 =
    Ptrcall.call1[Long, gdext.builtin.Rect2](MethodBind.get("ItemList", "get_item_icon_region", 3327874267L), hostObject.objectPtr, idx)

  /** ItemList.set_item_icon_modulate */
  final def setItemIconModulate(idx: Long, modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_icon_modulate", 2878471219L), hostObject.objectPtr, idx, modulate)

  /** ItemList.get_item_icon_modulate */
  final def getItemIconModulate(idx: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("ItemList", "get_item_icon_modulate", 3457211756L), hostObject.objectPtr, idx)

  /** ItemList.set_item_selectable */
  final def setItemSelectable(idx: Long, selectable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_selectable", 300928843L), hostObject.objectPtr, idx, selectable)

  /** ItemList.is_item_selectable */
  final def isItemSelectable(idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("ItemList", "is_item_selectable", 1116898809L), hostObject.objectPtr, idx)

  /** ItemList.set_item_disabled */
  final def setItemDisabled(idx: Long, disabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_disabled", 300928843L), hostObject.objectPtr, idx, disabled)

  /** ItemList.is_item_disabled */
  final def isItemDisabled(idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("ItemList", "is_item_disabled", 1116898809L), hostObject.objectPtr, idx)

  /** ItemList.set_item_custom_bg_color */
  final def setItemCustomBgColor(idx: Long, custom_bg_color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_custom_bg_color", 2878471219L), hostObject.objectPtr, idx, custom_bg_color)

  /** ItemList.get_item_custom_bg_color */
  final def getItemCustomBgColor(idx: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("ItemList", "get_item_custom_bg_color", 3457211756L), hostObject.objectPtr, idx)

  /** ItemList.set_item_custom_fg_color */
  final def setItemCustomFgColor(idx: Long, custom_fg_color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_custom_fg_color", 2878471219L), hostObject.objectPtr, idx, custom_fg_color)

  /** ItemList.get_item_custom_fg_color */
  final def getItemCustomFgColor(idx: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("ItemList", "get_item_custom_fg_color", 3457211756L), hostObject.objectPtr, idx)

  /** ItemList.get_item_rect */
  final def getItemRect(idx: Long, expand: Boolean): gdext.builtin.Rect2 =
    Ptrcall.call2[Long, Boolean, gdext.builtin.Rect2](MethodBind.get("ItemList", "get_item_rect", 159227807L), hostObject.objectPtr, idx, expand)

  /** ItemList.set_item_tooltip_enabled */
  final def setItemTooltipEnabled(idx: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_tooltip_enabled", 300928843L), hostObject.objectPtr, idx, enable)

  /** ItemList.is_item_tooltip_enabled */
  final def isItemTooltipEnabled(idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("ItemList", "is_item_tooltip_enabled", 1116898809L), hostObject.objectPtr, idx)

  /** ItemList.set_item_tooltip */
  final def setItemTooltip(idx: Long, tooltip: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "set_item_tooltip", 501894301L), hostObject.objectPtr, idx, tooltip)

  /** ItemList.get_item_tooltip */
  final def getItemTooltip(idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("ItemList", "get_item_tooltip", 844755477L), hostObject.objectPtr, idx)

  /** ItemList.select */
  final def select(idx: Long, single: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "select", 972357352L), hostObject.objectPtr, idx, single)

  /** ItemList.deselect */
  final def deselect(idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "deselect", 1286410249L), hostObject.objectPtr, idx)

  /** ItemList.deselect_all */
  final def deselectAll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ItemList", "deselect_all", 3218959716L), hostObject.objectPtr)

  /** ItemList.is_selected */
  final def isSelected(idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("ItemList", "is_selected", 1116898809L), hostObject.objectPtr, idx)

  /** ItemList.move_item */
  final def moveItem(from_idx: Long, to_idx: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ItemList", "move_item", 3937882851L), hostObject.objectPtr, from_idx, to_idx)

  /** ItemList.set_item_count */
  final def setItemCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_item_count", 1286410249L), hostObject.objectPtr, count)

  /** ItemList.get_item_count */
  final def getItemCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("ItemList", "get_item_count", 3905245786L), hostObject.objectPtr)

  /** ItemList.remove_item */
  final def removeItem(idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "remove_item", 1286410249L), hostObject.objectPtr, idx)

  /** ItemList.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ItemList", "clear", 3218959716L), hostObject.objectPtr)

  /** ItemList.sort_items_by_text */
  final def sortItemsByText(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ItemList", "sort_items_by_text", 3218959716L), hostObject.objectPtr)

  /** ItemList.set_fixed_column_width */
  final def setFixedColumnWidth(width: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_fixed_column_width", 1286410249L), hostObject.objectPtr, width)

  /** ItemList.get_fixed_column_width */
  final def getFixedColumnWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("ItemList", "get_fixed_column_width", 3905245786L), hostObject.objectPtr)

  /** ItemList.set_same_column_width */
  final def setSameColumnWidth(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_same_column_width", 2586408642L), hostObject.objectPtr, enable)

  /** ItemList.is_same_column_width */
  final def isSameColumnWidth(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ItemList", "is_same_column_width", 36873697L), hostObject.objectPtr)

  /** ItemList.set_max_text_lines */
  final def setMaxTextLines(lines: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_max_text_lines", 1286410249L), hostObject.objectPtr, lines)

  /** ItemList.get_max_text_lines */
  final def getMaxTextLines(): Long =
    Ptrcall.call0[Long](MethodBind.get("ItemList", "get_max_text_lines", 3905245786L), hostObject.objectPtr)

  /** ItemList.set_max_columns */
  final def setMaxColumns(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_max_columns", 1286410249L), hostObject.objectPtr, amount)

  /** ItemList.get_max_columns */
  final def getMaxColumns(): Long =
    Ptrcall.call0[Long](MethodBind.get("ItemList", "get_max_columns", 3905245786L), hostObject.objectPtr)

  /** ItemList.set_select_mode */
  final def setSelectMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_select_mode", 928267388L), hostObject.objectPtr, mode)

  /** ItemList.get_select_mode */
  final def getSelectMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ItemList", "get_select_mode", 1191945842L), hostObject.objectPtr)

  /** ItemList.set_icon_mode */
  final def setIconMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_icon_mode", 2025053633L), hostObject.objectPtr, mode)

  /** ItemList.get_icon_mode */
  final def getIconMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ItemList", "get_icon_mode", 3353929232L), hostObject.objectPtr)

  /** ItemList.set_fixed_icon_size */
  final def setFixedIconSize(size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_fixed_icon_size", 1130785943L), hostObject.objectPtr, size)

  /** ItemList.get_fixed_icon_size */
  final def getFixedIconSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("ItemList", "get_fixed_icon_size", 3690982128L), hostObject.objectPtr)

  /** ItemList.set_icon_scale */
  final def setIconScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_icon_scale", 373806689L), hostObject.objectPtr, scale)

  /** ItemList.get_icon_scale */
  final def getIconScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("ItemList", "get_icon_scale", 1740695150L), hostObject.objectPtr)

  /** ItemList.set_allow_rmb_select */
  final def setAllowRmbSelect(allow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_allow_rmb_select", 2586408642L), hostObject.objectPtr, allow)

  /** ItemList.get_allow_rmb_select */
  final def getAllowRmbSelect(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ItemList", "get_allow_rmb_select", 36873697L), hostObject.objectPtr)

  /** ItemList.set_allow_reselect */
  final def setAllowReselect(allow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_allow_reselect", 2586408642L), hostObject.objectPtr, allow)

  /** ItemList.get_allow_reselect */
  final def getAllowReselect(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ItemList", "get_allow_reselect", 36873697L), hostObject.objectPtr)

  /** ItemList.set_allow_search */
  final def setAllowSearch(allow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_allow_search", 2586408642L), hostObject.objectPtr, allow)

  /** ItemList.get_allow_search */
  final def getAllowSearch(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ItemList", "get_allow_search", 36873697L), hostObject.objectPtr)

  /** ItemList.set_auto_width */
  final def setAutoWidth(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_auto_width", 2586408642L), hostObject.objectPtr, enable)

  /** ItemList.has_auto_width */
  final def hasAutoWidth(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ItemList", "has_auto_width", 36873697L), hostObject.objectPtr)

  /** ItemList.set_auto_height */
  final def setAutoHeight(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_auto_height", 2586408642L), hostObject.objectPtr, enable)

  /** ItemList.has_auto_height */
  final def hasAutoHeight(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ItemList", "has_auto_height", 36873697L), hostObject.objectPtr)

  /** ItemList.is_anything_selected */
  final def isAnythingSelected(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ItemList", "is_anything_selected", 2240911060L), hostObject.objectPtr)

  /** ItemList.get_item_at_position */
  final def getItemAtPosition(position: gdext.builtin.Vector2, exact: Boolean): Long =
    Ptrcall.call2[gdext.builtin.Vector2, Boolean, Long](MethodBind.get("ItemList", "get_item_at_position", 2300324924L), hostObject.objectPtr, position, exact)

  /** ItemList.ensure_current_is_visible */
  final def ensureCurrentIsVisible(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ItemList", "ensure_current_is_visible", 3218959716L), hostObject.objectPtr)

  /** ItemList.get_v_scroll_bar */
  final def getVScrollBar(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ItemList", "get_v_scroll_bar", 2630340773L), hostObject.objectPtr)

  /** ItemList.get_h_scroll_bar */
  final def getHScrollBar(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ItemList", "get_h_scroll_bar", 4004517983L), hostObject.objectPtr)

  /** ItemList.set_scroll_hint_mode */
  final def setScrollHintMode(scroll_hint_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_scroll_hint_mode", 2917787337L), hostObject.objectPtr, scroll_hint_mode)

  /** ItemList.get_scroll_hint_mode */
  final def getScrollHintMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ItemList", "get_scroll_hint_mode", 2522227939L), hostObject.objectPtr)

  /** ItemList.set_tile_scroll_hint */
  final def setTileScrollHint(tile_scroll_hint: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_tile_scroll_hint", 2586408642L), hostObject.objectPtr, tile_scroll_hint)

  /** ItemList.is_scroll_hint_tiled */
  final def isScrollHintTiled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ItemList", "is_scroll_hint_tiled", 2240911060L), hostObject.objectPtr)

  /** ItemList.set_text_overrun_behavior */
  final def setTextOverrunBehavior(overrun_behavior: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_text_overrun_behavior", 1008890932L), hostObject.objectPtr, overrun_behavior)

  /** ItemList.get_text_overrun_behavior */
  final def getTextOverrunBehavior(): Long =
    Ptrcall.call0[Long](MethodBind.get("ItemList", "get_text_overrun_behavior", 3779142101L), hostObject.objectPtr)

  /** ItemList.set_wraparound_items */
  final def setWraparoundItems(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ItemList", "set_wraparound_items", 2586408642L), hostObject.objectPtr, enable)

  /** ItemList.has_wraparound_items */
  final def hasWraparoundItems(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ItemList", "has_wraparound_items", 36873697L), hostObject.objectPtr)

  /** ItemList.force_update_list_size */
  final def forceUpdateListSize(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ItemList", "force_update_list_size", 3218959716L), hostObject.objectPtr)

}

object ItemList {
  /** Class metadata for Gd[ItemList] lifetime management and casting. */
  given GodotClass[ItemList] with {
    def className = "ItemList"
    def isRefCounted = false
    def wrap(o: GodotObject): ItemList = new ItemList {}.withHost(o.objectPtr)
    def unwrap(t: ItemList): GodotObject = t.hostObject
  }
}
