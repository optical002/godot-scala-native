package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeIntConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeIntConstant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeIntConstant"

  /** VisualShaderNodeIntConstant.set_constant */
  final def setConstant(constant: Long): Unit = {
    if (gdext.classes.VisualShaderNodeIntConstant.mb_set_constant == null) gdext.classes.VisualShaderNodeIntConstant.mb_set_constant = MethodBind.get("VisualShaderNodeIntConstant", "set_constant", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeIntConstant.mb_set_constant, livePtr, constant)
  }

  /** VisualShaderNodeIntConstant.get_constant */
  final def getConstant(): Long = {
    if (gdext.classes.VisualShaderNodeIntConstant.mb_get_constant == null) gdext.classes.VisualShaderNodeIntConstant.mb_get_constant = MethodBind.get("VisualShaderNodeIntConstant", "get_constant", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeIntConstant.mb_get_constant, livePtr)
  }

}

object VisualShaderNodeIntConstant {
  private[classes] var mb_set_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant: GDExtensionMethodBindPtr = null
}
