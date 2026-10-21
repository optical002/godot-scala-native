package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeVectorBase`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeVectorBase extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeVectorBase"

  /** VisualShaderNodeVectorBase.set_op_type */
  final def setOpType(`type`: Long): Unit = {
    if (gdext.classes.VisualShaderNodeVectorBase.mb_set_op_type == null) gdext.classes.VisualShaderNodeVectorBase.mb_set_op_type = MethodBind.get("VisualShaderNodeVectorBase", "set_op_type", 1692596998L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVectorBase.mb_set_op_type, livePtr, `type`)
  }

  /** VisualShaderNodeVectorBase.get_op_type */
  final def getOpType(): Long = {
    if (gdext.classes.VisualShaderNodeVectorBase.mb_get_op_type == null) gdext.classes.VisualShaderNodeVectorBase.mb_get_op_type = MethodBind.get("VisualShaderNodeVectorBase", "get_op_type", 2568738462L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeVectorBase.mb_get_op_type, livePtr)
  }

}

object VisualShaderNodeVectorBase {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null
}
