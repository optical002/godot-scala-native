package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamPlaybackOggVorbis`, extends `AudioStreamPlaybackResampled`. */
abstract class AudioStreamPlaybackOggVorbis extends AudioStreamPlaybackResampled {

}

object AudioStreamPlaybackOggVorbis {
  /** Class metadata for Gd[AudioStreamPlaybackOggVorbis] lifetime management and casting. */
  given GodotClass[AudioStreamPlaybackOggVorbis] with {
    def className = "AudioStreamPlaybackOggVorbis"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamPlaybackOggVorbis = new AudioStreamPlaybackOggVorbis {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamPlaybackOggVorbis): GodotObject = t.hostObject
  }
}
