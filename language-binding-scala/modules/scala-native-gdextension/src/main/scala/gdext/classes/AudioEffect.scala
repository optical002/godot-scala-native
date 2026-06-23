package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffect`, extends `Resource`. */
abstract class AudioEffect extends Resource {

}

object AudioEffect {
  /** Class metadata for Gd[AudioEffect] lifetime management and casting. */
  given GodotClass[AudioEffect] with {
    def className = "AudioEffect"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffect = new AudioEffect {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffect): GodotObject = t.hostObject
  }
}
