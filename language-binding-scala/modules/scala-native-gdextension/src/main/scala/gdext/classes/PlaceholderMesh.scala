package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderMesh`, extends `Mesh`. */
abstract class PlaceholderMesh extends Mesh {

  /** PlaceholderMesh.set_aabb */
  final def setAabb(aabb: gdext.builtin.AABB): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaceholderMesh", "set_aabb", 259215842L), hostObject.objectPtr, aabb)

}

object PlaceholderMesh {
  /** Class metadata for Gd[PlaceholderMesh] lifetime management and casting. */
  given GodotClass[PlaceholderMesh] with {
    def className = "PlaceholderMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): PlaceholderMesh = new PlaceholderMesh {}.withHost(o.objectPtr)
    def unwrap(t: PlaceholderMesh): GodotObject = t.hostObject
  }
}
