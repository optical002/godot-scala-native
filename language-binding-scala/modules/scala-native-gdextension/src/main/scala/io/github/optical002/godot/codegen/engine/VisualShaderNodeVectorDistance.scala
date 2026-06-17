package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorDistance`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorDistance extends VisualShaderNodeVectorBase {

}

object VisualShaderNodeVectorDistance {
  /** Class metadata for Gd[VisualShaderNodeVectorDistance] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVectorDistance] with {
    def className = "VisualShaderNodeVectorDistance"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVectorDistance = new VisualShaderNodeVectorDistance {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVectorDistance): GodotObject = t.hostObject
  }
}
