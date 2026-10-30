package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialQueryResultData`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialQueryResultData extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialQueryResultData"

  /** OpenXRSpatialQueryResultData.get_capacity */
  final def getCapacity(): Long = {
    if (gdext.classes.OpenXRSpatialQueryResultData.mb_get_capacity == null) gdext.classes.OpenXRSpatialQueryResultData.mb_get_capacity = MethodBind.get("OpenXRSpatialQueryResultData", "get_capacity", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRSpatialQueryResultData.mb_get_capacity, livePtr)
  }

  /** OpenXRSpatialQueryResultData.get_entity_id */
  final def getEntityId(index: Long): Long = {
    if (gdext.classes.OpenXRSpatialQueryResultData.mb_get_entity_id == null) gdext.classes.OpenXRSpatialQueryResultData.mb_get_entity_id = MethodBind.get("OpenXRSpatialQueryResultData", "get_entity_id", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.OpenXRSpatialQueryResultData.mb_get_entity_id, livePtr, index)
  }

  /** OpenXRSpatialQueryResultData.get_entity_state */
  final def getEntityState(index: Long): gdext.classes.OpenXRSpatialEntityTracker.EntityTrackingState = {
    if (gdext.classes.OpenXRSpatialQueryResultData.mb_get_entity_state == null) gdext.classes.OpenXRSpatialQueryResultData.mb_get_entity_state = MethodBind.get("OpenXRSpatialQueryResultData", "get_entity_state", 1411962015L)
    gdext.classes.OpenXRSpatialEntityTracker.EntityTrackingState(Ptrcall.call1[Long, Long](gdext.classes.OpenXRSpatialQueryResultData.mb_get_entity_state, livePtr, index))
  }

}

object OpenXRSpatialQueryResultData {
  private[classes] var mb_get_capacity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_entity_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_entity_state: GDExtensionMethodBindPtr = null
}
