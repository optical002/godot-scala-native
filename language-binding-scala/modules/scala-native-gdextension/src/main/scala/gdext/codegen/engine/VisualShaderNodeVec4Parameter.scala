package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVec4Parameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeVec4Parameter extends VisualShaderNodeParameter {

  /** VisualShaderNodeVec4Parameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec4Parameter", "set_default_value_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeVec4Parameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeVec4Parameter", "is_default_value_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeVec4Parameter.set_default_value */
  final def setDefaultValue(value: gdext.builtin.Vector4): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec4Parameter", "set_default_value", 643568085L), hostObject.objectPtr, value)

  /** VisualShaderNodeVec4Parameter.get_default_value */
  final def getDefaultValue(): gdext.builtin.Vector4 =
    Ptrcall.call0[gdext.builtin.Vector4](MethodBind.get("VisualShaderNodeVec4Parameter", "get_default_value", 2435802345L), hostObject.objectPtr)

}

object VisualShaderNodeVec4Parameter {
  /** Class metadata for Gd[VisualShaderNodeVec4Parameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVec4Parameter] with {
    def className = "VisualShaderNodeVec4Parameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVec4Parameter = new VisualShaderNodeVec4Parameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVec4Parameter): GodotObject = t.hostObject
  }
}
