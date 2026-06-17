package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderMaterial`, extends `Material`. */
abstract class PlaceholderMaterial extends Material {

}

object PlaceholderMaterial {
  /** Class metadata for Gd[PlaceholderMaterial] lifetime management and casting. */
  given GodotClass[PlaceholderMaterial] with {
    def className = "PlaceholderMaterial"
    def isRefCounted = true
    def wrap(o: GodotObject): PlaceholderMaterial = new PlaceholderMaterial {}.withHost(o.objectPtr)
    def unwrap(t: PlaceholderMaterial): GodotObject = t.hostObject
  }
}
