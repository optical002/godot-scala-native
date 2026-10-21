package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialEntityTracker`, extends `XRPositionalTracker`. */
abstract class OpenXRSpatialEntityTracker extends XRPositionalTracker {
  override def godotClassName: String = "OpenXRSpatialEntityTracker"

  /** OpenXRSpatialEntityTracker.set_spatial_tracking_state */
  final def setSpatialTrackingState(spatial_tracking_state: Long): Unit = {
    if (gdext.classes.OpenXRSpatialEntityTracker.mb_set_spatial_tracking_state == null) gdext.classes.OpenXRSpatialEntityTracker.mb_set_spatial_tracking_state = MethodBind.get("OpenXRSpatialEntityTracker", "set_spatial_tracking_state", 2170234447L)
    Ptrcall.callVoid1(gdext.classes.OpenXRSpatialEntityTracker.mb_set_spatial_tracking_state, livePtr, spatial_tracking_state)
  }

  /** OpenXRSpatialEntityTracker.get_spatial_tracking_state */
  final def getSpatialTrackingState(): Long = {
    if (gdext.classes.OpenXRSpatialEntityTracker.mb_get_spatial_tracking_state == null) gdext.classes.OpenXRSpatialEntityTracker.mb_get_spatial_tracking_state = MethodBind.get("OpenXRSpatialEntityTracker", "get_spatial_tracking_state", 3351876560L)
    Ptrcall.call0[Long](gdext.classes.OpenXRSpatialEntityTracker.mb_get_spatial_tracking_state, livePtr)
  }

}

object OpenXRSpatialEntityTracker {
  private[classes] var mb_set_spatial_tracking_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spatial_tracking_state: GDExtensionMethodBindPtr = null
}
