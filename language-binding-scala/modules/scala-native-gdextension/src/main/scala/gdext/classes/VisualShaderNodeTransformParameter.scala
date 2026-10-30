package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTransformParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeTransformParameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeTransformParameter"

  /** VisualShaderNodeTransformParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeTransformParameter.mb_set_default_value_enabled == null) gdext.classes.VisualShaderNodeTransformParameter.mb_set_default_value_enabled = MethodBind.get("VisualShaderNodeTransformParameter", "set_default_value_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTransformParameter.mb_set_default_value_enabled, livePtr, enabled)
  }

  /** VisualShaderNodeTransformParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean = {
    if (gdext.classes.VisualShaderNodeTransformParameter.mb_is_default_value_enabled == null) gdext.classes.VisualShaderNodeTransformParameter.mb_is_default_value_enabled = MethodBind.get("VisualShaderNodeTransformParameter", "is_default_value_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeTransformParameter.mb_is_default_value_enabled, livePtr)
  }

  /** VisualShaderNodeTransformParameter.set_default_value */
  final def setDefaultValue(value: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.VisualShaderNodeTransformParameter.mb_set_default_value == null) gdext.classes.VisualShaderNodeTransformParameter.mb_set_default_value = MethodBind.get("VisualShaderNodeTransformParameter", "set_default_value", 2952846383L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTransformParameter.mb_set_default_value, livePtr, value)
  }

  /** VisualShaderNodeTransformParameter.get_default_value */
  final def getDefaultValue(): gdext.builtin.Transform3D = {
    if (gdext.classes.VisualShaderNodeTransformParameter.mb_get_default_value == null) gdext.classes.VisualShaderNodeTransformParameter.mb_get_default_value = MethodBind.get("VisualShaderNodeTransformParameter", "get_default_value", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.VisualShaderNodeTransformParameter.mb_get_default_value, livePtr)
  }

}

object VisualShaderNodeTransformParameter {
  private[classes] var mb_set_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_value: GDExtensionMethodBindPtr = null
}
