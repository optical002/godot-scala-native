package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TriangleMesh`, extends `RefCounted`. */
abstract class TriangleMesh extends RefCounted {

}

object TriangleMesh {
  /** Class metadata for Gd[TriangleMesh] lifetime management and casting. */
  given GodotClass[TriangleMesh] with {
    def className = "TriangleMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): TriangleMesh = new TriangleMesh {}.withHost(o.objectPtr)
    def unwrap(t: TriangleMesh): GodotObject = t.hostObject
  }
}
