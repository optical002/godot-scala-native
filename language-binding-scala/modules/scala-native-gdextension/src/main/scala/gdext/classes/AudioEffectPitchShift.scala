package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def setFftSize(size: gdext.classes.AudioEffectPitchShift.FFTSize): Unit = {
    if (gdext.classes.AudioEffectPitchShift.mb_set_fft_size == null) gdext.classes.AudioEffectPitchShift.mb_set_fft_size = MethodBind.get("AudioEffectPitchShift", "set_fft_size", 2323518741L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectPitchShift.mb_set_fft_size, livePtr, size)
  }

  /** AudioEffectPitchShift.get_fft_size */
  final def getFftSize(): gdext.classes.AudioEffectPitchShift.FFTSize = {
    if (gdext.classes.AudioEffectPitchShift.mb_get_fft_size == null) gdext.classes.AudioEffectPitchShift.mb_get_fft_size = MethodBind.get("AudioEffectPitchShift", "get_fft_size", 2361246789L)
    gdext.classes.AudioEffectPitchShift.FFTSize(Ptrcall.call0[Long](gdext.classes.AudioEffectPitchShift.mb_get_fft_size, livePtr))
  }

}

object AudioEffectPitchShift {
  private[classes] var mb_set_pitch_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pitch_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fft_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fft_size: GDExtensionMethodBindPtr = null

  /** Godot enum `AudioEffectPitchShift.FFTSize`. */
  opaque type FFTSize <: Long = Long

  object FFTSize {
    final val Size256: FFTSize = 0L.asInstanceOf[FFTSize]
    final val Size512: FFTSize = 1L.asInstanceOf[FFTSize]
    final val Size1024: FFTSize = 2L.asInstanceOf[FFTSize]
    final val Size2048: FFTSize = 3L.asInstanceOf[FFTSize]
    final val Size4096: FFTSize = 4L.asInstanceOf[FFTSize]
    final val Max: FFTSize = 5L.asInstanceOf[FFTSize]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FFTSize = value.asInstanceOf[FFTSize]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FFTSize] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[FFTSize]]

    extension (self: FFTSize)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Size256"
        case 1L => "Size512"
        case 2L => "Size1024"
        case 3L => "Size2048"
        case 4L => "Size4096"
        case 5L => "Max"
        case other => other.toString
      }
  }
}
