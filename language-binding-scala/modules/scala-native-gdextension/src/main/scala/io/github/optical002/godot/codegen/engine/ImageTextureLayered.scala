package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
