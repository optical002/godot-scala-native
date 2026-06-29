package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeUIntParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeUIntParameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeUIntParameter"

  /** VisualShaderNodeUIntParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeUIntParameter", "set_default_value_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeUIntParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeUIntParameter", "is_default_value_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeUIntParameter.set_default_value */
  final def setDefaultValue(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeUIntParameter", "set_default_value", 1286410249L), hostObject.objectPtr, value)

  /** VisualShaderNodeUIntParameter.get_default_value */
  final def getDefaultValue(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeUIntParameter", "get_default_value", 3905245786L), hostObject.objectPtr)

}
