package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeVectorOp`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorOp extends VisualShaderNodeVectorBase {
  override def godotClassName: String = "VisualShaderNodeVectorOp"

  /** VisualShaderNodeVectorOp.set_operator */
  final def setOperator(op: Long): Unit = {
    if (gdext.classes.VisualShaderNodeVectorOp.mb_set_operator == null) gdext.classes.VisualShaderNodeVectorOp.mb_set_operator = MethodBind.get("VisualShaderNodeVectorOp", "set_operator", 3371507302L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVectorOp.mb_set_operator, livePtr, op)
  }

  /** VisualShaderNodeVectorOp.get_operator */
  final def getOperator(): Long = {
    if (gdext.classes.VisualShaderNodeVectorOp.mb_get_operator == null) gdext.classes.VisualShaderNodeVectorOp.mb_get_operator = MethodBind.get("VisualShaderNodeVectorOp", "get_operator", 11793929L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeVectorOp.mb_get_operator, livePtr)
  }

}

object VisualShaderNodeVectorOp {
  private[classes] var mb_set_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operator: GDExtensionMethodBindPtr = null
}
