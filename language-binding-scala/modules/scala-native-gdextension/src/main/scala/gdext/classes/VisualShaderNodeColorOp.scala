package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeColorOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeColorOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeColorOp"

  /** VisualShaderNodeColorOp.set_operator */
  final def setOperator(op: Long): Unit = {
    if (gdext.classes.VisualShaderNodeColorOp.mb_set_operator == null) gdext.classes.VisualShaderNodeColorOp.mb_set_operator = MethodBind.get("VisualShaderNodeColorOp", "set_operator", 4260370673L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeColorOp.mb_set_operator, livePtr, op)
  }

  /** VisualShaderNodeColorOp.get_operator */
  final def getOperator(): Long = {
    if (gdext.classes.VisualShaderNodeColorOp.mb_get_operator == null) gdext.classes.VisualShaderNodeColorOp.mb_get_operator = MethodBind.get("VisualShaderNodeColorOp", "get_operator", 1950956529L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeColorOp.mb_get_operator, livePtr)
  }

}

object VisualShaderNodeColorOp {
  private[classes] var mb_set_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operator: GDExtensionMethodBindPtr = null
}
