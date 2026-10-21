package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Texture2D`, extends `Texture`. */
abstract class Texture2D extends Texture {
  override def godotClassName: String = "Texture2D"

  /** Texture2D.get_width */
  final def getWidth(): Long = {
    if (gdext.classes.Texture2D.mb_get_width == null) gdext.classes.Texture2D.mb_get_width = MethodBind.get("Texture2D", "get_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Texture2D.mb_get_width, livePtr)
  }

  /** Texture2D.get_height */
  final def getHeight(): Long = {
    if (gdext.classes.Texture2D.mb_get_height == null) gdext.classes.Texture2D.mb_get_height = MethodBind.get("Texture2D", "get_height", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Texture2D.mb_get_height, livePtr)
  }

  /** Texture2D.get_size */
  final def getSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.Texture2D.mb_get_size == null) gdext.classes.Texture2D.mb_get_size = MethodBind.get("Texture2D", "get_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Texture2D.mb_get_size, livePtr)
  }

  /** Texture2D.has_alpha */
  final def hasAlpha(): Boolean = {
    if (gdext.classes.Texture2D.mb_has_alpha == null) gdext.classes.Texture2D.mb_has_alpha = MethodBind.get("Texture2D", "has_alpha", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Texture2D.mb_has_alpha, livePtr)
  }

  /** Texture2D.get_image. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getImage(): Image = {
    if (gdext.classes.Texture2D.mb_get_image == null) gdext.classes.Texture2D.mb_get_image = MethodBind.get("Texture2D", "get_image", 4190603485L)
    Wrappers.owned[Image](Ptrcall.call0[Long](gdext.classes.Texture2D.mb_get_image, livePtr))
  }

  /** Texture2D.create_placeholder. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createPlaceholder(): Resource = {
    if (gdext.classes.Texture2D.mb_create_placeholder == null) gdext.classes.Texture2D.mb_create_placeholder = MethodBind.get("Texture2D", "create_placeholder", 121922552L)
    Wrappers.owned[Resource](Ptrcall.call0[Long](gdext.classes.Texture2D.mb_create_placeholder, livePtr))
  }

}

object Texture2D {
  private[classes] var mb_get_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_alpha: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_placeholder: GDExtensionMethodBindPtr = null
}
