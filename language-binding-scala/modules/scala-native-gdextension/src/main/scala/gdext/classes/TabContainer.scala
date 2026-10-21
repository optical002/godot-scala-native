package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TabContainer`, extends `Container`. */
abstract class TabContainer extends Container {
  override def godotClassName: String = "TabContainer"

  /** TabContainer.get_tab_count */
  final def getTabCount(): Long = {
    if (gdext.classes.TabContainer.mb_get_tab_count == null) gdext.classes.TabContainer.mb_get_tab_count = MethodBind.get("TabContainer", "get_tab_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TabContainer.mb_get_tab_count, livePtr)
  }

  /** TabContainer.set_current_tab */
  final def setCurrentTab(tab_idx: Long): Unit = {
    if (gdext.classes.TabContainer.mb_set_current_tab == null) gdext.classes.TabContainer.mb_set_current_tab = MethodBind.get("TabContainer", "set_current_tab", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TabContainer.mb_set_current_tab, livePtr, tab_idx)
  }

  /** TabContainer.get_current_tab */
  final def getCurrentTab(): Long = {
    if (gdext.classes.TabContainer.mb_get_current_tab == null) gdext.classes.TabContainer.mb_get_current_tab = MethodBind.get("TabContainer", "get_current_tab", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TabContainer.mb_get_current_tab, livePtr)
  }

  /** TabContainer.get_previous_tab */
  final def getPreviousTab(): Long = {
    if (gdext.classes.TabContainer.mb_get_previous_tab == null) gdext.classes.TabContainer.mb_get_previous_tab = MethodBind.get("TabContainer", "get_previous_tab", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TabContainer.mb_get_previous_tab, livePtr)
  }

  /** TabContainer.select_previous_available */
  final def selectPreviousAvailable(): Boolean = {
    if (gdext.classes.TabContainer.mb_select_previous_available == null) gdext.classes.TabContainer.mb_select_previous_available = MethodBind.get("TabContainer", "select_previous_available", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.TabContainer.mb_select_previous_available, livePtr)
  }

  /** TabContainer.select_next_available */
  final def selectNextAvailable(): Boolean = {
    if (gdext.classes.TabContainer.mb_select_next_available == null) gdext.classes.TabContainer.mb_select_next_available = MethodBind.get("TabContainer", "select_next_available", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.TabContainer.mb_select_next_available, livePtr)
  }

  /** TabContainer.get_current_tab_control */
  final def getCurrentTabControl(): Control = {
    if (gdext.classes.TabContainer.mb_get_current_tab_control == null) gdext.classes.TabContainer.mb_get_current_tab_control = MethodBind.get("TabContainer", "get_current_tab_control", 2783021301L)
    Wrappers.borrowed[Control](Ptrcall.call0[Long](gdext.classes.TabContainer.mb_get_current_tab_control, livePtr))
  }

  /** TabContainer.get_tab_bar */
  final def getTabBar(): TabBar = {
    if (gdext.classes.TabContainer.mb_get_tab_bar == null) gdext.classes.TabContainer.mb_get_tab_bar = MethodBind.get("TabContainer", "get_tab_bar", 1865451809L)
    Wrappers.borrowed[TabBar](Ptrcall.call0[Long](gdext.classes.TabContainer.mb_get_tab_bar, livePtr))
  }

  /** TabContainer.get_tab_control */
  final def getTabControl(tab_idx: Long): Control = {
    if (gdext.classes.TabContainer.mb_get_tab_control == null) gdext.classes.TabContainer.mb_get_tab_control = MethodBind.get("TabContainer", "get_tab_control", 1065994134L)
    Wrappers.borrowed[Control](Ptrcall.call1[Long, Long](gdext.classes.TabContainer.mb_get_tab_control, livePtr, tab_idx))
  }

  /** TabContainer.set_tab_alignment */
  final def setTabAlignment(alignment: Long): Unit = {
    if (gdext.classes.TabContainer.mb_set_tab_alignment == null) gdext.classes.TabContainer.mb_set_tab_alignment = MethodBind.get("TabContainer", "set_tab_alignment", 2413632353L)
    Ptrcall.callVoid1(gdext.classes.TabContainer.mb_set_tab_alignment, livePtr, alignment)
  }

  /** TabContainer.get_tab_alignment */
  final def getTabAlignment(): Long = {
    if (gdext.classes.TabContainer.mb_get_tab_alignment == null) gdext.classes.TabContainer.mb_get_tab_alignment = MethodBind.get("TabContainer", "get_tab_alignment", 2178122193L)
    Ptrcall.call0[Long](gdext.classes.TabContainer.mb_get_tab_alignment, livePtr)
  }

  /** TabContainer.set_tabs_position */
  final def setTabsPosition(tabs_position: Long): Unit = {
    if (gdext.classes.TabContainer.mb_set_tabs_position == null) gdext.classes.TabContainer.mb_set_tabs_position = MethodBind.get("TabContainer", "set_tabs_position", 256673370L)
    Ptrcall.callVoid1(gdext.classes.TabContainer.mb_set_tabs_position, livePtr, tabs_position)
  }

  /** TabContainer.get_tabs_position */
  final def getTabsPosition(): Long = {
    if (gdext.classes.TabContainer.mb_get_tabs_position == null) gdext.classes.TabContainer.mb_get_tabs_position = MethodBind.get("TabContainer", "get_tabs_position", 919937023L)
    Ptrcall.call0[Long](gdext.classes.TabContainer.mb_get_tabs_position, livePtr)
  }

  /** TabContainer.set_clip_tabs */
  final def setClipTabs(clip_tabs: Boolean): Unit = {
    if (gdext.classes.TabContainer.mb_set_clip_tabs == null) gdext.classes.TabContainer.mb_set_clip_tabs = MethodBind.get("TabContainer", "set_clip_tabs", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabContainer.mb_set_clip_tabs, livePtr, clip_tabs)
  }

  /** TabContainer.get_clip_tabs */
  final def getClipTabs(): Boolean = {
    if (gdext.classes.TabContainer.mb_get_clip_tabs == null) gdext.classes.TabContainer.mb_get_clip_tabs = MethodBind.get("TabContainer", "get_clip_tabs", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabContainer.mb_get_clip_tabs, livePtr)
  }

  /** TabContainer.set_tabs_visible */
  final def setTabsVisible(visible: Boolean): Unit = {
    if (gdext.classes.TabContainer.mb_set_tabs_visible == null) gdext.classes.TabContainer.mb_set_tabs_visible = MethodBind.get("TabContainer", "set_tabs_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabContainer.mb_set_tabs_visible, livePtr, visible)
  }

  /** TabContainer.are_tabs_visible */
  final def areTabsVisible(): Boolean = {
    if (gdext.classes.TabContainer.mb_are_tabs_visible == null) gdext.classes.TabContainer.mb_are_tabs_visible = MethodBind.get("TabContainer", "are_tabs_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabContainer.mb_are_tabs_visible, livePtr)
  }

  /** TabContainer.set_all_tabs_in_front */
  final def setAllTabsInFront(is_front: Boolean): Unit = {
    if (gdext.classes.TabContainer.mb_set_all_tabs_in_front == null) gdext.classes.TabContainer.mb_set_all_tabs_in_front = MethodBind.get("TabContainer", "set_all_tabs_in_front", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabContainer.mb_set_all_tabs_in_front, livePtr, is_front)
  }

  /** TabContainer.is_all_tabs_in_front */
  final def isAllTabsInFront(): Boolean = {
    if (gdext.classes.TabContainer.mb_is_all_tabs_in_front == null) gdext.classes.TabContainer.mb_is_all_tabs_in_front = MethodBind.get("TabContainer", "is_all_tabs_in_front", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabContainer.mb_is_all_tabs_in_front, livePtr)
  }

  /** TabContainer.set_tab_title */
  final def setTabTitle(tab_idx: Long, title: String): Unit = {
    if (gdext.classes.TabContainer.mb_set_tab_title == null) gdext.classes.TabContainer.mb_set_tab_title = MethodBind.get("TabContainer", "set_tab_title", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TabContainer.mb_set_tab_title, livePtr, tab_idx, title)
  }

  /** TabContainer.get_tab_title */
  final def getTabTitle(tab_idx: Long): String = {
    if (gdext.classes.TabContainer.mb_get_tab_title == null) gdext.classes.TabContainer.mb_get_tab_title = MethodBind.get("TabContainer", "get_tab_title", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TabContainer.mb_get_tab_title, livePtr, tab_idx)
  }

  /** TabContainer.set_tab_tooltip */
  final def setTabTooltip(tab_idx: Long, tooltip: String): Unit = {
    if (gdext.classes.TabContainer.mb_set_tab_tooltip == null) gdext.classes.TabContainer.mb_set_tab_tooltip = MethodBind.get("TabContainer", "set_tab_tooltip", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TabContainer.mb_set_tab_tooltip, livePtr, tab_idx, tooltip)
  }

  /** TabContainer.get_tab_tooltip */
  final def getTabTooltip(tab_idx: Long): String = {
    if (gdext.classes.TabContainer.mb_get_tab_tooltip == null) gdext.classes.TabContainer.mb_get_tab_tooltip = MethodBind.get("TabContainer", "get_tab_tooltip", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TabContainer.mb_get_tab_tooltip, livePtr, tab_idx)
  }

  /** TabContainer.set_tab_icon */
  final def setTabIcon(tab_idx: Long, icon: Texture2D): Unit = {
    if (gdext.classes.TabContainer.mb_set_tab_icon == null) gdext.classes.TabContainer.mb_set_tab_icon = MethodBind.get("TabContainer", "set_tab_icon", 666127730L)
    Ptrcall.callVoid2(gdext.classes.TabContainer.mb_set_tab_icon, livePtr, tab_idx, Wrappers.handle(icon))
  }

  /** TabContainer.get_tab_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTabIcon(tab_idx: Long): Texture2D = {
    if (gdext.classes.TabContainer.mb_get_tab_icon == null) gdext.classes.TabContainer.mb_get_tab_icon = MethodBind.get("TabContainer", "get_tab_icon", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.TabContainer.mb_get_tab_icon, livePtr, tab_idx))
  }

  /** TabContainer.set_tab_icon_max_width */
  final def setTabIconMaxWidth(tab_idx: Long, width: Long): Unit = {
    if (gdext.classes.TabContainer.mb_set_tab_icon_max_width == null) gdext.classes.TabContainer.mb_set_tab_icon_max_width = MethodBind.get("TabContainer", "set_tab_icon_max_width", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TabContainer.mb_set_tab_icon_max_width, livePtr, tab_idx, width)
  }

  /** TabContainer.get_tab_icon_max_width */
  final def getTabIconMaxWidth(tab_idx: Long): Long = {
    if (gdext.classes.TabContainer.mb_get_tab_icon_max_width == null) gdext.classes.TabContainer.mb_get_tab_icon_max_width = MethodBind.get("TabContainer", "get_tab_icon_max_width", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TabContainer.mb_get_tab_icon_max_width, livePtr, tab_idx)
  }

  /** TabContainer.set_tab_disabled */
  final def setTabDisabled(tab_idx: Long, disabled: Boolean): Unit = {
    if (gdext.classes.TabContainer.mb_set_tab_disabled == null) gdext.classes.TabContainer.mb_set_tab_disabled = MethodBind.get("TabContainer", "set_tab_disabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TabContainer.mb_set_tab_disabled, livePtr, tab_idx, disabled)
  }

  /** TabContainer.is_tab_disabled */
  final def isTabDisabled(tab_idx: Long): Boolean = {
    if (gdext.classes.TabContainer.mb_is_tab_disabled == null) gdext.classes.TabContainer.mb_is_tab_disabled = MethodBind.get("TabContainer", "is_tab_disabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TabContainer.mb_is_tab_disabled, livePtr, tab_idx)
  }

  /** TabContainer.set_tab_hidden */
  final def setTabHidden(tab_idx: Long, hidden: Boolean): Unit = {
    if (gdext.classes.TabContainer.mb_set_tab_hidden == null) gdext.classes.TabContainer.mb_set_tab_hidden = MethodBind.get("TabContainer", "set_tab_hidden", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TabContainer.mb_set_tab_hidden, livePtr, tab_idx, hidden)
  }

  /** TabContainer.is_tab_hidden */
  final def isTabHidden(tab_idx: Long): Boolean = {
    if (gdext.classes.TabContainer.mb_is_tab_hidden == null) gdext.classes.TabContainer.mb_is_tab_hidden = MethodBind.get("TabContainer", "is_tab_hidden", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TabContainer.mb_is_tab_hidden, livePtr, tab_idx)
  }

  /** TabContainer.set_tab_button_icon */
  final def setTabButtonIcon(tab_idx: Long, icon: Texture2D): Unit = {
    if (gdext.classes.TabContainer.mb_set_tab_button_icon == null) gdext.classes.TabContainer.mb_set_tab_button_icon = MethodBind.get("TabContainer", "set_tab_button_icon", 666127730L)
    Ptrcall.callVoid2(gdext.classes.TabContainer.mb_set_tab_button_icon, livePtr, tab_idx, Wrappers.handle(icon))
  }

  /** TabContainer.get_tab_button_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTabButtonIcon(tab_idx: Long): Texture2D = {
    if (gdext.classes.TabContainer.mb_get_tab_button_icon == null) gdext.classes.TabContainer.mb_get_tab_button_icon = MethodBind.get("TabContainer", "get_tab_button_icon", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.TabContainer.mb_get_tab_button_icon, livePtr, tab_idx))
  }

  /** TabContainer.get_tab_idx_at_point */
  final def getTabIdxAtPoint(point: gdext.builtin.Vector2): Long = {
    if (gdext.classes.TabContainer.mb_get_tab_idx_at_point == null) gdext.classes.TabContainer.mb_get_tab_idx_at_point = MethodBind.get("TabContainer", "get_tab_idx_at_point", 3820158470L)
    Ptrcall.call1[gdext.builtin.Vector2, Long](gdext.classes.TabContainer.mb_get_tab_idx_at_point, livePtr, point)
  }

  /** TabContainer.get_tab_idx_from_control */
  final def getTabIdxFromControl(control: Control): Long = {
    if (gdext.classes.TabContainer.mb_get_tab_idx_from_control == null) gdext.classes.TabContainer.mb_get_tab_idx_from_control = MethodBind.get("TabContainer", "get_tab_idx_from_control", 2787397975L)
    Ptrcall.call1[GodotObject, Long](gdext.classes.TabContainer.mb_get_tab_idx_from_control, livePtr, Wrappers.handle(control))
  }

  /** TabContainer.set_popup */
  final def setPopup(popup: Node): Unit = {
    if (gdext.classes.TabContainer.mb_set_popup == null) gdext.classes.TabContainer.mb_set_popup = MethodBind.get("TabContainer", "set_popup", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.TabContainer.mb_set_popup, livePtr, Wrappers.handle(popup))
  }

  /** TabContainer.get_popup */
  final def getPopup(): Popup = {
    if (gdext.classes.TabContainer.mb_get_popup == null) gdext.classes.TabContainer.mb_get_popup = MethodBind.get("TabContainer", "get_popup", 111095082L)
    Wrappers.borrowed[Popup](Ptrcall.call0[Long](gdext.classes.TabContainer.mb_get_popup, livePtr))
  }

  /** TabContainer.set_switch_on_drag_hover */
  final def setSwitchOnDragHover(enabled: Boolean): Unit = {
    if (gdext.classes.TabContainer.mb_set_switch_on_drag_hover == null) gdext.classes.TabContainer.mb_set_switch_on_drag_hover = MethodBind.get("TabContainer", "set_switch_on_drag_hover", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabContainer.mb_set_switch_on_drag_hover, livePtr, enabled)
  }

  /** TabContainer.get_switch_on_drag_hover */
  final def getSwitchOnDragHover(): Boolean = {
    if (gdext.classes.TabContainer.mb_get_switch_on_drag_hover == null) gdext.classes.TabContainer.mb_get_switch_on_drag_hover = MethodBind.get("TabContainer", "get_switch_on_drag_hover", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabContainer.mb_get_switch_on_drag_hover, livePtr)
  }

  /** TabContainer.set_drag_to_rearrange_enabled */
  final def setDragToRearrangeEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TabContainer.mb_set_drag_to_rearrange_enabled == null) gdext.classes.TabContainer.mb_set_drag_to_rearrange_enabled = MethodBind.get("TabContainer", "set_drag_to_rearrange_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabContainer.mb_set_drag_to_rearrange_enabled, livePtr, enabled)
  }

  /** TabContainer.get_drag_to_rearrange_enabled */
  final def getDragToRearrangeEnabled(): Boolean = {
    if (gdext.classes.TabContainer.mb_get_drag_to_rearrange_enabled == null) gdext.classes.TabContainer.mb_get_drag_to_rearrange_enabled = MethodBind.get("TabContainer", "get_drag_to_rearrange_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabContainer.mb_get_drag_to_rearrange_enabled, livePtr)
  }

  /** TabContainer.set_tabs_rearrange_group */
  final def setTabsRearrangeGroup(group_id: Long): Unit = {
    if (gdext.classes.TabContainer.mb_set_tabs_rearrange_group == null) gdext.classes.TabContainer.mb_set_tabs_rearrange_group = MethodBind.get("TabContainer", "set_tabs_rearrange_group", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TabContainer.mb_set_tabs_rearrange_group, livePtr, group_id)
  }

  /** TabContainer.get_tabs_rearrange_group */
  final def getTabsRearrangeGroup(): Long = {
    if (gdext.classes.TabContainer.mb_get_tabs_rearrange_group == null) gdext.classes.TabContainer.mb_get_tabs_rearrange_group = MethodBind.get("TabContainer", "get_tabs_rearrange_group", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TabContainer.mb_get_tabs_rearrange_group, livePtr)
  }

  /** TabContainer.set_use_hidden_tabs_for_min_size */
  final def setUseHiddenTabsForMinSize(enabled: Boolean): Unit = {
    if (gdext.classes.TabContainer.mb_set_use_hidden_tabs_for_min_size == null) gdext.classes.TabContainer.mb_set_use_hidden_tabs_for_min_size = MethodBind.get("TabContainer", "set_use_hidden_tabs_for_min_size", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabContainer.mb_set_use_hidden_tabs_for_min_size, livePtr, enabled)
  }

  /** TabContainer.get_use_hidden_tabs_for_min_size */
  final def getUseHiddenTabsForMinSize(): Boolean = {
    if (gdext.classes.TabContainer.mb_get_use_hidden_tabs_for_min_size == null) gdext.classes.TabContainer.mb_get_use_hidden_tabs_for_min_size = MethodBind.get("TabContainer", "get_use_hidden_tabs_for_min_size", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabContainer.mb_get_use_hidden_tabs_for_min_size, livePtr)
  }

  /** TabContainer.set_tab_focus_mode */
  final def setTabFocusMode(focus_mode: Long): Unit = {
    if (gdext.classes.TabContainer.mb_set_tab_focus_mode == null) gdext.classes.TabContainer.mb_set_tab_focus_mode = MethodBind.get("TabContainer", "set_tab_focus_mode", 3232914922L)
    Ptrcall.callVoid1(gdext.classes.TabContainer.mb_set_tab_focus_mode, livePtr, focus_mode)
  }

  /** TabContainer.get_tab_focus_mode */
  final def getTabFocusMode(): Long = {
    if (gdext.classes.TabContainer.mb_get_tab_focus_mode == null) gdext.classes.TabContainer.mb_get_tab_focus_mode = MethodBind.get("TabContainer", "get_tab_focus_mode", 2132829277L)
    Ptrcall.call0[Long](gdext.classes.TabContainer.mb_get_tab_focus_mode, livePtr)
  }

  /** TabContainer.set_deselect_enabled */
  final def setDeselectEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TabContainer.mb_set_deselect_enabled == null) gdext.classes.TabContainer.mb_set_deselect_enabled = MethodBind.get("TabContainer", "set_deselect_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TabContainer.mb_set_deselect_enabled, livePtr, enabled)
  }

  /** TabContainer.get_deselect_enabled */
  final def getDeselectEnabled(): Boolean = {
    if (gdext.classes.TabContainer.mb_get_deselect_enabled == null) gdext.classes.TabContainer.mb_get_deselect_enabled = MethodBind.get("TabContainer", "get_deselect_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TabContainer.mb_get_deselect_enabled, livePtr)
  }

}

object TabContainer {
  private[classes] var mb_get_tab_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_current_tab: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_tab: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_previous_tab: GDExtensionMethodBindPtr = null
  private[classes] var mb_select_previous_available: GDExtensionMethodBindPtr = null
  private[classes] var mb_select_next_available: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_tab_control: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_bar: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_control: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tabs_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tabs_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clip_tabs: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_clip_tabs: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tabs_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_tabs_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_all_tabs_in_front: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_all_tabs_in_front: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_icon_max_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_icon_max_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_tab_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_hidden: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_tab_hidden: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_button_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_button_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_idx_at_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_idx_from_control: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_popup: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_popup: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_switch_on_drag_hover: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_switch_on_drag_hover: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_to_rearrange_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag_to_rearrange_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tabs_rearrange_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tabs_rearrange_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_hidden_tabs_for_min_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_hidden_tabs_for_min_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_focus_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_focus_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_deselect_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_deselect_enabled: GDExtensionMethodBindPtr = null
}
