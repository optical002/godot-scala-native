package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectNotchFilter`, extends `AudioEffectFilter`. */
abstract class AudioEffectNotchFilter extends AudioEffectFilter {

}

object AudioEffectNotchFilter {
  /** Class metadata for Gd[AudioEffectNotchFilter] lifetime management and casting. */
  given GodotClass[AudioEffectNotchFilter] with {
    def className = "AudioEffectNotchFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectNotchFilter = new AudioEffectNotchFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectNotchFilter): GodotObject = t.hostObject
  }
}
