package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectBandPassFilter`, extends `AudioEffectFilter`. */
abstract class AudioEffectBandPassFilter extends AudioEffectFilter {

}

object AudioEffectBandPassFilter {
  /** Class metadata for Gd[AudioEffectBandPassFilter] lifetime management and casting. */
  given GodotClass[AudioEffectBandPassFilter] with {
    def className = "AudioEffectBandPassFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectBandPassFilter = new AudioEffectBandPassFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectBandPassFilter): GodotObject = t.hostObject
  }
}
