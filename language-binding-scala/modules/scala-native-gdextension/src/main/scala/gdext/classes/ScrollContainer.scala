package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ScrollContainer`, extends `Container`. */
abstract class ScrollContainer extends Container {
  override def godotClassName: String = "ScrollContainer"

  /** ScrollContainer.set_h_scroll */
  final def setHScroll(value: Long): Unit = {
    if (gdext.classes.ScrollContainer.mb_set_h_scroll == null) gdext.classes.ScrollContainer.mb_set_h_scroll = MethodBind.get("ScrollContainer", "set_h_scroll", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ScrollContainer.mb_set_h_scroll, livePtr, value)
  }

  /** ScrollContainer.get_h_scroll */
  final def getHScroll(): Long = {
    if (gdext.classes.ScrollContainer.mb_get_h_scroll == null) gdext.classes.ScrollContainer.mb_get_h_scroll = MethodBind.get("ScrollContainer", "get_h_scroll", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ScrollContainer.mb_get_h_scroll, livePtr)
  }

  /** ScrollContainer.set_v_scroll */
  final def setVScroll(value: Long): Unit = {
    if (gdext.classes.ScrollContainer.mb_set_v_scroll == null) gdext.classes.ScrollContainer.mb_set_v_scroll = MethodBind.get("ScrollContainer", "set_v_scroll", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ScrollContainer.mb_set_v_scroll, livePtr, value)
  }

  /** ScrollContainer.get_v_scroll */
  final def getVScroll(): Long = {
    if (gdext.classes.ScrollContainer.mb_get_v_scroll == null) gdext.classes.ScrollContainer.mb_get_v_scroll = MethodBind.get("ScrollContainer", "get_v_scroll", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ScrollContainer.mb_get_v_scroll, livePtr)
  }

  /** ScrollContainer.set_horizontal_custom_step */
  final def setHorizontalCustomStep(value: Double): Unit = {
    if (gdext.classes.ScrollContainer.mb_set_horizontal_custom_step == null) gdext.classes.ScrollContainer.mb_set_horizontal_custom_step = MethodBind.get("ScrollContainer", "set_horizontal_custom_step", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ScrollContainer.mb_set_horizontal_custom_step, livePtr, value)
  }

  /** ScrollContainer.get_horizontal_custom_step */
  final def getHorizontalCustomStep(): Double = {
    if (gdext.classes.ScrollContainer.mb_get_horizontal_custom_step == null) gdext.classes.ScrollContainer.mb_get_horizontal_custom_step = MethodBind.get("ScrollContainer", "get_horizontal_custom_step", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ScrollContainer.mb_get_horizontal_custom_step, livePtr)
  }

  /** ScrollContainer.set_vertical_custom_step */
  final def setVerticalCustomStep(value: Double): Unit = {
    if (gdext.classes.ScrollContainer.mb_set_vertical_custom_step == null) gdext.classes.ScrollContainer.mb_set_vertical_custom_step = MethodBind.get("ScrollContainer", "set_vertical_custom_step", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ScrollContainer.mb_set_vertical_custom_step, livePtr, value)
  }

  /** ScrollContainer.get_vertical_custom_step */
  final def getVerticalCustomStep(): Double = {
    if (gdext.classes.ScrollContainer.mb_get_vertical_custom_step == null) gdext.classes.ScrollContainer.mb_get_vertical_custom_step = MethodBind.get("ScrollContainer", "get_vertical_custom_step", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ScrollContainer.mb_get_vertical_custom_step, livePtr)
  }

  /** ScrollContainer.set_horizontal_scroll_mode */
  final def setHorizontalScrollMode(enable: Long): Unit = {
    if (gdext.classes.ScrollContainer.mb_set_horizontal_scroll_mode == null) gdext.classes.ScrollContainer.mb_set_horizontal_scroll_mode = MethodBind.get("ScrollContainer", "set_horizontal_scroll_mode", 2750506364L)
    Ptrcall.callVoid1(gdext.classes.ScrollContainer.mb_set_horizontal_scroll_mode, livePtr, enable)
  }

  /** ScrollContainer.get_horizontal_scroll_mode */
  final def getHorizontalScrollMode(): Long = {
    if (gdext.classes.ScrollContainer.mb_get_horizontal_scroll_mode == null) gdext.classes.ScrollContainer.mb_get_horizontal_scroll_mode = MethodBind.get("ScrollContainer", "get_horizontal_scroll_mode", 3987985145L)
    Ptrcall.call0[Long](gdext.classes.ScrollContainer.mb_get_horizontal_scroll_mode, livePtr)
  }

  /** ScrollContainer.set_vertical_scroll_mode */
  final def setVerticalScrollMode(enable: Long): Unit = {
    if (gdext.classes.ScrollContainer.mb_set_vertical_scroll_mode == null) gdext.classes.ScrollContainer.mb_set_vertical_scroll_mode = MethodBind.get("ScrollContainer", "set_vertical_scroll_mode", 2750506364L)
    Ptrcall.callVoid1(gdext.classes.ScrollContainer.mb_set_vertical_scroll_mode, livePtr, enable)
  }

  /** ScrollContainer.get_vertical_scroll_mode */
  final def getVerticalScrollMode(): Long = {
    if (gdext.classes.ScrollContainer.mb_get_vertical_scroll_mode == null) gdext.classes.ScrollContainer.mb_get_vertical_scroll_mode = MethodBind.get("ScrollContainer", "get_vertical_scroll_mode", 3987985145L)
    Ptrcall.call0[Long](gdext.classes.ScrollContainer.mb_get_vertical_scroll_mode, livePtr)
  }

  /** ScrollContainer.set_deadzone */
  final def setDeadzone(deadzone: Long): Unit = {
    if (gdext.classes.ScrollContainer.mb_set_deadzone == null) gdext.classes.ScrollContainer.mb_set_deadzone = MethodBind.get("ScrollContainer", "set_deadzone", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ScrollContainer.mb_set_deadzone, livePtr, deadzone)
  }

  /** ScrollContainer.get_deadzone */
  final def getDeadzone(): Long = {
    if (gdext.classes.ScrollContainer.mb_get_deadzone == null) gdext.classes.ScrollContainer.mb_get_deadzone = MethodBind.get("ScrollContainer", "get_deadzone", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ScrollContainer.mb_get_deadzone, livePtr)
  }

  /** ScrollContainer.set_scroll_hint_mode */
  final def setScrollHintMode(scroll_hint_mode: Long): Unit = {
    if (gdext.classes.ScrollContainer.mb_set_scroll_hint_mode == null) gdext.classes.ScrollContainer.mb_set_scroll_hint_mode = MethodBind.get("ScrollContainer", "set_scroll_hint_mode", 578158943L)
    Ptrcall.callVoid1(gdext.classes.ScrollContainer.mb_set_scroll_hint_mode, livePtr, scroll_hint_mode)
  }

  /** ScrollContainer.get_scroll_hint_mode */
  final def getScrollHintMode(): Long = {
    if (gdext.classes.ScrollContainer.mb_get_scroll_hint_mode == null) gdext.classes.ScrollContainer.mb_get_scroll_hint_mode = MethodBind.get("ScrollContainer", "get_scroll_hint_mode", 246835423L)
    Ptrcall.call0[Long](gdext.classes.ScrollContainer.mb_get_scroll_hint_mode, livePtr)
  }

  /** ScrollContainer.set_tile_scroll_hint */
  final def setTileScrollHint(tile_scroll_hint: Boolean): Unit = {
    if (gdext.classes.ScrollContainer.mb_set_tile_scroll_hint == null) gdext.classes.ScrollContainer.mb_set_tile_scroll_hint = MethodBind.get("ScrollContainer", "set_tile_scroll_hint", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ScrollContainer.mb_set_tile_scroll_hint, livePtr, tile_scroll_hint)
  }

  /** ScrollContainer.is_scroll_hint_tiled */
  final def isScrollHintTiled(): Boolean = {
    if (gdext.classes.ScrollContainer.mb_is_scroll_hint_tiled == null) gdext.classes.ScrollContainer.mb_is_scroll_hint_tiled = MethodBind.get("ScrollContainer", "is_scroll_hint_tiled", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.ScrollContainer.mb_is_scroll_hint_tiled, livePtr)
  }

  /** ScrollContainer.set_follow_focus */
  final def setFollowFocus(enabled: Boolean): Unit = {
    if (gdext.classes.ScrollContainer.mb_set_follow_focus == null) gdext.classes.ScrollContainer.mb_set_follow_focus = MethodBind.get("ScrollContainer", "set_follow_focus", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ScrollContainer.mb_set_follow_focus, livePtr, enabled)
  }

  /** ScrollContainer.is_following_focus */
  final def isFollowingFocus(): Boolean = {
    if (gdext.classes.ScrollContainer.mb_is_following_focus == null) gdext.classes.ScrollContainer.mb_is_following_focus = MethodBind.get("ScrollContainer", "is_following_focus", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ScrollContainer.mb_is_following_focus, livePtr)
  }

  /** ScrollContainer.get_h_scroll_bar */
  final def getHScrollBar(): HScrollBar = {
    if (gdext.classes.ScrollContainer.mb_get_h_scroll_bar == null) gdext.classes.ScrollContainer.mb_get_h_scroll_bar = MethodBind.get("ScrollContainer", "get_h_scroll_bar", 4004517983L)
    Wrappers.borrowed[HScrollBar](Ptrcall.call0[Long](gdext.classes.ScrollContainer.mb_get_h_scroll_bar, livePtr))
  }

  /** ScrollContainer.get_v_scroll_bar */
  final def getVScrollBar(): VScrollBar = {
    if (gdext.classes.ScrollContainer.mb_get_v_scroll_bar == null) gdext.classes.ScrollContainer.mb_get_v_scroll_bar = MethodBind.get("ScrollContainer", "get_v_scroll_bar", 2630340773L)
    Wrappers.borrowed[VScrollBar](Ptrcall.call0[Long](gdext.classes.ScrollContainer.mb_get_v_scroll_bar, livePtr))
  }

  /** ScrollContainer.ensure_control_visible */
  final def ensureControlVisible(control: Control): Unit = {
    if (gdext.classes.ScrollContainer.mb_ensure_control_visible == null) gdext.classes.ScrollContainer.mb_ensure_control_visible = MethodBind.get("ScrollContainer", "ensure_control_visible", 1496901182L)
    Ptrcall.callVoid1(gdext.classes.ScrollContainer.mb_ensure_control_visible, livePtr, Wrappers.handle(control))
  }

  /** ScrollContainer.set_draw_focus_border */
  final def setDrawFocusBorder(draw: Boolean): Unit = {
    if (gdext.classes.ScrollContainer.mb_set_draw_focus_border == null) gdext.classes.ScrollContainer.mb_set_draw_focus_border = MethodBind.get("ScrollContainer", "set_draw_focus_border", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ScrollContainer.mb_set_draw_focus_border, livePtr, draw)
  }

  /** ScrollContainer.get_draw_focus_border */
  final def getDrawFocusBorder(): Boolean = {
    if (gdext.classes.ScrollContainer.mb_get_draw_focus_border == null) gdext.classes.ScrollContainer.mb_get_draw_focus_border = MethodBind.get("ScrollContainer", "get_draw_focus_border", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.ScrollContainer.mb_get_draw_focus_border, livePtr)
  }

}

object ScrollContainer {
  private[classes] var mb_set_h_scroll: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_h_scroll: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_v_scroll: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_scroll: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_horizontal_custom_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_horizontal_custom_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical_custom_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertical_custom_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_horizontal_scroll_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_horizontal_scroll_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical_scroll_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertical_scroll_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_deadzone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_deadzone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scroll_hint_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scroll_hint_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tile_scroll_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scroll_hint_tiled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_follow_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_following_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_h_scroll_bar: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_scroll_bar: GDExtensionMethodBindPtr = null
  private[classes] var mb_ensure_control_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_focus_border: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_draw_focus_border: GDExtensionMethodBindPtr = null
}
