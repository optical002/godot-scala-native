package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorBase`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeVectorBase extends VisualShaderNode {

  /** VisualShaderNodeVectorBase.set_op_type */
  final def setOpType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVectorBase", "set_op_type", 1692596998L), hostObject.objectPtr, `type`)

  /** VisualShaderNodeVectorBase.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeVectorBase", "get_op_type", 2568738462L), hostObject.objectPtr)

}

object VisualShaderNodeVectorBase {
  /** Class metadata for Gd[VisualShaderNodeVectorBase] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVectorBase] with {
    def className = "VisualShaderNodeVectorBase"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVectorBase = new VisualShaderNodeVectorBase {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVectorBase): GodotObject = t.hostObject
  }
}
