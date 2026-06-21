package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeIntFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIntFunc extends VisualShaderNode {

  /** VisualShaderNodeIntFunc.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIntFunc", "set_function", 424195284L), hostObject.objectPtr, func)

  /** VisualShaderNodeIntFunc.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeIntFunc", "get_function", 2753496911L), hostObject.objectPtr)

}

object VisualShaderNodeIntFunc {
  /** Class metadata for Gd[VisualShaderNodeIntFunc] lifetime management and casting. */
  given GodotClass[VisualShaderNodeIntFunc] with {
    def className = "VisualShaderNodeIntFunc"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeIntFunc = new VisualShaderNodeIntFunc {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeIntFunc): GodotObject = t.hostObject
  }
}
