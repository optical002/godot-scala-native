package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeOutput`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeOutput extends VisualShaderNode {

}

object VisualShaderNodeOutput {
  /** Class metadata for Gd[VisualShaderNodeOutput] lifetime management and casting. */
  given GodotClass[VisualShaderNodeOutput] with {
    def className = "VisualShaderNodeOutput"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeOutput = new VisualShaderNodeOutput {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeOutput): GodotObject = t.hostObject
  }
}
