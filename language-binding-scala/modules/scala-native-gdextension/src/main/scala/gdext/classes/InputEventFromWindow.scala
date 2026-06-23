package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventFromWindow`, extends `InputEvent`. */
abstract class InputEventFromWindow extends InputEvent {

  /** InputEventFromWindow.set_window_id */
  final def setWindowId(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventFromWindow", "set_window_id", 1286410249L), hostObject.objectPtr, id)

  /** InputEventFromWindow.get_window_id */
  final def getWindowId(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventFromWindow", "get_window_id", 3905245786L), hostObject.objectPtr)

}

object InputEventFromWindow {
  /** Class metadata for Gd[InputEventFromWindow] lifetime management and casting. */
  given GodotClass[InputEventFromWindow] with {
    def className = "InputEventFromWindow"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEventFromWindow = new InputEventFromWindow {}.withHost(o.objectPtr)
    def unwrap(t: InputEventFromWindow): GodotObject = t.hostObject
  }
}
