package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTransformVecMult`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformVecMult extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeTransformVecMult"

  /** VisualShaderNodeTransformVecMult.set_operator */
  final def setOperator(op: Long): Unit = {
    if (gdext.classes.VisualShaderNodeTransformVecMult.mb_set_operator == null) gdext.classes.VisualShaderNodeTransformVecMult.mb_set_operator = MethodBind.get("VisualShaderNodeTransformVecMult", "set_operator", 1785665912L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTransformVecMult.mb_set_operator, livePtr, op)
  }

  /** VisualShaderNodeTransformVecMult.get_operator */
  final def getOperator(): Long = {
    if (gdext.classes.VisualShaderNodeTransformVecMult.mb_get_operator == null) gdext.classes.VisualShaderNodeTransformVecMult.mb_get_operator = MethodBind.get("VisualShaderNodeTransformVecMult", "get_operator", 1622088722L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTransformVecMult.mb_get_operator, livePtr)
  }

}

object VisualShaderNodeTransformVecMult {
  private[classes] var mb_set_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operator: GDExtensionMethodBindPtr = null
}
