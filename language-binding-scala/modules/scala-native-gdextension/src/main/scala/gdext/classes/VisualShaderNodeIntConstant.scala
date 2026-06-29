package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeIntConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeIntConstant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeIntConstant"

  /** VisualShaderNodeIntConstant.set_constant */
  final def setConstant(constant: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIntConstant", "set_constant", 1286410249L), hostObject.objectPtr, constant)

  /** VisualShaderNodeIntConstant.get_constant */
  final def getConstant(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeIntConstant", "get_constant", 3905245786L), hostObject.objectPtr)

}
