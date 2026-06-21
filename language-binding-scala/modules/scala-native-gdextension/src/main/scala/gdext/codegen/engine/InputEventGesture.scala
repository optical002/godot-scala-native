package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventGesture`, extends `InputEventWithModifiers`. */
abstract class InputEventGesture extends InputEventWithModifiers {

  /** InputEventGesture.set_position */
  final def setPosition(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventGesture", "set_position", 743155724L), hostObject.objectPtr, position)

  /** InputEventGesture.get_position */
  final def getPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("InputEventGesture", "get_position", 3341600327L), hostObject.objectPtr)

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
