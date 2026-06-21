package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeColorOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeColorOp extends VisualShaderNode {

  /** VisualShaderNodeColorOp.set_operator */
  final def setOperator(op: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeColorOp", "set_operator", 4260370673L), hostObject.objectPtr, op)

  /** VisualShaderNodeColorOp.get_operator */
  final def getOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeColorOp", "get_operator", 1950956529L), hostObject.objectPtr)

}

object VisualShaderNodeColorOp {
  /** Class metadata for Gd[VisualShaderNodeColorOp] lifetime management and casting. */
  given GodotClass[VisualShaderNodeColorOp] with {
    def className = "VisualShaderNodeColorOp"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeColorOp = new VisualShaderNodeColorOp {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeColorOp): GodotObject = t.hostObject
  }
}
