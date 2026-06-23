package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ConvexPolygonShape3D`, extends `Shape3D`. */
abstract class ConvexPolygonShape3D extends Shape3D {

}

object ConvexPolygonShape3D {
  /** Class metadata for Gd[ConvexPolygonShape3D] lifetime management and casting. */
  given GodotClass[ConvexPolygonShape3D] with {
    def className = "ConvexPolygonShape3D"
    def isRefCounted = true
    def wrap(o: GodotObject): ConvexPolygonShape3D = new ConvexPolygonShape3D {}.withHost(o.objectPtr)
    def unwrap(t: ConvexPolygonShape3D): GodotObject = t.hostObject
  }
}
