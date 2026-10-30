package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Cubemap`, extends `ImageTextureLayered`. */
abstract class Cubemap extends ImageTextureLayered {
  override def godotClassName: String = "Cubemap"

  /** Cubemap.create_placeholder. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createPlaceholder(): Resource = {
    if (gdext.classes.Cubemap.mb_create_placeholder == null) gdext.classes.Cubemap.mb_create_placeholder = MethodBind.get("Cubemap", "create_placeholder", 121922552L)
    Wrappers.owned[Resource](Ptrcall.call0[Long](gdext.classes.Cubemap.mb_create_placeholder, livePtr))
  }

}

object Cubemap {
  private[classes] var mb_create_placeholder: GDExtensionMethodBindPtr = null
}
