package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeVec2Parameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeVec2Parameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeVec2Parameter"

  /** VisualShaderNodeVec2Parameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeVec2Parameter.mb_set_default_value_enabled == null) gdext.classes.VisualShaderNodeVec2Parameter.mb_set_default_value_enabled = MethodBind.get("VisualShaderNodeVec2Parameter", "set_default_value_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVec2Parameter.mb_set_default_value_enabled, livePtr, enabled)
  }

  /** VisualShaderNodeVec2Parameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean = {
    if (gdext.classes.VisualShaderNodeVec2Parameter.mb_is_default_value_enabled == null) gdext.classes.VisualShaderNodeVec2Parameter.mb_is_default_value_enabled = MethodBind.get("VisualShaderNodeVec2Parameter", "is_default_value_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeVec2Parameter.mb_is_default_value_enabled, livePtr)
  }

  /** VisualShaderNodeVec2Parameter.set_default_value */
  final def setDefaultValue(value: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.VisualShaderNodeVec2Parameter.mb_set_default_value == null) gdext.classes.VisualShaderNodeVec2Parameter.mb_set_default_value = MethodBind.get("VisualShaderNodeVec2Parameter", "set_default_value", 743155724L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVec2Parameter.mb_set_default_value, livePtr, value)
  }

  /** VisualShaderNodeVec2Parameter.get_default_value */
  final def getDefaultValue(): gdext.builtin.Vector2 = {
    if (gdext.classes.VisualShaderNodeVec2Parameter.mb_get_default_value == null) gdext.classes.VisualShaderNodeVec2Parameter.mb_get_default_value = MethodBind.get("VisualShaderNodeVec2Parameter", "get_default_value", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.VisualShaderNodeVec2Parameter.mb_get_default_value, livePtr)
  }

}

object VisualShaderNodeVec2Parameter {
  private[classes] var mb_set_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_value: GDExtensionMethodBindPtr = null
}
