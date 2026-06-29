package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeColorConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeColorConstant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeColorConstant"

  /** VisualShaderNodeColorConstant.set_constant */
  final def setConstant(constant: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeColorConstant", "set_constant", 2920490490L), hostObject.objectPtr, constant)

  /** VisualShaderNodeColorConstant.get_constant */
  final def getConstant(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("VisualShaderNodeColorConstant", "get_constant", 3444240500L), hostObject.objectPtr)

}
