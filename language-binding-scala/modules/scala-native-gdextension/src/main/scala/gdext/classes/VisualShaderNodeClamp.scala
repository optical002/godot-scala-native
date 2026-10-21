package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeClamp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeClamp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeClamp"

  /** VisualShaderNodeClamp.set_op_type */
  final def setOpType(op_type: Long): Unit = {
    if (gdext.classes.VisualShaderNodeClamp.mb_set_op_type == null) gdext.classes.VisualShaderNodeClamp.mb_set_op_type = MethodBind.get("VisualShaderNodeClamp", "set_op_type", 405010749L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeClamp.mb_set_op_type, livePtr, op_type)
  }

  /** VisualShaderNodeClamp.get_op_type */
  final def getOpType(): Long = {
    if (gdext.classes.VisualShaderNodeClamp.mb_get_op_type == null) gdext.classes.VisualShaderNodeClamp.mb_get_op_type = MethodBind.get("VisualShaderNodeClamp", "get_op_type", 233276050L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeClamp.mb_get_op_type, livePtr)
  }

}

object VisualShaderNodeClamp {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null
}
