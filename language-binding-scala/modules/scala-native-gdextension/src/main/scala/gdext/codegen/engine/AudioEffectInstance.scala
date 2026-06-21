package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectInstance`, extends `RefCounted`. */
abstract class AudioEffectInstance extends RefCounted {

}

object AudioEffectInstance {
  /** Class metadata for Gd[AudioEffectInstance] lifetime management and casting. */
  given GodotClass[AudioEffectInstance] with {
    def className = "AudioEffectInstance"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectInstance = new AudioEffectInstance {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectInstance): GodotObject = t.hostObject
  }
}
