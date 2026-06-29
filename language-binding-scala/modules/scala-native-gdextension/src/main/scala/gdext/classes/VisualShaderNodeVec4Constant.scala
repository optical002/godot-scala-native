package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVec4Constant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeVec4Constant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeVec4Constant"

  /** VisualShaderNodeVec4Constant.set_constant */
  final def setConstant(constant: gdext.builtin.Quaternion): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec4Constant", "set_constant", 1727505552L), hostObject.objectPtr, constant)

  /** VisualShaderNodeVec4Constant.get_constant */
  final def getConstant(): gdext.builtin.Quaternion =
    Ptrcall.call0[gdext.builtin.Quaternion](MethodBind.get("VisualShaderNodeVec4Constant", "get_constant", 1222331677L), hostObject.objectPtr)

}
