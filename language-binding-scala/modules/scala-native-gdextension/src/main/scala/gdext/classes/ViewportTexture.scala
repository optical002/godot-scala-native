package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ViewportTexture`, extends `Texture2D`. */
abstract class ViewportTexture extends Texture2D {

}

object ViewportTexture {
  /** Class metadata for Gd[ViewportTexture] lifetime management and casting. */
  given GodotClass[ViewportTexture] with {
    def className = "ViewportTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): ViewportTexture = new ViewportTexture {}.withHost(o.objectPtr)
    def unwrap(t: ViewportTexture): GodotObject = t.hostObject
  }
}
