package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleSphereEmitter`, extends `VisualShaderNodeParticleEmitter`. */
abstract class VisualShaderNodeParticleSphereEmitter extends VisualShaderNodeParticleEmitter {

}

object VisualShaderNodeParticleSphereEmitter {
  /** Class metadata for Gd[VisualShaderNodeParticleSphereEmitter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeParticleSphereEmitter] with {
    def className = "VisualShaderNodeParticleSphereEmitter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeParticleSphereEmitter = new VisualShaderNodeParticleSphereEmitter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeParticleSphereEmitter): GodotObject = t.hostObject
  }
}
