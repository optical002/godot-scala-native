package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeParticleRandomness`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleRandomness extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParticleRandomness"

  /** VisualShaderNodeParticleRandomness.set_op_type */
  final def setOpType(`type`: Long): Unit = {
    if (gdext.classes.VisualShaderNodeParticleRandomness.mb_set_op_type == null) gdext.classes.VisualShaderNodeParticleRandomness.mb_set_op_type = MethodBind.get("VisualShaderNodeParticleRandomness", "set_op_type", 2060089061L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParticleRandomness.mb_set_op_type, livePtr, `type`)
  }

  /** VisualShaderNodeParticleRandomness.get_op_type */
  final def getOpType(): Long = {
    if (gdext.classes.VisualShaderNodeParticleRandomness.mb_get_op_type == null) gdext.classes.VisualShaderNodeParticleRandomness.mb_get_op_type = MethodBind.get("VisualShaderNodeParticleRandomness", "get_op_type", 3597061078L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeParticleRandomness.mb_get_op_type, livePtr)
  }

}

object VisualShaderNodeParticleRandomness {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null
}
