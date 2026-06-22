package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeIntParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeIntParameter extends VisualShaderNodeParameter {

  /** VisualShaderNodeIntParameter.set_hint */
  final def setHint(hint: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIntParameter", "set_hint", 2540512075L), hostObject.objectPtr, hint)

  /** VisualShaderNodeIntParameter.get_hint */
  final def getHint(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeIntParameter", "get_hint", 4250814924L), hostObject.objectPtr)

  /** VisualShaderNodeIntParameter.set_min */
  final def setMin(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIntParameter", "set_min", 1286410249L), hostObject.objectPtr, value)

  /** VisualShaderNodeIntParameter.get_min */
  final def getMin(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeIntParameter", "get_min", 3905245786L), hostObject.objectPtr)

  /** VisualShaderNodeIntParameter.set_max */
  final def setMax(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIntParameter", "set_max", 1286410249L), hostObject.objectPtr, value)

  /** VisualShaderNodeIntParameter.get_max */
  final def getMax(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeIntParameter", "get_max", 3905245786L), hostObject.objectPtr)

  /** VisualShaderNodeIntParameter.set_step */
  final def setStep(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIntParameter", "set_step", 1286410249L), hostObject.objectPtr, value)

  /** VisualShaderNodeIntParameter.get_step */
  final def getStep(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeIntParameter", "get_step", 3905245786L), hostObject.objectPtr)

  /** VisualShaderNodeIntParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIntParameter", "set_default_value_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeIntParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeIntParameter", "is_default_value_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeIntParameter.set_default_value */
  final def setDefaultValue(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIntParameter", "set_default_value", 1286410249L), hostObject.objectPtr, value)

  /** VisualShaderNodeIntParameter.get_default_value */
  final def getDefaultValue(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeIntParameter", "get_default_value", 3905245786L), hostObject.objectPtr)

}

object VisualShaderNodeIntParameter {
  /** Class metadata for Gd[VisualShaderNodeIntParameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeIntParameter] with {
    def className = "VisualShaderNodeIntParameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeIntParameter = new VisualShaderNodeIntParameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeIntParameter): GodotObject = t.hostObject
  }
}
