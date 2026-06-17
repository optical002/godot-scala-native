package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVaryingGetter`, extends `VisualShaderNodeVarying`. */
abstract class VisualShaderNodeVaryingGetter extends VisualShaderNodeVarying {

}

object VisualShaderNodeVaryingGetter {
  /** Class metadata for Gd[VisualShaderNodeVaryingGetter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVaryingGetter] with {
    def className = "VisualShaderNodeVaryingGetter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVaryingGetter = new VisualShaderNodeVaryingGetter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVaryingGetter): GodotObject = t.hostObject
  }
}
