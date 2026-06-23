package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

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
