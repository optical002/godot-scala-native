package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `TabContainer`, extends `Container`. */
abstract class TabContainer extends Container {
  override def godotClassName: String = "TabContainer"

  /** TabContainer.get_tab_count */
  final def getTabCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabContainer", "get_tab_count", 3905245786L), hostObject.objectPtr)

  /** TabContainer.set_current_tab */
  final def setCurrentTab(tab_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabContainer", "set_current_tab", 1286410249L), hostObject.objectPtr, tab_idx)

  /** TabContainer.get_current_tab */
  final def getCurrentTab(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabContainer", "get_current_tab", 3905245786L), hostObject.objectPtr)

  /** TabContainer.get_previous_tab */
  final def getPreviousTab(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabContainer", "get_previous_tab", 3905245786L), hostObject.objectPtr)

  /** TabContainer.select_previous_available */
  final def selectPreviousAvailable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabContainer", "select_previous_available", 2240911060L), hostObject.objectPtr)

  /** TabContainer.select_next_available */
  final def selectNextAvailable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabContainer", "select_next_available", 2240911060L), hostObject.objectPtr)

  /** TabContainer.get_current_tab_control */
  final def getCurrentTabControl(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TabContainer", "get_current_tab_control", 2783021301L), hostObject.objectPtr)

  /** TabContainer.get_tab_bar */
  final def getTabBar(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TabContainer", "get_tab_bar", 1865451809L), hostObject.objectPtr)

  /** TabContainer.get_tab_control */
  final def getTabControl(tab_idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TabContainer", "get_tab_control", 1065994134L), hostObject.objectPtr, tab_idx)

  /** TabContainer.set_tab_alignment */
  final def setTabAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabContainer", "set_tab_alignment", 2413632353L), hostObject.objectPtr, alignment)

  /** TabContainer.get_tab_alignment */
  final def getTabAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabContainer", "get_tab_alignment", 2178122193L), hostObject.objectPtr)

  /** TabContainer.set_tabs_position */
  final def setTabsPosition(tabs_position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabContainer", "set_tabs_position", 256673370L), hostObject.objectPtr, tabs_position)

  /** TabContainer.get_tabs_position */
  final def getTabsPosition(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabContainer", "get_tabs_position", 919937023L), hostObject.objectPtr)

  /** TabContainer.set_clip_tabs */
  final def setClipTabs(clip_tabs: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabContainer", "set_clip_tabs", 2586408642L), hostObject.objectPtr, clip_tabs)

  /** TabContainer.get_clip_tabs */
  final def getClipTabs(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabContainer", "get_clip_tabs", 36873697L), hostObject.objectPtr)

  /** TabContainer.set_tabs_visible */
  final def setTabsVisible(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabContainer", "set_tabs_visible", 2586408642L), hostObject.objectPtr, visible)

  /** TabContainer.are_tabs_visible */
  final def areTabsVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabContainer", "are_tabs_visible", 36873697L), hostObject.objectPtr)

  /** TabContainer.set_all_tabs_in_front */
  final def setAllTabsInFront(is_front: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabContainer", "set_all_tabs_in_front", 2586408642L), hostObject.objectPtr, is_front)

  /** TabContainer.is_all_tabs_in_front */
  final def isAllTabsInFront(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabContainer", "is_all_tabs_in_front", 36873697L), hostObject.objectPtr)

  /** TabContainer.set_tab_title */
  final def setTabTitle(tab_idx: Long, title: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabContainer", "set_tab_title", 501894301L), hostObject.objectPtr, tab_idx, title)

  /** TabContainer.get_tab_title */
  final def getTabTitle(tab_idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TabContainer", "get_tab_title", 844755477L), hostObject.objectPtr, tab_idx)

  /** TabContainer.set_tab_tooltip */
  final def setTabTooltip(tab_idx: Long, tooltip: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabContainer", "set_tab_tooltip", 501894301L), hostObject.objectPtr, tab_idx, tooltip)

  /** TabContainer.get_tab_tooltip */
  final def getTabTooltip(tab_idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TabContainer", "get_tab_tooltip", 844755477L), hostObject.objectPtr, tab_idx)

  /** TabContainer.set_tab_icon */
  final def setTabIcon(tab_idx: Long, icon: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabContainer", "set_tab_icon", 666127730L), hostObject.objectPtr, tab_idx, icon.hostObject)

  /** TabContainer.get_tab_icon */
  final def getTabIcon(tab_idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TabContainer", "get_tab_icon", 3536238170L), hostObject.objectPtr, tab_idx)

  /** TabContainer.set_tab_icon_max_width */
  final def setTabIconMaxWidth(tab_idx: Long, width: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabContainer", "set_tab_icon_max_width", 3937882851L), hostObject.objectPtr, tab_idx, width)

  /** TabContainer.get_tab_icon_max_width */
  final def getTabIconMaxWidth(tab_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TabContainer", "get_tab_icon_max_width", 923996154L), hostObject.objectPtr, tab_idx)

  /** TabContainer.set_tab_disabled */
  final def setTabDisabled(tab_idx: Long, disabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabContainer", "set_tab_disabled", 300928843L), hostObject.objectPtr, tab_idx, disabled)

  /** TabContainer.is_tab_disabled */
  final def isTabDisabled(tab_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TabContainer", "is_tab_disabled", 1116898809L), hostObject.objectPtr, tab_idx)

  /** TabContainer.set_tab_hidden */
  final def setTabHidden(tab_idx: Long, hidden: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabContainer", "set_tab_hidden", 300928843L), hostObject.objectPtr, tab_idx, hidden)

  /** TabContainer.is_tab_hidden */
  final def isTabHidden(tab_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TabContainer", "is_tab_hidden", 1116898809L), hostObject.objectPtr, tab_idx)

  /** TabContainer.set_tab_button_icon */
  final def setTabButtonIcon(tab_idx: Long, icon: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("TabContainer", "set_tab_button_icon", 666127730L), hostObject.objectPtr, tab_idx, icon.hostObject)

  /** TabContainer.get_tab_button_icon */
  final def getTabButtonIcon(tab_idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TabContainer", "get_tab_button_icon", 3536238170L), hostObject.objectPtr, tab_idx)

  /** TabContainer.get_tab_idx_at_point */
  final def getTabIdxAtPoint(point: gdext.builtin.Vector2): Long =
    Ptrcall.call1[gdext.builtin.Vector2, Long](MethodBind.get("TabContainer", "get_tab_idx_at_point", 3820158470L), hostObject.objectPtr, point)

  /** TabContainer.get_tab_idx_from_control */
  final def getTabIdxFromControl(control: Control): Long =
    Ptrcall.call1[GodotObject, Long](MethodBind.get("TabContainer", "get_tab_idx_from_control", 2787397975L), hostObject.objectPtr, control.hostObject)

  /** TabContainer.set_popup */
  final def setPopup(popup: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabContainer", "set_popup", 1078189570L), hostObject.objectPtr, popup.hostObject)

  /** TabContainer.get_popup */
  final def getPopup(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TabContainer", "get_popup", 111095082L), hostObject.objectPtr)

  /** TabContainer.set_switch_on_drag_hover */
  final def setSwitchOnDragHover(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabContainer", "set_switch_on_drag_hover", 2586408642L), hostObject.objectPtr, enabled)

  /** TabContainer.get_switch_on_drag_hover */
  final def getSwitchOnDragHover(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabContainer", "get_switch_on_drag_hover", 36873697L), hostObject.objectPtr)

  /** TabContainer.set_drag_to_rearrange_enabled */
  final def setDragToRearrangeEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabContainer", "set_drag_to_rearrange_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TabContainer.get_drag_to_rearrange_enabled */
  final def getDragToRearrangeEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabContainer", "get_drag_to_rearrange_enabled", 36873697L), hostObject.objectPtr)

  /** TabContainer.set_tabs_rearrange_group */
  final def setTabsRearrangeGroup(group_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabContainer", "set_tabs_rearrange_group", 1286410249L), hostObject.objectPtr, group_id)

  /** TabContainer.get_tabs_rearrange_group */
  final def getTabsRearrangeGroup(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabContainer", "get_tabs_rearrange_group", 3905245786L), hostObject.objectPtr)

  /** TabContainer.set_use_hidden_tabs_for_min_size */
  final def setUseHiddenTabsForMinSize(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabContainer", "set_use_hidden_tabs_for_min_size", 2586408642L), hostObject.objectPtr, enabled)

  /** TabContainer.get_use_hidden_tabs_for_min_size */
  final def getUseHiddenTabsForMinSize(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabContainer", "get_use_hidden_tabs_for_min_size", 36873697L), hostObject.objectPtr)

  /** TabContainer.set_tab_focus_mode */
  final def setTabFocusMode(focus_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabContainer", "set_tab_focus_mode", 3232914922L), hostObject.objectPtr, focus_mode)

  /** TabContainer.get_tab_focus_mode */
  final def getTabFocusMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TabContainer", "get_tab_focus_mode", 2132829277L), hostObject.objectPtr)

  /** TabContainer.set_deselect_enabled */
  final def setDeselectEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TabContainer", "set_deselect_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TabContainer.get_deselect_enabled */
  final def getDeselectEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TabContainer", "get_deselect_enabled", 36873697L), hostObject.objectPtr)

}
