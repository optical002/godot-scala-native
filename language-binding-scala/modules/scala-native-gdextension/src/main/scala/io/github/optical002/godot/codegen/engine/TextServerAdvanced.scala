package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `TextServerAdvanced`, extends `TextServerExtension`. */
abstract class TextServerAdvanced extends TextServerExtension {

}

object TextServerAdvanced {
  /** Class metadata for Gd[TextServerAdvanced] lifetime management and casting. */
  given GodotClass[TextServerAdvanced] with {
    def className = "TextServerAdvanced"
    def isRefCounted = true
    def wrap(o: GodotObject): TextServerAdvanced = new TextServerAdvanced {}.withHost(o.objectPtr)
    def unwrap(t: TextServerAdvanced): GodotObject = t.hostObject
  }
}
