package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventPanGesture`, extends `InputEventGesture`. */
abstract class InputEventPanGesture extends InputEventGesture {
  override def godotClassName: String = "InputEventPanGesture"

  /** InputEventPanGesture.set_delta */
  final def setDelta(delta: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventPanGesture", "set_delta", 743155724L), hostObject.objectPtr, delta)

  /** InputEventPanGesture.get_delta */
  final def getDelta(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("InputEventPanGesture", "get_delta", 3341600327L), hostObject.objectPtr)

}
