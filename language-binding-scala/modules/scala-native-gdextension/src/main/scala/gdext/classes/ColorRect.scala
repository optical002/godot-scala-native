package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ColorRect`, extends `Control`. */
abstract class ColorRect extends Control {
  override def godotClassName: String = "ColorRect"

  /** ColorRect.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorRect", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** ColorRect.get_color */
  final def getColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("ColorRect", "get_color", 3444240500L), hostObject.objectPtr)

}
