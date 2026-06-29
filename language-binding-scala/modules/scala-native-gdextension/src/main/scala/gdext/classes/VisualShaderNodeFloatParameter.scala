package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeFloatParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeFloatParameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeFloatParameter"

  /** VisualShaderNodeFloatParameter.set_hint */
  final def setHint(hint: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFloatParameter", "set_hint", 3712586466L), hostObject.objectPtr, hint)

  /** VisualShaderNodeFloatParameter.get_hint */
  final def getHint(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeFloatParameter", "get_hint", 3042240429L), hostObject.objectPtr)

  /** VisualShaderNodeFloatParameter.set_min */
  final def setMin(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFloatParameter", "set_min", 373806689L), hostObject.objectPtr, value)

  /** VisualShaderNodeFloatParameter.get_min */
  final def getMin(): Double =
    Ptrcall.call0[Double](MethodBind.get("VisualShaderNodeFloatParameter", "get_min", 1740695150L), hostObject.objectPtr)

  /** VisualShaderNodeFloatParameter.set_max */
  final def setMax(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFloatParameter", "set_max", 373806689L), hostObject.objectPtr, value)

  /** VisualShaderNodeFloatParameter.get_max */
  final def getMax(): Double =
    Ptrcall.call0[Double](MethodBind.get("VisualShaderNodeFloatParameter", "get_max", 1740695150L), hostObject.objectPtr)

  /** VisualShaderNodeFloatParameter.set_step */
  final def setStep(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFloatParameter", "set_step", 373806689L), hostObject.objectPtr, value)

  /** VisualShaderNodeFloatParameter.get_step */
  final def getStep(): Double =
    Ptrcall.call0[Double](MethodBind.get("VisualShaderNodeFloatParameter", "get_step", 1740695150L), hostObject.objectPtr)

  /** VisualShaderNodeFloatParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFloatParameter", "set_default_value_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeFloatParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeFloatParameter", "is_default_value_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeFloatParameter.set_default_value */
  final def setDefaultValue(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFloatParameter", "set_default_value", 373806689L), hostObject.objectPtr, value)

  /** VisualShaderNodeFloatParameter.get_default_value */
  final def getDefaultValue(): Double =
    Ptrcall.call0[Double](MethodBind.get("VisualShaderNodeFloatParameter", "get_default_value", 1740695150L), hostObject.objectPtr)

}
