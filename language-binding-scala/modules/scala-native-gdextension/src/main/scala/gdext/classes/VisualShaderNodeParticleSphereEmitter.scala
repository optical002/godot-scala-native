package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
