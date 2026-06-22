package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RectangleShape2D`, extends `Shape2D`. */
abstract class RectangleShape2D extends Shape2D {

  /** RectangleShape2D.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("RectangleShape2D", "set_size", 743155724L), hostObject.objectPtr, size)

  /** RectangleShape2D.get_size */
  final def getSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("RectangleShape2D", "get_size", 3341600327L), hostObject.objectPtr)

}

object RectangleShape2D {
  /** Class metadata for Gd[RectangleShape2D] lifetime management and casting. */
  given GodotClass[RectangleShape2D] with {
    def className = "RectangleShape2D"
    def isRefCounted = true
    def wrap(o: GodotObject): RectangleShape2D = new RectangleShape2D {}.withHost(o.objectPtr)
    def unwrap(t: RectangleShape2D): GodotObject = t.hostObject
  }
}
