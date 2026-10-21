package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeUIntFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeUIntFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeUIntFunc"

  /** VisualShaderNodeUIntFunc.set_function */
  final def setFunction(func: Long): Unit = {
    if (gdext.classes.VisualShaderNodeUIntFunc.mb_set_function == null) gdext.classes.VisualShaderNodeUIntFunc.mb_set_function = MethodBind.get("VisualShaderNodeUIntFunc", "set_function", 2273148961L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeUIntFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeUIntFunc.get_function */
  final def getFunction(): Long = {
    if (gdext.classes.VisualShaderNodeUIntFunc.mb_get_function == null) gdext.classes.VisualShaderNodeUIntFunc.mb_get_function = MethodBind.get("VisualShaderNodeUIntFunc", "get_function", 4187123296L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeUIntFunc.mb_get_function, livePtr)
  }

}

object VisualShaderNodeUIntFunc {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null
}
