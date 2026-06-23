package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `QuadMesh`, extends `PlaneMesh`. */
abstract class QuadMesh extends PlaneMesh {

}

object QuadMesh {
  /** Class metadata for Gd[QuadMesh] lifetime management and casting. */
  given GodotClass[QuadMesh] with {
    def className = "QuadMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): QuadMesh = new QuadMesh {}.withHost(o.objectPtr)
    def unwrap(t: QuadMesh): GodotObject = t.hostObject
  }
}
