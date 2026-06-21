package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeDerivativeFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeDerivativeFunc extends VisualShaderNode {

  /** VisualShaderNodeDerivativeFunc.set_op_type */
  final def setOpType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeDerivativeFunc", "set_op_type", 377800221L), hostObject.objectPtr, `type`)

  /** VisualShaderNodeDerivativeFunc.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeDerivativeFunc", "get_op_type", 3997800514L), hostObject.objectPtr)

  /** VisualShaderNodeDerivativeFunc.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeDerivativeFunc", "set_function", 1944704156L), hostObject.objectPtr, func)

  /** VisualShaderNodeDerivativeFunc.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeDerivativeFunc", "get_function", 2389093396L), hostObject.objectPtr)

  /** VisualShaderNodeDerivativeFunc.set_precision */
  final def setPrecision(precision: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeDerivativeFunc", "set_precision", 797270566L), hostObject.objectPtr, precision)

  /** VisualShaderNodeDerivativeFunc.get_precision */
  final def getPrecision(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeDerivativeFunc", "get_precision", 3822547323L), hostObject.objectPtr)

}

object VisualShaderNodeDerivativeFunc {
  /** Class metadata for Gd[VisualShaderNodeDerivativeFunc] lifetime management and casting. */
  given GodotClass[VisualShaderNodeDerivativeFunc] with {
    def className = "VisualShaderNodeDerivativeFunc"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeDerivativeFunc = new VisualShaderNodeDerivativeFunc {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeDerivativeFunc): GodotObject = t.hostObject
  }
}
