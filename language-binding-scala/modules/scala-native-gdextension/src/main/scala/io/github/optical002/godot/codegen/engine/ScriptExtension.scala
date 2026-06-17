package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ScriptExtension`, extends `Script`. */
abstract class ScriptExtension extends Script {

}

object ScriptExtension {
  /** Class metadata for Gd[ScriptExtension] lifetime management and casting. */
  given GodotClass[ScriptExtension] with {
    def className = "ScriptExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): ScriptExtension = new ScriptExtension {}.withHost(o.objectPtr)
    def unwrap(t: ScriptExtension): GodotObject = t.hostObject
  }
}
