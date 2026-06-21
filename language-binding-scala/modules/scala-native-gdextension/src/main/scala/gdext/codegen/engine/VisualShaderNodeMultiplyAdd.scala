package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeMultiplyAdd`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeMultiplyAdd extends VisualShaderNode {

  /** VisualShaderNodeMultiplyAdd.set_op_type */
  final def setOpType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeMultiplyAdd", "set_op_type", 1409862380L), hostObject.objectPtr, `type`)

  /** VisualShaderNodeMultiplyAdd.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeMultiplyAdd", "get_op_type", 2823201991L), hostObject.objectPtr)

}

object VisualShaderNodeMultiplyAdd {
  /** Class metadata for Gd[VisualShaderNodeMultiplyAdd] lifetime management and casting. */
  given GodotClass[VisualShaderNodeMultiplyAdd] with {
    def className = "VisualShaderNodeMultiplyAdd"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeMultiplyAdd = new VisualShaderNodeMultiplyAdd {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeMultiplyAdd): GodotObject = t.hostObject
  }
}
