package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SpotLight3D`, extends `Light3D`. */
abstract class SpotLight3D extends Light3D {

}

object SpotLight3D {
  /** Class metadata for Gd[SpotLight3D] lifetime management and casting. */
  given GodotClass[SpotLight3D] with {
    def className = "SpotLight3D"
    def isRefCounted = false
    def wrap(o: GodotObject): SpotLight3D = new SpotLight3D {}.withHost(o.objectPtr)
    def unwrap(t: SpotLight3D): GodotObject = t.hostObject
  }
}
