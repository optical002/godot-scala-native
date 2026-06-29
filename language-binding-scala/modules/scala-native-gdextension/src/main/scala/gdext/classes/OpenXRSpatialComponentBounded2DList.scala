package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentBounded2DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentBounded2DList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentBounded2DList"

  /** OpenXRSpatialComponentBounded2DList.get_center_pose */
  final def getCenterPose(index: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("OpenXRSpatialComponentBounded2DList", "get_center_pose", 1965739696L), hostObject.objectPtr, index)

  /** OpenXRSpatialComponentBounded2DList.get_size */
  final def getSize(index: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("OpenXRSpatialComponentBounded2DList", "get_size", 2299179447L), hostObject.objectPtr, index)

}
