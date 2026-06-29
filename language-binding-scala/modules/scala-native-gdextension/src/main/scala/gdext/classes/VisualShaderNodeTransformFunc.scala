package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTransformFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeTransformFunc"

  /** VisualShaderNodeTransformFunc.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTransformFunc", "set_function", 2900990409L), hostObject.objectPtr, func)

  /** VisualShaderNodeTransformFunc.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeTransformFunc", "get_function", 2839926569L), hostObject.objectPtr)

}
