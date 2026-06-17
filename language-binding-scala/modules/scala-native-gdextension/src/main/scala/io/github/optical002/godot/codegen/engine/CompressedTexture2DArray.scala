package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CompressedTexture2DArray`, extends `CompressedTextureLayered`. */
abstract class CompressedTexture2DArray extends CompressedTextureLayered {

}

object CompressedTexture2DArray {
  /** Class metadata for Gd[CompressedTexture2DArray] lifetime management and casting. */
  given GodotClass[CompressedTexture2DArray] with {
    def className = "CompressedTexture2DArray"
    def isRefCounted = true
    def wrap(o: GodotObject): CompressedTexture2DArray = new CompressedTexture2DArray {}.withHost(o.objectPtr)
    def unwrap(t: CompressedTexture2DArray): GodotObject = t.hostObject
  }
}
