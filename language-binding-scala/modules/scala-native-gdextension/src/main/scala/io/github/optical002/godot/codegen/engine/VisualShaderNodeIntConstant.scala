package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeIntConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeIntConstant extends VisualShaderNodeConstant {

  /** VisualShaderNodeIntConstant.set_constant */
  final def setConstant(constant: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIntConstant", "set_constant", 1286410249L), hostObject.objectPtr, constant)

  /** VisualShaderNodeIntConstant.get_constant */
  final def getConstant(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeIntConstant", "get_constant", 3905245786L), hostObject.objectPtr)

}

object VisualShaderNodeIntConstant {
  /** Class metadata for Gd[VisualShaderNodeIntConstant] lifetime management and casting. */
  given GodotClass[VisualShaderNodeIntConstant] with {
    def className = "VisualShaderNodeIntConstant"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeIntConstant = new VisualShaderNodeIntConstant {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeIntConstant): GodotObject = t.hostObject
  }
}
