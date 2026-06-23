package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

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
