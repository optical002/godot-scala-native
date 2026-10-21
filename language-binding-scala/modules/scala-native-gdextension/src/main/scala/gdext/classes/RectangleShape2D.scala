package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RectangleShape2D`, extends `Shape2D`. */
abstract class RectangleShape2D extends Shape2D {
  override def godotClassName: String = "RectangleShape2D"

  /** RectangleShape2D.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.RectangleShape2D.mb_set_size == null) gdext.classes.RectangleShape2D.mb_set_size = MethodBind.get("RectangleShape2D", "set_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.RectangleShape2D.mb_set_size, livePtr, size)
  }

  /** RectangleShape2D.get_size */
  final def getSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.RectangleShape2D.mb_get_size == null) gdext.classes.RectangleShape2D.mb_get_size = MethodBind.get("RectangleShape2D", "get_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.RectangleShape2D.mb_get_size, livePtr)
  }

}

object RectangleShape2D {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
}
