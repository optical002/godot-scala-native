package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeInput`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeInput extends VisualShaderNode {

  /** VisualShaderNodeInput.set_input_name */
  final def setInputName(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeInput", "set_input_name", 83702148L), hostObject.objectPtr, name)

  /** VisualShaderNodeInput.get_input_name */
  final def getInputName(): String =
    Ptrcall.call0[String](MethodBind.get("VisualShaderNodeInput", "get_input_name", 201670096L), hostObject.objectPtr)

  /** VisualShaderNodeInput.get_input_real_name */
  final def getInputRealName(): String =
    Ptrcall.call0[String](MethodBind.get("VisualShaderNodeInput", "get_input_real_name", 201670096L), hostObject.objectPtr)

}

object VisualShaderNodeInput {
  /** Class metadata for Gd[VisualShaderNodeInput] lifetime management and casting. */
  given GodotClass[VisualShaderNodeInput] with {
    def className = "VisualShaderNodeInput"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeInput = new VisualShaderNodeInput {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeInput): GodotObject = t.hostObject
  }
}
