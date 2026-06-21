package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
