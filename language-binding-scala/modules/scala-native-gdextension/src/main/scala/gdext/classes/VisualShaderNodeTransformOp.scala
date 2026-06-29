package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTransformOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeTransformOp"

  /** VisualShaderNodeTransformOp.set_operator */
  final def setOperator(op: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTransformOp", "set_operator", 2287310733L), hostObject.objectPtr, op)

  /** VisualShaderNodeTransformOp.get_operator */
  final def getOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeTransformOp", "get_operator", 1238663601L), hostObject.objectPtr)

}
