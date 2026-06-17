package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRVisibilityMask`, extends `VisualInstance3D`. */
abstract class OpenXRVisibilityMask extends VisualInstance3D {

}

object OpenXRVisibilityMask {
  /** Class metadata for Gd[OpenXRVisibilityMask] lifetime management and casting. */
  given GodotClass[OpenXRVisibilityMask] with {
    def className = "OpenXRVisibilityMask"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRVisibilityMask = new OpenXRVisibilityMask {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRVisibilityMask): GodotObject = t.hostObject
  }
}
