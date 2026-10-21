package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentPlaneSemanticLabelList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPlaneSemanticLabelList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentPlaneSemanticLabelList"

  /** OpenXRSpatialComponentPlaneSemanticLabelList.get_plane_semantic_label */
  final def getPlaneSemanticLabel(index: Long): Long = {
    if (gdext.classes.OpenXRSpatialComponentPlaneSemanticLabelList.mb_get_plane_semantic_label == null) gdext.classes.OpenXRSpatialComponentPlaneSemanticLabelList.mb_get_plane_semantic_label = MethodBind.get("OpenXRSpatialComponentPlaneSemanticLabelList", "get_plane_semantic_label", 1889332427L)
    Ptrcall.call1[Long, Long](gdext.classes.OpenXRSpatialComponentPlaneSemanticLabelList.mb_get_plane_semantic_label, livePtr, index)
  }

}

object OpenXRSpatialComponentPlaneSemanticLabelList {
  private[classes] var mb_get_plane_semantic_label: GDExtensionMethodBindPtr = null
}
