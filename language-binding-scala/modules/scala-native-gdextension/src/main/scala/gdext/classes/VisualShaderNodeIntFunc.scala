package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeIntFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIntFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeIntFunc"

  /** VisualShaderNodeIntFunc.set_function */
  final def setFunction(func: Long): Unit = {
    if (gdext.classes.VisualShaderNodeIntFunc.mb_set_function == null) gdext.classes.VisualShaderNodeIntFunc.mb_set_function = MethodBind.get("VisualShaderNodeIntFunc", "set_function", 424195284L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeIntFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeIntFunc.get_function */
  final def getFunction(): Long = {
    if (gdext.classes.VisualShaderNodeIntFunc.mb_get_function == null) gdext.classes.VisualShaderNodeIntFunc.mb_get_function = MethodBind.get("VisualShaderNodeIntFunc", "get_function", 2753496911L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeIntFunc.mb_get_function, livePtr)
  }

}

object VisualShaderNodeIntFunc {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null
}
