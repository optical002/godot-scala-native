package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ConvexPolygonShape3D`, extends `Shape3D`. */
abstract class ConvexPolygonShape3D extends Shape3D {

}

object ConvexPolygonShape3D {
  /** Class metadata for Gd[ConvexPolygonShape3D] lifetime management and casting. */
  given GodotClass[ConvexPolygonShape3D] with {
    def className = "ConvexPolygonShape3D"
    def isRefCounted = true
    def wrap(o: GodotObject): ConvexPolygonShape3D = new ConvexPolygonShape3D {}.withHost(o.objectPtr)
    def unwrap(t: ConvexPolygonShape3D): GodotObject = t.hostObject
  }
}
