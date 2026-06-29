package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialAnchorCapability`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRSpatialAnchorCapability extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRSpatialAnchorCapability"

  /** OpenXRSpatialAnchorCapability.is_spatial_anchor_supported */
  final def isSpatialAnchorSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRSpatialAnchorCapability", "is_spatial_anchor_supported", 2240911060L), hostObject.objectPtr)

  /** OpenXRSpatialAnchorCapability.is_spatial_persistence_supported */
  final def isSpatialPersistenceSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRSpatialAnchorCapability", "is_spatial_persistence_supported", 2240911060L), hostObject.objectPtr)

  /** OpenXRSpatialAnchorCapability.is_persistence_scope_supported */
  final def isPersistenceScopeSupported(scope: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("OpenXRSpatialAnchorCapability", "is_persistence_scope_supported", 3651771626L), hostObject.objectPtr, scope)

  /** OpenXRSpatialAnchorCapability.remove_anchor */
  final def removeAnchor(anchor_tracker: OpenXRAnchorTracker): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRSpatialAnchorCapability", "remove_anchor", 3579451518L), hostObject.objectPtr, anchor_tracker.hostObject)

}
