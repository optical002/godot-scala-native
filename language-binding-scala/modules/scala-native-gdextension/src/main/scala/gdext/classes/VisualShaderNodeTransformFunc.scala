package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTransformFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeTransformFunc"

  /** VisualShaderNodeTransformFunc.set_function */
  final def setFunction(func: Long): Unit = {
    if (gdext.classes.VisualShaderNodeTransformFunc.mb_set_function == null) gdext.classes.VisualShaderNodeTransformFunc.mb_set_function = MethodBind.get("VisualShaderNodeTransformFunc", "set_function", 2900990409L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTransformFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeTransformFunc.get_function */
  final def getFunction(): Long = {
    if (gdext.classes.VisualShaderNodeTransformFunc.mb_get_function == null) gdext.classes.VisualShaderNodeTransformFunc.mb_get_function = MethodBind.get("VisualShaderNodeTransformFunc", "get_function", 2839926569L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTransformFunc.mb_get_function, livePtr)
  }

}

object VisualShaderNodeTransformFunc {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null
}
