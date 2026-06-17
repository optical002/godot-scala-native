package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ConcavePolygonShape2D`, extends `Shape2D`. */
abstract class ConcavePolygonShape2D extends Shape2D {

}

object ConcavePolygonShape2D {
  /** Class metadata for Gd[ConcavePolygonShape2D] lifetime management and casting. */
  given GodotClass[ConcavePolygonShape2D] with {
    def className = "ConcavePolygonShape2D"
    def isRefCounted = true
    def wrap(o: GodotObject): ConcavePolygonShape2D = new ConcavePolygonShape2D {}.withHost(o.objectPtr)
    def unwrap(t: ConcavePolygonShape2D): GodotObject = t.hostObject
  }
}
