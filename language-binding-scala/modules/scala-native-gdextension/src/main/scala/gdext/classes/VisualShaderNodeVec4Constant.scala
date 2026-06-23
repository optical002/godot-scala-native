package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVec4Constant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeVec4Constant extends VisualShaderNodeConstant {

  /** VisualShaderNodeVec4Constant.set_constant */
  final def setConstant(constant: gdext.builtin.Quaternion): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec4Constant", "set_constant", 1727505552L), hostObject.objectPtr, constant)

  /** VisualShaderNodeVec4Constant.get_constant */
  final def getConstant(): gdext.builtin.Quaternion =
    Ptrcall.call0[gdext.builtin.Quaternion](MethodBind.get("VisualShaderNodeVec4Constant", "get_constant", 1222331677L), hostObject.objectPtr)

}

object VisualShaderNodeVec4Constant {
  /** Class metadata for Gd[VisualShaderNodeVec4Constant] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVec4Constant] with {
    def className = "VisualShaderNodeVec4Constant"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVec4Constant = new VisualShaderNodeVec4Constant {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVec4Constant): GodotObject = t.hostObject
  }
}
