package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CompressedTexture2D`, extends `Texture2D`. */
abstract class CompressedTexture2D extends Texture2D {
  override def godotClassName: String = "CompressedTexture2D"

  /** CompressedTexture2D.load */
  final def load(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("CompressedTexture2D", "load", 166001499L), hostObject.objectPtr, path)

  /** CompressedTexture2D.get_load_path */
  final def getLoadPath(): String =
    Ptrcall.call0[String](MethodBind.get("CompressedTexture2D", "get_load_path", 201670096L), hostObject.objectPtr)

}
