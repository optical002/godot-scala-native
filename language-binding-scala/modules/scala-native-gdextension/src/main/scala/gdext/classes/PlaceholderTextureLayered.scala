package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderTextureLayered`, extends `TextureLayered`. */
abstract class PlaceholderTextureLayered extends TextureLayered {
  override def godotClassName: String = "PlaceholderTextureLayered"

  /** PlaceholderTextureLayered.set_size */
  final def setSize(size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaceholderTextureLayered", "set_size", 1130785943L), hostObject.objectPtr, size)

  /** PlaceholderTextureLayered.get_size */
  final def getSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("PlaceholderTextureLayered", "get_size", 3690982128L), hostObject.objectPtr)

  /** PlaceholderTextureLayered.set_layers */
  final def setLayers(layers: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaceholderTextureLayered", "set_layers", 1286410249L), hostObject.objectPtr, layers)

}
