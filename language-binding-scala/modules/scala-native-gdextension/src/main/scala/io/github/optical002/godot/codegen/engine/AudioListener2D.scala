package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioListener2D`, extends `Node2D`. */
abstract class AudioListener2D extends Node2D {

  /** AudioListener2D.make_current */
  final def makeCurrent(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioListener2D", "make_current", 3218959716L), hostObject.objectPtr)

  /** AudioListener2D.clear_current */
  final def clearCurrent(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioListener2D", "clear_current", 3218959716L), hostObject.objectPtr)

  /** AudioListener2D.is_current */
  final def isCurrent(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioListener2D", "is_current", 36873697L), hostObject.objectPtr)

}

object AudioListener2D {
  /** Class metadata for Gd[AudioListener2D] lifetime management and casting. */
  given GodotClass[AudioListener2D] with {
    def className = "AudioListener2D"
    def isRefCounted = false
    def wrap(o: GodotObject): AudioListener2D = new AudioListener2D {}.withHost(o.objectPtr)
    def unwrap(t: AudioListener2D): GodotObject = t.hostObject
  }
}
