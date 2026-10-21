package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEvent`, extends `Resource`. */
abstract class InputEvent extends Resource {
  override def godotClassName: String = "InputEvent"

  /** InputEvent.set_device */
  final def setDevice(device: Long): Unit = {
    if (gdext.classes.InputEvent.mb_set_device == null) gdext.classes.InputEvent.mb_set_device = MethodBind.get("InputEvent", "set_device", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.InputEvent.mb_set_device, livePtr, device)
  }

  /** InputEvent.get_device */
  final def getDevice(): Long = {
    if (gdext.classes.InputEvent.mb_get_device == null) gdext.classes.InputEvent.mb_get_device = MethodBind.get("InputEvent", "get_device", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.InputEvent.mb_get_device, livePtr)
  }

  /** InputEvent.is_action */
  final def isAction(action: gdext.builtin.StringName, exact_match: Boolean): Boolean = {
    if (gdext.classes.InputEvent.mb_is_action == null) gdext.classes.InputEvent.mb_is_action = MethodBind.get("InputEvent", "is_action", 1558498928L)
    Ptrcall.call2[gdext.builtin.StringName, Boolean, Boolean](gdext.classes.InputEvent.mb_is_action, livePtr, action, exact_match)
  }

  /** InputEvent.is_action_pressed */
  final def isActionPressed(action: gdext.builtin.StringName, allow_echo: Boolean, exact_match: Boolean): Boolean = {
    if (gdext.classes.InputEvent.mb_is_action_pressed == null) gdext.classes.InputEvent.mb_is_action_pressed = MethodBind.get("InputEvent", "is_action_pressed", 1631499404L)
    Ptrcall.call3[gdext.builtin.StringName, Boolean, Boolean, Boolean](gdext.classes.InputEvent.mb_is_action_pressed, livePtr, action, allow_echo, exact_match)
  }

  /** InputEvent.is_action_released */
  final def isActionReleased(action: gdext.builtin.StringName, exact_match: Boolean): Boolean = {
    if (gdext.classes.InputEvent.mb_is_action_released == null) gdext.classes.InputEvent.mb_is_action_released = MethodBind.get("InputEvent", "is_action_released", 1558498928L)
    Ptrcall.call2[gdext.builtin.StringName, Boolean, Boolean](gdext.classes.InputEvent.mb_is_action_released, livePtr, action, exact_match)
  }

  /** InputEvent.get_action_strength */
  final def getActionStrength(action: gdext.builtin.StringName, exact_match: Boolean): Double = {
    if (gdext.classes.InputEvent.mb_get_action_strength == null) gdext.classes.InputEvent.mb_get_action_strength = MethodBind.get("InputEvent", "get_action_strength", 801543509L)
    Ptrcall.call2[gdext.builtin.StringName, Boolean, Double](gdext.classes.InputEvent.mb_get_action_strength, livePtr, action, exact_match)
  }

  /** InputEvent.is_canceled */
  final def isCanceled(): Boolean = {
    if (gdext.classes.InputEvent.mb_is_canceled == null) gdext.classes.InputEvent.mb_is_canceled = MethodBind.get("InputEvent", "is_canceled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEvent.mb_is_canceled, livePtr)
  }

  /** InputEvent.is_pressed */
  final def isPressed(): Boolean = {
    if (gdext.classes.InputEvent.mb_is_pressed == null) gdext.classes.InputEvent.mb_is_pressed = MethodBind.get("InputEvent", "is_pressed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEvent.mb_is_pressed, livePtr)
  }

  /** InputEvent.is_released */
  final def isReleased(): Boolean = {
    if (gdext.classes.InputEvent.mb_is_released == null) gdext.classes.InputEvent.mb_is_released = MethodBind.get("InputEvent", "is_released", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEvent.mb_is_released, livePtr)
  }

  /** InputEvent.is_echo */
  final def isEcho(): Boolean = {
    if (gdext.classes.InputEvent.mb_is_echo == null) gdext.classes.InputEvent.mb_is_echo = MethodBind.get("InputEvent", "is_echo", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEvent.mb_is_echo, livePtr)
  }

  /** InputEvent.as_text */
  final def asText(): String = {
    if (gdext.classes.InputEvent.mb_as_text == null) gdext.classes.InputEvent.mb_as_text = MethodBind.get("InputEvent", "as_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.InputEvent.mb_as_text, livePtr)
  }

  /** InputEvent.is_match */
  final def isMatch(event: InputEvent, exact_match: Boolean): Boolean = {
    if (gdext.classes.InputEvent.mb_is_match == null) gdext.classes.InputEvent.mb_is_match = MethodBind.get("InputEvent", "is_match", 1754951977L)
    Ptrcall.call2[GodotObject, Boolean, Boolean](gdext.classes.InputEvent.mb_is_match, livePtr, Wrappers.handle(event), exact_match)
  }

  /** InputEvent.is_action_type */
  final def isActionType(): Boolean = {
    if (gdext.classes.InputEvent.mb_is_action_type == null) gdext.classes.InputEvent.mb_is_action_type = MethodBind.get("InputEvent", "is_action_type", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEvent.mb_is_action_type, livePtr)
  }

  /** InputEvent.accumulate */
  final def accumulate(with_event: InputEvent): Boolean = {
    if (gdext.classes.InputEvent.mb_accumulate == null) gdext.classes.InputEvent.mb_accumulate = MethodBind.get("InputEvent", "accumulate", 1062211774L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.InputEvent.mb_accumulate, livePtr, Wrappers.handle(with_event))
  }

  /** InputEvent.xformed_by. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def xformedBy(xform: gdext.builtin.Transform2D, local_ofs: gdext.builtin.Vector2): InputEvent = {
    if (gdext.classes.InputEvent.mb_xformed_by == null) gdext.classes.InputEvent.mb_xformed_by = MethodBind.get("InputEvent", "xformed_by", 1282766827L)
    Wrappers.owned[InputEvent](Ptrcall.call2[gdext.builtin.Transform2D, gdext.builtin.Vector2, Long](gdext.classes.InputEvent.mb_xformed_by, livePtr, xform, local_ofs))
  }

}

object InputEvent {
  private[classes] var mb_set_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_action_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_action_released: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_canceled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_released: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_echo: GDExtensionMethodBindPtr = null
  private[classes] var mb_as_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_match: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_action_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_accumulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_xformed_by: GDExtensionMethodBindPtr = null
}
