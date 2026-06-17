package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeWorldPositionFromDepth`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeWorldPositionFromDepth extends VisualShaderNode {

}

object VisualShaderNodeWorldPositionFromDepth {
  /** Class metadata for Gd[VisualShaderNodeWorldPositionFromDepth] lifetime management and casting. */
  given GodotClass[VisualShaderNodeWorldPositionFromDepth] with {
    def className = "VisualShaderNodeWorldPositionFromDepth"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeWorldPositionFromDepth = new VisualShaderNodeWorldPositionFromDepth {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeWorldPositionFromDepth): GodotObject = t.hostObject
  }
}
