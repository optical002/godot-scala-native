package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PackedDataContainer`, extends `Resource`. */
abstract class PackedDataContainer extends Resource {
  override def godotClassName: String = "PackedDataContainer"

  /** PackedDataContainer.size */
  final def size(): Long = {
    if (gdext.classes.PackedDataContainer.mb_size == null) gdext.classes.PackedDataContainer.mb_size = MethodBind.get("PackedDataContainer", "size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PackedDataContainer.mb_size, livePtr)
  }

}

object PackedDataContainer {
  private[classes] var mb_size: GDExtensionMethodBindPtr = null
}
