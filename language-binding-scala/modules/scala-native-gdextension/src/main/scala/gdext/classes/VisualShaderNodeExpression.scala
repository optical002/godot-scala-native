package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeExpression`, extends `VisualShaderNodeGroupBase`. */
abstract class VisualShaderNodeExpression extends VisualShaderNodeGroupBase {
  override def godotClassName: String = "VisualShaderNodeExpression"

  /** VisualShaderNodeExpression.set_expression */
  final def setExpression(expression: String): Unit = {
    if (gdext.classes.VisualShaderNodeExpression.mb_set_expression == null) gdext.classes.VisualShaderNodeExpression.mb_set_expression = MethodBind.get("VisualShaderNodeExpression", "set_expression", 83702148L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeExpression.mb_set_expression, livePtr, expression)
  }

  /** VisualShaderNodeExpression.get_expression */
  final def getExpression(): String = {
    if (gdext.classes.VisualShaderNodeExpression.mb_get_expression == null) gdext.classes.VisualShaderNodeExpression.mb_get_expression = MethodBind.get("VisualShaderNodeExpression", "get_expression", 201670096L)
    Ptrcall.call0[String](gdext.classes.VisualShaderNodeExpression.mb_get_expression, livePtr)
  }

}

object VisualShaderNodeExpression {
  private[classes] var mb_set_expression: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_expression: GDExtensionMethodBindPtr = null
}
