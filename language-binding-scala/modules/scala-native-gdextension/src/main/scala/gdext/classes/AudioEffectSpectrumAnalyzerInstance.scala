package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectSpectrumAnalyzerInstance`, extends `AudioEffectInstance`. */
abstract class AudioEffectSpectrumAnalyzerInstance extends AudioEffectInstance {
  override def godotClassName: String = "AudioEffectSpectrumAnalyzerInstance"

  /** AudioEffectSpectrumAnalyzerInstance.get_magnitude_for_frequency_range */
  final def getMagnitudeForFrequencyRange(from_hz: Double, to_hz: Double, mode: Long): gdext.builtin.Vector2 =
    Ptrcall.call3[Double, Double, Long, gdext.builtin.Vector2](MethodBind.get("AudioEffectSpectrumAnalyzerInstance", "get_magnitude_for_frequency_range", 797993915L), hostObject.objectPtr, from_hz, to_hz, mode)

}
