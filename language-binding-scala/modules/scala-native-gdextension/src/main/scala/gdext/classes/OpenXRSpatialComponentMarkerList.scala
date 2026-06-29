package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentMarkerList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentMarkerList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentMarkerList"

  /** OpenXRSpatialComponentMarkerList.get_marker_type */
  final def getMarkerType(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRSpatialComponentMarkerList", "get_marker_type", 2627847866L), hostObject.objectPtr, index)

  /** OpenXRSpatialComponentMarkerList.get_marker_id */
  final def getMarkerId(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRSpatialComponentMarkerList", "get_marker_id", 923996154L), hostObject.objectPtr, index)

}
