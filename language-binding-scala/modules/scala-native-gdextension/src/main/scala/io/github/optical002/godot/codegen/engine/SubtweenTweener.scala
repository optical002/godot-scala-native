package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `SubtweenTweener`, extends `Tweener`. */
abstract class SubtweenTweener extends Tweener {

  /** SubtweenTweener.set_delay */
  final def setDelay(delay: Double): GodotObject =
    Ptrcall.call1[Double, GodotObject](MethodBind.get("SubtweenTweener", "set_delay", 449181780L), hostObject.objectPtr, delay)

}

object SubtweenTweener {
  /** Class metadata for Gd[SubtweenTweener] lifetime management and casting. */
  given GodotClass[SubtweenTweener] with {
    def className = "SubtweenTweener"
    def isRefCounted = true
    def wrap(o: GodotObject): SubtweenTweener = new SubtweenTweener {}.withHost(o.objectPtr)
    def unwrap(t: SubtweenTweener): GodotObject = t.hostObject
  }
}
