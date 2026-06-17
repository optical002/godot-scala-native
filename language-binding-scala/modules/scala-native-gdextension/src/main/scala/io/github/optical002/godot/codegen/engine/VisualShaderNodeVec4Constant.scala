package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVec4Constant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeVec4Constant extends VisualShaderNodeConstant {

  /** VisualShaderNodeVec4Constant.set_constant */
  final def setConstant(constant: io.github.optical002.godot.builtin.Quaternion): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVec4Constant", "set_constant", 1727505552L), hostObject.objectPtr, constant)

  /** VisualShaderNodeVec4Constant.get_constant */
  final def getConstant(): io.github.optical002.godot.builtin.Quaternion =
    Ptrcall.call0[io.github.optical002.godot.builtin.Quaternion](MethodBind.get("VisualShaderNodeVec4Constant", "get_constant", 1222331677L), hostObject.objectPtr)

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
