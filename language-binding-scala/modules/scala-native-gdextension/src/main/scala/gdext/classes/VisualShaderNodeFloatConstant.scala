package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeFloatConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeFloatConstant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeFloatConstant"

  /** VisualShaderNodeFloatConstant.set_constant */
  final def setConstant(constant: Double): Unit = {
    if (gdext.classes.VisualShaderNodeFloatConstant.mb_set_constant == null) gdext.classes.VisualShaderNodeFloatConstant.mb_set_constant = MethodBind.get("VisualShaderNodeFloatConstant", "set_constant", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFloatConstant.mb_set_constant, livePtr, constant)
  }

  /** VisualShaderNodeFloatConstant.get_constant */
  final def getConstant(): Double = {
    if (gdext.classes.VisualShaderNodeFloatConstant.mb_get_constant == null) gdext.classes.VisualShaderNodeFloatConstant.mb_get_constant = MethodBind.get("VisualShaderNodeFloatConstant", "get_constant", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VisualShaderNodeFloatConstant.mb_get_constant, livePtr)
  }

}

object VisualShaderNodeFloatConstant {
  private[classes] var mb_set_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant: GDExtensionMethodBindPtr = null
}
