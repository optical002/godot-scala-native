package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CompressedCubemap`, extends `CompressedTextureLayered`. */
abstract class CompressedCubemap extends CompressedTextureLayered {

}

object CompressedCubemap {
  /** Class metadata for Gd[CompressedCubemap] lifetime management and casting. */
  given GodotClass[CompressedCubemap] with {
    def className = "CompressedCubemap"
    def isRefCounted = true
    def wrap(o: GodotObject): CompressedCubemap = new CompressedCubemap {}.withHost(o.objectPtr)
    def unwrap(t: CompressedCubemap): GodotObject = t.hostObject
  }
}
