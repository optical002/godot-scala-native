package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CompressedCubemapArray`, extends `CompressedTextureLayered`. */
abstract class CompressedCubemapArray extends CompressedTextureLayered {

}

object CompressedCubemapArray {
  /** Class metadata for Gd[CompressedCubemapArray] lifetime management and casting. */
  given GodotClass[CompressedCubemapArray] with {
    def className = "CompressedCubemapArray"
    def isRefCounted = true
    def wrap(o: GodotObject): CompressedCubemapArray = new CompressedCubemapArray {}.withHost(o.objectPtr)
    def unwrap(t: CompressedCubemapArray): GodotObject = t.hostObject
  }
}
