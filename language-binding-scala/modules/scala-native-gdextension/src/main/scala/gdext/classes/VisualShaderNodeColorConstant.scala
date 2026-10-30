package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeColorConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeColorConstant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeColorConstant"

  /** VisualShaderNodeColorConstant.set_constant */
  final def setConstant(constant: gdext.builtin.Color): Unit = {
    if (gdext.classes.VisualShaderNodeColorConstant.mb_set_constant == null) gdext.classes.VisualShaderNodeColorConstant.mb_set_constant = MethodBind.get("VisualShaderNodeColorConstant", "set_constant", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeColorConstant.mb_set_constant, livePtr, constant)
  }

  /** VisualShaderNodeColorConstant.get_constant */
  final def getConstant(): gdext.builtin.Color = {
    if (gdext.classes.VisualShaderNodeColorConstant.mb_get_constant == null) gdext.classes.VisualShaderNodeColorConstant.mb_get_constant = MethodBind.get("VisualShaderNodeColorConstant", "get_constant", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.VisualShaderNodeColorConstant.mb_get_constant, livePtr)
  }

}

object VisualShaderNodeColorConstant {
  private[classes] var mb_set_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant: GDExtensionMethodBindPtr = null
}
