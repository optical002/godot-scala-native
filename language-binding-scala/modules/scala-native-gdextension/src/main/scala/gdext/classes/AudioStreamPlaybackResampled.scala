package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

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
