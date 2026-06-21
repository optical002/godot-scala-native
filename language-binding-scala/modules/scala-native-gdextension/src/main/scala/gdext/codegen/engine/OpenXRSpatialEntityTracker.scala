package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialEntityTracker`, extends `XRPositionalTracker`. */
abstract class OpenXRSpatialEntityTracker extends XRPositionalTracker {

  /** OpenXRSpatialEntityTracker.set_spatial_tracking_state */
  final def setSpatialTrackingState(spatial_tracking_state: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRSpatialEntityTracker", "set_spatial_tracking_state", 2170234447L), hostObject.objectPtr, spatial_tracking_state)

  /** OpenXRSpatialEntityTracker.get_spatial_tracking_state */
  final def getSpatialTrackingState(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRSpatialEntityTracker", "get_spatial_tracking_state", 3351876560L), hostObject.objectPtr)

}

object OpenXRSpatialEntityTracker {
  /** Class metadata for Gd[OpenXRSpatialEntityTracker] lifetime management and casting. */
  given GodotClass[OpenXRSpatialEntityTracker] with {
    def className = "OpenXRSpatialEntityTracker"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialEntityTracker = new OpenXRSpatialEntityTracker {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialEntityTracker): GodotObject = t.hostObject
  }
}
