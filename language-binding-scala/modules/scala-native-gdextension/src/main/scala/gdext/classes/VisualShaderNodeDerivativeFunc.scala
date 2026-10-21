package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeDerivativeFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeDerivativeFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeDerivativeFunc"

  /** VisualShaderNodeDerivativeFunc.set_op_type */
  final def setOpType(`type`: Long): Unit = {
    if (gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_op_type == null) gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_op_type = MethodBind.get("VisualShaderNodeDerivativeFunc", "set_op_type", 377800221L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_op_type, livePtr, `type`)
  }

  /** VisualShaderNodeDerivativeFunc.get_op_type */
  final def getOpType(): Long = {
    if (gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_op_type == null) gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_op_type = MethodBind.get("VisualShaderNodeDerivativeFunc", "get_op_type", 3997800514L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_op_type, livePtr)
  }

  /** VisualShaderNodeDerivativeFunc.set_function */
  final def setFunction(func: Long): Unit = {
    if (gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_function == null) gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_function = MethodBind.get("VisualShaderNodeDerivativeFunc", "set_function", 1944704156L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeDerivativeFunc.get_function */
  final def getFunction(): Long = {
    if (gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_function == null) gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_function = MethodBind.get("VisualShaderNodeDerivativeFunc", "get_function", 2389093396L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_function, livePtr)
  }

  /** VisualShaderNodeDerivativeFunc.set_precision */
  final def setPrecision(precision: Long): Unit = {
    if (gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_precision == null) gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_precision = MethodBind.get("VisualShaderNodeDerivativeFunc", "set_precision", 797270566L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_precision, livePtr, precision)
  }

  /** VisualShaderNodeDerivativeFunc.get_precision */
  final def getPrecision(): Long = {
    if (gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_precision == null) gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_precision = MethodBind.get("VisualShaderNodeDerivativeFunc", "get_precision", 3822547323L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_precision, livePtr)
  }

}

object VisualShaderNodeDerivativeFunc {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_precision: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_precision: GDExtensionMethodBindPtr = null
}
