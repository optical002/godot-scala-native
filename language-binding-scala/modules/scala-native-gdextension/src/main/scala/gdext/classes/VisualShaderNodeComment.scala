package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeComment`, extends `VisualShaderNodeFrame`. */
abstract class VisualShaderNodeComment extends VisualShaderNodeFrame {
  override def godotClassName: String = "VisualShaderNodeComment"

  /** VisualShaderNodeComment.set_description */
  final def setDescription(description: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeComment", "set_description", 83702148L), hostObject.objectPtr, description)

  /** VisualShaderNodeComment.get_description */
  final def getDescription(): String =
    Ptrcall.call0[String](MethodBind.get("VisualShaderNodeComment", "get_description", 201670096L), hostObject.objectPtr)

}
