package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeColorFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeColorFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeColorFunc"

  /** VisualShaderNodeColorFunc.set_function */
  final def setFunction(func: Long): Unit = {
    if (gdext.classes.VisualShaderNodeColorFunc.mb_set_function == null) gdext.classes.VisualShaderNodeColorFunc.mb_set_function = MethodBind.get("VisualShaderNodeColorFunc", "set_function", 3973396138L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeColorFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeColorFunc.get_function */
  final def getFunction(): Long = {
    if (gdext.classes.VisualShaderNodeColorFunc.mb_get_function == null) gdext.classes.VisualShaderNodeColorFunc.mb_get_function = MethodBind.get("VisualShaderNodeColorFunc", "get_function", 554863321L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeColorFunc.mb_get_function, livePtr)
  }

}

object VisualShaderNodeColorFunc {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null
}
