package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectEQ21`, extends `AudioEffectEQ`. */
abstract class AudioEffectEQ21 extends AudioEffectEQ {

}

object AudioEffectEQ21 {
  /** Class metadata for Gd[AudioEffectEQ21] lifetime management and casting. */
  given GodotClass[AudioEffectEQ21] with {
    def className = "AudioEffectEQ21"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectEQ21 = new AudioEffectEQ21 {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectEQ21): GodotObject = t.hostObject
  }
}
