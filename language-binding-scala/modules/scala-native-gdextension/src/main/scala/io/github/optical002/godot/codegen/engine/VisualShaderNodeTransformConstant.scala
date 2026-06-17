package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTransformConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeTransformConstant extends VisualShaderNodeConstant {

  /** VisualShaderNodeTransformConstant.set_constant */
  final def setConstant(constant: io.github.optical002.godot.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTransformConstant", "set_constant", 2952846383L), hostObject.objectPtr, constant)

  /** VisualShaderNodeTransformConstant.get_constant */
  final def getConstant(): io.github.optical002.godot.builtin.Transform3D =
    Ptrcall.call0[io.github.optical002.godot.builtin.Transform3D](MethodBind.get("VisualShaderNodeTransformConstant", "get_constant", 3229777777L), hostObject.objectPtr)

}

object VisualShaderNodeTransformConstant {
  /** Class metadata for Gd[VisualShaderNodeTransformConstant] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTransformConstant] with {
    def className = "VisualShaderNodeTransformConstant"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTransformConstant = new VisualShaderNodeTransformConstant {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTransformConstant): GodotObject = t.hostObject
  }
}
