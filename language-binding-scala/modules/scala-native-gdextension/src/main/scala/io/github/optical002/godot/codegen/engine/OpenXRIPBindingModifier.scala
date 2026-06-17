package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRIPBindingModifier`, extends `OpenXRBindingModifier`. */
abstract class OpenXRIPBindingModifier extends OpenXRBindingModifier {

}

object OpenXRIPBindingModifier {
  /** Class metadata for Gd[OpenXRIPBindingModifier] lifetime management and casting. */
  given GodotClass[OpenXRIPBindingModifier] with {
    def className = "OpenXRIPBindingModifier"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRIPBindingModifier = new OpenXRIPBindingModifier {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRIPBindingModifier): GodotObject = t.hostObject
  }
}
