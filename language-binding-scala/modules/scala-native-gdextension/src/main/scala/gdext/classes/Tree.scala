package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Tree`, extends `Control`. */
abstract class Tree extends Control {
  override def godotClassName: String = "Tree"

  /** Tree.clear */
  final def clear(): Unit = {
    if (gdext.classes.Tree.mb_clear == null) gdext.classes.Tree.mb_clear = MethodBind.get("Tree", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Tree.mb_clear, livePtr)
  }

  /** Tree.create_item */
  final def createItem(parent: TreeItem = null, index: Long = -1L): TreeItem = {
    if (gdext.classes.Tree.mb_create_item == null) gdext.classes.Tree.mb_create_item = MethodBind.get("Tree", "create_item", 528467046L)
    Wrappers.borrowed[TreeItem](Ptrcall.call2[GodotObject, Long, Long](gdext.classes.Tree.mb_create_item, livePtr, Wrappers.handle(parent), index))
  }

  /** Tree.get_root */
  final def getRoot(): TreeItem = {
    if (gdext.classes.Tree.mb_get_root == null) gdext.classes.Tree.mb_get_root = MethodBind.get("Tree", "get_root", 1514277247L)
    Wrappers.borrowed[TreeItem](Ptrcall.call0[Long](gdext.classes.Tree.mb_get_root, livePtr))
  }

  /** Tree.set_column_custom_minimum_width */
  final def setColumnCustomMinimumWidth(column: Long, minWidth: Long): Unit = {
    if (gdext.classes.Tree.mb_set_column_custom_minimum_width == null) gdext.classes.Tree.mb_set_column_custom_minimum_width = MethodBind.get("Tree", "set_column_custom_minimum_width", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.Tree.mb_set_column_custom_minimum_width, livePtr, column, minWidth)
  }

  /** Tree.set_column_expand */
  final def setColumnExpand(column: Long, expand: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_column_expand == null) gdext.classes.Tree.mb_set_column_expand = MethodBind.get("Tree", "set_column_expand", 300928843L)
    Ptrcall.callVoid2(gdext.classes.Tree.mb_set_column_expand, livePtr, column, expand)
  }

  /** Tree.set_column_expand_ratio */
  final def setColumnExpandRatio(column: Long, ratio: Long): Unit = {
    if (gdext.classes.Tree.mb_set_column_expand_ratio == null) gdext.classes.Tree.mb_set_column_expand_ratio = MethodBind.get("Tree", "set_column_expand_ratio", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.Tree.mb_set_column_expand_ratio, livePtr, column, ratio)
  }

  /** Tree.set_column_clip_content */
  final def setColumnClipContent(column: Long, enable: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_column_clip_content == null) gdext.classes.Tree.mb_set_column_clip_content = MethodBind.get("Tree", "set_column_clip_content", 300928843L)
    Ptrcall.callVoid2(gdext.classes.Tree.mb_set_column_clip_content, livePtr, column, enable)
  }

  /** Tree.is_column_expanding */
  final def isColumnExpanding(column: Long): Boolean = {
    if (gdext.classes.Tree.mb_is_column_expanding == null) gdext.classes.Tree.mb_is_column_expanding = MethodBind.get("Tree", "is_column_expanding", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Tree.mb_is_column_expanding, livePtr, column)
  }

  /** Tree.is_column_clipping_content */
  final def isColumnClippingContent(column: Long): Boolean = {
    if (gdext.classes.Tree.mb_is_column_clipping_content == null) gdext.classes.Tree.mb_is_column_clipping_content = MethodBind.get("Tree", "is_column_clipping_content", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Tree.mb_is_column_clipping_content, livePtr, column)
  }

  /** Tree.get_column_expand_ratio */
  final def getColumnExpandRatio(column: Long): Long = {
    if (gdext.classes.Tree.mb_get_column_expand_ratio == null) gdext.classes.Tree.mb_get_column_expand_ratio = MethodBind.get("Tree", "get_column_expand_ratio", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.Tree.mb_get_column_expand_ratio, livePtr, column)
  }

  /** Tree.get_column_width */
  final def getColumnWidth(column: Long): Long = {
    if (gdext.classes.Tree.mb_get_column_width == null) gdext.classes.Tree.mb_get_column_width = MethodBind.get("Tree", "get_column_width", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.Tree.mb_get_column_width, livePtr, column)
  }

  /** Tree.set_hide_root */
  final def setHideRoot(enable: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_hide_root == null) gdext.classes.Tree.mb_set_hide_root = MethodBind.get("Tree", "set_hide_root", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_hide_root, livePtr, enable)
  }

  /** Tree.is_root_hidden */
  final def isRootHidden(): Boolean = {
    if (gdext.classes.Tree.mb_is_root_hidden == null) gdext.classes.Tree.mb_is_root_hidden = MethodBind.get("Tree", "is_root_hidden", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Tree.mb_is_root_hidden, livePtr)
  }

  /** Tree.get_next_selected */
  final def getNextSelected(from: TreeItem): TreeItem = {
    if (gdext.classes.Tree.mb_get_next_selected == null) gdext.classes.Tree.mb_get_next_selected = MethodBind.get("Tree", "get_next_selected", 873446299L)
    Wrappers.borrowed[TreeItem](Ptrcall.call1[GodotObject, Long](gdext.classes.Tree.mb_get_next_selected, livePtr, Wrappers.handle(from)))
  }

  /** Tree.get_selected */
  final def getSelected(): TreeItem = {
    if (gdext.classes.Tree.mb_get_selected == null) gdext.classes.Tree.mb_get_selected = MethodBind.get("Tree", "get_selected", 1514277247L)
    Wrappers.borrowed[TreeItem](Ptrcall.call0[Long](gdext.classes.Tree.mb_get_selected, livePtr))
  }

  /** Tree.set_selected */
  final def setSelected(item: TreeItem, column: Long): Unit = {
    if (gdext.classes.Tree.mb_set_selected == null) gdext.classes.Tree.mb_set_selected = MethodBind.get("Tree", "set_selected", 2662547442L)
    Ptrcall.callVoid2(gdext.classes.Tree.mb_set_selected, livePtr, Wrappers.handle(item), column)
  }

  /** Tree.get_selected_column */
  final def getSelectedColumn(): Long = {
    if (gdext.classes.Tree.mb_get_selected_column == null) gdext.classes.Tree.mb_get_selected_column = MethodBind.get("Tree", "get_selected_column", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Tree.mb_get_selected_column, livePtr)
  }

  /** Tree.get_pressed_button */
  final def getPressedButton(): Long = {
    if (gdext.classes.Tree.mb_get_pressed_button == null) gdext.classes.Tree.mb_get_pressed_button = MethodBind.get("Tree", "get_pressed_button", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Tree.mb_get_pressed_button, livePtr)
  }

  /** Tree.set_select_mode */
  final def setSelectMode(mode: gdext.classes.Tree.SelectMode): Unit = {
    if (gdext.classes.Tree.mb_set_select_mode == null) gdext.classes.Tree.mb_set_select_mode = MethodBind.get("Tree", "set_select_mode", 3223887270L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_select_mode, livePtr, mode)
  }

  /** Tree.get_select_mode */
  final def getSelectMode(): gdext.classes.Tree.SelectMode = {
    if (gdext.classes.Tree.mb_get_select_mode == null) gdext.classes.Tree.mb_get_select_mode = MethodBind.get("Tree", "get_select_mode", 100748571L)
    gdext.classes.Tree.SelectMode(Ptrcall.call0[Long](gdext.classes.Tree.mb_get_select_mode, livePtr))
  }

  /** Tree.deselect_all */
  final def deselectAll(): Unit = {
    if (gdext.classes.Tree.mb_deselect_all == null) gdext.classes.Tree.mb_deselect_all = MethodBind.get("Tree", "deselect_all", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Tree.mb_deselect_all, livePtr)
  }

  /** Tree.set_columns */
  final def setColumns(amount: Long): Unit = {
    if (gdext.classes.Tree.mb_set_columns == null) gdext.classes.Tree.mb_set_columns = MethodBind.get("Tree", "set_columns", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_columns, livePtr, amount)
  }

  /** Tree.get_columns */
  final def getColumns(): Long = {
    if (gdext.classes.Tree.mb_get_columns == null) gdext.classes.Tree.mb_get_columns = MethodBind.get("Tree", "get_columns", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Tree.mb_get_columns, livePtr)
  }

  /** Tree.get_edited */
  final def getEdited(): TreeItem = {
    if (gdext.classes.Tree.mb_get_edited == null) gdext.classes.Tree.mb_get_edited = MethodBind.get("Tree", "get_edited", 1514277247L)
    Wrappers.borrowed[TreeItem](Ptrcall.call0[Long](gdext.classes.Tree.mb_get_edited, livePtr))
  }

  /** Tree.get_edited_column */
  final def getEditedColumn(): Long = {
    if (gdext.classes.Tree.mb_get_edited_column == null) gdext.classes.Tree.mb_get_edited_column = MethodBind.get("Tree", "get_edited_column", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Tree.mb_get_edited_column, livePtr)
  }

  /** Tree.edit_selected */
  final def editSelected(forceEdit: Boolean = false): Boolean = {
    if (gdext.classes.Tree.mb_edit_selected == null) gdext.classes.Tree.mb_edit_selected = MethodBind.get("Tree", "edit_selected", 2595650253L)
    Ptrcall.call1[Boolean, Boolean](gdext.classes.Tree.mb_edit_selected, livePtr, forceEdit)
  }

  /** Tree.get_custom_popup_rect */
  final def getCustomPopupRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.Tree.mb_get_custom_popup_rect == null) gdext.classes.Tree.mb_get_custom_popup_rect = MethodBind.get("Tree", "get_custom_popup_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.Tree.mb_get_custom_popup_rect, livePtr)
  }

  /** Tree.get_item_area_rect */
  final def getItemAreaRect(item: TreeItem, column: Long = -1L, buttonIndex: Long = -1L): gdext.builtin.Rect2 = {
    if (gdext.classes.Tree.mb_get_item_area_rect == null) gdext.classes.Tree.mb_get_item_area_rect = MethodBind.get("Tree", "get_item_area_rect", 47968679L)
    Ptrcall.call3[GodotObject, Long, Long, gdext.builtin.Rect2](gdext.classes.Tree.mb_get_item_area_rect, livePtr, Wrappers.handle(item), column, buttonIndex)
  }

  /** Tree.get_item_at_position */
  final def getItemAtPosition(position: gdext.builtin.Vector2): TreeItem = {
    if (gdext.classes.Tree.mb_get_item_at_position == null) gdext.classes.Tree.mb_get_item_at_position = MethodBind.get("Tree", "get_item_at_position", 4193340126L)
    Wrappers.borrowed[TreeItem](Ptrcall.call1[gdext.builtin.Vector2, Long](gdext.classes.Tree.mb_get_item_at_position, livePtr, position))
  }

  /** Tree.get_column_at_position */
  final def getColumnAtPosition(position: gdext.builtin.Vector2): Long = {
    if (gdext.classes.Tree.mb_get_column_at_position == null) gdext.classes.Tree.mb_get_column_at_position = MethodBind.get("Tree", "get_column_at_position", 3820158470L)
    Ptrcall.call1[gdext.builtin.Vector2, Long](gdext.classes.Tree.mb_get_column_at_position, livePtr, position)
  }

  /** Tree.get_drop_section_at_position */
  final def getDropSectionAtPosition(position: gdext.builtin.Vector2): Long = {
    if (gdext.classes.Tree.mb_get_drop_section_at_position == null) gdext.classes.Tree.mb_get_drop_section_at_position = MethodBind.get("Tree", "get_drop_section_at_position", 3820158470L)
    Ptrcall.call1[gdext.builtin.Vector2, Long](gdext.classes.Tree.mb_get_drop_section_at_position, livePtr, position)
  }

  /** Tree.get_button_id_at_position */
  final def getButtonIdAtPosition(position: gdext.builtin.Vector2): Long = {
    if (gdext.classes.Tree.mb_get_button_id_at_position == null) gdext.classes.Tree.mb_get_button_id_at_position = MethodBind.get("Tree", "get_button_id_at_position", 3820158470L)
    Ptrcall.call1[gdext.builtin.Vector2, Long](gdext.classes.Tree.mb_get_button_id_at_position, livePtr, position)
  }

  /** Tree.ensure_cursor_is_visible */
  final def ensureCursorIsVisible(): Unit = {
    if (gdext.classes.Tree.mb_ensure_cursor_is_visible == null) gdext.classes.Tree.mb_ensure_cursor_is_visible = MethodBind.get("Tree", "ensure_cursor_is_visible", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Tree.mb_ensure_cursor_is_visible, livePtr)
  }

  /** Tree.set_column_titles_visible */
  final def setColumnTitlesVisible(visible: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_column_titles_visible == null) gdext.classes.Tree.mb_set_column_titles_visible = MethodBind.get("Tree", "set_column_titles_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_column_titles_visible, livePtr, visible)
  }

  /** Tree.are_column_titles_visible */
  final def areColumnTitlesVisible(): Boolean = {
    if (gdext.classes.Tree.mb_are_column_titles_visible == null) gdext.classes.Tree.mb_are_column_titles_visible = MethodBind.get("Tree", "are_column_titles_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Tree.mb_are_column_titles_visible, livePtr)
  }

  /** Tree.set_column_title */
  final def setColumnTitle(column: Long, title: String): Unit = {
    if (gdext.classes.Tree.mb_set_column_title == null) gdext.classes.Tree.mb_set_column_title = MethodBind.get("Tree", "set_column_title", 501894301L)
    Ptrcall.callVoid2(gdext.classes.Tree.mb_set_column_title, livePtr, column, title)
  }

  /** Tree.get_column_title */
  final def getColumnTitle(column: Long): String = {
    if (gdext.classes.Tree.mb_get_column_title == null) gdext.classes.Tree.mb_get_column_title = MethodBind.get("Tree", "get_column_title", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.Tree.mb_get_column_title, livePtr, column)
  }

  /** Tree.set_column_title_tooltip_text */
  final def setColumnTitleTooltipText(column: Long, tooltipText: String): Unit = {
    if (gdext.classes.Tree.mb_set_column_title_tooltip_text == null) gdext.classes.Tree.mb_set_column_title_tooltip_text = MethodBind.get("Tree", "set_column_title_tooltip_text", 501894301L)
    Ptrcall.callVoid2(gdext.classes.Tree.mb_set_column_title_tooltip_text, livePtr, column, tooltipText)
  }

  /** Tree.get_column_title_tooltip_text */
  final def getColumnTitleTooltipText(column: Long): String = {
    if (gdext.classes.Tree.mb_get_column_title_tooltip_text == null) gdext.classes.Tree.mb_get_column_title_tooltip_text = MethodBind.get("Tree", "get_column_title_tooltip_text", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.Tree.mb_get_column_title_tooltip_text, livePtr, column)
  }

  /** Tree.set_column_title_alignment */
  final def setColumnTitleAlignment(column: Long, titleAlignment: gdext.classes.HorizontalAlignment): Unit = {
    if (gdext.classes.Tree.mb_set_column_title_alignment == null) gdext.classes.Tree.mb_set_column_title_alignment = MethodBind.get("Tree", "set_column_title_alignment", 3276431499L)
    Ptrcall.callVoid2(gdext.classes.Tree.mb_set_column_title_alignment, livePtr, column, titleAlignment)
  }

  /** Tree.get_column_title_alignment */
  final def getColumnTitleAlignment(column: Long): gdext.classes.HorizontalAlignment = {
    if (gdext.classes.Tree.mb_get_column_title_alignment == null) gdext.classes.Tree.mb_get_column_title_alignment = MethodBind.get("Tree", "get_column_title_alignment", 4171562184L)
    gdext.classes.HorizontalAlignment(Ptrcall.call1[Long, Long](gdext.classes.Tree.mb_get_column_title_alignment, livePtr, column))
  }

  /** Tree.set_column_title_direction */
  final def setColumnTitleDirection(column: Long, direction: gdext.classes.Control.TextDirection): Unit = {
    if (gdext.classes.Tree.mb_set_column_title_direction == null) gdext.classes.Tree.mb_set_column_title_direction = MethodBind.get("Tree", "set_column_title_direction", 1707680378L)
    Ptrcall.callVoid2(gdext.classes.Tree.mb_set_column_title_direction, livePtr, column, direction)
  }

  /** Tree.get_column_title_direction */
  final def getColumnTitleDirection(column: Long): gdext.classes.Control.TextDirection = {
    if (gdext.classes.Tree.mb_get_column_title_direction == null) gdext.classes.Tree.mb_get_column_title_direction = MethodBind.get("Tree", "get_column_title_direction", 4235602388L)
    gdext.classes.Control.TextDirection(Ptrcall.call1[Long, Long](gdext.classes.Tree.mb_get_column_title_direction, livePtr, column))
  }

  /** Tree.set_column_title_language */
  final def setColumnTitleLanguage(column: Long, language: String): Unit = {
    if (gdext.classes.Tree.mb_set_column_title_language == null) gdext.classes.Tree.mb_set_column_title_language = MethodBind.get("Tree", "set_column_title_language", 501894301L)
    Ptrcall.callVoid2(gdext.classes.Tree.mb_set_column_title_language, livePtr, column, language)
  }

  /** Tree.get_column_title_language */
  final def getColumnTitleLanguage(column: Long): String = {
    if (gdext.classes.Tree.mb_get_column_title_language == null) gdext.classes.Tree.mb_get_column_title_language = MethodBind.get("Tree", "get_column_title_language", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.Tree.mb_get_column_title_language, livePtr, column)
  }

  /** Tree.get_scroll */
  final def getScroll(): gdext.builtin.Vector2 = {
    if (gdext.classes.Tree.mb_get_scroll == null) gdext.classes.Tree.mb_get_scroll = MethodBind.get("Tree", "get_scroll", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Tree.mb_get_scroll, livePtr)
  }

  /** Tree.scroll_to_item */
  final def scrollToItem(item: TreeItem, centerOnItem: Boolean = false): Unit = {
    if (gdext.classes.Tree.mb_scroll_to_item == null) gdext.classes.Tree.mb_scroll_to_item = MethodBind.get("Tree", "scroll_to_item", 1314737213L)
    Ptrcall.callVoid2(gdext.classes.Tree.mb_scroll_to_item, livePtr, Wrappers.handle(item), centerOnItem)
  }

  /** Tree.set_h_scroll_enabled */
  final def setHScrollEnabled(hScroll: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_h_scroll_enabled == null) gdext.classes.Tree.mb_set_h_scroll_enabled = MethodBind.get("Tree", "set_h_scroll_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_h_scroll_enabled, livePtr, hScroll)
  }

  /** Tree.is_h_scroll_enabled */
  final def isHScrollEnabled(): Boolean = {
    if (gdext.classes.Tree.mb_is_h_scroll_enabled == null) gdext.classes.Tree.mb_is_h_scroll_enabled = MethodBind.get("Tree", "is_h_scroll_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Tree.mb_is_h_scroll_enabled, livePtr)
  }

  /** Tree.set_v_scroll_enabled */
  final def setVScrollEnabled(hScroll: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_v_scroll_enabled == null) gdext.classes.Tree.mb_set_v_scroll_enabled = MethodBind.get("Tree", "set_v_scroll_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_v_scroll_enabled, livePtr, hScroll)
  }

  /** Tree.is_v_scroll_enabled */
  final def isVScrollEnabled(): Boolean = {
    if (gdext.classes.Tree.mb_is_v_scroll_enabled == null) gdext.classes.Tree.mb_is_v_scroll_enabled = MethodBind.get("Tree", "is_v_scroll_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Tree.mb_is_v_scroll_enabled, livePtr)
  }

  /** Tree.set_scroll_hint_mode */
  final def setScrollHintMode(scrollHintMode: gdext.classes.Tree.ScrollHintMode): Unit = {
    if (gdext.classes.Tree.mb_set_scroll_hint_mode == null) gdext.classes.Tree.mb_set_scroll_hint_mode = MethodBind.get("Tree", "set_scroll_hint_mode", 415911924L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_scroll_hint_mode, livePtr, scrollHintMode)
  }

  /** Tree.get_scroll_hint_mode */
  final def getScrollHintMode(): gdext.classes.Tree.ScrollHintMode = {
    if (gdext.classes.Tree.mb_get_scroll_hint_mode == null) gdext.classes.Tree.mb_get_scroll_hint_mode = MethodBind.get("Tree", "get_scroll_hint_mode", 553087187L)
    gdext.classes.Tree.ScrollHintMode(Ptrcall.call0[Long](gdext.classes.Tree.mb_get_scroll_hint_mode, livePtr))
  }

  /** Tree.set_tile_scroll_hint */
  final def setTileScrollHint(tileScrollHint: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_tile_scroll_hint == null) gdext.classes.Tree.mb_set_tile_scroll_hint = MethodBind.get("Tree", "set_tile_scroll_hint", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_tile_scroll_hint, livePtr, tileScrollHint)
  }

  /** Tree.is_scroll_hint_tiled */
  final def isScrollHintTiled(): Boolean = {
    if (gdext.classes.Tree.mb_is_scroll_hint_tiled == null) gdext.classes.Tree.mb_is_scroll_hint_tiled = MethodBind.get("Tree", "is_scroll_hint_tiled", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Tree.mb_is_scroll_hint_tiled, livePtr)
  }

  /** Tree.set_hide_folding */
  final def setHideFolding(hide: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_hide_folding == null) gdext.classes.Tree.mb_set_hide_folding = MethodBind.get("Tree", "set_hide_folding", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_hide_folding, livePtr, hide)
  }

  /** Tree.is_folding_hidden */
  final def isFoldingHidden(): Boolean = {
    if (gdext.classes.Tree.mb_is_folding_hidden == null) gdext.classes.Tree.mb_is_folding_hidden = MethodBind.get("Tree", "is_folding_hidden", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Tree.mb_is_folding_hidden, livePtr)
  }

  /** Tree.set_enable_recursive_folding */
  final def setEnableRecursiveFolding(enable: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_enable_recursive_folding == null) gdext.classes.Tree.mb_set_enable_recursive_folding = MethodBind.get("Tree", "set_enable_recursive_folding", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_enable_recursive_folding, livePtr, enable)
  }

  /** Tree.is_recursive_folding_enabled */
  final def isRecursiveFoldingEnabled(): Boolean = {
    if (gdext.classes.Tree.mb_is_recursive_folding_enabled == null) gdext.classes.Tree.mb_is_recursive_folding_enabled = MethodBind.get("Tree", "is_recursive_folding_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Tree.mb_is_recursive_folding_enabled, livePtr)
  }

  /** Tree.set_enable_drag_unfolding */
  final def setEnableDragUnfolding(enable: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_enable_drag_unfolding == null) gdext.classes.Tree.mb_set_enable_drag_unfolding = MethodBind.get("Tree", "set_enable_drag_unfolding", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_enable_drag_unfolding, livePtr, enable)
  }

  /** Tree.is_drag_unfolding_enabled */
  final def isDragUnfoldingEnabled(): Boolean = {
    if (gdext.classes.Tree.mb_is_drag_unfolding_enabled == null) gdext.classes.Tree.mb_is_drag_unfolding_enabled = MethodBind.get("Tree", "is_drag_unfolding_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Tree.mb_is_drag_unfolding_enabled, livePtr)
  }

  /** Tree.set_drop_mode_flags */
  final def setDropModeFlags(flags: Long): Unit = {
    if (gdext.classes.Tree.mb_set_drop_mode_flags == null) gdext.classes.Tree.mb_set_drop_mode_flags = MethodBind.get("Tree", "set_drop_mode_flags", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_drop_mode_flags, livePtr, flags)
  }

  /** Tree.get_drop_mode_flags */
  final def getDropModeFlags(): Long = {
    if (gdext.classes.Tree.mb_get_drop_mode_flags == null) gdext.classes.Tree.mb_get_drop_mode_flags = MethodBind.get("Tree", "get_drop_mode_flags", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Tree.mb_get_drop_mode_flags, livePtr)
  }

  /** Tree.set_allow_rmb_select */
  final def setAllowRmbSelect(allow: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_allow_rmb_select == null) gdext.classes.Tree.mb_set_allow_rmb_select = MethodBind.get("Tree", "set_allow_rmb_select", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_allow_rmb_select, livePtr, allow)
  }

  /** Tree.get_allow_rmb_select */
  final def getAllowRmbSelect(): Boolean = {
    if (gdext.classes.Tree.mb_get_allow_rmb_select == null) gdext.classes.Tree.mb_get_allow_rmb_select = MethodBind.get("Tree", "get_allow_rmb_select", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Tree.mb_get_allow_rmb_select, livePtr)
  }

  /** Tree.set_allow_reselect */
  final def setAllowReselect(allow: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_allow_reselect == null) gdext.classes.Tree.mb_set_allow_reselect = MethodBind.get("Tree", "set_allow_reselect", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_allow_reselect, livePtr, allow)
  }

  /** Tree.get_allow_reselect */
  final def getAllowReselect(): Boolean = {
    if (gdext.classes.Tree.mb_get_allow_reselect == null) gdext.classes.Tree.mb_get_allow_reselect = MethodBind.get("Tree", "get_allow_reselect", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Tree.mb_get_allow_reselect, livePtr)
  }

  /** Tree.set_allow_search */
  final def setAllowSearch(allow: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_allow_search == null) gdext.classes.Tree.mb_set_allow_search = MethodBind.get("Tree", "set_allow_search", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_allow_search, livePtr, allow)
  }

  /** Tree.get_allow_search */
  final def getAllowSearch(): Boolean = {
    if (gdext.classes.Tree.mb_get_allow_search == null) gdext.classes.Tree.mb_get_allow_search = MethodBind.get("Tree", "get_allow_search", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Tree.mb_get_allow_search, livePtr)
  }

  /** Tree.set_auto_tooltip */
  final def setAutoTooltip(enable: Boolean): Unit = {
    if (gdext.classes.Tree.mb_set_auto_tooltip == null) gdext.classes.Tree.mb_set_auto_tooltip = MethodBind.get("Tree", "set_auto_tooltip", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Tree.mb_set_auto_tooltip, livePtr, enable)
  }

  /** Tree.is_auto_tooltip_enabled */
  final def isAutoTooltipEnabled(): Boolean = {
    if (gdext.classes.Tree.mb_is_auto_tooltip_enabled == null) gdext.classes.Tree.mb_is_auto_tooltip_enabled = MethodBind.get("Tree", "is_auto_tooltip_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Tree.mb_is_auto_tooltip_enabled, livePtr)
  }

}

object Tree {
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_column_custom_minimum_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_column_expand: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_column_expand_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_column_clip_content: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_column_expanding: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_column_clipping_content: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_column_expand_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_column_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hide_root: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_root_hidden: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next_selected: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selected: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selected: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selected_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pressed_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_select_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_select_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_deselect_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_columns: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_columns: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_edited: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_edited_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_edit_selected: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_popup_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_area_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_at_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_column_at_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drop_section_at_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_button_id_at_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_ensure_cursor_is_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_column_titles_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_column_titles_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_column_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_column_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_column_title_tooltip_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_column_title_tooltip_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_column_title_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_column_title_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_column_title_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_column_title_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_column_title_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_column_title_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scroll: GDExtensionMethodBindPtr = null
  private[classes] var mb_scroll_to_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_h_scroll_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_h_scroll_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_v_scroll_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_v_scroll_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scroll_hint_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scroll_hint_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_scroll_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scroll_hint_tiled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hide_folding: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_folding_hidden: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_recursive_folding: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_recursive_folding_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_drag_unfolding: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drag_unfolding_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drop_mode_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drop_mode_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_rmb_select: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_allow_rmb_select: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_reselect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_allow_reselect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_search: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_allow_search: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_auto_tooltip_enabled: GDExtensionMethodBindPtr = null

  /** Godot enum `Tree.SelectMode`. */
  opaque type SelectMode <: Long = Long

  object SelectMode {
    final val Single: SelectMode = 0L.asInstanceOf[SelectMode]
    final val Row: SelectMode = 1L.asInstanceOf[SelectMode]
    final val Multi: SelectMode = 2L.asInstanceOf[SelectMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SelectMode = value.asInstanceOf[SelectMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SelectMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[SelectMode]]

    extension (self: SelectMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Single"
        case 1L => "Row"
        case 2L => "Multi"
        case other => other.toString
      }
  }

  /** Godot enum `Tree.DropModeFlags`. */
  opaque type DropModeFlags <: Long = Long

  object DropModeFlags {
    final val Disabled: DropModeFlags = 0L.asInstanceOf[DropModeFlags]
    final val OnItem: DropModeFlags = 1L.asInstanceOf[DropModeFlags]
    final val Inbetween: DropModeFlags = 2L.asInstanceOf[DropModeFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DropModeFlags = value.asInstanceOf[DropModeFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DropModeFlags] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[DropModeFlags]]

    extension (self: DropModeFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "OnItem"
        case 2L => "Inbetween"
        case other => other.toString
      }
  }

  /** Godot enum `Tree.ScrollHintMode`. */
  opaque type ScrollHintMode <: Long = Long

  object ScrollHintMode {
    final val Disabled: ScrollHintMode = 0L.asInstanceOf[ScrollHintMode]
    final val Both: ScrollHintMode = 1L.asInstanceOf[ScrollHintMode]
    final val Top: ScrollHintMode = 2L.asInstanceOf[ScrollHintMode]
    final val Bottom: ScrollHintMode = 3L.asInstanceOf[ScrollHintMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ScrollHintMode = value.asInstanceOf[ScrollHintMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ScrollHintMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ScrollHintMode]]

    extension (self: ScrollHintMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Both"
        case 2L => "Top"
        case 3L => "Bottom"
        case other => other.toString
      }
  }
}
