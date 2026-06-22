package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ConvexPolygonShape2D`, extends `Shape2D`. */
abstract class ConvexPolygonShape2D extends Shape2D {

}

object ConvexPolygonShape2D {
  /** Class metadata for Gd[ConvexPolygonShape2D] lifetime management and casting. */
  given GodotClass[ConvexPolygonShape2D] with {
    def className = "ConvexPolygonShape2D"
    def isRefCounted = true
    def wrap(o: GodotObject): ConvexPolygonShape2D = new ConvexPolygonShape2D {}.withHost(o.objectPtr)
    def unwrap(t: ConvexPolygonShape2D): GodotObject = t.hostObject
  }
}
