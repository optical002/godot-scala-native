package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamPlaybackResampled`, extends `AudioStreamPlayback`. */
abstract class AudioStreamPlaybackResampled extends AudioStreamPlayback {

  /** AudioStreamPlaybackResampled.begin_resample */
  final def beginResample(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioStreamPlaybackResampled", "begin_resample", 3218959716L), hostObject.objectPtr)

}

object AudioStreamPlaybackResampled {
  /** Class metadata for Gd[AudioStreamPlaybackResampled] lifetime management and casting. */
  given GodotClass[AudioStreamPlaybackResampled] with {
    def className = "AudioStreamPlaybackResampled"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamPlaybackResampled = new AudioStreamPlaybackResampled {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamPlaybackResampled): GodotObject = t.hostObject
  }
}
