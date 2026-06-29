package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeSmoothStep`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeSmoothStep extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeSmoothStep"

  /** VisualShaderNodeSmoothStep.set_op_type */
  final def setOpType(op_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeSmoothStep", "set_op_type", 2427426148L), hostObject.objectPtr, op_type)

  /** VisualShaderNodeSmoothStep.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeSmoothStep", "get_op_type", 359640855L), hostObject.objectPtr)

}
