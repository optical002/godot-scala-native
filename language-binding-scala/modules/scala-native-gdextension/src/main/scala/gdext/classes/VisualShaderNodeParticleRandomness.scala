package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleRandomness`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleRandomness extends VisualShaderNode {

  /** VisualShaderNodeParticleRandomness.set_op_type */
  final def setOpType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParticleRandomness", "set_op_type", 2060089061L), hostObject.objectPtr, `type`)

  /** VisualShaderNodeParticleRandomness.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeParticleRandomness", "get_op_type", 3597061078L), hostObject.objectPtr)

}

object VisualShaderNodeParticleRandomness {
  /** Class metadata for Gd[VisualShaderNodeParticleRandomness] lifetime management and casting. */
  given GodotClass[VisualShaderNodeParticleRandomness] with {
    def className = "VisualShaderNodeParticleRandomness"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeParticleRandomness = new VisualShaderNodeParticleRandomness {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeParticleRandomness): GodotObject = t.hostObject
  }
}
