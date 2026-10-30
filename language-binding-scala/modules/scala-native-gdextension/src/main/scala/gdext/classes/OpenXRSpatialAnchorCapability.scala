package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def isPersistenceScopeSupported(scope: gdext.classes.OpenXRSpatialAnchorCapability.PersistenceScope): Boolean = {
    if (gdext.classes.OpenXRSpatialAnchorCapability.mb_is_persistence_scope_supported == null) gdext.classes.OpenXRSpatialAnchorCapability.mb_is_persistence_scope_supported = MethodBind.get("OpenXRSpatialAnchorCapability", "is_persistence_scope_supported", 3651771626L)
    Ptrcall.call1[Long, Boolean](gdext.classes.OpenXRSpatialAnchorCapability.mb_is_persistence_scope_supported, livePtr, scope)
  }

  /** OpenXRSpatialAnchorCapability.remove_anchor */
  final def removeAnchor(anchorTracker: OpenXRAnchorTracker): Unit = {
    if (gdext.classes.OpenXRSpatialAnchorCapability.mb_remove_anchor == null) gdext.classes.OpenXRSpatialAnchorCapability.mb_remove_anchor = MethodBind.get("OpenXRSpatialAnchorCapability", "remove_anchor", 3579451518L)
    Ptrcall.callVoid1(gdext.classes.OpenXRSpatialAnchorCapability.mb_remove_anchor, livePtr, Wrappers.handle(anchorTracker))
  }

}

object OpenXRSpatialAnchorCapability {
  private[classes] var mb_is_spatial_anchor_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_spatial_persistence_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_persistence_scope_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_anchor: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRSpatialAnchorCapability.PersistenceScope`. */
  opaque type PersistenceScope <: Long = Long

  object PersistenceScope {
    final val SystemManaged: PersistenceScope = 1L.asInstanceOf[PersistenceScope]
    final val LocalAnchors: PersistenceScope = 1000781000L.asInstanceOf[PersistenceScope]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PersistenceScope = value.asInstanceOf[PersistenceScope]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PersistenceScope] = scala.IArray[Long](1L, 1000781000L).asInstanceOf[scala.IArray[PersistenceScope]]

    extension (self: PersistenceScope)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "SystemManaged"
        case 1000781000L => "LocalAnchors"
        case other => other.toString
      }
  }
}
