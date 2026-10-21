package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeStep`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeStep extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeStep"

  /** VisualShaderNodeStep.set_op_type */
  final def setOpType(op_type: Long): Unit = {
    if (gdext.classes.VisualShaderNodeStep.mb_set_op_type == null) gdext.classes.VisualShaderNodeStep.mb_set_op_type = MethodBind.get("VisualShaderNodeStep", "set_op_type", 715172489L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeStep.mb_set_op_type, livePtr, op_type)
  }

  /** VisualShaderNodeStep.get_op_type */
  final def getOpType(): Long = {
    if (gdext.classes.VisualShaderNodeStep.mb_get_op_type == null) gdext.classes.VisualShaderNodeStep.mb_get_op_type = MethodBind.get("VisualShaderNodeStep", "get_op_type", 3274022781L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeStep.mb_get_op_type, livePtr)
  }

}

object VisualShaderNodeStep {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null
}
