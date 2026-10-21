package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Texture2DArray`, extends `ImageTextureLayered`. */
abstract class Texture2DArray extends ImageTextureLayered {
  override def godotClassName: String = "Texture2DArray"

  /** Texture2DArray.create_placeholder. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createPlaceholder(): Resource = {
    if (gdext.classes.Texture2DArray.mb_create_placeholder == null) gdext.classes.Texture2DArray.mb_create_placeholder = MethodBind.get("Texture2DArray", "create_placeholder", 121922552L)
    Wrappers.owned[Resource](Ptrcall.call0[Long](gdext.classes.Texture2DArray.mb_create_placeholder, livePtr))
  }

}

object Texture2DArray {
  private[classes] var mb_create_placeholder: GDExtensionMethodBindPtr = null
}
