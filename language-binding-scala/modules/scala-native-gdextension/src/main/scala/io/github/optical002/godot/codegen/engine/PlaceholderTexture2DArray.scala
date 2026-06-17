package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderTexture2DArray`, extends `PlaceholderTextureLayered`. */
abstract class PlaceholderTexture2DArray extends PlaceholderTextureLayered {

}

object PlaceholderTexture2DArray {
  /** Class metadata for Gd[PlaceholderTexture2DArray] lifetime management and casting. */
  given GodotClass[PlaceholderTexture2DArray] with {
    def className = "PlaceholderTexture2DArray"
    def isRefCounted = true
    def wrap(o: GodotObject): PlaceholderTexture2DArray = new PlaceholderTexture2DArray {}.withHost(o.objectPtr)
    def unwrap(t: PlaceholderTexture2DArray): GodotObject = t.hostObject
  }
}
