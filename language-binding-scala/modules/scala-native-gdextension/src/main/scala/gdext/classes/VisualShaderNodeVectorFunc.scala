package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorFunc`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorFunc extends VisualShaderNodeVectorBase {
  override def godotClassName: String = "VisualShaderNodeVectorFunc"

  /** VisualShaderNodeVectorFunc.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVectorFunc", "set_function", 629964457L), hostObject.objectPtr, func)

  /** VisualShaderNodeVectorFunc.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeVectorFunc", "get_function", 4047776843L), hostObject.objectPtr)

}
