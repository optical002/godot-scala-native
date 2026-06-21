package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderTextureLayered`, extends `TextureLayered`. */
abstract class PlaceholderTextureLayered extends TextureLayered {

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

object PlaceholderTextureLayered {
  /** Class metadata for Gd[PlaceholderTextureLayered] lifetime management and casting. */
  given GodotClass[PlaceholderTextureLayered] with {
    def className = "PlaceholderTextureLayered"
    def isRefCounted = true
    def wrap(o: GodotObject): PlaceholderTextureLayered = new PlaceholderTextureLayered {}.withHost(o.objectPtr)
    def unwrap(t: PlaceholderTextureLayered): GodotObject = t.hostObject
  }
}
