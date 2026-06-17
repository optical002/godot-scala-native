package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeFloatConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeFloatConstant extends VisualShaderNodeConstant {

  /** VisualShaderNodeFloatConstant.set_constant */
  final def setConstant(constant: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFloatConstant", "set_constant", 373806689L), hostObject.objectPtr, constant)

  /** VisualShaderNodeFloatConstant.get_constant */
  final def getConstant(): Double =
    Ptrcall.call0[Double](MethodBind.get("VisualShaderNodeFloatConstant", "get_constant", 1740695150L), hostObject.objectPtr)

}

object VisualShaderNodeFloatConstant {
  /** Class metadata for Gd[VisualShaderNodeFloatConstant] lifetime management and casting. */
  given GodotClass[VisualShaderNodeFloatConstant] with {
    def className = "VisualShaderNodeFloatConstant"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeFloatConstant = new VisualShaderNodeFloatConstant {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeFloatConstant): GodotObject = t.hostObject
  }
}
