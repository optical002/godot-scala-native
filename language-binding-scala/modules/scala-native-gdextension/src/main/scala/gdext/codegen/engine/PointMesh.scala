package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PointMesh`, extends `PrimitiveMesh`. */
abstract class PointMesh extends PrimitiveMesh {

}

object PointMesh {
  /** Class metadata for Gd[PointMesh] lifetime management and casting. */
  given GodotClass[PointMesh] with {
    def className = "PointMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): PointMesh = new PointMesh {}.withHost(o.objectPtr)
    def unwrap(t: PointMesh): GodotObject = t.hostObject
  }
}
