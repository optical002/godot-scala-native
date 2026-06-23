package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectHighPassFilter`, extends `AudioEffectFilter`. */
abstract class AudioEffectHighPassFilter extends AudioEffectFilter {

}

object AudioEffectHighPassFilter {
  /** Class metadata for Gd[AudioEffectHighPassFilter] lifetime management and casting. */
  given GodotClass[AudioEffectHighPassFilter] with {
    def className = "AudioEffectHighPassFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectHighPassFilter = new AudioEffectHighPassFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectHighPassFilter): GodotObject = t.hostObject
  }
}
