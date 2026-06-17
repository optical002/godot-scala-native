package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeLinearSceneDepth`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeLinearSceneDepth extends VisualShaderNode {

}

object VisualShaderNodeLinearSceneDepth {
  /** Class metadata for Gd[VisualShaderNodeLinearSceneDepth] lifetime management and casting. */
  given GodotClass[VisualShaderNodeLinearSceneDepth] with {
    def className = "VisualShaderNodeLinearSceneDepth"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeLinearSceneDepth = new VisualShaderNodeLinearSceneDepth {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeLinearSceneDepth): GodotObject = t.hostObject
  }
}
