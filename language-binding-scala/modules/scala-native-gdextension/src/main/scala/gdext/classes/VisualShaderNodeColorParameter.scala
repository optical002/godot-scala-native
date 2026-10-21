package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeColorParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeColorParameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeColorParameter"

  /** VisualShaderNodeColorParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeColorParameter.mb_set_default_value_enabled == null) gdext.classes.VisualShaderNodeColorParameter.mb_set_default_value_enabled = MethodBind.get("VisualShaderNodeColorParameter", "set_default_value_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeColorParameter.mb_set_default_value_enabled, livePtr, enabled)
  }

  /** VisualShaderNodeColorParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean = {
    if (gdext.classes.VisualShaderNodeColorParameter.mb_is_default_value_enabled == null) gdext.classes.VisualShaderNodeColorParameter.mb_is_default_value_enabled = MethodBind.get("VisualShaderNodeColorParameter", "is_default_value_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeColorParameter.mb_is_default_value_enabled, livePtr)
  }

  /** VisualShaderNodeColorParameter.set_default_value */
  final def setDefaultValue(value: gdext.builtin.Color): Unit = {
    if (gdext.classes.VisualShaderNodeColorParameter.mb_set_default_value == null) gdext.classes.VisualShaderNodeColorParameter.mb_set_default_value = MethodBind.get("VisualShaderNodeColorParameter", "set_default_value", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeColorParameter.mb_set_default_value, livePtr, value)
  }

  /** VisualShaderNodeColorParameter.get_default_value */
  final def getDefaultValue(): gdext.builtin.Color = {
    if (gdext.classes.VisualShaderNodeColorParameter.mb_get_default_value == null) gdext.classes.VisualShaderNodeColorParameter.mb_get_default_value = MethodBind.get("VisualShaderNodeColorParameter", "get_default_value", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.VisualShaderNodeColorParameter.mb_get_default_value, livePtr)
  }

}

object VisualShaderNodeColorParameter {
  private[classes] var mb_set_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_value: GDExtensionMethodBindPtr = null
}
