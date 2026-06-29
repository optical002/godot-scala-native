package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTransformConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeTransformConstant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeTransformConstant"

  /** VisualShaderNodeTransformConstant.set_constant */
  final def setConstant(constant: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTransformConstant", "set_constant", 2952846383L), hostObject.objectPtr, constant)

  /** VisualShaderNodeTransformConstant.get_constant */
  final def getConstant(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("VisualShaderNodeTransformConstant", "get_constant", 3229777777L), hostObject.objectPtr)

}
