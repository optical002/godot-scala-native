package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CubemapArray`, extends `ImageTextureLayered`. */
abstract class CubemapArray extends ImageTextureLayered {
  override def godotClassName: String = "CubemapArray"

  /** CubemapArray.create_placeholder. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createPlaceholder(): Resource = {
    if (gdext.classes.CubemapArray.mb_create_placeholder == null) gdext.classes.CubemapArray.mb_create_placeholder = MethodBind.get("CubemapArray", "create_placeholder", 121922552L)
    Wrappers.owned[Resource](Ptrcall.call0[Long](gdext.classes.CubemapArray.mb_create_placeholder, livePtr))
  }

}

object CubemapArray {
  private[classes] var mb_create_placeholder: GDExtensionMethodBindPtr = null
}
