package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeClamp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeClamp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeClamp"

  /** VisualShaderNodeClamp.set_op_type */
  final def setOpType(op_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeClamp", "set_op_type", 405010749L), hostObject.objectPtr, op_type)

  /** VisualShaderNodeClamp.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeClamp", "get_op_type", 233276050L), hostObject.objectPtr)

}
