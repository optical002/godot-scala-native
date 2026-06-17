package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRExtensionWrapperExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRExtensionWrapperExtension extends OpenXRExtensionWrapper {

}

object OpenXRExtensionWrapperExtension {
  /** Class metadata for Gd[OpenXRExtensionWrapperExtension] lifetime management and casting. */
  given GodotClass[OpenXRExtensionWrapperExtension] with {
    def className = "OpenXRExtensionWrapperExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRExtensionWrapperExtension = new OpenXRExtensionWrapperExtension {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRExtensionWrapperExtension): GodotObject = t.hostObject
  }
}
