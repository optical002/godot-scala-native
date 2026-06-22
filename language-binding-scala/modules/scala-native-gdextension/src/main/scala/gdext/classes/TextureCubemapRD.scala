package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TextureCubemapRD`, extends `TextureLayeredRD`. */
abstract class TextureCubemapRD extends TextureLayeredRD {

}

object TextureCubemapRD {
  /** Class metadata for Gd[TextureCubemapRD] lifetime management and casting. */
  given GodotClass[TextureCubemapRD] with {
    def className = "TextureCubemapRD"
    def isRefCounted = true
    def wrap(o: GodotObject): TextureCubemapRD = new TextureCubemapRD {}.withHost(o.objectPtr)
    def unwrap(t: TextureCubemapRD): GodotObject = t.hostObject
  }
}
