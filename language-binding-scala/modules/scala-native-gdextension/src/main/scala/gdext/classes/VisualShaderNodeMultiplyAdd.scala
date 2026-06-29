package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeMultiplyAdd`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeMultiplyAdd extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeMultiplyAdd"

  /** VisualShaderNodeMultiplyAdd.set_op_type */
  final def setOpType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeMultiplyAdd", "set_op_type", 1409862380L), hostObject.objectPtr, `type`)

  /** VisualShaderNodeMultiplyAdd.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeMultiplyAdd", "get_op_type", 2823201991L), hostObject.objectPtr)

}
