package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeColorOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeColorOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeColorOp"

  /** VisualShaderNodeColorOp.set_operator */
  final def setOperator(op: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeColorOp", "set_operator", 4260370673L), hostObject.objectPtr, op)

  /** VisualShaderNodeColorOp.get_operator */
  final def getOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeColorOp", "get_operator", 1950956529L), hostObject.objectPtr)

}
