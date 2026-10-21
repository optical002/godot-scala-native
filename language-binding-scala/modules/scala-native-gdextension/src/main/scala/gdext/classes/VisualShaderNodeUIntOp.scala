package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeUIntOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeUIntOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeUIntOp"

  /** VisualShaderNodeUIntOp.set_operator */
  final def setOperator(op: Long): Unit = {
    if (gdext.classes.VisualShaderNodeUIntOp.mb_set_operator == null) gdext.classes.VisualShaderNodeUIntOp.mb_set_operator = MethodBind.get("VisualShaderNodeUIntOp", "set_operator", 3463048345L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeUIntOp.mb_set_operator, livePtr, op)
  }

  /** VisualShaderNodeUIntOp.get_operator */
  final def getOperator(): Long = {
    if (gdext.classes.VisualShaderNodeUIntOp.mb_get_operator == null) gdext.classes.VisualShaderNodeUIntOp.mb_get_operator = MethodBind.get("VisualShaderNodeUIntOp", "get_operator", 256631461L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeUIntOp.mb_get_operator, livePtr)
  }

}

object VisualShaderNodeUIntOp {
  private[classes] var mb_set_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operator: GDExtensionMethodBindPtr = null
}
