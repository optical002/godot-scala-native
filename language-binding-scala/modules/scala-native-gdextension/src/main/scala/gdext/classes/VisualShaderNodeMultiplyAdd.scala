package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeMultiplyAdd`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeMultiplyAdd extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeMultiplyAdd"

  /** VisualShaderNodeMultiplyAdd.set_op_type */
  final def setOpType(`type`: Long): Unit = {
    if (gdext.classes.VisualShaderNodeMultiplyAdd.mb_set_op_type == null) gdext.classes.VisualShaderNodeMultiplyAdd.mb_set_op_type = MethodBind.get("VisualShaderNodeMultiplyAdd", "set_op_type", 1409862380L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeMultiplyAdd.mb_set_op_type, livePtr, `type`)
  }

  /** VisualShaderNodeMultiplyAdd.get_op_type */
  final def getOpType(): Long = {
    if (gdext.classes.VisualShaderNodeMultiplyAdd.mb_get_op_type == null) gdext.classes.VisualShaderNodeMultiplyAdd.mb_get_op_type = MethodBind.get("VisualShaderNodeMultiplyAdd", "get_op_type", 2823201991L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeMultiplyAdd.mb_get_op_type, livePtr)
  }

}

object VisualShaderNodeMultiplyAdd {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null
}
