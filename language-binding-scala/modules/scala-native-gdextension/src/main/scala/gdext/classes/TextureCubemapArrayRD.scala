package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TextureCubemapArrayRD`, extends `TextureLayeredRD`. */
abstract class TextureCubemapArrayRD extends TextureLayeredRD {

}

object TextureCubemapArrayRD {
  /** Class metadata for Gd[TextureCubemapArrayRD] lifetime management and casting. */
  given GodotClass[TextureCubemapArrayRD] with {
    def className = "TextureCubemapArrayRD"
    def isRefCounted = true
    def wrap(o: GodotObject): TextureCubemapArrayRD = new TextureCubemapArrayRD {}.withHost(o.objectPtr)
    def unwrap(t: TextureCubemapArrayRD): GodotObject = t.hostObject
  }
}
