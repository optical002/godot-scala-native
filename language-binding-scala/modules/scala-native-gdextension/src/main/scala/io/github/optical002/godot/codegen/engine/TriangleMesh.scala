package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `TriangleMesh`, extends `RefCounted`. */
abstract class TriangleMesh extends RefCounted {

}

object TriangleMesh {
  /** Class metadata for Gd[TriangleMesh] lifetime management and casting. */
  given GodotClass[TriangleMesh] with {
    def className = "TriangleMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): TriangleMesh = new TriangleMesh {}.withHost(o.objectPtr)
    def unwrap(t: TriangleMesh): GodotObject = t.hostObject
  }
}
