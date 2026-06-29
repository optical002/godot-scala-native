package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventGesture`, extends `InputEventWithModifiers`. */
abstract class InputEventGesture extends InputEventWithModifiers {
  override def godotClassName: String = "InputEventGesture"

  /** InputEventGesture.set_position */
  final def setPosition(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventGesture", "set_position", 743155724L), hostObject.objectPtr, position)

  /** InputEventGesture.get_position */
  final def getPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("InputEventGesture", "get_position", 3341600327L), hostObject.objectPtr)

}
