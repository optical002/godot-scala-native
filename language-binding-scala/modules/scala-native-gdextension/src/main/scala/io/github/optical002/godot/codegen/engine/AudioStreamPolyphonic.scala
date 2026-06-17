package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamPolyphonic`, extends `AudioStream`. */
abstract class AudioStreamPolyphonic extends AudioStream {

  /** AudioStreamPolyphonic.set_polyphony */
  final def setPolyphony(voices: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPolyphonic", "set_polyphony", 1286410249L), hostObject.objectPtr, voices)

  /** AudioStreamPolyphonic.get_polyphony */
  final def getPolyphony(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamPolyphonic", "get_polyphony", 3905245786L), hostObject.objectPtr)

}

object AudioStreamPolyphonic {
  /** Class metadata for Gd[AudioStreamPolyphonic] lifetime management and casting. */
  given GodotClass[AudioStreamPolyphonic] with {
    def className = "AudioStreamPolyphonic"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamPolyphonic = new AudioStreamPolyphonic {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamPolyphonic): GodotObject = t.hostObject
  }
}
