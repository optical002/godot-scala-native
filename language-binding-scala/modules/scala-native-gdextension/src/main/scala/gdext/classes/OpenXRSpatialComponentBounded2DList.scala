package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentBounded2DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentBounded2DList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentBounded2DList"

  /** OpenXRSpatialComponentBounded2DList.get_center_pose */
  final def getCenterPose(index: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.OpenXRSpatialComponentBounded2DList.mb_get_center_pose == null) gdext.classes.OpenXRSpatialComponentBounded2DList.mb_get_center_pose = MethodBind.get("OpenXRSpatialComponentBounded2DList", "get_center_pose", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.OpenXRSpatialComponentBounded2DList.mb_get_center_pose, livePtr, index)
  }

  /** OpenXRSpatialComponentBounded2DList.get_size */
  final def getSize(index: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.OpenXRSpatialComponentBounded2DList.mb_get_size == null) gdext.classes.OpenXRSpatialComponentBounded2DList.mb_get_size = MethodBind.get("OpenXRSpatialComponentBounded2DList", "get_size", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.OpenXRSpatialComponentBounded2DList.mb_get_size, livePtr, index)
  }

}

object OpenXRSpatialComponentBounded2DList {
  private[classes] var mb_get_center_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
}
