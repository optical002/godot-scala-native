package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectLowShelfFilter`, extends `AudioEffectFilter`. */
abstract class AudioEffectLowShelfFilter extends AudioEffectFilter {

}

object AudioEffectLowShelfFilter {
  /** Class metadata for Gd[AudioEffectLowShelfFilter] lifetime management and casting. */
  given GodotClass[AudioEffectLowShelfFilter] with {
    def className = "AudioEffectLowShelfFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectLowShelfFilter = new AudioEffectLowShelfFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectLowShelfFilter): GodotObject = t.hostObject
  }
}
