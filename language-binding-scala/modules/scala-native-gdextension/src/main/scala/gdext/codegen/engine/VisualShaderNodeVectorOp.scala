package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorOp`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorOp extends VisualShaderNodeVectorBase {

  /** VisualShaderNodeVectorOp.set_operator */
  final def setOperator(op: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVectorOp", "set_operator", 3371507302L), hostObject.objectPtr, op)

  /** VisualShaderNodeVectorOp.get_operator */
  final def getOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeVectorOp", "get_operator", 11793929L), hostObject.objectPtr)

}

object VisualShaderNodeVectorOp {
  /** Class metadata for Gd[VisualShaderNodeVectorOp] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVectorOp] with {
    def className = "VisualShaderNodeVectorOp"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVectorOp = new VisualShaderNodeVectorOp {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVectorOp): GodotObject = t.hostObject
  }
}
