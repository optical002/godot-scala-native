package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TextureLayered`, extends `Texture`. */
abstract class TextureLayered extends Texture {
  override def godotClassName: String = "TextureLayered"

  /** TextureLayered.get_format */
  final def getFormat(): Long = {
    if (gdext.classes.TextureLayered.mb_get_format == null) gdext.classes.TextureLayered.mb_get_format = MethodBind.get("TextureLayered", "get_format", 3847873762L)
    Ptrcall.call0[Long](gdext.classes.TextureLayered.mb_get_format, livePtr)
  }

  /** TextureLayered.get_layered_type */
  final def getLayeredType(): Long = {
    if (gdext.classes.TextureLayered.mb_get_layered_type == null) gdext.classes.TextureLayered.mb_get_layered_type = MethodBind.get("TextureLayered", "get_layered_type", 518123893L)
    Ptrcall.call0[Long](gdext.classes.TextureLayered.mb_get_layered_type, livePtr)
  }

  /** TextureLayered.get_width */
  final def getWidth(): Long = {
    if (gdext.classes.TextureLayered.mb_get_width == null) gdext.classes.TextureLayered.mb_get_width = MethodBind.get("TextureLayered", "get_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextureLayered.mb_get_width, livePtr)
  }

  /** TextureLayered.get_height */
  final def getHeight(): Long = {
    if (gdext.classes.TextureLayered.mb_get_height == null) gdext.classes.TextureLayered.mb_get_height = MethodBind.get("TextureLayered", "get_height", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextureLayered.mb_get_height, livePtr)
  }

  /** TextureLayered.get_layers */
  final def getLayers(): Long = {
    if (gdext.classes.TextureLayered.mb_get_layers == null) gdext.classes.TextureLayered.mb_get_layers = MethodBind.get("TextureLayered", "get_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextureLayered.mb_get_layers, livePtr)
  }

  /** TextureLayered.has_mipmaps */
  final def hasMipmaps(): Boolean = {
    if (gdext.classes.TextureLayered.mb_has_mipmaps == null) gdext.classes.TextureLayered.mb_has_mipmaps = MethodBind.get("TextureLayered", "has_mipmaps", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextureLayered.mb_has_mipmaps, livePtr)
  }

  /** TextureLayered.get_layer_data. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getLayerData(layer: Long): Image = {
    if (gdext.classes.TextureLayered.mb_get_layer_data == null) gdext.classes.TextureLayered.mb_get_layer_data = MethodBind.get("TextureLayered", "get_layer_data", 3655284255L)
    Wrappers.owned[Image](Ptrcall.call1[Long, Long](gdext.classes.TextureLayered.mb_get_layer_data, livePtr, layer))
  }

}

object TextureLayered {
  private[classes] var mb_get_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layered_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_mipmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layer_data: GDExtensionMethodBindPtr = null
}
