package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ScriptLanguageExtension`, extends `ScriptLanguage`. */
abstract class ScriptLanguageExtension extends ScriptLanguage {

}

object ScriptLanguageExtension {
  /** Class metadata for Gd[ScriptLanguageExtension] lifetime management and casting. */
  given GodotClass[ScriptLanguageExtension] with {
    def className = "ScriptLanguageExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): ScriptLanguageExtension = new ScriptLanguageExtension {}.withHost(o.objectPtr)
    def unwrap(t: ScriptLanguageExtension): GodotObject = t.hostObject
  }
}
