package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTextureSDFNormal`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTextureSDFNormal extends VisualShaderNode {

}

object VisualShaderNodeTextureSDFNormal {
  /** Class metadata for Gd[VisualShaderNodeTextureSDFNormal] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTextureSDFNormal] with {
    def className = "VisualShaderNodeTextureSDFNormal"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTextureSDFNormal = new VisualShaderNodeTextureSDFNormal {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTextureSDFNormal): GodotObject = t.hostObject
  }
}
