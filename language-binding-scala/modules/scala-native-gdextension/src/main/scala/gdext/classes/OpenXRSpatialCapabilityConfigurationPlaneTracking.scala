package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationPlaneTracking`, extends `OpenXRSpatialCapabilityConfigurationBaseHeader`. */
abstract class OpenXRSpatialCapabilityConfigurationPlaneTracking extends OpenXRSpatialCapabilityConfigurationBaseHeader {

  /** OpenXRSpatialCapabilityConfigurationPlaneTracking.supports_mesh_2d */
  final def supportsMesh2d(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRSpatialCapabilityConfigurationPlaneTracking", "supports_mesh_2d", 2240911060L), hostObject.objectPtr)

  /** OpenXRSpatialCapabilityConfigurationPlaneTracking.supports_polygons */
  final def supportsPolygons(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRSpatialCapabilityConfigurationPlaneTracking", "supports_polygons", 2240911060L), hostObject.objectPtr)

  /** OpenXRSpatialCapabilityConfigurationPlaneTracking.supports_labels */
  final def supportsLabels(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRSpatialCapabilityConfigurationPlaneTracking", "supports_labels", 2240911060L), hostObject.objectPtr)

}

object OpenXRSpatialCapabilityConfigurationPlaneTracking {
  /** Class metadata for Gd[OpenXRSpatialCapabilityConfigurationPlaneTracking] lifetime management and casting. */
  given GodotClass[OpenXRSpatialCapabilityConfigurationPlaneTracking] with {
    def className = "OpenXRSpatialCapabilityConfigurationPlaneTracking"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialCapabilityConfigurationPlaneTracking = new OpenXRSpatialCapabilityConfigurationPlaneTracking {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialCapabilityConfigurationPlaneTracking): GodotObject = t.hostObject
  }
}
