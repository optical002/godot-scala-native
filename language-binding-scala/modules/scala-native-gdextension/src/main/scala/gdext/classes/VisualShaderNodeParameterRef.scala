package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParameterRef`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParameterRef extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParameterRef"

  /** VisualShaderNodeParameterRef.set_parameter_name */
  final def setParameterName(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParameterRef", "set_parameter_name", 83702148L), hostObject.objectPtr, name)

  /** VisualShaderNodeParameterRef.get_parameter_name */
  final def getParameterName(): String =
    Ptrcall.call0[String](MethodBind.get("VisualShaderNodeParameterRef", "get_parameter_name", 201670096L), hostObject.objectPtr)

}
