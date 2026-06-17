package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeIntOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIntOp extends VisualShaderNode {

  /** VisualShaderNodeIntOp.set_operator */
  final def setOperator(op: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIntOp", "set_operator", 1677909323L), hostObject.objectPtr, op)

  /** VisualShaderNodeIntOp.get_operator */
  final def getOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeIntOp", "get_operator", 1236987913L), hostObject.objectPtr)

}

object VisualShaderNodeIntOp {
  /** Class metadata for Gd[VisualShaderNodeIntOp] lifetime management and casting. */
  given GodotClass[VisualShaderNodeIntOp] with {
    def className = "VisualShaderNodeIntOp"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeIntOp = new VisualShaderNodeIntOp {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeIntOp): GodotObject = t.hostObject
  }
}
