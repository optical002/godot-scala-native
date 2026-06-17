package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleConeVelocity`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleConeVelocity extends VisualShaderNode {

}

object VisualShaderNodeParticleConeVelocity {
  /** Class metadata for Gd[VisualShaderNodeParticleConeVelocity] lifetime management and casting. */
  given GodotClass[VisualShaderNodeParticleConeVelocity] with {
    def className = "VisualShaderNodeParticleConeVelocity"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeParticleConeVelocity = new VisualShaderNodeParticleConeVelocity {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeParticleConeVelocity): GodotObject = t.hostObject
  }
}
