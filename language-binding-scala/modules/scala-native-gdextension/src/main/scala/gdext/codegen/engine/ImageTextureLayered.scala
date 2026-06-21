package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ImageTextureLayered`, extends `TextureLayered`. */
abstract class ImageTextureLayered extends TextureLayered {

  /** ImageTextureLayered.update_layer */
  final def updateLayer(image: Image, layer: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("ImageTextureLayered", "update_layer", 3331733361L), hostObject.objectPtr, image.hostObject, layer)

}

object ImageTextureLayered {
  /** Class metadata for Gd[ImageTextureLayered] lifetime management and casting. */
  given GodotClass[ImageTextureLayered] with {
    def className = "ImageTextureLayered"
    def isRefCounted = true
    def wrap(o: GodotObject): ImageTextureLayered = new ImageTextureLayered {}.withHost(o.objectPtr)
    def unwrap(t: ImageTextureLayered): GodotObject = t.hostObject
  }
}
