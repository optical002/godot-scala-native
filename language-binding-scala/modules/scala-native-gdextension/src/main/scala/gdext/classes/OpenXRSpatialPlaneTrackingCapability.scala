package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialPlaneTrackingCapability`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRSpatialPlaneTrackingCapability extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRSpatialPlaneTrackingCapability"

  /** OpenXRSpatialPlaneTrackingCapability.is_supported */
  final def isSupported(): Boolean = {
    if (gdext.classes.OpenXRSpatialPlaneTrackingCapability.mb_is_supported == null) gdext.classes.OpenXRSpatialPlaneTrackingCapability.mb_is_supported = MethodBind.get("OpenXRSpatialPlaneTrackingCapability", "is_supported", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRSpatialPlaneTrackingCapability.mb_is_supported, livePtr)
  }

}

object OpenXRSpatialPlaneTrackingCapability {
  private[classes] var mb_is_supported: GDExtensionMethodBindPtr = null
}
