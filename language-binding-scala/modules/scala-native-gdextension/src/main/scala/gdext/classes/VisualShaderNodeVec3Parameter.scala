package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVec3Parameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeVec3Parameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeVec3Parameter"

  /** VisualShaderNodeVec3Parameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec3Parameter", "set_default_value_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeVec3Parameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeVec3Parameter", "is_default_value_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeVec3Parameter.set_default_value */
  final def setDefaultValue(value: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec3Parameter", "set_default_value", 3460891852L), hostObject.objectPtr, value)

  /** VisualShaderNodeVec3Parameter.get_default_value */
  final def getDefaultValue(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("VisualShaderNodeVec3Parameter", "get_default_value", 3360562783L), hostObject.objectPtr)

}
