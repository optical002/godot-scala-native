package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVaryingSetter`, extends `VisualShaderNodeVarying`. */
abstract class VisualShaderNodeVaryingSetter extends VisualShaderNodeVarying {

}

object VisualShaderNodeVaryingSetter {
  /** Class metadata for Gd[VisualShaderNodeVaryingSetter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVaryingSetter] with {
    def className = "VisualShaderNodeVaryingSetter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVaryingSetter = new VisualShaderNodeVaryingSetter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVaryingSetter): GodotObject = t.hostObject
  }
}
