package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Expression`, extends `RefCounted`. */
abstract class Expression extends RefCounted {
  override def godotClassName: String = "Expression"

  /** Expression.has_execute_failed */
  final def hasExecuteFailed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Expression", "has_execute_failed", 36873697L), hostObject.objectPtr)

  /** Expression.get_error_text */
  final def getErrorText(): String =
    Ptrcall.call0[String](MethodBind.get("Expression", "get_error_text", 201670096L), hostObject.objectPtr)

}
