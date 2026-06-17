package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorCompose`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorCompose extends VisualShaderNodeVectorBase {

}

object VisualShaderNodeVectorCompose {
  /** Class metadata for Gd[VisualShaderNodeVectorCompose] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVectorCompose] with {
    def className = "VisualShaderNodeVectorCompose"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVectorCompose = new VisualShaderNodeVectorCompose {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVectorCompose): GodotObject = t.hostObject
  }
}
