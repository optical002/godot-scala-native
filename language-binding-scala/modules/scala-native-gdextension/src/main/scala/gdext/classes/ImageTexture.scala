package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ImageTexture`, extends `Texture2D`. */
abstract class ImageTexture extends Texture2D {

  /** ImageTexture.get_format */
  final def getFormat(): Long =
    Ptrcall.call0[Long](MethodBind.get("ImageTexture", "get_format", 3847873762L), hostObject.objectPtr)

  /** ImageTexture.set_image */
  final def setImage(image: Image): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImageTexture", "set_image", 532598488L), hostObject.objectPtr, image.hostObject)

  /** ImageTexture.update */
  final def update(image: Image): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImageTexture", "update", 532598488L), hostObject.objectPtr, image.hostObject)

  /** ImageTexture.set_size_override */
  final def setSizeOverride(size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImageTexture", "set_size_override", 1130785943L), hostObject.objectPtr, size)

}

object ImageTexture {
  /** Class metadata for Gd[ImageTexture] lifetime management and casting. */
  given GodotClass[ImageTexture] with {
    def className = "ImageTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): ImageTexture = new ImageTexture {}.withHost(o.objectPtr)
    def unwrap(t: ImageTexture): GodotObject = t.hostObject
  }
}
