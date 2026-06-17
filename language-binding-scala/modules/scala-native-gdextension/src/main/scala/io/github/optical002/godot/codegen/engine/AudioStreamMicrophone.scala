package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamMicrophone`, extends `AudioStream`. */
abstract class AudioStreamMicrophone extends AudioStream {

}

object AudioStreamMicrophone {
  /** Class metadata for Gd[AudioStreamMicrophone] lifetime management and casting. */
  given GodotClass[AudioStreamMicrophone] with {
    def className = "AudioStreamMicrophone"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamMicrophone = new AudioStreamMicrophone {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamMicrophone): GodotObject = t.hostObject
  }
}
