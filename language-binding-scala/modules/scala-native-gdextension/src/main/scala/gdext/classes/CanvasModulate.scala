package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CanvasModulate`, extends `Node2D`. */
abstract class CanvasModulate extends Node2D {
  override def godotClassName: String = "CanvasModulate"

  /** CanvasModulate.set_color */
  final def setColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CanvasModulate.mb_set_color == null) gdext.classes.CanvasModulate.mb_set_color = MethodBind.get("CanvasModulate", "set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CanvasModulate.mb_set_color, livePtr, color)
  }

  /** CanvasModulate.get_color */
  final def getColor(): gdext.builtin.Color = {
    if (gdext.classes.CanvasModulate.mb_get_color == null) gdext.classes.CanvasModulate.mb_get_color = MethodBind.get("CanvasModulate", "get_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CanvasModulate.mb_get_color, livePtr)
  }

}

object CanvasModulate {
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color: GDExtensionMethodBindPtr = null
}
