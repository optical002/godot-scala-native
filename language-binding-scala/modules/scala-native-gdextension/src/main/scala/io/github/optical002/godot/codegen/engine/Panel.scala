package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Panel`, extends `Control`. */
abstract class Panel extends Control {

}

object Panel {
  /** Class metadata for Gd[Panel] lifetime management and casting. */
  given GodotClass[Panel] with {
    def className = "Panel"
    def isRefCounted = false
    def wrap(o: GodotObject): Panel = new Panel {}.withHost(o.objectPtr)
    def unwrap(t: Panel): GodotObject = t.hostObject
  }
}
