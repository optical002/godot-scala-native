package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialMarkerTrackingCapability`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRSpatialMarkerTrackingCapability extends OpenXRExtensionWrapper {

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

object OpenXRSpatialMarkerTrackingCapability {
  /** Class metadata for Gd[OpenXRSpatialMarkerTrackingCapability] lifetime management and casting. */
  given GodotClass[OpenXRSpatialMarkerTrackingCapability] with {
    def className = "OpenXRSpatialMarkerTrackingCapability"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRSpatialMarkerTrackingCapability = new OpenXRSpatialMarkerTrackingCapability {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialMarkerTrackingCapability): GodotObject = t.hostObject
  }
}
