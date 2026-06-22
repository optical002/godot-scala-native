package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Texture2DArray`, extends `ImageTextureLayered`. */
abstract class Texture2DArray extends ImageTextureLayered {

  /** Texture2DArray.create_placeholder */
  final def createPlaceholder(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Texture2DArray", "create_placeholder", 121922552L), hostObject.objectPtr)

}

object Texture2DArray {
  /** Class metadata for Gd[Texture2DArray] lifetime management and casting. */
  given GodotClass[Texture2DArray] with {
    def className = "Texture2DArray"
    def isRefCounted = true
    def wrap(o: GodotObject): Texture2DArray = new Texture2DArray {}.withHost(o.objectPtr)
    def unwrap(t: Texture2DArray): GodotObject = t.hostObject
  }
}
