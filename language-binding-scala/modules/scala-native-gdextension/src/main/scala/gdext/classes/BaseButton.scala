package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `BaseButton`, extends `Control`. */
abstract class BaseButton extends Control {

  /** BaseButton.set_pressed */
  final def setPressed(pressed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseButton", "set_pressed", 2586408642L), hostObject.objectPtr, pressed)

  /** BaseButton.is_pressed */
  final def isPressed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BaseButton", "is_pressed", 36873697L), hostObject.objectPtr)

  /** BaseButton.set_pressed_no_signal */
  final def setPressedNoSignal(pressed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseButton", "set_pressed_no_signal", 2586408642L), hostObject.objectPtr, pressed)

  /** BaseButton.is_hovered */
  final def isHovered(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BaseButton", "is_hovered", 36873697L), hostObject.objectPtr)

  /** BaseButton.set_toggle_mode */
  final def setToggleMode(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseButton", "set_toggle_mode", 2586408642L), hostObject.objectPtr, enabled)

  /** BaseButton.is_toggle_mode */
  final def isToggleMode(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BaseButton", "is_toggle_mode", 36873697L), hostObject.objectPtr)

  /** BaseButton.set_shortcut_in_tooltip */
  final def setShortcutInTooltip(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseButton", "set_shortcut_in_tooltip", 2586408642L), hostObject.objectPtr, enabled)

  /** BaseButton.is_shortcut_in_tooltip_enabled */
  final def isShortcutInTooltipEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BaseButton", "is_shortcut_in_tooltip_enabled", 36873697L), hostObject.objectPtr)

  /** BaseButton.set_disabled */
  final def setDisabled(disabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseButton", "set_disabled", 2586408642L), hostObject.objectPtr, disabled)

  /** BaseButton.is_disabled */
  final def isDisabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BaseButton", "is_disabled", 36873697L), hostObject.objectPtr)

  /** BaseButton.set_action_mode */
  final def setActionMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseButton", "set_action_mode", 1985162088L), hostObject.objectPtr, mode)

  /** BaseButton.get_action_mode */
  final def getActionMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseButton", "get_action_mode", 2589712189L), hostObject.objectPtr)

  /** BaseButton.set_button_mask */
  final def setButtonMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseButton", "set_button_mask", 3950145251L), hostObject.objectPtr, mask)

  /** BaseButton.get_button_mask */
  final def getButtonMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseButton", "get_button_mask", 2512161324L), hostObject.objectPtr)

  /** BaseButton.get_draw_mode */
  final def getDrawMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseButton", "get_draw_mode", 2492721305L), hostObject.objectPtr)

  /** BaseButton.set_keep_pressed_outside */
  final def setKeepPressedOutside(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseButton", "set_keep_pressed_outside", 2586408642L), hostObject.objectPtr, enabled)

  /** BaseButton.is_keep_pressed_outside */
  final def isKeepPressedOutside(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BaseButton", "is_keep_pressed_outside", 36873697L), hostObject.objectPtr)

  /** BaseButton.set_shortcut_feedback */
  final def setShortcutFeedback(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseButton", "set_shortcut_feedback", 2586408642L), hostObject.objectPtr, enabled)

  /** BaseButton.is_shortcut_feedback */
  final def isShortcutFeedback(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BaseButton", "is_shortcut_feedback", 36873697L), hostObject.objectPtr)

  /** BaseButton.set_shortcut */
  final def setShortcut(shortcut: Shortcut): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseButton", "set_shortcut", 857163497L), hostObject.objectPtr, shortcut.hostObject)

  /** BaseButton.get_shortcut */
  final def getShortcut(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("BaseButton", "get_shortcut", 3415666916L), hostObject.objectPtr)

  /** BaseButton.set_button_group */
  final def setButtonGroup(button_group: ButtonGroup): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseButton", "set_button_group", 1794463739L), hostObject.objectPtr, button_group.hostObject)

  /** BaseButton.get_button_group */
  final def getButtonGroup(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("BaseButton", "get_button_group", 281644053L), hostObject.objectPtr)

}

object BaseButton {
  /** Class metadata for Gd[BaseButton] lifetime management and casting. */
  given GodotClass[BaseButton] with {
    def className = "BaseButton"
    def isRefCounted = false
    def wrap(o: GodotObject): BaseButton = new BaseButton {}.withHost(o.objectPtr)
    def unwrap(t: BaseButton): GodotObject = t.hostObject
  }
}
