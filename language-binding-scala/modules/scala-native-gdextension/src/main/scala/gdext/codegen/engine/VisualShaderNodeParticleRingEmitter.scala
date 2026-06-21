package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleRingEmitter`, extends `VisualShaderNodeParticleEmitter`. */
abstract class VisualShaderNodeParticleRingEmitter extends VisualShaderNodeParticleEmitter {

}

object VisualShaderNodeParticleRingEmitter {
  /** Class metadata for Gd[VisualShaderNodeParticleRingEmitter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeParticleRingEmitter] with {
    def className = "VisualShaderNodeParticleRingEmitter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeParticleRingEmitter = new VisualShaderNodeParticleRingEmitter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeParticleRingEmitter): GodotObject = t.hostObject
  }
}
