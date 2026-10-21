package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeSmoothStep`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeSmoothStep extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeSmoothStep"

  /** VisualShaderNodeSmoothStep.set_op_type */
  final def setOpType(op_type: Long): Unit = {
    if (gdext.classes.VisualShaderNodeSmoothStep.mb_set_op_type == null) gdext.classes.VisualShaderNodeSmoothStep.mb_set_op_type = MethodBind.get("VisualShaderNodeSmoothStep", "set_op_type", 2427426148L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeSmoothStep.mb_set_op_type, livePtr, op_type)
  }

  /** VisualShaderNodeSmoothStep.get_op_type */
  final def getOpType(): Long = {
    if (gdext.classes.VisualShaderNodeSmoothStep.mb_get_op_type == null) gdext.classes.VisualShaderNodeSmoothStep.mb_get_op_type = MethodBind.get("VisualShaderNodeSmoothStep", "get_op_type", 359640855L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeSmoothStep.mb_get_op_type, livePtr)
  }

}

object VisualShaderNodeSmoothStep {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null
}
