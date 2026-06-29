package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleRandomness`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleRandomness extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParticleRandomness"

  /** VisualShaderNodeParticleRandomness.set_op_type */
  final def setOpType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParticleRandomness", "set_op_type", 2060089061L), hostObject.objectPtr, `type`)

  /** VisualShaderNodeParticleRandomness.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeParticleRandomness", "get_op_type", 3597061078L), hostObject.objectPtr)

}
