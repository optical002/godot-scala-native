package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeVec3Constant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeVec3Constant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeVec3Constant"

  /** VisualShaderNodeVec3Constant.set_constant */
  final def setConstant(constant: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.VisualShaderNodeVec3Constant.mb_set_constant == null) gdext.classes.VisualShaderNodeVec3Constant.mb_set_constant = MethodBind.get("VisualShaderNodeVec3Constant", "set_constant", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVec3Constant.mb_set_constant, livePtr, constant)
  }

  /** VisualShaderNodeVec3Constant.get_constant */
  final def getConstant(): gdext.builtin.Vector3 = {
    if (gdext.classes.VisualShaderNodeVec3Constant.mb_get_constant == null) gdext.classes.VisualShaderNodeVec3Constant.mb_get_constant = MethodBind.get("VisualShaderNodeVec3Constant", "get_constant", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.VisualShaderNodeVec3Constant.mb_get_constant, livePtr)
  }

}

object VisualShaderNodeVec3Constant {
  private[classes] var mb_set_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant: GDExtensionMethodBindPtr = null
}
