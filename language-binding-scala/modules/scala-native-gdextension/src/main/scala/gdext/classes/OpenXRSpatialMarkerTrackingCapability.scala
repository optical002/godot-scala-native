package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialMarkerTrackingCapability`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRSpatialMarkerTrackingCapability extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRSpatialMarkerTrackingCapability"

  /** OpenXRSpatialMarkerTrackingCapability.is_qrcode_supported */
  final def isQrcodeSupported(): Boolean = {
    if (gdext.classes.OpenXRSpatialMarkerTrackingCapability.mb_is_qrcode_supported == null) gdext.classes.OpenXRSpatialMarkerTrackingCapability.mb_is_qrcode_supported = MethodBind.get("OpenXRSpatialMarkerTrackingCapability", "is_qrcode_supported", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRSpatialMarkerTrackingCapability.mb_is_qrcode_supported, livePtr)
  }

  /** OpenXRSpatialMarkerTrackingCapability.is_micro_qrcode_supported */
  final def isMicroQrcodeSupported(): Boolean = {
    if (gdext.classes.OpenXRSpatialMarkerTrackingCapability.mb_is_micro_qrcode_supported == null) gdext.classes.OpenXRSpatialMarkerTrackingCapability.mb_is_micro_qrcode_supported = MethodBind.get("OpenXRSpatialMarkerTrackingCapability", "is_micro_qrcode_supported", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRSpatialMarkerTrackingCapability.mb_is_micro_qrcode_supported, livePtr)
  }

  /** OpenXRSpatialMarkerTrackingCapability.is_aruco_supported */
  final def isArucoSupported(): Boolean = {
    if (gdext.classes.OpenXRSpatialMarkerTrackingCapability.mb_is_aruco_supported == null) gdext.classes.OpenXRSpatialMarkerTrackingCapability.mb_is_aruco_supported = MethodBind.get("OpenXRSpatialMarkerTrackingCapability", "is_aruco_supported", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRSpatialMarkerTrackingCapability.mb_is_aruco_supported, livePtr)
  }

  /** OpenXRSpatialMarkerTrackingCapability.is_april_tag_supported */
  final def isAprilTagSupported(): Boolean = {
    if (gdext.classes.OpenXRSpatialMarkerTrackingCapability.mb_is_april_tag_supported == null) gdext.classes.OpenXRSpatialMarkerTrackingCapability.mb_is_april_tag_supported = MethodBind.get("OpenXRSpatialMarkerTrackingCapability", "is_april_tag_supported", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRSpatialMarkerTrackingCapability.mb_is_april_tag_supported, livePtr)
  }

}

object OpenXRSpatialMarkerTrackingCapability {
  private[classes] var mb_is_qrcode_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_micro_qrcode_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_aruco_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_april_tag_supported: GDExtensionMethodBindPtr = null
}
