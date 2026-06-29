package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RectangleShape2D`, extends `Shape2D`. */
abstract class RectangleShape2D extends Shape2D {
  override def godotClassName: String = "RectangleShape2D"

  /** RectangleShape2D.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("RectangleShape2D", "set_size", 743155724L), hostObject.objectPtr, size)

  /** RectangleShape2D.get_size */
  final def getSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("RectangleShape2D", "get_size", 3341600327L), hostObject.objectPtr)

}
