package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CompressedCubemapArray`, extends `CompressedTextureLayered`. */
abstract class CompressedCubemapArray extends CompressedTextureLayered {

}

object CompressedCubemapArray {
  /** Class metadata for Gd[CompressedCubemapArray] lifetime management and casting. */
  given GodotClass[CompressedCubemapArray] with {
    def className = "CompressedCubemapArray"
    def isRefCounted = true
    def wrap(o: GodotObject): CompressedCubemapArray = new CompressedCubemapArray {}.withHost(o.objectPtr)
    def unwrap(t: CompressedCubemapArray): GodotObject = t.hostObject
  }
}
