package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeDeterminant`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeDeterminant extends VisualShaderNode {

}

object VisualShaderNodeDeterminant {
  /** Class metadata for Gd[VisualShaderNodeDeterminant] lifetime management and casting. */
  given GodotClass[VisualShaderNodeDeterminant] with {
    def className = "VisualShaderNodeDeterminant"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeDeterminant = new VisualShaderNodeDeterminant {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeDeterminant): GodotObject = t.hostObject
  }
}
