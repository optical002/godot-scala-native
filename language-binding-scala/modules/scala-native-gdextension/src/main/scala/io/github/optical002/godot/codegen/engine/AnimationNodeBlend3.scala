package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeBlend3`, extends `AnimationNodeSync`. */
abstract class AnimationNodeBlend3 extends AnimationNodeSync {

}

object AnimationNodeBlend3 {
  /** Class metadata for Gd[AnimationNodeBlend3] lifetime management and casting. */
  given GodotClass[AnimationNodeBlend3] with {
    def className = "AnimationNodeBlend3"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeBlend3 = new AnimationNodeBlend3 {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeBlend3): GodotObject = t.hostObject
  }
}
