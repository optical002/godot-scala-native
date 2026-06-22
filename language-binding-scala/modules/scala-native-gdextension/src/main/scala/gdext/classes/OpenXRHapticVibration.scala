package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRHapticVibration`, extends `OpenXRHapticBase`. */
abstract class OpenXRHapticVibration extends OpenXRHapticBase {

  /** OpenXRHapticVibration.set_duration */
  final def setDuration(duration: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRHapticVibration", "set_duration", 1286410249L), hostObject.objectPtr, duration)

  /** OpenXRHapticVibration.get_duration */
  final def getDuration(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRHapticVibration", "get_duration", 3905245786L), hostObject.objectPtr)

  /** OpenXRHapticVibration.set_frequency */
  final def setFrequency(frequency: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRHapticVibration", "set_frequency", 373806689L), hostObject.objectPtr, frequency)

  /** OpenXRHapticVibration.get_frequency */
  final def getFrequency(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRHapticVibration", "get_frequency", 1740695150L), hostObject.objectPtr)

  /** OpenXRHapticVibration.set_amplitude */
  final def setAmplitude(amplitude: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRHapticVibration", "set_amplitude", 373806689L), hostObject.objectPtr, amplitude)

  /** OpenXRHapticVibration.get_amplitude */
  final def getAmplitude(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRHapticVibration", "get_amplitude", 1740695150L), hostObject.objectPtr)

}

object OpenXRHapticVibration {
  /** Class metadata for Gd[OpenXRHapticVibration] lifetime management and casting. */
  given GodotClass[OpenXRHapticVibration] with {
    def className = "OpenXRHapticVibration"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRHapticVibration = new OpenXRHapticVibration {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRHapticVibration): GodotObject = t.hostObject
  }
}
