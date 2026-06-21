package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTransformVecMult`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformVecMult extends VisualShaderNode {

  /** VisualShaderNodeTransformVecMult.set_operator */
  final def setOperator(op: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTransformVecMult", "set_operator", 1785665912L), hostObject.objectPtr, op)

  /** VisualShaderNodeTransformVecMult.get_operator */
  final def getOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeTransformVecMult", "get_operator", 1622088722L), hostObject.objectPtr)

}

object VisualShaderNodeTransformVecMult {
  /** Class metadata for Gd[VisualShaderNodeTransformVecMult] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTransformVecMult] with {
    def className = "VisualShaderNodeTransformVecMult"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTransformVecMult = new VisualShaderNodeTransformVecMult {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTransformVecMult): GodotObject = t.hostObject
  }
}
