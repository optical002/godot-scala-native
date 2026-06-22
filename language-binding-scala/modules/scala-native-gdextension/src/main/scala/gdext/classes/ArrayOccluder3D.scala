package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ArrayOccluder3D`, extends `Occluder3D`. */
abstract class ArrayOccluder3D extends Occluder3D {

}

object ArrayOccluder3D {
  /** Class metadata for Gd[ArrayOccluder3D] lifetime management and casting. */
  given GodotClass[ArrayOccluder3D] with {
    def className = "ArrayOccluder3D"
    def isRefCounted = true
    def wrap(o: GodotObject): ArrayOccluder3D = new ArrayOccluder3D {}.withHost(o.objectPtr)
    def unwrap(t: ArrayOccluder3D): GodotObject = t.hostObject
  }
}
