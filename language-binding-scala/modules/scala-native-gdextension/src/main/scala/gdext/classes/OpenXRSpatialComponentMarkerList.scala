package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentMarkerList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentMarkerList extends OpenXRSpatialComponentData {

  /** OpenXRSpatialComponentMarkerList.get_marker_type */
  final def getMarkerType(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRSpatialComponentMarkerList", "get_marker_type", 2627847866L), hostObject.objectPtr, index)

  /** OpenXRSpatialComponentMarkerList.get_marker_id */
  final def getMarkerId(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRSpatialComponentMarkerList", "get_marker_id", 923996154L), hostObject.objectPtr, index)

}

object OpenXRSpatialComponentMarkerList {
  /** Class metadata for Gd[OpenXRSpatialComponentMarkerList] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentMarkerList] with {
    def className = "OpenXRSpatialComponentMarkerList"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentMarkerList = new OpenXRSpatialComponentMarkerList {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentMarkerList): GodotObject = t.hostObject
  }
}
