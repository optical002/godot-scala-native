package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentData`, extends `RefCounted`. */
abstract class OpenXRSpatialComponentData extends RefCounted {
  override def godotClassName: String = "OpenXRSpatialComponentData"

  /** OpenXRSpatialComponentData.set_capacity */
  final def setCapacity(capacity: Long): Unit = {
    if (gdext.classes.OpenXRSpatialComponentData.mb_set_capacity == null) gdext.classes.OpenXRSpatialComponentData.mb_set_capacity = MethodBind.get("OpenXRSpatialComponentData", "set_capacity", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OpenXRSpatialComponentData.mb_set_capacity, livePtr, capacity)
  }

}

object OpenXRSpatialComponentData {
  private[classes] var mb_set_capacity: GDExtensionMethodBindPtr = null
}
