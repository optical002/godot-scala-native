package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationPlaneTracking`, extends `OpenXRSpatialCapabilityConfigurationBaseHeader`. */
abstract class OpenXRSpatialCapabilityConfigurationPlaneTracking extends OpenXRSpatialCapabilityConfigurationBaseHeader {
  override def godotClassName: String = "OpenXRSpatialCapabilityConfigurationPlaneTracking"

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
