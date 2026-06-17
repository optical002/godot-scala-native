package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeFresnel`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeFresnel extends VisualShaderNode {

}

object VisualShaderNodeFresnel {
  /** Class metadata for Gd[VisualShaderNodeFresnel] lifetime management and casting. */
  given GodotClass[VisualShaderNodeFresnel] with {
    def className = "VisualShaderNodeFresnel"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeFresnel = new VisualShaderNodeFresnel {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeFresnel): GodotObject = t.hostObject
  }
}
