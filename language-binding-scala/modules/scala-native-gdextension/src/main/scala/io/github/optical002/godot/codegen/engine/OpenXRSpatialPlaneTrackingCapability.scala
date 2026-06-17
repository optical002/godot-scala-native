package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialPlaneTrackingCapability`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRSpatialPlaneTrackingCapability extends OpenXRExtensionWrapper {

  /** OpenXRSpatialPlaneTrackingCapability.is_supported */
  final def isSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRSpatialPlaneTrackingCapability", "is_supported", 2240911060L), hostObject.objectPtr)

}

object OpenXRSpatialPlaneTrackingCapability {
  /** Class metadata for Gd[OpenXRSpatialPlaneTrackingCapability] lifetime management and casting. */
  given GodotClass[OpenXRSpatialPlaneTrackingCapability] with {
    def className = "OpenXRSpatialPlaneTrackingCapability"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRSpatialPlaneTrackingCapability = new OpenXRSpatialPlaneTrackingCapability {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialPlaneTrackingCapability): GodotObject = t.hostObject
  }
}
