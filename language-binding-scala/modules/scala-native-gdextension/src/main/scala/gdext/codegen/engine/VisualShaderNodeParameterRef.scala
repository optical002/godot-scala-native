package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
