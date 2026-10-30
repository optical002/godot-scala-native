package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialEntityTracker`, extends `XRPositionalTracker`. */
abstract class OpenXRSpatialEntityTracker extends XRPositionalTracker {
  override def godotClassName: String = "OpenXRSpatialEntityTracker"

  /** OpenXRSpatialEntityTracker.set_spatial_tracking_state */
  final def setSpatialTrackingState(spatialTrackingState: gdext.classes.OpenXRSpatialEntityTracker.EntityTrackingState): Unit = {
    if (gdext.classes.OpenXRSpatialEntityTracker.mb_set_spatial_tracking_state == null) gdext.classes.OpenXRSpatialEntityTracker.mb_set_spatial_tracking_state = MethodBind.get("OpenXRSpatialEntityTracker", "set_spatial_tracking_state", 2170234447L)
    Ptrcall.callVoid1(gdext.classes.OpenXRSpatialEntityTracker.mb_set_spatial_tracking_state, livePtr, spatialTrackingState)
  }

  /** OpenXRSpatialEntityTracker.get_spatial_tracking_state */
  final def getSpatialTrackingState(): gdext.classes.OpenXRSpatialEntityTracker.EntityTrackingState = {
    if (gdext.classes.OpenXRSpatialEntityTracker.mb_get_spatial_tracking_state == null) gdext.classes.OpenXRSpatialEntityTracker.mb_get_spatial_tracking_state = MethodBind.get("OpenXRSpatialEntityTracker", "get_spatial_tracking_state", 3351876560L)
    gdext.classes.OpenXRSpatialEntityTracker.EntityTrackingState(Ptrcall.call0[Long](gdext.classes.OpenXRSpatialEntityTracker.mb_get_spatial_tracking_state, livePtr))
  }

}

object OpenXRSpatialEntityTracker {
  private[classes] var mb_set_spatial_tracking_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spatial_tracking_state: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRSpatialEntityTracker.EntityTrackingState`. */
  opaque type EntityTrackingState <: Long = Long

  object EntityTrackingState {
    final val Stopped: EntityTrackingState = 1L.asInstanceOf[EntityTrackingState]
    final val Paused: EntityTrackingState = 2L.asInstanceOf[EntityTrackingState]
    final val Tracking: EntityTrackingState = 3L.asInstanceOf[EntityTrackingState]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EntityTrackingState = value.asInstanceOf[EntityTrackingState]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EntityTrackingState] = scala.IArray[Long](1L, 2L, 3L).asInstanceOf[scala.IArray[EntityTrackingState]]

    extension (self: EntityTrackingState)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Stopped"
        case 2L => "Paused"
        case 3L => "Tracking"
        case other => other.toString
      }
  }
}
