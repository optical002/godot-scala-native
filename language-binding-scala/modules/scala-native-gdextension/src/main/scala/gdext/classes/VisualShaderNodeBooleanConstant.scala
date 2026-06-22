package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeBooleanConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeBooleanConstant extends VisualShaderNodeConstant {

  /** VisualShaderNodeBooleanConstant.set_constant */
  final def setConstant(constant: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeBooleanConstant", "set_constant", 2586408642L), hostObject.objectPtr, constant)

  /** VisualShaderNodeBooleanConstant.get_constant */
  final def getConstant(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeBooleanConstant", "get_constant", 36873697L), hostObject.objectPtr)

}

object VisualShaderNodeBooleanConstant {
  /** Class metadata for Gd[VisualShaderNodeBooleanConstant] lifetime management and casting. */
  given GodotClass[VisualShaderNodeBooleanConstant] with {
    def className = "VisualShaderNodeBooleanConstant"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeBooleanConstant = new VisualShaderNodeBooleanConstant {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeBooleanConstant): GodotObject = t.hostObject
  }
}
