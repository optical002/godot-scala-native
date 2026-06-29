package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentData`, extends `RefCounted`. */
abstract class OpenXRSpatialComponentData extends RefCounted {
  override def godotClassName: String = "OpenXRSpatialComponentData"

  /** OpenXRSpatialComponentData.set_capacity */
  final def setCapacity(capacity: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRSpatialComponentData", "set_capacity", 1286410249L), hostObject.objectPtr, capacity)

}
