package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeBillboard`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeBillboard extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeBillboard"

  /** VisualShaderNodeBillboard.set_billboard_type */
  final def setBillboardType(billboard_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeBillboard", "set_billboard_type", 1227463289L), hostObject.objectPtr, billboard_type)

  /** VisualShaderNodeBillboard.get_billboard_type */
  final def getBillboardType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeBillboard", "get_billboard_type", 3724188517L), hostObject.objectPtr)

  /** VisualShaderNodeBillboard.set_keep_scale_enabled */
  final def setKeepScaleEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeBillboard", "set_keep_scale_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeBillboard.is_keep_scale_enabled */
  final def isKeepScaleEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeBillboard", "is_keep_scale_enabled", 36873697L), hostObject.objectPtr)

}
