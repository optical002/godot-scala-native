package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EngineProfiler`, extends `RefCounted`. */
abstract class EngineProfiler extends RefCounted {

}

object EngineProfiler {
  /** Class metadata for Gd[EngineProfiler] lifetime management and casting. */
  given GodotClass[EngineProfiler] with {
    def className = "EngineProfiler"
    def isRefCounted = true
    def wrap(o: GodotObject): EngineProfiler = new EngineProfiler {}.withHost(o.objectPtr)
    def unwrap(t: EngineProfiler): GodotObject = t.hostObject
  }
}
