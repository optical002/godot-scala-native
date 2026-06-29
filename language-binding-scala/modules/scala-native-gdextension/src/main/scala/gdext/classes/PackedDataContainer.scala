package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PackedDataContainer`, extends `Resource`. */
abstract class PackedDataContainer extends Resource {
  override def godotClassName: String = "PackedDataContainer"

  /** PackedDataContainer.size */
  final def size(): Long =
    Ptrcall.call0[Long](MethodBind.get("PackedDataContainer", "size", 3905245786L), hostObject.objectPtr)

}
