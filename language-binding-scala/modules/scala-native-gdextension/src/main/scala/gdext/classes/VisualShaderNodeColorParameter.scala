package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeColorParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeColorParameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeColorParameter"

  /** VisualShaderNodeColorParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeColorParameter", "set_default_value_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeColorParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeColorParameter", "is_default_value_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeColorParameter.set_default_value */
  final def setDefaultValue(value: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeColorParameter", "set_default_value", 2920490490L), hostObject.objectPtr, value)

  /** VisualShaderNodeColorParameter.get_default_value */
  final def getDefaultValue(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("VisualShaderNodeColorParameter", "get_default_value", 3444240500L), hostObject.objectPtr)

}
