package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Occluder3D`, extends `Resource`. */
abstract class Occluder3D extends Resource {

}

object Occluder3D {
  /** Class metadata for Gd[Occluder3D] lifetime management and casting. */
  given GodotClass[Occluder3D] with {
    def className = "Occluder3D"
    def isRefCounted = true
    def wrap(o: GodotObject): Occluder3D = new Occluder3D {}.withHost(o.objectPtr)
    def unwrap(t: Occluder3D): GodotObject = t.hostObject
  }
}
