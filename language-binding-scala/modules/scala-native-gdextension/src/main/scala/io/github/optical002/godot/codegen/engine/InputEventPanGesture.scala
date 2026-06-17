package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventPanGesture`, extends `InputEventGesture`. */
abstract class InputEventPanGesture extends InputEventGesture {

  /** InputEventPanGesture.set_delta */
  final def setDelta(delta: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventPanGesture", "set_delta", 743155724L), hostObject.objectPtr, delta)

  /** InputEventPanGesture.get_delta */
  final def getDelta(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("InputEventPanGesture", "get_delta", 3341600327L), hostObject.objectPtr)

}

object InputEventPanGesture {
  /** Class metadata for Gd[InputEventPanGesture] lifetime management and casting. */
  given GodotClass[InputEventPanGesture] with {
    def className = "InputEventPanGesture"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEventPanGesture = new InputEventPanGesture {}.withHost(o.objectPtr)
    def unwrap(t: InputEventPanGesture): GodotObject = t.hostObject
  }
}
