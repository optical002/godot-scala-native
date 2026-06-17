package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Texture`, extends `Resource`. */
abstract class Texture extends Resource {

}

object Texture {
  /** Class metadata for Gd[Texture] lifetime management and casting. */
  given GodotClass[Texture] with {
    def className = "Texture"
    def isRefCounted = true
    def wrap(o: GodotObject): Texture = new Texture {}.withHost(o.objectPtr)
    def unwrap(t: Texture): GodotObject = t.hostObject
  }
}
