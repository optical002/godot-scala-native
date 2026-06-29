package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVec3Constant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeVec3Constant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeVec3Constant"

  /** VisualShaderNodeVec3Constant.set_constant */
  final def setConstant(constant: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec3Constant", "set_constant", 3460891852L), hostObject.objectPtr, constant)

  /** VisualShaderNodeVec3Constant.get_constant */
  final def getConstant(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("VisualShaderNodeVec3Constant", "get_constant", 3360562783L), hostObject.objectPtr)

}
