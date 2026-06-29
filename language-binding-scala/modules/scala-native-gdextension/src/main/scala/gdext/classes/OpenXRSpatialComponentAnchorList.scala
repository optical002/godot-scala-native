package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentAnchorList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentAnchorList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentAnchorList"

  /** OpenXRSpatialComponentAnchorList.get_entity_pose */
  final def getEntityPose(index: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("OpenXRSpatialComponentAnchorList", "get_entity_pose", 1965739696L), hostObject.objectPtr, index)

}
