package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeUIntConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeUIntConstant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeUIntConstant"

  /** VisualShaderNodeUIntConstant.set_constant */
  final def setConstant(constant: Long): Unit = {
    if (gdext.classes.VisualShaderNodeUIntConstant.mb_set_constant == null) gdext.classes.VisualShaderNodeUIntConstant.mb_set_constant = MethodBind.get("VisualShaderNodeUIntConstant", "set_constant", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeUIntConstant.mb_set_constant, livePtr, constant)
  }

  /** VisualShaderNodeUIntConstant.get_constant */
  final def getConstant(): Long = {
    if (gdext.classes.VisualShaderNodeUIntConstant.mb_get_constant == null) gdext.classes.VisualShaderNodeUIntConstant.mb_get_constant = MethodBind.get("VisualShaderNodeUIntConstant", "get_constant", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeUIntConstant.mb_get_constant, livePtr)
  }

}

object VisualShaderNodeUIntConstant {
  private[classes] var mb_set_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant: GDExtensionMethodBindPtr = null
}
