package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectSpectrumAnalyzerInstance`, extends `AudioEffectInstance`. */
abstract class AudioEffectSpectrumAnalyzerInstance extends AudioEffectInstance {
  override def godotClassName: String = "AudioEffectSpectrumAnalyzerInstance"

  /** AudioEffectSpectrumAnalyzerInstance.get_magnitude_for_frequency_range */
  final def getMagnitudeForFrequencyRange(from_hz: Double, to_hz: Double, mode: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.AudioEffectSpectrumAnalyzerInstance.mb_get_magnitude_for_frequency_range == null) gdext.classes.AudioEffectSpectrumAnalyzerInstance.mb_get_magnitude_for_frequency_range = MethodBind.get("AudioEffectSpectrumAnalyzerInstance", "get_magnitude_for_frequency_range", 797993915L)
    Ptrcall.call3[Double, Double, Long, gdext.builtin.Vector2](gdext.classes.AudioEffectSpectrumAnalyzerInstance.mb_get_magnitude_for_frequency_range, livePtr, from_hz, to_hz, mode)
  }

}

object AudioEffectSpectrumAnalyzerInstance {
  private[classes] var mb_get_magnitude_for_frequency_range: GDExtensionMethodBindPtr = null
}
