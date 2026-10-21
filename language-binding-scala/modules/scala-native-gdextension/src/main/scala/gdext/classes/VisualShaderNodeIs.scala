package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeIs`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIs extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeIs"

  /** VisualShaderNodeIs.set_function */
  final def setFunction(func: Long): Unit = {
    if (gdext.classes.VisualShaderNodeIs.mb_set_function == null) gdext.classes.VisualShaderNodeIs.mb_set_function = MethodBind.get("VisualShaderNodeIs", "set_function", 1438374690L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeIs.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeIs.get_function */
  final def getFunction(): Long = {
    if (gdext.classes.VisualShaderNodeIs.mb_get_function == null) gdext.classes.VisualShaderNodeIs.mb_get_function = MethodBind.get("VisualShaderNodeIs", "get_function", 580678557L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeIs.mb_get_function, livePtr)
  }

}

object VisualShaderNodeIs {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null
}
