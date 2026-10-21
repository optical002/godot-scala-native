package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeIntOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIntOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeIntOp"

  /** VisualShaderNodeIntOp.set_operator */
  final def setOperator(op: Long): Unit = {
    if (gdext.classes.VisualShaderNodeIntOp.mb_set_operator == null) gdext.classes.VisualShaderNodeIntOp.mb_set_operator = MethodBind.get("VisualShaderNodeIntOp", "set_operator", 1677909323L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeIntOp.mb_set_operator, livePtr, op)
  }

  /** VisualShaderNodeIntOp.get_operator */
  final def getOperator(): Long = {
    if (gdext.classes.VisualShaderNodeIntOp.mb_get_operator == null) gdext.classes.VisualShaderNodeIntOp.mb_get_operator = MethodBind.get("VisualShaderNodeIntOp", "get_operator", 1236987913L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeIntOp.mb_get_operator, livePtr)
  }

}

object VisualShaderNodeIntOp {
  private[classes] var mb_set_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operator: GDExtensionMethodBindPtr = null
}
