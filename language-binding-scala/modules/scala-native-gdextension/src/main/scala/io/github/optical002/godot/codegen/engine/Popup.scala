package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Popup`, extends `Window`. */
abstract class Popup extends Window {

}

object Popup {
  /** Class metadata for Gd[Popup] lifetime management and casting. */
  given GodotClass[Popup] with {
    def className = "Popup"
    def isRefCounted = false
    def wrap(o: GodotObject): Popup = new Popup {}.withHost(o.objectPtr)
    def unwrap(t: Popup): GodotObject = t.hostObject
  }
}
