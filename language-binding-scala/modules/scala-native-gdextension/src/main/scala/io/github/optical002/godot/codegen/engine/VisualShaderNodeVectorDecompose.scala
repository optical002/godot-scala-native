package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorDecompose`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorDecompose extends VisualShaderNodeVectorBase {

}

object VisualShaderNodeVectorDecompose {
  /** Class metadata for Gd[VisualShaderNodeVectorDecompose] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVectorDecompose] with {
    def className = "VisualShaderNodeVectorDecompose"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVectorDecompose = new VisualShaderNodeVectorDecompose {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVectorDecompose): GodotObject = t.hostObject
  }
}
