package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ViewportTexture`, extends `Texture2D`. */
abstract class ViewportTexture extends Texture2D {

}

object ViewportTexture {
  /** Class metadata for Gd[ViewportTexture] lifetime management and casting. */
  given GodotClass[ViewportTexture] with {
    def className = "ViewportTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): ViewportTexture = new ViewportTexture {}.withHost(o.objectPtr)
    def unwrap(t: ViewportTexture): GodotObject = t.hostObject
  }
}
