package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `MethodTweener`, extends `Tweener`. */
abstract class MethodTweener extends Tweener {

  /** MethodTweener.set_delay */
  final def setDelay(delay: Double): GodotObject =
    Ptrcall.call1[Double, GodotObject](MethodBind.get("MethodTweener", "set_delay", 266477812L), hostObject.objectPtr, delay)

  /** MethodTweener.set_trans */
  final def setTrans(trans: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("MethodTweener", "set_trans", 3740975367L), hostObject.objectPtr, trans)

  /** MethodTweener.set_ease */
  final def setEase(ease: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("MethodTweener", "set_ease", 315540545L), hostObject.objectPtr, ease)

}

object MethodTweener {
  /** Class metadata for Gd[MethodTweener] lifetime management and casting. */
  given GodotClass[MethodTweener] with {
    def className = "MethodTweener"
    def isRefCounted = true
    def wrap(o: GodotObject): MethodTweener = new MethodTweener {}.withHost(o.objectPtr)
    def unwrap(t: MethodTweener): GodotObject = t.hostObject
  }
}
