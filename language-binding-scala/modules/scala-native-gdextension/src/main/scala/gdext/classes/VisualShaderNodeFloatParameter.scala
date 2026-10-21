package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeFloatParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeFloatParameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeFloatParameter"

  /** VisualShaderNodeFloatParameter.set_hint */
  final def setHint(hint: Long): Unit = {
    if (gdext.classes.VisualShaderNodeFloatParameter.mb_set_hint == null) gdext.classes.VisualShaderNodeFloatParameter.mb_set_hint = MethodBind.get("VisualShaderNodeFloatParameter", "set_hint", 3712586466L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFloatParameter.mb_set_hint, livePtr, hint)
  }

  /** VisualShaderNodeFloatParameter.get_hint */
  final def getHint(): Long = {
    if (gdext.classes.VisualShaderNodeFloatParameter.mb_get_hint == null) gdext.classes.VisualShaderNodeFloatParameter.mb_get_hint = MethodBind.get("VisualShaderNodeFloatParameter", "get_hint", 3042240429L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeFloatParameter.mb_get_hint, livePtr)
  }

  /** VisualShaderNodeFloatParameter.set_min */
  final def setMin(value: Double): Unit = {
    if (gdext.classes.VisualShaderNodeFloatParameter.mb_set_min == null) gdext.classes.VisualShaderNodeFloatParameter.mb_set_min = MethodBind.get("VisualShaderNodeFloatParameter", "set_min", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFloatParameter.mb_set_min, livePtr, value)
  }

  /** VisualShaderNodeFloatParameter.get_min */
  final def getMin(): Double = {
    if (gdext.classes.VisualShaderNodeFloatParameter.mb_get_min == null) gdext.classes.VisualShaderNodeFloatParameter.mb_get_min = MethodBind.get("VisualShaderNodeFloatParameter", "get_min", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VisualShaderNodeFloatParameter.mb_get_min, livePtr)
  }

  /** VisualShaderNodeFloatParameter.set_max */
  final def setMax(value: Double): Unit = {
    if (gdext.classes.VisualShaderNodeFloatParameter.mb_set_max == null) gdext.classes.VisualShaderNodeFloatParameter.mb_set_max = MethodBind.get("VisualShaderNodeFloatParameter", "set_max", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFloatParameter.mb_set_max, livePtr, value)
  }

  /** VisualShaderNodeFloatParameter.get_max */
  final def getMax(): Double = {
    if (gdext.classes.VisualShaderNodeFloatParameter.mb_get_max == null) gdext.classes.VisualShaderNodeFloatParameter.mb_get_max = MethodBind.get("VisualShaderNodeFloatParameter", "get_max", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VisualShaderNodeFloatParameter.mb_get_max, livePtr)
  }

  /** VisualShaderNodeFloatParameter.set_step */
  final def setStep(value: Double): Unit = {
    if (gdext.classes.VisualShaderNodeFloatParameter.mb_set_step == null) gdext.classes.VisualShaderNodeFloatParameter.mb_set_step = MethodBind.get("VisualShaderNodeFloatParameter", "set_step", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFloatParameter.mb_set_step, livePtr, value)
  }

  /** VisualShaderNodeFloatParameter.get_step */
  final def getStep(): Double = {
    if (gdext.classes.VisualShaderNodeFloatParameter.mb_get_step == null) gdext.classes.VisualShaderNodeFloatParameter.mb_get_step = MethodBind.get("VisualShaderNodeFloatParameter", "get_step", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VisualShaderNodeFloatParameter.mb_get_step, livePtr)
  }

  /** VisualShaderNodeFloatParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeFloatParameter.mb_set_default_value_enabled == null) gdext.classes.VisualShaderNodeFloatParameter.mb_set_default_value_enabled = MethodBind.get("VisualShaderNodeFloatParameter", "set_default_value_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFloatParameter.mb_set_default_value_enabled, livePtr, enabled)
  }

  /** VisualShaderNodeFloatParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean = {
    if (gdext.classes.VisualShaderNodeFloatParameter.mb_is_default_value_enabled == null) gdext.classes.VisualShaderNodeFloatParameter.mb_is_default_value_enabled = MethodBind.get("VisualShaderNodeFloatParameter", "is_default_value_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeFloatParameter.mb_is_default_value_enabled, livePtr)
  }

  /** VisualShaderNodeFloatParameter.set_default_value */
  final def setDefaultValue(value: Double): Unit = {
    if (gdext.classes.VisualShaderNodeFloatParameter.mb_set_default_value == null) gdext.classes.VisualShaderNodeFloatParameter.mb_set_default_value = MethodBind.get("VisualShaderNodeFloatParameter", "set_default_value", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFloatParameter.mb_set_default_value, livePtr, value)
  }

  /** VisualShaderNodeFloatParameter.get_default_value */
  final def getDefaultValue(): Double = {
    if (gdext.classes.VisualShaderNodeFloatParameter.mb_get_default_value == null) gdext.classes.VisualShaderNodeFloatParameter.mb_get_default_value = MethodBind.get("VisualShaderNodeFloatParameter", "get_default_value", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VisualShaderNodeFloatParameter.mb_get_default_value, livePtr)
  }

}

object VisualShaderNodeFloatParameter {
  private[classes] var mb_set_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_default_value_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_value: GDExtensionMethodBindPtr = null
}
