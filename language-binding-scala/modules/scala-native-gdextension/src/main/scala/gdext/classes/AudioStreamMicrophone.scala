package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamMicrophone`, extends `AudioStream`. */
abstract class AudioStreamMicrophone extends AudioStream {

}

object AudioStreamMicrophone {
  /** Class metadata for Gd[AudioStreamMicrophone] lifetime management and casting. */
  given GodotClass[AudioStreamMicrophone] with {
    def className = "AudioStreamMicrophone"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamMicrophone = new AudioStreamMicrophone {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamMicrophone): GodotObject = t.hostObject
  }
}
