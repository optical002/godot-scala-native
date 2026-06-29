package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeExpression`, extends `VisualShaderNodeGroupBase`. */
abstract class VisualShaderNodeExpression extends VisualShaderNodeGroupBase {
  override def godotClassName: String = "VisualShaderNodeExpression"

  /** VisualShaderNodeExpression.set_expression */
  final def setExpression(expression: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeExpression", "set_expression", 83702148L), hostObject.objectPtr, expression)

  /** VisualShaderNodeExpression.get_expression */
  final def getExpression(): String =
    Ptrcall.call0[String](MethodBind.get("VisualShaderNodeExpression", "get_expression", 201670096L), hostObject.objectPtr)

}
