package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeTimeScale`, extends `AnimationNode`. */
abstract class AnimationNodeTimeScale extends AnimationNode {

}

object AnimationNodeTimeScale {
  /** Class metadata for Gd[AnimationNodeTimeScale] lifetime management and casting. */
  given GodotClass[AnimationNodeTimeScale] with {
    def className = "AnimationNodeTimeScale"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeTimeScale = new AnimationNodeTimeScale {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeTimeScale): GodotObject = t.hostObject
  }
}
