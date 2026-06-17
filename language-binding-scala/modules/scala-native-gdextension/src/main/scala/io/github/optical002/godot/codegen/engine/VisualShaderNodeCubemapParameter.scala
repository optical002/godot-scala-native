package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeCubemapParameter`, extends `VisualShaderNodeTextureParameter`. */
abstract class VisualShaderNodeCubemapParameter extends VisualShaderNodeTextureParameter {

}

object VisualShaderNodeCubemapParameter {
  /** Class metadata for Gd[VisualShaderNodeCubemapParameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeCubemapParameter] with {
    def className = "VisualShaderNodeCubemapParameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeCubemapParameter = new VisualShaderNodeCubemapParameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeCubemapParameter): GodotObject = t.hostObject
  }
}
