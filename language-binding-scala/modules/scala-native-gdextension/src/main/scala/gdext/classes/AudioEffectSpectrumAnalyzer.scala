package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectSpectrumAnalyzer`, extends `AudioEffect`. */
abstract class AudioEffectSpectrumAnalyzer extends AudioEffect {
  override def godotClassName: String = "AudioEffectSpectrumAnalyzer"

  /** AudioEffectSpectrumAnalyzer.set_buffer_length */
  final def setBufferLength(seconds: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectSpectrumAnalyzer", "set_buffer_length", 373806689L), hostObject.objectPtr, seconds)

  /** AudioEffectSpectrumAnalyzer.get_buffer_length */
  final def getBufferLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectSpectrumAnalyzer", "get_buffer_length", 1740695150L), hostObject.objectPtr)

  /** AudioEffectSpectrumAnalyzer.set_tap_back_pos */
  final def setTapBackPos(seconds: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectSpectrumAnalyzer", "set_tap_back_pos", 373806689L), hostObject.objectPtr, seconds)

  /** AudioEffectSpectrumAnalyzer.get_tap_back_pos */
  final def getTapBackPos(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectSpectrumAnalyzer", "get_tap_back_pos", 1740695150L), hostObject.objectPtr)

  /** AudioEffectSpectrumAnalyzer.set_fft_size */
  final def setFftSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectSpectrumAnalyzer", "set_fft_size", 1202879215L), hostObject.objectPtr, size)

  /** AudioEffectSpectrumAnalyzer.get_fft_size */
  final def getFftSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioEffectSpectrumAnalyzer", "get_fft_size", 3925405343L), hostObject.objectPtr)

}
