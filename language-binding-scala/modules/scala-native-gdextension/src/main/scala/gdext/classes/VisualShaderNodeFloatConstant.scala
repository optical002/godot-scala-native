package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeFloatConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeFloatConstant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeFloatConstant"

  /** VisualShaderNodeFloatConstant.set_constant */
  final def setConstant(constant: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFloatConstant", "set_constant", 373806689L), hostObject.objectPtr, constant)

  /** VisualShaderNodeFloatConstant.get_constant */
  final def getConstant(): Double =
    Ptrcall.call0[Double](MethodBind.get("VisualShaderNodeFloatConstant", "get_constant", 1740695150L), hostObject.objectPtr)

}
