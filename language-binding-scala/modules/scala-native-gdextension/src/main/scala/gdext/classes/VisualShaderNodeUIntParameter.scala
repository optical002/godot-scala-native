package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeUIntParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeUIntParameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeUIntParameter"

  /** VisualShaderNodeUIntParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeUIntParameter.mb_set_default_value_enabled == null) gdext.classes.VisualShaderNodeUIntParameter.mb_set_default_value_enabled = MethodBind.get("VisualShaderNodeUIntParameter", "set_default_value_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeUIntParameter.mb_set_default_value_enabled, livePtr, enabled)
  }

  /** VisualShaderNodeUIntParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean = {
    if (gdext.classes.VisualShaderNodeUIntParameter.mb_is_default_value_enabled == null) gdext.classes.VisualShaderNodeUIntParameter.mb_is_default_value_enabled = MethodBind.get("VisualShaderNodeUIntParameter", "is_default_value_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeUIntParameter.mb_is_default_value_enabled, livePtr)
  }

  /** VisualShaderNodeUIntParameter.set_default_value */
  final def setDefaultValue(value: Long): Unit = {
    if (gdext.classes.VisualShaderNodeUIntParameter.mb_set_default_value == null) gdext.classes.VisualShaderNodeUIntParameter.mb_set_default_value = MethodBind.get("VisualShaderNodeUIntParameter", "set_default_value", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeUIntParameter.mb_set_default_value, livePtr, value)
  }

  /** VisualShaderNodeUIntParameter.get_default_value */
  final def getDefaultValue(): Long = {
    if (gdext.classes.VisualShaderNodeUIntParameter.mb_get_default_value == null) gdext.classes.VisualShaderNodeUIntParameter.mb_get_default_value = MethodBind.get("VisualShaderNodeUIntParameter", "get_default_value", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeUIntParameter.mb_get_default_value, livePtr)
  }

}

object VisualShaderNodeUIntParameter {
  private[classes] var mb_set_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_value: GDExtensionMethodBindPtr = null
}
