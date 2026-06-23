package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ConcavePolygonShape2D`, extends `Shape2D`. */
abstract class ConcavePolygonShape2D extends Shape2D {

}

object ConcavePolygonShape2D {
  /** Class metadata for Gd[ConcavePolygonShape2D] lifetime management and casting. */
  given GodotClass[ConcavePolygonShape2D] with {
    def className = "ConcavePolygonShape2D"
    def isRefCounted = true
    def wrap(o: GodotObject): ConcavePolygonShape2D = new ConcavePolygonShape2D {}.withHost(o.objectPtr)
    def unwrap(t: ConcavePolygonShape2D): GodotObject = t.hostObject
  }
}
