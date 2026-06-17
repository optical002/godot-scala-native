package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEvent`, extends `Resource`. */
abstract class InputEvent extends Resource {

  /** InputEvent.set_device */
  final def setDevice(device: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEvent", "set_device", 1286410249L), hostObject.objectPtr, device)

  /** InputEvent.get_device */
  final def getDevice(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEvent", "get_device", 3905245786L), hostObject.objectPtr)

  /** InputEvent.is_action */
  final def isAction(action: io.github.optical002.godot.builtin.StringName, exact_match: Boolean): Boolean =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, Boolean, Boolean](MethodBind.get("InputEvent", "is_action", 1558498928L), hostObject.objectPtr, action, exact_match)

  /** InputEvent.is_action_pressed */
  final def isActionPressed(action: io.github.optical002.godot.builtin.StringName, allow_echo: Boolean, exact_match: Boolean): Boolean =
    Ptrcall.call3[io.github.optical002.godot.builtin.StringName, Boolean, Boolean, Boolean](MethodBind.get("InputEvent", "is_action_pressed", 1631499404L), hostObject.objectPtr, action, allow_echo, exact_match)

  /** InputEvent.is_action_released */
  final def isActionReleased(action: io.github.optical002.godot.builtin.StringName, exact_match: Boolean): Boolean =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, Boolean, Boolean](MethodBind.get("InputEvent", "is_action_released", 1558498928L), hostObject.objectPtr, action, exact_match)

  /** InputEvent.get_action_strength */
  final def getActionStrength(action: io.github.optical002.godot.builtin.StringName, exact_match: Boolean): Double =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, Boolean, Double](MethodBind.get("InputEvent", "get_action_strength", 801543509L), hostObject.objectPtr, action, exact_match)

  /** InputEvent.is_canceled */
  final def isCanceled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEvent", "is_canceled", 36873697L), hostObject.objectPtr)

  /** InputEvent.is_pressed */
  final def isPressed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEvent", "is_pressed", 36873697L), hostObject.objectPtr)

  /** InputEvent.is_released */
  final def isReleased(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEvent", "is_released", 36873697L), hostObject.objectPtr)

  /** InputEvent.is_echo */
  final def isEcho(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEvent", "is_echo", 36873697L), hostObject.objectPtr)

  /** InputEvent.as_text */
  final def asText(): String =
    Ptrcall.call0[String](MethodBind.get("InputEvent", "as_text", 201670096L), hostObject.objectPtr)

  /** InputEvent.is_match */
  final def isMatch(event: InputEvent, exact_match: Boolean): Boolean =
    Ptrcall.call2[GodotObject, Boolean, Boolean](MethodBind.get("InputEvent", "is_match", 1754951977L), hostObject.objectPtr, event.hostObject, exact_match)

  /** InputEvent.is_action_type */
  final def isActionType(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEvent", "is_action_type", 36873697L), hostObject.objectPtr)

  /** InputEvent.accumulate */
  final def accumulate(with_event: InputEvent): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("InputEvent", "accumulate", 1062211774L), hostObject.objectPtr, with_event.hostObject)

  /** InputEvent.xformed_by */
  final def xformedBy(xform: io.github.optical002.godot.builtin.Transform2D, local_ofs: io.github.optical002.godot.builtin.Vector2): GodotObject =
    Ptrcall.call2[io.github.optical002.godot.builtin.Transform2D, io.github.optical002.godot.builtin.Vector2, GodotObject](MethodBind.get("InputEvent", "xformed_by", 1282766827L), hostObject.objectPtr, xform, local_ofs)

}

object InputEvent {
  /** Class metadata for Gd[InputEvent] lifetime management and casting. */
  given GodotClass[InputEvent] with {
    def className = "InputEvent"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEvent = new InputEvent {}.withHost(o.objectPtr)
    def unwrap(t: InputEvent): GodotObject = t.hostObject
  }
}
