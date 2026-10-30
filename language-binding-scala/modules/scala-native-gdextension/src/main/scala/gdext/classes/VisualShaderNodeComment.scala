package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeComment`, extends `VisualShaderNodeFrame`. */
abstract class VisualShaderNodeComment extends VisualShaderNodeFrame {
  override def godotClassName: String = "VisualShaderNodeComment"

  /** VisualShaderNodeComment.set_description */
  final def setDescription(description: String): Unit = {
    if (gdext.classes.VisualShaderNodeComment.mb_set_description == null) gdext.classes.VisualShaderNodeComment.mb_set_description = MethodBind.get("VisualShaderNodeComment", "set_description", 83702148L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeComment.mb_set_description, livePtr, description)
  }

  /** VisualShaderNodeComment.get_description */
  final def getDescription(): String = {
    if (gdext.classes.VisualShaderNodeComment.mb_get_description == null) gdext.classes.VisualShaderNodeComment.mb_get_description = MethodBind.get("VisualShaderNodeComment", "get_description", 201670096L)
    Ptrcall.call0[String](gdext.classes.VisualShaderNodeComment.mb_get_description, livePtr)
  }

}

object VisualShaderNodeComment {
  private[classes] var mb_set_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_description: GDExtensionMethodBindPtr = null
}
