package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeBooleanConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeBooleanConstant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeBooleanConstant"

  /** VisualShaderNodeBooleanConstant.set_constant */
  final def setConstant(constant: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeBooleanConstant.mb_set_constant == null) gdext.classes.VisualShaderNodeBooleanConstant.mb_set_constant = MethodBind.get("VisualShaderNodeBooleanConstant", "set_constant", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeBooleanConstant.mb_set_constant, livePtr, constant)
  }

  /** VisualShaderNodeBooleanConstant.get_constant */
  final def getConstant(): Boolean = {
    if (gdext.classes.VisualShaderNodeBooleanConstant.mb_get_constant == null) gdext.classes.VisualShaderNodeBooleanConstant.mb_get_constant = MethodBind.get("VisualShaderNodeBooleanConstant", "get_constant", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeBooleanConstant.mb_get_constant, livePtr)
  }

}

object VisualShaderNodeBooleanConstant {
  private[classes] var mb_set_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant: GDExtensionMethodBindPtr = null
}
