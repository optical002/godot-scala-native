package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeUIntConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeUIntConstant extends VisualShaderNodeConstant {

  /** VisualShaderNodeUIntConstant.set_constant */
  final def setConstant(constant: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeUIntConstant", "set_constant", 1286410249L), hostObject.objectPtr, constant)

  /** VisualShaderNodeUIntConstant.get_constant */
  final def getConstant(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeUIntConstant", "get_constant", 3905245786L), hostObject.objectPtr)

}

object VisualShaderNodeUIntConstant {
  /** Class metadata for Gd[VisualShaderNodeUIntConstant] lifetime management and casting. */
  given GodotClass[VisualShaderNodeUIntConstant] with {
    def className = "VisualShaderNodeUIntConstant"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeUIntConstant = new VisualShaderNodeUIntConstant {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeUIntConstant): GodotObject = t.hostObject
  }
}
