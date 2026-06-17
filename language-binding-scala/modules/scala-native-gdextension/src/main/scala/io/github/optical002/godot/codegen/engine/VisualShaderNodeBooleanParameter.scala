package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeBooleanParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeBooleanParameter extends VisualShaderNodeParameter {

  /** VisualShaderNodeBooleanParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeBooleanParameter", "set_default_value_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeBooleanParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeBooleanParameter", "is_default_value_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeBooleanParameter.set_default_value */
  final def setDefaultValue(value: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeBooleanParameter", "set_default_value", 2586408642L), hostObject.objectPtr, value)

  /** VisualShaderNodeBooleanParameter.get_default_value */
  final def getDefaultValue(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeBooleanParameter", "get_default_value", 36873697L), hostObject.objectPtr)

}

object VisualShaderNodeBooleanParameter {
  /** Class metadata for Gd[VisualShaderNodeBooleanParameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeBooleanParameter] with {
    def className = "VisualShaderNodeBooleanParameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeBooleanParameter = new VisualShaderNodeBooleanParameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeBooleanParameter): GodotObject = t.hostObject
  }
}
