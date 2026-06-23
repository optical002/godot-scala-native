package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `TextureLayeredRD`, extends `TextureLayered`. */
abstract class TextureLayeredRD extends TextureLayered {

}

object TextureLayeredRD {
  /** Class metadata for Gd[TextureLayeredRD] lifetime management and casting. */
  given GodotClass[TextureLayeredRD] with {
    def className = "TextureLayeredRD"
    def isRefCounted = true
    def wrap(o: GodotObject): TextureLayeredRD = new TextureLayeredRD {}.withHost(o.objectPtr)
    def unwrap(t: TextureLayeredRD): GodotObject = t.hostObject
  }
}
