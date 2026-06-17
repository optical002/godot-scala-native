package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioBusLayout`, extends `Resource`. */
abstract class AudioBusLayout extends Resource {

}

object AudioBusLayout {
  /** Class metadata for Gd[AudioBusLayout] lifetime management and casting. */
  given GodotClass[AudioBusLayout] with {
    def className = "AudioBusLayout"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioBusLayout = new AudioBusLayout {}.withHost(o.objectPtr)
    def unwrap(t: AudioBusLayout): GodotObject = t.hostObject
  }
}
