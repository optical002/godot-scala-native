package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `FABRIK3D`, extends `IterateIK3D`. */
abstract class FABRIK3D extends IterateIK3D {

}

object FABRIK3D {
  /** Class metadata for Gd[FABRIK3D] lifetime management and casting. */
  given GodotClass[FABRIK3D] with {
    def className = "FABRIK3D"
    def isRefCounted = false
    def wrap(o: GodotObject): FABRIK3D = new FABRIK3D {}.withHost(o.objectPtr)
    def unwrap(t: FABRIK3D): GodotObject = t.hostObject
  }
}
