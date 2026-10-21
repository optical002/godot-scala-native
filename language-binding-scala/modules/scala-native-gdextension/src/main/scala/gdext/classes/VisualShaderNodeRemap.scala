package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeRemap`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeRemap extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeRemap"

  /** VisualShaderNodeRemap.set_op_type */
  final def setOpType(op_type: Long): Unit = {
    if (gdext.classes.VisualShaderNodeRemap.mb_set_op_type == null) gdext.classes.VisualShaderNodeRemap.mb_set_op_type = MethodBind.get("VisualShaderNodeRemap", "set_op_type", 1703697889L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeRemap.mb_set_op_type, livePtr, op_type)
  }

  /** VisualShaderNodeRemap.get_op_type */
  final def getOpType(): Long = {
    if (gdext.classes.VisualShaderNodeRemap.mb_get_op_type == null) gdext.classes.VisualShaderNodeRemap.mb_get_op_type = MethodBind.get("VisualShaderNodeRemap", "get_op_type", 1678380563L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeRemap.mb_get_op_type, livePtr)
  }

}

object VisualShaderNodeRemap {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null
}
