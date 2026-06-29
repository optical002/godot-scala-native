package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeMix`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeMix extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeMix"

  /** VisualShaderNodeMix.set_op_type */
  final def setOpType(op_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeMix", "set_op_type", 3397501671L), hostObject.objectPtr, op_type)

  /** VisualShaderNodeMix.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeMix", "get_op_type", 4013957297L), hostObject.objectPtr)

}
