package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CompressedTextureLayered`, extends `TextureLayered`. */
abstract class CompressedTextureLayered extends TextureLayered {
  override def godotClassName: String = "CompressedTextureLayered"

  /** CompressedTextureLayered.load */
  final def load(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("CompressedTextureLayered", "load", 166001499L), hostObject.objectPtr, path)

  /** CompressedTextureLayered.get_load_path */
  final def getLoadPath(): String =
    Ptrcall.call0[String](MethodBind.get("CompressedTextureLayered", "get_load_path", 201670096L), hostObject.objectPtr)

}
