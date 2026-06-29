package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentPlaneAlignmentList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPlaneAlignmentList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentPlaneAlignmentList"

  /** OpenXRSpatialComponentPlaneAlignmentList.get_plane_alignment */
  final def getPlaneAlignment(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRSpatialComponentPlaneAlignmentList", "get_plane_alignment", 3340200270L), hostObject.objectPtr, index)

}
