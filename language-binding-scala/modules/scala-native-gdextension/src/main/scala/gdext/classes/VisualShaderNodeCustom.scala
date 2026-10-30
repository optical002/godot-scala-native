package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeCustom`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeCustom extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeCustom"

  /** VisualShaderNodeCustom.get_option_index */
  final def getOptionIndex(option: Long): Long = {
    if (gdext.classes.VisualShaderNodeCustom.mb_get_option_index == null) gdext.classes.VisualShaderNodeCustom.mb_get_option_index = MethodBind.get("VisualShaderNodeCustom", "get_option_index", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.VisualShaderNodeCustom.mb_get_option_index, livePtr, option)
  }

}

object VisualShaderNodeCustom {
  private[classes] var mb_get_option_index: GDExtensionMethodBindPtr = null
}
