package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectBandLimitFilter`, extends `AudioEffectFilter`. */
abstract class AudioEffectBandLimitFilter extends AudioEffectFilter {

}

object AudioEffectBandLimitFilter {
  /** Class metadata for Gd[AudioEffectBandLimitFilter] lifetime management and casting. */
  given GodotClass[AudioEffectBandLimitFilter] with {
    def className = "AudioEffectBandLimitFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectBandLimitFilter = new AudioEffectBandLimitFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectBandLimitFilter): GodotObject = t.hostObject
  }
}
