package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PlaceholderTexture2D`, extends `Texture2D`. */
abstract class PlaceholderTexture2D extends Texture2D {
  override def godotClassName: String = "PlaceholderTexture2D"

  /** PlaceholderTexture2D.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.PlaceholderTexture2D.mb_set_size == null) gdext.classes.PlaceholderTexture2D.mb_set_size = MethodBind.get("PlaceholderTexture2D", "set_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.PlaceholderTexture2D.mb_set_size, livePtr, size)
  }

}

object PlaceholderTexture2D {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
}
