package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTexture3DParameter`, extends `VisualShaderNodeTextureParameter`. */
abstract class VisualShaderNodeTexture3DParameter extends VisualShaderNodeTextureParameter {

}

object VisualShaderNodeTexture3DParameter {
  /** Class metadata for Gd[VisualShaderNodeTexture3DParameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTexture3DParameter] with {
    def className = "VisualShaderNodeTexture3DParameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTexture3DParameter = new VisualShaderNodeTexture3DParameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTexture3DParameter): GodotObject = t.hostObject
  }
}
