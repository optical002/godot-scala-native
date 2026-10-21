package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeMix`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeMix extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeMix"

  /** VisualShaderNodeMix.set_op_type */
  final def setOpType(op_type: Long): Unit = {
    if (gdext.classes.VisualShaderNodeMix.mb_set_op_type == null) gdext.classes.VisualShaderNodeMix.mb_set_op_type = MethodBind.get("VisualShaderNodeMix", "set_op_type", 3397501671L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeMix.mb_set_op_type, livePtr, op_type)
  }

  /** VisualShaderNodeMix.get_op_type */
  final def getOpType(): Long = {
    if (gdext.classes.VisualShaderNodeMix.mb_get_op_type == null) gdext.classes.VisualShaderNodeMix.mb_get_op_type = MethodBind.get("VisualShaderNodeMix", "get_op_type", 4013957297L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeMix.mb_get_op_type, livePtr)
  }

}

object VisualShaderNodeMix {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null
}
