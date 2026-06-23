package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CSGCombiner3D`, extends `CSGShape3D`. */
abstract class CSGCombiner3D extends CSGShape3D {

}

object CSGCombiner3D {
  /** Class metadata for Gd[CSGCombiner3D] lifetime management and casting. */
  given GodotClass[CSGCombiner3D] with {
    def className = "CSGCombiner3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CSGCombiner3D = new CSGCombiner3D {}.withHost(o.objectPtr)
    def unwrap(t: CSGCombiner3D): GodotObject = t.hostObject
  }
}
