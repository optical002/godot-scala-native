package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TabBar`, extends `Control`. */
abstract class TabBar extends Control {

  /** TabBar.set_tab_count */
  final def setTabCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_tab_count", 1286410249L), hostObject.objectPtr, count)

  /** TabBar.get_tab_count */
  final def getTabCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabBar", "get_tab_count", 3905245786L), hostObject.objectPtr)

  /** TabBar.set_current_tab */
  final def setCurrentTab(tab_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_current_tab", 1286410249L), hostObject.objectPtr, tab_idx)

  /** TabBar.get_current_tab */
  final def getCurrentTab(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabBar", "get_current_tab", 3905245786L), hostObject.objectPtr)

  /** TabBar.get_previous_tab */
  final def getPreviousTab(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabBar", "get_previous_tab", 3905245786L), hostObject.objectPtr)

  /** TabBar.select_previous_available */
  final def selectPreviousAvailable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabBar", "select_previous_available", 2240911060L), hostObject.objectPtr)

  /** TabBar.select_next_available */
  final def selectNextAvailable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabBar", "select_next_available", 2240911060L), hostObject.objectPtr)

  /** TabBar.set_tab_title */
  final def setTabTitle(tab_idx: Long, title: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabBar", "set_tab_title", 501894301L), hostObject.objectPtr, tab_idx, title)

  /** TabBar.get_tab_title */
  final def getTabTitle(tab_idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TabBar", "get_tab_title", 844755477L), hostObject.objectPtr, tab_idx)

  /** TabBar.set_tab_tooltip */
  final def setTabTooltip(tab_idx: Long, tooltip: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabBar", "set_tab_tooltip", 501894301L), hostObject.objectPtr, tab_idx, tooltip)

  /** TabBar.get_tab_tooltip */
  final def getTabTooltip(tab_idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TabBar", "get_tab_tooltip", 844755477L), hostObject.objectPtr, tab_idx)

  /** TabBar.set_tab_text_direction */
  final def setTabTextDirection(tab_idx: Long, direction: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabBar", "set_tab_text_direction", 1707680378L), hostObject.objectPtr, tab_idx, direction)

  /** TabBar.get_tab_text_direction */
  final def getTabTextDirection(tab_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TabBar", "get_tab_text_direction", 4235602388L), hostObject.objectPtr, tab_idx)

  /** TabBar.set_tab_language */
  final def setTabLanguage(tab_idx: Long, language: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabBar", "set_tab_language", 501894301L), hostObject.objectPtr, tab_idx, language)

  /** TabBar.get_tab_language */
  final def getTabLanguage(tab_idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TabBar", "get_tab_language", 844755477L), hostObject.objectPtr, tab_idx)

  /** TabBar.set_tab_icon */
  final def setTabIcon(tab_idx: Long, icon: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabBar", "set_tab_icon", 666127730L), hostObject.objectPtr, tab_idx, icon.hostObject)

  /** TabBar.get_tab_icon */
  final def getTabIcon(tab_idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TabBar", "get_tab_icon", 3536238170L), hostObject.objectPtr, tab_idx)

  /** TabBar.set_tab_icon_max_width */
  final def setTabIconMaxWidth(tab_idx: Long, width: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabBar", "set_tab_icon_max_width", 3937882851L), hostObject.objectPtr, tab_idx, width)

  /** TabBar.get_tab_icon_max_width */
  final def getTabIconMaxWidth(tab_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TabBar", "get_tab_icon_max_width", 923996154L), hostObject.objectPtr, tab_idx)

  /** TabBar.set_tab_button_icon */
  final def setTabButtonIcon(tab_idx: Long, icon: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabBar", "set_tab_button_icon", 666127730L), hostObject.objectPtr, tab_idx, icon.hostObject)

  /** TabBar.get_tab_button_icon */
  final def getTabButtonIcon(tab_idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TabBar", "get_tab_button_icon", 3536238170L), hostObject.objectPtr, tab_idx)

  /** TabBar.set_tab_disabled */
  final def setTabDisabled(tab_idx: Long, disabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabBar", "set_tab_disabled", 300928843L), hostObject.objectPtr, tab_idx, disabled)

  /** TabBar.is_tab_disabled */
  final def isTabDisabled(tab_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TabBar", "is_tab_disabled", 1116898809L), hostObject.objectPtr, tab_idx)

  /** TabBar.set_tab_hidden */
  final def setTabHidden(tab_idx: Long, hidden: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabBar", "set_tab_hidden", 300928843L), hostObject.objectPtr, tab_idx, hidden)

  /** TabBar.is_tab_hidden */
  final def isTabHidden(tab_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TabBar", "is_tab_hidden", 1116898809L), hostObject.objectPtr, tab_idx)

  /** TabBar.remove_tab */
  final def removeTab(tab_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "remove_tab", 1286410249L), hostObject.objectPtr, tab_idx)

  /** TabBar.add_tab */
  final def addTab(title: String, icon: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabBar", "add_tab", 1465444425L), hostObject.objectPtr, title, icon.hostObject)

  /** TabBar.get_tab_idx_at_point */
  final def getTabIdxAtPoint(point: gdext.builtin.Vector2): Long =
    Ptrcall.call1[gdext.builtin.Vector2, Long](MethodBind.get("TabBar", "get_tab_idx_at_point", 3820158470L), hostObject.objectPtr, point)

  /** TabBar.set_tab_alignment */
  final def setTabAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_tab_alignment", 2413632353L), hostObject.objectPtr, alignment)

  /** TabBar.get_tab_alignment */
  final def getTabAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabBar", "get_tab_alignment", 2178122193L), hostObject.objectPtr)

  /** TabBar.set_clip_tabs */
  final def setClipTabs(clip_tabs: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_clip_tabs", 2586408642L), hostObject.objectPtr, clip_tabs)

  /** TabBar.get_clip_tabs */
  final def getClipTabs(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabBar", "get_clip_tabs", 36873697L), hostObject.objectPtr)

  /** TabBar.get_tab_offset */
  final def getTabOffset(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabBar", "get_tab_offset", 3905245786L), hostObject.objectPtr)

  /** TabBar.get_offset_buttons_visible */
  final def getOffsetButtonsVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabBar", "get_offset_buttons_visible", 36873697L), hostObject.objectPtr)

  /** TabBar.ensure_tab_visible */
  final def ensureTabVisible(idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "ensure_tab_visible", 1286410249L), hostObject.objectPtr, idx)

  /** TabBar.get_tab_rect */
  final def getTabRect(tab_idx: Long): gdext.builtin.Rect2 =
    Ptrcall.call1[Long, gdext.builtin.Rect2](MethodBind.get("TabBar", "get_tab_rect", 3327874267L), hostObject.objectPtr, tab_idx)

  /** TabBar.move_tab */
  final def moveTab(from: Long, to: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabBar", "move_tab", 3937882851L), hostObject.objectPtr, from, to)

  /** TabBar.set_close_with_middle_mouse */
  final def setCloseWithMiddleMouse(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_close_with_middle_mouse", 2586408642L), hostObject.objectPtr, enabled)

  /** TabBar.get_close_with_middle_mouse */
  final def getCloseWithMiddleMouse(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabBar", "get_close_with_middle_mouse", 36873697L), hostObject.objectPtr)

  /** TabBar.set_tab_close_display_policy */
  final def setTabCloseDisplayPolicy(policy: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_tab_close_display_policy", 2212906737L), hostObject.objectPtr, policy)

  /** TabBar.get_tab_close_display_policy */
  final def getTabCloseDisplayPolicy(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabBar", "get_tab_close_display_policy", 2956568028L), hostObject.objectPtr)

  /** TabBar.set_max_tab_width */
  final def setMaxTabWidth(width: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_max_tab_width", 1286410249L), hostObject.objectPtr, width)

  /** TabBar.get_max_tab_width */
  final def getMaxTabWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabBar", "get_max_tab_width", 3905245786L), hostObject.objectPtr)

  /** TabBar.set_scrolling_enabled */
  final def setScrollingEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_scrolling_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TabBar.get_scrolling_enabled */
  final def getScrollingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabBar", "get_scrolling_enabled", 36873697L), hostObject.objectPtr)

  /** TabBar.set_drag_to_rearrange_enabled */
  final def setDragToRearrangeEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_drag_to_rearrange_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TabBar.get_drag_to_rearrange_enabled */
  final def getDragToRearrangeEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabBar", "get_drag_to_rearrange_enabled", 36873697L), hostObject.objectPtr)

  /** TabBar.set_switch_on_drag_hover */
  final def setSwitchOnDragHover(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_switch_on_drag_hover", 2586408642L), hostObject.objectPtr, enabled)

  /** TabBar.get_switch_on_drag_hover */
  final def getSwitchOnDragHover(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabBar", "get_switch_on_drag_hover", 36873697L), hostObject.objectPtr)

  /** TabBar.set_tabs_rearrange_group */
  final def setTabsRearrangeGroup(group_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_tabs_rearrange_group", 1286410249L), hostObject.objectPtr, group_id)

  /** TabBar.get_tabs_rearrange_group */
  final def getTabsRearrangeGroup(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabBar", "get_tabs_rearrange_group", 3905245786L), hostObject.objectPtr)

  /** TabBar.set_scroll_to_selected */
  final def setScrollToSelected(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_scroll_to_selected", 2586408642L), hostObject.objectPtr, enabled)

  /** TabBar.get_scroll_to_selected */
  final def getScrollToSelected(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabBar", "get_scroll_to_selected", 36873697L), hostObject.objectPtr)

  /** TabBar.set_select_with_rmb */
  final def setSelectWithRmb(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_select_with_rmb", 2586408642L), hostObject.objectPtr, enabled)

  /** TabBar.get_select_with_rmb */
  final def getSelectWithRmb(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabBar", "get_select_with_rmb", 36873697L), hostObject.objectPtr)

  /** TabBar.set_deselect_enabled */
  final def setDeselectEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabBar", "set_deselect_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TabBar.get_deselect_enabled */
  final def getDeselectEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabBar", "get_deselect_enabled", 36873697L), hostObject.objectPtr)

  /** TabBar.clear_tabs */
  final def clearTabs(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TabBar", "clear_tabs", 3218959716L), hostObject.objectPtr)

}

object TabBar {
  /** Class metadata for Gd[TabBar] lifetime management and casting. */
  given GodotClass[TabBar] with {
    def className = "TabBar"
    def isRefCounted = false
    def wrap(o: GodotObject): TabBar = new TabBar {}.withHost(o.objectPtr)
    def unwrap(t: TabBar): GodotObject = t.hostObject
  }
}
