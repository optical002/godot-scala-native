package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTransformDecompose`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformDecompose extends VisualShaderNode {

}

object VisualShaderNodeTransformDecompose {
  /** Class metadata for Gd[VisualShaderNodeTransformDecompose] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTransformDecompose] with {
    def className = "VisualShaderNodeTransformDecompose"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTransformDecompose = new VisualShaderNodeTransformDecompose {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTransformDecompose): GodotObject = t.hostObject
  }
}
