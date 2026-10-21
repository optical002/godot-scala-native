package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRHapticVibration`, extends `OpenXRHapticBase`. */
abstract class OpenXRHapticVibration extends OpenXRHapticBase {
  override def godotClassName: String = "OpenXRHapticVibration"

  /** OpenXRHapticVibration.set_duration */
  final def setDuration(duration: Long): Unit = {
    if (gdext.classes.OpenXRHapticVibration.mb_set_duration == null) gdext.classes.OpenXRHapticVibration.mb_set_duration = MethodBind.get("OpenXRHapticVibration", "set_duration", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OpenXRHapticVibration.mb_set_duration, livePtr, duration)
  }

  /** OpenXRHapticVibration.get_duration */
  final def getDuration(): Long = {
    if (gdext.classes.OpenXRHapticVibration.mb_get_duration == null) gdext.classes.OpenXRHapticVibration.mb_get_duration = MethodBind.get("OpenXRHapticVibration", "get_duration", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRHapticVibration.mb_get_duration, livePtr)
  }

  /** OpenXRHapticVibration.set_frequency */
  final def setFrequency(frequency: Double): Unit = {
    if (gdext.classes.OpenXRHapticVibration.mb_set_frequency == null) gdext.classes.OpenXRHapticVibration.mb_set_frequency = MethodBind.get("OpenXRHapticVibration", "set_frequency", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRHapticVibration.mb_set_frequency, livePtr, frequency)
  }

  /** OpenXRHapticVibration.get_frequency */
  final def getFrequency(): Double = {
    if (gdext.classes.OpenXRHapticVibration.mb_get_frequency == null) gdext.classes.OpenXRHapticVibration.mb_get_frequency = MethodBind.get("OpenXRHapticVibration", "get_frequency", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRHapticVibration.mb_get_frequency, livePtr)
  }

  /** OpenXRHapticVibration.set_amplitude */
  final def setAmplitude(amplitude: Double): Unit = {
    if (gdext.classes.OpenXRHapticVibration.mb_set_amplitude == null) gdext.classes.OpenXRHapticVibration.mb_set_amplitude = MethodBind.get("OpenXRHapticVibration", "set_amplitude", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRHapticVibration.mb_set_amplitude, livePtr, amplitude)
  }

  /** OpenXRHapticVibration.get_amplitude */
  final def getAmplitude(): Double = {
    if (gdext.classes.OpenXRHapticVibration.mb_get_amplitude == null) gdext.classes.OpenXRHapticVibration.mb_get_amplitude = MethodBind.get("OpenXRHapticVibration", "get_amplitude", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRHapticVibration.mb_get_amplitude, livePtr)
  }

}

object OpenXRHapticVibration {
  private[classes] var mb_set_duration: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_duration: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frequency: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frequency: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_amplitude: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_amplitude: GDExtensionMethodBindPtr = null
}
