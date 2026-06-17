package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamPlaybackPlaylist`, extends `AudioStreamPlayback`. */
abstract class AudioStreamPlaybackPlaylist extends AudioStreamPlayback {

}

object AudioStreamPlaybackPlaylist {
  /** Class metadata for Gd[AudioStreamPlaybackPlaylist] lifetime management and casting. */
  given GodotClass[AudioStreamPlaybackPlaylist] with {
    def className = "AudioStreamPlaybackPlaylist"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamPlaybackPlaylist = new AudioStreamPlaybackPlaylist {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamPlaybackPlaylist): GodotObject = t.hostObject
  }
}
