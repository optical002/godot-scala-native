package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentBounded3DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentBounded3DList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentBounded3DList"

  /** OpenXRSpatialComponentBounded3DList.get_center_pose */
  final def getCenterPose(index: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.OpenXRSpatialComponentBounded3DList.mb_get_center_pose == null) gdext.classes.OpenXRSpatialComponentBounded3DList.mb_get_center_pose = MethodBind.get("OpenXRSpatialComponentBounded3DList", "get_center_pose", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.OpenXRSpatialComponentBounded3DList.mb_get_center_pose, livePtr, index)
  }

  /** OpenXRSpatialComponentBounded3DList.get_size */
  final def getSize(index: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.OpenXRSpatialComponentBounded3DList.mb_get_size == null) gdext.classes.OpenXRSpatialComponentBounded3DList.mb_get_size = MethodBind.get("OpenXRSpatialComponentBounded3DList", "get_size", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.OpenXRSpatialComponentBounded3DList.mb_get_size, livePtr, index)
  }

}

object OpenXRSpatialComponentBounded3DList {
  private[classes] var mb_get_center_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
}
