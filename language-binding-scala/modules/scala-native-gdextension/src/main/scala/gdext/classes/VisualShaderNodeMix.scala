package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeMix`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeMix extends VisualShaderNode {

  /** VisualShaderNodeMix.set_op_type */
  final def setOpType(op_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeMix", "set_op_type", 3397501671L), hostObject.objectPtr, op_type)

  /** VisualShaderNodeMix.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeMix", "get_op_type", 4013957297L), hostObject.objectPtr)

}

object VisualShaderNodeMix {
  /** Class metadata for Gd[VisualShaderNodeMix] lifetime management and casting. */
  given GodotClass[VisualShaderNodeMix] with {
    def className = "VisualShaderNodeMix"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeMix = new VisualShaderNodeMix {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeMix): GodotObject = t.hostObject
  }
}
