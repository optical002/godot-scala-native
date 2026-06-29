package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeIs`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIs extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeIs"

  /** VisualShaderNodeIs.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIs", "set_function", 1438374690L), hostObject.objectPtr, func)

  /** VisualShaderNodeIs.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeIs", "get_function", 580678557L), hostObject.objectPtr)

}
