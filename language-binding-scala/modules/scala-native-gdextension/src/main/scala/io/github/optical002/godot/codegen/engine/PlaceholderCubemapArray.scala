package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderCubemapArray`, extends `PlaceholderTextureLayered`. */
abstract class PlaceholderCubemapArray extends PlaceholderTextureLayered {

}

object PlaceholderCubemapArray {
  /** Class metadata for Gd[PlaceholderCubemapArray] lifetime management and casting. */
  given GodotClass[PlaceholderCubemapArray] with {
    def className = "PlaceholderCubemapArray"
    def isRefCounted = true
    def wrap(o: GodotObject): PlaceholderCubemapArray = new PlaceholderCubemapArray {}.withHost(o.objectPtr)
    def unwrap(t: PlaceholderCubemapArray): GodotObject = t.hostObject
  }
}
