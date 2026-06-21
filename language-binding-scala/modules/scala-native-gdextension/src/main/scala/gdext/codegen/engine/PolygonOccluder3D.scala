package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PolygonOccluder3D`, extends `Occluder3D`. */
abstract class PolygonOccluder3D extends Occluder3D {

}

object PolygonOccluder3D {
  /** Class metadata for Gd[PolygonOccluder3D] lifetime management and casting. */
  given GodotClass[PolygonOccluder3D] with {
    def className = "PolygonOccluder3D"
    def isRefCounted = true
    def wrap(o: GodotObject): PolygonOccluder3D = new PolygonOccluder3D {}.withHost(o.objectPtr)
    def unwrap(t: PolygonOccluder3D): GodotObject = t.hostObject
  }
}
