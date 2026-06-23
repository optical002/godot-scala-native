package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PackedDataContainer`, extends `Resource`. */
abstract class PackedDataContainer extends Resource {

  /** PackedDataContainer.size */
  final def size(): Long =
    Ptrcall.call0[Long](MethodBind.get("PackedDataContainer", "size", 3905245786L), hostObject.objectPtr)

}

object PackedDataContainer {
  /** Class metadata for Gd[PackedDataContainer] lifetime management and casting. */
  given GodotClass[PackedDataContainer] with {
    def className = "PackedDataContainer"
    def isRefCounted = true
    def wrap(o: GodotObject): PackedDataContainer = new PackedDataContainer {}.withHost(o.objectPtr)
    def unwrap(t: PackedDataContainer): GodotObject = t.hostObject
  }
}
