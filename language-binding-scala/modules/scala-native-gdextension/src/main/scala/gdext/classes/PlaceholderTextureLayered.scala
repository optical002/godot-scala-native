package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PlaceholderTextureLayered`, extends `TextureLayered`. */
abstract class PlaceholderTextureLayered extends TextureLayered {
  override def godotClassName: String = "PlaceholderTextureLayered"

  /** PlaceholderTextureLayered.set_size */
  final def setSize(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.PlaceholderTextureLayered.mb_set_size == null) gdext.classes.PlaceholderTextureLayered.mb_set_size = MethodBind.get("PlaceholderTextureLayered", "set_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.PlaceholderTextureLayered.mb_set_size, livePtr, size)
  }

  /** PlaceholderTextureLayered.get_size */
  final def getSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.PlaceholderTextureLayered.mb_get_size == null) gdext.classes.PlaceholderTextureLayered.mb_get_size = MethodBind.get("PlaceholderTextureLayered", "get_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.PlaceholderTextureLayered.mb_get_size, livePtr)
  }

  /** PlaceholderTextureLayered.set_layers */
  final def setLayers(layers: Long): Unit = {
    if (gdext.classes.PlaceholderTextureLayered.mb_set_layers == null) gdext.classes.PlaceholderTextureLayered.mb_set_layers = MethodBind.get("PlaceholderTextureLayered", "set_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PlaceholderTextureLayered.mb_set_layers, livePtr, layers)
  }

}

object PlaceholderTextureLayered {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layers: GDExtensionMethodBindPtr = null
}
