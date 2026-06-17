package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRActionBindingModifier`, extends `OpenXRBindingModifier`. */
abstract class OpenXRActionBindingModifier extends OpenXRBindingModifier {

}

object OpenXRActionBindingModifier {
  /** Class metadata for Gd[OpenXRActionBindingModifier] lifetime management and casting. */
  given GodotClass[OpenXRActionBindingModifier] with {
    def className = "OpenXRActionBindingModifier"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRActionBindingModifier = new OpenXRActionBindingModifier {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRActionBindingModifier): GodotObject = t.hostObject
  }
}
