package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamPlaybackSynchronized`, extends `AudioStreamPlayback`. */
abstract class AudioStreamPlaybackSynchronized extends AudioStreamPlayback {

}

object AudioStreamPlaybackSynchronized {
  /** Class metadata for Gd[AudioStreamPlaybackSynchronized] lifetime management and casting. */
  given GodotClass[AudioStreamPlaybackSynchronized] with {
    def className = "AudioStreamPlaybackSynchronized"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamPlaybackSynchronized = new AudioStreamPlaybackSynchronized {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamPlaybackSynchronized): GodotObject = t.hostObject
  }
}
