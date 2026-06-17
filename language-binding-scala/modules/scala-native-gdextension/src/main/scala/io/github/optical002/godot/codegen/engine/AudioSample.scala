package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioSample`, extends `RefCounted`. */
abstract class AudioSample extends RefCounted {

}

object AudioSample {
  /** Class metadata for Gd[AudioSample] lifetime management and casting. */
  given GodotClass[AudioSample] with {
    def className = "AudioSample"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioSample = new AudioSample {}.withHost(o.objectPtr)
    def unwrap(t: AudioSample): GodotObject = t.hostObject
  }
}
