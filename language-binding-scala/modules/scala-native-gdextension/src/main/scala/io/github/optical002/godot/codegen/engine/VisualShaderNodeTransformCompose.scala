package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTransformCompose`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformCompose extends VisualShaderNode {

}

object VisualShaderNodeTransformCompose {
  /** Class metadata for Gd[VisualShaderNodeTransformCompose] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTransformCompose] with {
    def className = "VisualShaderNodeTransformCompose"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTransformCompose = new VisualShaderNodeTransformCompose {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTransformCompose): GodotObject = t.hostObject
  }
}
