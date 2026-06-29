package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeFloatOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeFloatOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeFloatOp"

  /** VisualShaderNodeFloatOp.set_operator */
  final def setOperator(op: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFloatOp", "set_operator", 2488468047L), hostObject.objectPtr, op)

  /** VisualShaderNodeFloatOp.get_operator */
  final def getOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeFloatOp", "get_operator", 1867979390L), hostObject.objectPtr)

}
