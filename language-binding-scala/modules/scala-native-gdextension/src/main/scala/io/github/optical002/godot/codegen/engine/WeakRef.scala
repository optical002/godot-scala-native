package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `WeakRef`, extends `RefCounted`. */
abstract class WeakRef extends RefCounted {

}

object WeakRef {
  /** Class metadata for Gd[WeakRef] lifetime management and casting. */
  given GodotClass[WeakRef] with {
    def className = "WeakRef"
    def isRefCounted = true
    def wrap(o: GodotObject): WeakRef = new WeakRef {}.withHost(o.objectPtr)
    def unwrap(t: WeakRef): GodotObject = t.hostObject
  }
}
