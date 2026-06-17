package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeFloatOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeFloatOp extends VisualShaderNode {

  /** VisualShaderNodeFloatOp.set_operator */
  final def setOperator(op: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFloatOp", "set_operator", 2488468047L), hostObject.objectPtr, op)

  /** VisualShaderNodeFloatOp.get_operator */
  final def getOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeFloatOp", "get_operator", 1867979390L), hostObject.objectPtr)

}

object VisualShaderNodeFloatOp {
  /** Class metadata for Gd[VisualShaderNodeFloatOp] lifetime management and casting. */
  given GodotClass[VisualShaderNodeFloatOp] with {
    def className = "VisualShaderNodeFloatOp"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeFloatOp = new VisualShaderNodeFloatOp {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeFloatOp): GodotObject = t.hostObject
  }
}
