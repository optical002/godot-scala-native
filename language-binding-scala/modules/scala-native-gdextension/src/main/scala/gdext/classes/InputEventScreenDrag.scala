package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventScreenDrag`, extends `InputEventFromWindow`. */
abstract class InputEventScreenDrag extends InputEventFromWindow {

  /** InputEventScreenDrag.set_index */
  final def setIndex(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenDrag", "set_index", 1286410249L), hostObject.objectPtr, index)

  /** InputEventScreenDrag.get_index */
  final def getIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventScreenDrag", "get_index", 3905245786L), hostObject.objectPtr)

  /** InputEventScreenDrag.set_tilt */
  final def setTilt(tilt: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenDrag", "set_tilt", 743155724L), hostObject.objectPtr, tilt)

  /** InputEventScreenDrag.get_tilt */
  final def getTilt(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("InputEventScreenDrag", "get_tilt", 3341600327L), hostObject.objectPtr)

  /** InputEventScreenDrag.set_pressure */
  final def setPressure(pressure: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenDrag", "set_pressure", 373806689L), hostObject.objectPtr, pressure)

  /** InputEventScreenDrag.get_pressure */
  final def getPressure(): Double =
    Ptrcall.call0[Double](MethodBind.get("InputEventScreenDrag", "get_pressure", 1740695150L), hostObject.objectPtr)

  /** InputEventScreenDrag.set_pen_inverted */
  final def setPenInverted(pen_inverted: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenDrag", "set_pen_inverted", 2586408642L), hostObject.objectPtr, pen_inverted)

  /** InputEventScreenDrag.get_pen_inverted */
  final def getPenInverted(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEventScreenDrag", "get_pen_inverted", 36873697L), hostObject.objectPtr)

  /** InputEventScreenDrag.set_position */
  final def setPosition(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenDrag", "set_position", 743155724L), hostObject.objectPtr, position)

  /** InputEventScreenDrag.get_position */
  final def getPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("InputEventScreenDrag", "get_position", 3341600327L), hostObject.objectPtr)

  /** InputEventScreenDrag.set_relative */
  final def setRelative(relative: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenDrag", "set_relative", 743155724L), hostObject.objectPtr, relative)

  /** InputEventScreenDrag.get_relative */
  final def getRelative(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("InputEventScreenDrag", "get_relative", 3341600327L), hostObject.objectPtr)

  /** InputEventScreenDrag.set_screen_relative */
  final def setScreenRelative(relative: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenDrag", "set_screen_relative", 743155724L), hostObject.objectPtr, relative)

  /** InputEventScreenDrag.get_screen_relative */
  final def getScreenRelative(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("InputEventScreenDrag", "get_screen_relative", 3341600327L), hostObject.objectPtr)

  /** InputEventScreenDrag.set_velocity */
  final def setVelocity(velocity: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenDrag", "set_velocity", 743155724L), hostObject.objectPtr, velocity)

  /** InputEventScreenDrag.get_velocity */
  final def getVelocity(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("InputEventScreenDrag", "get_velocity", 3341600327L), hostObject.objectPtr)

  /** InputEventScreenDrag.set_screen_velocity */
  final def setScreenVelocity(velocity: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventScreenDrag", "set_screen_velocity", 743155724L), hostObject.objectPtr, velocity)

  /** InputEventScreenDrag.get_screen_velocity */
  final def getScreenVelocity(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("InputEventScreenDrag", "get_screen_velocity", 3341600327L), hostObject.objectPtr)

}

object InputEventScreenDrag {
  /** Class metadata for Gd[InputEventScreenDrag] lifetime management and casting. */
  given GodotClass[InputEventScreenDrag] with {
    def className = "InputEventScreenDrag"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEventScreenDrag = new InputEventScreenDrag {}.withHost(o.objectPtr)
    def unwrap(t: InputEventScreenDrag): GodotObject = t.hostObject
  }
}
