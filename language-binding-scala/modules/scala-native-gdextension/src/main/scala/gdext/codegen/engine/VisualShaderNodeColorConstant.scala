package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeColorConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeColorConstant extends VisualShaderNodeConstant {

  /** VisualShaderNodeColorConstant.set_constant */
  final def setConstant(constant: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeColorConstant", "set_constant", 2920490490L), hostObject.objectPtr, constant)

  /** VisualShaderNodeColorConstant.get_constant */
  final def getConstant(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("VisualShaderNodeColorConstant", "get_constant", 3444240500L), hostObject.objectPtr)

}

object VisualShaderNodeColorConstant {
  /** Class metadata for Gd[VisualShaderNodeColorConstant] lifetime management and casting. */
  given GodotClass[VisualShaderNodeColorConstant] with {
    def className = "VisualShaderNodeColorConstant"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeColorConstant = new VisualShaderNodeColorConstant {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeColorConstant): GodotObject = t.hostObject
  }
}
