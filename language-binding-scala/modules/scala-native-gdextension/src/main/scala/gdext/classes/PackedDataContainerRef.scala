package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PackedDataContainerRef`, extends `RefCounted`. */
abstract class PackedDataContainerRef extends RefCounted {
  override def godotClassName: String = "PackedDataContainerRef"

  /** PackedDataContainerRef.size */
  final def size(): Long =
    Ptrcall.call0[Long](MethodBind.get("PackedDataContainerRef", "size", 3905245786L), hostObject.objectPtr)

}
