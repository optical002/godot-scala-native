package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeVec2Constant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeVec2Constant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeVec2Constant"

  /** VisualShaderNodeVec2Constant.set_constant */
  final def setConstant(constant: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.VisualShaderNodeVec2Constant.mb_set_constant == null) gdext.classes.VisualShaderNodeVec2Constant.mb_set_constant = MethodBind.get("VisualShaderNodeVec2Constant", "set_constant", 743155724L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVec2Constant.mb_set_constant, livePtr, constant)
  }

  /** VisualShaderNodeVec2Constant.get_constant */
  final def getConstant(): gdext.builtin.Vector2 = {
    if (gdext.classes.VisualShaderNodeVec2Constant.mb_get_constant == null) gdext.classes.VisualShaderNodeVec2Constant.mb_get_constant = MethodBind.get("VisualShaderNodeVec2Constant", "get_constant", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.VisualShaderNodeVec2Constant.mb_get_constant, livePtr)
  }

}

object VisualShaderNodeVec2Constant {
  private[classes] var mb_set_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant: GDExtensionMethodBindPtr = null
}
