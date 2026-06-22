package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVec2Parameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeVec2Parameter extends VisualShaderNodeParameter {

  /** VisualShaderNodeVec2Parameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec2Parameter", "set_default_value_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeVec2Parameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeVec2Parameter", "is_default_value_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeVec2Parameter.set_default_value */
  final def setDefaultValue(value: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec2Parameter", "set_default_value", 743155724L), hostObject.objectPtr, value)

  /** VisualShaderNodeVec2Parameter.get_default_value */
  final def getDefaultValue(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("VisualShaderNodeVec2Parameter", "get_default_value", 3341600327L), hostObject.objectPtr)

}

object VisualShaderNodeVec2Parameter {
  /** Class metadata for Gd[VisualShaderNodeVec2Parameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVec2Parameter] with {
    def className = "VisualShaderNodeVec2Parameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVec2Parameter = new VisualShaderNodeVec2Parameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVec2Parameter): GodotObject = t.hostObject
  }
}
