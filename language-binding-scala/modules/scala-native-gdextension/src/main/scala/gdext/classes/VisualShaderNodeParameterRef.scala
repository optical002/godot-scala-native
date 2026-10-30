package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeParameterRef`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParameterRef extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParameterRef"

  /** VisualShaderNodeParameterRef.set_parameter_name */
  final def setParameterName(name: String): Unit = {
    if (gdext.classes.VisualShaderNodeParameterRef.mb_set_parameter_name == null) gdext.classes.VisualShaderNodeParameterRef.mb_set_parameter_name = MethodBind.get("VisualShaderNodeParameterRef", "set_parameter_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParameterRef.mb_set_parameter_name, livePtr, name)
  }

  /** VisualShaderNodeParameterRef.get_parameter_name */
  final def getParameterName(): String = {
    if (gdext.classes.VisualShaderNodeParameterRef.mb_get_parameter_name == null) gdext.classes.VisualShaderNodeParameterRef.mb_get_parameter_name = MethodBind.get("VisualShaderNodeParameterRef", "get_parameter_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.VisualShaderNodeParameterRef.mb_get_parameter_name, livePtr)
  }

}

object VisualShaderNodeParameterRef {
  private[classes] var mb_set_parameter_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parameter_name: GDExtensionMethodBindPtr = null
}
