package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventPanGesture`, extends `InputEventGesture`. */
abstract class InputEventPanGesture extends InputEventGesture {

  /** InputEventPanGesture.set_delta */
  final def setDelta(delta: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventPanGesture", "set_delta", 743155724L), hostObject.objectPtr, delta)

  /** InputEventPanGesture.get_delta */
  final def getDelta(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("InputEventPanGesture", "get_delta", 3341600327L), hostObject.objectPtr)

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
