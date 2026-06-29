package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeUIntFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeUIntFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeUIntFunc"

  /** VisualShaderNodeUIntFunc.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeUIntFunc", "set_function", 2273148961L), hostObject.objectPtr, func)

  /** VisualShaderNodeUIntFunc.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeUIntFunc", "get_function", 4187123296L), hostObject.objectPtr)

}
