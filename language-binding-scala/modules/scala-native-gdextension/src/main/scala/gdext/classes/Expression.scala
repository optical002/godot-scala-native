package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Expression`, extends `RefCounted`. */
abstract class Expression extends RefCounted {

  /** Expression.has_execute_failed */
  final def hasExecuteFailed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Expression", "has_execute_failed", 36873697L), hostObject.objectPtr)

  /** Expression.get_error_text */
  final def getErrorText(): String =
    Ptrcall.call0[String](MethodBind.get("Expression", "get_error_text", 201670096L), hostObject.objectPtr)

}

object Expression {
  /** Class metadata for Gd[Expression] lifetime management and casting. */
  given GodotClass[Expression] with {
    def className = "Expression"
    def isRefCounted = true
    def wrap(o: GodotObject): Expression = new Expression {}.withHost(o.objectPtr)
    def unwrap(t: Expression): GodotObject = t.hostObject
  }
}
