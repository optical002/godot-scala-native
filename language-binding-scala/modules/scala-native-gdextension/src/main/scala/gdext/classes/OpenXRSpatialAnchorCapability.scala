package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialAnchorCapability`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRSpatialAnchorCapability extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRSpatialAnchorCapability"

  /** OpenXRSpatialAnchorCapability.is_spatial_anchor_supported */
  final def isSpatialAnchorSupported(): Boolean = {
    if (gdext.classes.OpenXRSpatialAnchorCapability.mb_is_spatial_anchor_supported == null) gdext.classes.OpenXRSpatialAnchorCapability.mb_is_spatial_anchor_supported = MethodBind.get("OpenXRSpatialAnchorCapability", "is_spatial_anchor_supported", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRSpatialAnchorCapability.mb_is_spatial_anchor_supported, livePtr)
  }

  /** OpenXRSpatialAnchorCapability.is_spatial_persistence_supported */
  final def isSpatialPersistenceSupported(): Boolean = {
    if (gdext.classes.OpenXRSpatialAnchorCapability.mb_is_spatial_persistence_supported == null) gdext.classes.OpenXRSpatialAnchorCapability.mb_is_spatial_persistence_supported = MethodBind.get("OpenXRSpatialAnchorCapability", "is_spatial_persistence_supported", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRSpatialAnchorCapability.mb_is_spatial_persistence_supported, livePtr)
  }

  /** OpenXRSpatialAnchorCapability.is_persistence_scope_supported */
  final def isPersistenceScopeSupported(scope: Long): Boolean = {
    if (gdext.classes.OpenXRSpatialAnchorCapability.mb_is_persistence_scope_supported == null) gdext.classes.OpenXRSpatialAnchorCapability.mb_is_persistence_scope_supported = MethodBind.get("OpenXRSpatialAnchorCapability", "is_persistence_scope_supported", 3651771626L)
    Ptrcall.call1[Long, Boolean](gdext.classes.OpenXRSpatialAnchorCapability.mb_is_persistence_scope_supported, livePtr, scope)
  }

  /** OpenXRSpatialAnchorCapability.remove_anchor */
  final def removeAnchor(anchor_tracker: OpenXRAnchorTracker): Unit = {
    if (gdext.classes.OpenXRSpatialAnchorCapability.mb_remove_anchor == null) gdext.classes.OpenXRSpatialAnchorCapability.mb_remove_anchor = MethodBind.get("OpenXRSpatialAnchorCapability", "remove_anchor", 3579451518L)
    Ptrcall.callVoid1(gdext.classes.OpenXRSpatialAnchorCapability.mb_remove_anchor, livePtr, Wrappers.handle(anchor_tracker))
  }

}

object OpenXRSpatialAnchorCapability {
  private[classes] var mb_is_spatial_anchor_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_spatial_persistence_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_persistence_scope_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_anchor: GDExtensionMethodBindPtr = null
}
