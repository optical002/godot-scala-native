package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectHighPassFilter`, extends `AudioEffectFilter`. */
abstract class AudioEffectHighPassFilter extends AudioEffectFilter {

}

object AudioEffectHighPassFilter {
  /** Class metadata for Gd[AudioEffectHighPassFilter] lifetime management and casting. */
  given GodotClass[AudioEffectHighPassFilter] with {
    def className = "AudioEffectHighPassFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectHighPassFilter = new AudioEffectHighPassFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectHighPassFilter): GodotObject = t.hostObject
  }
}
