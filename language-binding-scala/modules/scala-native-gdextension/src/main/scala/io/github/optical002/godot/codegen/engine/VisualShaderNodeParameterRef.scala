package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParameterRef`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParameterRef extends VisualShaderNode {

  /** VisualShaderNodeParameterRef.set_parameter_name */
  final def setParameterName(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParameterRef", "set_parameter_name", 83702148L), hostObject.objectPtr, name)

  /** VisualShaderNodeParameterRef.get_parameter_name */
  final def getParameterName(): String =
    Ptrcall.call0[String](MethodBind.get("VisualShaderNodeParameterRef", "get_parameter_name", 201670096L), hostObject.objectPtr)

}

object VisualShaderNodeParameterRef {
  /** Class metadata for Gd[VisualShaderNodeParameterRef] lifetime management and casting. */
  given GodotClass[VisualShaderNodeParameterRef] with {
    def className = "VisualShaderNodeParameterRef"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeParameterRef = new VisualShaderNodeParameterRef {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeParameterRef): GodotObject = t.hostObject
  }
}
