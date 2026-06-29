package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeUIntOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeUIntOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeUIntOp"

  /** VisualShaderNodeUIntOp.set_operator */
  final def setOperator(op: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeUIntOp", "set_operator", 3463048345L), hostObject.objectPtr, op)

  /** VisualShaderNodeUIntOp.get_operator */
  final def getOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeUIntOp", "get_operator", 256631461L), hostObject.objectPtr)

}
