package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeColorConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeColorConstant extends VisualShaderNodeConstant {

  /** VisualShaderNodeColorConstant.set_constant */
  final def setConstant(constant: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeColorConstant", "set_constant", 2920490490L), hostObject.objectPtr, constant)

  /** VisualShaderNodeColorConstant.get_constant */
  final def getConstant(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("VisualShaderNodeColorConstant", "get_constant", 3444240500L), hostObject.objectPtr)

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
