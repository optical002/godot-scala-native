package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectHighShelfFilter`, extends `AudioEffectFilter`. */
abstract class AudioEffectHighShelfFilter extends AudioEffectFilter {

}

object AudioEffectHighShelfFilter {
  /** Class metadata for Gd[AudioEffectHighShelfFilter] lifetime management and casting. */
  given GodotClass[AudioEffectHighShelfFilter] with {
    def className = "AudioEffectHighShelfFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectHighShelfFilter = new AudioEffectHighShelfFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectHighShelfFilter): GodotObject = t.hostObject
  }
}
