package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeComment`, extends `VisualShaderNodeFrame`. */
abstract class VisualShaderNodeComment extends VisualShaderNodeFrame {

  /** VisualShaderNodeComment.set_description */
  final def setDescription(description: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeComment", "set_description", 83702148L), hostObject.objectPtr, description)

  /** VisualShaderNodeComment.get_description */
  final def getDescription(): String =
    Ptrcall.call0[String](MethodBind.get("VisualShaderNodeComment", "get_description", 201670096L), hostObject.objectPtr)

}

object VisualShaderNodeComment {
  /** Class metadata for Gd[VisualShaderNodeComment] lifetime management and casting. */
  given GodotClass[VisualShaderNodeComment] with {
    def className = "VisualShaderNodeComment"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeComment = new VisualShaderNodeComment {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeComment): GodotObject = t.hostObject
  }
}
