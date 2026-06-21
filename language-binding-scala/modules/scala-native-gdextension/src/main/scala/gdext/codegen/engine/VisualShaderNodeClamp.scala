package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeClamp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeClamp extends VisualShaderNode {

  /** VisualShaderNodeClamp.set_op_type */
  final def setOpType(op_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeClamp", "set_op_type", 405010749L), hostObject.objectPtr, op_type)

  /** VisualShaderNodeClamp.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeClamp", "get_op_type", 233276050L), hostObject.objectPtr)

}

object VisualShaderNodeClamp {
  /** Class metadata for Gd[VisualShaderNodeClamp] lifetime management and casting. */
  given GodotClass[VisualShaderNodeClamp] with {
    def className = "VisualShaderNodeClamp"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeClamp = new VisualShaderNodeClamp {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeClamp): GodotObject = t.hostObject
  }
}
