package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeVectorFunc`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorFunc extends VisualShaderNodeVectorBase {
  override def godotClassName: String = "VisualShaderNodeVectorFunc"

  /** VisualShaderNodeVectorFunc.set_function */
  final def setFunction(func: Long): Unit = {
    if (gdext.classes.VisualShaderNodeVectorFunc.mb_set_function == null) gdext.classes.VisualShaderNodeVectorFunc.mb_set_function = MethodBind.get("VisualShaderNodeVectorFunc", "set_function", 629964457L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVectorFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeVectorFunc.get_function */
  final def getFunction(): Long = {
    if (gdext.classes.VisualShaderNodeVectorFunc.mb_get_function == null) gdext.classes.VisualShaderNodeVectorFunc.mb_get_function = MethodBind.get("VisualShaderNodeVectorFunc", "get_function", 4047776843L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeVectorFunc.mb_get_function, livePtr)
  }

}

object VisualShaderNodeVectorFunc {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null
}
