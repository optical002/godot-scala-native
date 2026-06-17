package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventWithModifiers`, extends `InputEventFromWindow`. */
abstract class InputEventWithModifiers extends InputEventFromWindow {

  /** InputEventWithModifiers.set_command_or_control_autoremap */
  final def setCommandOrControlAutoremap(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventWithModifiers", "set_command_or_control_autoremap", 2586408642L), hostObject.objectPtr, enable)

  /** InputEventWithModifiers.is_command_or_control_autoremap */
  final def isCommandOrControlAutoremap(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEventWithModifiers", "is_command_or_control_autoremap", 36873697L), hostObject.objectPtr)

  /** InputEventWithModifiers.is_command_or_control_pressed */
  final def isCommandOrControlPressed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEventWithModifiers", "is_command_or_control_pressed", 36873697L), hostObject.objectPtr)

  /** InputEventWithModifiers.set_alt_pressed */
  final def setAltPressed(pressed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventWithModifiers", "set_alt_pressed", 2586408642L), hostObject.objectPtr, pressed)

  /** InputEventWithModifiers.is_alt_pressed */
  final def isAltPressed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEventWithModifiers", "is_alt_pressed", 36873697L), hostObject.objectPtr)

  /** InputEventWithModifiers.set_shift_pressed */
  final def setShiftPressed(pressed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventWithModifiers", "set_shift_pressed", 2586408642L), hostObject.objectPtr, pressed)

  /** InputEventWithModifiers.is_shift_pressed */
  final def isShiftPressed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEventWithModifiers", "is_shift_pressed", 36873697L), hostObject.objectPtr)

  /** InputEventWithModifiers.set_ctrl_pressed */
  final def setCtrlPressed(pressed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventWithModifiers", "set_ctrl_pressed", 2586408642L), hostObject.objectPtr, pressed)

  /** InputEventWithModifiers.is_ctrl_pressed */
  final def isCtrlPressed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEventWithModifiers", "is_ctrl_pressed", 36873697L), hostObject.objectPtr)

  /** InputEventWithModifiers.set_meta_pressed */
  final def setMetaPressed(pressed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventWithModifiers", "set_meta_pressed", 2586408642L), hostObject.objectPtr, pressed)

  /** InputEventWithModifiers.is_meta_pressed */
  final def isMetaPressed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEventWithModifiers", "is_meta_pressed", 36873697L), hostObject.objectPtr)

  /** InputEventWithModifiers.get_modifiers_mask */
  final def getModifiersMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventWithModifiers", "get_modifiers_mask", 1258259499L), hostObject.objectPtr)

}

object InputEventWithModifiers {
  /** Class metadata for Gd[InputEventWithModifiers] lifetime management and casting. */
  given GodotClass[InputEventWithModifiers] with {
    def className = "InputEventWithModifiers"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEventWithModifiers = new InputEventWithModifiers {}.withHost(o.objectPtr)
    def unwrap(t: InputEventWithModifiers): GodotObject = t.hostObject
  }
}
