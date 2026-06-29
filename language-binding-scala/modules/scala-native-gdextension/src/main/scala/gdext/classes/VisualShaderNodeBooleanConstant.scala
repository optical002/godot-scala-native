package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeBooleanConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeBooleanConstant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeBooleanConstant"

  /** VisualShaderNodeBooleanConstant.set_constant */
  final def setConstant(constant: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeBooleanConstant", "set_constant", 2586408642L), hostObject.objectPtr, constant)

  /** VisualShaderNodeBooleanConstant.get_constant */
  final def getConstant(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeBooleanConstant", "get_constant", 36873697L), hostObject.objectPtr)

}
