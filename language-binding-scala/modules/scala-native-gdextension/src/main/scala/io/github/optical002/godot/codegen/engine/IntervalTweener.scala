package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `IntervalTweener`, extends `Tweener`. */
abstract class IntervalTweener extends Tweener {

}

object IntervalTweener {
  /** Class metadata for Gd[IntervalTweener] lifetime management and casting. */
  given GodotClass[IntervalTweener] with {
    def className = "IntervalTweener"
    def isRefCounted = true
    def wrap(o: GodotObject): IntervalTweener = new IntervalTweener {}.withHost(o.objectPtr)
    def unwrap(t: IntervalTweener): GodotObject = t.hostObject
  }
}
