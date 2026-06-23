package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

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
