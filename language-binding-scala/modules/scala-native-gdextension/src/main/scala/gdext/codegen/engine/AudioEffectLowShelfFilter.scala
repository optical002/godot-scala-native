package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectLowShelfFilter`, extends `AudioEffectFilter`. */
abstract class AudioEffectLowShelfFilter extends AudioEffectFilter {

}

object AudioEffectLowShelfFilter {
  /** Class metadata for Gd[AudioEffectLowShelfFilter] lifetime management and casting. */
  given GodotClass[AudioEffectLowShelfFilter] with {
    def className = "AudioEffectLowShelfFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectLowShelfFilter = new AudioEffectLowShelfFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectLowShelfFilter): GodotObject = t.hostObject
  }
}
