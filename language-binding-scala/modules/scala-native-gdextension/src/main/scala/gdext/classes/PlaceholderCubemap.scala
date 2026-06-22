package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderCubemap`, extends `PlaceholderTextureLayered`. */
abstract class PlaceholderCubemap extends PlaceholderTextureLayered {

}

object PlaceholderCubemap {
  /** Class metadata for Gd[PlaceholderCubemap] lifetime management and casting. */
  given GodotClass[PlaceholderCubemap] with {
    def className = "PlaceholderCubemap"
    def isRefCounted = true
    def wrap(o: GodotObject): PlaceholderCubemap = new PlaceholderCubemap {}.withHost(o.objectPtr)
    def unwrap(t: PlaceholderCubemap): GodotObject = t.hostObject
  }
}
