package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeFloatOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeFloatOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeFloatOp"

  /** VisualShaderNodeFloatOp.set_operator */
  final def setOperator(op: Long): Unit = {
    if (gdext.classes.VisualShaderNodeFloatOp.mb_set_operator == null) gdext.classes.VisualShaderNodeFloatOp.mb_set_operator = MethodBind.get("VisualShaderNodeFloatOp", "set_operator", 2488468047L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFloatOp.mb_set_operator, livePtr, op)
  }

  /** VisualShaderNodeFloatOp.get_operator */
  final def getOperator(): Long = {
    if (gdext.classes.VisualShaderNodeFloatOp.mb_get_operator == null) gdext.classes.VisualShaderNodeFloatOp.mb_get_operator = MethodBind.get("VisualShaderNodeFloatOp", "get_operator", 1867979390L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeFloatOp.mb_get_operator, livePtr)
  }

}

object VisualShaderNodeFloatOp {
  private[classes] var mb_set_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operator: GDExtensionMethodBindPtr = null
}
