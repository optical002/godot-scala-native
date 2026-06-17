package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeUIntParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeUIntParameter extends VisualShaderNodeParameter {

  /** VisualShaderNodeUIntParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeUIntParameter", "set_default_value_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeUIntParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeUIntParameter", "is_default_value_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeUIntParameter.set_default_value */
  final def setDefaultValue(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeUIntParameter", "set_default_value", 1286410249L), hostObject.objectPtr, value)

  /** VisualShaderNodeUIntParameter.get_default_value */
  final def getDefaultValue(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeUIntParameter", "get_default_value", 3905245786L), hostObject.objectPtr)

}

object VisualShaderNodeUIntParameter {
  /** Class metadata for Gd[VisualShaderNodeUIntParameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeUIntParameter] with {
    def className = "VisualShaderNodeUIntParameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeUIntParameter = new VisualShaderNodeUIntParameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeUIntParameter): GodotObject = t.hostObject
  }
}
