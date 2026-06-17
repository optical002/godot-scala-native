package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeColorParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeColorParameter extends VisualShaderNodeParameter {

  /** VisualShaderNodeColorParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeColorParameter", "set_default_value_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeColorParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeColorParameter", "is_default_value_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeColorParameter.set_default_value */
  final def setDefaultValue(value: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeColorParameter", "set_default_value", 2920490490L), hostObject.objectPtr, value)

  /** VisualShaderNodeColorParameter.get_default_value */
  final def getDefaultValue(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("VisualShaderNodeColorParameter", "get_default_value", 3444240500L), hostObject.objectPtr)

}

object VisualShaderNodeColorParameter {
  /** Class metadata for Gd[VisualShaderNodeColorParameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeColorParameter] with {
    def className = "VisualShaderNodeColorParameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeColorParameter = new VisualShaderNodeColorParameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeColorParameter): GodotObject = t.hostObject
  }
}
