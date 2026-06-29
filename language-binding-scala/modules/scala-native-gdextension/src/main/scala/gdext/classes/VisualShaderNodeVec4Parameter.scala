package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVec4Parameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeVec4Parameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeVec4Parameter"

  /** VisualShaderNodeVec4Parameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec4Parameter", "set_default_value_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeVec4Parameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeVec4Parameter", "is_default_value_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeVec4Parameter.set_default_value */
  final def setDefaultValue(value: gdext.builtin.Vector4): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec4Parameter", "set_default_value", 643568085L), hostObject.objectPtr, value)

  /** VisualShaderNodeVec4Parameter.get_default_value */
  final def getDefaultValue(): gdext.builtin.Vector4 =
    Ptrcall.call0[gdext.builtin.Vector4](MethodBind.get("VisualShaderNodeVec4Parameter", "get_default_value", 2435802345L), hostObject.objectPtr)

}
