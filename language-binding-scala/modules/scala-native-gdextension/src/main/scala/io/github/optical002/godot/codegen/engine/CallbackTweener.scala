package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CallbackTweener`, extends `Tweener`. */
abstract class CallbackTweener extends Tweener {

  /** CallbackTweener.set_delay */
  final def setDelay(delay: Double): GodotObject =
    Ptrcall.call1[Double, GodotObject](MethodBind.get("CallbackTweener", "set_delay", 3008182292L), hostObject.objectPtr, delay)

}

object CallbackTweener {
  /** Class metadata for Gd[CallbackTweener] lifetime management and casting. */
  given GodotClass[CallbackTweener] with {
    def className = "CallbackTweener"
    def isRefCounted = true
    def wrap(o: GodotObject): CallbackTweener = new CallbackTweener {}.withHost(o.objectPtr)
    def unwrap(t: CallbackTweener): GodotObject = t.hostObject
  }
}
