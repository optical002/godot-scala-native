package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `UniformSetCacheRD`, extends `Object`. */
abstract class UniformSetCacheRD extends Object {

}

object UniformSetCacheRD {
  /** Class metadata for Gd[UniformSetCacheRD] lifetime management and casting. */
  given GodotClass[UniformSetCacheRD] with {
    def className = "UniformSetCacheRD"
    def isRefCounted = false
    def wrap(o: GodotObject): UniformSetCacheRD = new UniformSetCacheRD {}.withHost(o.objectPtr)
    def unwrap(t: UniformSetCacheRD): GodotObject = t.hostObject
  }
}
