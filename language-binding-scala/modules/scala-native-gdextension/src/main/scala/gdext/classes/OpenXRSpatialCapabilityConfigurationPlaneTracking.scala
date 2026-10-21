package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationPlaneTracking`, extends `OpenXRSpatialCapabilityConfigurationBaseHeader`. */
abstract class OpenXRSpatialCapabilityConfigurationPlaneTracking extends OpenXRSpatialCapabilityConfigurationBaseHeader {
  override def godotClassName: String = "OpenXRSpatialCapabilityConfigurationPlaneTracking"

  /** OpenXRSpatialCapabilityConfigurationPlaneTracking.supports_mesh_2d */
  final def supportsMesh2d(): Boolean = {
    if (gdext.classes.OpenXRSpatialCapabilityConfigurationPlaneTracking.mb_supports_mesh_2d == null) gdext.classes.OpenXRSpatialCapabilityConfigurationPlaneTracking.mb_supports_mesh_2d = MethodBind.get("OpenXRSpatialCapabilityConfigurationPlaneTracking", "supports_mesh_2d", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRSpatialCapabilityConfigurationPlaneTracking.mb_supports_mesh_2d, livePtr)
  }

  /** OpenXRSpatialCapabilityConfigurationPlaneTracking.supports_polygons */
  final def supportsPolygons(): Boolean = {
    if (gdext.classes.OpenXRSpatialCapabilityConfigurationPlaneTracking.mb_supports_polygons == null) gdext.classes.OpenXRSpatialCapabilityConfigurationPlaneTracking.mb_supports_polygons = MethodBind.get("OpenXRSpatialCapabilityConfigurationPlaneTracking", "supports_polygons", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRSpatialCapabilityConfigurationPlaneTracking.mb_supports_polygons, livePtr)
  }

  /** OpenXRSpatialCapabilityConfigurationPlaneTracking.supports_labels */
  final def supportsLabels(): Boolean = {
    if (gdext.classes.OpenXRSpatialCapabilityConfigurationPlaneTracking.mb_supports_labels == null) gdext.classes.OpenXRSpatialCapabilityConfigurationPlaneTracking.mb_supports_labels = MethodBind.get("OpenXRSpatialCapabilityConfigurationPlaneTracking", "supports_labels", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRSpatialCapabilityConfigurationPlaneTracking.mb_supports_labels, livePtr)
  }

}

object OpenXRSpatialCapabilityConfigurationPlaneTracking {
  private[classes] var mb_supports_mesh_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_supports_polygons: GDExtensionMethodBindPtr = null
  private[classes] var mb_supports_labels: GDExtensionMethodBindPtr = null
}
