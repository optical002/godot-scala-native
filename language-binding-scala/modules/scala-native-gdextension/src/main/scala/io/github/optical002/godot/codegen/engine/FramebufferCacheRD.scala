package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `FramebufferCacheRD`, extends `Object`. */
abstract class FramebufferCacheRD extends Object {

}

object FramebufferCacheRD {
  /** Class metadata for Gd[FramebufferCacheRD] lifetime management and casting. */
  given GodotClass[FramebufferCacheRD] with {
    def className = "FramebufferCacheRD"
    def isRefCounted = false
    def wrap(o: GodotObject): FramebufferCacheRD = new FramebufferCacheRD {}.withHost(o.objectPtr)
    def unwrap(t: FramebufferCacheRD): GodotObject = t.hostObject
  }
}
