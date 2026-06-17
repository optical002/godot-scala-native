package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVec3Constant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeVec3Constant extends VisualShaderNodeConstant {

  /** VisualShaderNodeVec3Constant.set_constant */
  final def setConstant(constant: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec3Constant", "set_constant", 3460891852L), hostObject.objectPtr, constant)

  /** VisualShaderNodeVec3Constant.get_constant */
  final def getConstant(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("VisualShaderNodeVec3Constant", "get_constant", 3360562783L), hostObject.objectPtr)

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
