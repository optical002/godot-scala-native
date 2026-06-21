package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Texture3DRD`, extends `Texture3D`. */
abstract class Texture3DRD extends Texture3D {

}

object Texture3DRD {
  /** Class metadata for Gd[Texture3DRD] lifetime management and casting. */
  given GodotClass[Texture3DRD] with {
    def className = "Texture3DRD"
    def isRefCounted = true
    def wrap(o: GodotObject): Texture3DRD = new Texture3DRD {}.withHost(o.objectPtr)
    def unwrap(t: Texture3DRD): GodotObject = t.hostObject
  }
}
