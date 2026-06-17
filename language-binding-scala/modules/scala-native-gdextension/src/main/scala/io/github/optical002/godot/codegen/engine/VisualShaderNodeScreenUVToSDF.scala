package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeScreenUVToSDF`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeScreenUVToSDF extends VisualShaderNode {

}

object VisualShaderNodeScreenUVToSDF {
  /** Class metadata for Gd[VisualShaderNodeScreenUVToSDF] lifetime management and casting. */
  given GodotClass[VisualShaderNodeScreenUVToSDF] with {
    def className = "VisualShaderNodeScreenUVToSDF"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeScreenUVToSDF = new VisualShaderNodeScreenUVToSDF {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeScreenUVToSDF): GodotObject = t.hostObject
  }
}
