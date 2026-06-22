package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
