package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectBandPassFilter`, extends `AudioEffectFilter`. */
abstract class AudioEffectBandPassFilter extends AudioEffectFilter {

}

object AudioEffectBandPassFilter {
  /** Class metadata for Gd[AudioEffectBandPassFilter] lifetime management and casting. */
  given GodotClass[AudioEffectBandPassFilter] with {
    def className = "AudioEffectBandPassFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectBandPassFilter = new AudioEffectBandPassFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectBandPassFilter): GodotObject = t.hostObject
  }
}
