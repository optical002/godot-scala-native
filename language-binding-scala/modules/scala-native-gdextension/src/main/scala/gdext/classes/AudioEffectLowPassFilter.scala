package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectLowPassFilter`, extends `AudioEffectFilter`. */
abstract class AudioEffectLowPassFilter extends AudioEffectFilter {

}

object AudioEffectLowPassFilter {
  /** Class metadata for Gd[AudioEffectLowPassFilter] lifetime management and casting. */
  given GodotClass[AudioEffectLowPassFilter] with {
    def className = "AudioEffectLowPassFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectLowPassFilter = new AudioEffectLowPassFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectLowPassFilter): GodotObject = t.hostObject
  }
}
