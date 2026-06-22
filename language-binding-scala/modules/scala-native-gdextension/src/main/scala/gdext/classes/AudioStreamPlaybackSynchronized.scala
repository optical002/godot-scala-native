package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
