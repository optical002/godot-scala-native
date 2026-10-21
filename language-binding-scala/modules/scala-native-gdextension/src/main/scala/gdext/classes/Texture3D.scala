package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Texture3D`, extends `Texture`. */
abstract class Texture3D extends Texture {
  override def godotClassName: String = "Texture3D"

  /** Texture3D.get_format */
  final def getFormat(): Long = {
    if (gdext.classes.Texture3D.mb_get_format == null) gdext.classes.Texture3D.mb_get_format = MethodBind.get("Texture3D", "get_format", 3847873762L)
    Ptrcall.call0[Long](gdext.classes.Texture3D.mb_get_format, livePtr)
  }

  /** Texture3D.get_width */
  final def getWidth(): Long = {
    if (gdext.classes.Texture3D.mb_get_width == null) gdext.classes.Texture3D.mb_get_width = MethodBind.get("Texture3D", "get_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Texture3D.mb_get_width, livePtr)
  }

  /** Texture3D.get_height */
  final def getHeight(): Long = {
    if (gdext.classes.Texture3D.mb_get_height == null) gdext.classes.Texture3D.mb_get_height = MethodBind.get("Texture3D", "get_height", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Texture3D.mb_get_height, livePtr)
  }

  /** Texture3D.get_depth */
  final def getDepth(): Long = {
    if (gdext.classes.Texture3D.mb_get_depth == null) gdext.classes.Texture3D.mb_get_depth = MethodBind.get("Texture3D", "get_depth", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Texture3D.mb_get_depth, livePtr)
  }

  /** Texture3D.has_mipmaps */
  final def hasMipmaps(): Boolean = {
    if (gdext.classes.Texture3D.mb_has_mipmaps == null) gdext.classes.Texture3D.mb_has_mipmaps = MethodBind.get("Texture3D", "has_mipmaps", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Texture3D.mb_has_mipmaps, livePtr)
  }

  /** Texture3D.create_placeholder. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createPlaceholder(): Resource = {
    if (gdext.classes.Texture3D.mb_create_placeholder == null) gdext.classes.Texture3D.mb_create_placeholder = MethodBind.get("Texture3D", "create_placeholder", 121922552L)
    Wrappers.owned[Resource](Ptrcall.call0[Long](gdext.classes.Texture3D.mb_create_placeholder, livePtr))
  }

}

object Texture3D {
  private[classes] var mb_get_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_mipmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_placeholder: GDExtensionMethodBindPtr = null
}
