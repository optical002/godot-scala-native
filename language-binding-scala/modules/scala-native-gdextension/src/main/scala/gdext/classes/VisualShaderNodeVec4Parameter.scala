package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeVec4Parameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeVec4Parameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeVec4Parameter"

  /** VisualShaderNodeVec4Parameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeVec4Parameter.mb_set_default_value_enabled == null) gdext.classes.VisualShaderNodeVec4Parameter.mb_set_default_value_enabled = MethodBind.get("VisualShaderNodeVec4Parameter", "set_default_value_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVec4Parameter.mb_set_default_value_enabled, livePtr, enabled)
  }

  /** VisualShaderNodeVec4Parameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean = {
    if (gdext.classes.VisualShaderNodeVec4Parameter.mb_is_default_value_enabled == null) gdext.classes.VisualShaderNodeVec4Parameter.mb_is_default_value_enabled = MethodBind.get("VisualShaderNodeVec4Parameter", "is_default_value_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeVec4Parameter.mb_is_default_value_enabled, livePtr)
  }

  /** VisualShaderNodeVec4Parameter.set_default_value */
  final def setDefaultValue(value: gdext.builtin.Vector4): Unit = {
    if (gdext.classes.VisualShaderNodeVec4Parameter.mb_set_default_value == null) gdext.classes.VisualShaderNodeVec4Parameter.mb_set_default_value = MethodBind.get("VisualShaderNodeVec4Parameter", "set_default_value", 643568085L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVec4Parameter.mb_set_default_value, livePtr, value)
  }

  /** VisualShaderNodeVec4Parameter.get_default_value */
  final def getDefaultValue(): gdext.builtin.Vector4 = {
    if (gdext.classes.VisualShaderNodeVec4Parameter.mb_get_default_value == null) gdext.classes.VisualShaderNodeVec4Parameter.mb_get_default_value = MethodBind.get("VisualShaderNodeVec4Parameter", "get_default_value", 2435802345L)
    Ptrcall.call0[gdext.builtin.Vector4](gdext.classes.VisualShaderNodeVec4Parameter.mb_get_default_value, livePtr)
  }

}

object VisualShaderNodeVec4Parameter {
  private[classes] var mb_set_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_value: GDExtensionMethodBindPtr = null
}
