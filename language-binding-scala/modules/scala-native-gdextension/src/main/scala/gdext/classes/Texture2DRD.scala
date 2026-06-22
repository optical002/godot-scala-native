package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Texture2DRD`, extends `Texture2D`. */
abstract class Texture2DRD extends Texture2D {

}

object Texture2DRD {
  /** Class metadata for Gd[Texture2DRD] lifetime management and casting. */
  given GodotClass[Texture2DRD] with {
    def className = "Texture2DRD"
    def isRefCounted = true
    def wrap(o: GodotObject): Texture2DRD = new Texture2DRD {}.withHost(o.objectPtr)
    def unwrap(t: Texture2DRD): GodotObject = t.hostObject
  }
}
