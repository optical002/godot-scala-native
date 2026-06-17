package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ScriptLanguage`, extends `Object`. */
abstract class ScriptLanguage extends Object {

}

object ScriptLanguage {
  /** Class metadata for Gd[ScriptLanguage] lifetime management and casting. */
  given GodotClass[ScriptLanguage] with {
    def className = "ScriptLanguage"
    def isRefCounted = false
    def wrap(o: GodotObject): ScriptLanguage = new ScriptLanguage {}.withHost(o.objectPtr)
    def unwrap(t: ScriptLanguage): GodotObject = t.hostObject
  }
}
