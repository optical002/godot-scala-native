package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventMIDI`, extends `InputEvent`. */
abstract class InputEventMIDI extends InputEvent {
  override def godotClassName: String = "InputEventMIDI"

  /** InputEventMIDI.set_channel */
  final def setChannel(channel: Long): Unit = {
    if (gdext.classes.InputEventMIDI.mb_set_channel == null) gdext.classes.InputEventMIDI.mb_set_channel = MethodBind.get("InputEventMIDI", "set_channel", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.InputEventMIDI.mb_set_channel, livePtr, channel)
  }

  /** InputEventMIDI.get_channel */
  final def getChannel(): Long = {
    if (gdext.classes.InputEventMIDI.mb_get_channel == null) gdext.classes.InputEventMIDI.mb_get_channel = MethodBind.get("InputEventMIDI", "get_channel", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.InputEventMIDI.mb_get_channel, livePtr)
  }

  /** InputEventMIDI.set_message */
  final def setMessage(message: Long): Unit = {
    if (gdext.classes.InputEventMIDI.mb_set_message == null) gdext.classes.InputEventMIDI.mb_set_message = MethodBind.get("InputEventMIDI", "set_message", 1064271510L)
    Ptrcall.callVoid1(gdext.classes.InputEventMIDI.mb_set_message, livePtr, message)
  }

  /** InputEventMIDI.get_message */
  final def getMessage(): Long = {
    if (gdext.classes.InputEventMIDI.mb_get_message == null) gdext.classes.InputEventMIDI.mb_get_message = MethodBind.get("InputEventMIDI", "get_message", 1936512097L)
    Ptrcall.call0[Long](gdext.classes.InputEventMIDI.mb_get_message, livePtr)
  }

  /** InputEventMIDI.set_pitch */
  final def setPitch(pitch: Long): Unit = {
    if (gdext.classes.InputEventMIDI.mb_set_pitch == null) gdext.classes.InputEventMIDI.mb_set_pitch = MethodBind.get("InputEventMIDI", "set_pitch", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.InputEventMIDI.mb_set_pitch, livePtr, pitch)
  }

  /** InputEventMIDI.get_pitch */
  final def getPitch(): Long = {
    if (gdext.classes.InputEventMIDI.mb_get_pitch == null) gdext.classes.InputEventMIDI.mb_get_pitch = MethodBind.get("InputEventMIDI", "get_pitch", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.InputEventMIDI.mb_get_pitch, livePtr)
  }

  /** InputEventMIDI.set_velocity */
  final def setVelocity(velocity: Long): Unit = {
    if (gdext.classes.InputEventMIDI.mb_set_velocity == null) gdext.classes.InputEventMIDI.mb_set_velocity = MethodBind.get("InputEventMIDI", "set_velocity", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.InputEventMIDI.mb_set_velocity, livePtr, velocity)
  }

  /** InputEventMIDI.get_velocity */
  final def getVelocity(): Long = {
    if (gdext.classes.InputEventMIDI.mb_get_velocity == null) gdext.classes.InputEventMIDI.mb_get_velocity = MethodBind.get("InputEventMIDI", "get_velocity", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.InputEventMIDI.mb_get_velocity, livePtr)
  }

  /** InputEventMIDI.set_instrument */
  final def setInstrument(instrument: Long): Unit = {
    if (gdext.classes.InputEventMIDI.mb_set_instrument == null) gdext.classes.InputEventMIDI.mb_set_instrument = MethodBind.get("InputEventMIDI", "set_instrument", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.InputEventMIDI.mb_set_instrument, livePtr, instrument)
  }

  /** InputEventMIDI.get_instrument */
  final def getInstrument(): Long = {
    if (gdext.classes.InputEventMIDI.mb_get_instrument == null) gdext.classes.InputEventMIDI.mb_get_instrument = MethodBind.get("InputEventMIDI", "get_instrument", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.InputEventMIDI.mb_get_instrument, livePtr)
  }

  /** InputEventMIDI.set_pressure */
  final def setPressure(pressure: Long): Unit = {
    if (gdext.classes.InputEventMIDI.mb_set_pressure == null) gdext.classes.InputEventMIDI.mb_set_pressure = MethodBind.get("InputEventMIDI", "set_pressure", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.InputEventMIDI.mb_set_pressure, livePtr, pressure)
  }

  /** InputEventMIDI.get_pressure */
  final def getPressure(): Long = {
    if (gdext.classes.InputEventMIDI.mb_get_pressure == null) gdext.classes.InputEventMIDI.mb_get_pressure = MethodBind.get("InputEventMIDI", "get_pressure", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.InputEventMIDI.mb_get_pressure, livePtr)
  }

  /** InputEventMIDI.set_controller_number */
  final def setControllerNumber(controller_number: Long): Unit = {
    if (gdext.classes.InputEventMIDI.mb_set_controller_number == null) gdext.classes.InputEventMIDI.mb_set_controller_number = MethodBind.get("InputEventMIDI", "set_controller_number", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.InputEventMIDI.mb_set_controller_number, livePtr, controller_number)
  }

  /** InputEventMIDI.get_controller_number */
  final def getControllerNumber(): Long = {
    if (gdext.classes.InputEventMIDI.mb_get_controller_number == null) gdext.classes.InputEventMIDI.mb_get_controller_number = MethodBind.get("InputEventMIDI", "get_controller_number", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.InputEventMIDI.mb_get_controller_number, livePtr)
  }

  /** InputEventMIDI.set_controller_value */
  final def setControllerValue(controller_value: Long): Unit = {
    if (gdext.classes.InputEventMIDI.mb_set_controller_value == null) gdext.classes.InputEventMIDI.mb_set_controller_value = MethodBind.get("InputEventMIDI", "set_controller_value", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.InputEventMIDI.mb_set_controller_value, livePtr, controller_value)
  }

  /** InputEventMIDI.get_controller_value */
  final def getControllerValue(): Long = {
    if (gdext.classes.InputEventMIDI.mb_get_controller_value == null) gdext.classes.InputEventMIDI.mb_get_controller_value = MethodBind.get("InputEventMIDI", "get_controller_value", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.InputEventMIDI.mb_get_controller_value, livePtr)
  }

}

object InputEventMIDI {
  private[classes] var mb_set_channel: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_channel: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_message: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_message: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pitch: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pitch: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_instrument: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_instrument: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pressure: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pressure: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_controller_number: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_controller_number: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_controller_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_controller_value: GDExtensionMethodBindPtr = null
}
