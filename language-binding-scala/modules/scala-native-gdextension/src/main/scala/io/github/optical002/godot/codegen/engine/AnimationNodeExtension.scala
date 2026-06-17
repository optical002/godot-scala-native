package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeExtension`, extends `AnimationNode`. */
abstract class AnimationNodeExtension extends AnimationNode {

}

object AnimationNodeExtension {
  /** Class metadata for Gd[AnimationNodeExtension] lifetime management and casting. */
  given GodotClass[AnimationNodeExtension] with {
    def className = "AnimationNodeExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeExtension = new AnimationNodeExtension {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeExtension): GodotObject = t.hostObject
  }
}
