package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVec3Parameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeVec3Parameter extends VisualShaderNodeParameter {

  /** VisualShaderNodeVec3Parameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec3Parameter", "set_default_value_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeVec3Parameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeVec3Parameter", "is_default_value_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeVec3Parameter.set_default_value */
  final def setDefaultValue(value: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec3Parameter", "set_default_value", 3460891852L), hostObject.objectPtr, value)

  /** VisualShaderNodeVec3Parameter.get_default_value */
  final def getDefaultValue(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("VisualShaderNodeVec3Parameter", "get_default_value", 3360562783L), hostObject.objectPtr)

}

object VisualShaderNodeVec3Parameter {
  /** Class metadata for Gd[VisualShaderNodeVec3Parameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVec3Parameter] with {
    def className = "VisualShaderNodeVec3Parameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVec3Parameter = new VisualShaderNodeVec3Parameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVec3Parameter): GodotObject = t.hostObject
  }
}
