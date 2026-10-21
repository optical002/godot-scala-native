package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CompressedTexture2D`, extends `Texture2D`. */
abstract class CompressedTexture2D extends Texture2D {
  override def godotClassName: String = "CompressedTexture2D"

  /** CompressedTexture2D.load */
  final def load(path: String): Long = {
    if (gdext.classes.CompressedTexture2D.mb_load == null) gdext.classes.CompressedTexture2D.mb_load = MethodBind.get("CompressedTexture2D", "load", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.CompressedTexture2D.mb_load, livePtr, path)
  }

  /** CompressedTexture2D.get_load_path */
  final def getLoadPath(): String = {
    if (gdext.classes.CompressedTexture2D.mb_get_load_path == null) gdext.classes.CompressedTexture2D.mb_get_load_path = MethodBind.get("CompressedTexture2D", "get_load_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.CompressedTexture2D.mb_get_load_path, livePtr)
  }

}

object CompressedTexture2D {
  private[classes] var mb_load: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_load_path: GDExtensionMethodBindPtr = null
}
