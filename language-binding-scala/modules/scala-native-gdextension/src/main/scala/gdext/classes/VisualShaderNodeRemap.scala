package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeRemap`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeRemap extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeRemap"

  /** VisualShaderNodeRemap.set_op_type */
  final def setOpType(op_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeRemap", "set_op_type", 1703697889L), hostObject.objectPtr, op_type)

  /** VisualShaderNodeRemap.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeRemap", "get_op_type", 1678380563L), hostObject.objectPtr)

}
