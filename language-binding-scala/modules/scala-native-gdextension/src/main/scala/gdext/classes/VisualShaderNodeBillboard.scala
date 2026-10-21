package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeBillboard`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeBillboard extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeBillboard"

  /** VisualShaderNodeBillboard.set_billboard_type */
  final def setBillboardType(billboard_type: Long): Unit = {
    if (gdext.classes.VisualShaderNodeBillboard.mb_set_billboard_type == null) gdext.classes.VisualShaderNodeBillboard.mb_set_billboard_type = MethodBind.get("VisualShaderNodeBillboard", "set_billboard_type", 1227463289L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeBillboard.mb_set_billboard_type, livePtr, billboard_type)
  }

  /** VisualShaderNodeBillboard.get_billboard_type */
  final def getBillboardType(): Long = {
    if (gdext.classes.VisualShaderNodeBillboard.mb_get_billboard_type == null) gdext.classes.VisualShaderNodeBillboard.mb_get_billboard_type = MethodBind.get("VisualShaderNodeBillboard", "get_billboard_type", 3724188517L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeBillboard.mb_get_billboard_type, livePtr)
  }

  /** VisualShaderNodeBillboard.set_keep_scale_enabled */
  final def setKeepScaleEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeBillboard.mb_set_keep_scale_enabled == null) gdext.classes.VisualShaderNodeBillboard.mb_set_keep_scale_enabled = MethodBind.get("VisualShaderNodeBillboard", "set_keep_scale_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeBillboard.mb_set_keep_scale_enabled, livePtr, enabled)
  }

  /** VisualShaderNodeBillboard.is_keep_scale_enabled */
  final def isKeepScaleEnabled(): Boolean = {
    if (gdext.classes.VisualShaderNodeBillboard.mb_is_keep_scale_enabled == null) gdext.classes.VisualShaderNodeBillboard.mb_is_keep_scale_enabled = MethodBind.get("VisualShaderNodeBillboard", "is_keep_scale_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeBillboard.mb_is_keep_scale_enabled, livePtr)
  }

}

object VisualShaderNodeBillboard {
  private[classes] var mb_set_billboard_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_billboard_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keep_scale_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_keep_scale_enabled: GDExtensionMethodBindPtr = null
}
