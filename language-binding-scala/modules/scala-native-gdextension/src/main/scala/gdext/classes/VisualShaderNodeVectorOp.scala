package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorOp`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorOp extends VisualShaderNodeVectorBase {
  override def godotClassName: String = "VisualShaderNodeVectorOp"

  /** VisualShaderNodeVectorOp.set_operator */
  final def setOperator(op: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVectorOp", "set_operator", 3371507302L), hostObject.objectPtr, op)

  /** VisualShaderNodeVectorOp.get_operator */
  final def getOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeVectorOp", "get_operator", 11793929L), hostObject.objectPtr)

}
