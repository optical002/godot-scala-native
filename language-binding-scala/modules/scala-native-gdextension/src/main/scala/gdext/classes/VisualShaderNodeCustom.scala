package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeCustom`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeCustom extends VisualShaderNode {

  /** VisualShaderNodeCustom.get_option_index */
  final def getOptionIndex(option: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("VisualShaderNodeCustom", "get_option_index", 923996154L), hostObject.objectPtr, option)

}

object VisualShaderNodeCustom {
  /** Class metadata for Gd[VisualShaderNodeCustom] lifetime management and casting. */
  given GodotClass[VisualShaderNodeCustom] with {
    def className = "VisualShaderNodeCustom"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeCustom = new VisualShaderNodeCustom {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeCustom): GodotObject = t.hostObject
  }
}
