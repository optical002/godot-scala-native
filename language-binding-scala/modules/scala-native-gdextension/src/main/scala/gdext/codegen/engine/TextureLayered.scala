package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TextureLayered`, extends `Texture`. */
abstract class TextureLayered extends Texture {

  /** TextureLayered.get_format */
  final def getFormat(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextureLayered", "get_format", 3847873762L), hostObject.objectPtr)

  /** TextureLayered.get_layered_type */
  final def getLayeredType(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextureLayered", "get_layered_type", 518123893L), hostObject.objectPtr)

  /** TextureLayered.get_width */
  final def getWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextureLayered", "get_width", 3905245786L), hostObject.objectPtr)

  /** TextureLayered.get_height */
  final def getHeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextureLayered", "get_height", 3905245786L), hostObject.objectPtr)

  /** TextureLayered.get_layers */
  final def getLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextureLayered", "get_layers", 3905245786L), hostObject.objectPtr)

  /** TextureLayered.has_mipmaps */
  final def hasMipmaps(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextureLayered", "has_mipmaps", 36873697L), hostObject.objectPtr)

  /** TextureLayered.get_layer_data */
  final def getLayerData(layer: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("TextureLayered", "get_layer_data", 3655284255L), hostObject.objectPtr, layer)

}

object TextureLayered {
  /** Class metadata for Gd[TextureLayered] lifetime management and casting. */
  given GodotClass[TextureLayered] with {
    def className = "TextureLayered"
    def isRefCounted = true
    def wrap(o: GodotObject): TextureLayered = new TextureLayered {}.withHost(o.objectPtr)
    def unwrap(t: TextureLayered): GodotObject = t.hostObject
  }
}
