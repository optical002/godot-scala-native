package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRBindingModifier`, extends `Resource`. */
abstract class OpenXRBindingModifier extends Resource {

}

object OpenXRBindingModifier {
  /** Class metadata for Gd[OpenXRBindingModifier] lifetime management and casting. */
  given GodotClass[OpenXRBindingModifier] with {
    def className = "OpenXRBindingModifier"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRBindingModifier = new OpenXRBindingModifier {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRBindingModifier): GodotObject = t.hostObject
  }
}
