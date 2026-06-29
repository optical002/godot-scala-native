package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeIntOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIntOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeIntOp"

  /** VisualShaderNodeIntOp.set_operator */
  final def setOperator(op: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIntOp", "set_operator", 1677909323L), hostObject.objectPtr, op)

  /** VisualShaderNodeIntOp.get_operator */
  final def getOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeIntOp", "get_operator", 1236987913L), hostObject.objectPtr)

}
