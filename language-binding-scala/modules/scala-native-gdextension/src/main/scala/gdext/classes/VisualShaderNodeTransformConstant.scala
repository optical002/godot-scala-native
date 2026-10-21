package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTransformConstant`, extends `VisualShaderNodeConstant`. */
abstract class VisualShaderNodeTransformConstant extends VisualShaderNodeConstant {
  override def godotClassName: String = "VisualShaderNodeTransformConstant"

  /** VisualShaderNodeTransformConstant.set_constant */
  final def setConstant(constant: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.VisualShaderNodeTransformConstant.mb_set_constant == null) gdext.classes.VisualShaderNodeTransformConstant.mb_set_constant = MethodBind.get("VisualShaderNodeTransformConstant", "set_constant", 2952846383L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTransformConstant.mb_set_constant, livePtr, constant)
  }

  /** VisualShaderNodeTransformConstant.get_constant */
  final def getConstant(): gdext.builtin.Transform3D = {
    if (gdext.classes.VisualShaderNodeTransformConstant.mb_get_constant == null) gdext.classes.VisualShaderNodeTransformConstant.mb_get_constant = MethodBind.get("VisualShaderNodeTransformConstant", "get_constant", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.VisualShaderNodeTransformConstant.mb_get_constant, livePtr)
  }

}

object VisualShaderNodeTransformConstant {
  private[classes] var mb_set_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant: GDExtensionMethodBindPtr = null
}
