package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentMarkerList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentMarkerList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentMarkerList"

  /** OpenXRSpatialComponentMarkerList.get_marker_type */
  final def getMarkerType(index: Long): Long = {
    if (gdext.classes.OpenXRSpatialComponentMarkerList.mb_get_marker_type == null) gdext.classes.OpenXRSpatialComponentMarkerList.mb_get_marker_type = MethodBind.get("OpenXRSpatialComponentMarkerList", "get_marker_type", 2627847866L)
    Ptrcall.call1[Long, Long](gdext.classes.OpenXRSpatialComponentMarkerList.mb_get_marker_type, livePtr, index)
  }

  /** OpenXRSpatialComponentMarkerList.get_marker_id */
  final def getMarkerId(index: Long): Long = {
    if (gdext.classes.OpenXRSpatialComponentMarkerList.mb_get_marker_id == null) gdext.classes.OpenXRSpatialComponentMarkerList.mb_get_marker_id = MethodBind.get("OpenXRSpatialComponentMarkerList", "get_marker_id", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.OpenXRSpatialComponentMarkerList.mb_get_marker_id, livePtr, index)
  }

}

object OpenXRSpatialComponentMarkerList {
  private[classes] var mb_get_marker_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_marker_id: GDExtensionMethodBindPtr = null
}
