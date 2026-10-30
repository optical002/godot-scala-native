package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectSpectrumAnalyzer`, extends `AudioEffect`. */
abstract class AudioEffectSpectrumAnalyzer extends AudioEffect {
  override def godotClassName: String = "AudioEffectSpectrumAnalyzer"

  /** AudioEffectSpectrumAnalyzer.set_buffer_length */
  final def setBufferLength(seconds: Double): Unit = {
    if (gdext.classes.AudioEffectSpectrumAnalyzer.mb_set_buffer_length == null) gdext.classes.AudioEffectSpectrumAnalyzer.mb_set_buffer_length = MethodBind.get("AudioEffectSpectrumAnalyzer", "set_buffer_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectSpectrumAnalyzer.mb_set_buffer_length, livePtr, seconds)
  }

  /** AudioEffectSpectrumAnalyzer.get_buffer_length */
  final def getBufferLength(): Double = {
    if (gdext.classes.AudioEffectSpectrumAnalyzer.mb_get_buffer_length == null) gdext.classes.AudioEffectSpectrumAnalyzer.mb_get_buffer_length = MethodBind.get("AudioEffectSpectrumAnalyzer", "get_buffer_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectSpectrumAnalyzer.mb_get_buffer_length, livePtr)
  }

  /** AudioEffectSpectrumAnalyzer.set_tap_back_pos */
  final def setTapBackPos(seconds: Double): Unit = {
    if (gdext.classes.AudioEffectSpectrumAnalyzer.mb_set_tap_back_pos == null) gdext.classes.AudioEffectSpectrumAnalyzer.mb_set_tap_back_pos = MethodBind.get("AudioEffectSpectrumAnalyzer", "set_tap_back_pos", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectSpectrumAnalyzer.mb_set_tap_back_pos, livePtr, seconds)
  }

  /** AudioEffectSpectrumAnalyzer.get_tap_back_pos */
  final def getTapBackPos(): Double = {
    if (gdext.classes.AudioEffectSpectrumAnalyzer.mb_get_tap_back_pos == null) gdext.classes.AudioEffectSpectrumAnalyzer.mb_get_tap_back_pos = MethodBind.get("AudioEffectSpectrumAnalyzer", "get_tap_back_pos", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectSpectrumAnalyzer.mb_get_tap_back_pos, livePtr)
  }

  /** AudioEffectSpectrumAnalyzer.set_fft_size */
  final def setFftSize(size: gdext.classes.AudioEffectSpectrumAnalyzer.FFTSize): Unit = {
    if (gdext.classes.AudioEffectSpectrumAnalyzer.mb_set_fft_size == null) gdext.classes.AudioEffectSpectrumAnalyzer.mb_set_fft_size = MethodBind.get("AudioEffectSpectrumAnalyzer", "set_fft_size", 1202879215L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectSpectrumAnalyzer.mb_set_fft_size, livePtr, size)
  }

  /** AudioEffectSpectrumAnalyzer.get_fft_size */
  final def getFftSize(): gdext.classes.AudioEffectSpectrumAnalyzer.FFTSize = {
    if (gdext.classes.AudioEffectSpectrumAnalyzer.mb_get_fft_size == null) gdext.classes.AudioEffectSpectrumAnalyzer.mb_get_fft_size = MethodBind.get("AudioEffectSpectrumAnalyzer", "get_fft_size", 3925405343L)
    gdext.classes.AudioEffectSpectrumAnalyzer.FFTSize(Ptrcall.call0[Long](gdext.classes.AudioEffectSpectrumAnalyzer.mb_get_fft_size, livePtr))
  }

}

object AudioEffectSpectrumAnalyzer {
  private[classes] var mb_set_buffer_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_buffer_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tap_back_pos: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tap_back_pos: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fft_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fft_size: GDExtensionMethodBindPtr = null

  /** Godot enum `AudioEffectSpectrumAnalyzer.FFTSize`. */
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
