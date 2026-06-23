package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialQueryResultData`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialQueryResultData extends OpenXRSpatialComponentData {

  /** OpenXRSpatialQueryResultData.get_capacity */
  final def getCapacity(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRSpatialQueryResultData", "get_capacity", 3905245786L), hostObject.objectPtr)

  /** OpenXRSpatialQueryResultData.get_entity_id */
  final def getEntityId(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRSpatialQueryResultData", "get_entity_id", 923996154L), hostObject.objectPtr, index)

  /** OpenXRSpatialQueryResultData.get_entity_state */
  final def getEntityState(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRSpatialQueryResultData", "get_entity_state", 1411962015L), hostObject.objectPtr, index)

}

object OpenXRSpatialQueryResultData {
  /** Class metadata for Gd[OpenXRSpatialQueryResultData] lifetime management and casting. */
  given GodotClass[OpenXRSpatialQueryResultData] with {
    def className = "OpenXRSpatialQueryResultData"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialQueryResultData = new OpenXRSpatialQueryResultData {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialQueryResultData): GodotObject = t.hostObject
  }
}
