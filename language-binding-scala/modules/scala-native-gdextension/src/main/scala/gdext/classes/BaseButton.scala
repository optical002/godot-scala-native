package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `BaseButton`, extends `Control`. */
abstract class BaseButton extends Control {
  override def godotClassName: String = "BaseButton"

  /** BaseButton.set_pressed */
  final def setPressed(pressed: Boolean): Unit = {
    if (gdext.classes.BaseButton.mb_set_pressed == null) gdext.classes.BaseButton.mb_set_pressed = MethodBind.get("BaseButton", "set_pressed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BaseButton.mb_set_pressed, livePtr, pressed)
  }

  /** BaseButton.is_pressed */
  final def isPressed(): Boolean = {
    if (gdext.classes.BaseButton.mb_is_pressed == null) gdext.classes.BaseButton.mb_is_pressed = MethodBind.get("BaseButton", "is_pressed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BaseButton.mb_is_pressed, livePtr)
  }

  /** BaseButton.set_pressed_no_signal */
  final def setPressedNoSignal(pressed: Boolean): Unit = {
    if (gdext.classes.BaseButton.mb_set_pressed_no_signal == null) gdext.classes.BaseButton.mb_set_pressed_no_signal = MethodBind.get("BaseButton", "set_pressed_no_signal", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BaseButton.mb_set_pressed_no_signal, livePtr, pressed)
  }

  /** BaseButton.is_hovered */
  final def isHovered(): Boolean = {
    if (gdext.classes.BaseButton.mb_is_hovered == null) gdext.classes.BaseButton.mb_is_hovered = MethodBind.get("BaseButton", "is_hovered", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BaseButton.mb_is_hovered, livePtr)
  }

  /** BaseButton.set_toggle_mode */
  final def setToggleMode(enabled: Boolean): Unit = {
    if (gdext.classes.BaseButton.mb_set_toggle_mode == null) gdext.classes.BaseButton.mb_set_toggle_mode = MethodBind.get("BaseButton", "set_toggle_mode", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BaseButton.mb_set_toggle_mode, livePtr, enabled)
  }

  /** BaseButton.is_toggle_mode */
  final def isToggleMode(): Boolean = {
    if (gdext.classes.BaseButton.mb_is_toggle_mode == null) gdext.classes.BaseButton.mb_is_toggle_mode = MethodBind.get("BaseButton", "is_toggle_mode", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BaseButton.mb_is_toggle_mode, livePtr)
  }

  /** BaseButton.set_shortcut_in_tooltip */
  final def setShortcutInTooltip(enabled: Boolean): Unit = {
    if (gdext.classes.BaseButton.mb_set_shortcut_in_tooltip == null) gdext.classes.BaseButton.mb_set_shortcut_in_tooltip = MethodBind.get("BaseButton", "set_shortcut_in_tooltip", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BaseButton.mb_set_shortcut_in_tooltip, livePtr, enabled)
  }

  /** BaseButton.is_shortcut_in_tooltip_enabled */
  final def isShortcutInTooltipEnabled(): Boolean = {
    if (gdext.classes.BaseButton.mb_is_shortcut_in_tooltip_enabled == null) gdext.classes.BaseButton.mb_is_shortcut_in_tooltip_enabled = MethodBind.get("BaseButton", "is_shortcut_in_tooltip_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BaseButton.mb_is_shortcut_in_tooltip_enabled, livePtr)
  }

  /** BaseButton.set_disabled */
  final def setDisabled(disabled: Boolean): Unit = {
    if (gdext.classes.BaseButton.mb_set_disabled == null) gdext.classes.BaseButton.mb_set_disabled = MethodBind.get("BaseButton", "set_disabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BaseButton.mb_set_disabled, livePtr, disabled)
  }

  /** BaseButton.is_disabled */
  final def isDisabled(): Boolean = {
    if (gdext.classes.BaseButton.mb_is_disabled == null) gdext.classes.BaseButton.mb_is_disabled = MethodBind.get("BaseButton", "is_disabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BaseButton.mb_is_disabled, livePtr)
  }

  /** BaseButton.set_action_mode */
  final def setActionMode(mode: Long): Unit = {
    if (gdext.classes.BaseButton.mb_set_action_mode == null) gdext.classes.BaseButton.mb_set_action_mode = MethodBind.get("BaseButton", "set_action_mode", 1985162088L)
    Ptrcall.callVoid1(gdext.classes.BaseButton.mb_set_action_mode, livePtr, mode)
  }

  /** BaseButton.get_action_mode */
  final def getActionMode(): Long = {
    if (gdext.classes.BaseButton.mb_get_action_mode == null) gdext.classes.BaseButton.mb_get_action_mode = MethodBind.get("BaseButton", "get_action_mode", 2589712189L)
    Ptrcall.call0[Long](gdext.classes.BaseButton.mb_get_action_mode, livePtr)
  }

  /** BaseButton.set_button_mask */
  final def setButtonMask(mask: Long): Unit = {
    if (gdext.classes.BaseButton.mb_set_button_mask == null) gdext.classes.BaseButton.mb_set_button_mask = MethodBind.get("BaseButton", "set_button_mask", 3950145251L)
    Ptrcall.callVoid1(gdext.classes.BaseButton.mb_set_button_mask, livePtr, mask)
  }

  /** BaseButton.get_button_mask */
  final def getButtonMask(): Long = {
    if (gdext.classes.BaseButton.mb_get_button_mask == null) gdext.classes.BaseButton.mb_get_button_mask = MethodBind.get("BaseButton", "get_button_mask", 2512161324L)
    Ptrcall.call0[Long](gdext.classes.BaseButton.mb_get_button_mask, livePtr)
  }

  /** BaseButton.get_draw_mode */
  final def getDrawMode(): Long = {
    if (gdext.classes.BaseButton.mb_get_draw_mode == null) gdext.classes.BaseButton.mb_get_draw_mode = MethodBind.get("BaseButton", "get_draw_mode", 2492721305L)
    Ptrcall.call0[Long](gdext.classes.BaseButton.mb_get_draw_mode, livePtr)
  }

  /** BaseButton.set_keep_pressed_outside */
  final def setKeepPressedOutside(enabled: Boolean): Unit = {
    if (gdext.classes.BaseButton.mb_set_keep_pressed_outside == null) gdext.classes.BaseButton.mb_set_keep_pressed_outside = MethodBind.get("BaseButton", "set_keep_pressed_outside", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BaseButton.mb_set_keep_pressed_outside, livePtr, enabled)
  }

  /** BaseButton.is_keep_pressed_outside */
  final def isKeepPressedOutside(): Boolean = {
    if (gdext.classes.BaseButton.mb_is_keep_pressed_outside == null) gdext.classes.BaseButton.mb_is_keep_pressed_outside = MethodBind.get("BaseButton", "is_keep_pressed_outside", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BaseButton.mb_is_keep_pressed_outside, livePtr)
  }

  /** BaseButton.set_shortcut_feedback */
  final def setShortcutFeedback(enabled: Boolean): Unit = {
    if (gdext.classes.BaseButton.mb_set_shortcut_feedback == null) gdext.classes.BaseButton.mb_set_shortcut_feedback = MethodBind.get("BaseButton", "set_shortcut_feedback", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BaseButton.mb_set_shortcut_feedback, livePtr, enabled)
  }

  /** BaseButton.is_shortcut_feedback */
  final def isShortcutFeedback(): Boolean = {
    if (gdext.classes.BaseButton.mb_is_shortcut_feedback == null) gdext.classes.BaseButton.mb_is_shortcut_feedback = MethodBind.get("BaseButton", "is_shortcut_feedback", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BaseButton.mb_is_shortcut_feedback, livePtr)
  }

  /** BaseButton.set_shortcut */
  final def setShortcut(shortcut: Shortcut): Unit = {
    if (gdext.classes.BaseButton.mb_set_shortcut == null) gdext.classes.BaseButton.mb_set_shortcut = MethodBind.get("BaseButton", "set_shortcut", 857163497L)
    Ptrcall.callVoid1(gdext.classes.BaseButton.mb_set_shortcut, livePtr, Wrappers.handle(shortcut))
  }

  /** BaseButton.get_shortcut. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getShortcut(): Shortcut = {
    if (gdext.classes.BaseButton.mb_get_shortcut == null) gdext.classes.BaseButton.mb_get_shortcut = MethodBind.get("BaseButton", "get_shortcut", 3415666916L)
    Wrappers.owned[Shortcut](Ptrcall.call0[Long](gdext.classes.BaseButton.mb_get_shortcut, livePtr))
  }

  /** BaseButton.set_button_group */
  final def setButtonGroup(button_group: ButtonGroup): Unit = {
    if (gdext.classes.BaseButton.mb_set_button_group == null) gdext.classes.BaseButton.mb_set_button_group = MethodBind.get("BaseButton", "set_button_group", 1794463739L)
    Ptrcall.callVoid1(gdext.classes.BaseButton.mb_set_button_group, livePtr, Wrappers.handle(button_group))
  }

  /** BaseButton.get_button_group. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getButtonGroup(): ButtonGroup = {
    if (gdext.classes.BaseButton.mb_get_button_group == null) gdext.classes.BaseButton.mb_get_button_group = MethodBind.get("BaseButton", "get_button_group", 281644053L)
    Wrappers.owned[ButtonGroup](Ptrcall.call0[Long](gdext.classes.BaseButton.mb_get_button_group, livePtr))
  }

}

object BaseButton {
  private[classes] var mb_set_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pressed_no_signal: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hovered: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_toggle_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_toggle_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shortcut_in_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_shortcut_in_tooltip_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_action_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_button_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_button_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_draw_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keep_pressed_outside: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_keep_pressed_outside: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shortcut_feedback: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_shortcut_feedback: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_button_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_button_group: GDExtensionMethodBindPtr = null
}
