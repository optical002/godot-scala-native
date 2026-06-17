package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `TextureLayeredRD`, extends `TextureLayered`. */
abstract class TextureLayeredRD extends TextureLayered {

}

object TextureLayeredRD {
  /** Class metadata for Gd[TextureLayeredRD] lifetime management and casting. */
  given GodotClass[TextureLayeredRD] with {
    def className = "TextureLayeredRD"
    def isRefCounted = true
    def wrap(o: GodotObject): TextureLayeredRD = new TextureLayeredRD {}.withHost(o.objectPtr)
    def unwrap(t: TextureLayeredRD): GodotObject = t.hostObject
  }
}
