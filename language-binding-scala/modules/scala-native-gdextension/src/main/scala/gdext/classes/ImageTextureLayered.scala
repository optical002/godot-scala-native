package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ImageTextureLayered`, extends `TextureLayered`. */
abstract class ImageTextureLayered extends TextureLayered {
  override def godotClassName: String = "ImageTextureLayered"

  /** ImageTextureLayered.update_layer */
  final def updateLayer(image: Image, layer: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ImageTextureLayered", "update_layer", 3331733361L), hostObject.objectPtr, image.hostObject, layer)

}
