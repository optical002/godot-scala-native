package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Tree`, extends `Control`. */
abstract class Tree extends Control {
  override def godotClassName: String = "Tree"

  /** Tree.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Tree", "clear", 3218959716L), hostObject.objectPtr)

  /** Tree.create_item */
  final def createItem(parent: TreeItem, index: Long): GodotObject =
    Ptrcall.call2[GodotObject, Long, GodotObject](MethodBind.get("Tree", "create_item", 528467046L), hostObject.objectPtr, parent.hostObject, index)

  /** Tree.get_root */
  final def getRoot(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Tree", "get_root", 1514277247L), hostObject.objectPtr)

  /** Tree.set_column_custom_minimum_width */
  final def setColumnCustomMinimumWidth(column: Long, min_width: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Tree", "set_column_custom_minimum_width", 3937882851L), hostObject.objectPtr, column, min_width)

  /** Tree.set_column_expand */
  final def setColumnExpand(column: Long, expand: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Tree", "set_column_expand", 300928843L), hostObject.objectPtr, column, expand)

  /** Tree.set_column_expand_ratio */
  final def setColumnExpandRatio(column: Long, ratio: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Tree", "set_column_expand_ratio", 3937882851L), hostObject.objectPtr, column, ratio)

  /** Tree.set_column_clip_content */
  final def setColumnClipContent(column: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Tree", "set_column_clip_content", 300928843L), hostObject.objectPtr, column, enable)

  /** Tree.is_column_expanding */
  final def isColumnExpanding(column: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Tree", "is_column_expanding", 1116898809L), hostObject.objectPtr, column)

  /** Tree.is_column_clipping_content */
  final def isColumnClippingContent(column: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Tree", "is_column_clipping_content", 1116898809L), hostObject.objectPtr, column)

  /** Tree.get_column_expand_ratio */
  final def getColumnExpandRatio(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Tree", "get_column_expand_ratio", 923996154L), hostObject.objectPtr, column)

  /** Tree.get_column_width */
  final def getColumnWidth(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Tree", "get_column_width", 923996154L), hostObject.objectPtr, column)

  /** Tree.set_hide_root */
  final def setHideRoot(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_hide_root", 2586408642L), hostObject.objectPtr, enable)

  /** Tree.is_root_hidden */
  final def isRootHidden(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tree", "is_root_hidden", 36873697L), hostObject.objectPtr)

  /** Tree.get_next_selected */
  final def getNextSelected(from: TreeItem): GodotObject =
    Ptrcall.call1[GodotObject, GodotObject](MethodBind.get("Tree", "get_next_selected", 873446299L), hostObject.objectPtr, from.hostObject)

  /** Tree.get_selected */
  final def getSelected(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Tree", "get_selected", 1514277247L), hostObject.objectPtr)

  /** Tree.set_selected */
  final def setSelected(item: TreeItem, column: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Tree", "set_selected", 2662547442L), hostObject.objectPtr, item.hostObject, column)

  /** Tree.get_selected_column */
  final def getSelectedColumn(): Long =
    Ptrcall.call0[Long](MethodBind.get("Tree", "get_selected_column", 3905245786L), hostObject.objectPtr)

  /** Tree.get_pressed_button */
  final def getPressedButton(): Long =
    Ptrcall.call0[Long](MethodBind.get("Tree", "get_pressed_button", 3905245786L), hostObject.objectPtr)

  /** Tree.set_select_mode */
  final def setSelectMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_select_mode", 3223887270L), hostObject.objectPtr, mode)

  /** Tree.get_select_mode */
  final def getSelectMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Tree", "get_select_mode", 100748571L), hostObject.objectPtr)

  /** Tree.deselect_all */
  final def deselectAll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Tree", "deselect_all", 3218959716L), hostObject.objectPtr)

  /** Tree.set_columns */
  final def setColumns(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_columns", 1286410249L), hostObject.objectPtr, amount)

  /** Tree.get_columns */
  final def getColumns(): Long =
    Ptrcall.call0[Long](MethodBind.get("Tree", "get_columns", 3905245786L), hostObject.objectPtr)

  /** Tree.get_edited */
  final def getEdited(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Tree", "get_edited", 1514277247L), hostObject.objectPtr)

  /** Tree.get_edited_column */
  final def getEditedColumn(): Long =
    Ptrcall.call0[Long](MethodBind.get("Tree", "get_edited_column", 3905245786L), hostObject.objectPtr)

  /** Tree.edit_selected */
  final def editSelected(force_edit: Boolean): Boolean =
    Ptrcall.call1[Boolean, Boolean](MethodBind.get("Tree", "edit_selected", 2595650253L), hostObject.objectPtr, force_edit)

  /** Tree.get_custom_popup_rect */
  final def getCustomPopupRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("Tree", "get_custom_popup_rect", 1639390495L), hostObject.objectPtr)

  /** Tree.get_item_area_rect */
  final def getItemAreaRect(item: TreeItem, column: Long, button_index: Long): gdext.builtin.Rect2 =
    Ptrcall.call3[GodotObject, Long, Long, gdext.builtin.Rect2](MethodBind.get("Tree", "get_item_area_rect", 47968679L), hostObject.objectPtr, item.hostObject, column, button_index)

  /** Tree.get_item_at_position */
  final def getItemAtPosition(position: gdext.builtin.Vector2): GodotObject =
    Ptrcall.call1[gdext.builtin.Vector2, GodotObject](MethodBind.get("Tree", "get_item_at_position", 4193340126L), hostObject.objectPtr, position)

  /** Tree.get_column_at_position */
  final def getColumnAtPosition(position: gdext.builtin.Vector2): Long =
    Ptrcall.call1[gdext.builtin.Vector2, Long](MethodBind.get("Tree", "get_column_at_position", 3820158470L), hostObject.objectPtr, position)

  /** Tree.get_drop_section_at_position */
  final def getDropSectionAtPosition(position: gdext.builtin.Vector2): Long =
    Ptrcall.call1[gdext.builtin.Vector2, Long](MethodBind.get("Tree", "get_drop_section_at_position", 3820158470L), hostObject.objectPtr, position)

  /** Tree.get_button_id_at_position */
  final def getButtonIdAtPosition(position: gdext.builtin.Vector2): Long =
    Ptrcall.call1[gdext.builtin.Vector2, Long](MethodBind.get("Tree", "get_button_id_at_position", 3820158470L), hostObject.objectPtr, position)

  /** Tree.ensure_cursor_is_visible */
  final def ensureCursorIsVisible(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Tree", "ensure_cursor_is_visible", 3218959716L), hostObject.objectPtr)

  /** Tree.set_column_titles_visible */
  final def setColumnTitlesVisible(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_column_titles_visible", 2586408642L), hostObject.objectPtr, visible)

  /** Tree.are_column_titles_visible */
  final def areColumnTitlesVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tree", "are_column_titles_visible", 36873697L), hostObject.objectPtr)

  /** Tree.set_column_title */
  final def setColumnTitle(column: Long, title: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("Tree", "set_column_title", 501894301L), hostObject.objectPtr, column, title)

  /** Tree.get_column_title */
  final def getColumnTitle(column: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("Tree", "get_column_title", 844755477L), hostObject.objectPtr, column)

  /** Tree.set_column_title_tooltip_text */
  final def setColumnTitleTooltipText(column: Long, tooltip_text: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("Tree", "set_column_title_tooltip_text", 501894301L), hostObject.objectPtr, column, tooltip_text)

  /** Tree.get_column_title_tooltip_text */
  final def getColumnTitleTooltipText(column: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("Tree", "get_column_title_tooltip_text", 844755477L), hostObject.objectPtr, column)

  /** Tree.set_column_title_alignment */
  final def setColumnTitleAlignment(column: Long, title_alignment: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Tree", "set_column_title_alignment", 3276431499L), hostObject.objectPtr, column, title_alignment)

  /** Tree.get_column_title_alignment */
  final def getColumnTitleAlignment(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Tree", "get_column_title_alignment", 4171562184L), hostObject.objectPtr, column)

  /** Tree.set_column_title_direction */
  final def setColumnTitleDirection(column: Long, direction: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Tree", "set_column_title_direction", 1707680378L), hostObject.objectPtr, column, direction)

  /** Tree.get_column_title_direction */
  final def getColumnTitleDirection(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Tree", "get_column_title_direction", 4235602388L), hostObject.objectPtr, column)

  /** Tree.set_column_title_language */
  final def setColumnTitleLanguage(column: Long, language: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("Tree", "set_column_title_language", 501894301L), hostObject.objectPtr, column, language)

  /** Tree.get_column_title_language */
  final def getColumnTitleLanguage(column: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("Tree", "get_column_title_language", 844755477L), hostObject.objectPtr, column)

  /** Tree.get_scroll */
  final def getScroll(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Tree", "get_scroll", 3341600327L), hostObject.objectPtr)

  /** Tree.scroll_to_item */
  final def scrollToItem(item: TreeItem, center_on_item: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Tree", "scroll_to_item", 1314737213L), hostObject.objectPtr, item.hostObject, center_on_item)

  /** Tree.set_h_scroll_enabled */
  final def setHScrollEnabled(h_scroll: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_h_scroll_enabled", 2586408642L), hostObject.objectPtr, h_scroll)

  /** Tree.is_h_scroll_enabled */
  final def isHScrollEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tree", "is_h_scroll_enabled", 36873697L), hostObject.objectPtr)

  /** Tree.set_v_scroll_enabled */
  final def setVScrollEnabled(h_scroll: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_v_scroll_enabled", 2586408642L), hostObject.objectPtr, h_scroll)

  /** Tree.is_v_scroll_enabled */
  final def isVScrollEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tree", "is_v_scroll_enabled", 36873697L), hostObject.objectPtr)

  /** Tree.set_scroll_hint_mode */
  final def setScrollHintMode(scroll_hint_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_scroll_hint_mode", 415911924L), hostObject.objectPtr, scroll_hint_mode)

  /** Tree.get_scroll_hint_mode */
  final def getScrollHintMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Tree", "get_scroll_hint_mode", 553087187L), hostObject.objectPtr)

  /** Tree.set_tile_scroll_hint */
  final def setTileScrollHint(tile_scroll_hint: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_tile_scroll_hint", 2586408642L), hostObject.objectPtr, tile_scroll_hint)

  /** Tree.is_scroll_hint_tiled */
  final def isScrollHintTiled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tree", "is_scroll_hint_tiled", 2240911060L), hostObject.objectPtr)

  /** Tree.set_hide_folding */
  final def setHideFolding(hide: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_hide_folding", 2586408642L), hostObject.objectPtr, hide)

  /** Tree.is_folding_hidden */
  final def isFoldingHidden(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tree", "is_folding_hidden", 36873697L), hostObject.objectPtr)

  /** Tree.set_enable_recursive_folding */
  final def setEnableRecursiveFolding(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_enable_recursive_folding", 2586408642L), hostObject.objectPtr, enable)

  /** Tree.is_recursive_folding_enabled */
  final def isRecursiveFoldingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tree", "is_recursive_folding_enabled", 36873697L), hostObject.objectPtr)

  /** Tree.set_enable_drag_unfolding */
  final def setEnableDragUnfolding(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_enable_drag_unfolding", 2586408642L), hostObject.objectPtr, enable)

  /** Tree.is_drag_unfolding_enabled */
  final def isDragUnfoldingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tree", "is_drag_unfolding_enabled", 36873697L), hostObject.objectPtr)

  /** Tree.set_drop_mode_flags */
  final def setDropModeFlags(flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_drop_mode_flags", 1286410249L), hostObject.objectPtr, flags)

  /** Tree.get_drop_mode_flags */
  final def getDropModeFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("Tree", "get_drop_mode_flags", 3905245786L), hostObject.objectPtr)

  /** Tree.set_allow_rmb_select */
  final def setAllowRmbSelect(allow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_allow_rmb_select", 2586408642L), hostObject.objectPtr, allow)

  /** Tree.get_allow_rmb_select */
  final def getAllowRmbSelect(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tree", "get_allow_rmb_select", 36873697L), hostObject.objectPtr)

  /** Tree.set_allow_reselect */
  final def setAllowReselect(allow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_allow_reselect", 2586408642L), hostObject.objectPtr, allow)

  /** Tree.get_allow_reselect */
  final def getAllowReselect(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tree", "get_allow_reselect", 36873697L), hostObject.objectPtr)

  /** Tree.set_allow_search */
  final def setAllowSearch(allow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_allow_search", 2586408642L), hostObject.objectPtr, allow)

  /** Tree.get_allow_search */
  final def getAllowSearch(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tree", "get_allow_search", 36873697L), hostObject.objectPtr)

  /** Tree.set_auto_tooltip */
  final def setAutoTooltip(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Tree", "set_auto_tooltip", 2586408642L), hostObject.objectPtr, enable)

  /** Tree.is_auto_tooltip_enabled */
  final def isAutoTooltipEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tree", "is_auto_tooltip_enabled", 36873697L), hostObject.objectPtr)

}
