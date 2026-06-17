package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioSamplePlayback`, extends `RefCounted`. */
abstract class AudioSamplePlayback extends RefCounted {

}

object AudioSamplePlayback {
  /** Class metadata for Gd[AudioSamplePlayback] lifetime management and casting. */
  given GodotClass[AudioSamplePlayback] with {
    def className = "AudioSamplePlayback"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioSamplePlayback = new AudioSamplePlayback {}.withHost(o.objectPtr)
    def unwrap(t: AudioSamplePlayback): GodotObject = t.hostObject
  }
}
