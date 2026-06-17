package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleOutput`, extends `VisualShaderNodeOutput`. */
abstract class VisualShaderNodeParticleOutput extends VisualShaderNodeOutput {

}

object VisualShaderNodeParticleOutput {
  /** Class metadata for Gd[VisualShaderNodeParticleOutput] lifetime management and casting. */
  given GodotClass[VisualShaderNodeParticleOutput] with {
    def className = "VisualShaderNodeParticleOutput"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeParticleOutput = new VisualShaderNodeParticleOutput {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeParticleOutput): GodotObject = t.hostObject
  }
}
