package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventAction`, extends `InputEvent`. */
abstract class InputEventAction extends InputEvent {

  /** InputEventAction.set_action */
  final def setAction(action: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventAction", "set_action", 3304788590L), hostObject.objectPtr, action)

  /** InputEventAction.get_action */
  final def getAction(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("InputEventAction", "get_action", 2002593661L), hostObject.objectPtr)

  /** InputEventAction.set_pressed */
  final def setPressed(pressed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventAction", "set_pressed", 2586408642L), hostObject.objectPtr, pressed)

  /** InputEventAction.set_strength */
  final def setStrength(strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventAction", "set_strength", 373806689L), hostObject.objectPtr, strength)

  /** InputEventAction.get_strength */
  final def getStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("InputEventAction", "get_strength", 1740695150L), hostObject.objectPtr)

  /** InputEventAction.set_event_index */
  final def setEventIndex(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventAction", "set_event_index", 1286410249L), hostObject.objectPtr, index)

  /** InputEventAction.get_event_index */
  final def getEventIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventAction", "get_event_index", 3905245786L), hostObject.objectPtr)

}

object InputEventAction {
  /** Class metadata for Gd[InputEventAction] lifetime management and casting. */
  given GodotClass[InputEventAction] with {
    def className = "InputEventAction"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEventAction = new InputEventAction {}.withHost(o.objectPtr)
    def unwrap(t: InputEventAction): GodotObject = t.hostObject
  }
}
