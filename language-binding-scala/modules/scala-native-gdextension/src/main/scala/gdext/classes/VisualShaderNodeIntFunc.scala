package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeIntFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIntFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeIntFunc"

  /** VisualShaderNodeIntFunc.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIntFunc", "set_function", 424195284L), hostObject.objectPtr, func)

  /** VisualShaderNodeIntFunc.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeIntFunc", "get_function", 2753496911L), hostObject.objectPtr)

}
