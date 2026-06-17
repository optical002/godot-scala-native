package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectEQ6`, extends `AudioEffectEQ`. */
abstract class AudioEffectEQ6 extends AudioEffectEQ {

}

object AudioEffectEQ6 {
  /** Class metadata for Gd[AudioEffectEQ6] lifetime management and casting. */
  given GodotClass[AudioEffectEQ6] with {
    def className = "AudioEffectEQ6"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectEQ6 = new AudioEffectEQ6 {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectEQ6): GodotObject = t.hostObject
  }
}
