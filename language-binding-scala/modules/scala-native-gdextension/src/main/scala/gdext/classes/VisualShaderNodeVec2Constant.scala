package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVec2Constant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeVec2Constant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeVec2Constant"

  /** VisualShaderNodeVec2Constant.set_constant */
  final def setConstant(constant: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec2Constant", "set_constant", 743155724L), hostObject.objectPtr, constant)

  /** VisualShaderNodeVec2Constant.get_constant */
  final def getConstant(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("VisualShaderNodeVec2Constant", "get_constant", 3341600327L), hostObject.objectPtr)

}
