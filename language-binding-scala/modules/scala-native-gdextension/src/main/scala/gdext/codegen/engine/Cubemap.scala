package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Cubemap`, extends `ImageTextureLayered`. */
abstract class Cubemap extends ImageTextureLayered {

  /** Cubemap.create_placeholder */
  final def createPlaceholder(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Cubemap", "create_placeholder", 121922552L), hostObject.objectPtr)

}

object Cubemap {
  /** Class metadata for Gd[Cubemap] lifetime management and casting. */
  given GodotClass[Cubemap] with {
    def className = "Cubemap"
    def isRefCounted = true
    def wrap(o: GodotObject): Cubemap = new Cubemap {}.withHost(o.objectPtr)
    def unwrap(t: Cubemap): GodotObject = t.hostObject
  }
}
