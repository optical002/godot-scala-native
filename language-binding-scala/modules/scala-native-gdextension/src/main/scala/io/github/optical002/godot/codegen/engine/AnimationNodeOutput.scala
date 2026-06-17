package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeOutput`, extends `AnimationNode`. */
abstract class AnimationNodeOutput extends AnimationNode {

}

object AnimationNodeOutput {
  /** Class metadata for Gd[AnimationNodeOutput] lifetime management and casting. */
  given GodotClass[AnimationNodeOutput] with {
    def className = "AnimationNodeOutput"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeOutput = new AnimationNodeOutput {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeOutput): GodotObject = t.hostObject
  }
}
