package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeSDFToScreenUV`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeSDFToScreenUV extends VisualShaderNode {

}

object VisualShaderNodeSDFToScreenUV {
  /** Class metadata for Gd[VisualShaderNodeSDFToScreenUV] lifetime management and casting. */
  given GodotClass[VisualShaderNodeSDFToScreenUV] with {
    def className = "VisualShaderNodeSDFToScreenUV"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeSDFToScreenUV = new VisualShaderNodeSDFToScreenUV {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeSDFToScreenUV): GodotObject = t.hostObject
  }
}
