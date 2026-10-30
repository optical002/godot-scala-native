package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PackedDataContainerRef`, extends `RefCounted`. */
abstract class PackedDataContainerRef extends RefCounted {
  override def godotClassName: String = "PackedDataContainerRef"

  /** PackedDataContainerRef.size */
  final def size(): Long = {
    if (gdext.classes.PackedDataContainerRef.mb_size == null) gdext.classes.PackedDataContainerRef.mb_size = MethodBind.get("PackedDataContainerRef", "size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PackedDataContainerRef.mb_size, livePtr)
  }

}

object PackedDataContainerRef {
  private[classes] var mb_size: GDExtensionMethodBindPtr = null
}
