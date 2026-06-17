package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Tweener`, extends `RefCounted`. */
abstract class Tweener extends RefCounted {

}

object Tweener {
  /** Class metadata for Gd[Tweener] lifetime management and casting. */
  given GodotClass[Tweener] with {
    def className = "Tweener"
    def isRefCounted = true
    def wrap(o: GodotObject): Tweener = new Tweener {}.withHost(o.objectPtr)
    def unwrap(t: Tweener): GodotObject = t.hostObject
  }
}
