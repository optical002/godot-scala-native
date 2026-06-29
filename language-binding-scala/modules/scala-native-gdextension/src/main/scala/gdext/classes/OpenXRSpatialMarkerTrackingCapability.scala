package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialMarkerTrackingCapability`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRSpatialMarkerTrackingCapability extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRSpatialMarkerTrackingCapability"

  /** OpenXRSpatialMarkerTrackingCapability.is_qrcode_supported */
  final def isQrcodeSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRSpatialMarkerTrackingCapability", "is_qrcode_supported", 2240911060L), hostObject.objectPtr)

  /** OpenXRSpatialMarkerTrackingCapability.is_micro_qrcode_supported */
  final def isMicroQrcodeSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRSpatialMarkerTrackingCapability", "is_micro_qrcode_supported", 2240911060L), hostObject.objectPtr)

  /** OpenXRSpatialMarkerTrackingCapability.is_aruco_supported */
  final def isArucoSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRSpatialMarkerTrackingCapability", "is_aruco_supported", 2240911060L), hostObject.objectPtr)

  /** OpenXRSpatialMarkerTrackingCapability.is_april_tag_supported */
  final def isAprilTagSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRSpatialMarkerTrackingCapability", "is_april_tag_supported", 2240911060L), hostObject.objectPtr)

}
