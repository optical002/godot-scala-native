package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVec2Constant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeVec2Constant extends VisualShaderNodeConstant {

  /** VisualShaderNodeVec2Constant.set_constant */
  final def setConstant(constant: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec2Constant", "set_constant", 743155724L), hostObject.objectPtr, constant)

  /** VisualShaderNodeVec2Constant.get_constant */
  final def getConstant(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("VisualShaderNodeVec2Constant", "get_constant", 3341600327L), hostObject.objectPtr)

}

object VisualShaderNodeVec2Constant {
  /** Class metadata for Gd[VisualShaderNodeVec2Constant] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVec2Constant] with {
    def className = "VisualShaderNodeVec2Constant"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVec2Constant = new VisualShaderNodeVec2Constant {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVec2Constant): GodotObject = t.hostObject
  }
}
