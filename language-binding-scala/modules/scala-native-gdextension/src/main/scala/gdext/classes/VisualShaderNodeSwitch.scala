package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeSwitch`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeSwitch extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeSwitch"

  /** VisualShaderNodeSwitch.set_op_type */
  final def setOpType(`type`: Long): Unit = {
    if (gdext.classes.VisualShaderNodeSwitch.mb_set_op_type == null) gdext.classes.VisualShaderNodeSwitch.mb_set_op_type = MethodBind.get("VisualShaderNodeSwitch", "set_op_type", 510471861L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeSwitch.mb_set_op_type, livePtr, `type`)
  }

  /** VisualShaderNodeSwitch.get_op_type */
  final def getOpType(): Long = {
    if (gdext.classes.VisualShaderNodeSwitch.mb_get_op_type == null) gdext.classes.VisualShaderNodeSwitch.mb_get_op_type = MethodBind.get("VisualShaderNodeSwitch", "get_op_type", 2517845071L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeSwitch.mb_get_op_type, livePtr)
  }

}

object VisualShaderNodeSwitch {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null
}
