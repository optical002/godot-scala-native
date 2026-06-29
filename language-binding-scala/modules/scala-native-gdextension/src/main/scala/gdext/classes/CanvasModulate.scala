package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CanvasModulate`, extends `Node2D`. */
abstract class CanvasModulate extends Node2D {
  override def godotClassName: String = "CanvasModulate"

  /** CanvasModulate.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasModulate", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** CanvasModulate.get_color */
  final def getColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("CanvasModulate", "get_color", 3444240500L), hostObject.objectPtr)

}
