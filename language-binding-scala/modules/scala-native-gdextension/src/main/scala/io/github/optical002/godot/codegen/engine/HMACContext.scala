package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `HMACContext`, extends `RefCounted`. */
abstract class HMACContext extends RefCounted {

}

object HMACContext {
  /** Class metadata for Gd[HMACContext] lifetime management and casting. */
  given GodotClass[HMACContext] with {
    def className = "HMACContext"
    def isRefCounted = true
    def wrap(o: GodotObject): HMACContext = new HMACContext {}.withHost(o.objectPtr)
    def unwrap(t: HMACContext): GodotObject = t.hostObject
  }
}
