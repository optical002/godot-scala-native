package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVectorFunc`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorFunc extends VisualShaderNodeVectorBase {

  /** VisualShaderNodeVectorFunc.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVectorFunc", "set_function", 629964457L), hostObject.objectPtr, func)

  /** VisualShaderNodeVectorFunc.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeVectorFunc", "get_function", 4047776843L), hostObject.objectPtr)

}

object VisualShaderNodeVectorFunc {
  /** Class metadata for Gd[VisualShaderNodeVectorFunc] lifetime management and casting. */
  given GodotClass[VisualShaderNodeVectorFunc] with {
    def className = "VisualShaderNodeVectorFunc"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeVectorFunc = new VisualShaderNodeVectorFunc {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeVectorFunc): GodotObject = t.hostObject
  }
}
