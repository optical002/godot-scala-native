package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorLen`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorLen extends VisualShaderNodeVectorBase {

}

object VisualShaderNodeVectorLen {
  /** Class metadata for Gd[VisualShaderNodeVectorLen] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVectorLen] with {
    def className = "VisualShaderNodeVectorLen"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVectorLen = new VisualShaderNodeVectorLen {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVectorLen): GodotObject = t.hostObject
  }
}
