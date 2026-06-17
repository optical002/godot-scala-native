package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectPanner`, extends `AudioEffect`. */
abstract class AudioEffectPanner extends AudioEffect {

  /** AudioEffectPanner.set_pan */
  final def setPan(cpanume: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectPanner", "set_pan", 373806689L), hostObject.objectPtr, cpanume)

  /** AudioEffectPanner.get_pan */
  final def getPan(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectPanner", "get_pan", 1740695150L), hostObject.objectPtr)

}

object AudioEffectPanner {
  /** Class metadata for Gd[AudioEffectPanner] lifetime management and casting. */
  given GodotClass[AudioEffectPanner] with {
    def className = "AudioEffectPanner"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectPanner = new AudioEffectPanner {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectPanner): GodotObject = t.hostObject
  }
}
