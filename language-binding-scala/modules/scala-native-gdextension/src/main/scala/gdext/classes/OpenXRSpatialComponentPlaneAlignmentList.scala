package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentPlaneAlignmentList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPlaneAlignmentList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentPlaneAlignmentList"

  /** OpenXRSpatialComponentPlaneAlignmentList.get_plane_alignment */
  final def getPlaneAlignment(index: Long): Long = {
    if (gdext.classes.OpenXRSpatialComponentPlaneAlignmentList.mb_get_plane_alignment == null) gdext.classes.OpenXRSpatialComponentPlaneAlignmentList.mb_get_plane_alignment = MethodBind.get("OpenXRSpatialComponentPlaneAlignmentList", "get_plane_alignment", 3340200270L)
    Ptrcall.call1[Long, Long](gdext.classes.OpenXRSpatialComponentPlaneAlignmentList.mb_get_plane_alignment, livePtr, index)
  }

}

object OpenXRSpatialComponentPlaneAlignmentList {
  private[classes] var mb_get_plane_alignment: GDExtensionMethodBindPtr = null
}
