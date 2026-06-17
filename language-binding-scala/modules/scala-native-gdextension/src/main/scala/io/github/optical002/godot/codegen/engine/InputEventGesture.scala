package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventGesture`, extends `InputEventWithModifiers`. */
abstract class InputEventGesture extends InputEventWithModifiers {

  /** InputEventGesture.set_position */
  final def setPosition(position: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventGesture", "set_position", 743155724L), hostObject.objectPtr, position)

  /** InputEventGesture.get_position */
  final def getPosition(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("InputEventGesture", "get_position", 3341600327L), hostObject.objectPtr)

}

object InputEventGesture {
  /** Class metadata for Gd[InputEventGesture] lifetime management and casting. */
  given GodotClass[InputEventGesture] with {
    def className = "InputEventGesture"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEventGesture = new InputEventGesture {}.withHost(o.objectPtr)
    def unwrap(t: InputEventGesture): GodotObject = t.hostObject
  }
}
