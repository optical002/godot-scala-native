package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeCustom`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeCustom extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeCustom"

  /** VisualShaderNodeCustom.get_option_index */
  final def getOptionIndex(option: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("VisualShaderNodeCustom", "get_option_index", 923996154L), hostObject.objectPtr, option)

}
