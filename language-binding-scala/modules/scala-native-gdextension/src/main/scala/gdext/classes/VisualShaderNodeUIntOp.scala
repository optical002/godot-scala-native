package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeUIntOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeUIntOp extends VisualShaderNode {

  /** VisualShaderNodeUIntOp.set_operator */
  final def setOperator(op: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeUIntOp", "set_operator", 3463048345L), hostObject.objectPtr, op)

  /** VisualShaderNodeUIntOp.get_operator */
  final def getOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeUIntOp", "get_operator", 256631461L), hostObject.objectPtr)

}

object VisualShaderNodeUIntOp {
  /** Class metadata for Gd[VisualShaderNodeUIntOp] lifetime management and casting. */
  given GodotClass[VisualShaderNodeUIntOp] with {
    def className = "VisualShaderNodeUIntOp"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeUIntOp = new VisualShaderNodeUIntOp {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeUIntOp): GodotObject = t.hostObject
  }
}
