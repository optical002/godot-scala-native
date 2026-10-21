package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ImageTexture`, extends `Texture2D`. */
abstract class ImageTexture extends Texture2D {
  override def godotClassName: String = "ImageTexture"

  /** ImageTexture.get_format */
  final def getFormat(): Long = {
    if (gdext.classes.ImageTexture.mb_get_format == null) gdext.classes.ImageTexture.mb_get_format = MethodBind.get("ImageTexture", "get_format", 3847873762L)
    Ptrcall.call0[Long](gdext.classes.ImageTexture.mb_get_format, livePtr)
  }

  /** ImageTexture.set_image */
  final def setImage(image: Image): Unit = {
    if (gdext.classes.ImageTexture.mb_set_image == null) gdext.classes.ImageTexture.mb_set_image = MethodBind.get("ImageTexture", "set_image", 532598488L)
    Ptrcall.callVoid1(gdext.classes.ImageTexture.mb_set_image, livePtr, Wrappers.handle(image))
  }

  /** ImageTexture.update */
  final def update(image: Image): Unit = {
    if (gdext.classes.ImageTexture.mb_update == null) gdext.classes.ImageTexture.mb_update = MethodBind.get("ImageTexture", "update", 532598488L)
    Ptrcall.callVoid1(gdext.classes.ImageTexture.mb_update, livePtr, Wrappers.handle(image))
  }

  /** ImageTexture.set_size_override */
  final def setSizeOverride(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.ImageTexture.mb_set_size_override == null) gdext.classes.ImageTexture.mb_set_size_override = MethodBind.get("ImageTexture", "set_size_override", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.ImageTexture.mb_set_size_override, livePtr, size)
  }

}

object ImageTexture {
  private[classes] var mb_create_from_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size_override: GDExtensionMethodBindPtr = null

  /** ImageTexture.create_from_image. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createFromImage(image: Image): ImageTexture = {
    if (gdext.classes.ImageTexture.mb_create_from_image == null) gdext.classes.ImageTexture.mb_create_from_image = MethodBind.get("ImageTexture", "create_from_image", 2775144163L)
    Wrappers.owned[ImageTexture](Ptrcall.call1[GodotObject, Long](gdext.classes.ImageTexture.mb_create_from_image, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(image)))
  }
}
