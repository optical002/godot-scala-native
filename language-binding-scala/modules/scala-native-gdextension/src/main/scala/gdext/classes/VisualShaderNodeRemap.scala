package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeRemap`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeRemap extends VisualShaderNode {

  /** VisualShaderNodeRemap.set_op_type */
  final def setOpType(op_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeRemap", "set_op_type", 1703697889L), hostObject.objectPtr, op_type)

  /** VisualShaderNodeRemap.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeRemap", "get_op_type", 1678380563L), hostObject.objectPtr)

}

object VisualShaderNodeRemap {
  /** Class metadata for Gd[VisualShaderNodeRemap] lifetime management and casting. */
  given GodotClass[VisualShaderNodeRemap] with {
    def className = "VisualShaderNodeRemap"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeRemap = new VisualShaderNodeRemap {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeRemap): GodotObject = t.hostObject
  }
}
