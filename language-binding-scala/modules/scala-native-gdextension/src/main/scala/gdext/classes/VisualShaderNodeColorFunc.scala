package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeColorFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeColorFunc extends VisualShaderNode {

  /** VisualShaderNodeColorFunc.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeColorFunc", "set_function", 3973396138L), hostObject.objectPtr, func)

  /** VisualShaderNodeColorFunc.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeColorFunc", "get_function", 554863321L), hostObject.objectPtr)

}

object VisualShaderNodeColorFunc {
  /** Class metadata for Gd[VisualShaderNodeColorFunc] lifetime management and casting. */
  given GodotClass[VisualShaderNodeColorFunc] with {
    def className = "VisualShaderNodeColorFunc"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeColorFunc = new VisualShaderNodeColorFunc {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeColorFunc): GodotObject = t.hostObject
  }
}
