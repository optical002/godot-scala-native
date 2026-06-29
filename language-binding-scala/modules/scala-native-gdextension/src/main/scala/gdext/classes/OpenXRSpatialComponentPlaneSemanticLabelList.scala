package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentPlaneSemanticLabelList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPlaneSemanticLabelList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentPlaneSemanticLabelList"

  /** OpenXRSpatialComponentPlaneSemanticLabelList.get_plane_semantic_label */
  final def getPlaneSemanticLabel(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRSpatialComponentPlaneSemanticLabelList", "get_plane_semantic_label", 1889332427L), hostObject.objectPtr, index)

}
