package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialPlaneTrackingCapability`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRSpatialPlaneTrackingCapability extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRSpatialPlaneTrackingCapability"

  /** OpenXRSpatialPlaneTrackingCapability.is_supported */
  final def isSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRSpatialPlaneTrackingCapability", "is_supported", 2240911060L), hostObject.objectPtr)

}
