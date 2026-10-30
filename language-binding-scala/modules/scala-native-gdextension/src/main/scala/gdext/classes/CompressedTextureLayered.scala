package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CompressedTextureLayered`, extends `TextureLayered`. */
abstract class CompressedTextureLayered extends TextureLayered {
  override def godotClassName: String = "CompressedTextureLayered"

  /** CompressedTextureLayered.load */
  final def load(path: String): gdext.classes.Error = {
    if (gdext.classes.CompressedTextureLayered.mb_load == null) gdext.classes.CompressedTextureLayered.mb_load = MethodBind.get("CompressedTextureLayered", "load", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.CompressedTextureLayered.mb_load, livePtr, path))
  }

  /** CompressedTextureLayered.get_load_path */
  final def getLoadPath(): String = {
    if (gdext.classes.CompressedTextureLayered.mb_get_load_path == null) gdext.classes.CompressedTextureLayered.mb_get_load_path = MethodBind.get("CompressedTextureLayered", "get_load_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.CompressedTextureLayered.mb_get_load_path, livePtr)
  }

}

object CompressedTextureLayered {
  private[classes] var mb_load: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_load_path: GDExtensionMethodBindPtr = null
}
