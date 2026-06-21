package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTransformFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformFunc extends VisualShaderNode {

  /** VisualShaderNodeTransformFunc.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTransformFunc", "set_function", 2900990409L), hostObject.objectPtr, func)

  /** VisualShaderNodeTransformFunc.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeTransformFunc", "get_function", 2839926569L), hostObject.objectPtr)

}

object VisualShaderNodeTransformFunc {
  /** Class metadata for Gd[VisualShaderNodeTransformFunc] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTransformFunc] with {
    def className = "VisualShaderNodeTransformFunc"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTransformFunc = new VisualShaderNodeTransformFunc {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTransformFunc): GodotObject = t.hostObject
  }
}
