package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeAdd2`, extends `AnimationNodeSync`. */
abstract class AnimationNodeAdd2 extends AnimationNodeSync {

}

object AnimationNodeAdd2 {
  /** Class metadata for Gd[AnimationNodeAdd2] lifetime management and casting. */
  given GodotClass[AnimationNodeAdd2] with {
    def className = "AnimationNodeAdd2"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeAdd2 = new AnimationNodeAdd2 {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeAdd2): GodotObject = t.hostObject
  }
}
