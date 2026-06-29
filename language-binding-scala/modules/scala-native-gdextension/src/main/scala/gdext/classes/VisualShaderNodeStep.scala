package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeStep`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeStep extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeStep"

  /** VisualShaderNodeStep.set_op_type */
  final def setOpType(op_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeStep", "set_op_type", 715172489L), hostObject.objectPtr, op_type)

  /** VisualShaderNodeStep.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeStep", "get_op_type", 3274022781L), hostObject.objectPtr)

}
