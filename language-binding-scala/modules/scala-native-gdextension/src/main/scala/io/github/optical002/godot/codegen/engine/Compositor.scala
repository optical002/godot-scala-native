package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Compositor`, extends `Resource`. */
abstract class Compositor extends Resource {

}

object Compositor {
  /** Class metadata for Gd[Compositor] lifetime management and casting. */
  given GodotClass[Compositor] with {
    def className = "Compositor"
    def isRefCounted = true
    def wrap(o: GodotObject): Compositor = new Compositor {}.withHost(o.objectPtr)
    def unwrap(t: Compositor): GodotObject = t.hostObject
  }
}
