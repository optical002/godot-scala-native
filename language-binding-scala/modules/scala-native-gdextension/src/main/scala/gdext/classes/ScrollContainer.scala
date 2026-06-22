package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ScrollContainer`, extends `Container`. */
abstract class ScrollContainer extends Container {

  /** ScrollContainer.set_h_scroll */
  final def setHScroll(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollContainer", "set_h_scroll", 1286410249L), hostObject.objectPtr, value)

  /** ScrollContainer.get_h_scroll */
  final def getHScroll(): Long =
    Ptrcall.call0[Long](MethodBind.get("ScrollContainer", "get_h_scroll", 3905245786L), hostObject.objectPtr)

  /** ScrollContainer.set_v_scroll */
  final def setVScroll(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollContainer", "set_v_scroll", 1286410249L), hostObject.objectPtr, value)

  /** ScrollContainer.get_v_scroll */
  final def getVScroll(): Long =
    Ptrcall.call0[Long](MethodBind.get("ScrollContainer", "get_v_scroll", 3905245786L), hostObject.objectPtr)

  /** ScrollContainer.set_horizontal_custom_step */
  final def setHorizontalCustomStep(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollContainer", "set_horizontal_custom_step", 373806689L), hostObject.objectPtr, value)

  /** ScrollContainer.get_horizontal_custom_step */
  final def getHorizontalCustomStep(): Double =
    Ptrcall.call0[Double](MethodBind.get("ScrollContainer", "get_horizontal_custom_step", 1740695150L), hostObject.objectPtr)

  /** ScrollContainer.set_vertical_custom_step */
  final def setVerticalCustomStep(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollContainer", "set_vertical_custom_step", 373806689L), hostObject.objectPtr, value)

  /** ScrollContainer.get_vertical_custom_step */
  final def getVerticalCustomStep(): Double =
    Ptrcall.call0[Double](MethodBind.get("ScrollContainer", "get_vertical_custom_step", 1740695150L), hostObject.objectPtr)

  /** ScrollContainer.set_horizontal_scroll_mode */
  final def setHorizontalScrollMode(enable: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollContainer", "set_horizontal_scroll_mode", 2750506364L), hostObject.objectPtr, enable)

  /** ScrollContainer.get_horizontal_scroll_mode */
  final def getHorizontalScrollMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ScrollContainer", "get_horizontal_scroll_mode", 3987985145L), hostObject.objectPtr)

  /** ScrollContainer.set_vertical_scroll_mode */
  final def setVerticalScrollMode(enable: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollContainer", "set_vertical_scroll_mode", 2750506364L), hostObject.objectPtr, enable)

  /** ScrollContainer.get_vertical_scroll_mode */
  final def getVerticalScrollMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ScrollContainer", "get_vertical_scroll_mode", 3987985145L), hostObject.objectPtr)

  /** ScrollContainer.set_deadzone */
  final def setDeadzone(deadzone: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollContainer", "set_deadzone", 1286410249L), hostObject.objectPtr, deadzone)

  /** ScrollContainer.get_deadzone */
  final def getDeadzone(): Long =
    Ptrcall.call0[Long](MethodBind.get("ScrollContainer", "get_deadzone", 3905245786L), hostObject.objectPtr)

  /** ScrollContainer.set_scroll_hint_mode */
  final def setScrollHintMode(scroll_hint_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollContainer", "set_scroll_hint_mode", 578158943L), hostObject.objectPtr, scroll_hint_mode)

  /** ScrollContainer.get_scroll_hint_mode */
  final def getScrollHintMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ScrollContainer", "get_scroll_hint_mode", 246835423L), hostObject.objectPtr)

  /** ScrollContainer.set_tile_scroll_hint */
  final def setTileScrollHint(tile_scroll_hint: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollContainer", "set_tile_scroll_hint", 2586408642L), hostObject.objectPtr, tile_scroll_hint)

  /** ScrollContainer.is_scroll_hint_tiled */
  final def isScrollHintTiled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ScrollContainer", "is_scroll_hint_tiled", 2240911060L), hostObject.objectPtr)

  /** ScrollContainer.set_follow_focus */
  final def setFollowFocus(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollContainer", "set_follow_focus", 2586408642L), hostObject.objectPtr, enabled)

  /** ScrollContainer.is_following_focus */
  final def isFollowingFocus(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ScrollContainer", "is_following_focus", 36873697L), hostObject.objectPtr)

  /** ScrollContainer.get_h_scroll_bar */
  final def getHScrollBar(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ScrollContainer", "get_h_scroll_bar", 4004517983L), hostObject.objectPtr)

  /** ScrollContainer.get_v_scroll_bar */
  final def getVScrollBar(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ScrollContainer", "get_v_scroll_bar", 2630340773L), hostObject.objectPtr)

  /** ScrollContainer.ensure_control_visible */
  final def ensureControlVisible(control: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollContainer", "ensure_control_visible", 1496901182L), hostObject.objectPtr, control.hostObject)

  /** ScrollContainer.set_draw_focus_border */
  final def setDrawFocusBorder(draw: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollContainer", "set_draw_focus_border", 2586408642L), hostObject.objectPtr, draw)

  /** ScrollContainer.get_draw_focus_border */
  final def getDrawFocusBorder(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ScrollContainer", "get_draw_focus_border", 2240911060L), hostObject.objectPtr)

}

object ScrollContainer {
  /** Class metadata for Gd[ScrollContainer] lifetime management and casting. */
  given GodotClass[ScrollContainer] with {
    def className = "ScrollContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): ScrollContainer = new ScrollContainer {}.withHost(o.objectPtr)
    def unwrap(t: ScrollContainer): GodotObject = t.hostObject
  }
}
