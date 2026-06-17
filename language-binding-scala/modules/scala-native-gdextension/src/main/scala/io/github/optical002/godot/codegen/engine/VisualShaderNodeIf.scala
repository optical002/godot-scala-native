package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeIf`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIf extends VisualShaderNode {

}

object VisualShaderNodeIf {
  /** Class metadata for Gd[VisualShaderNodeIf] lifetime management and casting. */
  given GodotClass[VisualShaderNodeIf] with {
    def className = "VisualShaderNodeIf"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeIf = new VisualShaderNodeIf {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeIf): GodotObject = t.hostObject
  }
}
