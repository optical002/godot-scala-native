package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeRandomRange`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeRandomRange extends VisualShaderNode {

}

object VisualShaderNodeRandomRange {
  /** Class metadata for Gd[VisualShaderNodeRandomRange] lifetime management and casting. */
  given GodotClass[VisualShaderNodeRandomRange] with {
    def className = "VisualShaderNodeRandomRange"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeRandomRange = new VisualShaderNodeRandomRange {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeRandomRange): GodotObject = t.hostObject
  }
}
