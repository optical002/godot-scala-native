package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeAdd3`, extends `AnimationNodeSync`. */
abstract class AnimationNodeAdd3 extends AnimationNodeSync {

}

object AnimationNodeAdd3 {
  /** Class metadata for Gd[AnimationNodeAdd3] lifetime management and casting. */
  given GodotClass[AnimationNodeAdd3] with {
    def className = "AnimationNodeAdd3"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeAdd3 = new AnimationNodeAdd3 {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeAdd3): GodotObject = t.hostObject
  }
}
