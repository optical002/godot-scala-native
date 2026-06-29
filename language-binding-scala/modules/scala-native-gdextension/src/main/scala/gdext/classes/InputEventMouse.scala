package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventMouse`, extends `InputEventWithModifiers`. */
abstract class InputEventMouse extends InputEventWithModifiers {
  override def godotClassName: String = "InputEventMouse"

  /** InputEventMouse.set_button_mask */
  final def setButtonMask(button_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouse", "set_button_mask", 3950145251L), hostObject.objectPtr, button_mask)

  /** InputEventMouse.get_button_mask */
  final def getButtonMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventMouse", "get_button_mask", 2512161324L), hostObject.objectPtr)

  /** InputEventMouse.set_position */
  final def setPosition(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouse", "set_position", 743155724L), hostObject.objectPtr, position)

  /** InputEventMouse.get_position */
  final def getPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("InputEventMouse", "get_position", 3341600327L), hostObject.objectPtr)

  /** InputEventMouse.set_global_position */
  final def setGlobalPosition(global_position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouse", "set_global_position", 743155724L), hostObject.objectPtr, global_position)

  /** InputEventMouse.get_global_position */
  final def getGlobalPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("InputEventMouse", "get_global_position", 3341600327L), hostObject.objectPtr)

}
