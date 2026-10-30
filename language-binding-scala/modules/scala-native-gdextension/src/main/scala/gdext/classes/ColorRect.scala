package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ColorRect`, extends `Control`. */
abstract class ColorRect extends Control {
  override def godotClassName: String = "ColorRect"

  /** ColorRect.set_color */
  final def setColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ColorRect.mb_set_color == null) gdext.classes.ColorRect.mb_set_color = MethodBind.get("ColorRect", "set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ColorRect.mb_set_color, livePtr, color)
  }

  /** ColorRect.get_color */
  final def getColor(): gdext.builtin.Color = {
    if (gdext.classes.ColorRect.mb_get_color == null) gdext.classes.ColorRect.mb_get_color = MethodBind.get("ColorRect", "get_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.ColorRect.mb_get_color, livePtr)
  }

}

object ColorRect {
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color: GDExtensionMethodBindPtr = null
}
