package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorRefract`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorRefract extends VisualShaderNodeVectorBase {

}

object VisualShaderNodeVectorRefract {
  /** Class metadata for Gd[VisualShaderNodeVectorRefract] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVectorRefract] with {
    def className = "VisualShaderNodeVectorRefract"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVectorRefract = new VisualShaderNodeVectorRefract {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVectorRefract): GodotObject = t.hostObject
  }
}
