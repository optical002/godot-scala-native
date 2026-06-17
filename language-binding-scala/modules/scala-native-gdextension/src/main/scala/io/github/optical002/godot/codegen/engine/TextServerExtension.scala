package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `TextServerExtension`, extends `TextServer`. */
abstract class TextServerExtension extends TextServer {

}

object TextServerExtension {
  /** Class metadata for Gd[TextServerExtension] lifetime management and casting. */
  given GodotClass[TextServerExtension] with {
    def className = "TextServerExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): TextServerExtension = new TextServerExtension {}.withHost(o.objectPtr)
    def unwrap(t: TextServerExtension): GodotObject = t.hostObject
  }
}
