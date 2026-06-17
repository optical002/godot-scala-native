package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CompressedCubemap`, extends `CompressedTextureLayered`. */
abstract class CompressedCubemap extends CompressedTextureLayered {

}

object CompressedCubemap {
  /** Class metadata for Gd[CompressedCubemap] lifetime management and casting. */
  given GodotClass[CompressedCubemap] with {
    def className = "CompressedCubemap"
    def isRefCounted = true
    def wrap(o: GodotObject): CompressedCubemap = new CompressedCubemap {}.withHost(o.objectPtr)
    def unwrap(t: CompressedCubemap): GodotObject = t.hostObject
  }
}
