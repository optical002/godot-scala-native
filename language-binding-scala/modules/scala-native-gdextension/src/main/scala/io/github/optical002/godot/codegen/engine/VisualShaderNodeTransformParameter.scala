package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTransformParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeTransformParameter extends VisualShaderNodeParameter {

  /** VisualShaderNodeTransformParameter.set_default_value_enabled */
  final def setDefaultValueEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTransformParameter", "set_default_value_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeTransformParameter.is_default_value_enabled */
  final def isDefaultValueEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeTransformParameter", "is_default_value_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeTransformParameter.set_default_value */
  final def setDefaultValue(value: io.github.optical002.godot.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTransformParameter", "set_default_value", 2952846383L), hostObject.objectPtr, value)

  /** VisualShaderNodeTransformParameter.get_default_value */
  final def getDefaultValue(): io.github.optical002.godot.builtin.Transform3D =
    Ptrcall.call0[io.github.optical002.godot.builtin.Transform3D](MethodBind.get("VisualShaderNodeTransformParameter", "get_default_value", 3229777777L), hostObject.objectPtr)

}

object VisualShaderNodeTransformParameter {
  /** Class metadata for Gd[VisualShaderNodeTransformParameter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTransformParameter] with {
    def className = "VisualShaderNodeTransformParameter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTransformParameter = new VisualShaderNodeTransformParameter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTransformParameter): GodotObject = t.hostObject
  }
}
