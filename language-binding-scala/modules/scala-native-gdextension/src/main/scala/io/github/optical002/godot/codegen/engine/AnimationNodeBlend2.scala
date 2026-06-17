package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeBlend2`, extends `AnimationNodeSync`. */
abstract class AnimationNodeBlend2 extends AnimationNodeSync {

}

object AnimationNodeBlend2 {
  /** Class metadata for Gd[AnimationNodeBlend2] lifetime management and casting. */
  given GodotClass[AnimationNodeBlend2] with {
    def className = "AnimationNodeBlend2"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeBlend2 = new AnimationNodeBlend2 {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeBlend2): GodotObject = t.hostObject
  }
}
