package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeInput`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeInput extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeInput"

  /** VisualShaderNodeInput.set_input_name */
  final def setInputName(name: String): Unit = {
    if (gdext.classes.VisualShaderNodeInput.mb_set_input_name == null) gdext.classes.VisualShaderNodeInput.mb_set_input_name = MethodBind.get("VisualShaderNodeInput", "set_input_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeInput.mb_set_input_name, livePtr, name)
  }

  /** VisualShaderNodeInput.get_input_name */
  final def getInputName(): String = {
    if (gdext.classes.VisualShaderNodeInput.mb_get_input_name == null) gdext.classes.VisualShaderNodeInput.mb_get_input_name = MethodBind.get("VisualShaderNodeInput", "get_input_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.VisualShaderNodeInput.mb_get_input_name, livePtr)
  }

  /** VisualShaderNodeInput.get_input_real_name */
  final def getInputRealName(): String = {
    if (gdext.classes.VisualShaderNodeInput.mb_get_input_real_name == null) gdext.classes.VisualShaderNodeInput.mb_get_input_real_name = MethodBind.get("VisualShaderNodeInput", "get_input_real_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.VisualShaderNodeInput.mb_get_input_real_name, livePtr)
  }

}

object VisualShaderNodeInput {
  private[classes] var mb_set_input_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_real_name: GDExtensionMethodBindPtr = null
}
