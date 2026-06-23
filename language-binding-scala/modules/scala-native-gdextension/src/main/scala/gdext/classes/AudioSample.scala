package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioSample`, extends `RefCounted`. */
abstract class AudioSample extends RefCounted {

}

object AudioSample {
  /** Class metadata for Gd[AudioSample] lifetime management and casting. */
  given GodotClass[AudioSample] with {
    def className = "AudioSample"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioSample = new AudioSample {}.withHost(o.objectPtr)
    def unwrap(t: AudioSample): GodotObject = t.hostObject
  }
}
