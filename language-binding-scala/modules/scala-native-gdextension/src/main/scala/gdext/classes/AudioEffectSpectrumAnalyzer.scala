package gdext.classes

import gdext.Godot
import gdext.builtin.*
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
  final def setFftSize(size: Long): Unit = {
    if (gdext.classes.AudioEffectSpectrumAnalyzer.mb_set_fft_size == null) gdext.classes.AudioEffectSpectrumAnalyzer.mb_set_fft_size = MethodBind.get("AudioEffectSpectrumAnalyzer", "set_fft_size", 1202879215L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectSpectrumAnalyzer.mb_set_fft_size, livePtr, size)
  }

  /** AudioEffectSpectrumAnalyzer.get_fft_size */
  final def getFftSize(): Long = {
    if (gdext.classes.AudioEffectSpectrumAnalyzer.mb_get_fft_size == null) gdext.classes.AudioEffectSpectrumAnalyzer.mb_get_fft_size = MethodBind.get("AudioEffectSpectrumAnalyzer", "get_fft_size", 3925405343L)
    Ptrcall.call0[Long](gdext.classes.AudioEffectSpectrumAnalyzer.mb_get_fft_size, livePtr)
  }

}

object AudioEffectSpectrumAnalyzer {
  private[classes] var mb_set_buffer_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_buffer_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tap_back_pos: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tap_back_pos: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fft_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fft_size: GDExtensionMethodBindPtr = null
}
