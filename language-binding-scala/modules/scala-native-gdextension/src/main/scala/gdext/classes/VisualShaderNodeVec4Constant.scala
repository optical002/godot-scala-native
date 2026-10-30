package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeVec4Constant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeVec4Constant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeVec4Constant"

  /** VisualShaderNodeVec4Constant.set_constant */
  final def setConstant(constant: gdext.builtin.Quaternion): Unit = {
    if (gdext.classes.VisualShaderNodeVec4Constant.mb_set_constant == null) gdext.classes.VisualShaderNodeVec4Constant.mb_set_constant = MethodBind.get("VisualShaderNodeVec4Constant", "set_constant", 1727505552L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVec4Constant.mb_set_constant, livePtr, constant)
  }

  /** VisualShaderNodeVec4Constant.get_constant */
  final def getConstant(): gdext.builtin.Quaternion = {
    if (gdext.classes.VisualShaderNodeVec4Constant.mb_get_constant == null) gdext.classes.VisualShaderNodeVec4Constant.mb_get_constant = MethodBind.get("VisualShaderNodeVec4Constant", "get_constant", 1222331677L)
    Ptrcall.call0[gdext.builtin.Quaternion](gdext.classes.VisualShaderNodeVec4Constant.mb_get_constant, livePtr)
  }

}

object VisualShaderNodeVec4Constant {
  private[classes] var mb_set_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant: GDExtensionMethodBindPtr = null
}
