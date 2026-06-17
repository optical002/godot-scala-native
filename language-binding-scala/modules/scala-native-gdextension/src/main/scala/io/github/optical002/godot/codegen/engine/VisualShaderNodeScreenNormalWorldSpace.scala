package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeScreenNormalWorldSpace`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeScreenNormalWorldSpace extends VisualShaderNode {

}

object VisualShaderNodeScreenNormalWorldSpace {
  /** Class metadata for Gd[VisualShaderNodeScreenNormalWorldSpace] lifetime management and casting. */
  given GodotClass[VisualShaderNodeScreenNormalWorldSpace] with {
    def className = "VisualShaderNodeScreenNormalWorldSpace"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeScreenNormalWorldSpace = new VisualShaderNodeScreenNormalWorldSpace {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeScreenNormalWorldSpace): GodotObject = t.hostObject
  }
}
