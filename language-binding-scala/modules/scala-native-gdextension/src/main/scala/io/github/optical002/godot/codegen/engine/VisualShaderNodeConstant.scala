package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeConstant`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeConstant extends VisualShaderNode {

}

object VisualShaderNodeConstant {
  /** Class metadata for Gd[VisualShaderNodeConstant] lifetime management and casting. */
  given GodotClass[VisualShaderNodeConstant] with {
    def className = "VisualShaderNodeConstant"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeConstant = new VisualShaderNodeConstant {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeConstant): GodotObject = t.hostObject
  }
}
