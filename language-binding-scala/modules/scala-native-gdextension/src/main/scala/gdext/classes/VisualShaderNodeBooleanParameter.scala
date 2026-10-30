package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeBooleanParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeBooleanParameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeBooleanParameter"

  /** VisualShaderNodeBooleanParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeBooleanParameter.mb_set_default_value_enabled == null) gdext.classes.VisualShaderNodeBooleanParameter.mb_set_default_value_enabled = MethodBind.get("VisualShaderNodeBooleanParameter", "set_default_value_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeBooleanParameter.mb_set_default_value_enabled, livePtr, enabled)
  }

  /** VisualShaderNodeBooleanParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean = {
    if (gdext.classes.VisualShaderNodeBooleanParameter.mb_is_default_value_enabled == null) gdext.classes.VisualShaderNodeBooleanParameter.mb_is_default_value_enabled = MethodBind.get("VisualShaderNodeBooleanParameter", "is_default_value_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeBooleanParameter.mb_is_default_value_enabled, livePtr)
  }

  /** VisualShaderNodeBooleanParameter.set_default_value */
  final def setDefaultValue(value: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeBooleanParameter.mb_set_default_value == null) gdext.classes.VisualShaderNodeBooleanParameter.mb_set_default_value = MethodBind.get("VisualShaderNodeBooleanParameter", "set_default_value", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeBooleanParameter.mb_set_default_value, livePtr, value)
  }

  /** VisualShaderNodeBooleanParameter.get_default_value */
  final def getDefaultValue(): Boolean = {
    if (gdext.classes.VisualShaderNodeBooleanParameter.mb_get_default_value == null) gdext.classes.VisualShaderNodeBooleanParameter.mb_get_default_value = MethodBind.get("VisualShaderNodeBooleanParameter", "get_default_value", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeBooleanParameter.mb_get_default_value, livePtr)
  }

}

object VisualShaderNodeBooleanParameter {
  private[classes] var mb_set_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_value: GDExtensionMethodBindPtr = null
}
