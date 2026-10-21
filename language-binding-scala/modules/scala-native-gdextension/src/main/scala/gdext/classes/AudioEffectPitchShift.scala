package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectPitchShift`, extends `AudioEffect`. */
abstract class AudioEffectPitchShift extends AudioEffect {
  override def godotClassName: String = "AudioEffectPitchShift"

  /** AudioEffectPitchShift.set_pitch_scale */
  final def setPitchScale(rate: Double): Unit = {
    if (gdext.classes.AudioEffectPitchShift.mb_set_pitch_scale == null) gdext.classes.AudioEffectPitchShift.mb_set_pitch_scale = MethodBind.get("AudioEffectPitchShift", "set_pitch_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectPitchShift.mb_set_pitch_scale, livePtr, rate)
  }

  /** AudioEffectPitchShift.get_pitch_scale */
  final def getPitchScale(): Double = {
    if (gdext.classes.AudioEffectPitchShift.mb_get_pitch_scale == null) gdext.classes.AudioEffectPitchShift.mb_get_pitch_scale = MethodBind.get("AudioEffectPitchShift", "get_pitch_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectPitchShift.mb_get_pitch_scale, livePtr)
  }

  /** AudioEffectPitchShift.set_oversampling */
  final def setOversampling(amount: Long): Unit = {
    if (gdext.classes.AudioEffectPitchShift.mb_set_oversampling == null) gdext.classes.AudioEffectPitchShift.mb_set_oversampling = MethodBind.get("AudioEffectPitchShift", "set_oversampling", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectPitchShift.mb_set_oversampling, livePtr, amount)
  }

  /** AudioEffectPitchShift.get_oversampling */
  final def getOversampling(): Long = {
    if (gdext.classes.AudioEffectPitchShift.mb_get_oversampling == null) gdext.classes.AudioEffectPitchShift.mb_get_oversampling = MethodBind.get("AudioEffectPitchShift", "get_oversampling", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioEffectPitchShift.mb_get_oversampling, livePtr)
  }

  /** AudioEffectPitchShift.set_fft_size */
  final def setFftSize(size: Long): Unit = {
    if (gdext.classes.AudioEffectPitchShift.mb_set_fft_size == null) gdext.classes.AudioEffectPitchShift.mb_set_fft_size = MethodBind.get("AudioEffectPitchShift", "set_fft_size", 2323518741L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectPitchShift.mb_set_fft_size, livePtr, size)
  }

  /** AudioEffectPitchShift.get_fft_size */
  final def getFftSize(): Long = {
    if (gdext.classes.AudioEffectPitchShift.mb_get_fft_size == null) gdext.classes.AudioEffectPitchShift.mb_get_fft_size = MethodBind.get("AudioEffectPitchShift", "get_fft_size", 2361246789L)
    Ptrcall.call0[Long](gdext.classes.AudioEffectPitchShift.mb_get_fft_size, livePtr)
  }

}

object AudioEffectPitchShift {
  private[classes] var mb_set_pitch_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pitch_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fft_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fft_size: GDExtensionMethodBindPtr = null
}
