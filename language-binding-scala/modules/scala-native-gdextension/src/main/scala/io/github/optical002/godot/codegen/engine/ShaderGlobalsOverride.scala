package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ShaderGlobalsOverride`, extends `Node`. */
abstract class ShaderGlobalsOverride extends Node {

}

object ShaderGlobalsOverride {
  /** Class metadata for Gd[ShaderGlobalsOverride] lifetime management and casting. */
  given GodotClass[ShaderGlobalsOverride] with {
    def className = "ShaderGlobalsOverride"
    def isRefCounted = false
    def wrap(o: GodotObject): ShaderGlobalsOverride = new ShaderGlobalsOverride {}.withHost(o.objectPtr)
    def unwrap(t: ShaderGlobalsOverride): GodotObject = t.hostObject
  }
}
