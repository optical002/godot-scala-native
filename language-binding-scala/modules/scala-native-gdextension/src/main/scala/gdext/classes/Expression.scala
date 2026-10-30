package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Expression`, extends `RefCounted`. */
abstract class Expression extends RefCounted {
  override def godotClassName: String = "Expression"

  /** Expression.has_execute_failed */
  final def hasExecuteFailed(): Boolean = {
    if (gdext.classes.Expression.mb_has_execute_failed == null) gdext.classes.Expression.mb_has_execute_failed = MethodBind.get("Expression", "has_execute_failed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Expression.mb_has_execute_failed, livePtr)
  }

  /** Expression.get_error_text */
  final def getErrorText(): String = {
    if (gdext.classes.Expression.mb_get_error_text == null) gdext.classes.Expression.mb_get_error_text = MethodBind.get("Expression", "get_error_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.Expression.mb_get_error_text, livePtr)
  }

}

object Expression {
  private[classes] var mb_has_execute_failed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_error_text: GDExtensionMethodBindPtr = null
}
