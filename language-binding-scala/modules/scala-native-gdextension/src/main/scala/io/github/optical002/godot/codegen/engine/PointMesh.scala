package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PointMesh`, extends `PrimitiveMesh`. */
abstract class PointMesh extends PrimitiveMesh {

}

object PointMesh {
  /** Class metadata for Gd[PointMesh] lifetime management and casting. */
  given GodotClass[PointMesh] with {
    def className = "PointMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): PointMesh = new PointMesh {}.withHost(o.objectPtr)
    def unwrap(t: PointMesh): GodotObject = t.hostObject
  }
}
