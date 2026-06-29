package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeUVFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeUVFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeUVFunc"

  /** VisualShaderNodeUVFunc.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeUVFunc", "set_function", 765791915L), hostObject.objectPtr, func)

  /** VisualShaderNodeUVFunc.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeUVFunc", "get_function", 3772902164L), hostObject.objectPtr)

}
