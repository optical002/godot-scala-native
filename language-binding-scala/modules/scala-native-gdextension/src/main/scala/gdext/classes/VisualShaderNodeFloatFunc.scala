package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeFloatFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeFloatFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeFloatFunc"

  /** VisualShaderNodeFloatFunc.set_function */
  final def setFunction(func: Long): Unit = {
    if (gdext.classes.VisualShaderNodeFloatFunc.mb_set_function == null) gdext.classes.VisualShaderNodeFloatFunc.mb_set_function = MethodBind.get("VisualShaderNodeFloatFunc", "set_function", 536026177L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFloatFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeFloatFunc.get_function */
  final def getFunction(): Long = {
    if (gdext.classes.VisualShaderNodeFloatFunc.mb_get_function == null) gdext.classes.VisualShaderNodeFloatFunc.mb_get_function = MethodBind.get("VisualShaderNodeFloatFunc", "get_function", 2033948868L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeFloatFunc.mb_get_function, livePtr)
  }

}

object VisualShaderNodeFloatFunc {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null
}
