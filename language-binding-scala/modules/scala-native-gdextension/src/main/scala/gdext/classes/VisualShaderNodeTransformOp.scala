package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTransformOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeTransformOp"

  /** VisualShaderNodeTransformOp.set_operator */
  final def setOperator(op: Long): Unit = {
    if (gdext.classes.VisualShaderNodeTransformOp.mb_set_operator == null) gdext.classes.VisualShaderNodeTransformOp.mb_set_operator = MethodBind.get("VisualShaderNodeTransformOp", "set_operator", 2287310733L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTransformOp.mb_set_operator, livePtr, op)
  }

  /** VisualShaderNodeTransformOp.get_operator */
  final def getOperator(): Long = {
    if (gdext.classes.VisualShaderNodeTransformOp.mb_get_operator == null) gdext.classes.VisualShaderNodeTransformOp.mb_get_operator = MethodBind.get("VisualShaderNodeTransformOp", "get_operator", 1238663601L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTransformOp.mb_get_operator, livePtr)
  }

}

object VisualShaderNodeTransformOp {
  private[classes] var mb_set_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operator: GDExtensionMethodBindPtr = null
}
