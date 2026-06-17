package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRHapticBase`, extends `Resource`. */
abstract class OpenXRHapticBase extends Resource {

}

object OpenXRHapticBase {
  /** Class metadata for Gd[OpenXRHapticBase] lifetime management and casting. */
  given GodotClass[OpenXRHapticBase] with {
    def className = "OpenXRHapticBase"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRHapticBase = new OpenXRHapticBase {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRHapticBase): GodotObject = t.hostObject
  }
}
