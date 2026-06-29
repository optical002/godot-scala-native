package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventMIDI`, extends `InputEvent`. */
abstract class InputEventMIDI extends InputEvent {
  override def godotClassName: String = "InputEventMIDI"

  /** InputEventMIDI.set_channel */
  final def setChannel(channel: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMIDI", "set_channel", 1286410249L), hostObject.objectPtr, channel)

  /** InputEventMIDI.get_channel */
  final def getChannel(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventMIDI", "get_channel", 3905245786L), hostObject.objectPtr)

  /** InputEventMIDI.set_message */
  final def setMessage(message: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMIDI", "set_message", 1064271510L), hostObject.objectPtr, message)

  /** InputEventMIDI.get_message */
  final def getMessage(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventMIDI", "get_message", 1936512097L), hostObject.objectPtr)

  /** InputEventMIDI.set_pitch */
  final def setPitch(pitch: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMIDI", "set_pitch", 1286410249L), hostObject.objectPtr, pitch)

  /** InputEventMIDI.get_pitch */
  final def getPitch(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventMIDI", "get_pitch", 3905245786L), hostObject.objectPtr)

  /** InputEventMIDI.set_velocity */
  final def setVelocity(velocity: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMIDI", "set_velocity", 1286410249L), hostObject.objectPtr, velocity)

  /** InputEventMIDI.get_velocity */
  final def getVelocity(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventMIDI", "get_velocity", 3905245786L), hostObject.objectPtr)

  /** InputEventMIDI.set_instrument */
  final def setInstrument(instrument: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMIDI", "set_instrument", 1286410249L), hostObject.objectPtr, instrument)

  /** InputEventMIDI.get_instrument */
  final def getInstrument(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventMIDI", "get_instrument", 3905245786L), hostObject.objectPtr)

  /** InputEventMIDI.set_pressure */
  final def setPressure(pressure: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMIDI", "set_pressure", 1286410249L), hostObject.objectPtr, pressure)

  /** InputEventMIDI.get_pressure */
  final def getPressure(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventMIDI", "get_pressure", 3905245786L), hostObject.objectPtr)

  /** InputEventMIDI.set_controller_number */
  final def setControllerNumber(controller_number: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMIDI", "set_controller_number", 1286410249L), hostObject.objectPtr, controller_number)

  /** InputEventMIDI.get_controller_number */
  final def getControllerNumber(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventMIDI", "get_controller_number", 3905245786L), hostObject.objectPtr)

  /** InputEventMIDI.set_controller_value */
  final def setControllerValue(controller_value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMIDI", "set_controller_value", 1286410249L), hostObject.objectPtr, controller_value)

  /** InputEventMIDI.get_controller_value */
  final def getControllerValue(): Long =
    Ptrcall.call0[Long](MethodBind.get("InputEventMIDI", "get_controller_value", 3905245786L), hostObject.objectPtr)

}
