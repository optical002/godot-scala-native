package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ImageTextureLayered`, extends `TextureLayered`. */
abstract class ImageTextureLayered extends TextureLayered {
  override def godotClassName: String = "ImageTextureLayered"

  /** ImageTextureLayered.update_layer */
  final def updateLayer(image: Image, layer: Long): Unit = {
    if (gdext.classes.ImageTextureLayered.mb_update_layer == null) gdext.classes.ImageTextureLayered.mb_update_layer = MethodBind.get("ImageTextureLayered", "update_layer", 3331733361L)
    Ptrcall.callVoid2(gdext.classes.ImageTextureLayered.mb_update_layer, livePtr, Wrappers.handle(image), layer)
  }

}

object ImageTextureLayered {
  private[classes] var mb_update_layer: GDExtensionMethodBindPtr = null
}
