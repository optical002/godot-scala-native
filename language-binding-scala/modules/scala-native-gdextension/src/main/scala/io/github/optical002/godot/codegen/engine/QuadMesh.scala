package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `QuadMesh`, extends `PlaneMesh`. */
abstract class QuadMesh extends PlaneMesh {

}

object QuadMesh {
  /** Class metadata for Gd[QuadMesh] lifetime management and casting. */
  given GodotClass[QuadMesh] with {
    def className = "QuadMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): QuadMesh = new QuadMesh {}.withHost(o.objectPtr)
    def unwrap(t: QuadMesh): GodotObject = t.hostObject
  }
}
