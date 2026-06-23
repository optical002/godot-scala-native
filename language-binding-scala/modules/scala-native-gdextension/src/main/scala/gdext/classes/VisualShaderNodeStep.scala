package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeStep`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeStep extends VisualShaderNode {

  /** VisualShaderNodeStep.set_op_type */
  final def setOpType(op_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeStep", "set_op_type", 715172489L), hostObject.objectPtr, op_type)

  /** VisualShaderNodeStep.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeStep", "get_op_type", 3274022781L), hostObject.objectPtr)

}

object VisualShaderNodeStep {
  /** Class metadata for Gd[VisualShaderNodeStep] lifetime management and casting. */
  given GodotClass[VisualShaderNodeStep] with {
    def className = "VisualShaderNodeStep"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeStep = new VisualShaderNodeStep {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeStep): GodotObject = t.hostObject
  }
}
