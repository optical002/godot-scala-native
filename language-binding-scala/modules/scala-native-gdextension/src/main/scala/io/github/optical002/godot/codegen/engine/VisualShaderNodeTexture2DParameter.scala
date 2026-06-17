package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTexture2DParameter`, extends `VisualShaderNodeTextureParameter`. */
abstract class VisualShaderNodeTexture2DParameter extends VisualShaderNodeTextureParameter {

}

object VisualShaderNodeTexture2DParameter {
  /** Class metadata for Gd[VisualShaderNodeTexture2DParameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTexture2DParameter] with {
    def className = "VisualShaderNodeTexture2DParameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTexture2DParameter = new VisualShaderNodeTexture2DParameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTexture2DParameter): GodotObject = t.hostObject
  }
}
