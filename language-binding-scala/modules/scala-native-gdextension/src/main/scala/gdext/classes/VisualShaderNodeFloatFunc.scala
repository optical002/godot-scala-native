package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeFloatFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeFloatFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeFloatFunc"

  /** VisualShaderNodeFloatFunc.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFloatFunc", "set_function", 536026177L), hostObject.objectPtr, func)

  /** VisualShaderNodeFloatFunc.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeFloatFunc", "get_function", 2033948868L), hostObject.objectPtr)

}
