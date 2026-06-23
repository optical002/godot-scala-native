package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventScreenTouch`, extends `InputEventFromWindow`. */
abstract class InputEventScreenTouch extends InputEventFromWindow {

  /** InputEventScreenTouch.set_index */
  final def setIndex(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenTouch", "set_index", 1286410249L), hostObject.objectPtr, index)

  /** InputEventScreenTouch.get_index */
  final def getIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventScreenTouch", "get_index", 3905245786L), hostObject.objectPtr)

  /** InputEventScreenTouch.set_position */
  final def setPosition(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenTouch", "set_position", 743155724L), hostObject.objectPtr, position)

  /** InputEventScreenTouch.get_position */
  final def getPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("InputEventScreenTouch", "get_position", 3341600327L), hostObject.objectPtr)

  /** InputEventScreenTouch.set_pressed */
  final def setPressed(pressed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenTouch", "set_pressed", 2586408642L), hostObject.objectPtr, pressed)

  /** InputEventScreenTouch.set_canceled */
  final def setCanceled(canceled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenTouch", "set_canceled", 2586408642L), hostObject.objectPtr, canceled)

  /** InputEventScreenTouch.set_double_tap */
  final def setDoubleTap(double_tap: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenTouch", "set_double_tap", 2586408642L), hostObject.objectPtr, double_tap)

  /** InputEventScreenTouch.is_double_tap */
  final def isDoubleTap(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEventScreenTouch", "is_double_tap", 36873697L), hostObject.objectPtr)

}

object InputEventScreenTouch {
  /** Class metadata for Gd[InputEventScreenTouch] lifetime management and casting. */
  given GodotClass[InputEventScreenTouch] with {
    def className = "InputEventScreenTouch"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEventScreenTouch = new InputEventScreenTouch {}.withHost(o.objectPtr)
    def unwrap(t: InputEventScreenTouch): GodotObject = t.hostObject
  }
}
