package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectBandLimitFilter`, extends `AudioEffectFilter`. */
abstract class AudioEffectBandLimitFilter extends AudioEffectFilter {

}

object AudioEffectBandLimitFilter {
  /** Class metadata for Gd[AudioEffectBandLimitFilter] lifetime management and casting. */
  given GodotClass[AudioEffectBandLimitFilter] with {
    def className = "AudioEffectBandLimitFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectBandLimitFilter = new AudioEffectBandLimitFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectBandLimitFilter): GodotObject = t.hostObject
  }
}
