package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeExpression`, extends `VisualShaderNodeGroupBase`. */
abstract class VisualShaderNodeExpression extends VisualShaderNodeGroupBase {

  /** VisualShaderNodeExpression.set_expression */
  final def setExpression(expression: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeExpression", "set_expression", 83702148L), hostObject.objectPtr, expression)

  /** VisualShaderNodeExpression.get_expression */
  final def getExpression(): String =
    Ptrcall.call0[String](MethodBind.get("VisualShaderNodeExpression", "get_expression", 201670096L), hostObject.objectPtr)

}

object VisualShaderNodeExpression {
  /** Class metadata for Gd[VisualShaderNodeExpression] lifetime management and casting. */
  given GodotClass[VisualShaderNodeExpression] with {
    def className = "VisualShaderNodeExpression"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeExpression = new VisualShaderNodeExpression {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeExpression): GodotObject = t.hostObject
  }
}
