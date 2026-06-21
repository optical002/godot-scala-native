package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTransformOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformOp extends VisualShaderNode {

  /** VisualShaderNodeTransformOp.set_operator */
  final def setOperator(op: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTransformOp", "set_operator", 2287310733L), hostObject.objectPtr, op)

  /** VisualShaderNodeTransformOp.get_operator */
  final def getOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeTransformOp", "get_operator", 1238663601L), hostObject.objectPtr)

}

object VisualShaderNodeTransformOp {
  /** Class metadata for Gd[VisualShaderNodeTransformOp] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTransformOp] with {
    def className = "VisualShaderNodeTransformOp"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTransformOp = new VisualShaderNodeTransformOp {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTransformOp): GodotObject = t.hostObject
  }
}
