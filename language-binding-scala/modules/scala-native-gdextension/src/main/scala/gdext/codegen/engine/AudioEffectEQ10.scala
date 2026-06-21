package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectEQ10`, extends `AudioEffectEQ`. */
abstract class AudioEffectEQ10 extends AudioEffectEQ {

}

object AudioEffectEQ10 {
  /** Class metadata for Gd[AudioEffectEQ10] lifetime management and casting. */
  given GodotClass[AudioEffectEQ10] with {
    def className = "AudioEffectEQ10"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectEQ10 = new AudioEffectEQ10 {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectEQ10): GodotObject = t.hostObject
  }
}
