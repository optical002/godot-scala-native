package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderTexture2D`, extends `Texture2D`. */
abstract class PlaceholderTexture2D extends Texture2D {
  override def godotClassName: String = "PlaceholderTexture2D"

  /** PlaceholderTexture2D.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaceholderTexture2D", "set_size", 743155724L), hostObject.objectPtr, size)

}
