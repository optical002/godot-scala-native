package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeVec3Parameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeVec3Parameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeVec3Parameter"

  /** VisualShaderNodeVec3Parameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeVec3Parameter.mb_set_default_value_enabled == null) gdext.classes.VisualShaderNodeVec3Parameter.mb_set_default_value_enabled = MethodBind.get("VisualShaderNodeVec3Parameter", "set_default_value_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVec3Parameter.mb_set_default_value_enabled, livePtr, enabled)
  }

  /** VisualShaderNodeVec3Parameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean = {
    if (gdext.classes.VisualShaderNodeVec3Parameter.mb_is_default_value_enabled == null) gdext.classes.VisualShaderNodeVec3Parameter.mb_is_default_value_enabled = MethodBind.get("VisualShaderNodeVec3Parameter", "is_default_value_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeVec3Parameter.mb_is_default_value_enabled, livePtr)
  }

  /** VisualShaderNodeVec3Parameter.set_default_value */
  final def setDefaultValue(value: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.VisualShaderNodeVec3Parameter.mb_set_default_value == null) gdext.classes.VisualShaderNodeVec3Parameter.mb_set_default_value = MethodBind.get("VisualShaderNodeVec3Parameter", "set_default_value", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVec3Parameter.mb_set_default_value, livePtr, value)
  }

  /** VisualShaderNodeVec3Parameter.get_default_value */
  final def getDefaultValue(): gdext.builtin.Vector3 = {
    if (gdext.classes.VisualShaderNodeVec3Parameter.mb_get_default_value == null) gdext.classes.VisualShaderNodeVec3Parameter.mb_get_default_value = MethodBind.get("VisualShaderNodeVec3Parameter", "get_default_value", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.VisualShaderNodeVec3Parameter.mb_get_default_value, livePtr)
  }

}

object VisualShaderNodeVec3Parameter {
  private[classes] var mb_set_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_value: GDExtensionMethodBindPtr = null
}
