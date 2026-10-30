package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TabBar`, extends `Control`. */
abstract class TabBar extends Control {
  override def godotClassName: String = "TabBar"

  /** TabBar.set_tab_count */
  final def setTabCount(count: Long): Unit = {
    if (gdext.classes.TabBar.mb_set_tab_count == null) gdext.classes.TabBar.mb_set_tab_count = MethodBind.get("TabBar", "set_tab_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_tab_count, livePtr, count)
  }

  /** TabBar.get_tab_count */
  final def getTabCount(): Long = {
    if (gdext.classes.TabBar.mb_get_tab_count == null) gdext.classes.TabBar.mb_get_tab_count = MethodBind.get("TabBar", "get_tab_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TabBar.mb_get_tab_count, livePtr)
  }

  /** TabBar.set_current_tab */
  final def setCurrentTab(tabIdx: Long): Unit = {
    if (gdext.classes.TabBar.mb_set_current_tab == null) gdext.classes.TabBar.mb_set_current_tab = MethodBind.get("TabBar", "set_current_tab", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_current_tab, livePtr, tabIdx)
  }

  /** TabBar.get_current_tab */
  final def getCurrentTab(): Long = {
    if (gdext.classes.TabBar.mb_get_current_tab == null) gdext.classes.TabBar.mb_get_current_tab = MethodBind.get("TabBar", "get_current_tab", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TabBar.mb_get_current_tab, livePtr)
  }

  /** TabBar.get_previous_tab */
  final def getPreviousTab(): Long = {
    if (gdext.classes.TabBar.mb_get_previous_tab == null) gdext.classes.TabBar.mb_get_previous_tab = MethodBind.get("TabBar", "get_previous_tab", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TabBar.mb_get_previous_tab, livePtr)
  }

  /** TabBar.select_previous_available */
  final def selectPreviousAvailable(): Boolean = {
    if (gdext.classes.TabBar.mb_select_previous_available == null) gdext.classes.TabBar.mb_select_previous_available = MethodBind.get("TabBar", "select_previous_available", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.TabBar.mb_select_previous_available, livePtr)
  }

  /** TabBar.select_next_available */
  final def selectNextAvailable(): Boolean = {
    if (gdext.classes.TabBar.mb_select_next_available == null) gdext.classes.TabBar.mb_select_next_available = MethodBind.get("TabBar", "select_next_available", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.TabBar.mb_select_next_available, livePtr)
  }

  /** TabBar.set_tab_title */
  final def setTabTitle(tabIdx: Long, title: String): Unit = {
    if (gdext.classes.TabBar.mb_set_tab_title == null) gdext.classes.TabBar.mb_set_tab_title = MethodBind.get("TabBar", "set_tab_title", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TabBar.mb_set_tab_title, livePtr, tabIdx, title)
  }

  /** TabBar.get_tab_title */
  final def getTabTitle(tabIdx: Long): String = {
    if (gdext.classes.TabBar.mb_get_tab_title == null) gdext.classes.TabBar.mb_get_tab_title = MethodBind.get("TabBar", "get_tab_title", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TabBar.mb_get_tab_title, livePtr, tabIdx)
  }

  /** TabBar.set_tab_tooltip */
  final def setTabTooltip(tabIdx: Long, tooltip: String): Unit = {
    if (gdext.classes.TabBar.mb_set_tab_tooltip == null) gdext.classes.TabBar.mb_set_tab_tooltip = MethodBind.get("TabBar", "set_tab_tooltip", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TabBar.mb_set_tab_tooltip, livePtr, tabIdx, tooltip)
  }

  /** TabBar.get_tab_tooltip */
  final def getTabTooltip(tabIdx: Long): String = {
    if (gdext.classes.TabBar.mb_get_tab_tooltip == null) gdext.classes.TabBar.mb_get_tab_tooltip = MethodBind.get("TabBar", "get_tab_tooltip", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TabBar.mb_get_tab_tooltip, livePtr, tabIdx)
  }

  /** TabBar.set_tab_text_direction */
  final def setTabTextDirection(tabIdx: Long, direction: gdext.classes.Control.TextDirection): Unit = {
    if (gdext.classes.TabBar.mb_set_tab_text_direction == null) gdext.classes.TabBar.mb_set_tab_text_direction = MethodBind.get("TabBar", "set_tab_text_direction", 1707680378L)
    Ptrcall.callVoid2(gdext.classes.TabBar.mb_set_tab_text_direction, livePtr, tabIdx, direction)
  }

  /** TabBar.get_tab_text_direction */
  final def getTabTextDirection(tabIdx: Long): gdext.classes.Control.TextDirection = {
    if (gdext.classes.TabBar.mb_get_tab_text_direction == null) gdext.classes.TabBar.mb_get_tab_text_direction = MethodBind.get("TabBar", "get_tab_text_direction", 4235602388L)
    gdext.classes.Control.TextDirection(Ptrcall.call1[Long, Long](gdext.classes.TabBar.mb_get_tab_text_direction, livePtr, tabIdx))
  }

  /** TabBar.set_tab_language */
  final def setTabLanguage(tabIdx: Long, language: String): Unit = {
    if (gdext.classes.TabBar.mb_set_tab_language == null) gdext.classes.TabBar.mb_set_tab_language = MethodBind.get("TabBar", "set_tab_language", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TabBar.mb_set_tab_language, livePtr, tabIdx, language)
  }

  /** TabBar.get_tab_language */
  final def getTabLanguage(tabIdx: Long): String = {
    if (gdext.classes.TabBar.mb_get_tab_language == null) gdext.classes.TabBar.mb_get_tab_language = MethodBind.get("TabBar", "get_tab_language", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TabBar.mb_get_tab_language, livePtr, tabIdx)
  }

  /** TabBar.set_tab_icon */
  final def setTabIcon(tabIdx: Long, icon: Texture2D): Unit = {
    if (gdext.classes.TabBar.mb_set_tab_icon == null) gdext.classes.TabBar.mb_set_tab_icon = MethodBind.get("TabBar", "set_tab_icon", 666127730L)
    Ptrcall.callVoid2(gdext.classes.TabBar.mb_set_tab_icon, livePtr, tabIdx, Wrappers.handle(icon))
  }

  /** TabBar.get_tab_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTabIcon(tabIdx: Long): Texture2D = {
    if (gdext.classes.TabBar.mb_get_tab_icon == null) gdext.classes.TabBar.mb_get_tab_icon = MethodBind.get("TabBar", "get_tab_icon", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.TabBar.mb_get_tab_icon, livePtr, tabIdx))
  }

  /** TabBar.set_tab_icon_max_width */
  final def setTabIconMaxWidth(tabIdx: Long, width: Long): Unit = {
    if (gdext.classes.TabBar.mb_set_tab_icon_max_width == null) gdext.classes.TabBar.mb_set_tab_icon_max_width = MethodBind.get("TabBar", "set_tab_icon_max_width", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TabBar.mb_set_tab_icon_max_width, livePtr, tabIdx, width)
  }

  /** TabBar.get_tab_icon_max_width */
  final def getTabIconMaxWidth(tabIdx: Long): Long = {
    if (gdext.classes.TabBar.mb_get_tab_icon_max_width == null) gdext.classes.TabBar.mb_get_tab_icon_max_width = MethodBind.get("TabBar", "get_tab_icon_max_width", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TabBar.mb_get_tab_icon_max_width, livePtr, tabIdx)
  }

  /** TabBar.set_tab_button_icon */
  final def setTabButtonIcon(tabIdx: Long, icon: Texture2D): Unit = {
    if (gdext.classes.TabBar.mb_set_tab_button_icon == null) gdext.classes.TabBar.mb_set_tab_button_icon = MethodBind.get("TabBar", "set_tab_button_icon", 666127730L)
    Ptrcall.callVoid2(gdext.classes.TabBar.mb_set_tab_button_icon, livePtr, tabIdx, Wrappers.handle(icon))
  }

  /** TabBar.get_tab_button_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTabButtonIcon(tabIdx: Long): Texture2D = {
    if (gdext.classes.TabBar.mb_get_tab_button_icon == null) gdext.classes.TabBar.mb_get_tab_button_icon = MethodBind.get("TabBar", "get_tab_button_icon", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.TabBar.mb_get_tab_button_icon, livePtr, tabIdx))
  }

  /** TabBar.set_tab_disabled */
  final def setTabDisabled(tabIdx: Long, disabled: Boolean): Unit = {
    if (gdext.classes.TabBar.mb_set_tab_disabled == null) gdext.classes.TabBar.mb_set_tab_disabled = MethodBind.get("TabBar", "set_tab_disabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TabBar.mb_set_tab_disabled, livePtr, tabIdx, disabled)
  }

  /** TabBar.is_tab_disabled */
  final def isTabDisabled(tabIdx: Long): Boolean = {
    if (gdext.classes.TabBar.mb_is_tab_disabled == null) gdext.classes.TabBar.mb_is_tab_disabled = MethodBind.get("TabBar", "is_tab_disabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TabBar.mb_is_tab_disabled, livePtr, tabIdx)
  }

  /** TabBar.set_tab_hidden */
  final def setTabHidden(tabIdx: Long, hidden: Boolean): Unit = {
    if (gdext.classes.TabBar.mb_set_tab_hidden == null) gdext.classes.TabBar.mb_set_tab_hidden = MethodBind.get("TabBar", "set_tab_hidden", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TabBar.mb_set_tab_hidden, livePtr, tabIdx, hidden)
  }

  /** TabBar.is_tab_hidden */
  final def isTabHidden(tabIdx: Long): Boolean = {
    if (gdext.classes.TabBar.mb_is_tab_hidden == null) gdext.classes.TabBar.mb_is_tab_hidden = MethodBind.get("TabBar", "is_tab_hidden", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TabBar.mb_is_tab_hidden, livePtr, tabIdx)
  }

  /** TabBar.remove_tab */
  final def removeTab(tabIdx: Long): Unit = {
    if (gdext.classes.TabBar.mb_remove_tab == null) gdext.classes.TabBar.mb_remove_tab = MethodBind.get("TabBar", "remove_tab", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_remove_tab, livePtr, tabIdx)
  }

  /** TabBar.add_tab */
  final def addTab(title: String = "", icon: Texture2D = null): Unit = {
    if (gdext.classes.TabBar.mb_add_tab == null) gdext.classes.TabBar.mb_add_tab = MethodBind.get("TabBar", "add_tab", 1465444425L)
    Ptrcall.callVoid2(gdext.classes.TabBar.mb_add_tab, livePtr, title, Wrappers.handle(icon))
  }

  /** TabBar.get_tab_idx_at_point */
  final def getTabIdxAtPoint(point: gdext.builtin.Vector2): Long = {
    if (gdext.classes.TabBar.mb_get_tab_idx_at_point == null) gdext.classes.TabBar.mb_get_tab_idx_at_point = MethodBind.get("TabBar", "get_tab_idx_at_point", 3820158470L)
    Ptrcall.call1[gdext.builtin.Vector2, Long](gdext.classes.TabBar.mb_get_tab_idx_at_point, livePtr, point)
  }

  /** TabBar.set_tab_alignment */
  final def setTabAlignment(alignment: gdext.classes.TabBar.AlignmentMode): Unit = {
    if (gdext.classes.TabBar.mb_set_tab_alignment == null) gdext.classes.TabBar.mb_set_tab_alignment = MethodBind.get("TabBar", "set_tab_alignment", 2413632353L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_tab_alignment, livePtr, alignment)
  }

  /** TabBar.get_tab_alignment */
  final def getTabAlignment(): gdext.classes.TabBar.AlignmentMode = {
    if (gdext.classes.TabBar.mb_get_tab_alignment == null) gdext.classes.TabBar.mb_get_tab_alignment = MethodBind.get("TabBar", "get_tab_alignment", 2178122193L)
    gdext.classes.TabBar.AlignmentMode(Ptrcall.call0[Long](gdext.classes.TabBar.mb_get_tab_alignment, livePtr))
  }

  /** TabBar.set_clip_tabs */
  final def setClipTabs(clipTabs: Boolean): Unit = {
    if (gdext.classes.TabBar.mb_set_clip_tabs == null) gdext.classes.TabBar.mb_set_clip_tabs = MethodBind.get("TabBar", "set_clip_tabs", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_clip_tabs, livePtr, clipTabs)
  }

  /** TabBar.get_clip_tabs */
  final def getClipTabs(): Boolean = {
    if (gdext.classes.TabBar.mb_get_clip_tabs == null) gdext.classes.TabBar.mb_get_clip_tabs = MethodBind.get("TabBar", "get_clip_tabs", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabBar.mb_get_clip_tabs, livePtr)
  }

  /** TabBar.get_tab_offset */
  final def getTabOffset(): Long = {
    if (gdext.classes.TabBar.mb_get_tab_offset == null) gdext.classes.TabBar.mb_get_tab_offset = MethodBind.get("TabBar", "get_tab_offset", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TabBar.mb_get_tab_offset, livePtr)
  }

  /** TabBar.get_offset_buttons_visible */
  final def getOffsetButtonsVisible(): Boolean = {
    if (gdext.classes.TabBar.mb_get_offset_buttons_visible == null) gdext.classes.TabBar.mb_get_offset_buttons_visible = MethodBind.get("TabBar", "get_offset_buttons_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabBar.mb_get_offset_buttons_visible, livePtr)
  }

  /** TabBar.ensure_tab_visible */
  final def ensureTabVisible(idx: Long): Unit = {
    if (gdext.classes.TabBar.mb_ensure_tab_visible == null) gdext.classes.TabBar.mb_ensure_tab_visible = MethodBind.get("TabBar", "ensure_tab_visible", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_ensure_tab_visible, livePtr, idx)
  }

  /** TabBar.get_tab_rect */
  final def getTabRect(tabIdx: Long): gdext.builtin.Rect2 = {
    if (gdext.classes.TabBar.mb_get_tab_rect == null) gdext.classes.TabBar.mb_get_tab_rect = MethodBind.get("TabBar", "get_tab_rect", 3327874267L)
    Ptrcall.call1[Long, gdext.builtin.Rect2](gdext.classes.TabBar.mb_get_tab_rect, livePtr, tabIdx)
  }

  /** TabBar.move_tab */
  final def moveTab(from: Long, to: Long): Unit = {
    if (gdext.classes.TabBar.mb_move_tab == null) gdext.classes.TabBar.mb_move_tab = MethodBind.get("TabBar", "move_tab", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TabBar.mb_move_tab, livePtr, from, to)
  }

  /** TabBar.set_close_with_middle_mouse */
  final def setCloseWithMiddleMouse(enabled: Boolean): Unit = {
    if (gdext.classes.TabBar.mb_set_close_with_middle_mouse == null) gdext.classes.TabBar.mb_set_close_with_middle_mouse = MethodBind.get("TabBar", "set_close_with_middle_mouse", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_close_with_middle_mouse, livePtr, enabled)
  }

  /** TabBar.get_close_with_middle_mouse */
  final def getCloseWithMiddleMouse(): Boolean = {
    if (gdext.classes.TabBar.mb_get_close_with_middle_mouse == null) gdext.classes.TabBar.mb_get_close_with_middle_mouse = MethodBind.get("TabBar", "get_close_with_middle_mouse", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabBar.mb_get_close_with_middle_mouse, livePtr)
  }

  /** TabBar.set_tab_close_display_policy */
  final def setTabCloseDisplayPolicy(policy: gdext.classes.TabBar.CloseButtonDisplayPolicy): Unit = {
    if (gdext.classes.TabBar.mb_set_tab_close_display_policy == null) gdext.classes.TabBar.mb_set_tab_close_display_policy = MethodBind.get("TabBar", "set_tab_close_display_policy", 2212906737L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_tab_close_display_policy, livePtr, policy)
  }

  /** TabBar.get_tab_close_display_policy */
  final def getTabCloseDisplayPolicy(): gdext.classes.TabBar.CloseButtonDisplayPolicy = {
    if (gdext.classes.TabBar.mb_get_tab_close_display_policy == null) gdext.classes.TabBar.mb_get_tab_close_display_policy = MethodBind.get("TabBar", "get_tab_close_display_policy", 2956568028L)
    gdext.classes.TabBar.CloseButtonDisplayPolicy(Ptrcall.call0[Long](gdext.classes.TabBar.mb_get_tab_close_display_policy, livePtr))
  }

  /** TabBar.set_max_tab_width */
  final def setMaxTabWidth(width: Long): Unit = {
    if (gdext.classes.TabBar.mb_set_max_tab_width == null) gdext.classes.TabBar.mb_set_max_tab_width = MethodBind.get("TabBar", "set_max_tab_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_max_tab_width, livePtr, width)
  }

  /** TabBar.get_max_tab_width */
  final def getMaxTabWidth(): Long = {
    if (gdext.classes.TabBar.mb_get_max_tab_width == null) gdext.classes.TabBar.mb_get_max_tab_width = MethodBind.get("TabBar", "get_max_tab_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TabBar.mb_get_max_tab_width, livePtr)
  }

  /** TabBar.set_scrolling_enabled */
  final def setScrollingEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TabBar.mb_set_scrolling_enabled == null) gdext.classes.TabBar.mb_set_scrolling_enabled = MethodBind.get("TabBar", "set_scrolling_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_scrolling_enabled, livePtr, enabled)
  }

  /** TabBar.get_scrolling_enabled */
  final def getScrollingEnabled(): Boolean = {
    if (gdext.classes.TabBar.mb_get_scrolling_enabled == null) gdext.classes.TabBar.mb_get_scrolling_enabled = MethodBind.get("TabBar", "get_scrolling_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabBar.mb_get_scrolling_enabled, livePtr)
  }

  /** TabBar.set_drag_to_rearrange_enabled */
  final def setDragToRearrangeEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TabBar.mb_set_drag_to_rearrange_enabled == null) gdext.classes.TabBar.mb_set_drag_to_rearrange_enabled = MethodBind.get("TabBar", "set_drag_to_rearrange_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_drag_to_rearrange_enabled, livePtr, enabled)
  }

  /** TabBar.get_drag_to_rearrange_enabled */
  final def getDragToRearrangeEnabled(): Boolean = {
    if (gdext.classes.TabBar.mb_get_drag_to_rearrange_enabled == null) gdext.classes.TabBar.mb_get_drag_to_rearrange_enabled = MethodBind.get("TabBar", "get_drag_to_rearrange_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabBar.mb_get_drag_to_rearrange_enabled, livePtr)
  }

  /** TabBar.set_switch_on_drag_hover */
  final def setSwitchOnDragHover(enabled: Boolean): Unit = {
    if (gdext.classes.TabBar.mb_set_switch_on_drag_hover == null) gdext.classes.TabBar.mb_set_switch_on_drag_hover = MethodBind.get("TabBar", "set_switch_on_drag_hover", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_switch_on_drag_hover, livePtr, enabled)
  }

  /** TabBar.get_switch_on_drag_hover */
  final def getSwitchOnDragHover(): Boolean = {
    if (gdext.classes.TabBar.mb_get_switch_on_drag_hover == null) gdext.classes.TabBar.mb_get_switch_on_drag_hover = MethodBind.get("TabBar", "get_switch_on_drag_hover", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabBar.mb_get_switch_on_drag_hover, livePtr)
  }

  /** TabBar.set_tabs_rearrange_group */
  final def setTabsRearrangeGroup(groupId: Long): Unit = {
    if (gdext.classes.TabBar.mb_set_tabs_rearrange_group == null) gdext.classes.TabBar.mb_set_tabs_rearrange_group = MethodBind.get("TabBar", "set_tabs_rearrange_group", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_tabs_rearrange_group, livePtr, groupId)
  }

  /** TabBar.get_tabs_rearrange_group */
  final def getTabsRearrangeGroup(): Long = {
    if (gdext.classes.TabBar.mb_get_tabs_rearrange_group == null) gdext.classes.TabBar.mb_get_tabs_rearrange_group = MethodBind.get("TabBar", "get_tabs_rearrange_group", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TabBar.mb_get_tabs_rearrange_group, livePtr)
  }

  /** TabBar.set_scroll_to_selected */
  final def setScrollToSelected(enabled: Boolean): Unit = {
    if (gdext.classes.TabBar.mb_set_scroll_to_selected == null) gdext.classes.TabBar.mb_set_scroll_to_selected = MethodBind.get("TabBar", "set_scroll_to_selected", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_scroll_to_selected, livePtr, enabled)
  }

  /** TabBar.get_scroll_to_selected */
  final def getScrollToSelected(): Boolean = {
    if (gdext.classes.TabBar.mb_get_scroll_to_selected == null) gdext.classes.TabBar.mb_get_scroll_to_selected = MethodBind.get("TabBar", "get_scroll_to_selected", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabBar.mb_get_scroll_to_selected, livePtr)
  }

  /** TabBar.set_select_with_rmb */
  final def setSelectWithRmb(enabled: Boolean): Unit = {
    if (gdext.classes.TabBar.mb_set_select_with_rmb == null) gdext.classes.TabBar.mb_set_select_with_rmb = MethodBind.get("TabBar", "set_select_with_rmb", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_select_with_rmb, livePtr, enabled)
  }

  /** TabBar.get_select_with_rmb */
  final def getSelectWithRmb(): Boolean = {
    if (gdext.classes.TabBar.mb_get_select_with_rmb == null) gdext.classes.TabBar.mb_get_select_with_rmb = MethodBind.get("TabBar", "get_select_with_rmb", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabBar.mb_get_select_with_rmb, livePtr)
  }

  /** TabBar.set_deselect_enabled */
  final def setDeselectEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TabBar.mb_set_deselect_enabled == null) gdext.classes.TabBar.mb_set_deselect_enabled = MethodBind.get("TabBar", "set_deselect_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabBar.mb_set_deselect_enabled, livePtr, enabled)
  }

  /** TabBar.get_deselect_enabled */
  final def getDeselectEnabled(): Boolean = {
    if (gdext.classes.TabBar.mb_get_deselect_enabled == null) gdext.classes.TabBar.mb_get_deselect_enabled = MethodBind.get("TabBar", "get_deselect_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabBar.mb_get_deselect_enabled, livePtr)
  }

  /** TabBar.clear_tabs */
  final def clearTabs(): Unit = {
    if (gdext.classes.TabBar.mb_clear_tabs == null) gdext.classes.TabBar.mb_clear_tabs = MethodBind.get("TabBar", "clear_tabs", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TabBar.mb_clear_tabs, livePtr)
  }

}

object TabBar {
  private[classes] var mb_set_tab_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_current_tab: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_tab: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_previous_tab: GDExtensionMethodBindPtr = null
  private[classes] var mb_select_previous_available: GDExtensionMethodBindPtr = null
  private[classes] var mb_select_next_available: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_icon_max_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_icon_max_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_button_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_button_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_tab_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_hidden: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_tab_hidden: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_tab: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_tab: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_idx_at_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clip_tabs: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_clip_tabs: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset_buttons_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_ensure_tab_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_tab: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_close_with_middle_mouse: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_close_with_middle_mouse: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_close_display_policy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_close_display_policy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_tab_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_tab_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scrolling_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scrolling_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_to_rearrange_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag_to_rearrange_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_switch_on_drag_hover: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_switch_on_drag_hover: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tabs_rearrange_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tabs_rearrange_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scroll_to_selected: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scroll_to_selected: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_select_with_rmb: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_select_with_rmb: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_deselect_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_deselect_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_tabs: GDExtensionMethodBindPtr = null

  /** Godot enum `TabBar.AlignmentMode`. */
  opaque type AlignmentMode <: Long = Long

  object AlignmentMode {
    final val Left: AlignmentMode = 0L.asInstanceOf[AlignmentMode]
    final val Center: AlignmentMode = 1L.asInstanceOf[AlignmentMode]
    final val Right: AlignmentMode = 2L.asInstanceOf[AlignmentMode]
    final val Max: AlignmentMode = 3L.asInstanceOf[AlignmentMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AlignmentMode = value.asInstanceOf[AlignmentMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AlignmentMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[AlignmentMode]]

    extension (self: AlignmentMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Left"
        case 1L => "Center"
        case 2L => "Right"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `TabBar.CloseButtonDisplayPolicy`. */
  opaque type CloseButtonDisplayPolicy <: Long = Long

  object CloseButtonDisplayPolicy {
    final val ShowNever: CloseButtonDisplayPolicy = 0L.asInstanceOf[CloseButtonDisplayPolicy]
    final val ShowActiveOnly: CloseButtonDisplayPolicy = 1L.asInstanceOf[CloseButtonDisplayPolicy]
    final val ShowAlways: CloseButtonDisplayPolicy = 2L.asInstanceOf[CloseButtonDisplayPolicy]
    final val Max: CloseButtonDisplayPolicy = 3L.asInstanceOf[CloseButtonDisplayPolicy]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CloseButtonDisplayPolicy = value.asInstanceOf[CloseButtonDisplayPolicy]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CloseButtonDisplayPolicy] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[CloseButtonDisplayPolicy]]

    extension (self: CloseButtonDisplayPolicy)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ShowNever"
        case 1L => "ShowActiveOnly"
        case 2L => "ShowAlways"
        case 3L => "Max"
        case other => other.toString
      }
  }
}
