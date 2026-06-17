package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderCubemap`, extends `PlaceholderTextureLayered`. */
abstract class PlaceholderCubemap extends PlaceholderTextureLayered {

}

object PlaceholderCubemap {
  /** Class metadata for Gd[PlaceholderCubemap] lifetime management and casting. */
  given GodotClass[PlaceholderCubemap] with {
    def className = "PlaceholderCubemap"
    def isRefCounted = true
    def wrap(o: GodotObject): PlaceholderCubemap = new PlaceholderCubemap {}.withHost(o.objectPtr)
    def unwrap(t: PlaceholderCubemap): GodotObject = t.hostObject
  }
}
