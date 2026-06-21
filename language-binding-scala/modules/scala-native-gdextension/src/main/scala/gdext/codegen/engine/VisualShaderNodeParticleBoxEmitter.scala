package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
