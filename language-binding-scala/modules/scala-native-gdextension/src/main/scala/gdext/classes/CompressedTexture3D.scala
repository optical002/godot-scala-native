package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CompressedTexture3D`, extends `Texture3D`. */
abstract class CompressedTexture3D extends Texture3D {
  override def godotClassName: String = "CompressedTexture3D"

  /** CompressedTexture3D.load */
  final def load(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("CompressedTexture3D", "load", 166001499L), hostObject.objectPtr, path)

  /** CompressedTexture3D.get_load_path */
  final def getLoadPath(): String =
    Ptrcall.call0[String](MethodBind.get("CompressedTexture3D", "get_load_path", 201670096L), hostObject.objectPtr)

}
