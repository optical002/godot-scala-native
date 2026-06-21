package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeFloatFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeFloatFunc extends VisualShaderNode {

  /** VisualShaderNodeFloatFunc.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFloatFunc", "set_function", 536026177L), hostObject.objectPtr, func)

  /** VisualShaderNodeFloatFunc.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeFloatFunc", "get_function", 2033948868L), hostObject.objectPtr)

}

object VisualShaderNodeFloatFunc {
  /** Class metadata for Gd[VisualShaderNodeFloatFunc] lifetime management and casting. */
  given GodotClass[VisualShaderNodeFloatFunc] with {
    def className = "VisualShaderNodeFloatFunc"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeFloatFunc = new VisualShaderNodeFloatFunc {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeFloatFunc): GodotObject = t.hostObject
  }
}
