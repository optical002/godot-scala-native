package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectSpectrumAnalyzerInstance`, extends `AudioEffectInstance`. */
abstract class AudioEffectSpectrumAnalyzerInstance extends AudioEffectInstance {

  /** AudioEffectSpectrumAnalyzerInstance.get_magnitude_for_frequency_range */
  final def getMagnitudeForFrequencyRange(from_hz: Double, to_hz: Double, mode: Long): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call3[Double, Double, Long, io.github.optical002.godot.builtin.Vector2](MethodBind.get("AudioEffectSpectrumAnalyzerInstance", "get_magnitude_for_frequency_range", 797993915L), hostObject.objectPtr, from_hz, to_hz, mode)

}

object AudioEffectSpectrumAnalyzerInstance {
  /** Class metadata for Gd[AudioEffectSpectrumAnalyzerInstance] lifetime management and casting. */
  given GodotClass[AudioEffectSpectrumAnalyzerInstance] with {
    def className = "AudioEffectSpectrumAnalyzerInstance"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectSpectrumAnalyzerInstance = new AudioEffectSpectrumAnalyzerInstance {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectSpectrumAnalyzerInstance): GodotObject = t.hostObject
  }
}
