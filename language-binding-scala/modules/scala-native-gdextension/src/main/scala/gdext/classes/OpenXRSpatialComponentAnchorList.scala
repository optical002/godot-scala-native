package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentAnchorList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentAnchorList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentAnchorList"

  /** OpenXRSpatialComponentAnchorList.get_entity_pose */
  final def getEntityPose(index: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.OpenXRSpatialComponentAnchorList.mb_get_entity_pose == null) gdext.classes.OpenXRSpatialComponentAnchorList.mb_get_entity_pose = MethodBind.get("OpenXRSpatialComponentAnchorList", "get_entity_pose", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.OpenXRSpatialComponentAnchorList.mb_get_entity_pose, livePtr, index)
  }

}

object OpenXRSpatialComponentAnchorList {
  private[classes] var mb_get_entity_pose: GDExtensionMethodBindPtr = null
}
