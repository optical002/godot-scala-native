package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CompressedTexture3D`, extends `Texture3D`. */
abstract class CompressedTexture3D extends Texture3D {
  override def godotClassName: String = "CompressedTexture3D"

  /** CompressedTexture3D.load */
  final def load(path: String): Long = {
    if (gdext.classes.CompressedTexture3D.mb_load == null) gdext.classes.CompressedTexture3D.mb_load = MethodBind.get("CompressedTexture3D", "load", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.CompressedTexture3D.mb_load, livePtr, path)
  }

  /** CompressedTexture3D.get_load_path */
  final def getLoadPath(): String = {
    if (gdext.classes.CompressedTexture3D.mb_get_load_path == null) gdext.classes.CompressedTexture3D.mb_get_load_path = MethodBind.get("CompressedTexture3D", "get_load_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.CompressedTexture3D.mb_get_load_path, livePtr)
  }

}

object CompressedTexture3D {
  private[classes] var mb_load: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_load_path: GDExtensionMethodBindPtr = null
}
