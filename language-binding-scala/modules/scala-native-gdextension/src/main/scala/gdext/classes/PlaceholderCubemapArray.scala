package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderCubemapArray`, extends `PlaceholderTextureLayered`. */
abstract class PlaceholderCubemapArray extends PlaceholderTextureLayered {

}

object PlaceholderCubemapArray {
  /** Class metadata for Gd[PlaceholderCubemapArray] lifetime management and casting. */
  given GodotClass[PlaceholderCubemapArray] with {
    def className = "PlaceholderCubemapArray"
    def isRefCounted = true
    def wrap(o: GodotObject): PlaceholderCubemapArray = new PlaceholderCubemapArray {}.withHost(o.objectPtr)
    def unwrap(t: PlaceholderCubemapArray): GodotObject = t.hostObject
  }
}
