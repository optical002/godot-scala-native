package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ReferenceRect`, extends `Control`. */
abstract class ReferenceRect extends Control {
  override def godotClassName: String = "ReferenceRect"

  /** ReferenceRect.get_border_color */
  final def getBorderColor(): gdext.builtin.Color = {
    if (gdext.classes.ReferenceRect.mb_get_border_color == null) gdext.classes.ReferenceRect.mb_get_border_color = MethodBind.get("ReferenceRect", "get_border_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.ReferenceRect.mb_get_border_color, livePtr)
  }

  /** ReferenceRect.set_border_color */
  final def setBorderColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ReferenceRect.mb_set_border_color == null) gdext.classes.ReferenceRect.mb_set_border_color = MethodBind.get("ReferenceRect", "set_border_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ReferenceRect.mb_set_border_color, livePtr, color)
  }

  /** ReferenceRect.get_border_width */
  final def getBorderWidth(): Double = {
    if (gdext.classes.ReferenceRect.mb_get_border_width == null) gdext.classes.ReferenceRect.mb_get_border_width = MethodBind.get("ReferenceRect", "get_border_width", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ReferenceRect.mb_get_border_width, livePtr)
  }

  /** ReferenceRect.set_border_width */
  final def setBorderWidth(width: Double): Unit = {
    if (gdext.classes.ReferenceRect.mb_set_border_width == null) gdext.classes.ReferenceRect.mb_set_border_width = MethodBind.get("ReferenceRect", "set_border_width", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ReferenceRect.mb_set_border_width, livePtr, width)
  }

  /** ReferenceRect.get_editor_only */
  final def getEditorOnly(): Boolean = {
    if (gdext.classes.ReferenceRect.mb_get_editor_only == null) gdext.classes.ReferenceRect.mb_get_editor_only = MethodBind.get("ReferenceRect", "get_editor_only", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ReferenceRect.mb_get_editor_only, livePtr)
  }

  /** ReferenceRect.set_editor_only */
  final def setEditorOnly(enabled: Boolean): Unit = {
    if (gdext.classes.ReferenceRect.mb_set_editor_only == null) gdext.classes.ReferenceRect.mb_set_editor_only = MethodBind.get("ReferenceRect", "set_editor_only", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ReferenceRect.mb_set_editor_only, livePtr, enabled)
  }

}

object ReferenceRect {
  private[classes] var mb_get_border_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_border_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_border_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_border_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_editor_only: GDExtensionMethodBindPtr = null
}
