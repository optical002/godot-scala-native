package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVec3Constant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeVec3Constant extends VisualShaderNodeConstant {

  /** VisualShaderNodeVec3Constant.set_constant */
  final def setConstant(constant: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec3Constant", "set_constant", 3460891852L), hostObject.objectPtr, constant)

  /** VisualShaderNodeVec3Constant.get_constant */
  final def getConstant(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("VisualShaderNodeVec3Constant", "get_constant", 3360562783L), hostObject.objectPtr)

}

object VisualShaderNodeVec3Constant {
  /** Class metadata for Gd[VisualShaderNodeVec3Constant] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVec3Constant] with {
    def className = "VisualShaderNodeVec3Constant"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVec3Constant = new VisualShaderNodeVec3Constant {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVec3Constant): GodotObject = t.hostObject
  }
}
