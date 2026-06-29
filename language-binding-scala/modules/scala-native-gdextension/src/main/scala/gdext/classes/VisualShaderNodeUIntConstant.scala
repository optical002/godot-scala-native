package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeUIntConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeUIntConstant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeUIntConstant"

  /** VisualShaderNodeUIntConstant.set_constant */
  final def setConstant(constant: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeUIntConstant", "set_constant", 1286410249L), hostObject.objectPtr, constant)

  /** VisualShaderNodeUIntConstant.get_constant */
  final def getConstant(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeUIntConstant", "get_constant", 3905245786L), hostObject.objectPtr)

}
