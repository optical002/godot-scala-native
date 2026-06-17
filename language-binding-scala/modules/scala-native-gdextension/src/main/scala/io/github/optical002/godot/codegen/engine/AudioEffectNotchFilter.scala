package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectNotchFilter`, extends `AudioEffectFilter`. */
abstract class AudioEffectNotchFilter extends AudioEffectFilter {

}

object AudioEffectNotchFilter {
  /** Class metadata for Gd[AudioEffectNotchFilter] lifetime management and casting. */
  given GodotClass[AudioEffectNotchFilter] with {
    def className = "AudioEffectNotchFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectNotchFilter = new AudioEffectNotchFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectNotchFilter): GodotObject = t.hostObject
  }
}
