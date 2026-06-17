package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTextureParameterTriplanar`, extends `VisualShaderNodeTextureParameter`. */
abstract class VisualShaderNodeTextureParameterTriplanar extends VisualShaderNodeTextureParameter {

}

object VisualShaderNodeTextureParameterTriplanar {
  /** Class metadata for Gd[VisualShaderNodeTextureParameterTriplanar] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTextureParameterTriplanar] with {
    def className = "VisualShaderNodeTextureParameterTriplanar"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTextureParameterTriplanar = new VisualShaderNodeTextureParameterTriplanar {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTextureParameterTriplanar): GodotObject = t.hostObject
  }
}
