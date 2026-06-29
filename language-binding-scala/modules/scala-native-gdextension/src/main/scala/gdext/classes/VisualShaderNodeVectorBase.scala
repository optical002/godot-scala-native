package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorBase`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeVectorBase extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeVectorBase"

  /** VisualShaderNodeVectorBase.set_op_type */
  final def setOpType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVectorBase", "set_op_type", 1692596998L), hostObject.objectPtr, `type`)

  /** VisualShaderNodeVectorBase.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeVectorBase", "get_op_type", 2568738462L), hostObject.objectPtr)

}
