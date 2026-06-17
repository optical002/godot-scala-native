package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectHighShelfFilter`, extends `AudioEffectFilter`. */
abstract class AudioEffectHighShelfFilter extends AudioEffectFilter {

}

object AudioEffectHighShelfFilter {
  /** Class metadata for Gd[AudioEffectHighShelfFilter] lifetime management and casting. */
  given GodotClass[AudioEffectHighShelfFilter] with {
    def className = "AudioEffectHighShelfFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectHighShelfFilter = new AudioEffectHighShelfFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectHighShelfFilter): GodotObject = t.hostObject
  }
}
