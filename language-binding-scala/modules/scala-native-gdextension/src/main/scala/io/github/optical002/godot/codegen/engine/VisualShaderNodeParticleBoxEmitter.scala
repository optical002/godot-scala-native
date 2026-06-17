package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleBoxEmitter`, extends `VisualShaderNodeParticleEmitter`. */
abstract class VisualShaderNodeParticleBoxEmitter extends VisualShaderNodeParticleEmitter {

}

object VisualShaderNodeParticleBoxEmitter {
  /** Class metadata for Gd[VisualShaderNodeParticleBoxEmitter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeParticleBoxEmitter] with {
    def className = "VisualShaderNodeParticleBoxEmitter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeParticleBoxEmitter = new VisualShaderNodeParticleBoxEmitter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeParticleBoxEmitter): GodotObject = t.hostObject
  }
}
