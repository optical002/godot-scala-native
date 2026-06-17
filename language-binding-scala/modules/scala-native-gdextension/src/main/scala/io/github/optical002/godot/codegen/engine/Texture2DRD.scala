package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Texture2DRD`, extends `Texture2D`. */
abstract class Texture2DRD extends Texture2D {

}

object Texture2DRD {
  /** Class metadata for Gd[Texture2DRD] lifetime management and casting. */
  given GodotClass[Texture2DRD] with {
    def className = "Texture2DRD"
    def isRefCounted = true
    def wrap(o: GodotObject): Texture2DRD = new Texture2DRD {}.withHost(o.objectPtr)
    def unwrap(t: Texture2DRD): GodotObject = t.hostObject
  }
}
