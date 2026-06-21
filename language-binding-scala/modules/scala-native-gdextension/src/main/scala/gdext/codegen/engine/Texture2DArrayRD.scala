package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Texture2DArrayRD`, extends `TextureLayeredRD`. */
abstract class Texture2DArrayRD extends TextureLayeredRD {

}

object Texture2DArrayRD {
  /** Class metadata for Gd[Texture2DArrayRD] lifetime management and casting. */
  given GodotClass[Texture2DArrayRD] with {
    def className = "Texture2DArrayRD"
    def isRefCounted = true
    def wrap(o: GodotObject): Texture2DArrayRD = new Texture2DArrayRD {}.withHost(o.objectPtr)
    def unwrap(t: Texture2DArrayRD): GodotObject = t.hostObject
  }
}
